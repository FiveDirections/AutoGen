/*
 [The "BSD licence"]
 Copyright (c) 2013 Sam Harwell
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
	notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
	notice, this list of conditions and the following disclaimer in the
	documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
	derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** C 2011 grammar built from the C11 Spec */

/* 
	2019-10-25	Brian K Catlin 
	Modified to add support for Microsoft Structured Annotation Language (SAL) 
*/

grammar C;

primaryExpression
	:   Identifier
	|   Constant
	|   StringLiteral+
	|   '(' expression ')'
	|   genericSelection
	|   '__extension__'? '(' compoundStatement ')' // Blocks (GCC extension)
	|   '__builtin_va_arg' '(' unaryExpression ',' typeName ')'
	|   '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
	;

genericSelection
	:   '_Generic' '(' assignmentExpression ',' genericAssocList ')'
	;

genericAssocList
	:   genericAssociation
	|   genericAssocList ',' genericAssociation
	;

genericAssociation
	:   typeName ':' assignmentExpression
	|   'default' ':' assignmentExpression
	;

postfixExpression
	:   primaryExpression
	|   postfixExpression '[' expression ']'
	|   postfixExpression '(' argumentExpressionList? ')'
	|   postfixExpression '.' Identifier
	|   postfixExpression '->' Identifier
	|   postfixExpression '++'
	|   postfixExpression '--'
	|   '(' typeName ')' '{' initializerList '}'
	|   '(' typeName ')' '{' initializerList ',' '}'
	|   '__extension__' '(' typeName ')' '{' initializerList '}'
	|   '__extension__' '(' typeName ')' '{' initializerList ',' '}'
	;

argumentExpressionList
	:   assignmentExpression
	|   argumentExpressionList ',' assignmentExpression
	;

unaryExpression
	:   postfixExpression
	|   '++' unaryExpression
	|   '--' unaryExpression
	|   unaryOperator castExpression
	|   'sizeof' unaryExpression
	|   'sizeof' '(' typeName ')'
	|   '_Alignof' '(' typeName ')'
	|   '&&' Identifier // GCC extension address of label
	;

unaryOperator
	:   '&' | '*' | '+' | '-' | '~' | '!'
	;

castExpression
	:   '(' typeName ')' castExpression
	|   '__extension__' '(' typeName ')' castExpression
	|   unaryExpression
	|   DigitSequence // for
	;

multiplicativeExpression
	:   castExpression
	|   multiplicativeExpression '*' castExpression
	|   multiplicativeExpression '/' castExpression
	|   multiplicativeExpression '%' castExpression
	;

additiveExpression
	:   multiplicativeExpression
	|   additiveExpression '+' multiplicativeExpression
	|   additiveExpression '-' multiplicativeExpression
	;

shiftExpression
	:   additiveExpression
	|   shiftExpression '<<' additiveExpression
	|   shiftExpression '>>' additiveExpression
	;

relationalExpression
	:   shiftExpression
	|   relationalExpression '<' shiftExpression
	|   relationalExpression '>' shiftExpression
	|   relationalExpression '<=' shiftExpression
	|   relationalExpression '>=' shiftExpression
	;

equalityExpression
	:   relationalExpression
	|   equalityExpression '==' relationalExpression
	|   equalityExpression '!=' relationalExpression
	;

andExpression
	:   equalityExpression
	|   andExpression '&' equalityExpression
	;

exclusiveOrExpression
	:   andExpression
	|   exclusiveOrExpression '^' andExpression
	;

inclusiveOrExpression
	:   exclusiveOrExpression
	|   inclusiveOrExpression '|' exclusiveOrExpression
	;

logicalAndExpression
	:   inclusiveOrExpression
	|   logicalAndExpression '&&' inclusiveOrExpression
	;

logicalOrExpression
	:   logicalAndExpression
	|   logicalOrExpression '||' logicalAndExpression
	;

conditionalExpression
	:   logicalOrExpression ('?' expression ':' conditionalExpression)?
	;

