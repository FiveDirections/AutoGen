//
//
// FACILITY:	WPP - WMI trace PreProcessor
//
// DESCRIPTION:	This module defines the interface to WPP, and describes to WPP the macros to define. These macros are used in the source code for 
//				diagnostic logging
//
//				NOTE: WPP depends upon the __LINE__ macro defined by the compiler, which is disabled if the  Debug Information Format property 
//					  (C++->General) is set to Program Database for Edit and Continue (/Zl), which is the default for applications; therefore, any 
//					  user-mode project including this file must set the Debug Information Format property to Program Database (/Zi)
//
//					  Visual Studio does not natively support WPP for applications (the WDK adds property pages only for drivers), so the .vcxproj 
//					  for each project including this file must be modified according to the directions in the WPP.targets file in the solution 
//					  directory, which will cause the TRACEWPP.exe program to create the .TMH files for each .CPP file. The Additional Include 
//					  Directories property (C++->General) for the project should be modified to specify $(IntDir), so the .TMH files are found
//
// VERSION:		1.0
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2018-04-08
//
// MODIFICATION HISTORY:
//
//	1.0		2018-04-08	Brian Catlin
//			Original version
//
//

#pragma once

//
// INCLUDE FILES:
//

//
// CONSTANTS:
//

//
// MACROS:
//

#if defined (_DEBUG) && !defined (NO_BREAK_ON_ERROR)
#define	DBG_BREAK_POINT		DebugBreak();
#else
#define	DBG_BREAK_POINT
#endif

//
// DEFINITIONS:
//

//
// Define the tracing flags
//
// Tracing GUID for FDI Detours {DCDE5106-86EE-47F2-966A-B6C425ACD9F9}
//

#define WPP_CONTROL_GUIDS											\
	WPP_DEFINE_CONTROL_GUID (FDIDetourTraceGuid, (DCDE5106, 86EE, 47F2, 966A, B6C425ACD9F9),	\
																	\
		WPP_DEFINE_BIT(TRACE_ROUTINE)								\
		WPP_DEFINE_BIT(ALL_COMPONENTS)								\
																	\
		WPP_DEFINE_BIT(FDIDETOUR)									\
		WPP_DEFINE_BIT(ETWLIB)										\
		WPP_DEFINE_BIT(PECOFF)										\
		WPP_DEFINE_BIT(TLV)											\
		WPP_DEFINE_BIT(UTILS)										\
		WPP_DEFINE_BIT(INJDLL)										\
		WPP_DEFINE_BIT(TRACEAPI)									\
		WPP_DEFINE_BIT(EJDLL)										\
		)                             


# define WPP_LOGPUSTR(_x) WPP_LOGPAIR( sizeof(USHORT), (_x)->Length ) \
						  WPP_LOGPAIR( (_x)->Length, (_x)->Buffer )
//
// begin_wpp config
// DEFINE_CPLX_TYPE(UNISTR, WPP_LOGPUSTR, PCUNICODE_STRING, ItemPu16string, "s", Z, 0, 2);
// end_wpp
//
// These macros write the name of the routine being entered or exited
//
// MACRO:	TRACE_ENTER
//
// begin_wpp config
// FUNC TRACE_ENTER();
// USESUFFIX(TRACE_ENTER, "+++ Enter %!FUNC!");
// end_wpp
//
//
// MACRO:	TRACE_EXIT
//
// begin_wpp config
// FUNC TRACE_EXIT();
// USESUFFIX(TRACE_EXIT, "--- Exit  %!FUNC!");
// end_wpp
//

//
// These defines control when the TRACE_ENTER, TRACE_EXIT, and any other macros with the same prototype, will be logged. Tracing for the component 
// TRACE_ROUTINE must be enabled (or the ALL_COMPONENTS bit) in order for the message to be logged.
//
// NOTE: Normally, the WPP_...ENABLED and WPP_...LOGGER macros contain the names of the parameters to the function described, separated by underscores; 
//		however, TRACE_ENTER and TRACE_EXIT do not take any parameters so the #defines below indicate this through the use of no component name between 
//		the underscores
//

#define WPP__ENABLED()	WPP_LEVEL_ENABLED(TRACE_ROUTINE)
#define WPP__LOGGER()	WPP_LEVEL_LOGGER(TRACE_ROUTINE)

