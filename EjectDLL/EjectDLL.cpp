//
//
// FACILITY:	EjectDLL - Eject a DLL from a running process
//
// DESCRIPTION:	This program will unload a DLL that was previously injected into a process by the InjectDLL tool. To eject a DLL from another process  
//				after the process has started, we need the target process to call FreeLibrary, and FreeLibrary only takes a single parameter which is  
//				the DLL's module handle. This is done creating a thread in another process, passing it the address of a routine to call and one parameter 
//				to that thread. So, create a thread with the routine address set to FreeLibrary and pass it the handle of the DLL to unload. 
//
//				DANGER WILL ROBINSON! DANGER!
//				Causing random DLLs to be unloaded from a process will almost certainly cause the process to fail in a spectacular way. This program
//				could be made to ensure that only DLLs that were loaded by InjectDLL are unloaded, but that is more work and this is just a hacked
//				together proof of concept. Likewise, there is a lot of code in here that was copied from Inject DLL that could be factored out into
//				shared global modules.
//
// VERSION:		1.0
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2020-01-20
//
// MODIFICATION HISTORY:
//
//	1.0		2020-01-20	Brian Catlin
//			Original version
//
//

#pragma warning (disable : 4100)						// Allow unreferenced formal parameter
#pragma warning (disable : 4115)						// Allow named type definition in parentheses
#pragma warning (disable : 4127)						// Allow constant conditional expression
#pragma warning (disable : 4200)						// Allow zero-sized array in struct/union
#pragma warning (disable : 4201)						// Allow nameless struct/union
#pragma warning (disable : 4214)						// Allow bit field types other than int
#pragma warning (disable : 4514)						// Allow unreferenced inline function

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

#include <string>
#include <vector>
#include <cstdio>
#include <iostream>

//
// Project includes
//

#include <boost\program_options.hpp>					// Requires compiler conformance mode set to 'NO'
#include <boost\format.hpp>

#include "..\Global\Utils.h"
#include "..\Global\WPP_Tracing.h"

using namespace FDI;
#include "EjectDLL.tmh"									// Created by TraceWPP


namespace po = boost::program_options;

//
// CONSTANTS:
//

constexpr ULONG		ED_display_width_default = 120;

//
// Used by NtQueryInformationProcess. From Winternl.h
//

typedef enum _PROCESSINFOCLASS
	{
	ProcessBasicInformation = 0,
	ProcessDebugPort = 7,
	ProcessWow64Information = 26,
	ProcessImageFileName = 27,
	ProcessBreakOnTermination = 29
	} PROCESSINFOCLASS;

//
// Define the message severity codes
//

#define STATUS_SEVERITY_SUCCESS          0x0
#define STATUS_SEVERITY_INFORMATIONAL    0x1
#define STATUS_SEVERITY_WARNING          0x2
#define STATUS_SEVERITY_ERROR            0x3

//
// MACROS:
//