assignmentExpression
	:   conditionalExpression
	|   unaryExpression assignmentOperator assignmentExpression
	|   DigitSequence // for
	;

assignmentOperator
	:   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
	;

expression
	:   assignmentExpression
	|   expression ',' assignmentExpression
	;

constantExpression
	:   conditionalExpression
	;

declaration
	:   declarationSpecifiers initDeclaratorList ';'
	| 	declarationSpecifiers ';'
	|   staticAssertDeclaration
	;

declarationSpecifiers
	:   declarationSpecifier+
	;

declarationSpecifiers2
	:   declarationSpecifier+
	;

declarationSpecifier
	:   sal_statement									// BKC
	|	storageClassSpecifier
	|   typeSpecifier
	|   typeQualifier
	|   functionSpecifier
	|   alignmentSpecifier
	;

initDeclaratorList
	:   initDeclarator
	|   initDeclaratorList ',' initDeclarator
	;

initDeclarator
	:   declarator
	|   declarator '=' initializer
	;

storageClassSpecifier
	:   'typedef'
	|   'extern'
	|   'static'
	|   '_Thread_local'
	|   'auto'
	|   'register'
	|	microsoft_storage								// BKC
	;

typeSpecifier
	:   ('void'
	|   'char'
	|   'short'
	|   'int'
	|   'long'
	|   'float'
	|   'double'
	|   'signed'
	|   'unsigned'
	|   '_Bool'
	|   '_Complex'
	|	microsoft_types									// BKC
	|   '__m128'
	|   '__m128d'
	|   '__m128i')
	|   '__extension__' '(' ('__m128' | '__m128d' | '__m128i') ')'
	|   atomicTypeSpecifier
	|   structOrUnionSpecifier
	|   enumSpecifier
	|   typedefName
	|   '__typeof__' '(' constantExpression ')' // GCC extension
//	|	microsoft_types	('[' ']')?						// BKC
	|   typeSpecifier pointer
	;