//
// MACRO:	TRACE_ALWAYS
//
// begin_wpp config
// FUNC TRACE_ALWAYS{LEVEL=TRACE_LEVEL_CRITICAL}(COMPONENT, MSG, ...);
// end_wpp
//
// MACRO:	TRACE_CRITICAL
//
// begin_wpp config
// USEPREFIX (TRACE_CRITICAL, "%!STDPREFIX! CRITICAL: ");
// FUNC TRACE_CRITICAL{ERRLEVEL=TRACE_LEVEL_CRITICAL}(COMPONENT, MSG, ...);
// end_wpp
//
//
// MACRO:	TRACE_ERROR
//
// begin_wpp config
// USEPREFIX (TRACE_ERROR, "%!STDPREFIX! ERROR: ");
// FUNC TRACE_ERROR{ERRLEVEL=TRACE_LEVEL_ERROR}(COMPONENT, MSG, ...);
// end_wpp
//
// The following macros will cause TRACE_CRITICAL and TRACE_ERROR to generate a debug break point (if a debugger is attached) after displaying their 
// messages. This is why TRACE_CRITICAL and TRACE_ERROR use the parameter ERRLEVEL instead of LEVEL as in the following trace macros; WPP allows 
// pre- and post- processing macros which are differentiated by parameter name.
//

#define WPP_ERRLEVEL_COMPONENT_PRE(ERRLEVEL,COMPONENT)
#define WPP_ERRLEVEL_COMPONENT_POST(ERRLEVEL,COMPONENT)		;DBG_BREAK_POINT;
#define WPP_ERRLEVEL_COMPONENT_ENABLED(ERRLEVEL,COMPONENT)	(WPP_LEVEL_ENABLED(COMPONENT) && (WPP_CONTROL(WPP_BIT_ ##COMPONENT).Level >= ERRLEVEL)  || WPP_LEVEL_ENABLED(ALL_COMPONENTS))
#define WPP_ERRLEVEL_COMPONENT_LOGGER(ERRLEVEL,COMPONENT)	WPP_LEVEL_LOGGER(COMPONENT)

//
// MACRO:	TRACE_WARN
//
// begin_wpp config
// USEPREFIX (TRACE_WARN, "%!STDPREFIX! WARNING: ");
// FUNC TRACE_WARN{LEVEL=TRACE_LEVEL_WARNING}(COMPONENT, MSG, ...);
// end_wpp
//
//
// MACRO:	TRACE_INFO
//
// begin_wpp config
// USEPREFIX (TRACE_INFO, "%!STDPREFIX! INFO: ");
// FUNC TRACE_INFO{LEVEL=TRACE_LEVEL_INFORMATION}(COMPONENT, MSG, ...);
// end_wpp
//
//
// MACRO:	TRACE_VERBOSE
//
// begin_wpp config
// USEPREFIX (TRACE_VERBOSE, "%!STDPREFIX! VERBOSE: ");
// FUNC TRACE_VERBOSE{LEVEL=TRACE_LEVEL_VERBOSE}(COMPONENT, MSG, ...);
// end_wpp
//


//
// These defines control when the TRACE_CRITICAL, TRACE_ERROR, TRACE_..., and any other macros with the same prototype, will be logged. Tracing for 
// the component must be enabled (or the ALL_COMPONENTS bit) and the severity level must be at least as high as the level specified in the macro's 
// description in order for the message to be logged
//

#define WPP_LEVEL_COMPONENT_ENABLED(LEVEL,COMPONENT)	((WPP_LEVEL_ENABLED(COMPONENT) || WPP_LEVEL_ENABLED(ALL_COMPONENTS)) && (WPP_CONTROL(WPP_BIT_ ##COMPONENT).Level >= LEVEL))
#define WPP_LEVEL_COMPONENT_LOGGER(LEVEL,COMPONENT)		WPP_LEVEL_LOGGER(COMPONENT)

//
// MACRO:	TRACE_IO
//
// begin_wpp config
// USEPREFIX (TRACE_IO, "%!STDPREFIX! IO: ");
// FUNC TRACE_IO{LEVEL=TRACE_LEVEL_INFORMATION,COMPONENT=IO_REQUEST}(MSG, ...);
// end_wpp
//

//
//
// This structure defines how to log an address, length pair
//

struct HEXDUMP_DESC
	{
	PVOID				address;
	USHORT				length;
#ifdef __cplusplus
	HEXDUMP_DESC (__in_ecount (length) PVOID addr, USHORT len) : address (addr), length (len) {}
#endif
	} ;

// begin_wpp config
// DEFINE_CPLX_TYPE(HEXDUMP, TRACE_HEX_DUMP, const HEXDUMP_DESC&, ItemHEXDump, "s", _HEX_, 0, 2);
// end_wpp

#define TRACE_LENSTR(len,addr)	HEXDUMP_DESC(addr,len)
#define TRACE_HEX_DUMP(x)		WPP_LOGPAIR(2,&(x).length) WPP_LOGPAIR((x).length, (x).address)

//
// TYPES:
//

//
// GLOBAL ROUTINES:
//

