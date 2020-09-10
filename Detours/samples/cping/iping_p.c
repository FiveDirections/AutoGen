

/* this ALWAYS GENERATED file contains the proxy stub code */


 /* File created by MIDL compiler version 8.01.0622 */
/* at Mon Jan 18 17:14:07 2038
 */
/* Compiler settings for iping.idl:
    Oicf, W1, Zp8, env=Win64 (32b run), target_arch=AMD64 8.01.0622 
    protocol : all , ms_ext, c_ext, robust
    error checks: allocation ref bounds_check enum stub_data 
    VC __declspec() decoration level: 
         __declspec(uuid()), __declspec(selectany), __declspec(novtable)
         DECLSPEC_UUID(), MIDL_INTERFACE()
*/
/* @@MIDL_FILE_HEADING(  ) */

#if defined(_M_AMD64)


#if _MSC_VER >= 1200
#pragma warning(push)
#endif

#pragma warning( disable: 4211 )  /* redefine extern to static */
#pragma warning( disable: 4232 )  /* dllimport identity*/
#pragma warning( disable: 4024 )  /* array to pointer mapping*/
#pragma warning( disable: 4152 )  /* function/data pointer conversion in expression */

#define USE_STUBLESS_PROXY


/* verify that the <rpcproxy.h> version is high enough to compile this file*/
#ifndef __REDQ_RPCPROXY_H_VERSION__
#define __REQUIRED_RPCPROXY_H_VERSION__ 475
#endif


#include "rpcproxy.h"
#include "ndr64types.h"
#ifndef __RPCPROXY_H_VERSION__
#error this stub requires an updated version of <rpcproxy.h>
#endif /* __RPCPROXY_H_VERSION__ */


#include "iping_h.h"

#define TYPE_FORMAT_STRING_SIZE   15                                
#define PROC_FORMAT_STRING_SIZE   147                               
#define EXPR_FORMAT_STRING_SIZE   1                                 
#define TRANSMIT_AS_TABLE_SIZE    0            
#define WIRE_MARSHAL_TABLE_SIZE   0            

typedef struct _iping_MIDL_TYPE_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ TYPE_FORMAT_STRING_SIZE ];
    } iping_MIDL_TYPE_FORMAT_STRING;

typedef struct _iping_MIDL_PROC_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ PROC_FORMAT_STRING_SIZE ];
    } iping_MIDL_PROC_FORMAT_STRING;

typedef struct _iping_MIDL_EXPR_FORMAT_STRING
    {
    long          Pad;
    unsigned char  Format[ EXPR_FORMAT_STRING_SIZE ];
    } iping_MIDL_EXPR_FORMAT_STRING;


static const RPC_SYNTAX_IDENTIFIER  _RpcTransferSyntax = 
{{0x8A885D04,0x1CEB,0x11C9,{0x9F,0xE8,0x08,0x00,0x2B,0x10,0x48,0x60}},{2,0}};

static const RPC_SYNTAX_IDENTIFIER  _NDR64_RpcTransferSyntax = 
{{0x71710533,0xbeba,0x4937,{0x83,0x19,0xb5,0xdb,0xef,0x9c,0xcc,0x36}},{1,0}};



extern const iping_MIDL_TYPE_FORMAT_STRING iping__MIDL_TypeFormatString;
extern const iping_MIDL_PROC_FORMAT_STRING iping__MIDL_ProcFormatString;
extern const iping_MIDL_EXPR_FORMAT_STRING iping__MIDL_ExprFormatString;


extern const MIDL_STUB_DESC Object_StubDesc;


extern const MIDL_SERVER_INFO IPing_ServerInfo;
extern const MIDL_STUBLESS_PROXY_INFO IPing_ProxyInfo;



#if !defined(__RPC_WIN64__)
#error  Invalid build platform for this stub.
#endif