microsoft_types :										// BKC
	    'ATOM'											// BKC
	|   'AtlThunkData_t'								// BKC
	|   'BOOL'											// BKC
	|   'BOOLAPI'										// BKC
	|   'BOOLEAN'										// BKC
	|   'BSTR'											// BKC
	|   'BYTE'											// BKC
	|   'CHAR'											// BKC
	|   'CLIENT_CALL_RETURN'							// BKC
	|   'COLORREF'										// BKC
	|   'CONFIGRET'										// BKC
	|   'COORD'											// BKC
	|   'DEP_SYSTEM_POLICY_TYPE'						// BKC
	|   'DEVICE_SCALE_FACTOR'							// BKC
	|   'DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS'			// BKC
	|   'DIALOG_DPI_CHANGE_BEHAVIORS'					// BKC
	|   'DLL_DIRECTORY_COOKIE'							// BKC
	|   'DOUBLE'										// BKC
	|   'DPI_AWARENESS'									// BKC
	|   'DPI_AWARENESS_CONTEXT'							// BKC
	|   'DPI_HOSTING_BEHAVIOR'							// BKC
	|   'DWMAPI'										// BKC
	|   'DWORD'											// BKC
	|   'EXECUTION_STATE'								// BKC
	|   'FD_GLYPHSET'									// BKC
	|   'FILE'											// BKC
	|   'FOURCC'										// BKC
	|   'GEOID'											// BKC
	|   'HACCEL'										// BKC
	|   'HANDLE'										// BKC
	|   'HBITMAP'										// BKC
	|   'HBRUSH'										// BKC
	|   'HCERTSTORE'									// BKC
	|   'HCERT_SERVER_OCSP_RESPONSE'					// BKC
	|   'HCOLORSPACE'									// BKC
	|   'HCONV'											// BKC
	|   'HCONVLIST'										// BKC
	|   'HCRYPTMSG'										// BKC
	|   'HCRYPTOIDFUNCSET'								// BKC
	|   'HCURSOR'										// BKC
	|   'HDC'											// BKC
	|   'HDDEDATA'										// BKC
	|   'HDESK'											// BKC
	|   'HDEVNOTIFY'									// BKC
	|   'HDPA'											// BKC
	|   'HDRVR'											// BKC
	|   'HDSA'											// BKC
	|   'HDWP'											// BKC
	|   'HENHMETAFILE'									// BKC
	|   'HFILE'											// BKC
	|   'HFONT'											// BKC
	|   'HGDIOBJ'										// BKC
	|   'HGLOBAL'										// BKC
	|	'HHOOK'											// BKC
	|   'HICON'											// BKC
	|   'HIMAGELIST'									// BKC
	|   'HIMC'											// BKC
	|   'HINSTANCE'										// BKC
	|   'HKL'											// BKC
	|   'HLOCAL'										// BKC
	|   'HMENU'											// BKC
	|   'HMETAFILE'										// BKC
	|   'HMMIO'											// BKC
	|   'HMODULE'										// BKC
	|   'HMONITOR'										// BKC
	|   'HPALETTE'										// BKC
	|   'HPEN'											// BKC
	|   'HPOWERNOTIFY'									// BKC
	|   'HPROPSHEETPAGE'								// BKC
	|   'HRESULT'										// BKC
	|   'HRGN'											// BKC
	|   'HRSRC'											// BKC
	|   'HSEMAPHORE'									// BKC
	|   'HSURF'											// BKC
	|   'HSYNTHETICPOINTERDEVICE'						// BKC
	|   'HSZ'											// BKC
	|   'HWCT'											// BKC
	|   'HWINEVENTHOOK'									// BKC
	|   'HWINSTA'										// BKC
	|   'HWINSTA'										// BKC
	|   'HWND'											// BKC
	|   'IContextMenu'									// BKC
	|   'IFIMETRICS'									// BKC
	|   'INT'											// BKC
	|   'INT_PTR'										// BKC
	|   'IStream'										// BKC
	|   'LANGID'										// BKC
	|   'LARGE_INTEGER'									// BKC
	|   'LCID'											// BKC
	|   'LONG'											// BKC
	|   'LONG64'										// BKC
	|   'LONGLONG'										// BKC
	|	'LONG_PTR'										// BKC
	|   'LPARAM'										// BKC
	|   'LPBYTE'										// BKC
	|   'LPCCH'											// BKC
	|   'LPCH'											// BKC
	|   'LPCSTR'										// BKC
	|   'LPCUWCHAR'										// BKC
	|   'LPCUWSTR'										// BKC
	|   'LPCWCH'										// BKC
	|   'LPCWSTR'										// BKC
	|   'LPMMIOPROC'									// BKC
	|   'LPSTR'											// BKC
	|   'LPUWSTR'										// BKC
	|   'LPVOID'										// BKC
	|   'LPWCH'											// BKC
	|   'LPWSTR'										// BKC
	|   'LRESULT'										// BKC
	|   'LRESULT'										// BKC
	|   'LWSTDAPI'										// BKC
	|   'LWSTDAPIV'										// BKC
	|   'LWSTDAPIV'										// BKC
	|   'MCIDEVICEID'									// BKC
	|   'MMRESULT'										// BKC
	|   'NDR_SCONTEXT'									// BKC
	|   'NET_API_STATUS'								// BKC
	|   'NPSTR'											// BKC
	|   'NTSTATUS'										// BKC
	|   'NWPSTR'										// BKC
	|   'OLESTATUS'										// BKC
	|   'PATHOBJ'										// BKC
	|   'PCCERT_CHAIN_CONTEXT'							// BKC
	|   'PCCERT_CONTEXT'								// BKC
	|   'PCCERT_SERVER_OCSP'							// BKC
	|   'PCCH'											// BKC
	|   'PCCTL_CONTEXT'									// BKC
	|   'PCERT_EXTENSION'								// BKC
	|   'PCERT_RDN_ATTR'								// BKC
	|   'PCH'											// BKC
	|   'PCHAR'											// BKC
	|   'PCNZCH'										// BKC
	|   'PCNZWCH'										// BKC
	|   'PCRYPT_ATTRIBUTE'								// BKC
	|   'PCSTR'											// BKC
	|   'PCTL_ENTRY'									// BKC
	|   'PCTSTR'										// BKC
	|   'PCUNZWCH'										// BKC
	|   'PCUWCHAR'										// BKC
	|   'PCUWSTR'										// BKC
	|   'PCUZZWSTR'										// BKC
	|   'PCWCH'											// BKC
	|   'PCWCHAR'										// BKC
	|   'PCZPCSTR'										// BKC
	|   'PCZPCWSTR'										// BKC
	|   'PCZPSTR'										// BKC
	|   'PCZPWSTR'										// BKC
	|   'PCZZSTR'										// BKC
	|   'PCZZWSTR'										// BKC
	|   'PDH_FUNCTION'									// BKC
	|   'PFD_GLYPHATTR'									// BKC
	|   'PIDLIST_ABSOLUTE'								// BKC
	|   'PIDLIST_RELATIVE'								// BKC
	|   'PITEMID_CHILD'									// BKC
	|   'PNZCH'											// BKC
	|   'PNZWCH'										// BKC
	|   'POWER_PLATFORM_ROLE'							// BKC
	|   'PPERF_COUNTERSET_INSTANCE'						// BKC
	|   'PRTL_SPLAY_LINKS'								// BKC
	|   'PRTL_UNLOAD_EVENT_TRACE'						// BKC
	|   'PRUNTIME_FUNCTION'								// BKC
	|   'PSID_IDENTIFIER_AUTHORITY'						// BKC
	|   'PSLIST_ENTRY'									// BKC
	|   'PSSTDAPI'										// BKC
	|   'PSTR'											// BKC
	|   'PTP_CLEANUP_GROUP'								// BKC
	|   'PTP_IO'										// BKC
	|   'PTP_POOL'										// BKC
	|   'PTP_TIMER'										// BKC
	|   'PTP_WAIT'										// BKC
	|   'PTP_WORK'										// BKC
	|   'PUIDLIST_RELATIVE'								// BKC
	|   'PUNZWCH'										// BKC
	|   'PUWSTR'										// BKC
	|   'PUZZWSTR'										// BKC
	|   'PVOID'											// BKC
	|   'PWCH'											// BKC
	|   'PWCHAR'										// BKC
	|   'PWSTR'											// BKC
	|   'PZPCSTR'										// BKC
	|   'PZPCWSTR'										// BKC
	|   'PZPSTR'										// BKC
	|   'PZPWSTR'										// BKC
	|   'PZZSTR'										// BKC
	|   'PZZWSTR'										// BKC
	|   'RPC_STATUS'									// BKC
	|   'SAFEARRAY'										// BKC
	|   'SCRIPT_LOGATTR'								// BKC
	|   'SC_HANDLE'										// BKC
	|   'SECURITY_STATUS'								// BKC
	|   'SHORT'											// BKC
	|   'SHSTDAPI'										// BKC
	|   'SIZE'											// BKC
	|   'SIZE_T'										// BKC
	|   'SOCKET'										// BKC
	|   'SURFOBJ'										// BKC
	|   'THEMEAPI'										// BKC
	|   'TRACEHANDLE'									// BKC
	|   'TRUSTEE_FORM'									// BKC
	|   'TRUSTEE_TYPE'									// BKC
	|   'UCHAR'											// BKC
	|   'UINT'											// BKC
	|   'UINT_PTR'										// BKC
	|   'ULONG'											// BKC
	|   'ULONG64'										// BKC
	|   'ULONGLONG'										// BKC
	|	'ULONG_PTR'										// BKC
	|   'USHORT'										// BKC
	|   'VOID'											// BKC
	|   'WINOLECTLAPI'									// BKC
	|   'WINPATHCCHAPI'									// BKC
	|   'WORD'											// BKC
	|   'XFORMOBJ'										// BKC
	|   'YIELDPROC'										// BKC
	|   '_Dcomplex'										// BKC
	|   'clock_t'										// BKC
	|   'div_t'											// BKC
	|   'errno_t'										// BKC
	|   'hostent'										// BKC
	|   'imaxdiv_t'										// BKC
	|   'intmax_t'										// BKC
	|   'protoent'										// BKC
	|   'servent'										// BKC
	|   'size_t'										// BKC
	|   'terminate_function'							// BKC
	|   'time_t'										// BKC
	|   'u_long'										// BKC
	|   'u_short'										// BKC
	|   'wchar_t'										// BKC
	|   'wctrans_t'										// BKC
	|   'wctype_t'										// BKC
	|   'wint_t'										// BKC
