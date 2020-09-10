//
// FACILITY:	CodeGen - Generate Detours code
//
// DESCRIPTION:	This program will generate the C++ source file for Detouring a specified list of APIs. The code is generated using the StringTemplate
//				library (https://www.stringtemplate.org/). The templates are included in this module as strings. The library performs substitutions
//				of tags within the template using parameters passed in.
//
//				This code probably isn't as efficient as it could be, and it would probably benefit greatly by the use of asynch-await
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-11-12
//
// MODIFICATION HISTORY:
//
//	1.1		2020-04-19	Brian Catlin
//			General cleanup before release
//			Improve heuristics that determine parameter type and return type from function signatures. This removes warning and errors from nearly
//				all the generated routines. I found no errors or warnings in the 1,257 generated routines for APIs in Kernel32.dll, with 
//				AutoGen.exe /exp C:\windows\system32\kernel32.dll /out=..\..\..\TraceAPI /data=..\..\..
//
//	1.0		2019-11-12	Brian Catlin
//			Original version
//

//
// System namespaces
//

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

//
// Third-party NuGet namespaces
//

using Antlr4.StringTemplate;


namespace FDI.AutoGen
	{
	class Code_Gen
		{

		#region Large string constants

		//
		// Most of the typedefs used in Windows for zero-terminated wide strings. Do they really need this many?
		//

		public static readonly List <string> wstrz_types = new List <string> ()
			{
			"LPCUWCHAR",
			"LPCUWSTR",
			"LPCWCH",
			"LPCWSTR",
			"LPUWSTR",
			"LPWCH",
			"LPWSTR",
			"NWPSTR",
			"PCNZWCH",
			"PCUNZWCH",
			"PCUWCHAR",
			"PCUWSTR",
			"PCUZZWSTR",
			"PCWCH",
			"PCWCHAR",
			"PCWSTR",
			"PCZPCWSTR",
			"PCZPWSTR",
			"PCZZWSTR",
			"PNZWCH",
			"PUNZWCH",
			"PUWSTR",
			"PUZZWSTR",
			"PWCH",
			"PWCHAR",
			"PWSTR",
			"PZPCWSTR",
			"PZPWSTR",
			"PZZWSTR"
			};

		//
		// Most of the typedefs used in Windows for zero-terminated ANSI strings. Do they really need this many?
		//

		public static readonly List <string> asciz_types = new List <string> ()
			{
			"LPCCH",
			"LPCH",
			"LPCSTR",
			"LPSTR",
			"NPSTR",
			"PCCH",
			"PCH",
			"PCHAR",
			"PCNZCH",
			"PCSTR",
			"PCZPCSTR",
			"PCZZSTR",
			"PCZPSTR",
			"PNZCH",
			"PSTR",
			"PZPCSTR",
			"PZPSTR",
			"PZZSTR"
			};

		//
		// Standard non-string pointer and handle types
		//

		public static readonly List <string> standard_pointers = new List <string> ()
			{
			"CALLBACK",
			"DWORD_PTR",
			"FARPROC",
			"INT_PTR",
			"LONG_PTR",
			"LPBYTE",
			"LPCOLORREF",
			"LPCVOID",
			"LPWORD",
			"LPHANDLE",
			"LPINT",
			"LPLONG",
			"LPVOID",
			"LPWORD",
			"LRESULT",
			"PACL",
			"PBOOL",
			"PBOOLEAN",
			"PBYTE",
			"PCHAR",
			"PDWORD",
			"PDWORDLONG",
			"PDWORD_PTR",
			"PDWORD32",
			"PDWORD64",
			"PFLOAT",
			"PGUID",
			"PHALF_PTR",
			"PHANDLE",
			"PHKEY",
			"PINT",
			"PINT_PTR",
			"PINT8",
			"PINT16",
			"PINT32",
			"PINT64",
			"PLCID",
			"PLONG",
			"PLONGLONG",
			"PLONG_PTR",
			"PLONG32",
			"PLONG64",
			"POINTER_32",
			"POINTER_64",
			"POINTER_SIGNED",
			"POINTER_UNSIGNED",
			"PSHORT",
			"PSID",
			"PSLIST_ENTRY",
			"PSIZE_T",
			"PSRWLOCK",
			"PSSIZE_T",
			"PTP_CLEANUP_GROUP",
			"PTP_IO",
			"PTP_POOL",
			"PTP_TIMER",
			"PTP_WAIT",
			"PTP_WORK",
			"PUCHAR",
			"PUHALF_PTR",
			"PUINT",
			"PUINT_PTR",
			"PUINT8",
			"PUINT16",
			"PUINT32",
			"PUINT64",
			"PULONG",
			"PULONGLONG",
			"PULONG_PTR",
			"PULONG32",
			"PULONG64",
			"PUSHORT",
			"PVOID",
			"PWCHAR",
			"PWORD",
			"SC_HANDLE",
			"SC_LOCK",
			"SERVICE_STATUS_HANDLE",
			"UHALF_PTR",
			"UINT_PTR",
			"ULONG_PTR",
			"PUNICODE_STRING",
			"WCHAR"
			};

		//
		// List of standard scalar types for use in detecting Enums and pointer to function. If it isn't on this list and the parameter name begins 
		// with 'f', then it is likely an Enum, if it isn't on the standard_pointers list and it begins with 'lp' then it is likely a function pointer. 
		// This is important so we can choose the correct TraceLoggingXxx macro for encapsulating the parameter
		//

		public static readonly List <string> standard_scalars = new List <string> ()
			{
			"BOOL",
			"BOOLEAN",
			"BYTE",
			"CCHAR",
			"CHAR",
			"DOUBLE",
			"DWORD",
			"DWORDLONG",
			"DWORD32",
			"DWORD64",
			"FLOAT",
			"HALF",
			"HANDLE",
			"INT",
			"INT8",
			"INT16",
			"INT32",
			"INT64",
			"LANGID",
			"LCID",
			"LCTYPE",
			"LGRPID",
			"LONG",
			"LONGLONG",
			"LONG32",
			"LONG64",
			"LPARAM",
			"NTSTATUS",
			"QWORD",
			"SHORT",
			"SIZE_T",
			"SSIZE_T",
			"UCHAR",
			"UINT",
			"UINT8",
			"UINT16",
			"UINT32",
			"UINT64",
			"ULONG",
			"ULONGLONG",
			"ULONG32",
			"ULONG64",
			"UNSIGNED CHAR",
			"UNSIGNED SHORT",
			"UNSIGNED LONG",
			"USHORT",
			"USN",
			"WORD",
			"WPARAM"
			};

		//
		// Placing the templates in this string removes the dependency on the Detours.stg file. This string and the .STG file should be identical,
		// except that the double-quotes in the .STG file had to be doubled to work in a C# file
		//

		static readonly string string_template_group =
@"
//
// Generate #include statement for one or more system include files
//

include (header) ::=
<<
#include \<<header>\>
>>

api_list (apis) ::=
<<
<apis:{a|<a.func_name>}; wrap, separator = ""\n//					"">
>>

//
// Template for the beginning of file
//

file_header(version, date, exe_name, apis_to_detour, headers, command_line) ::= 
<<
//
//	WARNING: This file was generated by AutoGen version <version> on <date>
//			 Do not make any changes to this file because they will be lost the 
//			 next time AutoGen is run
//
//	Command line: <command_line>
//

//
// FACILITY:	TraceAPI - Trace Windows APIs in <exe_name>
//
// DESCRIPTION:	This DLL is injected into a process by InjectDLL. Its purpose is to intercept the following APIs and log their 
//				parameters using the FDI-Detours TraceLogging provider ({FD06D490-ED39-4CFF-BE10-82C940BCBE74}). Diagnostic information
//				about how this program is running is output using WPP (Windows PreProcessor) ETW tracing using the GUID
//				{DCDE5106-86EE-47F2-966A-B6C425ACD9F9}
//
//				The following APIs are intercepted and logged:
//					<api_list (apis_to_detour)>
//
// VERSION:		1.1
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-11-15
//
// MODIFICATION HISTORY:
//
//	1.1		2020-04-19	Brian Catlin
//			Support new heuristics that detect parameter data type with appropriate TraceLoggingXxx macro invocations in the trace_input_params and
//			trace_output_params string templates
//
//	1.0		2019-11-15	Brian Catlin
//			Original version
//

//
// INCLUDE FILES:
//

//
// System includes
//

#define WIN32_NO_STATUS
#include \<Windows.h>
#undef WIN32_NO_STATUS
#include \<ntstatus.h>
#include \<TraceLoggingProvider.h>
#include \<evntprov.h>

#include \<string>
#include \<list>

<if (headers)>
//
// Includes for APIs being Detoured
//

<headers:{h|<include(h)>}; separator = ""\n"">
<endif>

//
// Project includes
//

#include ""detours.h""

#include ""TraceAPI.h""
#include ""..\Global\Utils.h""
#include ""..\Global\WPP_Tracing.h""
#include ""Version.h""

#include ""TraceAPI.tmh""								// Generated by TraceWPP

using namespace FDI;

//
// CONSTANTS:
//

//
// TYPES:
//

//
// MACROS:
//

#define ATTACH(x)       det_attach (&(PVOID&) real_##x, my_##x, #x)
#define DETACH(x)       det_detach (&(PVOID&) real_##x, my_##x, #x)

//
// DEFINITIONS:
//

//
// DECLARATIONS:
//

TRACELOGGING_DECLARE_PROVIDER (TA_tlg);

>>

//
// Generate a declaration for a pointer to the real API
//

real_api_decl (api) ::=
<<
<if (api.specifiers)>
<api.specifiers:{s|<s>}; separator = ""\n"">
<else>
<api.ret_type>
<endif>
(WINAPI * real_<api.func_name>)
	(
	<api.parameters:{p|<p.type_qualifier> <p.type> <p.storage_class> <p.param_name>}; separator = "",\n"">
	) = <api.func_name>;
>>

//
//	Generate the declaration for a Detoured routine
//

my_api_decl (api) ::=
<<
<if (api.specifiers)>
<api.specifiers:{s|<s>}; separator = ""\n"">
<else>
<api.ret_type>
<endif>
my_<api.func_name>
	(
	<api.parameters:{p|<p.type_qualifier> <p.type> <p.storage_class> <p.param_name>}; separator = "",\n"">
	);
>>

//
// Template for pointers to the real API (with a 'real_' suffix) and a forward declaration to our Detoured
// API (with a 'my_' suffix)
//

real_api_list (list) ::=
<<

//
// Pointers to the real APIs
//

extern ""C""
{
<list:{l|<real_api_decl(l)>}; separator = ""\n\n"">

}	// extern ""C""

//
// FORWARD ROUTINES:
//

NTSTATUS 
attach_detours										// Intercept the APIs
	(
	);

NTSTATUS
detach_detours										// Stop intercepting the APIs
	(
	);

//
// Forward declarations of generated routines
//

<list:{l|<my_api_decl(l)>}; separator = ""\n\n"">

>>

//
// Generate a ATTACH line for an API
//

attach (name) ::=
<<
	ATTACH (<name>);
>>

//
// Generate a DETACH line for an API
//

detach (name) ::=
<<
	DETACH (<name>);
>>

//
// Template the attach_detours and detach_detours routines
//

support_routines (exename, api_list) ::=
<<


NTSTATUS 
attach_detours										// Intercept the APIs
	(
	)

//
// DESCRIPTION:		
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//

{
NTSTATUS	status;


	TRACE_ENTER ();

	//
	// Tell Detours that we're starting a transaction to update the list of detours
	//

	DetourTransactionBegin ();
	DetourUpdateThread (GetCurrentThread ());

	//
	// List all the Detours to install
	//
	// NOTE: This list MUST match the list in detach_detours
	//

<api_list:{a|<attach (a.func_name)>}; separator = ""\n"">

	//
	// Tell Detours that we're done updating detours
	//

	status = DetourTransactionCommit ();

	TRACE_EXIT ();
	return status;
}							// End attach_detours


NTSTATUS
detach_detours										// Stop intercepting the APIs
	(
	)

//
// DESCRIPTION:		
//
// ASSUMPTIONS:		User mode
//
// SIDE EFFECTS:
//
// RETURN VALUES:
//
//

{
NTSTATUS	status;


	TRACE_ENTER ();

	//
	// Tell Detours that we're starting a transaction to update the list of detours
	//

	DetourTransactionBegin ();
	DetourUpdateThread (GetCurrentThread ());

	//
	// List all the detours to remove
	//
	// NOTE: This list MUST match the list in attach_detours
	//

<api_list:{a|<detach (a.func_name)>}; separator = ""\n"">

	//
	// Tell Detours that we're done updating detours
	//

	status = DetourTransactionCommit ();

	TRACE_EXIT ();
	return status;
}							// End detach_detours


>>

//
// This template will generate the list of detour routines that will replace Windows APIs
//

generate_routines (api_list) ::=
<<
<api_list:{a|<detour (a)>}; separator = ""\n\n"">
>>

//
// Generate TraceLogging lines for input parameters
//

trace_input_params (parameters) ::=
<<
<parameters:{p|
<if (p.is_wstrz && !p.is_output)>
		TraceLoggingWideString (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_asciz && !p.is_output)>
		TraceLoggingString (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_output || p.is_pointer)>
		TraceLoggingPointer ((LPCVOID) <p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_input && p.is_scalar)>
		TraceLoggingValue (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_input && p.is_enum)>
		TraceLoggingValue ((UINT32) <p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_input && p.is_custom)>
		TraceLoggingBinary (&<p.param_name>, sizeof (<p.param_name>), ""<p.param_name>"")<\\>
<endif>
}; separator = "","">
>>

//
// Generate TraceLogging lines for output parameters
//

trace_output_params (parameters) ::=
<<
<parameters:{p|<if (p.is_output)>
<if (p.is_wstrz)>
		TraceLoggingWideString (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_asciz)>
		TraceLoggingString (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_scalar && !p.is_pointer)>
		TraceLoggingValue (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_enum)>
		TraceLoggingValue ((UINT32) <p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_pointer && (!p.is_asciz && !p.is_wstrz && !p.is_scalar && !p.is_enum))>
		TraceLoggingPointer (<p.param_name>, ""<p.param_name>"")<\\>
<elseif (p.is_custom)>
		TraceLoggingBinary (&<p.param_name>, sizeof (<p.param_name>), ""<p.param_name>"")<\\>
<endif>
<endif>
}; separator = "","">
>>

//
// Template for a Detours routine. It has the same function signature as the real routine
//

detour (api) ::=
<<
<if (api.specifiers)>
<api.specifiers:{s|<s>}; separator = ""\n"">
<else>
<api.ret_type>
<endif>
my_<api.func_name>
	(
	<api.parameters:{p|<p.type_qualifier> <p.type> <p.storage_class> <p.param_name>}; separator = "",\n"">
	)

{
<if (!api.ret_void)>
NTSTATUS	status;
<api.ret_type>		ret_value;
<endif>


	//
	// Write a pre-call entry to the log with all of the parameters
	//

	TraceLoggingWrite (TA_tlg, ""API-Trace-PRECALL"", TraceLoggingOpcode (TL_OPC_TRACE), TraceLoggingLevel (TRACE_LEVEL_INFORMATION),
		TraceLoggingKeyword (TL_KW_TRACE_PRE), 
		TraceLoggingString (""<api.func_name>"", ""API"")<if (api.parameters)>,<endif>
<trace_input_params (api.parameters)>
		);

	//
	// Call the real API
	//

<if (!api.ret_void)>	ret_value = <else>	<endif>real_<api.func_name> (
				<api.parameters:{p|<p.param_name>}; wrap, anchor, separator = "",\n"">);
	
	//
	// Write a post-call entry to the log with just the output parameters
	//

<if (!api.ret_void)>
	status = GetLastError ();
<endif>

	TraceLoggingWrite (TA_tlg, ""API-Trace-POSTCALL"", TraceLoggingOpcode (TL_OPC_TRACE), TraceLoggingLevel (TRACE_LEVEL_INFORMATION),
		TraceLoggingKeyword (TL_KW_TRACE_POST), 
		TraceLoggingString (""<api.func_name>"", ""API"")<\\>
<if (api.ret_pointer)><\\>
,
		TraceLoggingPointer ((PVOID) ret_value, ""Return value""),
		TraceLoggingUInt32 (status, ""Last error status"")<if (api.has_outputs)>,<endif>
<elseif (api.ret_scalar)><\\>
,
		TraceLoggingValue (ret_value, ""Return value""),
		TraceLoggingUInt32 (status, ""Last error status"")<if (api.has_outputs)>,<endif>
<elseif (api.ret_custom)><\\>
,
		TraceLoggingBinary (&ret_value, sizeof (ret_value), ""Return value""),
		TraceLoggingUInt32 (status, ""Last error status"")<if (api.has_outputs)>,<endif>
<elseif (api.ret_void)><\\>
<endif>
<trace_output_params (api.output_parameters)>
		);

	return<if (!api.ret_void)> ret_value;<else>;<endif>
}							// End my_<api.func_name>
>>

";
		#endregion

		/// <summary>
		/// This routine is responsible for generating the output C++ source file
		/// </summary>
		/// <param name="Output_file">Name of the file</param>
		/// <param name="Files">List of EXE/DLL file names the code was generated for</param>
		/// <param name="Api_list">List of APIs to Detour</param>
		/// <param name="Headers">List of header files containing the definitions of the APIs being Detoured</param>
		public static void
		create_detours 
			(
			string					Output_file,
			List <string>			Files,
			ref List <Api>			Api_list,
			ref List <string>		Headers
			)
			{
			string			file_names = string.Join (", ", Files);
			int				line_width = 128;

			//
			// Convert the list of APIs into a form that the string template is expecting
			//

			convert_for_string_template (ref Api_list);

			//
			// Useful during debugging. Reading the templates from a text file doesn't require recompiling after every change
			//

//			string filespec = Path.GetFullPath (@"..\..\Detours.stg");
//			TemplateGroup group = new TemplateGroupFile (filespec);
			TemplateGroup group = new TemplateGroupString (string_template_group);		// Use the string template defined in this string
//			group.Verbose = true;                                                       // Display errors and operations to the console window

			//
			// Generate the file header
			//

			Template file_hdr = group.GetInstanceOf ("file_header");
			file_hdr.Add ("version", "1.1.0.0");

			DateTime now = DateTime.Now;
			file_hdr.Add ("date", now);

			file_hdr.Add ("exe_name", file_names);

			file_hdr.Add ("apis_to_detour", Api_list);

			file_hdr.Add ("headers", Headers);

			file_hdr.Add ("command_line", Environment.CommandLine);

			File.AppendAllText (Output_file, file_hdr.Render (line_width));

			//
			// Generate the pointers to the real APIs
			//

			Template real_api_list = group.GetInstanceOf ("real_api_list");
			real_api_list.Add ("list", Api_list);

			File.AppendAllText (Output_file, real_api_list.Render (line_width));

			//
			// Generate the support routines
			//

			Template support_routines = group.GetInstanceOf ("support_routines");
			support_routines.Add ("exename", file_names);
			support_routines.Add ("api_list", Api_list);

			File.AppendAllText (Output_file, support_routines.Render (line_width));

			//
			// For each API, create a list of output-only parameters that are not just pointers (these will be part of the list of input parameters). This is
			// to get around StringTemplate bug that I found, where it doesn't handle lists with separators properly (it leaves a hanging separator at the end
			// of a list)
			//

			foreach (var api in Api_list)
				{
				api.output_parameters = (from p in api.parameters
												where p.is_output && !p.is_pointer
												select p).ToList ();

				if (api.output_parameters.Count == 0)
					{
					api.has_outputs = false;
					}

				}

			//
			// Generate the Detours routines
			//

			Template generate_routines = group.GetInstanceOf ("generate_routines");
			generate_routines.Add ("api_list", Api_list);

			File.AppendAllText (Output_file, generate_routines.Render (line_width));
			}   // End create_detours

		/// <summary>
		/// For each API in the list, try to determine whether the routine parameters are input, output, or input-output. There are several heuristics
		/// used to try to determine the parameter usage. If we're lucky, the API was annotated using SAL (Structured Annotation Language), which 
		/// specifically designates the paramater usage. If not, then parameters that are passed as pointers are often input-outpu
		/// </summary>
		/// <param name="Api_list">List containing the details of each API</param>
		static void 
		convert_for_string_template 
			(
			ref List <Api>			Api_list
			)
			{
			var hdrs = new List <string> ();

			//
			// Set metadata about the API and its parameters
			//

			foreach (Api api in Api_list)
				{

				//
				// Mark any APIs that don't return a value
				//

				if (api.ret_type.Trim ().ToUpper ().Equals ("VOID"))
					{
					api.ret_void = true;
					}

				//
				// Does it return a pointer-like thing that TraceLoggingPointer can handle?
				//

				else if (Code_Gen.standard_pointers.Contains (api.ret_type.ToUpper ()))
					{
					api.ret_pointer = true;
					}

				//
				// Is it a standard scalar?
				//

				else if (Code_Gen.standard_scalars.Contains (api.ret_type.ToUpper ()))
					{
					api.ret_scalar = true;
					}

				//
				// Must be a custom type
				//

				else
					{
					api.ret_custom = true;
					}

				//
				// Are there any parameters?
				//

				if (api.parameters != null)
					{

					//
					// Apply some heuristics to each of the parameters to determine how to display the parameters in the log
					//

					foreach (Api_Param p in api.parameters)
						{
						string param_type;

						//
						// Get the parameter type without any trailing "*"
						//

						if (p.num_ptr > 0)
							{
							param_type = p.type.ToUpper ().Substring (0, p.type.IndexOf ("*"));
							}
						else
							{
							param_type = p.type.ToUpper ();
							}

						//
						// Has the parameter type been set? If not, then it wasn't annotated by SAL, so try to figure out whether it is input, output,
						// or input-output
						//

						if (!p.is_input && !p.is_output)
							{

							//
							// If the type is a pointer, then mark the parameter appropriately
							//

							if (p.num_ptr == 0)
								{

								//
								// There wasn't an asterisk, check if it is a standard pointer type, If so, then it may be an output parameter, too
								//
								// This is a heuristic, so there may be some error
								//

								p.is_input = true;

								if (Code_Gen.standard_pointers.Contains (param_type))
									{
									p.is_pointer = true;
									p.is_output = true;     // Possibly true
									}

								}
							else
								{

								if (p.num_ptr == 1)
									{

									//
									// If this is a pointer type with an asterisk (pointer to pointer), then it is probably an output-only parameter.
									// In Hungarian Notation, pointer to pointer usually starts with "pp"
									//

									if (Code_Gen.standard_pointers.Contains (param_type))   // || p.param_name.StartsWith ("pp"))
										{
										p.is_output = true;
										}
									else
										{

										//
										// Maybe a pointer to a scalar or custom type. This could be input, output, or both
										//

										p.is_input = true;
										p.is_output = true;
										}

									}
								else
									{

									//
									// Two or more asterisks mean that this is almost certainly an output-only parameter
									//

									p.is_output = true;
									}

								}

							}

						//
						// Is this a zero-terminated wide string?
						//

						if (wstrz_types.Contains (param_type))
							{
							p.is_wstrz = true;
							}

						//
						// Is this a zero-terminated ANSI string?
						//

						else if (asciz_types.Contains (param_type))
							{
							p.is_asciz = true;
							}

						//
						// Some developers use WCHAR* or CHAR* instead of the standard Windows typedefs PWCHAR or PCHAR. Sigh. Try to detect those
						//

						else if ((param_type.Equals ("WCHAR") || param_type.Equals ("WCHAR_T")) && p.num_ptr > 0)
							{
							p.is_wstrz = true;
							}
						else if ((param_type.Equals ("CHAR") || param_type.Equals ("CHAR_T")) && p.num_ptr > 0)
							{
							p.is_asciz = true;
							}

						//
						// Is this a scalar parameter?
						//

						else if (Code_Gen.standard_scalars.Contains (param_type))
							{
							p.is_scalar = true;
							}

						//
						// Is the type on the standard list of pointers, or the type name looks like a function pointer, or the parameter name
						// starts with "pfn" (Hungarian Notation for pointer to function)?
						//

						else if (Code_Gen.standard_pointers.Contains (param_type) || param_type.ToUpper ().Contains ("CALLBACK") ||
							param_type.ToUpper ().Contains ("PROC") || param_type.ToUpper ().Contains ("HANDLER") || 
							param_type.ToUpper ().Contains ("ROUTINE") || p.param_name.StartsWith ("pfn"))
							{
							p.is_pointer = true;
							}

						//
						// Most pointer types or parameter names start with "P" or "LP". This isn't a great heuristic, but it is mostly accurate
						//

						else if (param_type.StartsWith ("P") || param_type.StartsWith ("LP") || 
							p.param_name.StartsWith ("p") || p.param_name.StartsWith ("lp"))
							{
							p.is_pointer = true;
							p.is_output = true;		// Possibly true
							}

						//
						// If the parameter type is neither a pointer nor a standard scalar and the parameter name starts with "f" (Hungarian
						// notation for enum/flag) followed by a capital letter (A-Z), then it may an enum
						//

						else if (p.param_name.ElementAt (0) == 'f' && p.param_name.ElementAt (1) >= 'A' && p.param_name.ElementAt (1) <= 'Z')
							{
							p.is_enum = true;
							}

						//
						// Custom type
						//

						else
							{
							p.is_custom = true;
							}

						//
						// If there are one or more asterisks, then mark this as a pointer. We have to do this because the StringTemplate library
						// can only test for boolean values; no conditionals are allowed
						//

						if (p.num_ptr > 0)
							{
							p.is_pointer = true;
							}

						//
						// If this is an output parameter, then mark the API as having one or more outputs
						//

						if (p.is_output)
							{
							api.has_outputs = true;
							}

						}   // End foreach parameter

					}

				}   // End foreach Api

			//
			// Sort the list of APIs by function name
			//

			Api_list.Sort ((a, b) => (a.func_name.CompareTo (b.func_name)));
			}   // End convert_for_string_template

		}   // End class Code_Gen

	}	// End namespace FDI.AutoGen