static const iping_MIDL_PROC_FORMAT_STRING iping__MIDL_ProcFormatString =
    {
        0,
        {

	/* Procedure Ping */

			0x33,		/* FC_AUTO_HANDLE */
			0x6c,		/* Old Flags:  object, Oi2 */
/*  2 */	NdrFcLong( 0x0 ),	/* 0 */
/*  6 */	NdrFcShort( 0x3 ),	/* 3 */
/*  8 */	NdrFcShort( 0x10 ),	/* X64 Stack size/offset = 16 */
/* 10 */	NdrFcShort( 0x0 ),	/* 0 */
/* 12 */	NdrFcShort( 0x8 ),	/* 8 */
/* 14 */	0x44,		/* Oi2 Flags:  has return, has ext, */
			0x1,		/* 1 */
/* 16 */	0xa,		/* 10 */
			0x1,		/* Ext Flags:  new corr desc, */
/* 18 */	NdrFcShort( 0x0 ),	/* 0 */
/* 20 */	NdrFcShort( 0x0 ),	/* 0 */
/* 22 */	NdrFcShort( 0x0 ),	/* 0 */
/* 24 */	NdrFcShort( 0x0 ),	/* 0 */

	/* Return value */

/* 26 */	NdrFcShort( 0x70 ),	/* Flags:  out, return, base type, */
/* 28 */	NdrFcShort( 0x8 ),	/* X64 Stack size/offset = 8 */
/* 30 */	0x8,		/* FC_LONG */
			0x0,		/* 0 */

	/* Procedure PingToServer */

/* 32 */	0x33,		/* FC_AUTO_HANDLE */
			0x6c,		/* Old Flags:  object, Oi2 */
/* 34 */	NdrFcLong( 0x0 ),	/* 0 */
/* 38 */	NdrFcShort( 0x4 ),	/* 4 */
/* 40 */	NdrFcShort( 0x18 ),	/* X64 Stack size/offset = 24 */
/* 42 */	NdrFcShort( 0x0 ),	/* 0 */
/* 44 */	NdrFcShort( 0x8 ),	/* 8 */
/* 46 */	0x46,		/* Oi2 Flags:  clt must size, has return, has ext, */
			0x2,		/* 2 */
/* 48 */	0xa,		/* 10 */
			0x1,		/* Ext Flags:  new corr desc, */
/* 50 */	NdrFcShort( 0x0 ),	/* 0 */
/* 52 */	NdrFcShort( 0x0 ),	/* 0 */
/* 54 */	NdrFcShort( 0x0 ),	/* 0 */
/* 56 */	NdrFcShort( 0x0 ),	/* 0 */

	/* Parameter pszString */

/* 58 */	NdrFcShort( 0x10b ),	/* Flags:  must size, must free, in, simple ref, */
/* 60 */	NdrFcShort( 0x8 ),	/* X64 Stack size/offset = 8 */
/* 62 */	NdrFcShort( 0x4 ),	/* Type Offset=4 */

	/* Return value */

/* 64 */	NdrFcShort( 0x70 ),	/* Flags:  out, return, base type, */
/* 66 */	NdrFcShort( 0x10 ),	/* X64 Stack size/offset = 16 */
/* 68 */	0x8,		/* FC_LONG */
			0x0,		/* 0 */

	/* Procedure PingToClient */

/* 70 */	0x33,		/* FC_AUTO_HANDLE */
			0x6c,		/* Old Flags:  object, Oi2 */
/* 72 */	NdrFcLong( 0x0 ),	/* 0 */
/* 76 */	NdrFcShort( 0x5 ),	/* 5 */
/* 78 */	NdrFcShort( 0x18 ),	/* X64 Stack size/offset = 24 */
/* 80 */	NdrFcShort( 0x0 ),	/* 0 */
/* 82 */	NdrFcShort( 0x8 ),	/* 8 */
/* 84 */	0x45,		/* Oi2 Flags:  srv must size, has return, has ext, */
			0x2,		/* 2 */
/* 86 */	0xa,		/* 10 */
			0x1,		/* Ext Flags:  new corr desc, */
/* 88 */	NdrFcShort( 0x0 ),	/* 0 */
/* 90 */	NdrFcShort( 0x0 ),	/* 0 */
/* 92 */	NdrFcShort( 0x0 ),	/* 0 */
/* 94 */	NdrFcShort( 0x0 ),	/* 0 */

	/* Parameter ppszString */

/* 96 */	NdrFcShort( 0x2013 ),	/* Flags:  must size, must free, out, srv alloc size=8 */
/* 98 */	NdrFcShort( 0x8 ),	/* X64 Stack size/offset = 8 */
/* 100 */	NdrFcShort( 0x6 ),	/* Type Offset=6 */

	/* Return value */

/* 102 */	NdrFcShort( 0x70 ),	/* Flags:  out, return, base type, */
/* 104 */	NdrFcShort( 0x10 ),	/* X64 Stack size/offset = 16 */
/* 106 */	0x8,		/* FC_LONG */
			0x0,		/* 0 */

	/* Procedure PingToClientSize */

/* 108 */	0x33,		/* FC_AUTO_HANDLE */
			0x6c,		/* Old Flags:  object, Oi2 */
/* 110 */	NdrFcLong( 0x0 ),	/* 0 */
/* 114 */	NdrFcShort( 0x6 ),	/* 6 */
/* 116 */	NdrFcShort( 0x18 ),	/* X64 Stack size/offset = 24 */
/* 118 */	NdrFcShort( 0x8 ),	/* 8 */
/* 120 */	NdrFcShort( 0x8 ),	/* 8 */
/* 122 */	0x44,		/* Oi2 Flags:  has return, has ext, */
			0x2,		/* 2 */
/* 124 */	0xa,		/* 10 */
			0x1,		/* Ext Flags:  new corr desc, */
/* 126 */	NdrFcShort( 0x0 ),	/* 0 */
/* 128 */	NdrFcShort( 0x0 ),	/* 0 */
/* 130 */	NdrFcShort( 0x0 ),	/* 0 */
/* 132 */	NdrFcShort( 0x0 ),	/* 0 */

	/* Parameter cbOut */

/* 134 */	NdrFcShort( 0x48 ),	/* Flags:  in, base type, */
/* 136 */	NdrFcShort( 0x8 ),	/* X64 Stack size/offset = 8 */
/* 138 */	0x8,		/* FC_LONG */
			0x0,		/* 0 */

	/* Return value */

/* 140 */	NdrFcShort( 0x70 ),	/* Flags:  out, return, base type, */
/* 142 */	NdrFcShort( 0x10 ),	/* X64 Stack size/offset = 16 */
/* 144 */	0x8,		/* FC_LONG */
			0x0,		/* 0 */

			0x0
        }
    };