//	|	Identifier
//	|	('const')? Identifier ('*')? ('const')?
	;

structOrUnionSpecifier
	:   structOrUnion Identifier? '{' structDeclarationList '}'
	|   structOrUnion Identifier
	;

structOrUnion
	:   'struct'
	|   'union'
	;

structDeclarationList
	:   structDeclaration
	|   structDeclarationList structDeclaration
	;

structDeclaration
	:   specifierQualifierList structDeclaratorList? ';'
	|   staticAssertDeclaration
	;

specifierQualifierList
	:   typeSpecifier specifierQualifierList?
	|   typeQualifier specifierQualifierList?
	;

structDeclaratorList
	:   structDeclarator
	|   structDeclaratorList ',' structDeclarator
	;

structDeclarator
	:   declarator
	|   declarator? ':' constantExpression
	;

enumSpecifier
	:   'enum' Identifier? '{' enumeratorList '}'
	|   'enum' Identifier? '{' enumeratorList ',' '}'
	|   'enum' Identifier
	;

enumeratorList
	:   enumerator
	|   enumeratorList ',' enumerator
	;

enumerator
	:   enumerationConstant
	|   enumerationConstant '=' constantExpression
	;

enumerationConstant
	:   Identifier
	;

atomicTypeSpecifier
	:   '_Atomic' '(' typeName ')'
	;