#define DECLARE_ANSI_STRING(_var, _string) \
const CHAR _var ## _buffer[] = _string; \
__pragma(warning(push)) \
__pragma(warning(disable:4221)) __pragma(warning(disable:4204)) \
ANSI_STRING _var = { sizeof(_string) - sizeof(CHAR), sizeof(_string), (PCH) _var ## _buffer } \
__pragma(warning(pop))

#define DECLARE_UNICODE_STRING(_var, _string) \
const WCHAR _var ## _buffer[] = _string; \
__pragma(warning(push)) \
__pragma(warning(disable:4221)) __pragma(warning(disable:4204)) \
UNICODE_STRING _var = { sizeof(_string) - sizeof(WCHAR), sizeof(_string), (PWCH) _var ## _buffer } \
__pragma(warning(pop))

//
// TYPES:
//

//
// This structure describes a DLL, and is on the lists in the PEB_LDR_DATA structure. The version in Winternl.h is missing lots of fields. This
// definition came from the Internet, because the symbols are no longer public :-(
//

typedef struct
	{
	LIST_ENTRY			in_load_order_links;
	LIST_ENTRY			in_memory_order_links;
	LIST_ENTRY			in_initialization_order_links;
	PVOID				dll_base;							// This is also the module's handle
	PVOID				entry_point;
	ULONG				size_of_image;
	UNICODE_STRING		full_dll_name;
	UNICODE_STRING		base_dll_name;
	ULONG				flags;
	USHORT				load_count;
	USHORT				tls_index;

	union
		{

		struct
			{
			PVOID		section_pointer;
			ULONG		checksum;
			};

		LIST_ENTRY		hash_links;
		};

	ULONG				time_date_stamp;
	} LDR_DATA_TABLE_ENTRY, *pLDR_DATA_TABLE_ENTRY;

//
// This structure keeps track of the DLLs in process. This came from WinDBG, using: dt -v ntdll!_PEB_LDR_DATA
//

typedef struct
	{
	ULONG				length;
	UCHAR				initialized;					// Probably a BOOLEAN
	HANDLE				ss_handle;
	LIST_ENTRY			in_load_order_module_list;
	LIST_ENTRY			in_memory_order_module_list;	// List of LDR_DATA_TABLE_ENTRY
	LIST_ENTRY			in_initialization_order_module_list;
	PVOID				entry_in_progress;
	UCHAR				shutdown_in_progress;			// Probably a BOOLEAN
	HANDLE				shutdown_thread_id;
	} PEB_LDR_DATA, *pPEB_LDR_DATA;

//
// Process Environment Block (PEB). The version in Winternl.h is missing lots of fields. This data came from WinDBG, using: dt -v ntdll!_PEB
// I don't need anything past the ldr pointer
//

typedef struct
	{
	UCHAR				inherited_address_space;		// Probably a BOOLEAN
	UCHAR				read_image_file_exec_opts;		// Probably a BOOLEAN
	BOOLEAN				being_debugged;

	union
		{

		struct
			{
			UCHAR		image_uses_large_pages : 1;		// [0]	
			UCHAR		is_protected_process : 1;		// [1]	
			UCHAR		is_image_dynamically_reloc : 1;	// [2]	
			UCHAR		skip_patching_user32_fwdrs : 1;	// [3]	
			UCHAR		is_packaged_process : 1;		// [4]	
			UCHAR		is_app_container : 1;			// [5]	
			UCHAR		is_protected_process_light : 1;	// [6]	
			UCHAR		is_long_path_aware_process : 1;	// [7]	
			};

		UCHAR			bitfield;
		};

	UCHAR				padding0;
	HANDLE				mutant;
	PVOID				image_base_address;
	pPEB_LDR_DATA		ldr;
	} PEB, *pPEB;

//
// Thread priority
//

typedef LONG KPRIORITY;

//
// Basic and Extended Basic Process Information from Winternl.h
//  NtQueryInformationProcess using ProcessBasicInformation
//

typedef struct _PROCESS_BASIC_INFORMATION
	{
	NTSTATUS ExitStatus;
	pPEB PebBaseAddress;
	ULONG_PTR AffinityMask;
	KPRIORITY BasePriority;
	ULONG_PTR UniqueProcessId;
	ULONG_PTR InheritedFromUniqueProcessId;
	} PROCESS_BASIC_INFORMATION, *PPROCESS_BASIC_INFORMATION;

//
// Function prototypes that were removed from the SDK
//

typedef ULONG (__stdcall *NtQueryInformationProcess_func)	// NTDLL.dll
	(
	PVOID	ProcessHandle,
	INT		ProcessInformationClass,
	PVOID	ProcessInformation,
	ULONG	ProcessInformationLength,
	PULONG	ReturnLength
	);

typedef ULONG (__stdcall *NtResumeProcess_func)			// NTDLL.dll
	(
	HANDLE	Process_hdl
	);

typedef ULONG (__stdcall *NtSuspendProcess_func)		// NTDLL.dll
	(
	HANDLE	Process_hdl
	);

typedef ULONG (__stdcall *FreeLibrary_func)				// Kernel32.dll
	(
	HMODULE	Dll_handle
	);

//
// DECLARATIONS:
//

CONSOLE_SCREEN_BUFFER_INFO			ED_sb_info = { 0 };

//
// This table contains the routines to find in NTDLL.dll in the current process
//

DECLARE_UNICODE_STRING (ED_ntdll_name, L"ntdll.dll");
DECLARE_ANSI_STRING (ED_ntqueryinformationprocess_name, "NtQueryInformationProcess");

NtQueryInformationProcess_func		ED_NtQueryInformationProcess;

IMPORTED_ROUTINE					ED_local_ntdll_routines [] =
	{
		{&ED_ntqueryinformationprocess_name,	(PVOID*) &ED_NtQueryInformationProcess},
	};

constexpr ULONG	ED_num_local_ntdll_routines = ARRAYSIZE (ED_local_ntdll_routines);

//
// This table contains the routines to find in Kernel32.dll in the target process
//

DECLARE_UNICODE_STRING (ED_kernel32_name, L"kernel32.dll");
DECLARE_ANSI_STRING (ED_freelibrary_name, "FreeLibrary");

FreeLibrary_func	ED_remote_FreeLibrary;		// Address of FreeLibrary in the target process

IMPORTED_ROUTINE	ED_remote_kernel32_routines [] =
	{
		{&ED_freelibrary_name,	(PVOID*) &ED_remote_FreeLibrary},
	};

constexpr ULONG	ED_num_remote_kernel32_routines = ARRAYSIZE (ED_remote_kernel32_routines);

//
// Forward routines
//

_Check_return_
NTSTATUS
eject_dll_from_process									// Inject the DLL into the specified process
	(
	_In_	std::wstring			Dll_name,			// Name of the DLL to eject
	_In_	pLDR_DATA_TABLE_ENTRY	Dll_ldr,			// LDR module
	_In_	ULONG					Process_id			// Process to eject from
	);

_Check_return_
NTSTATUS
find_ldr_for_dll										// Find the LDR structure for the DLL in the specified process
	(
	_In_	std::wstring			Dll_name,			// Name of the DLL to eject
	_In_	ULONG					Process_id,			// Process to eject from
	_Out_	pLDR_DATA_TABLE_ENTRY	Module				// LDR module for the DLL
	);

NTSTATUS
lookup_remote_exports									// Lookup the addresses of the requested exports in a remote process
	(
	_In_	HANDLE					Target_process,		// Handle to process
	_In_	pLDR_DATA_TABLE_ENTRY	Dll_entry,			// LDR record for DLL to search
	_In_	pIMPORTED_ROUTINE		Routines,			// Routines to find
	_In_	ULONG					Num_routines		// Number of entries in the Routines array
	);




int
main
	(
	int		Argc,
	char*	Argv []
	)

//
//
// DESCRIPTION:		Main entry point for the executable. Parses the command line and calls the appropriate implementation routine
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	None
//
// RETURN VALUES:	None
//

{
HANDLE								output_hdl = GetStdHandle (STD_OUTPUT_HANDLE);
ULONG								display_width;

	//
	// Get the console dimensions so we can tell Program Options the width, so it can properly format the help output
	//

	GetConsoleScreenBufferInfo (output_hdl, &ED_sb_info);

	if (ED_sb_info.dwSize.X != 0)
		{
		display_width = ED_sb_info.dwSize.X;
		}
	else
		{
		display_width = ED_display_width_default;
		}

NTSTATUS						status = STATUS_SUCCESS;
po::options_description			params ("Allowed parameters", display_width);
po::variables_map				var_map;
std::wstring					command_line = GetCommandLineW ();
size_t							cmd_start = 0;
std::vector <std::wstring>		args;
std::wstring					dll_name;
std::wstring					process_name;
ULONG							process_id;
LDR_DATA_TABLE_ENTRY			dll_ldr;


	UNREFERENCED_PARAMETER (Argv);

	WPP_INIT_TRACING (L"Eject");

	//
	// Define the command line switches
	//

	params.add_options ()
		("help,h", "This help message")
		("dll,d", po::wvalue <std::wstring> (&dll_name), "Path to the DLL that will be ejected. REQUIRED")
		("process,p", po::wvalue <std::wstring> (&process_name), "Process name or ID number (decimal, hex, or octal). REQUIRED. If multiple processes of the same name exist, then must use ID")
		;

	//
	// Was a command passed in?
	//

	if (Argc > 1)
		{

		//
		// If we're being run from within the debugger, then the first token in the command line will be the fully qualified file spec for the executable,
		// surrounded by double quotes. If the first character is a double-quote, then find the matching double-quote
		//

		if (command_line [0] == '\"')
			{
			cmd_start = command_line.find ('"', 1) + 2;
			}
		else
			{

			//
			// No double-quote, so we must be run from a command line. Skip past the first token
			//

			cmd_start = command_line.find (' ', 1) + 2;
			}

		//
		// Parse the argument string
		//

		args = po::split_winmain ((command_line.substr (cmd_start)).c_str ());

		try
			{
			po::store (po::wcommand_line_parser (args).options (params).allow_unregistered ().run (), var_map);
			po::notify (var_map);

			//
			// Process the command line options
			//

			if (var_map.count ("dll") && var_map.count ("process"))
				{

				//
				// Get the addresses of undocumented routines that will be needed by other routines
				//

				if (SUCCESS (status = Utils::lookup_dll_exports (ED_ntdll_name, ED_local_ntdll_routines, ED_num_local_ntdll_routines)))
					{

					//
					// The process option may either be a process ID or executable name. If it is an ID, then we should be able to convert it to a 
					// number without error
					//

					try
						{

						//
						// STOI supports decimal, hex, and octal number forms
						//

						process_id = std::stoi (process_name);
						}
					catch (...)
						{

						//
						// Try to lookup the process using process_name as the name of the executable
						//

						if (ERR (status = Utils::find_process_by_name (process_name, &process_id)))
							{
							TRACE_ERROR (EJDLL, "Error finding process with executable name %S, status = %!STATUS!", process_name.c_str (), status);
							throw std::runtime_error (boost::str (boost::format ("Error finding process with executable name %s, status = %08x\n") %
								Utils::ws_to_s (process_name) % status));
							}

						}	// End catch

					//
					// Get the LDR module for the DLL in the process
					//

					if (SUCCESS (status = find_ldr_for_dll (dll_name, process_id, &dll_ldr)))
						{
						TRACE_INFO (EJDLL, "Found %S in process %08x at %p", dll_name.c_str (), process_id, dll_ldr.dll_base);

						//
						// Eject the DLL from the process
						//

						if (SUCCESS (status = eject_dll_from_process (dll_name, &dll_ldr, process_id)))
							{
							TRACE_INFO (EJDLL, "%S successfully ejected from process %d", dll_name.c_str (), process_id);
							std::wcout << boost::wformat (L"%s successfully ejected from process %d") % dll_name.c_str () % process_id;
							}
						else
							{
							TRACE_ERROR (EJDLL, "Could not unload %S from process %d, status = %08x", dll_name.c_str (), process_id, status);
							std::wcout << boost::wformat (L"Could not unload %s from process %d, status %08x") % dll_name.c_str () % process_id % status;
							}

						}
					else
						{
						TRACE_ERROR (EJDLL, "Error finding %S in process %08x, status = %d", dll_name.c_str (), process_id, status);
						std::wcout << boost::wformat (L"Error finding %S in process %08x, status = %08x\n") % dll_name % process_id % status;
						}

					}
				else
					{
					TRACE_ERROR (EJDLL, "Unable to get the addresses of NTDLL required routines, status = %08x", status);
					throw std::runtime_error (boost::str (boost::format ("Unable to get the addresses of NTDLL required routines, status = %08x\n") %
						status));
					}

				}
			else if (var_map.count ("help"))
				{

				//
				// Display help
				//

				std::cout << params << std::endl;
				}
			else
				{
				std::wcerr << boost::wformat (L"Unrecognized parameters: %1%\n") % (command_line.substr (cmd_start)).c_str ();

				//
				// Display help
				//

				std::cout << params << std::endl;
				}

			}
		catch (const po::error& e)						// Catch parsing errors
			{
			std::cerr << "Error parsing arguments\n";
			std::cerr << e.what () << std::endl << std::endl;
			std::cerr << params << std::endl;
			}
		catch (const std::exception& e)					// Catch everything else
			{
			std::cerr << "Runtime error:\n";
			std::cerr << e.what () << std::endl << std::endl;
			}

		}
	else
		{

		//
		// Display help
		//

		std::cout << params << std::endl;
		}

	//
	// Close WPP tracing
	//

	WPP_CLEANUP ();
	return status;
}							// End of main

_Check_return_
NTSTATUS
eject_dll_from_process									// Eject the DLL from the specified process
	(
	_In_	std::wstring			Dll_name,			// Name of the DLL to eject
	_In_	pLDR_DATA_TABLE_ENTRY	Dll_ldr,			// LDR module
	_In_	ULONG					Process_id			// Process to eject from
	)

//
//
// DESCRIPTION:		This routine will cause the specified DLL to be unloaded from the specified process, by creating a thread in the process that just
//					calls FreeLibrary to unload the requested DLL. To perform all of that magic, we will need to enable the DEBUG privilege, which will
//					give us access to the target process' guts. The thread's start routine must be valid in the target process, so we will have to 
//					find where Kernel32.dll is loaded in the target process and find the address of FreeLibrary.
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	Debug privilege enabled, remote process' address space read, thread and DLL removed from the remote process
//
// RETURN VALUES:
//					STATUS_SUCCESS			FreeLibrary succeeded in the target process
//					STATUS_UNSUCCESSFUL		FreeLibrary failed in the target process

{
NTSTATUS					status;
HANDLE						target_process;
HANDLE						remote_thread;
ULONG						remote_thread_id;
LDR_DATA_TABLE_ENTRY		kernel32_ldr;
std::wstring				kernel32_dll (ED_kernel32_name.Buffer);


	TRACE_ENTER ();

	//
	// Enable the debug privilege, which allows us to manipulate other processes
	//

	if (SUCCESS (status = Utils::enable_privilege ((LPWSTR) SE_DEBUG_NAME)))
		{
		constexpr ULONG	access_mask = PROCESS_CREATE_THREAD | PROCESS_QUERY_INFORMATION | PROCESS_VM_OPERATION | PROCESS_VM_READ | PROCESS_VM_WRITE;

		//
		// Open a handle to the target process
		//

		if ((target_process = OpenProcess (access_mask, FALSE, Process_id)) != 0)
			{
			TRACE_INFO (EJDLL, "Opened process ID: %08x, handle: %p", Process_id, target_process);

			//
			// Get the LDR record for Kernel32.dll
			//

			if (SUCCEEDED (status = find_ldr_for_dll (kernel32_dll, Process_id, &kernel32_ldr)))
				{

				//
				// Lookup the exports that we need
				//

				if (SUCCEEDED (status = lookup_remote_exports (target_process, &kernel32_ldr, ED_remote_kernel32_routines, ED_num_remote_kernel32_routines)))
					{
					TRACE_INFO (EJDLL, "FreeLibrary target address 0x%p", ED_remote_FreeLibrary);

					//
					// Create a thread in the target process to call FreeLibrary, and pass it the DLL's base address (which is the same as its module
					// handle). When FreeLibrary returns, the thread will exit
					//

					if ((remote_thread = CreateRemoteThread (target_process, nullptr, 1024*1024, (LPTHREAD_START_ROUTINE) ED_remote_FreeLibrary,
						Dll_ldr->dll_base, 0, &remote_thread_id)) != INVALID_HANDLE_VALUE)
						{
						TRACE_INFO (EJDLL, "Remote thread ID %08x", remote_thread_id);

						//
						// Wait for the remote thread to exit
						//

						WaitForSingleObject (remote_thread, INFINITE);

						//
						// FreeLibrary returns a boolean value
						//

						GetExitCodeThread (remote_thread, (LPDWORD) &status);

						if (status != 0)
							{
							status = STATUS_SUCCESS;
							}
						else
							{
							status = STATUS_UNSUCCESSFUL;
							TRACE_ERROR (EJDLL, "Remote thread failed FreeLibrary");
							throw std::runtime_error (boost::str (boost::format ("Remote thread failed FreeLibrary\n")));
							}

						}
					else
						{
						status = GetLastError ();
						TRACE_ERROR (EJDLL, "Error creating remote thread, status = %d", status);
						throw std::runtime_error (boost::str (boost::format ("Error creating remote thread, status = %08x\n") % status));
						}

					}
				else
					{
					status = GetLastError ();
					TRACE_ERROR (EJDLL, "Error looking up remote exports in process %08x, status = %d", Process_id, status);
					throw std::runtime_error (boost::str (boost::format ("Error looking up remote exports in process %08x, status = %08x\n") %
						Process_id % status));
					}

				}
			else
				{
				TRACE_ERROR (EJDLL, "Error finding %S in process %08x, status = %d", kernel32_dll.c_str (), Process_id, status);
				std::wcout<<boost::wformat (L"Error finding %S in process %08x, status = %08x\n") % kernel32_dll % Process_id % status;
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (EJDLL, "Error opening handle to process ID %08x, status = %d", Process_id, status);
			throw std::runtime_error (boost::str (boost::format ("Error opening handle to process ID %08x, status = %08x\n") %
				Process_id % status));
			}

		}
	else
		{
		TRACE_ERROR (EJDLL, "Error enabling DEBUG privilege, status = %d", status);
		throw std::runtime_error (boost::str (boost::format ("Error enabling DEBUG privilege, status = %08x\n") % status));
		}

	TRACE_EXIT ();
	return status;
}							// End of eject_dll_from_process


_Check_return_
NTSTATUS
find_ldr_for_dll										// Find the LDR structure for the DLL in the specified process
	(
	_In_	std::wstring			Dll_name,			// Name of the DLL to eject
	_In_	ULONG					Process_id,			// Process to eject from
	_Out_	pLDR_DATA_TABLE_ENTRY	Module				// LDR module for the DLL
	)

//
//
// DESCRIPTION:		This routine will search for the specified DLL name in the specified process's loaded module list. To do this, we will need to 
//					enable the DEBUG privilege, which will give us access to the target process' guts. We can then locate the PEB and walk the loaded
//					module list for the process
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	Debug privilege enabled, remote process' address space read
//
// RETURN VALUES:
//					STATUS_SUCCESS			Found the DLL in the target process
//					STATUS_NOT_FOUND		Unable to find the address of the DLL in the target process

{
NTSTATUS					status = STATUS_NOT_FOUND;
HANDLE						target_process;
PROCESS_BASIC_INFORMATION	pbi = { 0 };
ULONG						bytes_ret;
PEB							peb;
SIZE_T						bytes_read;
PEB_LDR_DATA				ldr_data;
LDR_DATA_TABLE_ENTRY		table_entry;
PLIST_ENTRY					queue_links;
PLIST_ENTRY					entry;
ULONG						dll_name_length;
pLDR_DATA_TABLE_ENTRY		table_ptr;
WCHAR						name_buff [MAX_PATH];
UNICODE_STRING				name_desc = {0};
UNICODE_STRING				dll_desc = {(USHORT) (Dll_name.length () * 2), (USHORT) (Dll_name.length () * 2), (PWSTR) Dll_name.c_str ()};


	TRACE_ENTER ();

	//
	// Enable the debug privilege, which allows us to manipulate other processes
	//

	if (SUCCESS (status = Utils::enable_privilege ((LPWSTR) SE_DEBUG_NAME)))
		{
		constexpr ULONG	access_mask = PROCESS_QUERY_INFORMATION | PROCESS_VM_READ;


		//
		// Open a handle to the target process
		//

		if ((target_process = OpenProcess (access_mask, FALSE, Process_id)) != 0)
			{
			TRACE_INFO (EJDLL, "Opened process ID: %08x, handle: %p", Process_id, target_process);

			//
			// Get the address of the PEB in the target process
			//

			if (SUCCESS (status = ED_NtQueryInformationProcess (target_process, ProcessBasicInformation, &pbi, sizeof (pbi), &bytes_ret)))
				{

				//
				// Read the PEB from the target process
				//

				if (ReadProcessMemory (target_process, pbi.PebBaseAddress, &peb, sizeof (peb), &bytes_read))
					{
					TRACE_INFO (EJDLL, "PEB address: %p, bytes read: %lld", pbi.PebBaseAddress, bytes_read);

					//
					// Read the loaded images header. This contains the list heads for the queues of loaded images in the process
					// We need to walk the doubly-linked lists in the target process, but if the process in loading or unloading a DLL, the list can
					// become inconsistent. Normally, this is prevented by calling RtlAcquirePebLock, but we cannot do that remotely. The worst that
					// can happen is that this program will fail; we cannot hurt the target process. If this program fails, then running it again
					// should work
					//

					if (ReadProcessMemory (target_process, peb.ldr, &ldr_data, sizeof (ldr_data), &bytes_read))
						{
						TRACE_INFO (EJDLL, "PEB LDR address: %p, bytes read: %lld", peb.ldr, bytes_read);

						queue_links = (PLIST_ENTRY) &ldr_data.in_memory_order_module_list;
						entry = queue_links;

						//
						// Look through the loaded module list for the DLL
						//

						while (((entry = entry->Flink) != queue_links) && (entry != queue_links))
							{

							//
							// Read the next entry in the list of loaded image data tables from the target process. The queue links are not
							// at the beginning of the LDR_DATA_TABLE_ENTRY structure, so use CONTAINING_RECORD to compute the starting
							// address of the structure
							//

							table_ptr = CONTAINING_RECORD (entry, LDR_DATA_TABLE_ENTRY, in_memory_order_links);
									
							if (ReadProcessMemory (target_process, table_ptr, &table_entry, sizeof (table_entry), &bytes_read))
								{
								TRACE_INFO (EJDLL, "LDR_DATA_TABLE_ENTRY address: %p, bytes read: %lld", table_ptr, bytes_read);

								//
								// The DLL name is stored as a UNICODE_STRING within the LDR_DATA_TABLE_ENTRY. Read the DLL name string buffer
								// from the target process
								//

								RtlZeroMemory (name_buff, sizeof (name_buff));
								dll_name_length = min (sizeof (name_buff), table_entry.base_dll_name.Length);

								if (ReadProcessMemory (target_process, table_entry.base_dll_name.Buffer, name_buff, dll_name_length, &bytes_read))
									{
									TRACE_INFO (EJDLL, "DLL name buffer address: %p, bytes read: %lld", table_entry.base_dll_name.Buffer, bytes_read);
									std::wstring	dll (name_buff);
									SIZE_T			name_start = (dll.find_last_of (L'\\') + 1) * sizeof (WCHAR);

									//
									// Create a UNICODE_STRING descriptor for the DLL name that was just read
									//

									name_desc.Length = table_entry.base_dll_name.Length - (USHORT) name_start;
									name_desc.MaximumLength = name_desc.Length;
									name_desc.Buffer = (PWCHAR)((ULONG_PTR) name_buff + name_start);

									TRACE_INFO (EJDLL, "LDR record for %S", name_desc.Buffer);

									//
									// Is this the record for Kernel32.dll? This is what we need, because that is where LoadLibrary lives
									//

									if (SUCCESS (status = Utils::compare_unicode_strings (dll_desc, name_desc, true)))
										{
										memcpy (Module, &table_entry, sizeof (table_entry));
										status = STATUS_SUCCESS;
										break;
										}

									entry = &table_entry.in_memory_order_links;
									}
								else
									{
									status = GetLastError ();
									TRACE_ERROR (EJDLL, "Error reading DLL name string %p, status = %d", table_entry.base_dll_name.Buffer, status);
									throw std::runtime_error (boost::str (boost::format ("Error reading DLL name string %p, status = %08x\n") %
										table_entry.base_dll_name.Buffer % status));
									}

								}
							else
								{
								status = GetLastError ();
								TRACE_ERROR (EJDLL, "Error reading LDR_DATA_TABLE_ENTRY %p, status = %d", table_ptr, status);
								throw std::runtime_error (boost::str (boost::format ("Error reading LDR_DATA_TABLE_ENTRY %p, status = %08x\n") % 
									table_ptr % status));
								}

							}	// End while

						}
					else
						{
						status = GetLastError ();
						TRACE_ERROR (EJDLL, "Error reading PEB LDR, status = %d", status);
						throw std::runtime_error (boost::str (boost::format ("Error reading PEB LDR, status = %08x\n") % status));
						}

					}
				else
					{
					status = GetLastError ();
					TRACE_ERROR (EJDLL, "Error reading target PEB, status = %d", status);
					throw std::runtime_error (boost::str (boost::format ("Error reading target PEB, status = %08x\n") % status));
					}

				}
			else
				{
				TRACE_ERROR (EJDLL, "Error from NtQueryInformationProcess, status = %d", status);
				throw std::runtime_error (boost::str (boost::format ("Error from NtQueryInformationProcess, status = %08x\n") % status));
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (EJDLL, "Error opening handle to process ID %08x, status = %d", Process_id, status);
			throw std::runtime_error (boost::str (boost::format ("Error opening handle to process ID %08x, status = %08x\n") %
				Process_id % status));
			}

		}
	else
		{
		TRACE_ERROR (EJDLL, "Error enabling DEBUG privilege, status = %d", status);
		throw std::runtime_error (boost::str (boost::format ("Error enabling DEBUG privilege, status = %08x\n") % status));
		}

	TRACE_EXIT ();
	return status;
}							// End of find_ldr_for_dll


NTSTATUS
lookup_remote_exports									// Lookup the addresses of the requested exports in a remote process
	(
	_In_	HANDLE					Target_process,		// Handle to process
	_In_	pLDR_DATA_TABLE_ENTRY	Dll_entry,			// LDR record for DLL to search
	_In_	pIMPORTED_ROUTINE		Routines,			// Routines to find
	_In_	ULONG					Num_routines		// Number of entries in the Routines array
	)

//
// DESCRIPTION:		Find the addresses of exported routines in an external process. This requires reading the remote process' PEB and loaded module
//					list to find the DLL, and then to scan the list of exported routines for that DLL for the routines that are requested. Requires
//					access to the target process' address space via the DEBUG privilege.
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:	Reads another process' address space
//
// RETURN VALUES:
//					STATUS_SUCCESS			Found all requested routines
//					STATUS_UNSUCCESSFUL		Did not find all requested routines
//

{
NTSTATUS					status;
PVOID						dll_base;
PVOID						remote_address;
ULONG						remote_length;
IMAGE_DOS_HEADER			msdos_hdr = { 0 };
IMAGE_FILE_HEADER			coff_hdr = { 0 };
IMAGE_OPTIONAL_HEADER64		opt_hdr = { 0 };
PIMAGE_DATA_DIRECTORY		data_dir;
PULONG						names;
PULONG						exports;
PUSHORT						ordinals;
IMAGE_EXPORT_DIRECTORY		export_dir = { 0 };
ULONG						num_found = 0;
SIZE_T						bytes_read;
CHAR						export_name [256];
ANSI_STRING					name_str;

	//
	// Read the PE/COFF headers for the DLL
	//

	dll_base = Dll_entry->dll_base;
	remote_address = dll_base;
	remote_length = sizeof (msdos_hdr);

	if (ReadProcessMemory (Target_process, dll_base, &msdos_hdr, remote_length, &bytes_read))
		{

		//
		// The MSDOS header lets us find the COFF header
		//

		remote_address = (PVOID) ((ULONG_PTR) dll_base + msdos_hdr.e_lfanew + sizeof (ULONG));
		remote_length = sizeof (coff_hdr);

		if (ReadProcessMemory (Target_process, remote_address, &coff_hdr, remote_length, &bytes_read))
			{

			//
			// The COFF header lets us find the optional header
			//

			remote_address = (PVOID) ((ULONG_PTR) dll_base + msdos_hdr.e_lfanew + sizeof (ULONG) + sizeof (IMAGE_FILE_HEADER));
			remote_length = sizeof (opt_hdr);

			if (ReadProcessMemory (Target_process, remote_address, &opt_hdr, remote_length, &bytes_read))
				{

				//
				// The data directories are part of the optional header
				//

				data_dir = (PIMAGE_DATA_DIRECTORY) &opt_hdr.DataDirectory;
				remote_address = (PIMAGE_EXPORT_DIRECTORY) (data_dir [IMAGE_DIRECTORY_ENTRY_EXPORT].VirtualAddress + (ULONG_PTR) dll_base);
				remote_length = sizeof (export_dir);

				if (ReadProcessMemory (Target_process, remote_address, &export_dir, remote_length, &bytes_read))
					{

					//
					// Get the array of name offsets from the target process
					//

					ULONG	names_len = export_dir.NumberOfNames * sizeof (ULONG);
					names = new ULONG [names_len];
					RtlZeroMemory (names, names_len);

					remote_address = (PVOID) (export_dir.AddressOfNames + (ULONG_PTR) dll_base);
					remote_length = names_len;

					if (ReadProcessMemory (Target_process, remote_address, names, remote_length, &bytes_read))
						{

						//
						// Get the array of export function addresses from the target process
						//

						ULONG	exports_len = export_dir.NumberOfFunctions * sizeof (ULONG);
						exports = new ULONG [exports_len];
						RtlZeroMemory (exports, exports_len);

						remote_address = (PVOID) (export_dir.AddressOfFunctions + (ULONG_PTR) dll_base);
						remote_length = exports_len;

						if (ReadProcessMemory (Target_process, remote_address, exports, remote_length, &bytes_read))
							{

							//
							// Get the array of ordinals from the target process
							//

							ULONG	ordinals_len = export_dir.NumberOfNames * sizeof (USHORT);
							ordinals = new USHORT [ordinals_len];
							RtlZeroMemory (ordinals, ordinals_len);

							remote_address = (PVOID) (export_dir.AddressOfNameOrdinals + (ULONG_PTR) dll_base);
							remote_length = ordinals_len;

							if (ReadProcessMemory (Target_process, remote_address, ordinals, remote_length, &bytes_read))
								{

								//
								// Look through the exports for the routines we need
								//

								for (ULONG i = 0; i < export_dir.NumberOfFunctions; i++)
									{

									//
									// Look for the requested routine names
									//

									for (ULONG j = 0; j < export_dir.NumberOfNames; j++)
										{

										if (ordinals [j] == i)
											{

											//
											// Get the routine name string from the target process
											//

											remote_address = (PVOID) ((ULONG_PTR) names [j] + (ULONG_PTR) dll_base);
											remote_length = sizeof (export_name);

											if (ReadProcessMemory (Target_process, remote_address, &export_name, remote_length, &bytes_read))
												{

												//
												// Build an ANSI_STRING descriptor for the name of the exported routine
												//

												name_str.Length = static_cast <USHORT> (strlen (export_name));
												name_str.Buffer = export_name;
												name_str.MaximumLength = name_str.Length;

												//
												// Does this name match any of the routines that we're looking for?
												//

												for (ULONG k = 0; k < Num_routines; k++)
													{

													//
													// Has this one already been found?
													//

													if (Routines [k].address != nullptr)
														{

														if (SUCCESS (status = Utils::compare_ansi_strings (name_str, *Routines [k].name, true)))
															{

															//
															// The .address field is the address of where to write the routine address
															//

															*Routines [k].address = (PVOID) ((ULONG_PTR) exports [j] + (ULONG_PTR) dll_base);
															num_found = num_found + 1;

															TRACE_VERBOSE (EJDLL, "Found %Z at address %p", &name_str, *Routines [k].address);

															//
															// Have we found all the routines we're looking for?
															//

															if (num_found == Num_routines)
																{
																status = STATUS_SUCCESS;
																goto done;
																}

															}

														}

													}	// End for k
												}
											else
												{
												status = GetLastError ();
												TRACE_ERROR (EJDLL, "Error reading exported routine name address %p, length %d, status = %d", 
													remote_address, remote_length, status);
												throw std::runtime_error (boost::str (boost::format ("Error reading routine name address %p, length %d, status = %d\n") %
													remote_address % remote_length % status));
												}


											}

										}	// End for j

									}	// End for i

								status = STATUS_UNSUCCESSFUL;
								}
							else
								{
								status = GetLastError ();
								TRACE_ERROR (EJDLL, "Error reading exported ordinal array address %p, length %d, status = %d", remote_address, remote_length, status);
								throw std::runtime_error (boost::str (boost::format ("Error reading exported ordinal array address %p, length %d, status = %d\n") %
									remote_address % remote_length % status));
								}

							}
						else
							{
							status = GetLastError ();
							TRACE_ERROR (EJDLL, "Error reading exported function array address %p, length %d, status = %d", remote_address, remote_length, status);
							throw std::runtime_error (boost::str (boost::format ("Error reading exported function array address %p, length %d, status = %d\n") %
								remote_address % remote_length % status));
							}

						}
					else
						{
						status = GetLastError ();
						TRACE_ERROR (EJDLL, "Error reading exported name array address %p, length %d, status = %d", remote_address, remote_length, status);
						throw std::runtime_error (boost::str (boost::format ("Error reading exported name array address %p, length %d, status = %d\n") %
							remote_address % remote_length % status));
						}

					}
				else
					{
					status = GetLastError ();
					TRACE_ERROR (EJDLL, "Error reading optional header address %p, length %d, status = %d", remote_address, remote_length, status);
					throw std::runtime_error (boost::str (boost::format ("Error reading optional header address %p, length %d, status = %d\n") %
						remote_address % remote_length % status));
					}

				}
			else
				{
				status = GetLastError ();
				TRACE_ERROR (EJDLL, "Error reading optional header address %p, length %d, status = %d", remote_address, remote_length, status);
				throw std::runtime_error (boost::str (boost::format ("Error reading optional header address %p, length %d, status = %d\n") %
					remote_address % remote_length % status));
				}

			}
		else
			{
			status = GetLastError ();
			TRACE_ERROR (EJDLL, "Error reading COFF header address %p, length %d, status = %d", remote_address, remote_length, status);
			throw std::runtime_error (boost::str (boost::format ("Error reading COFF header address %p, length %d, status = %08x\n") % 
				remote_address % remote_length % status));
			}

		}
	else
		{
		status = GetLastError ();
		TRACE_ERROR (EJDLL, "Error reading MSDOS header address %p, length %d, status = %d", remote_address, remote_length, status);
		throw std::runtime_error (boost::str (boost::format ("Error reading MSDOS header address %p, length %d, status = %08x\n") % 
			remote_address % remote_length  % status));
		}
done:
	return status;
}							// End lookup_remote_exports