static const iping_MIDL_TYPE_FORMAT_STRING iping__MIDL_TypeFormatString =
    {
        0,
        {
			NdrFcShort( 0x0 ),	/* 0 */
/*  2 */	
			0x11, 0x8,	/* FC_RP [simple_pointer] */
/*  4 */	
			0x22,		/* FC_C_CSTRING */
			0x5c,		/* FC_PAD */
/*  6 */	
			0x11, 0x14,	/* FC_RP [alloced_on_stack] [pointer_deref] */
/*  8 */	NdrFcShort( 0x2 ),	/* Offset= 2 (10) */
/* 10 */	
			0x13, 0x8,	/* FC_OP [simple_pointer] */
/* 12 */	
			0x22,		/* FC_C_CSTRING */
			0x5c,		/* FC_PAD */

			0x0
        }
    };


/* Object interface: IUnknown, ver. 0.0,
   GUID={0x00000000,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IPing, ver. 0.0,
   GUID={0xdecdbeef,0xd1ac,0x11d1,{0x96,0xbc,0x00,0xaa,0x00,0x57,0x3f,0xb0}} */

#pragma code_seg(".orpc")
static const unsigned short IPing_FormatStringOffsetTable[] =
    {
    0,
    32,
    70,
    108
    };



#endif /* defined(_M_AMD64)*/



/* this ALWAYS GENERATED file contains the proxy stub code */


 /* File created by MIDL compiler version 8.01.0622 */
/* at Mon Jan 18 17:14:07 2038
 */
/* Compiler settings for iping.idl:
    Oicf, W1, Zp8, env=Win64 (32b run), target_arch=AMD64 8.01.0622 
    protocol : all , ms_ext, c_ext, robust
    error checks: allocation ref bounds_check enum stub_data 
    VC __declspec() decoration level: 
         __declspec(uuid()), __declspec(selectany), __declspec(novtable)
         DECLSPEC_UUID(), MIDL_INTERFACE()
*/
/* @@MIDL_FILE_HEADING(  ) */

#if defined(_M_AMD64)




#if !defined(__RPC_WIN64__)
#error  Invalid build platform for this stub.
#endif


#include "ndr64types.h"
#include "pshpack8.h"


typedef 
NDR64_FORMAT_CHAR
__midl_frag15_t;
extern const __midl_frag15_t __midl_frag15;