typeQualifier
	:   'const'
	|   'restrict'
	|   'volatile'
	|   '_Atomic'
	|	microsoft_storage									// BKC
	;

functionSpecifier
	:   ('inline'
	|   '_Noreturn'
	|   '__inline__' // GCC extension
	|   '__stdcall')
	|   gccAttributeSpecifier
	|   '__declspec' '(' Identifier ')'
	;

alignmentSpecifier
	:   '_Alignas' '(' typeName ')'
	|   '_Alignas' '(' constantExpression ')'
	;

declarator
	:   pointer? directDeclarator gccDeclaratorExtension*
	;

directDeclarator
	:   Identifier
	|   '(' declarator ')'
	|   directDeclarator '[' typeQualifierList? assignmentExpression? ']'
	|   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
	|   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
	|   directDeclarator '[' typeQualifierList? '*' ']'
	|   directDeclarator '(' parameterTypeList ')'
	|   directDeclarator '(' identifierList? ')'
	|   Identifier ':' DigitSequence  // bit field
	|   '(' typeSpecifier? pointer directDeclarator ')' // function pointer like: (__cdecl *f)
	;

gccDeclaratorExtension
	:   '__asm' '(' StringLiteral+ ')'
	|   gccAttributeSpecifier
	;

gccAttributeSpecifier
	:   '__attribute__' '(' '(' gccAttributeList ')' ')'
	;

gccAttributeList
	:   gccAttribute (',' gccAttribute)*
	|   // empty
	;

gccAttribute
	:   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
		('(' argumentExpressionList? ')')?
	|   // empty
	;

nestedParenthesesBlock
	:   (   ~('(' | ')')
		|   '(' nestedParenthesesBlock ')'
		)*
	;

