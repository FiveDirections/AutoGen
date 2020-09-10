//
//
// FACILITY:	Utils - Utility routines class
//
// DESCRIPTION:	Various utility routines
//
// VERSION:		1.0
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2018-11-30
//
// MODIFICATION HISTORY:
//
//	1.0		2018-11-30	Brian Catlin
//			Original version
//
//

#pragma once
namespace FDI		// Five Directions Inc
{

//
// INCLUDE FILES:
//

#include <AccCtrl.h>

//
// CONSTANTS:
//

#define	HASH_ALGORITHM	BCRYPT_SHA256_ALGORITHM

//
// MACROS:
//

#define	SUCCESS(X)		FDI::Utils::check_success (X)
#define	ERR(X)			FDI::Utils::check_error (X)

//
// TYPES:
//

typedef struct _ANSI_STRING								// This must be before including Inject.tmh to keep WPP happy. Normally, we would include Winternl.h, but we need to override its sparse declarations
	{
	USHORT Length;
	USHORT MaximumLength;
	PSTR  Buffer;
	} ANSI_STRING, *PANSI_STRING;

typedef struct _UNICODE_STRING							// This must be before including Inject.tmh to keep WPP happy. Normally, we would include Winternl.h, but we need to override its sparse declarations
	{
	USHORT Length;
	USHORT MaximumLength;
	PWSTR  Buffer;
	} UNICODE_STRING, *PUNICODE_STRING;

typedef const UNICODE_STRING *PCUNICODE_STRING;

//
// This structure is used by the lookup_dll_exports routine to find the address of a routine name in a DLL
//

typedef struct
	{
	PANSI_STRING		name;							// Name of the routine
	PVOID*				address;						// Address of where to write the address of the routine
	} IMPORTED_ROUTINE, *pIMPORTED_ROUTINE;


//
// DECLARATIONS:
//

class Utils
{
public:

	//
	// Class constructors and destructor
	//

	Utils												// Constructor
		(
		) = default;


	~Utils												// Destructor
		(
		) = default;

	//
	// Public methods
	//

	_Check_return_
	static
	NTSTATUS
	add_ace												// Add an ACE to an object
		(
		_In_	LPWSTR			Object_name,			// Name of object
		_In_	SE_OBJECT_TYPE	Object_type,			// Type of object
		_In_	LPTSTR			Trustee,				// Trustee for new ACE
		_In_	TRUSTEE_FORM	Trustee_form,			// Format of trustee structure
		_In_	DWORD			Access_rights,			// Access mask for new ACE
		_In_	ACCESS_MODE		Access_mode,			// Type of ACE
		_In_	DWORD			Inheritance				// Inheritance flags for new ACE
		);

	_Check_return_
	static
	NTSTATUS
	add_ace_for_network_service							// Add an ACE to a file to allow NETWORK SERVICE to access it
		(
		_In_	LPWSTR	File_name,						// Name of file
		_In_	DWORD	Access_rights					// Access rights to set
		);

	_Check_return_
	static
	NTSTATUS
	add_ace_for_sid										// Add an ACE to a file to allow the specified SID to access it
		(
		_In_	LPWSTR				File_name,			// Name of file
		_In_	WELL_KNOWN_SID_TYPE	Sid,				// Well-known Security ID
		_In_	DWORD				Access_rights		// Access rights to set
		);

	_Check_return_
	static
	bool
	check_error											// Determine whether a status has error severity
		(
		_In_	NTSTATUS	Status_value				// Status to check
		);

	_Check_return_
	static
	bool
	check_success										// Determine whether a status is successful
		(
		_In_	NTSTATUS	Status_value				// Status to check
		);

	_Check_return_
	static
	NTSTATUS
	compare_ansi_strings								// Compare two ANSI strings
		(
		_In_	ANSI_STRING&	String_1,				// String to compare
		_In_	ANSI_STRING&	String_2,				// String to compare
		_In_	bool			Case_blind				// Specifies whether to do a case-blind compare
		);

	_Check_return_
	static
	NTSTATUS
	compare_unicode_strings								// Compare two Unicode strings
		(
		_In_	UNICODE_STRING&	String_1,				// String to compare
		_In_	UNICODE_STRING&	String_2,				// String to compare
		_In_	bool			Case_blind				// Specifies whether to do a case-blind compare
		);

	_Check_return_
	static
	NTSTATUS
	disable_privilege									// Disable the specified privilege
		(
		_In_z_	LPWSTR	Privilege_name					// Privilege to disable
		);

	static
	void
	dump												// Dump a buffer (in hex) to the console
		(
		_In_	PVOID	Address,						// Address of buffer
		_In_	ULONG	Length,							// Length of buffer
		_In_	ULONG	Line_width,						// Maximum width of output line
		_In_	ULONG	Base_disp_addr,					// Base address for display
		_In_	bool	Show_offset,					// Display the offset on each line
		_In_	bool	Show_ascii						// Display ASCII representation of data
		);

	_Check_return_
	static
	NTSTATUS
	enable_privilege									// Enable the specified privilege
		(
		_In_z_	LPWSTR	Privilege_name					// Privilege to enable
		);

	_Check_return_
	static
	NTSTATUS
	find_process_by_name								// Lookup a process given its executable name
		(
		_In_	const std::wstring&	Process_exe,		// Name of the executable
		_Out_	PULONG				Process_id			// ID of the process
		);