typedef 
struct 
{
    struct _NDR64_PROC_FORMAT frag1;
    struct _NDR64_PARAM_FORMAT frag2;
    struct _NDR64_PARAM_FORMAT frag3;
}
__midl_frag13_t;
extern const __midl_frag13_t __midl_frag13;

typedef 
struct _NDR64_CONFORMANT_STRING_FORMAT
__midl_frag11_t;
extern const __midl_frag11_t __midl_frag11;

typedef 
struct _NDR64_POINTER_FORMAT
__midl_frag10_t;
extern const __midl_frag10_t __midl_frag10;

typedef 
struct _NDR64_POINTER_FORMAT
__midl_frag9_t;
extern const __midl_frag9_t __midl_frag9;

typedef 
struct 
{
    struct _NDR64_PROC_FORMAT frag1;
    struct _NDR64_PARAM_FORMAT frag2;
    struct _NDR64_PARAM_FORMAT frag3;
}
__midl_frag8_t;
extern const __midl_frag8_t __midl_frag8;

typedef 
struct _NDR64_POINTER_FORMAT
__midl_frag5_t;
extern const __midl_frag5_t __midl_frag5;

typedef 
struct 
{
    struct _NDR64_PROC_FORMAT frag1;
    struct _NDR64_PARAM_FORMAT frag2;
    struct _NDR64_PARAM_FORMAT frag3;
}
__midl_frag4_t;
extern const __midl_frag4_t __midl_frag4;

typedef 
struct 
{
    struct _NDR64_PROC_FORMAT frag1;
    struct _NDR64_PARAM_FORMAT frag2;
}
__midl_frag2_t;
extern const __midl_frag2_t __midl_frag2;

typedef 
NDR64_FORMAT_UINT32
__midl_frag1_t;
extern const __midl_frag1_t __midl_frag1;

static const __midl_frag15_t __midl_frag15 =
0x5    /* FC64_INT32 */;