pointer
	:   '*' typeQualifierList?
	|   '*' typeQualifierList? pointer
	|   '^' typeQualifierList? // Blocks language extension
	|   '^' typeQualifierList? pointer // Blocks language extension
	;

typeQualifierList
	:   typeQualifier
	|   typeQualifierList typeQualifier
	;

parameterTypeList
	:   parameterList
	|   parameterList ',' '...'	
	;

parameterList
	:   parameterDeclaration
	|   parameterList ',' parameterDeclaration
	;

parameterDeclaration
	:   declarationSpecifiers declarator
	|   declarationSpecifiers2 abstractDeclarator?
	;

identifierList
	:   Identifier
	|   identifierList ',' Identifier
	;

typeName
	:   specifierQualifierList abstractDeclarator?
	;

abstractDeclarator
	:   pointer
	|   pointer? directAbstractDeclarator gccDeclaratorExtension*
	;

directAbstractDeclarator
	:   '(' abstractDeclarator ')' gccDeclaratorExtension*
	|   '[' typeQualifierList? assignmentExpression? ']'
	|   '[' 'static' typeQualifierList? assignmentExpression ']'
	|   '[' typeQualifierList 'static' assignmentExpression ']'
	|   '[' '*' ']'
	|   '(' parameterTypeList? ')' gccDeclaratorExtension*
	|   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
	|   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
	|   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
	|   directAbstractDeclarator '[' '*' ']'
	|   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
	;

typedefName
	:   Identifier
	;

initializer
	:   assignmentExpression
	|   '{' initializerList '}'
	|   '{' initializerList ',' '}'
	;

initializerList
	:   designation? initializer
	|   initializerList ',' designation? initializer
	;

designation
	:   designatorList '='
	;

designatorList
	:   designator
	|   designatorList designator
	;

designator
	:   '[' constantExpression ']'
	|   '.' Identifier
	;

staticAssertDeclaration
	:   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
	;

statement
	:   labeledStatement
	|   compoundStatement
	|   expressionStatement
	|   selectionStatement
	|   iterationStatement
	|   jumpStatement
	|   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
	;

labeledStatement
	:   Identifier ':' statement
	|   'case' constantExpression ':' statement
	|   'default' ':' statement
	;

compoundStatement
	:   '{' blockItemList? '}'
	;

blockItemList
	:   blockItem
	|   blockItemList blockItem
	;

blockItem
	:   statement
	|   declaration
	;

expressionStatement
	:   expression? ';'
	;

selectionStatement
	:   'if' '(' expression ')' statement ('else' statement)?
	|   'switch' '(' expression ')' statement
	;

iterationStatement
	:   While '(' expression ')' statement
	|   Do statement While '(' expression ')' ';'
	|   For '(' forCondition ')' statement
	;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
	:   declarationSpecifiers initDeclaratorList
	| 	declarationSpecifiers
	;

forExpression
	:   assignmentExpression
	|   forExpression ',' assignmentExpression
	;

jumpStatement
	:   'goto' Identifier ';'
	|   'continue' ';'
	|   'break' ';'
	|   'return' expression? ';'
	|   'goto' unaryExpression ';' // GCC extension
	;

compilationUnit
	:   translationUnit? EOF
	;

translationUnit
	:   externalDeclaration
	|   translationUnit externalDeclaration
	;

externalDeclaration
	:   functionDefinition
	|   declaration
	|   ';' // stray ;
	;

functionDefinition
	:   declarationSpecifiers? declarator declarationList? compoundStatement
	;

declarationList
	:   declaration
	|   declarationList declaration
	;



sal_statement :
		SAL_NAME sal_expr?
	|	'__in'
	|	'__in_opt'
	|	'__in_ecount_opt' sal_expr?
	|	'__out_validated' sal_expr?
	|	'__analysis_noreturn'
	|	'__kernel_entry'
	;

sal_expr :
				'(' ( ~( '(' | ')' ) | sal_expr )* ')'		// We don't care about anything within a SAL expression, so eat everything within matched and nested parentheses
				;

