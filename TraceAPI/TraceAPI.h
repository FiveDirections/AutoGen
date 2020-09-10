//
// FACILITY:	TraceAPI - Trace specific APIs when injected into a process
//
// DESCRIPTION:	This DLL is injected into a process by InjectDLL. Its purpose is to intercept specific APIs and log their parameters using ETW
//
// VERSION:		1.0
//
// AUTHOR:		Brian Catlin
//
// CREATED:		2019-11-15
//
// MODIFICATION HISTORY:
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

//
// Project includes
//

//
// CONSTANTS:
//

//
// Define the opcodes that represent operations that are performed by the driver
// Opcodes 1-10 are reserved to Microsoft
//

enum TL_OPCODES : UCHAR
	{
	TL_OPC_UNINITIALIZED = 0,				// Uninitialized and invalid
	TL_OPC_DLL = 11,				// Fundamental DLL operation
	TL_OPC_TRACE,								// API trace operations
	};

//
// Define the filtering keywords that identify classes of events that can be enabled or disabled
//

enum TL_KEYWORDS : ULONGLONG
	{
	TL_KW_DLL = 0x0000000000000001,	// Events about DLL loading and unloading
	TL_KW_TRACE_PRE = 0x0000000000000002,	// Pre-call API traces
	TL_KW_TRACE_POST = 0x0000000000000004,	// Post-call API traces
	};

#define TRACE_LEVEL_ALWAYS		0

//
// TYPES:
//

//
// MACROS:
//

#define	TL_PROVIDER					"FDI-Detours"
#define TL_GUID						(0xfd06d490, 0xed39, 0x4cff, 0xbe, 0x10, 0x82, 0xc9, 0x40, 0xbc, 0xbe, 0x74)	// {FD06D490-ED39-4CFF-BE10-82C940BCBE74}

//
// DEFINITIONS:
//

//
// DECLARATIONS:
//

//
// EXTERNAL ROUTINES:
//

extern
NTSTATUS
attach_detours											// Intercept the APIs
	(
	);

extern
NTSTATUS
detach_detours											// Stop intercepting the APIs
	(
	);

extern
VOID
det_attach												// Attach the Detours
	(
	_In_	PVOID	*Real_api,							// The real API
	_In_	PVOID	My_api,								// My Detoured API
	_In_	PCCH	Api_name							// API name
	);

extern
VOID
det_detach												// Detach the Detours
	(
	_In_	PVOID	*Real_api,							// The real API
	_In_	PVOID	My_api,								// My Detoured API
	_In_	PCCH	Api_name							// API name
	);