	_Check_return_
	static
	NTSTATUS
	find_resource										// Find the specified resource in this executable
		(
		_In_		ULONG	Resource_id,				// Resource ID specified in Resources.rc file
		_In_		ULONG	Type_id,					// Resource type as specified in Resources.rc file
		_Out_		ULONG&	Size,						// Size of the resource in bytes
		_Outref_result_maybenull_
		PUCHAR&				Data						// Address of the resource in memory
		);

	_Check_return_
	static
	NTSTATUS 
	hash_data											// Calculate the hash for a buffer
		(
		_In_	PVOID	Data,							// Address of data to hash
		_In_	ULONG	Length,							// Length of data to hash
		_Out_	PBYTE	*Hash,							// Address of buffer containing hash
		_Out_	ULONG	*Hash_size						// Length of hash
		);

	_Check_return_
	static
	NTSTATUS
	kmp_compute_lookup_table							// Generate the KMP lookup table for the pattern
		(
		_In_	std::string&	Pattern,				// Pattern to search for
		_Out_	PINT*			Lookup_table			// KMP lookup table for the specified pattern
		);

	_Check_return_
	static
	NTSTATUS
	kmp_search											// Search the Text for the Pattern and compute the lookup table on the fly
		(
		_In_	std::string&	Text,					// Text to search
		_In_	std::string&	Pattern,				// Pattern to search for
		_In_	bool			Case_blind,				// If true, perform a case-insensitive search
		_Out_	PULONG			Index					// Index in Text where match found
		);

	_Check_return_
	static
	NTSTATUS
	kmp_search											// Search the Text for the Pattern using a pre-computed lookup table
		(
		_In_	std::string&	Text,					// Text to search
		_In_	std::string&	Pattern,				// Pattern to search for
		_In_	PINT			Lookup_table,			// Pre-computed lookup table
		_In_	bool			Case_blind,				// If true, perform a case-insensitive search
		_Out_	PULONG			Index					// Index in Text where match found
		);

	_Check_return_
	static
	NTSTATUS
	lookup_dll_exports									// Lookup the addresses of the requested exports in the current process
		(
		_In_	UNICODE_STRING&			Dll_name,		// Which DLL to look in
		_In_	pIMPORTED_ROUTINE		Routines,		// Routines to find
		_In_	ULONG					Num_routines	// Number of entries in the Routines array
		);

	_Check_return_
	static
	NTSTATUS
	open_and_map_file									// Map a file into the process's address space
		(
		_In_	std::wstring	File_name,				// File to map
		_Out_	HANDLE			*Handle,				// Handle to file
		_Out_	HANDLE			*Mapping_handle,		// Section handle
		_Out_	PVOID			*Mapped_address,		// Address of mapped file
		_Out_	SIZE_T			*Mapped_size			// Size of mapped file
		);

	_Check_return_
	static
	NTSTATUS
	registry_read_ulong									// Read a ULONG value from the registry
		(
		_In_	LPWSTR	Parameter,						// Parameter to read
		_In_	ULONG	Default_value,					// Default value, if value not found
		_Out_	PULONG	Return_value					// Value read from key (or default, if not found)
		);

	_Check_return_
	static
	NTSTATUS
	remove_ace											// Remove all ACEs from a DACL that match the specified SID
		(
		_In_	LPWSTR			Object_name,			// Name of object
		_In_	SE_OBJECT_TYPE	Object_type,			// Type of object
		_In_	PSID			Sid						// SID to remove
		);

	_Check_return_
	static
	NTSTATUS
	remove_ace_for_network_service						// Remove the NETWORK SERVICE ACE from a file
		(
		_In_	LPWSTR	File_name						// Name of file
		);

	_Check_return_
	static
	NTSTATUS
	remove_ace_for_sid									// Remove the ACE for the specified SID from a file
		(
		_In_	LPWSTR				File_name,			// Name of file
		_In_	WELL_KNOWN_SID_TYPE	Sid_enum			// Well-known Security ID
		);

	static
	ULONG
	size_of_multi_string								// Calculate the size of an ANSI multi-string
		(
		_In_	LPCSTR	Multi_string					// String
		);

	static
	ULONG
	size_of_multi_wstring								// Calculate the size of a wide multi-string
		(
		_In_	LPCWSTR	Multi_string					// String
		);

	static
	std::u16string
	s_to_u16											// Convert UTF8-string to u16string
		(
		const std::string&	Utf8_string					// UTF8 string to convert
		);

	static
	std::wstring
	s_to_ws												// Convert UTF8-string to wstring
		(
		const std::string&	Utf8_string					// UTF8 string to convert
		);

	static
	std::string
	u16_to_s											// Convert wide-string to string
		(
		const std::u16string&	Wide_string				// Wide string to convert
		);

	static
	std::wstring
	u16_to_ws											// Convert u16string to wide-string
		(
		const std::u16string&	U16_string				// u16string to convert
		);

	static
	std::string
	ws_to_s												// Convert wide-string to string
		(
		const std::wstring&	Wide_string					// Wide string to convert
		);

	std::u16string
	ws_to_u16											// Convert wide-string to u16string
		(
		const std::wstring&	Wide_string					// Wide-string to convert
		);

	static
	std::u16string
	to_u16string										// Convert ULONG to U16string
		(
		const ULONG&	Value							// Value to convert
		);

	static
	std::wstring
	to_wstring											// Convert ULONG to wstring
		(
		const ULONG&	Value							// Value to convert
		);


private:

};	// End class Utils


}	// End of namespace FDI