microsoft_storage :										// BKC
		decl_spec
	|	extern_c
	|	'APIENTRY'
	|	'CALLBACK'
	|	'CMAPI'
	|	'CREDUIAPI'
	|	'DECLSPEC_ALLOCATOR'
	|	'DSGETDCAPI'
	|	'ENGAPI'
	|	'ETW_APP_DECLSPEC_DEPRECATED'
	|	'EVNTAPI'
	|	'FAR'
	|	'KSDDKAPI'
	|	'KSECDDDECLSPEC'
	|	'NET_API_FUNCTION'
	|	'NTAPI'
	|	'NTDSAPI_POSTXP'
	|	'NT_RTL_COMPRESS_API'
	|	'NTSYSAPI'
	|	'NTSYSCALLAPI'
	|	'PASCAL'
	|	'RPC_VAR_ENTRY'
	|	'SEC_ENTRY'
	|	'STDCALL'
	|	'STDMETHODCALLTYPE'
	|	'USERENVAPI'
	|	'WINAPI'
	|	'WINBASE'
	|	'WINBASEAPI'
	|	'WINPATHCCHAPI'
	|	'WINSETUPAPI'
	|	'WMIAPI'
	|	'WSAAPI'
	|	'WSPAPI'
	|	'__cdecl'
	|	'__stdcall'
	;

decl_spec :												// BKC
	'__declspec' '(' Identifier ')'
	;

extern_c :												// BKC
	'extern' '"C"'
	;

Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
If : 'if';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';

Alignas : '_Alignas';
Alignof : '_Alignof';
Atomic : '_Atomic';
Bool : '_Bool';
Complex : '_Complex';
Generic : '_Generic';
Imaginary : '_Imaginary';
Noreturn : '_Noreturn';
StaticAssert : '_Static_assert';
ThreadLocal : '_Thread_local';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
Ellipsis : '...';

SAL_NAME :			'_' Capital (Letter | '_')+ '_';			// This is a subset of IDENTIFIER, so it must be first

Identifier
	:   IdentifierNondigit
		(   IdentifierNondigit
		|   Digit
		)*
	;

fragment
IdentifierNondigit
	:   Nondigit
	|   UniversalCharacterName
	//|   // other implementation-defined characters...
	;

fragment Capital :	[A-Z];							// BKC 

fragment
Nondigit
	:   [a-zA-Z_]
	;

fragment
Digit
	:   [0-9]
	;

fragment Letter :	[a-zA-Z];						// BKC 

fragment
UniversalCharacterName
	:   '\\u' HexQuad
	|   '\\U' HexQuad HexQuad
	;

fragment
HexQuad
	:   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
	;

Constant
	:   IntegerConstant
	|   FloatingConstant
	//|   EnumerationConstant
	|   CharacterConstant
	;

fragment
IntegerConstant
	:   DecimalConstant IntegerSuffix?
	|   OctalConstant IntegerSuffix?
	|   HexadecimalConstant IntegerSuffix?
	|	BinaryConstant
	;

fragment
BinaryConstant
	:	'0' [bB] [0-1]+
	;

fragment
DecimalConstant
	:   NonzeroDigit Digit*
	;

fragment
OctalConstant
	:   '0' OctalDigit*
	;

fragment
HexadecimalConstant
	:   HexadecimalPrefix HexadecimalDigit+
	;

fragment
HexadecimalPrefix
	:   '0' [xX]
	;

fragment
NonzeroDigit
	:   [1-9]
	;

fragment
OctalDigit
	:   [0-7]
	;

fragment
HexadecimalDigit
	:   [0-9a-fA-F]
	;

fragment
IntegerSuffix
	:   UnsignedSuffix LongSuffix?
	|   UnsignedSuffix LongLongSuffix
	|   LongSuffix UnsignedSuffix?
	|   LongLongSuffix UnsignedSuffix?
	;

fragment
UnsignedSuffix
	:   [uU]
	;

