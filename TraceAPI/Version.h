//
// FACILITY:	VER - Version information
//
// DESCRIPTION:	This module describes the version of the file
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

#pragma once

//+
// If BETA is defined, then this file is marked as pre-release
//-

#ifdef BETA_BUILD
#define VER_PRERELEASE						VS_FF_PRERELEASE
#define VER_PRERELEASE_STR					"BETA RELEASE"
#else
#define VER_PRERELEASE						0
#define VER_PRERELEASE_STR
#endif

//+
// If OFFICIAL_BUILD is not defined then is marked as a private build
//-

#ifdef OFFICIAL_BUILD
#define VER_PRIVATE							0
#else
#define VER_PRIVATE							VS_FF_PRIVATEBUILD
#endif

//+
// Mark the file as a special build
//-

#if SPECIAL_BUILD
#define VER_SPECIALBUILD					VS_FF_SPECIALBUILD
#define VER_SPECIALBUILD_STR				"Identify special build here"
#else
#define VER_SPECIALBUILD					0
#define VER_SPECIALBUILD_STR
#endif

//+
// Mark the file as a debug build
//-

#ifdef _DEBUG
#define VER_DEBUG							VS_FF_DEBUG
#define VER_BUILD_TYPE_STR					"DEBUG build"
#else
#define VER_DEBUG							0
#define VER_BUILD_TYPE_STR					"RELEASE build"
#endif


//+
// If the file is export controlled, mark it as such
//-

#ifdef EXPORT_CONTROLLED

#ifdef EXPORT
#define EXPORT_TAG  " (Export Version)"
#else
#define EXPORT_TAG  " (US/Canada Only, Not for Export)"
#endif

#else	// Not export controlled
#endif

#define	VERSION_MAJOR						1
#define VERSION_MINOR						1
#define VERSION_EXTEND						0
#define CONCAT(X,Y)							X "," Y
#define VER_COMPANYNAME_STR					"Five Directions Inc."
#define VER_FILEDESCRIPTION_STR1			"TraceAPI Detours"
#define VER_FILEDESCRIPTION_STR2			CONCAT (VER_FILEDESCRIPTION_STR1, VER_BUILD_TYPE_STR)
#define VER_FILEDESCRIPTION_STR3			CONCAT (VER_FILEDESCRIPTION_STR2, VER_PRERELEASE_STR)
#define VER_FILEDESCRIPTION_STR				CONCAT (VER_FILEDESCRIPTION_STR3, VER_SPECIALBUILD_STR)

#define VER_INTERNALNAME_STR				"TraceAPI.dll"
#define VER_ORIGINALFILENAME_STR			"TraceAPI.dll"
#define VER_LEGALCOPYRIGHT_STR				"Five Directions Inc. All rights reserved."
#define VER_LEGALCOPYRIGHT_LSTR				L"Five Directions Inc. All rights reserved."
#define VER_PRODUCTNAME_STR					"TraceAPI Detours"

#define VER_LEGALCOPYRIGHT_YEARS			"2020"

#define VER_FILEFLAGSMASK					VS_FFI_FILEFLAGSMASK
#define VER_FILETYPE						VFT_DRV
#define VER_FILESUBTYPE						VFT2_DRV_SYSTEM
#define VER_FILEOS							VOS_NT_WINDOWS32 
#define VER_FILEFLAGS						(VER_PRERELEASE|VER_DEBUG|VER_PRIVATE|VER_SPECIALBUILD)

#define VER_PRODUCTVERSION					VERSION_MAJOR,VERSION_MINOR,VERSION_EXTEND
#define VER_FILEVERSION						VER_PRODUCTVERSION

//+
// Generate variations of the version number
//-

#define VER_PRODUCTVERSION_W				((VERSION_MAJOR << 8) | VERSION_MINOR)
#define VER_PRODUCTVERSION_DW				((VER_PRODUCTVERSION_W << 16) | (VERSION_EXTEND)))
#define VER_PRODUCTVERSION_MAJORMINOR2(x,y,z)	#x "." #y "-" #z
#define VER_PRODUCTVERSION_MAJORMINOR1(x,y,z)	VER_PRODUCTVERSION_MAJORMINOR2(x,y,z)
#define VER_PRODUCTVERSION_STR				VER_PRODUCTVERSION_MAJORMINOR1(VERSION_MAJOR, VERSION_MINOR, VERSION_EXTEND)

#define LVER_PRODUCTVERSION_MAJORMINOR2(x,y)	L#x L"." L#y
#define LVER_PRODUCTVERSION_MAJORMINOR1(x,y)	LVER_PRODUCTVERSION_MAJORMINOR2(x, y)
#define LVER_PRODUCTVERSION_STR				LVER_PRODUCTVERSION_MAJORMINOR1(VERSION_MAJOR, VERSION_MINOR)
