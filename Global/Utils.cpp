//
//
// FACILITY:	Utils - Utility routines
//
// DESCRIPTION:	This module contains the implementation of the Utils class, which contains generic support routines
//
// VERSION:		1.3
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2018-11-30
//
// MODIFICATION HISTORY:
//
//	1.3		2019-06-23	Brian Catlin
//			Added ANSI_STRING and UNICODE_STRING case-blind compare routines
//
//	1.2		2019-06-19	Brian Catlin
//			Added Knuth-Morris-Pratt string search/compare routines
//
//	1.1		2019-06-18	Brian Catlin
//			Added find_process_by_name. Added privilege enable and disable routines. Modified dump to display a base address
//
//	1.0		2018-11-30	Brian Catlin
//			Original version
//
//


//
// INCLUDE FILES:
//

//
// System includes
//

#define WIN32_NO_STATUS
#include <Windows.h>
#undef WIN32_NO_STATUS
#include <ntstatus.h>
#include <TlHelp32.h>

#include <string>
#include <locale>
#include <cstdio>
#include <codecvt>
#include <aclapi.h>

//
// Project includes
//

#include "Utils.h"
#include "WPP_Tracing.h"

#include "Utils.tmh"									// Created by TraceWPP

using namespace FDI;

//
// CONSTANTS:
//