static const __midl_frag13_t __midl_frag13 =
{ 
/* PingToClientSize */
    { 
    /* PingToClientSize */      /* procedure PingToClientSize */
        (NDR64_UINT32) 524611 /* 0x80143 */,    /* auto handle */ /* IsIntrepreted, [object], HasReturn */
        (NDR64_UINT32) 24 /* 0x18 */ ,  /* Stack size */
        (NDR64_UINT32) 8 /* 0x8 */,
        (NDR64_UINT32) 8 /* 0x8 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 2 /* 0x2 */,
        (NDR64_UINT16) 0 /* 0x0 */
    },
    { 
    /* cbOut */      /* parameter cbOut */
        &__midl_frag15,
        { 
        /* cbOut */
            0,
            0,
            0,
            1,
            0,
            0,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* [in], Basetype, ByValue */
        (NDR64_UINT16) 0 /* 0x0 */,
        8 /* 0x8 */,   /* Stack offset */
    },
    { 
    /* HRESULT */      /* parameter HRESULT */
        &__midl_frag15,
        { 
        /* HRESULT */
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* [out], IsReturn, Basetype, ByValue */
        (NDR64_UINT16) 0 /* 0x0 */,
        16 /* 0x10 */,   /* Stack offset */
    }
};

static const __midl_frag11_t __midl_frag11 =
{ 
/* *CHAR */
    { 
    /* *CHAR */
        0x63,    /* FC64_CONF_CHAR_STRING */
        { 
        /* *CHAR */
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
        },
        (NDR64_UINT16) 1 /* 0x1 */
    }
};

static const __midl_frag10_t __midl_frag10 =
{ 
/* *CHAR */
    0x22,    /* FC64_OP */
    (NDR64_UINT8) 0 /* 0x0 */,
    (NDR64_UINT16) 0 /* 0x0 */,
    &__midl_frag11
};

static const __midl_frag9_t __midl_frag9 =
{ 
/* **CHAR */
    0x20,    /* FC64_RP */
    (NDR64_UINT8) 20 /* 0x14 */,
    (NDR64_UINT16) 0 /* 0x0 */,
    &__midl_frag10
};

static const __midl_frag8_t __midl_frag8 =
{ 
/* PingToClient */
    { 
    /* PingToClient */      /* procedure PingToClient */
        (NDR64_UINT32) 655683 /* 0xa0143 */,    /* auto handle */ /* IsIntrepreted, [object], ServerMustSize, HasReturn */
        (NDR64_UINT32) 24 /* 0x18 */ ,  /* Stack size */
        (NDR64_UINT32) 0 /* 0x0 */,
        (NDR64_UINT32) 8 /* 0x8 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 2 /* 0x2 */,
        (NDR64_UINT16) 0 /* 0x0 */
    },
    { 
    /* ppszString */      /* parameter ppszString */
        &__midl_frag9,
        { 
        /* ppszString */
            1,
            1,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            1
        },    /* MustSize, MustFree, [out], UseCache */
        (NDR64_UINT16) 0 /* 0x0 */,
        8 /* 0x8 */,   /* Stack offset */
    },
    { 
    /* HRESULT */      /* parameter HRESULT */
        &__midl_frag15,
        { 
        /* HRESULT */
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* [out], IsReturn, Basetype, ByValue */
        (NDR64_UINT16) 0 /* 0x0 */,
        16 /* 0x10 */,   /* Stack offset */
    }
};

static const __midl_frag5_t __midl_frag5 =
{ 
/* *CHAR */
    0x20,    /* FC64_RP */
    (NDR64_UINT8) 0 /* 0x0 */,
    (NDR64_UINT16) 0 /* 0x0 */,
    &__midl_frag11
};

static const __midl_frag4_t __midl_frag4 =
{ 
/* PingToServer */
    { 
    /* PingToServer */      /* procedure PingToServer */
        (NDR64_UINT32) 786755 /* 0xc0143 */,    /* auto handle */ /* IsIntrepreted, [object], ClientMustSize, HasReturn */
        (NDR64_UINT32) 24 /* 0x18 */ ,  /* Stack size */
        (NDR64_UINT32) 0 /* 0x0 */,
        (NDR64_UINT32) 8 /* 0x8 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 2 /* 0x2 */,
        (NDR64_UINT16) 0 /* 0x0 */
    },
    { 
    /* pszString */      /* parameter pszString */
        &__midl_frag11,
        { 
        /* pszString */
            1,
            1,
            0,
            1,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* MustSize, MustFree, [in], SimpleRef */
        (NDR64_UINT16) 0 /* 0x0 */,
        8 /* 0x8 */,   /* Stack offset */
    },
    { 
    /* HRESULT */      /* parameter HRESULT */
        &__midl_frag15,
        { 
        /* HRESULT */
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* [out], IsReturn, Basetype, ByValue */
        (NDR64_UINT16) 0 /* 0x0 */,
        16 /* 0x10 */,   /* Stack offset */
    }
};

static const __midl_frag2_t __midl_frag2 =
{ 
/* Ping */
    { 
    /* Ping */      /* procedure Ping */
        (NDR64_UINT32) 524611 /* 0x80143 */,    /* auto handle */ /* IsIntrepreted, [object], HasReturn */
        (NDR64_UINT32) 16 /* 0x10 */ ,  /* Stack size */
        (NDR64_UINT32) 0 /* 0x0 */,
        (NDR64_UINT32) 8 /* 0x8 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 0 /* 0x0 */,
        (NDR64_UINT16) 1 /* 0x1 */,
        (NDR64_UINT16) 0 /* 0x0 */
    },
    { 
    /* HRESULT */      /* parameter HRESULT */
        &__midl_frag15,
        { 
        /* HRESULT */
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            (NDR64_UINT16) 0 /* 0x0 */,
            0
        },    /* [out], IsReturn, Basetype, ByValue */
        (NDR64_UINT16) 0 /* 0x0 */,
        8 /* 0x8 */,   /* Stack offset */
    }
};

static const __midl_frag1_t __midl_frag1 =
(NDR64_UINT32) 0 /* 0x0 */;


#include "poppack.h"



/* Object interface: IUnknown, ver. 0.0,
   GUID={0x00000000,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IPing, ver. 0.0,
   GUID={0xdecdbeef,0xd1ac,0x11d1,{0x96,0xbc,0x00,0xaa,0x00,0x57,0x3f,0xb0}} */

#pragma code_seg(".orpc")
static const FormatInfoRef IPing_Ndr64ProcTable[] =
    {
    &__midl_frag2,
    &__midl_frag4,
    &__midl_frag8,
    &__midl_frag13
    };


static const MIDL_SYNTAX_INFO IPing_SyntaxInfo [  2 ] = 
    {
    {
    {{0x8A885D04,0x1CEB,0x11C9,{0x9F,0xE8,0x08,0x00,0x2B,0x10,0x48,0x60}},{2,0}},
    0,
    iping__MIDL_ProcFormatString.Format,
    &IPing_FormatStringOffsetTable[-3],
    iping__MIDL_TypeFormatString.Format,
    0,
    0,
    0
    }
    ,{
    {{0x71710533,0xbeba,0x4937,{0x83,0x19,0xb5,0xdb,0xef,0x9c,0xcc,0x36}},{1,0}},
    0,
    0 ,
    (unsigned short *) &IPing_Ndr64ProcTable[-3],
    0,
    0,
    0,
    0
    }
    };

static const MIDL_STUBLESS_PROXY_INFO IPing_ProxyInfo =
    {
    &Object_StubDesc,
    iping__MIDL_ProcFormatString.Format,
    &IPing_FormatStringOffsetTable[-3],
    (RPC_SYNTAX_IDENTIFIER*)&_RpcTransferSyntax,
    2,
    (MIDL_SYNTAX_INFO*)IPing_SyntaxInfo
    
    };


static const MIDL_SERVER_INFO IPing_ServerInfo = 
    {
    &Object_StubDesc,
    0,
    iping__MIDL_ProcFormatString.Format,
    (unsigned short *) &IPing_FormatStringOffsetTable[-3],
    0,
    (RPC_SYNTAX_IDENTIFIER*)&_NDR64_RpcTransferSyntax,
    2,
    (MIDL_SYNTAX_INFO*)IPing_SyntaxInfo
    };
CINTERFACE_PROXY_VTABLE(7) _IPingProxyVtbl = 
{
    &IPing_ProxyInfo,
    &IID_IPing,
    IUnknown_QueryInterface_Proxy,
    IUnknown_AddRef_Proxy,
    IUnknown_Release_Proxy ,
    (void *) (INT_PTR) -1 /* IPing::Ping */ ,
    (void *) (INT_PTR) -1 /* IPing::PingToServer */ ,
    (void *) (INT_PTR) -1 /* IPing::PingToClient */ ,
    (void *) (INT_PTR) -1 /* IPing::PingToClientSize */
};

const CInterfaceStubVtbl _IPingStubVtbl =
{
    &IID_IPing,
    &IPing_ServerInfo,
    7,
    0, /* pure interpreted */
    CStdStubBuffer_METHODS
};

static const MIDL_STUB_DESC Object_StubDesc = 
    {
    0,
    NdrOleAllocate,
    NdrOleFree,
    0,
    0,
    0,
    0,
    0,
    iping__MIDL_TypeFormatString.Format,
    1, /* -error bounds_check flag */
    0x60001, /* Ndr library version */
    0,
    0x801026e, /* MIDL Version 8.1.622 */
    0,
    0,
    0,  /* notify & notify_flag routine table */
    0x2000001, /* MIDL flag */
    0, /* cs routines */
    0,   /* proxy/server info */
    0
    };

const CInterfaceProxyVtbl * const _iping_ProxyVtblList[] = 
{
    ( CInterfaceProxyVtbl *) &_IPingProxyVtbl,
    0
};

const CInterfaceStubVtbl * const _iping_StubVtblList[] = 
{
    ( CInterfaceStubVtbl *) &_IPingStubVtbl,
    0
};

PCInterfaceName const _iping_InterfaceNamesList[] = 
{
    "IPing",
    0
};


#define _iping_CHECK_IID(n)	IID_GENERIC_CHECK_IID( _iping, pIID, n)

int __stdcall _iping_IID_Lookup( const IID * pIID, int * pIndex )
{
    
    if(!_iping_CHECK_IID(0))
        {
        *pIndex = 0;
        return 1;
        }

    return 0;
}

const ExtendedProxyFileInfo iping_ProxyFileInfo = 
{
    (PCInterfaceProxyVtblList *) & _iping_ProxyVtblList,
    (PCInterfaceStubVtblList *) & _iping_StubVtblList,
    (const PCInterfaceName * ) & _iping_InterfaceNamesList,
    0, /* no delegation */
    & _iping_IID_Lookup, 
    1,
    2,
    0, /* table of [async_uuid] interfaces */
    0, /* Filler1 */
    0, /* Filler2 */
    0  /* Filler3 */
};
#if _MSC_VER >= 1200
#pragma warning(pop)
#endif


#endif /* defined(_M_AMD64)*/