fragment
LongSuffix
	:   [lL]
	;

fragment
LongLongSuffix
	:   'll' | 'LL'
	;

fragment
FloatingConstant
	:   DecimalFloatingConstant
	|   HexadecimalFloatingConstant
	;

fragment
DecimalFloatingConstant
	:   FractionalConstant ExponentPart? FloatingSuffix?
	|   DigitSequence ExponentPart FloatingSuffix?
	;

fragment
HexadecimalFloatingConstant
	:   HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
	|   HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
	;

fragment
FractionalConstant
	:   DigitSequence? '.' DigitSequence
	|   DigitSequence '.'
	;

fragment
ExponentPart
	:   'e' Sign? DigitSequence
	|   'E' Sign? DigitSequence
	;

fragment
Sign
	:   '+' | '-'
	;

DigitSequence
	:   Digit+
	;

fragment
HexadecimalFractionalConstant
	:   HexadecimalDigitSequence? '.' HexadecimalDigitSequence
	|   HexadecimalDigitSequence '.'
	;

fragment
BinaryExponentPart
	:   'p' Sign? DigitSequence
	|   'P' Sign? DigitSequence
	;

fragment
HexadecimalDigitSequence
	:   HexadecimalDigit+
	;

fragment
FloatingSuffix
	:   'f' | 'l' | 'F' | 'L'
	;

fragment
CharacterConstant
	:   '\'' CCharSequence '\''
	|   'L\'' CCharSequence '\''
	|   'u\'' CCharSequence '\''
	|   'U\'' CCharSequence '\''
	;

fragment
CCharSequence
	:   CChar+
	;

fragment
CChar
	:   ~['\\\r\n]
	|   EscapeSequence
	;

fragment
EscapeSequence
	:   SimpleEscapeSequence
	|   OctalEscapeSequence
	|   HexadecimalEscapeSequence
	|   UniversalCharacterName
	;

fragment
SimpleEscapeSequence
	:   '\\' ['"?abfnrtv\\]
	;

fragment
OctalEscapeSequence
	:   '\\' OctalDigit
	|   '\\' OctalDigit OctalDigit
	|   '\\' OctalDigit OctalDigit OctalDigit
	;

fragment
HexadecimalEscapeSequence
	:   '\\x' HexadecimalDigit+
	;

StringLiteral
	:   EncodingPrefix? '"' SCharSequence? '"'
	;

fragment
EncodingPrefix
	:   'u8'
	|   'u'
	|   'U'
	|   'L'
	;

fragment
SCharSequence
	:   SChar+
	;

fragment
SChar
	:   ~["\\\r\n]
	|   EscapeSequence
	|   '\\\n'   // Added line
	|   '\\\r\n' // Added line
	;

ComplexDefine
	:   '#' Whitespace? 'define'  ~[#]*
		-> skip
	;
		 
IncludeDirective
	:   '#' Whitespace? 'include' Whitespace? (('"' ~[\r\n]* '"') | ('<' ~[\r\n]* '>' )) Whitespace? Newline
		-> skip
	;

// ignore the following asm blocks:
/*
	asm
	{
		mfspr x, 286;
	}
 */
AsmBlock
	:   'asm' ~'{'* '{' ~'}'* '}'
	-> skip
	;
	
// ignore the lines generated by c preprocessor                                   
// sample line : '#line 1 "/home/dm/files/dk1.h" 1'                           
LineAfterPreprocessing
	:   '#line' Whitespace* ~[\r\n]*
		-> skip
	;  

LineDirective
	:   '#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]*
		-> skip
	;

PragmaDirective
	:   '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
		-> skip
	;

Whitespace
	:   [ \t]+
		-> channel (HIDDEN)
	;

Newline
	:   (   '\r' '\n'?
		|   '\n'
		)
		-> skip
	;

BlockComment
	:   '/*' .*? '*/'
		-> skip
	;

LineComment
	:   '//' ~[\r\n]*
		-> skip
	;