const std::wstring		APP_REGISTRY_PARAMETERS	= L"Software\\FiveDirections\\Detours\\TraceAPI";
constexpr static CHAR	UTILS_nibble_to_hex [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

//
// MACROS:
//

//
// DECLARATIONS:
//

NTSTATUS
Utils::add_ace											// Add an ACE to an object
	(
	_In_	LPWSTR			Object_name,				// Name of object
	_In_	SE_OBJECT_TYPE	Object_type,				// Type of object
	_In_	LPTSTR			Trustee,					// Trustee for new ACE
	_In_	TRUSTEE_FORM	Trustee_form,				// Format of trustee structure
	_In_	DWORD			Access_rights,				// Access mask for new ACE
	_In_	ACCESS_MODE		Access_mode,				// Type of ACE
	_In_	DWORD			Inheritance					// Inheritance flags for new ACE
	)

//
//
// DESCRIPTION:		Add an Access Control Entry to the security descriptor for the specified object
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
DWORD					status;
PACL					old_dacl = nullptr;
PACL					new_dacl = nullptr;
PSECURITY_DESCRIPTOR	sec_desc = nullptr;
EXPLICIT_ACCESS			ea;


	TRACE_ENTER ();

	//
	// Get a pointer to the existing Discretionary Access Control List (DACL)
	//

	if (SUCCESS (status = GetNamedSecurityInfoW (Object_name, Object_type, DACL_SECURITY_INFORMATION, nullptr, nullptr, &old_dacl, nullptr, &sec_desc)))
		{

		//
		// Initialize an EXPLICIT_ACCESS structure for the new ACE
		//

		ZeroMemory (&ea, sizeof (ea));
		ea.grfAccessMode = Access_mode;
		ea.grfAccessPermissions = Access_rights;
		ea.grfInheritance = Inheritance;
		ea.Trustee.TrusteeForm = Trustee_form;
		ea.Trustee.ptstrName = (LPWSTR) Trustee;

		//
		// Create a new ACL that merges the new ACE into the existing ACL
		//

		if (SUCCESS (status = SetEntriesInAcl (1, &ea, old_dacl, &new_dacl)))
			{

			//
			// Attach the new ACL as the object's DACL
			//

			if (SUCCESS (status = SetNamedSecurityInfo ((LPWSTR) Object_name, Object_type, DACL_SECURITY_INFORMATION, nullptr, nullptr, new_dacl, nullptr)))
				{
				TRACE_VERBOSE (UTILS, "ACE added to ACL for %S", Object_name);
				}
			else
				{
				TRACE_ERROR (UTILS, "Error returned by SetNamedSecurityInfo, status = %!STATUS!", status);
				}

			}
		else
			{
			TRACE_ERROR (UTILS, "Error returned by SetEntriesInAcl, status = %!STATUS!", status);
			}

		}
	else
		{
		TRACE_ERROR (UTILS, "Error returned by GetNamedSecurityInfo for file %S, status = %!STATUS!", Object_name, status);
		}

	//
	// Free memory allocated on our behalf
	//

	if (sec_desc != nullptr)
		{
		LocalFree (sec_desc);
		}

	if (new_dacl != nullptr)
		{
		LocalFree (new_dacl);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::add_ace


NTSTATUS
Utils::add_ace_for_network_service						// Add an ACE to a file to allow NETWORK SERVICE to access it
	(
	_In_	LPWSTR	File_name,							// Name of file
	_In_	DWORD	Access_rights						// Access rights to set
	)

//
//
// DESCRIPTION:		Add an access-allowed Access Control Entry for the Network Service account in the DACL of the specified file
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
NTSTATUS		status;
PSID			network_service_sid = nullptr;
DWORD			sid_size = SECURITY_MAX_SID_SIZE;


	TRACE_ENTER ();

	//
	// Allocate a buffer for the SID
	//

	if ((network_service_sid = LocalAlloc (LMEM_FIXED, sid_size)) != nullptr)
		{

		//
		// Get the Security ID for the Network Service account
		//

		if (CreateWellKnownSid (WinNetworkServiceSid, nullptr, network_service_sid, &sid_size))
			{

			//
			// Put the ACE onto the file
			//

			if (SUCCESS (status = add_ace (File_name, SE_FILE_OBJECT, (LPTSTR) network_service_sid, TRUSTEE_IS_SID, Access_rights,
				GRANT_ACCESS, NO_INHERITANCE)))
				{
				}
			else
				{
				TRACE_ERROR (UTILS, "Error adding ACE to file %S", File_name);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error getting network service SID, status = %!STATUS!", status);
			}

		//
		// Free the buffer
		//

		LocalFree (network_service_sid);
		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error allocating buffer for network service SID, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::add_ace_for_network_service


NTSTATUS
Utils::add_ace_for_sid									// Add an ACE to a file to allow the specified SID to access it
	(
	_In_	LPWSTR				File_name,				// Name of file
	_In_	WELL_KNOWN_SID_TYPE	Sid_enum,				// Well-known Security ID
	_In_	DWORD				Access_rights			// Access rights to set
	)

//
//
// DESCRIPTION:		Add an access-allowed Access Control Entry (ACE) for the account specified by its well-known enum value in the DACL of the specified 
//					file. The ACE will allow the access specified in the Access_rights parameter
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	ACE added to the specified file
//					Buffer for SID allocated and freed
//
// RETURN VALUES:
//
//

{
NTSTATUS		status;
PSID			sid = nullptr;
DWORD			sid_size = SECURITY_MAX_SID_SIZE;


	TRACE_ENTER ();

	//
	// Allocate a buffer for the SID
	//

	if ((sid = LocalAlloc (LMEM_FIXED, sid_size)) != nullptr)
		{

		//
		// Get the Security ID for the specified well-known SID
		//

		if (CreateWellKnownSid (Sid_enum, nullptr, sid, &sid_size))
			{

			//
			// Put the ACE onto the file
			//

			if (SUCCESS (status = add_ace (File_name, SE_FILE_OBJECT, (LPTSTR) sid, TRUSTEE_IS_SID, Access_rights, GRANT_ACCESS, NO_INHERITANCE)))
				{
				}
			else
				{
				TRACE_ERROR (UTILS, "Error adding ACE to file %S", File_name);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error getting SID for well-known value %d, status = %!STATUS!", Sid_enum, status);
			}

		//
		// Free the buffer
		//

		LocalFree (sid);
		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error allocating buffer for SID, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::add_ace_for_sid


_Check_return_
bool
Utils::check_error										// Determine whether a status has error severity
	(
	_In_	NTSTATUS	Status_value					// Status to check
	)

//
//
// DESCRIPTION:		Windows uses several different methods for encoding a routine's return 	status.  This routine will determine which type of encoding 
//					was used, and then determines whether the status has error severity.
//
//					The principle use of this routine is to use the inverse of the return value, to treat success and warning severity the same, because
//					'warning' severity is often close to success, so it is frequently useful to treat them together. E.g. 
//
//					if (!check_error (status))
//						{
//						success and warning processing
//						}
//					else
//						{
//						error processing
//						}
//
// ASSUMPTIONS:		User mode
//
// RETURN VALUES:
//
//		true						Status severity is not error severity
//		false						Status severity is error severity
//
// SIDE EFFECTS:
//
//

{
bool		ret_val = true;					// Assume successful completion


	// TRACE_ENTER ();

	//
	// Is this a Win32 status value?
	//

	if (HRESULT_FACILITY (Status_value) == 0)
		{

		//
		// Win32 status.  Is it success?
		//

		if (Status_value == ERROR_SUCCESS)
			{
			ret_val = false;
			}
		else
			{
			ret_val = true;
			}

		}
	else
		{

		//
		// Kernel-type, or custom-defined (using Message Compiler) status.  Is it an error? (as opposed to warning, success, or informational)
		//

		if (HRESULT_SEVERITY (Status_value) == STATUS_SEVERITY_ERROR)
			{
			ret_val = true;
			}
		else
			{
			ret_val = false;
			}

		}

//	TRACE_EXIT ();
	return ret_val;
}							// End routine Utils::check_error


_Check_return_
bool
Utils::check_success									// Determine whether a status is successful
	(
	_In_	NTSTATUS	Status_value					// Status to check
	)

//
//
// DESCRIPTION:		Windows uses several different methods for encoding a routine's return status.  This routine will determine which type of encoding
//					was used, and then determines whether that status denotes success
//
// ASSUMPTIONS:		User mode
//
// RETURN VALUES:
//
//		true						Status severity is success
//		false						Status severity is not success
//
// SIDE EFFECTS:
//
//

{
bool		ret_val = true;					// Assume successful completion


	// TRACE_ENTER ();

	//
	// Is this a Win32 status value?
	//

	if (HRESULT_FACILITY (Status_value) == 0)
		{

		//
		// Win32 status.  Is it success?
		//

		if (Status_value == ERROR_SUCCESS)
			{
			ret_val = true;
			}
		else
			{
			ret_val = false;
			}

		}
	else
		{

		//
		// Kernel-type, or custom-defined (using Message Compiler) status.  Is it success?
		//

		if (HRESULT_SEVERITY (Status_value) == STATUS_SEVERITY_SUCCESS)
			{
			ret_val = true;
			}
		else
			{
			ret_val = false;
			}

		}

//	TRACE_EXIT ();
	return ret_val;
}							// End routine Utils::check_success


NTSTATUS
Utils::compare_ansi_strings								// Compare two ANSI strings
	(
	_In_	ANSI_STRING&	String_1,					// String to compare
	_In_	ANSI_STRING&	String_2,					// String to compare
	_In_	bool			Case_blind					// Specifies whether to do a case-blind compare
	)

//
// DESCRIPTION:		Compare two ANSI_STRING for equality, optionally ignore case
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:
//					STATUS_SUCCESS			Strings match
//					STATUS_NO_MATCH			Strings do not match
//

{
NTSTATUS	status = STATUS_NO_MATCH;


	//
	// Only continue if the strings are the same length
	//

	if (String_1.Length == String_2.Length)
		{
		ULONG		num_chars = String_1.Length;
		PCHAR		str1 = String_1.Buffer;
		PCHAR		str2 = String_2.Buffer;
		ULONG		i;

		//
		// Check each character
		//

		for (i = 0; i < num_chars; i++)
			{
			CHAR	c1 = str1 [i];
			CHAR	c2 = str2 [i];

			//
			// If this is a case-blind compare, then convert both to uppercase for the compare. This is a simple conversion that will only work for
			// ASCII characters
			//

			if (Case_blind)
				{
				
				if (c1 >= 'a' && c1 <= 'z')
					{
					c1 = c1 - 32;
					}

				if (c2 >= 'a' && c2 <= 'z')
					{
					c2 = c2 - 32;
					}

				}

			//
			// Compare the characters
			//

			if (c1 != c2)
				{
				break;
				}

			}	// End for i

		//
		// If we made it through the entire loop, then the strings match
		//

		if (i == num_chars)
			{
			status = STATUS_SUCCESS;
			}

		}

	return status;
}							// End Utils::compare_ansi_strings


NTSTATUS
Utils::compare_unicode_strings							// Compare two Unicode strings
	(
	_In_	UNICODE_STRING&	String_1,					// String to compare
	_In_	UNICODE_STRING&	String_2,					// String to compare
	_In_	bool			Case_blind					// Specifies whether to do a case-blind compare
	)

//
// DESCRIPTION:		Compare two UNICODE_STRINGs for equality, optionally ignore case
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:
//					STATUS_SUCCESS			Strings match
//					STATUS_NO_MATCH			Strings do not match
//

{
NTSTATUS	status = STATUS_NO_MATCH;


	//
	// Only continue if the strings are the same length
	//

	if (String_1.Length == String_2.Length)
		{
		ULONG		num_chars = String_1.Length / sizeof (WCHAR);
		PWCHAR		str1 = String_1.Buffer;
		PWCHAR		str2 = String_2.Buffer;
		ULONG		i;

		//
		// Check each character
		//

		for (i = 0; i < num_chars; i++)
			{
			WCHAR	c1 = str1 [i];
			WCHAR	c2 = str2 [i];

			//
			// If this is a case-blind compare, then convert both to uppercase for the compare. This is a simple conversion that will only work for
			// ASCII characters
			//

			if (Case_blind)
				{
				
				if (c1 >= 'a' && c1 <= 'z')
					{
					c1 = c1 - 32;
					}

				if (c2 >= 'a' && c2 <= 'z')
					{
					c2 = c2 - 32;
					}

				}

			//
			// Compare the characters
			//

			if (c1 != c2)
				{
				break;
				}

			}	// End for i

		//
		// If we made it through the entire loop, then the strings match
		//

		if (i == num_chars)
			{
			status = STATUS_SUCCESS;
			}

		}

	return status;
}							// End Utils::compare_unicode_strings


NTSTATUS
Utils::disable_privilege								// Disable the specified privilege
	(
	_In_z_	LPWSTR	Privilege_name						// Privilege to disable
	)

//
//
// DESCRIPTION:		This routine expects to be called with one of the system-defined privilege names, of the form SE_SHUTDOWN_NAME
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//

{
NTSTATUS			status;
HANDLE				token_hdl;
LUID				privilege_luid;
TOKEN_PRIVILEGES	privs;


	TRACE_ENTER ();

	//
	// Get a handle to our process' access token
	//

	if (OpenProcessToken (GetCurrentProcess (), TOKEN_ADJUST_PRIVILEGES | TOKEN_QUERY, &token_hdl))
		{

		//
		// Convert the privilege name to a LUID, because internally, Windows manipulates privileges by their assigned LUID
		//

		if (LookupPrivilegeValue (nullptr, Privilege_name, &privilege_luid))
			{

			//
			// Describe what we want to do to the token. In this case, enable the specified privilege
			//

			privs.PrivilegeCount = 1;
			privs.Privileges [0].Luid = privilege_luid;
			privs.Privileges [0].Attributes = SE_PRIVILEGE_REMOVED;

			//
			// Remove the privilege
			//

			if (AdjustTokenPrivileges (token_hdl, FALSE, &privs, sizeof (privs), nullptr, nullptr))
				{
				status = STATUS_SUCCESS;
				TRACE_INFO (UTILS, "Disabled privilege %S", Privilege_name);
				CloseHandle (token_hdl);
				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error disabling privilege %S, status = %!STATUS!", Privilege_name, status);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error looking up the privilege LUID, status = %!STATUS!", status);
			}

		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error opening the process token, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::disable_privilege


void 
Utils::dump												// Dump a buffer (in hex) to the console
	(
	_In_	PVOID	Address,							// Address of buffer
	_In_	ULONG	Length,								// Length of buffer
	_In_	ULONG	Line_width,							// Maximum width of output line
	_In_	ULONG	Base_disp_addr,						// Base address for display
	_In_	bool	Show_offset,						// Display the offset on each line
	_In_	bool	Show_ascii							// Display ASCII representation of data
	)

//
//
// DESCRIPTION:		Dump the buffer to the console, in the proper little-endian format.
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	None
//

{
ULONG		i;
ULONG		chars_per_byte;
PUCHAR		buffer = (PUCHAR) Address;
ULONG		overhead;
ULONG		bytes_per_line;
ULONG		num_groups;
ULONG		offset_index;
ULONG		ascii_index;
PUCHAR		line;
ULONG		bytes_this_line;
ULONG		j;
ULONG		cur;
ULONG		num_lines;
ULONG		group_size;
ULONG		first_hex_index;
ULONG		next_column;


	TRACE_ENTER ();

	//
	// Calculate how many bytes can be dumped per line.  A line consists of: some number of longword groups, separated by spaces, optionally the 
	// offset into the buffer, and optionally the ASCII representation of each of the bytes in the longwords.
	//

	if (Show_offset)
		{
		overhead = 3 + 8;								// 3 spaces + 8 characters for the offset value
		}
	else
		{
		overhead = 0;									// Without the offset, there isn't any fixed overhead
		}

	if (Show_ascii)
		{
		chars_per_byte = 3;								// 2 hex characters per byte + 1 ASCII character per byte
		overhead = overhead + 1;						// Space before the ASCII
		}
	else
		{
		chars_per_byte = 2;								// 2 hex characters per byte
		}

	group_size = 8 + 1;									// 8 characters per longword + 1 space
	num_groups = (Line_width - overhead) / ((chars_per_byte * 4) + 1);
	bytes_per_line = num_groups * 4;					// num_groups * 4 bytes per group
	first_hex_index = (num_groups * group_size);
	next_column = first_hex_index;

	if (Show_offset)
		{
		offset_index = next_column + 3;					// Calculate where the offset appears on the line
		next_column = offset_index + 8;					// 8 hex characters in offset
		}
	else
		{
		offset_index = 0;
		}

	if (Show_ascii)
		{
		ascii_index = next_column + 1;					// Space before ASCII
		}
	else
		{
		ascii_index = 0;
		}

	//
	// Allocate the line buffer
	//

	if ((line = (PUCHAR) malloc (Line_width)) != 0)
		{

		//
		// Walk through the buffer one line at a time
		//

		num_lines = ((Length + bytes_per_line - 1) / bytes_per_line);

		for (i = 0; i < num_lines; i++)
			{
			bytes_this_line = Length - (i * bytes_per_line);

			if (bytes_this_line > bytes_per_line)
				{
				bytes_this_line = bytes_per_line;
				}

			//
			// Erase the line
			//

			memset (line, ' ', Line_width);

			//
			// Write the current offset
			//

			if (Show_offset)
				{
				sprintf_s ((char *) &line [offset_index], 9, "%08X", i * bytes_per_line + Base_disp_addr);
				line [offset_index + 8] = ' ';		// sprintf_s zero-terminates the buffer; replace the zero with space
				}

			cur = first_hex_index;

			//
			// Display the bytes on the current line
			//

			for (j = 0; j < bytes_this_line; j++)
				{

				if ((j % 4) == 0)
					{
					cur = cur - 1;
					}

				//
				// Write the little-endian hex representation of the byte
				//

				line [cur] = UTILS_nibble_to_hex [(buffer [(i * bytes_per_line) + j] >> 0) & 0xf];
				cur = cur - 1;
				line [cur] = UTILS_nibble_to_hex [(buffer [(i * bytes_per_line) + j] >> 4) & 0xf];
				cur = cur - 1;

				//
				// Write the ASCII representation of the byte
				//

				if (Show_ascii)
					{

					if (isprint (buffer [(i * bytes_per_line) + j]))
						{
						line [ascii_index + j] = buffer [(i * bytes_per_line) + j];
						}
					else
						{
						line [ascii_index + j] = '.';
						}

					}

				}	// End for j

			printf ("%.*s\n", Line_width-1, line);
			}	// End for i

		}
	else
		{

		//
		// Couldn't allocate line buffer
		//

		printf ("Error allocating %d bytes for line buffer\n", (int) Line_width);
		}

	free (line);
	TRACE_EXIT ();
}							// End of function Utils::dump


NTSTATUS
Utils::enable_privilege									// Enable the specified privilege
	(
	_In_z_	LPWSTR	Privilege_name						// Privilege to enable
	)

//
//
// DESCRIPTION:		This routine expects to be called with one of the system-defined privilege names, of the form SE_SHUTDOWN_NAME
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		Windows status values
//
//

{
NTSTATUS			status;
HANDLE				token_hdl;
LUID				privilege_luid;
TOKEN_PRIVILEGES	privs;


	TRACE_ENTER ();

	//
	// Get a handle to our process' access token
	//

	if (OpenProcessToken (GetCurrentProcess (), TOKEN_ADJUST_PRIVILEGES | TOKEN_QUERY, &token_hdl))
		{

		//
		// Convert the privilege name to a LUID, because internally, Windows manipulates privileges by their
		// assigned LUID
		//

		if (LookupPrivilegeValue (nullptr, Privilege_name, &privilege_luid))
			{

			//
			// Describe what we want to do to the token. In this case, enable the specified privilege
			//

			privs.PrivilegeCount = 1;
			privs.Privileges [0].Luid = privilege_luid;
			privs.Privileges [0].Attributes = SE_PRIVILEGE_ENABLED;

			//
			// Enable the privilege
			//

			if (AdjustTokenPrivileges (token_hdl, FALSE, &privs, sizeof (privs), nullptr, nullptr))
				{
				TRACE_INFO (UTILS, "Enabled privilege %S", Privilege_name);
				status = STATUS_SUCCESS;
				CloseHandle (token_hdl);
				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error enabling privilege %S, status = %!STATUS!", Privilege_name, status);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error looking up the privilege LUID for privilege %S, status = %!STATUS!", Privilege_name, status);
			}

		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error opening the process token, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::enable_privilege


NTSTATUS
Utils::find_process_by_name								// Lookup a process given its executable name
	(
	_In_	const std::wstring&	Process_exe,			// Name of the executable
	_Out_	PULONG				Process_id				// ID of the process
	)

//
//
// DESCRIPTION:		
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
NTSTATUS		status = STATUS_NOT_FOUND;
PROCESSENTRY32	proc_info = {0};
HANDLE			proc_snapshot;
std::string		pattern = ws_to_s (Process_exe);
PINT			lookup_table;


	TRACE_ENTER ();

	//
	// Compute the KMP lookup table to speed up the search
	//

	if (SUCCESS (status = kmp_compute_lookup_table (pattern, &lookup_table)))
		{

		//
		// Get a snapshot of all the processes
		//

		proc_info.dwSize = sizeof (proc_info);

		if ((proc_snapshot = CreateToolhelp32Snapshot (TH32CS_SNAPPROCESS, 0)) != INVALID_HANDLE_VALUE)
			{

			//
			// Look through the snapshot of processes for the requested executable name. We'll return the match that we find
			//

			Process32First (proc_snapshot, &proc_info);

			do
				{
				std::string	text = ws_to_s (std::wstring (proc_info.szExeFile));


				//
				// Does the name of the executable match what we're looking for?
				//

				if (SUCCESS (status = kmp_search (text, pattern, lookup_table, true, nullptr)))
					{
					TRACE_VERBOSE (UTILS, "Found process ID %08x for executable name %S", proc_info.th32ProcessID, Process_exe.c_str ());
					status = STATUS_SUCCESS;
					*Process_id = proc_info.th32ProcessID;
					break;
					}

				}	// End while
			while (Process32Next (proc_snapshot, &proc_info));

			CloseHandle (proc_snapshot);
			}
		else
			{
			TRACE_ERROR (UTILS, "Error getting process snapshot, status = %!STATUS!", status);
			}

		//
		// Free the lookup table
		//

		delete [] lookup_table;
		}
	else
		{
		TRACE_ERROR (UTILS, "Error computing KMP lookup table, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::find_process_by_name


NTSTATUS
Utils::find_resource									// Find the specified resource in this executable
	(
	_In_		ULONG	Resource_id,					// Resource ID specified in Resources.rc file
	_In_		ULONG	Type_id,						// Resource type as specified in Resources.rc file
	_Out_		ULONG&	Size,							// Size of the resource in bytes
	_Outref_result_maybenull_
	PUCHAR&				Data							// Address of the resource in memory
	)

//
//
// DESCRIPTION:		
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
NTSTATUS	status;
HMODULE		handle;
HRSRC		resource;
HGLOBAL		data;


	TRACE_ENTER ();

	//
	// Assume error to keep the code analyzer happy
	//

	Size = 0;
	Data = 0;

	//
	// Get a handle to this module
	//

	if ((handle = ::GetModuleHandle (nullptr)) != 0)
		{
		
		//
		// Attempt to locate the specified resource
		//

		if ((resource = ::FindResource (handle, MAKEINTRESOURCE (Resource_id), MAKEINTRESOURCE (Type_id))) != 0)
			{

			//
			// Get a handle that can be used to get a pointer to the resource in memory
			//

			if ((data = ::LoadResource (handle, resource)) != 0)
				{

				//
				// Return the size and address of the resource data
				//

				Size = ::SizeofResource (handle, resource);
				Data = static_cast <PUCHAR> (::LockResource (data));
				status = STATUS_SUCCESS;
				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error loading resource, status = %!STATUS!", status);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error finding specified resource %d, type %d, status = %!STATUS!", Resource_id, Type_id, status);
			}

		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error getting module handle, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::find_resource


NTSTATUS 
Utils::hash_data											// Calculate the hash for a buffer
	(
	_In_	PVOID	Data,									// Address of data to hash
	_In_	ULONG	Length,									// Length of data to hash
	_Out_	PBYTE	*Hash,									// Address of buffer containing hash
	_Out_	ULONG	*Hash_size								// Length of hash
	)

//
// DESCRIPTION:		Hash the data starting at the specified address, for the specified length
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:
//
//	STATUS_SUCCESS			Normal, successful completion
//

{
NTSTATUS			status;
BCRYPT_ALG_HANDLE	algorithm_handle;
DWORD				hash_object_size;
DWORD				bytes_written;
PBYTE				hash_object;
DWORD				hash_size;
PBYTE				hash_buffer;
BCRYPT_HASH_HANDLE	hash_object_handle;


	TRACE_ENTER ();

	//
	// Get a handle to the algorithm
	//

	if (SUCCESS (status = BCryptOpenAlgorithmProvider (&algorithm_handle, HASH_ALGORITHM, NULL, 0)))
		{

		//
		// Find out how big the buffer needs to be to hold the hash object
		//

		if (SUCCESS (status = BCryptGetProperty (algorithm_handle,  BCRYPT_OBJECT_LENGTH, (PBYTE) &hash_object_size, sizeof (hash_object_size), &bytes_written, 0)))
			{

			//
			// Allocate space for the hash object on the heap
			//

			if ((hash_object = (PBYTE) HeapAlloc (GetProcessHeap (), 0, hash_object_size)) != 0)
				{

				//
				// Create the hash object
				//

				if (SUCCESS (status = BCryptCreateHash (algorithm_handle, &hash_object_handle, hash_object, hash_object_size, NULL, 0, 0)))
					{

					//
					// Get the size of the hash
					//

					if (SUCCESS (status = BCryptGetProperty (algorithm_handle, BCRYPT_HASH_LENGTH, (PUCHAR) &hash_size, sizeof (hash_size), &bytes_written, 0)))
						{

						//
						// Allocate a buffer to hold the hash
						//

						if ((hash_buffer = (PBYTE) HeapAlloc (GetProcessHeap (), 0, hash_size)) != 0)
							{

							//
							// Calculate the hash of the buffer
							//

							if (SUCCESS (status = BCryptHashData (hash_object, (PUCHAR) Data, Length, 0)))
								{

								//
								// Read the hash from the hash object
								//

								if (SUCCESS (status = BCryptFinishHash (hash_object, hash_buffer, hash_size, 0)))
									{

									//
									// Return the hash
									//

									*Hash = hash_buffer;
									*Hash_size = hash_size;
									status = STATUS_SUCCESS;

									//
									// Cleanup
									//

									if (!SUCCESS (status = BCryptDestroyHash (hash_object_handle)))
										{
										TRACE_ERROR (UTILS, "Error destroying hash, status = %!STATUS!", status);
										}

									if (!HeapFree (GetProcessHeap (), 0, hash_object))
										{
										status = GetLastError ();
										TRACE_ERROR (UTILS, "Error freeing hash object buffer, status = %!STATUS!", status);
										}

									if (!SUCCESS (status = BCryptCloseAlgorithmProvider (algorithm_handle, 0)))
										{
										TRACE_ERROR (UTILS, "Error closing algorithm provider, status = %!STATUS!", status);
										}

									}
								else
									{
									TRACE_ERROR (UTILS, "Error reading the hash from the hash object, status = %!STATUS!", status);
									}

								}
							else
								{

								TRACE_ERROR (UTILS, "Error hashing the buffer, status = %!STATUS!", status);
								}

							}
						else
							{
							status = GetLastError ();
							TRACE_ERROR (UTILS, "Error allocating %d bytes for the hash, status = %!STATUS!", hash_size, status);
							}

						}
					else
						{
						TRACE_ERROR (UTILS, "Error getting the size of the hash, status = %!STATUS!", status);
						}

					}
				else
					{
					TRACE_ERROR (UTILS, "Error creating the hash object, status = %!STATUS!", status);
					}

				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error allocating %d bytes for the hash object, status = %!STATUS!", hash_object_size, status);
				}

			}
		else
			{
			TRACE_ERROR (UTILS, "Error getting the hash object size, status = %!STATUS!", status);
			}

		}
	else
		{
		TRACE_ERROR (UTILS, "Error opening a handle to the algorithm %S, status = %!STATUS!", HASH_ALGORITHM, status);
		}


	TRACE_EXIT ();
	return status;
}							// End of Utils::hash_data


NTSTATUS
Utils::kmp_compute_lookup_table							// Generate the KMP lookup table for the pattern
	(
	_In_	std::string&	Pattern,					// Pattern to search for
	_Out_	PINT*			Lookup_table				// KMP lookup table for the specified pattern
	)

//
//
// DESCRIPTION:		This routine builds the Discrete Finite Automaton that drives the KMP search algorithm. The table tells the search algorithm how many
//					characters to back up in the search pattern when a mismatch occurs. The table is an array of integers, and its length is one more 
//					than the length of the pattern string.
//
//					For more information on the KMP algorithm, see https://en.wikipedia.org/wiki/Knuth–Morris–Pratt_algorithm
//
//					NOTE: The caller must free the lookup table using "delete [] lookup_table;"
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	Allocate lookup table and returns it to the caller
//
// RETURN VALUES:	
//					STATUS_SUCCESS					Successfully created the table
//					STATUS_INSUFFICIENT_RESOURCES	Error allocating lookup table
//

{
NTSTATUS	status;
SIZE_T		p_len = Pattern.length ();
SIZE_T		table_size = p_len + 1;
PINT		table;


	TRACE_ENTER ();

	//
	// Allocate the lookup table
	//

	if ((table = (PINT) new int [table_size]) != nullptr)
		{

		//
		// The first entry in the table is always -1
		//

		table [0] = -1;

		//
		// Walk the pattern and find the longest prefix suffix
		//

		for (ULONG i = 0; i < p_len; i++)
			{
			table [i + 1] = table [i] + 1;

			while ((table [i + 1] > 0) && (Pattern [i] != Pattern [table [i + 1] - 1]))
				{
				table [i + 1] = table [table [i + 1] - 1] + 1;
				}	// End while

			}	// End for i

		//
		// Return the address of the lookup table
		//

		*Lookup_table = table;
		status = STATUS_SUCCESS;
		}
	else
		{
		TRACE_ERROR (UTILS, "Error allocating lookup table of %d ints", (int) table_size);
		status = STATUS_INSUFFICIENT_RESOURCES;
		}

	TRACE_EXIT ();
	return status;
}							// End Utils::kmp_compute_lookup_table


NTSTATUS
Utils::kmp_search										// Search the Text for the Pattern and compute the lookup table on the fly
	(
	_In_	std::string&	Text,						// Text to search
	_In_	std::string&	Pattern,					// Pattern to search for
	_In_	bool			Case_blind,					// If true, perform a case-insensitive search
	_Out_	PULONG			Index						// Index in Text where the start of Pattern was found
	)

//
//
// DESCRIPTION:		Search the Text string for the contents of the Pattern string using the Knuth-Morris-Pratt algorithm. This implementation computes
//					the Discrete Finite Automaton (state machine) used to perform the match on the fly, and passes it to the real search routine
//
// ASSUMPTIONS:		None
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	
//					STATUS_SUCCESS					Successfully created the table
//					STATUS_NO_MATCH					Pattern string not found in Text string

{
NTSTATUS	status;
PINT		lookup_table;


	TRACE_ENTER ();

	//
	// Create the lookup table and call the search routine
	//

	if (SUCCESS (status = kmp_compute_lookup_table (Pattern, &lookup_table)))
		{
		status = kmp_search (Text, Pattern, lookup_table, Case_blind, Index);

		//
		// Delete the lookup table that was allocated by kmp_compute_lookup_table
		//

		delete [] lookup_table;
		}
	else
		{
		TRACE_ERROR (UTILS, "Error creating the lookup table %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End Utils::kmp_search


NTSTATUS
Utils::kmp_search										// Search the Text for the Pattern using a pre-computed lookup table
	(
	_In_	std::string&	Text,						// Text to search
	_In_	std::string&	Pattern,					// Pattern to search for
	_In_	PINT			Lookup_table,				// DFA lookup table (from kmp_compute_lookup_table)
	_In_	bool			Case_blind,					// If true, perform a case-insensitive search
	_Out_	PULONG			Index						// Index in Text where match found
	)

//
//
// DESCRIPTION:		Search the Text string for the contents of the Pattern string using the Knuth-Morris-Pratt algorithm. The KMP string search
//					algorithm is the most efficient algorithm currently known, and its speed is proportional to the length of the text PLUS the
//					length of the search string (the naive search algorithm is proportional to the lengths MULTIPLIED!)
//
//					For more information on the KMP algorithm, see https://en.wikipedia.org/wiki/Knuth–Morris–Pratt_algorithm
//
// ASSUMPTIONS:		None
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	
//					STATUS_SUCCESS					Successfully created the table
//					STATUS_NO_MATCH					Pattern string not found in Text string

{
NTSTATUS	status = STATUS_NO_MATCH;
SIZE_T		t_len = Text.length ();
SIZE_T		p_len = Pattern.length ();
ULONG		t_idx = 0;
LONG		p_idx = 0;
char		t_char;
char		p_char;


	TRACE_ENTER ();

	//
	// Search the Text string for the Pattern string. We only walk forward through the text string.
	//

	while (t_idx < t_len)
		{

		//
		// Is this a reset to the beginning of the pattern? If so, move to the next character in each string
		//

		if (p_idx < 0)
			{
			t_idx = t_idx + 1;
			p_idx = p_idx + 1;
			}
		else
			{

			//
			// If this is a case-blind compare, then upcase both characters
			//

			if (Case_blind)
				{
				t_char = (char) toupper (Text [t_idx]);
				p_char = (char) toupper (Pattern [p_idx]);
				}
			else
				{
				t_char = (char) Text [t_idx];
				p_char = (char) Pattern [p_idx];
				}

			//
			// If the text and pattern characters match, then move to the next character in each string
			//

			if (t_char == p_char)
				{
				t_idx = t_idx + 1;
				p_idx = p_idx + 1;

				//
				// Have we reached the end of the pattern? If so, this is a complete match
				//

				if (p_idx == p_len)
					{

					//
					// Did the user want the index back?
					//

					if (Index != nullptr)
						{
						*Index = t_idx - p_idx;
						}

					status = STATUS_SUCCESS;
					break;
					}

				}
			else
				{

				//
				// Mismatch. Use the lookup table to back up the appropriate number of characters in the pattern
				//

				p_idx = Lookup_table [p_idx];
				}

			}

		}	// End while

	TRACE_EXIT ();
	return status;
}							// End Utils::kmp_search


NTSTATUS
Utils::lookup_dll_exports								// Lookup the addresses of the requested exports in the current process
	(
	_In_	UNICODE_STRING&			Dll_name,			// Which DLL to look in
	_In_	pIMPORTED_ROUTINE		Routines,			// Routines to find
	_In_	ULONG					Num_routines		// Number of entries in the Routines array
	)

//
// DESCRIPTION:		Find the addresses of the specified routines in the specified DLL
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:
//					STATUS_SUCCESS			Found all exports
//

{
NTSTATUS	status = STATUS_SUCCESS;
HMODULE		dll_mod;


	TRACE_ENTER ();

	//
	// Get the module handle for the specified DLL
	//

	if ((dll_mod = GetModuleHandleW (Dll_name.Buffer)) != 0)
		{

		//
		// Get the address of each routine in the array
		//

		for (ULONG i = 0; i < Num_routines; i++)
			{

			if ((*Routines [i].address = GetProcAddress (dll_mod, Routines [i].name->Buffer)) != nullptr)
				{
				TRACE_INFO (INJDLL, "%s at address %p", Routines [i].name->Buffer, Routines [i].address);
				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (INJDLL, "Error getting address of %s, status = %d", Routines [i].name->Buffer, status);
				break;
				}

			}	// End for i

		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (INJDLL, "Error getting handle to NTDLL.DLL, status = %d", status);
		}

	TRACE_EXIT ();
	return status;
}							// End Utils::lookup_dll_exports


#pragma warning (suppress: 6101)	// False positive in code analyzer
NTSTATUS
Utils::open_and_map_file								// Map a file into the process's address space
	(
	_In_	std::wstring	File_name,					// File to map
	_Out_	HANDLE			*Handle,					// Handle to file
	_Out_	HANDLE			*Mapping_handle,			// Section handle
	_Out_	PVOID			*Mapped_address,			// Address of mapped file
	_Out_	SIZE_T			*Mapped_size				// Size of mapped file
	)

//+
//
// DESCRIPTION:		Open the specified file, and map the file's contents into the process's
//					address space.
//
// ASSUMPTIONS:		File must already exist
//
// SIDE EFFECTS:
//
//	None.
//
// RETURN VALUES:
//					STATUS_SUCCESS
//					Return status from Win32 APIs
//
//-

{
NTSTATUS	status;
HANDLE		file_handle;
HANDLE		mapping_handle;
PVOID		mapped_address;


	TRACE_ENTER ();

	//
	// Open a handle to the file
	//

	if ((file_handle = CreateFile ((LPCWSTR) File_name.c_str (), GENERIC_READ, FILE_SHARE_READ, NULL, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, NULL)) != INVALID_HANDLE_VALUE)
		{

		//
		// Create a file mapping object
		//

		if ((mapping_handle = CreateFileMapping (file_handle, NULL, PAGE_READONLY, 0, 0, NULL)) != 0)
			{

			//
			// Map the file into the process's address space
			//

			if ((mapped_address = MapViewOfFile (mapping_handle, FILE_MAP_READ, 0, 0, 0)) != 0)
				{

				//
				// Return the information on the mapped file
				//

				*Handle = file_handle;
				*Mapping_handle = mapping_handle;
				*Mapped_address = mapped_address;
				*Mapped_size = GetFileSize (file_handle, 0);	// Assume file size < 4GB !!!
				status = STATUS_SUCCESS;
				}
			else
				{

				//
				// Error mapping the file
				//

				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error mapping the file, status = %!STATUS!", status);
				}

			}
		else
			{

			//
			// Error creating the mapping object
			//

			status = GetLastError ();
			TRACE_ERROR (UTILS, "Couldn't create the file mapping object, status = %!STATUS!", status);
			}

		}
	else
		{

		//
		// Error opening the file
		//

		status = GetLastError ();
		TRACE_ERROR (UTILS, "Couldn't open a handle to file %S, status = %!STATUS!", (LPCWSTR) File_name.c_str (), status);
		}

	TRACE_EXIT ();
	return status;
}											// End of function Utils::open_and_map_file


_Use_decl_annotations_
NTSTATUS
Utils::registry_read_ulong								// Read a ULONG value from the registry
	(
	_In_	LPWSTR	Parameter,							// Parameter to read
	_In_	ULONG	Default_value,						// Default value, if value not found
	_Out_	PULONG	Return_value						// Value read from key (or default, if not found)
	)

//+
//
// DESCRIPTION:		Read the specified parameter from the application's area of the registry.
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		STATUS_SUCCESS					Normal, successful completion
//		STATUS_NO_WORK_DONE				The supplied default parameter was used (probably because the specified key doesn't exist)
//
//-

{
NTSTATUS		status;
HKEY			hkey;
ULONG			win32_status;
ULONG			value = Default_value;
ULONG			size = sizeof (ULONG);


	TRACE_ENTER ();

	//
	// Open the key
	//

	if ((status = RegOpenKeyEx (HKEY_LOCAL_MACHINE, (LPCWSTR) APP_REGISTRY_PARAMETERS.c_str (), 0, KEY_QUERY_VALUE, &hkey)) == ERROR_SUCCESS)
		{

		//
		// Read the parameter's value
		//

		if ((status = RegQueryValueExW (hkey, Parameter, NULL, NULL, (PBYTE)&value, &size)) == ERROR_SUCCESS)
			{
			status = STATUS_SUCCESS;
			}
		else
			{
			status = STATUS_NO_WORK_DONE;
			}

		//
		// Close the key, so we don't leak handles
		//

		RegCloseKey (hkey);
		}
	else
		{
		win32_status = GetLastError ();
		TRACE_WARN (UTILS, "Couldn't open handle to registry key (%S), status = %d", (LPCWSTR) APP_REGISTRY_PARAMETERS.c_str (), win32_status);
		status = STATUS_NO_WORK_DONE;
		}

	//
	// Return the value to the caller.  This might be the default value passed in, if the open or
	// read failed
	//

	*Return_value = value;

	TRACE_EXIT ();
	return status;
}							// End routine Utils::registry_read_ulong



NTSTATUS
Utils::remove_ace										// Remove allow ACEs from a DACL that match the specified SID
	(
	_In_	LPWSTR			Object_name,				// Name of object
	_In_	SE_OBJECT_TYPE	Object_type,				// Type of object
	_In_	PSID			Sid							// SID to remove
	)

//
//
// DESCRIPTION:		Remove any allow Access Control Entries for the specified SID from the specified object
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
DWORD					status;
PSECURITY_DESCRIPTOR	sec_desc = nullptr;
PACL					dacl = nullptr;
PACCESS_ALLOWED_ACE		ace;


	TRACE_ENTER ();

	//
	// Get a pointer to the existing Discretionary Access Control List (DACL)
	//

	if (SUCCESS (status = GetNamedSecurityInfo (Object_name, Object_type, DACL_SECURITY_INFORMATION, nullptr, nullptr, &dacl, nullptr, &sec_desc)))
		{

		//
		// Look through the list of ACEs for the SID we've been asked to remove
		//

		for (int i = 0; i < dacl->AceCount; i++)
			{

			//
			// Get a pointer to the ACE
			//

			if (GetAce (dacl, i, (LPVOID*) &ace))
				{

				//
				// Is this the ACE we're looking for?
				//

				if (EqualSid ((PSID) &ace->SidStart, Sid) && ace->Header.AceType == ACCESS_ALLOWED_ACE_TYPE)
					{

					//
					// Delete the ACE
					//

					if (DeleteAce (dacl, i))
						{
						}
					else
						{
						status = GetLastError ();
						TRACE_ERROR (UTILS, "Error deleting Network Service ACE, status = %!STATUS!", status);
						}

					}

				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (UTILS, "Error getting ACE from DACL, status = %!STATUS!", status);

				continue;
				}

			}	// End for i

		//
		// Write the DACL back to the file
		//

		if (SUCCESS (status = SetNamedSecurityInfo (Object_name, Object_type, DACL_SECURITY_INFORMATION, nullptr, nullptr, dacl, nullptr)))
			{
			TRACE_INFO (UTILS, "DACL updated");
			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error updating DACL, status = %!STATUS!", status);
			}

		}
	else
		{
		TRACE_ERROR (UTILS, "Error returned by GetNamedSecurityInfo for object %S, status = %!STATUS!", Object_name, status);
		}

	//
	// Free memory allocated on our behalf
	//

	if (sec_desc != nullptr)
		{
		LocalFree (sec_desc);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::remove_ace


NTSTATUS
Utils::remove_ace_for_network_service					// Remove the NETWORK SERVICE ACE from a file
	(
	_In_	LPWSTR	File_name							// Name of file
	)

//
//
// DESCRIPTION:		Remove the access-allowed ACEs from the specified file
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
NTSTATUS		status;
PSID			network_service_sid = nullptr;
DWORD			sid_size = SECURITY_MAX_SID_SIZE;


	TRACE_ENTER ();

	//
	// Allocate a buffer for the SID
	//

	if ((network_service_sid = LocalAlloc (LMEM_FIXED, sid_size)) != nullptr)
		{

		//
		// Get the Security ID for the Network Service account
		//

		if (CreateWellKnownSid (WinNetworkServiceSid, nullptr, network_service_sid, &sid_size))
			{

			//
			// Remove the ACE from the file
			//

			if (SUCCESS (status = remove_ace (File_name, SE_FILE_OBJECT, (LPTSTR) network_service_sid)))
				{
				}
			else
				{
				TRACE_ERROR (UTILS, "Error removing Network Service ACE from file %S", File_name);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error getting network service SID, status = %!STATUS!", status);
			}

		//
		// Free the buffer
		//

		LocalFree (network_service_sid);
		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error allocating buffer for network service SID, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::remove_ace_for_network_service


NTSTATUS
Utils::remove_ace_for_sid								// Remove the ACE for the specified SID from a file
	(
	_In_	LPWSTR				File_name,				// Name of file
	_In_	WELL_KNOWN_SID_TYPE	Sid_enum				// Well-known Security ID
	)

//
//
// DESCRIPTION:		Remove the access-allowed ACEs from the specified file
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//		None
//
//

{
NTSTATUS		status;
PSID			sid = nullptr;
DWORD			sid_size = SECURITY_MAX_SID_SIZE;


	TRACE_ENTER ();

	//
	// Allocate a buffer for the SID
	//

	if ((sid = LocalAlloc (LMEM_FIXED, sid_size)) != nullptr)
		{

		//
		// Get the Security ID for the Network Service account
		//

		if (CreateWellKnownSid (Sid_enum, nullptr, sid, &sid_size))
			{

			//
			// Remove the ACE from the file
			//

			if (SUCCESS (status = remove_ace (File_name, SE_FILE_OBJECT, (LPTSTR) sid)))
				{
				}
			else
				{
				TRACE_ERROR (UTILS, "Error removing ACE from file %S", File_name);
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (UTILS, "Error getting well-known SID %d, status = %!STATUS!", Sid_enum, status);
			}

		//
		// Free the buffer
		//

		LocalFree (sid);
		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (UTILS, "Error allocating buffer for SID, status = %!STATUS!", status);
		}

	TRACE_EXIT ();
	return status;
}							// End of Utils::remove_ace_for_sid


ULONG
Utils::size_of_multi_string							// Calculate the size of an ANSI multi-string
	(
	_In_	LPCSTR	Multi_string					// String
	)

//
//
// DESCRIPTION:		Return the size of the multi-string, in bytes. Includes the null terminator
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	Length of the buffer holding the string
//

{
SIZE_T	size = 0;
LPCSTR	str = Multi_string;


	TRACE_ENTER ();

	//
	// Ensure a string was passed in
	//

	if (Multi_string != nullptr)
		{

		//
		// Loop through the strings
		//

		while (true)
			{
			SIZE_T	len = strlen (str);

			size = size + len + 1;

			//
			// Have we found the terminator?
			//

			if (len == 0)
				{
				break;
				}
			else
				{

				//
				// Point to the next string
				//

				str = str + len + 1;
				}

			}	// End while

		}
	else
		{
		size = 0;
		}

	TRACE_EXIT ();
	return (ULONG) size;
}							// End of Utils::size_of_multi_string


ULONG
Utils::size_of_multi_wstring						// Calculate the size of a wide multi-string
	(
	_In_	LPCWSTR	Multi_string					// String
	)

//
//
// DESCRIPTION:		Return the size of the multi-string, in bytes. Includes the null terminator
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	Length of the buffer holding the string
//

{
SIZE_T	size = 0;
LPCWSTR	str = Multi_string;


	TRACE_ENTER ();

	//
	// Ensure a string was passed in
	//

	if (Multi_string != nullptr)
		{

		//
		// Loop through the strings
		//

		while (true)
			{
			SIZE_T	len = wcslen (str);

			size = size + len + 1;

			//
			// Have we found the terminator?
			//

			if (len == 0)
				{
				break;
				}
			else
				{

				//
				// Point to the next string
				//

				str = str + len + 1;
				}

			}	// End while

		//
		// Convert characters to bytes
		//

		size = size * sizeof (WCHAR);
		}
	else
		{
		size = 0;
		}

	TRACE_EXIT ();
	return (ULONG) size;
	}							// End of Utils::size_of_multi_wstring


std::u16string
Utils::s_to_u16											// Convert ANSI string to u16string
	(
	const std::string&	Ansi_string						// ANSI string to convert
	)

//
//
// DESCRIPTION:		Convert an ANSI string to a UTF-16 (Windows Unicode) string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	Wide-string (Unicode) of the specified ANSI string
//

{
std::u16string	result;
ULONG			size = (ULONG) Ansi_string.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = Ansi_string [i];		
		}

	TRACE_EXIT ();
	return result;
}							// End of Utils::s_to_u16


std::wstring
Utils::s_to_ws											// Convert ANSI string to wstring
	(
	const std::string&	Ansi_string						// ANSI string to convert
	)

//
//
// DESCRIPTION:		Convert an ANSI string to a wstring (Windows Unicode) string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	Wide-string (Unicode) of the specified ANSI string
//

{
std::wstring	result;
ULONG			size = (ULONG) Ansi_string.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = Ansi_string [i];		
		}

	TRACE_EXIT ();
	return result;
}							// End of Utils::s_to_ws


std::string
Utils::u16_to_s											// Convert wide-string to ANSI string
	(
	const std::u16string&	U16_string					// Wide string to convert
	)

//
//
// DESCRIPTION:		Convert a wide-string (UTF-16; Windows Unicode) to ANSI byte-string
//
//					NOTE: This will throw away the upper 16-bits of each UCS-2 character
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	ANSI string of the specified wide-string (Unicode)
//

{
std::string		result;
ULONG			size = (ULONG) U16_string.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = (char) U16_string [i];		
		}


	TRACE_EXIT ();
	return result;
}							// End of Utils::u16_to_s


std::wstring
Utils::u16_to_ws										// Convert u16string to wide-string
	(
	const std::u16string&	U16_string					// u16string to convert
	)

//
//
// DESCRIPTION:		Convert a u16string (UTF-16; Windows Unicode) to wide-string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	wide-string of the specified u16string (Unicode)
//

{
std::wstring	result;
ULONG			size = (ULONG) U16_string.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = (WCHAR) U16_string [i];		
		}


	TRACE_EXIT ();
	return result;
}							// End of Utils::u16_to_ws


std::u16string
Utils::to_u16string										// Convert ULONG to U16string
	(
	const ULONG&	Value								// Value to convert
	)

//
//
// DESCRIPTION:		Convert a ULONG to ANSI byte-string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	u16string of the specified ULONG
//

{
std::u16string	result;
char16_t		val_str [16];


	TRACE_ENTER ();

	swprintf ((wchar_t*) val_str, ARRAYSIZE (val_str), L"%d", Value);
	result = std::u16string (val_str);

	TRACE_EXIT ();
	return result;
}							// End of Utils::to_u16string


std::wstring
Utils::to_wstring										// Convert ULONG to wstring
	(
	const ULONG&	Value								// Value to convert
	)

//
//
// DESCRIPTION:		Convert a ULONG to wide-string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	Wide-string of the specified ULONG
//

{
std::wstring	result;
wchar_t			val_str [16];


	TRACE_ENTER ();

	swprintf ((wchar_t*) val_str, ARRAYSIZE (val_str), L"%d", Value);
	result = std::wstring (val_str);

	TRACE_EXIT ();
	return result;
}							// End of Utils::to_wstring


std::string
Utils::ws_to_s											// Convert wide-string to ANSI string
	(
	const std::wstring&	Wstring							// Wide string to convert
	)

//
//
// DESCRIPTION:		Convert a wide-string (UTF-16; Windows Unicode) to ANSI byte-string
//
//					NOTE: This will throw away the upper 16-bits of each UCS-2 character
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	ANSI string of the specified wide-string (Unicode)
//

{
std::string		result;
ULONG			size = (ULONG) Wstring.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = (char) Wstring [i];		
		}


	TRACE_EXIT ();
	return result;
}							// End of Utils::ws_to_s


std::u16string
Utils::ws_to_u16										// Convert wide-string to u16string
	(
	const std::wstring&	Wide_string						// Wide-string to convert
	)

//
//
// DESCRIPTION:		Convert a wide-string to a UTF-16 (Windows Unicode) string
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	u16string (Unicode) of the specified wide-string
//

{
std::u16string	result;
ULONG			size = (ULONG) Wide_string.size ();


	TRACE_ENTER ();

	result.resize (size);

	for (ULONG i = 0; i < size; i++)
		{
		result [i] = Wide_string [i];
		}

	TRACE_EXIT ();
	return result;
}							// End of Utils::ws_to_u16


#if 0
Utils::Utils
	(
	PCHAR	Type_name
	)

//
//
// DESCRIPTION:		
//
// ASSUMPTIONS:		User mode
//
// RETURN VALUES:
//
//		None
//
// SIDE EFFECTS:
//
//

{
	TRACE_ENTER ();
	TRACE_EXIT ();
}							// End of Utils::Utils


#endif