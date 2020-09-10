// Generated from e:\Data\Projects\FiveDir\AutoGen\AutoGen\CPP14.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, T__204=205, T__205=206, T__206=207, T__207=208, T__208=209, 
		T__209=210, T__210=211, T__211=212, T__212=213, T__213=214, T__214=215, 
		T__215=216, T__216=217, T__217=218, T__218=219, T__219=220, T__220=221, 
		T__221=222, T__222=223, T__223=224, T__224=225, T__225=226, T__226=227, 
		T__227=228, T__228=229, T__229=230, T__230=231, T__231=232, T__232=233, 
		T__233=234, T__234=235, T__235=236, T__236=237, T__237=238, T__238=239, 
		T__239=240, T__240=241, T__241=242, T__242=243, T__243=244, T__244=245, 
		T__245=246, T__246=247, T__247=248, T__248=249, T__249=250, T__250=251, 
		T__251=252, T__252=253, T__253=254, T__254=255, T__255=256, T__256=257, 
		T__257=258, T__258=259, T__259=260, T__260=261, T__261=262, T__262=263, 
		T__263=264, T__264=265, T__265=266, T__266=267, T__267=268, T__268=269, 
		T__269=270, T__270=271, T__271=272, T__272=273, T__273=274, T__274=275, 
		MultiLineMacro=276, Directive=277, Alignas=278, Alignof=279, Asm=280, 
		Auto=281, Bool=282, Break=283, Case=284, Catch=285, Char=286, Char16=287, 
		Char32=288, Class=289, Const=290, Constexpr=291, Const_cast=292, Continue=293, 
		Decltype=294, Default=295, Delete=296, Do=297, Double=298, Dynamic_cast=299, 
		Else=300, Enum=301, Explicit=302, Export=303, Extern=304, False=305, Final=306, 
		Float=307, For=308, Friend=309, Goto=310, If=311, Inline=312, Int=313, 
		Long=314, Mutable=315, Namespace=316, New=317, Noexcept=318, Nullptr=319, 
		Operator=320, Override=321, Private=322, Protected=323, Public=324, Register=325, 
		Reinterpret_cast=326, Return=327, Short=328, Signed=329, Sizeof=330, Static=331, 
		Static_assert=332, Static_cast=333, Struct=334, Switch=335, Template=336, 
		This=337, Thread_local=338, Throw=339, True=340, Try=341, Typedef=342, 
		Typeid_=343, Typename_=344, Union=345, Unsigned=346, Using=347, Virtual=348, 
		Void=349, Volatile=350, Wchar=351, While=352, LeftParen=353, RightParen=354, 
		LeftBracket=355, RightBracket=356, LeftBrace=357, RightBrace=358, Plus=359, 
		Minus=360, Star=361, Div=362, Mod=363, Caret=364, And=365, Or=366, Tilde=367, 
		Not=368, Assign=369, Less=370, Greater=371, PlusAssign=372, MinusAssign=373, 
		StarAssign=374, DivAssign=375, ModAssign=376, XorAssign=377, AndAssign=378, 
		OrAssign=379, LeftShift=380, RightShift=381, LeftShiftAssign=382, RightShiftAssign=383, 
		Equal=384, NotEqual=385, LessEqual=386, GreaterEqual=387, AndAnd=388, 
		OrOr=389, PlusPlus=390, MinusMinus=391, Comma=392, ArrowStar=393, Arrow=394, 
		Question=395, Colon=396, Doublecolon=397, Semi=398, Dot=399, DotStar=400, 
		Ellipsis=401, SAL_NAME=402, Identifier=403, Integerliteral=404, Decimalliteral=405, 
		Octalliteral=406, Hexadecimalliteral=407, Binaryliteral=408, Integersuffix=409, 
		Characterliteral=410, Floatingliteral=411, Stringliteral=412, Userdefinedintegerliteral=413, 
		Userdefinedfloatingliteral=414, Userdefinedstringliteral=415, Userdefinedcharacterliteral=416, 
		Whitespace=417, Newline=418, BlockComment=419, LineComment=420;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_typeidofexpr = 16, RULE_typeidofthetypeid = 17, RULE_expressionlist = 18, 
		RULE_pseudodestructorname = 19, RULE_unaryexpression = 20, RULE_unaryoperator = 21, 
		RULE_newexpression = 22, RULE_newplacement = 23, RULE_newtypeid = 24, 
		RULE_newdeclarator = 25, RULE_noptrnewdeclarator = 26, RULE_newinitializer = 27, 
		RULE_deleteexpression = 28, RULE_noexceptexpression = 29, RULE_castexpression = 30, 
		RULE_pmexpression = 31, RULE_multiplicativeexpression = 32, RULE_additiveexpression = 33, 
		RULE_shiftexpression = 34, RULE_shiftoperator = 35, RULE_relationalexpression = 36, 
		RULE_equalityexpression = 37, RULE_andexpression = 38, RULE_exclusiveorexpression = 39, 
		RULE_inclusiveorexpression = 40, RULE_logicalandexpression = 41, RULE_logicalorexpression = 42, 
		RULE_conditionalexpression = 43, RULE_assignmentexpression = 44, RULE_assignmentoperator = 45, 
		RULE_expression = 46, RULE_constantexpression = 47, RULE_statement = 48, 
		RULE_labeledstatement = 49, RULE_expressionstatement = 50, RULE_compoundstatement = 51, 
		RULE_statementseq = 52, RULE_selectionstatement = 53, RULE_condition = 54, 
		RULE_iterationstatement = 55, RULE_forinitstatement = 56, RULE_forrangedeclaration = 57, 
		RULE_forrangeinitializer = 58, RULE_jumpstatement = 59, RULE_declarationstatement = 60, 
		RULE_declarationseq = 61, RULE_declaration = 62, RULE_blockdeclaration = 63, 
		RULE_aliasdeclaration = 64, RULE_simpledeclaration = 65, RULE_static_assertdeclaration = 66, 
		RULE_emptydeclaration = 67, RULE_attributedeclaration = 68, RULE_declspecifier = 69, 
		RULE_microsoft_linkage = 70, RULE_declspecifierseq = 71, RULE_storageclassspecifier = 72, 
		RULE_sal_statement = 73, RULE_sal_expr = 74, RULE_microsoft_storage = 75, 
		RULE_decl_spec = 76, RULE_functionspecifier = 77, RULE_typedefname = 78, 
		RULE_typespecifier = 79, RULE_microsoft_types = 80, RULE_trailingtypespecifier = 81, 
		RULE_typespecifierseq = 82, RULE_trailingtypespecifierseq = 83, RULE_simpletypespecifier = 84, 
		RULE_thetypename = 85, RULE_decltypespecifier = 86, RULE_elaboratedtypespecifier = 87, 
		RULE_enumname = 88, RULE_enumspecifier = 89, RULE_enumhead = 90, RULE_opaqueenumdeclaration = 91, 
		RULE_enumkey = 92, RULE_enumbase = 93, RULE_enumeratorlist = 94, RULE_enumeratordefinition = 95, 
		RULE_enumerator = 96, RULE_namespacename = 97, RULE_originalnamespacename = 98, 
		RULE_namespacedefinition = 99, RULE_namednamespacedefinition = 100, RULE_originalnamespacedefinition = 101, 
		RULE_extensionnamespacedefinition = 102, RULE_unnamednamespacedefinition = 103, 
		RULE_namespacebody = 104, RULE_namespacealias = 105, RULE_namespacealiasdefinition = 106, 
		RULE_qualifiednamespacespecifier = 107, RULE_usingdeclaration = 108, RULE_usingdirective = 109, 
		RULE_asmdefinition = 110, RULE_linkagespecification = 111, RULE_attributespecifierseq = 112, 
		RULE_attributespecifier = 113, RULE_alignmentspecifier = 114, RULE_attributelist = 115, 
		RULE_attribute = 116, RULE_attributetoken = 117, RULE_attributescopedtoken = 118, 
		RULE_attributenamespace = 119, RULE_attributeargumentclause = 120, RULE_balancedtokenseq = 121, 
		RULE_balancedtoken = 122, RULE_initdeclaratorlist = 123, RULE_initdeclarator = 124, 
		RULE_declarator = 125, RULE_ptrdeclarator = 126, RULE_noptrdeclarator = 127, 
		RULE_parametersandqualifiers = 128, RULE_trailingreturntype = 129, RULE_ptroperator = 130, 
		RULE_cvqualifierseq = 131, RULE_cvqualifier = 132, RULE_refqualifier = 133, 
		RULE_declaratorid = 134, RULE_thetypeid = 135, RULE_abstractdeclarator = 136, 
		RULE_ptrabstractdeclarator = 137, RULE_noptrabstractdeclarator = 138, 
		RULE_abstractpackdeclarator = 139, RULE_noptrabstractpackdeclarator = 140, 
		RULE_parameterdeclarationclause = 141, RULE_parameterdeclarationlist = 142, 
		RULE_parameterdeclaration = 143, RULE_functiondefinition = 144, RULE_functionbody = 145, 
		RULE_initializer = 146, RULE_braceorequalinitializer = 147, RULE_initializerclause = 148, 
		RULE_initializerlist = 149, RULE_bracedinitlist = 150, RULE_classname = 151, 
		RULE_classspecifier = 152, RULE_classhead = 153, RULE_classheadname = 154, 
		RULE_classvirtspecifier = 155, RULE_classkey = 156, RULE_memberspecification = 157, 
		RULE_memberdeclaration = 158, RULE_memberdeclaratorlist = 159, RULE_memberdeclarator = 160, 
		RULE_virtspecifierseq = 161, RULE_virtspecifier = 162, RULE_purespecifier = 163, 
		RULE_baseclause = 164, RULE_basespecifierlist = 165, RULE_basespecifier = 166, 
		RULE_classordecltype = 167, RULE_basetypespecifier = 168, RULE_accessspecifier = 169, 
		RULE_conversionfunctionid = 170, RULE_conversiontypeid = 171, RULE_conversiondeclarator = 172, 
		RULE_ctorinitializer = 173, RULE_meminitializerlist = 174, RULE_meminitializer = 175, 
		RULE_meminitializerid = 176, RULE_operatorfunctionid = 177, RULE_literaloperatorid = 178, 
		RULE_templatedeclaration = 179, RULE_templateparameterlist = 180, RULE_templateparameter = 181, 
		RULE_typeparameter = 182, RULE_simpletemplateid = 183, RULE_templateid = 184, 
		RULE_templatename = 185, RULE_templateargumentlist = 186, RULE_templateargument = 187, 
		RULE_typenamespecifier = 188, RULE_explicitinstantiation = 189, RULE_explicitspecialization = 190, 
		RULE_tryblock = 191, RULE_functiontryblock = 192, RULE_handlerseq = 193, 
		RULE_handler = 194, RULE_exceptiondeclaration = 195, RULE_throwexpression = 196, 
		RULE_exceptionspecification = 197, RULE_dynamicexceptionspecification = 198, 
		RULE_typeidlist = 199, RULE_noexceptspecification = 200, RULE_theoperator = 201, 
		RULE_literal = 202, RULE_booleanliteral = 203, RULE_pointerliteral = 204, 
		RULE_userdefinedliteral = 205;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "typeidofexpr", 
		"typeidofthetypeid", "expressionlist", "pseudodestructorname", "unaryexpression", 
		"unaryoperator", "newexpression", "newplacement", "newtypeid", "newdeclarator", 
		"noptrnewdeclarator", "newinitializer", "deleteexpression", "noexceptexpression", 
		"castexpression", "pmexpression", "multiplicativeexpression", "additiveexpression", 
		"shiftexpression", "shiftoperator", "relationalexpression", "equalityexpression", 
		"andexpression", "exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
		"logicalorexpression", "conditionalexpression", "assignmentexpression", 
		"assignmentoperator", "expression", "constantexpression", "statement", 
		"labeledstatement", "expressionstatement", "compoundstatement", "statementseq", 
		"selectionstatement", "condition", "iterationstatement", "forinitstatement", 
		"forrangedeclaration", "forrangeinitializer", "jumpstatement", "declarationstatement", 
		"declarationseq", "declaration", "blockdeclaration", "aliasdeclaration", 
		"simpledeclaration", "static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
		"declspecifier", "microsoft_linkage", "declspecifierseq", "storageclassspecifier", 
		"sal_statement", "sal_expr", "microsoft_storage", "decl_spec", "functionspecifier", 
		"typedefname", "typespecifier", "microsoft_types", "trailingtypespecifier", 
		"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
		"thetypename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
		"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
		"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "thetypeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "theoperator", "literal", "booleanliteral", 
		"pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", "'__cdecl'", "'__stdcall'", 
		"'__in'", "'__in_opt'", "'__in_ecount_opt'", "'__out_validated'", "'__analysis_noreturn'", 
		"'__kernel_entry'", "'APIENTRY'", "'CALLBACK'", "'CMAPI'", "'CREDUIAPI'", 
		"'DECLSPEC_ALLOCATOR'", "'DSGETDCAPI'", "'ENGAPI'", "'ETW_APP_DECLSPEC_DEPRECATED'", 
		"'EVNTAPI'", "'FAR'", "'KSDDKAPI'", "'KSECDDDECLSPEC'", "'NET_API_FUNCTION'", 
		"'NTAPI'", "'NTDSAPI_POSTXP'", "'NT_RTL_COMPRESS_API'", "'NTSYSAPI'", 
		"'NTSYSCALLAPI'", "'PASCAL'", "'RPC_VAR_ENTRY'", "'SEC_ENTRY'", "'STDCALL'", 
		"'STDMETHODCALLTYPE'", "'USERENVAPI'", "'WINAPI'", "'WINBASE'", "'WINBASEAPI'", 
		"'WINPATHCCHAPI'", "'WINSETUPAPI'", "'WMIAPI'", "'WSAAPI'", "'WSPAPI'", 
		"'__declspec'", "'ATOM'", "'AtlThunkData_t'", "'BOOL'", "'BOOLAPI'", "'BOOLEAN'", 
		"'BSTR'", "'BYTE'", "'CHAR'", "'CLIENT_CALL_RETURN'", "'COLORREF'", "'CONFIGRET'", 
		"'COORD'", "'DEP_SYSTEM_POLICY_TYPE'", "'DEVICE_SCALE_FACTOR'", "'DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS'", 
		"'DIALOG_DPI_CHANGE_BEHAVIORS'", "'DLL_DIRECTORY_COOKIE'", "'DOUBLE'", 
		"'DPI_AWARENESS'", "'DPI_AWARENESS_CONTEXT'", "'DPI_HOSTING_BEHAVIOR'", 
		"'DWMAPI'", "'DWORD'", "'EXECUTION_STATE'", "'FD_GLYPHSET'", "'FILE'", 
		"'FOURCC'", "'GEOID'", "'HACCEL'", "'HANDLE'", "'HBITMAP'", "'HBRUSH'", 
		"'HCERTSTORE'", "'HCERT_SERVER_OCSP_RESPONSE'", "'HCOLORSPACE'", "'HCONV'", 
		"'HCONVLIST'", "'HCRYPTMSG'", "'HCRYPTOIDFUNCSET'", "'HCURSOR'", "'HDC'", 
		"'HDDEDATA'", "'HDESK'", "'HDEVNOTIFY'", "'HDPA'", "'HDRVR'", "'HDSA'", 
		"'HDWP'", "'HENHMETAFILE'", "'HFILE'", "'HFONT'", "'HGDIOBJ'", "'HGLOBAL'", 
		"'HHOOK'", "'HICON'", "'HIMAGELIST'", "'HIMC'", "'HINSTANCE'", "'HKL'", 
		"'HLOCAL'", "'HMENU'", "'HMETAFILE'", "'HMMIO'", "'HMODULE'", "'HMONITOR'", 
		"'HPALETTE'", "'HPEN'", "'HPOWERNOTIFY'", "'HPROPSHEETPAGE'", "'HRESULT'", 
		"'HRGN'", "'HRSRC'", "'HSEMAPHORE'", "'HSURF'", "'HSYNTHETICPOINTERDEVICE'", 
		"'HSZ'", "'HWCT'", "'HWINEVENTHOOK'", "'HWINSTA'", "'HWND'", "'IContextMenu'", 
		"'IFIMETRICS'", "'INT'", "'INT_PTR'", "'IStream'", "'LANGID'", "'LARGE_INTEGER'", 
		"'LCID'", "'LONG'", "'LONG64'", "'LONGLONG'", "'LONG_PTR'", "'LPARAM'", 
		"'LPBYTE'", "'LPCCH'", "'LPCH'", "'LPCSTR'", "'LPCUWCHAR'", "'LPCUWSTR'", 
		"'LPCWCH'", "'LPCWSTR'", "'LPMMIOPROC'", "'LPSTR'", "'LPUWSTR'", "'LPVOID'", 
		"'LPWCH'", "'LPWSTR'", "'LRESULT'", "'LWSTDAPI'", "'LWSTDAPIV'", "'MCIDEVICEID'", 
		"'MMRESULT'", "'NDR_SCONTEXT'", "'NET_API_STATUS'", "'NPSTR'", "'NTSTATUS'", 
		"'NWPSTR'", "'OLESTATUS'", "'PATHOBJ'", "'PCCERT_CHAIN_CONTEXT'", "'PCCERT_CONTEXT'", 
		"'PCCERT_SERVER_OCSP'", "'PCCH'", "'PCCTL_CONTEXT'", "'PCERT_EXTENSION'", 
		"'PCERT_RDN_ATTR'", "'PCH'", "'PCHAR'", "'PCNZCH'", "'PCNZWCH'", "'PCRYPT_ATTRIBUTE'", 
		"'PCSTR'", "'PCTL_ENTRY'", "'PCTSTR'", "'PCUNZWCH'", "'PCUWCHAR'", "'PCUWSTR'", 
		"'PCUZZWSTR'", "'PCWCH'", "'PCWCHAR'", "'PCZPCSTR'", "'PCZPCWSTR'", "'PCZPSTR'", 
		"'PCZPWSTR'", "'PCZZSTR'", "'PCZZWSTR'", "'PDH_FUNCTION'", "'PFD_GLYPHATTR'", 
		"'PIDLIST_ABSOLUTE'", "'PIDLIST_RELATIVE'", "'PITEMID_CHILD'", "'PNZCH'", 
		"'PNZWCH'", "'POWER_PLATFORM_ROLE'", "'PPERF_COUNTERSET_INSTANCE'", "'PRTL_SPLAY_LINKS'", 
		"'PRTL_UNLOAD_EVENT_TRACE'", "'PRUNTIME_FUNCTION'", "'PSID_IDENTIFIER_AUTHORITY'", 
		"'PSLIST_ENTRY'", "'PSSTDAPI'", "'PSTR'", "'PTP_CLEANUP_GROUP'", "'PTP_IO'", 
		"'PTP_POOL'", "'PTP_TIMER'", "'PTP_WAIT'", "'PTP_WORK'", "'PUIDLIST_RELATIVE'", 
		"'PUNZWCH'", "'PUWSTR'", "'PUZZWSTR'", "'PVOID'", "'PWCH'", "'PWCHAR'", 
		"'PWSTR'", "'PZPCSTR'", "'PZPCWSTR'", "'PZPSTR'", "'PZPWSTR'", "'PZZSTR'", 
		"'PZZWSTR'", "'RPC_STATUS'", "'SAFEARRAY'", "'SCRIPT_LOGATTR'", "'SC_HANDLE'", 
		"'SECURITY_STATUS'", "'SHORT'", "'SHSTDAPI'", "'SIZE'", "'SIZE_T'", "'SOCKET'", 
		"'SURFOBJ'", "'THEMEAPI'", "'TRACEHANDLE'", "'TRUSTEE_FORM'", "'TRUSTEE_TYPE'", 
		"'UCHAR'", "'UINT'", "'UINT_PTR'", "'ULONG'", "'ULONG64'", "'ULONGLONG'", 
		"'ULONG_PTR'", "'USHORT'", "'VOID'", "'WINOLECTLAPI'", "'WORD'", "'XFORMOBJ'", 
		"'YIELDPROC'", "'_Dcomplex'", "'clock_t'", "'div_t'", "'errno_t'", "'hostent'", 
		"'imaxdiv_t'", "'intmax_t'", "'protoent'", "'servent'", "'size_t'", "'terminate_function'", 
		"'time_t'", "'uintptr_t'", "'u_long'", "'u_short'", "'wctrans_t'", "'wctype_t'", 
		"'wint_t'", null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", 
		"'break'", "'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", 
		"'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", 
		"'<='", "'>='", null, null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", 
		"':'", "'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"MultiLineMacro", "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
		"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
		"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
		"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
		"Extern", "False", "Final", "Float", "For", "Friend", "Goto", "If", "Inline", 
		"Int", "Long", "Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", 
		"Override", "Private", "Protected", "Public", "Register", "Reinterpret_cast", 
		"Return", "Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
		"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
		"Try", "Typedef", "Typeid_", "Typename_", "Union", "Unsigned", "Using", 
		"Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
		"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
		"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
		"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "RightShift", 
		"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
		"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", 
		"Arrow", "Question", "Colon", "Doublecolon", "Semi", "Dot", "DotStar", 
		"Ellipsis", "SAL_NAME", "Identifier", "Integerliteral", "Decimalliteral", 
		"Octalliteral", "Hexadecimalliteral", "Binaryliteral", "Integersuffix", 
		"Characterliteral", "Floatingliteral", "Stringliteral", "Userdefinedintegerliteral", 
		"Userdefinedfloatingliteral", "Userdefinedstringliteral", "Userdefinedcharacterliteral", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Asm - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (Namespace - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (Doublecolon - 397)) | (1L << (Semi - 397)) | (1L << (Ellipsis - 397)) | (1L << (SAL_NAME - 397)) | (1L << (Identifier - 397)))) != 0)) {
				{
				setState(412);
				declarationseq(0);
				}
			}

			setState(415);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(LeftParen);
				setState(420);
				expression(0);
				setState(421);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				match(Tilde);
				setState(436);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				match(Tilde);
				setState(438);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			nestednamespecifier(0);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(443);
				match(Template);
				}
			}

			setState(446);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(449);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(450);
				thetypename();
				setState(451);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(453);
				namespacename();
				setState(454);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(456);
				decltypespecifier();
				setState(457);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(461);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(462);
						match(Identifier);
						setState(463);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(464);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(465);
							match(Template);
							}
						}

						setState(468);
						simpletemplateid();
						setState(469);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			lambdaintroducer();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(477);
				lambdadeclarator();
				}
			}

			setState(480);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LeftBracket);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 337)) & ~0x3f) == 0 && ((1L << (_la - 337)) & ((1L << (This - 337)) | (1L << (And - 337)) | (1L << (Assign - 337)))) != 0) || _la==Identifier) {
				{
				setState(483);
				lambdacapture();
				}
			}

			setState(486);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				capturedefault();
				setState(491);
				match(Comma);
				setState(492);
				capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			capture();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(500);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(503);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(504);
					match(Comma);
					setState(505);
					capture();
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(506);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(And);
				setState(520);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(Identifier);
				setState(525);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(And);
				setState(527);
				match(Identifier);
				setState(528);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(LeftParen);
			setState(532);
			parameterdeclarationclause();
			setState(533);
			match(RightParen);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(534);
				match(Mutable);
				}
			}

			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(537);
				exceptionspecification();
				}
			}

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(540);
				attributespecifierseq(0);
				}
			}

			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(543);
				trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TypeidofthetypeidContext typeidofthetypeid() {
			return getRuleContext(TypeidofthetypeidContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(547);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(548);
				simpletypespecifier();
				setState(549);
				match(LeftParen);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(550);
					expressionlist();
					}
				}

				setState(553);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(555);
				typenamespecifier();
				setState(556);
				match(LeftParen);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(557);
					expressionlist();
					}
				}

				setState(560);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(562);
				simpletypespecifier();
				setState(563);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(565);
				typenamespecifier();
				setState(566);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(568);
				match(Dynamic_cast);
				setState(569);
				match(Less);
				setState(570);
				thetypeid();
				setState(571);
				match(Greater);
				setState(572);
				match(LeftParen);
				setState(573);
				expression(0);
				setState(574);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(576);
				match(Static_cast);
				setState(577);
				match(Less);
				setState(578);
				thetypeid();
				setState(579);
				match(Greater);
				setState(580);
				match(LeftParen);
				setState(581);
				expression(0);
				setState(582);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(584);
				match(Reinterpret_cast);
				setState(585);
				match(Less);
				setState(586);
				thetypeid();
				setState(587);
				match(Greater);
				setState(588);
				match(LeftParen);
				setState(589);
				expression(0);
				setState(590);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(592);
				match(Const_cast);
				setState(593);
				match(Less);
				setState(594);
				thetypeid();
				setState(595);
				match(Greater);
				setState(596);
				match(LeftParen);
				setState(597);
				expression(0);
				setState(598);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(600);
				typeidofthetypeid();
				setState(601);
				match(LeftParen);
				setState(602);
				expression(0);
				setState(603);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(605);
				typeidofthetypeid();
				setState(606);
				match(LeftParen);
				setState(607);
				thetypeid();
				setState(608);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(612);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(613);
						match(LeftBracket);
						setState(614);
						expression(0);
						setState(615);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(617);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(618);
						match(LeftBracket);
						setState(619);
						bracedinitlist();
						setState(620);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(622);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(623);
						match(LeftParen);
						setState(625);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
							{
							setState(624);
							expressionlist();
							}
						}

						setState(627);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(628);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(629);
						match(Dot);
						setState(631);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(630);
							match(Template);
							}
						}

						setState(633);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(634);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(635);
						match(Arrow);
						setState(637);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(636);
							match(Template);
							}
						}

						setState(639);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(640);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(641);
						match(Dot);
						setState(642);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(643);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(644);
						match(Arrow);
						setState(645);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(646);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(647);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(648);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(649);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeidofexprContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofexpr; }
	}

	public final TypeidofexprContext typeidofexpr() throws RecognitionException {
		TypeidofexprContext _localctx = new TypeidofexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidofthetypeidContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofthetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofthetypeid; }
	}

	public final TypeidofthetypeidContext typeidofthetypeid() throws RecognitionException {
		TypeidofthetypeidContext _localctx = new TypeidofthetypeidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<ThetypenameContext> thetypename() {
			return getRuleContexts(ThetypenameContext.class);
		}
		public ThetypenameContext thetypename(int i) {
			return getRuleContext(ThetypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudodestructorname);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(661);
					nestednamespecifier(0);
					}
					break;
				}
				setState(664);
				thetypename();
				setState(665);
				match(Doublecolon);
				setState(666);
				match(Tilde);
				setState(667);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				nestednamespecifier(0);
				setState(670);
				match(Template);
				setState(671);
				simpletemplateid();
				setState(672);
				match(Doublecolon);
				setState(673);
				match(Tilde);
				setState(674);
				thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(676);
					nestednamespecifier(0);
					}
				}

				setState(679);
				match(Tilde);
				setState(680);
				thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(681);
				match(Tilde);
				setState(682);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryexpression);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(PlusPlus);
				setState(687);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(MinusMinus);
				setState(689);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				unaryoperator();
				setState(691);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				match(Sizeof);
				setState(694);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				match(Sizeof);
				setState(696);
				match(LeftParen);
				setState(697);
				thetypeid();
				setState(698);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(700);
				match(Sizeof);
				setState(701);
				match(Ellipsis);
				setState(702);
				match(LeftParen);
				setState(703);
				match(Identifier);
				setState(704);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(705);
				match(Alignof);
				setState(706);
				match(LeftParen);
				setState(707);
				thetypeid();
				setState(708);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(710);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(711);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(712);
				deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || ((((_la - 359)) & ~0x3f) == 0 && ((1L << (_la - 359)) & ((1L << (Plus - 359)) | (1L << (Minus - 359)) | (1L << (Star - 359)) | (1L << (And - 359)) | (1L << (Or - 359)) | (1L << (Tilde - 359)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newexpression);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(717);
					match(Doublecolon);
					}
				}

				setState(720);
				match(New);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(721);
					newplacement();
					}
				}

				setState(724);
				newtypeid();
				setState(726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(725);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(728);
					match(Doublecolon);
					}
				}

				setState(731);
				match(New);
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(732);
					newplacement();
					}
					break;
				}
				setState(735);
				match(LeftParen);
				setState(736);
				thetypeid();
				setState(737);
				match(RightParen);
				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(738);
					newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(LeftParen);
			setState(744);
			expressionlist();
			setState(745);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			typespecifierseq();
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(748);
				newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newdeclarator);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				ptroperator();
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(752);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(759);
			match(LeftBracket);
			setState(760);
			expression(0);
			setState(761);
			match(RightBracket);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(762);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(765);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(766);
					match(LeftBracket);
					setState(767);
					constantexpression();
					setState(768);
					match(RightBracket);
					setState(770);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(769);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newinitializer);
		int _la;
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(LeftParen);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(778);
					expressionlist();
					}
				}

				setState(781);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteexpression);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(785);
					match(Doublecolon);
					}
				}

				setState(788);
				match(Delete);
				setState(789);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(790);
					match(Doublecolon);
					}
				}

				setState(793);
				match(Delete);
				setState(794);
				match(LeftBracket);
				setState(795);
				match(RightBracket);
				setState(796);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(Noexcept);
			setState(800);
			match(LeftParen);
			setState(801);
			expression(0);
			setState(802);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_castexpression);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(LeftParen);
				setState(806);
				thetypeid();
				setState(807);
				match(RightParen);
				setState(808);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(813);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(815);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(816);
						match(DotStar);
						setState(817);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(818);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(819);
						match(ArrowStar);
						setState(820);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(827);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(838);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(829);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(830);
						match(Star);
						setState(831);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(832);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(833);
						match(Div);
						setState(834);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(835);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(836);
						match(Mod);
						setState(837);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(844);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(846);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(847);
						match(Plus);
						setState(848);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(849);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(850);
						match(Minus);
						setState(851);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public ShiftoperatorContext shiftoperator() {
			return getRuleContext(ShiftoperatorContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(858);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(860);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(861);
					shiftoperator();
					setState(862);
					additiveexpression(0);
					}
					} 
				}
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftoperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public ShiftoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftoperator; }
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(872);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(886);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(874);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(875);
						match(Less);
						setState(876);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(877);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(878);
						match(Greater);
						setState(879);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(880);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(881);
						match(LessEqual);
						setState(882);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(883);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(884);
						match(GreaterEqual);
						setState(885);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(892);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(900);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(894);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(895);
						match(Equal);
						setState(896);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(897);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(898);
						match(NotEqual);
						setState(899);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(906);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(908);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(909);
					match(And);
					setState(910);
					equalityexpression(0);
					}
					} 
				}
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(917);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(919);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(920);
					match(Caret);
					setState(921);
					andexpression(0);
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(928);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(935);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(930);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(931);
					match(Or);
					setState(932);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(939);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(941);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(942);
						match(T__2);
						setState(943);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(944);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(945);
						match(T__3);
						setState(946);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(953);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(961);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(955);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(956);
						match(T__4);
						setState(957);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(958);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(959);
						match(T__5);
						setState(960);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalexpression);
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				logicalorexpression(0);
				setState(968);
				match(Question);
				setState(969);
				expression(0);
				setState(970);
				match(Colon);
				setState(971);
				assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentexpression);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				logicalorexpression(0);
				setState(977);
				assignmentoperator();
				setState(978);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if ( !(((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (Assign - 369)) | (1L << (PlusAssign - 369)) | (1L << (MinusAssign - 369)) | (1L << (StarAssign - 369)) | (1L << (DivAssign - 369)) | (1L << (ModAssign - 369)) | (1L << (XorAssign - 369)) | (1L << (AndAssign - 369)) | (1L << (OrAssign - 369)) | (1L << (LeftShiftAssign - 369)) | (1L << (RightShiftAssign - 369)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(986);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(988);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(989);
					match(Comma);
					setState(990);
					assignmentexpression();
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(999);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1002);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1003);
					attributespecifierseq(0);
					}
				}

				setState(1006);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1007);
					attributespecifierseq(0);
					}
				}

				setState(1010);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1011);
					attributespecifierseq(0);
					}
				}

				setState(1014);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1015);
					attributespecifierseq(0);
					}
				}

				setState(1018);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1019);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1020);
					attributespecifierseq(0);
					}
				}

				setState(1023);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labeledstatement);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1026);
					attributespecifierseq(0);
					}
				}

				setState(1029);
				match(Identifier);
				setState(1030);
				match(Colon);
				setState(1031);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1032);
					attributespecifierseq(0);
					}
				}

				setState(1035);
				match(Case);
				setState(1036);
				constantexpression();
				setState(1037);
				match(Colon);
				setState(1038);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1040);
					attributespecifierseq(0);
					}
				}

				setState(1043);
				match(Default);
				setState(1044);
				match(Colon);
				setState(1045);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
				{
				setState(1048);
				expression(0);
				}
			}

			setState(1051);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(LeftBrace);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Alignof - 256)) | (1L << (Asm - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Break - 256)) | (1L << (Case - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Const_cast - 256)) | (1L << (Continue - 256)) | (1L << (Decltype - 256)) | (1L << (Default - 256)) | (1L << (Delete - 256)) | (1L << (Do - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (For - 256)) | (1L << (Friend - 256)) | (1L << (Goto - 256)) | (1L << (If - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (Namespace - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Register - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Return - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (Switch - 320)) | (1L << (This - 320)) | (1L << (Thread_local - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Try - 320)) | (1L << (Typedef - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (While - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Semi - 390)) | (1L << (Ellipsis - 390)) | (1L << (SAL_NAME - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
				{
				setState(1054);
				statementseq(0);
				}
			}

			setState(1057);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1060);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1062);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1063);
					statement();
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionstatement);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				match(If);
				setState(1070);
				match(LeftParen);
				setState(1071);
				condition();
				setState(1072);
				match(RightParen);
				setState(1073);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				match(If);
				setState(1076);
				match(LeftParen);
				setState(1077);
				condition();
				setState(1078);
				match(RightParen);
				setState(1079);
				statement();
				setState(1080);
				match(Else);
				setState(1081);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				match(Switch);
				setState(1084);
				match(LeftParen);
				setState(1085);
				condition();
				setState(1086);
				match(RightParen);
				setState(1087);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_condition);
		int _la;
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1092);
					attributespecifierseq(0);
					}
				}

				setState(1095);
				declspecifierseq();
				setState(1096);
				declarator();
				setState(1097);
				match(Assign);
				setState(1098);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1100);
					attributespecifierseq(0);
					}
				}

				setState(1103);
				declspecifierseq();
				setState(1104);
				declarator();
				setState(1105);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iterationstatement);
		int _la;
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				match(While);
				setState(1110);
				match(LeftParen);
				setState(1111);
				condition();
				setState(1112);
				match(RightParen);
				setState(1113);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(Do);
				setState(1116);
				statement();
				setState(1117);
				match(While);
				setState(1118);
				match(LeftParen);
				setState(1119);
				expression(0);
				setState(1120);
				match(RightParen);
				setState(1121);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1123);
				match(For);
				setState(1124);
				match(LeftParen);
				setState(1125);
				forinitstatement();
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Register - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (This - 320)) | (1L << (Thread_local - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typedef - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (SAL_NAME - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(1126);
					condition();
					}
				}

				setState(1129);
				match(Semi);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(1130);
					expression(0);
					}
				}

				setState(1133);
				match(RightParen);
				setState(1134);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1136);
				match(For);
				setState(1137);
				match(LeftParen);
				setState(1138);
				forrangedeclaration();
				setState(1139);
				match(Colon);
				setState(1140);
				forrangeinitializer();
				setState(1141);
				match(RightParen);
				setState(1142);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forinitstatement);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1150);
				attributespecifierseq(0);
				}
			}

			setState(1153);
			declspecifierseq();
			setState(1154);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forrangeinitializer);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__41:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jumpstatement);
		int _la;
		try {
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				match(Break);
				setState(1161);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(Continue);
				setState(1163);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				match(Return);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(1165);
					expression(0);
					}
				}

				setState(1168);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1169);
				match(Return);
				setState(1170);
				bracedinitlist();
				setState(1171);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1173);
				match(Goto);
				setState(1174);
				match(Identifier);
				setState(1175);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1181);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1184);
					declaration();
					}
					} 
				}
				setState(1189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declaration);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1193);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1194);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1195);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1196);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1197);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1198);
				attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockdeclaration);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1203);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1204);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1205);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1206);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1207);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1208);
				opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(Using);
			setState(1212);
			match(Identifier);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1213);
				attributespecifierseq(0);
				}
			}

			setState(1216);
			match(Assign);
			setState(1217);
			thetypeid();
			setState(1218);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_simpledeclaration);
		int _la;
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case SAL_NAME:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1220);
					declspecifierseq();
					}
					break;
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (Decltype - 294)) | (1L << (Operator - 294)) | (1L << (LeftParen - 294)))) != 0) || ((((_la - 361)) & ~0x3f) == 0 && ((1L << (_la - 361)) & ((1L << (Star - 361)) | (1L << (And - 361)) | (1L << (Tilde - 361)) | (1L << (Doublecolon - 361)) | (1L << (Ellipsis - 361)) | (1L << (Identifier - 361)))) != 0)) {
					{
					setState(1223);
					initdeclaratorlist(0);
					}
				}

				setState(1226);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				attributespecifierseq(0);
				setState(1229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1228);
					declspecifierseq();
					}
					break;
				}
				setState(1231);
				initdeclaratorlist(0);
				setState(1232);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(Static_assert);
			setState(1237);
			match(LeftParen);
			setState(1238);
			constantexpression();
			setState(1239);
			match(Comma);
			setState(1240);
			match(Stringliteral);
			setState(1241);
			match(RightParen);
			setState(1242);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			attributespecifierseq(0);
			setState(1247);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public Sal_statementContext sal_statement() {
			return getRuleContext(Sal_statementContext.class,0);
		}
		public Microsoft_linkageContext microsoft_linkage() {
			return getRuleContext(Microsoft_linkageContext.class,0);
		}
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declspecifier);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				sal_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				microsoft_linkage();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				storageclassspecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				typespecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253);
				functionspecifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254);
				match(Friend);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1255);
				match(Typedef);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1256);
				match(Constexpr);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Microsoft_linkageContext extends ParserRuleContext {
		public Decl_specContext decl_spec() {
			return getRuleContext(Decl_specContext.class,0);
		}
		public Microsoft_linkageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_microsoft_linkage; }
	}

	public final Microsoft_linkageContext microsoft_linkage() throws RecognitionException {
		Microsoft_linkageContext _localctx = new Microsoft_linkageContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_microsoft_linkage);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				match(T__6);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				decl_spec();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declspecifierseq);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				declspecifier();
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1265);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				declspecifier();
				setState(1269);
				declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public Microsoft_storageContext microsoft_storage() {
			return getRuleContext(Microsoft_storageContext.class,0);
		}
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_storageclassspecifier);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Register:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(Register);
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(Static);
				}
				break;
			case Thread_local:
				enterOuterAlt(_localctx, 3);
				{
				setState(1275);
				match(Thread_local);
				}
				break;
			case Extern:
				enterOuterAlt(_localctx, 4);
				{
				setState(1276);
				match(Extern);
				}
				break;
			case Mutable:
				enterOuterAlt(_localctx, 5);
				{
				setState(1277);
				match(Mutable);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(1278);
				microsoft_storage();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sal_statementContext extends ParserRuleContext {
		public TerminalNode SAL_NAME() { return getToken(CPP14Parser.SAL_NAME, 0); }
		public Sal_exprContext sal_expr() {
			return getRuleContext(Sal_exprContext.class,0);
		}
		public Sal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sal_statement; }
	}

	public final Sal_statementContext sal_statement() throws RecognitionException {
		Sal_statementContext _localctx = new Sal_statementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sal_statement);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAL_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				match(SAL_NAME);
				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1282);
					sal_expr();
					}
					break;
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(1286);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1287);
				match(T__10);
				setState(1289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1288);
					sal_expr();
					}
					break;
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(1291);
				match(T__11);
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1292);
					sal_expr();
					}
					break;
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(1295);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(1296);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sal_exprContext extends ParserRuleContext {
		public List<Sal_exprContext> sal_expr() {
			return getRuleContexts(Sal_exprContext.class);
		}
		public Sal_exprContext sal_expr(int i) {
			return getRuleContext(Sal_exprContext.class,i);
		}
		public Sal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sal_expr; }
	}

	public final Sal_exprContext sal_expr() throws RecognitionException {
		Sal_exprContext _localctx = new Sal_exprContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sal_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(LeftParen);
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (MultiLineMacro - 256)) | (1L << (Directive - 256)) | (1L << (Alignas - 256)) | (1L << (Alignof - 256)) | (1L << (Asm - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Break - 256)) | (1L << (Case - 256)) | (1L << (Catch - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Const_cast - 256)) | (1L << (Continue - 256)) | (1L << (Decltype - 256)) | (1L << (Default - 256)) | (1L << (Delete - 256)) | (1L << (Do - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Else - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Export - 256)) | (1L << (Extern - 256)) | (1L << (False - 256)) | (1L << (Final - 256)) | (1L << (Float - 256)) | (1L << (For - 256)) | (1L << (Friend - 256)) | (1L << (Goto - 256)) | (1L << (If - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (Namespace - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Override - 320)) | (1L << (Private - 320)) | (1L << (Protected - 320)) | (1L << (Public - 320)) | (1L << (Register - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Return - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (Switch - 320)) | (1L << (Template - 320)) | (1L << (This - 320)) | (1L << (Thread_local - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Try - 320)) | (1L << (Typedef - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (While - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (RightBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (RightBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (Div - 320)) | (1L << (Mod - 320)) | (1L << (Caret - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)) | (1L << (Not - 320)) | (1L << (Assign - 320)) | (1L << (Less - 320)) | (1L << (Greater - 320)) | (1L << (PlusAssign - 320)) | (1L << (MinusAssign - 320)) | (1L << (StarAssign - 320)) | (1L << (DivAssign - 320)) | (1L << (ModAssign - 320)) | (1L << (XorAssign - 320)) | (1L << (AndAssign - 320)) | (1L << (OrAssign - 320)) | (1L << (LeftShift - 320)) | (1L << (RightShift - 320)) | (1L << (LeftShiftAssign - 320)) | (1L << (RightShiftAssign - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (Equal - 384)) | (1L << (NotEqual - 384)) | (1L << (LessEqual - 384)) | (1L << (GreaterEqual - 384)) | (1L << (AndAnd - 384)) | (1L << (OrOr - 384)) | (1L << (PlusPlus - 384)) | (1L << (MinusMinus - 384)) | (1L << (Comma - 384)) | (1L << (ArrowStar - 384)) | (1L << (Arrow - 384)) | (1L << (Question - 384)) | (1L << (Colon - 384)) | (1L << (Doublecolon - 384)) | (1L << (Semi - 384)) | (1L << (Dot - 384)) | (1L << (DotStar - 384)) | (1L << (Ellipsis - 384)) | (1L << (SAL_NAME - 384)) | (1L << (Identifier - 384)) | (1L << (Integerliteral - 384)) | (1L << (Decimalliteral - 384)) | (1L << (Octalliteral - 384)) | (1L << (Hexadecimalliteral - 384)) | (1L << (Binaryliteral - 384)) | (1L << (Integersuffix - 384)) | (1L << (Characterliteral - 384)) | (1L << (Floatingliteral - 384)) | (1L << (Stringliteral - 384)) | (1L << (Userdefinedintegerliteral - 384)) | (1L << (Userdefinedfloatingliteral - 384)) | (1L << (Userdefinedstringliteral - 384)) | (1L << (Userdefinedcharacterliteral - 384)) | (1L << (Whitespace - 384)) | (1L << (Newline - 384)) | (1L << (BlockComment - 384)) | (1L << (LineComment - 384)))) != 0)) {
				{
				setState(1302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__103:
				case T__104:
				case T__105:
				case T__106:
				case T__107:
				case T__108:
				case T__109:
				case T__110:
				case T__111:
				case T__112:
				case T__113:
				case T__114:
				case T__115:
				case T__116:
				case T__117:
				case T__118:
				case T__119:
				case T__120:
				case T__121:
				case T__122:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case T__129:
				case T__130:
				case T__131:
				case T__132:
				case T__133:
				case T__134:
				case T__135:
				case T__136:
				case T__137:
				case T__138:
				case T__139:
				case T__140:
				case T__141:
				case T__142:
				case T__143:
				case T__144:
				case T__145:
				case T__146:
				case T__147:
				case T__148:
				case T__149:
				case T__150:
				case T__151:
				case T__152:
				case T__153:
				case T__154:
				case T__155:
				case T__156:
				case T__157:
				case T__158:
				case T__159:
				case T__160:
				case T__161:
				case T__162:
				case T__163:
				case T__164:
				case T__165:
				case T__166:
				case T__167:
				case T__168:
				case T__169:
				case T__170:
				case T__171:
				case T__172:
				case T__173:
				case T__174:
				case T__175:
				case T__176:
				case T__177:
				case T__178:
				case T__179:
				case T__180:
				case T__181:
				case T__182:
				case T__183:
				case T__184:
				case T__185:
				case T__186:
				case T__187:
				case T__188:
				case T__189:
				case T__190:
				case T__191:
				case T__192:
				case T__193:
				case T__194:
				case T__195:
				case T__196:
				case T__197:
				case T__198:
				case T__199:
				case T__200:
				case T__201:
				case T__202:
				case T__203:
				case T__204:
				case T__205:
				case T__206:
				case T__207:
				case T__208:
				case T__209:
				case T__210:
				case T__211:
				case T__212:
				case T__213:
				case T__214:
				case T__215:
				case T__216:
				case T__217:
				case T__218:
				case T__219:
				case T__220:
				case T__221:
				case T__222:
				case T__223:
				case T__224:
				case T__225:
				case T__226:
				case T__227:
				case T__228:
				case T__229:
				case T__230:
				case T__231:
				case T__232:
				case T__233:
				case T__234:
				case T__235:
				case T__236:
				case T__237:
				case T__238:
				case T__239:
				case T__240:
				case T__241:
				case T__242:
				case T__243:
				case T__244:
				case T__245:
				case T__246:
				case T__247:
				case T__248:
				case T__249:
				case T__250:
				case T__251:
				case T__252:
				case T__253:
				case T__254:
				case T__255:
				case T__256:
				case T__257:
				case T__258:
				case T__259:
				case T__260:
				case T__261:
				case T__262:
				case T__263:
				case T__264:
				case T__265:
				case T__266:
				case T__267:
				case T__268:
				case T__269:
				case T__270:
				case T__271:
				case T__272:
				case T__273:
				case T__274:
				case MultiLineMacro:
				case Directive:
				case Alignas:
				case Alignof:
				case Asm:
				case Auto:
				case Bool:
				case Break:
				case Case:
				case Catch:
				case Char:
				case Char16:
				case Char32:
				case Class:
				case Const:
				case Constexpr:
				case Const_cast:
				case Continue:
				case Decltype:
				case Default:
				case Delete:
				case Do:
				case Double:
				case Dynamic_cast:
				case Else:
				case Enum:
				case Explicit:
				case Export:
				case Extern:
				case False:
				case Final:
				case Float:
				case For:
				case Friend:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Mutable:
				case Namespace:
				case New:
				case Noexcept:
				case Nullptr:
				case Operator:
				case Override:
				case Private:
				case Protected:
				case Public:
				case Register:
				case Reinterpret_cast:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Static_assert:
				case Static_cast:
				case Struct:
				case Switch:
				case Template:
				case This:
				case Thread_local:
				case Throw:
				case True:
				case Try:
				case Typedef:
				case Typeid_:
				case Typename_:
				case Union:
				case Unsigned:
				case Using:
				case Virtual:
				case Void:
				case Volatile:
				case Wchar:
				case While:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Plus:
				case Minus:
				case Star:
				case Div:
				case Mod:
				case Caret:
				case And:
				case Or:
				case Tilde:
				case Not:
				case Assign:
				case Less:
				case Greater:
				case PlusAssign:
				case MinusAssign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case XorAssign:
				case AndAssign:
				case OrAssign:
				case LeftShift:
				case RightShift:
				case LeftShiftAssign:
				case RightShiftAssign:
				case Equal:
				case NotEqual:
				case LessEqual:
				case GreaterEqual:
				case AndAnd:
				case OrOr:
				case PlusPlus:
				case MinusMinus:
				case Comma:
				case ArrowStar:
				case Arrow:
				case Question:
				case Colon:
				case Doublecolon:
				case Semi:
				case Dot:
				case DotStar:
				case Ellipsis:
				case SAL_NAME:
				case Identifier:
				case Integerliteral:
				case Decimalliteral:
				case Octalliteral:
				case Hexadecimalliteral:
				case Binaryliteral:
				case Integersuffix:
				case Characterliteral:
				case Floatingliteral:
				case Stringliteral:
				case Userdefinedintegerliteral:
				case Userdefinedfloatingliteral:
				case Userdefinedstringliteral:
				case Userdefinedcharacterliteral:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(1300);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(1301);
					sal_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1307);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Microsoft_storageContext extends ParserRuleContext {
		public Microsoft_storageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_microsoft_storage; }
	}

	public final Microsoft_storageContext microsoft_storage() throws RecognitionException {
		Microsoft_storageContext _localctx = new Microsoft_storageContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_microsoft_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_specContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public Decl_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_spec; }
	}

	public final Decl_specContext decl_spec() throws RecognitionException {
		Decl_specContext _localctx = new Decl_specContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_decl_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(T__46);
			setState(1312);
			match(LeftParen);
			setState(1313);
			match(Identifier);
			setState(1314);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_la = _input.LA(1);
			if ( !(((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (Explicit - 302)) | (1L << (Inline - 302)) | (1L << (Virtual - 302)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_typespecifier);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Microsoft_typesContext extends ParserRuleContext {
		public Microsoft_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_microsoft_types; }
	}

	public final Microsoft_typesContext microsoft_types() throws RecognitionException {
		Microsoft_typesContext _localctx = new Microsoft_typesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_microsoft_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__47 - 42)) | (1L << (T__48 - 42)) | (1L << (T__49 - 42)) | (1L << (T__50 - 42)) | (1L << (T__51 - 42)) | (1L << (T__52 - 42)) | (1L << (T__53 - 42)) | (1L << (T__54 - 42)) | (1L << (T__55 - 42)) | (1L << (T__56 - 42)) | (1L << (T__57 - 42)) | (1L << (T__58 - 42)) | (1L << (T__59 - 42)) | (1L << (T__60 - 42)) | (1L << (T__61 - 42)) | (1L << (T__62 - 42)) | (1L << (T__63 - 42)) | (1L << (T__64 - 42)) | (1L << (T__65 - 42)) | (1L << (T__66 - 42)) | (1L << (T__67 - 42)) | (1L << (T__68 - 42)) | (1L << (T__69 - 42)) | (1L << (T__70 - 42)) | (1L << (T__71 - 42)) | (1L << (T__72 - 42)) | (1L << (T__73 - 42)) | (1L << (T__74 - 42)) | (1L << (T__75 - 42)) | (1L << (T__76 - 42)) | (1L << (T__77 - 42)) | (1L << (T__78 - 42)) | (1L << (T__79 - 42)) | (1L << (T__80 - 42)) | (1L << (T__81 - 42)) | (1L << (T__82 - 42)) | (1L << (T__83 - 42)) | (1L << (T__84 - 42)) | (1L << (T__85 - 42)) | (1L << (T__86 - 42)) | (1L << (T__87 - 42)) | (1L << (T__88 - 42)) | (1L << (T__89 - 42)) | (1L << (T__90 - 42)) | (1L << (T__91 - 42)) | (1L << (T__92 - 42)) | (1L << (T__93 - 42)) | (1L << (T__94 - 42)) | (1L << (T__95 - 42)) | (1L << (T__96 - 42)) | (1L << (T__97 - 42)) | (1L << (T__98 - 42)) | (1L << (T__99 - 42)) | (1L << (T__100 - 42)) | (1L << (T__101 - 42)) | (1L << (T__102 - 42)) | (1L << (T__103 - 42)) | (1L << (T__104 - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (T__105 - 106)) | (1L << (T__106 - 106)) | (1L << (T__107 - 106)) | (1L << (T__108 - 106)) | (1L << (T__109 - 106)) | (1L << (T__110 - 106)) | (1L << (T__111 - 106)) | (1L << (T__112 - 106)) | (1L << (T__113 - 106)) | (1L << (T__114 - 106)) | (1L << (T__115 - 106)) | (1L << (T__116 - 106)) | (1L << (T__117 - 106)) | (1L << (T__118 - 106)) | (1L << (T__119 - 106)) | (1L << (T__120 - 106)) | (1L << (T__121 - 106)) | (1L << (T__122 - 106)) | (1L << (T__123 - 106)) | (1L << (T__124 - 106)) | (1L << (T__125 - 106)) | (1L << (T__126 - 106)) | (1L << (T__127 - 106)) | (1L << (T__128 - 106)) | (1L << (T__129 - 106)) | (1L << (T__130 - 106)) | (1L << (T__131 - 106)) | (1L << (T__132 - 106)) | (1L << (T__133 - 106)) | (1L << (T__134 - 106)) | (1L << (T__135 - 106)) | (1L << (T__136 - 106)) | (1L << (T__137 - 106)) | (1L << (T__138 - 106)) | (1L << (T__139 - 106)) | (1L << (T__140 - 106)) | (1L << (T__141 - 106)) | (1L << (T__142 - 106)) | (1L << (T__143 - 106)) | (1L << (T__144 - 106)) | (1L << (T__145 - 106)) | (1L << (T__146 - 106)) | (1L << (T__147 - 106)) | (1L << (T__148 - 106)) | (1L << (T__149 - 106)) | (1L << (T__150 - 106)) | (1L << (T__151 - 106)) | (1L << (T__152 - 106)) | (1L << (T__153 - 106)) | (1L << (T__154 - 106)) | (1L << (T__155 - 106)) | (1L << (T__156 - 106)) | (1L << (T__157 - 106)) | (1L << (T__158 - 106)) | (1L << (T__159 - 106)) | (1L << (T__160 - 106)) | (1L << (T__161 - 106)) | (1L << (T__162 - 106)) | (1L << (T__163 - 106)) | (1L << (T__164 - 106)) | (1L << (T__165 - 106)) | (1L << (T__166 - 106)) | (1L << (T__167 - 106)) | (1L << (T__168 - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (T__169 - 170)) | (1L << (T__170 - 170)) | (1L << (T__171 - 170)) | (1L << (T__172 - 170)) | (1L << (T__173 - 170)) | (1L << (T__174 - 170)) | (1L << (T__175 - 170)) | (1L << (T__176 - 170)) | (1L << (T__177 - 170)) | (1L << (T__178 - 170)) | (1L << (T__179 - 170)) | (1L << (T__180 - 170)) | (1L << (T__181 - 170)) | (1L << (T__182 - 170)) | (1L << (T__183 - 170)) | (1L << (T__184 - 170)) | (1L << (T__185 - 170)) | (1L << (T__186 - 170)) | (1L << (T__187 - 170)) | (1L << (T__188 - 170)) | (1L << (T__189 - 170)) | (1L << (T__190 - 170)) | (1L << (T__191 - 170)) | (1L << (T__192 - 170)) | (1L << (T__193 - 170)) | (1L << (T__194 - 170)) | (1L << (T__195 - 170)) | (1L << (T__196 - 170)) | (1L << (T__197 - 170)) | (1L << (T__198 - 170)) | (1L << (T__199 - 170)) | (1L << (T__200 - 170)) | (1L << (T__201 - 170)) | (1L << (T__202 - 170)) | (1L << (T__203 - 170)) | (1L << (T__204 - 170)) | (1L << (T__205 - 170)) | (1L << (T__206 - 170)) | (1L << (T__207 - 170)) | (1L << (T__208 - 170)) | (1L << (T__209 - 170)) | (1L << (T__210 - 170)) | (1L << (T__211 - 170)) | (1L << (T__212 - 170)) | (1L << (T__213 - 170)) | (1L << (T__214 - 170)) | (1L << (T__215 - 170)) | (1L << (T__216 - 170)) | (1L << (T__217 - 170)) | (1L << (T__218 - 170)) | (1L << (T__219 - 170)) | (1L << (T__220 - 170)) | (1L << (T__221 - 170)) | (1L << (T__222 - 170)) | (1L << (T__223 - 170)) | (1L << (T__224 - 170)) | (1L << (T__225 - 170)) | (1L << (T__226 - 170)) | (1L << (T__227 - 170)) | (1L << (T__228 - 170)) | (1L << (T__229 - 170)) | (1L << (T__230 - 170)) | (1L << (T__231 - 170)) | (1L << (T__232 - 170)))) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (T__233 - 234)) | (1L << (T__234 - 234)) | (1L << (T__235 - 234)) | (1L << (T__236 - 234)) | (1L << (T__237 - 234)) | (1L << (T__238 - 234)) | (1L << (T__239 - 234)) | (1L << (T__240 - 234)) | (1L << (T__241 - 234)) | (1L << (T__242 - 234)) | (1L << (T__243 - 234)) | (1L << (T__244 - 234)) | (1L << (T__245 - 234)) | (1L << (T__246 - 234)) | (1L << (T__247 - 234)) | (1L << (T__248 - 234)) | (1L << (T__249 - 234)) | (1L << (T__250 - 234)) | (1L << (T__251 - 234)) | (1L << (T__252 - 234)) | (1L << (T__253 - 234)) | (1L << (T__254 - 234)) | (1L << (T__255 - 234)) | (1L << (T__256 - 234)) | (1L << (T__257 - 234)) | (1L << (T__258 - 234)) | (1L << (T__259 - 234)) | (1L << (T__260 - 234)) | (1L << (T__261 - 234)) | (1L << (T__262 - 234)) | (1L << (T__263 - 234)) | (1L << (T__264 - 234)) | (1L << (T__265 - 234)) | (1L << (T__266 - 234)) | (1L << (T__267 - 234)) | (1L << (T__268 - 234)) | (1L << (T__269 - 234)) | (1L << (T__270 - 234)) | (1L << (T__271 - 234)) | (1L << (T__272 - 234)) | (1L << (T__273 - 234)) | (1L << (T__274 - 234)))) != 0) || _la==Wchar) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_trailingtypespecifier);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typespecifierseq);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				typespecifier();
				setState(1335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1334);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				typespecifier();
				setState(1338);
				typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_trailingtypespecifierseq);
		try {
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				trailingtypespecifier();
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1343);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				trailingtypespecifier();
				setState(1347);
				trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public Microsoft_typesContext microsoft_types() {
			return getRuleContext(Microsoft_typesContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_simpletypespecifier);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1351);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1354);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				nestednamespecifier(0);
				setState(1356);
				match(Template);
				setState(1357);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				microsoft_types();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1360);
				match(Char);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1361);
				match(Char16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1362);
				match(Char32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1363);
				match(Wchar);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1364);
				match(Bool);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1365);
				match(Short);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1366);
				match(Int);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1367);
				match(Long);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1368);
				match(Signed);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1369);
				match(Unsigned);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1370);
				match(Float);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1371);
				match(Double);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1372);
				match(Void);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1373);
				match(Auto);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1374);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThetypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ThetypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypename; }
	}

	public final ThetypenameContext thetypename() throws RecognitionException {
		ThetypenameContext _localctx = new ThetypenameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_thetypename);
		try {
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_decltypespecifier);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				match(Decltype);
				setState(1384);
				match(LeftParen);
				setState(1385);
				expression(0);
				setState(1386);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				match(Decltype);
				setState(1389);
				match(LeftParen);
				setState(1390);
				match(Auto);
				setState(1391);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				classkey();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1395);
					attributespecifierseq(0);
					}
				}

				setState(1399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1398);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1401);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				classkey();
				setState(1404);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1406);
				classkey();
				setState(1407);
				nestednamespecifier(0);
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1408);
					match(Template);
					}
				}

				setState(1411);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1413);
				match(Enum);
				setState(1415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1414);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1417);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumspecifier);
		int _la;
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				enumhead();
				setState(1423);
				match(LeftBrace);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1424);
					enumeratorlist(0);
					}
				}

				setState(1427);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				enumhead();
				setState(1430);
				match(LeftBrace);
				setState(1431);
				enumeratorlist(0);
				setState(1432);
				match(Comma);
				setState(1433);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumhead);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				enumkey();
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1438);
					attributespecifierseq(0);
					}
				}

				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1441);
					match(Identifier);
					}
				}

				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1444);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				enumkey();
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1448);
					attributespecifierseq(0);
					}
				}

				setState(1451);
				nestednamespecifier(0);
				setState(1452);
				match(Identifier);
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1453);
					enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			enumkey();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1459);
				attributespecifierseq(0);
				}
			}

			setState(1462);
			match(Identifier);
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1463);
				enumbase();
				}
			}

			setState(1466);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enumkey);
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				match(Enum);
				setState(1470);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471);
				match(Enum);
				setState(1472);
				match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(Colon);
			setState(1476);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1479);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1481);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1482);
					match(Comma);
					setState(1483);
					enumeratordefinition();
					}
					} 
				}
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumeratordefinition);
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				enumerator();
				setState(1491);
				match(Assign);
				setState(1492);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namespacename);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_namespacedefinition);
		try {
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namednamespacedefinition);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
				extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1512);
				match(Inline);
				}
			}

			setState(1515);
			match(Namespace);
			setState(1516);
			match(Identifier);
			setState(1517);
			match(LeftBrace);
			setState(1518);
			namespacebody();
			setState(1519);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1521);
				match(Inline);
				}
			}

			setState(1524);
			match(Namespace);
			setState(1525);
			originalnamespacename();
			setState(1526);
			match(LeftBrace);
			setState(1527);
			namespacebody();
			setState(1528);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1530);
				match(Inline);
				}
			}

			setState(1533);
			match(Namespace);
			setState(1534);
			match(LeftBrace);
			setState(1535);
			namespacebody();
			setState(1536);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Asm - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (Namespace - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (Doublecolon - 397)) | (1L << (Semi - 397)) | (1L << (Ellipsis - 397)) | (1L << (SAL_NAME - 397)) | (1L << (Identifier - 397)))) != 0)) {
				{
				setState(1538);
				declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(Namespace);
			setState(1544);
			match(Identifier);
			setState(1545);
			match(Assign);
			setState(1546);
			qualifiednamespacespecifier();
			setState(1547);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1549);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1552);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_usingdeclaration);
		int _la;
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554);
				match(Using);
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1555);
					match(Typename_);
					}
				}

				setState(1558);
				nestednamespecifier(0);
				setState(1559);
				unqualifiedid();
				setState(1560);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				match(Using);
				setState(1563);
				match(Doublecolon);
				setState(1564);
				unqualifiedid();
				setState(1565);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1569);
				attributespecifierseq(0);
				}
			}

			setState(1572);
			match(Using);
			setState(1573);
			match(Namespace);
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1574);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1577);
			namespacename();
			setState(1578);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(Asm);
			setState(1581);
			match(LeftParen);
			setState(1582);
			match(Stringliteral);
			setState(1583);
			match(RightParen);
			setState(1584);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_linkagespecification);
		int _la;
		try {
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				match(Extern);
				setState(1587);
				match(Stringliteral);
				setState(1588);
				match(LeftBrace);
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Asm - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)) | (1L << (Namespace - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (Doublecolon - 397)) | (1L << (Semi - 397)) | (1L << (Ellipsis - 397)) | (1L << (SAL_NAME - 397)) | (1L << (Identifier - 397)))) != 0)) {
					{
					setState(1589);
					declarationseq(0);
					}
				}

				setState(1592);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				match(Extern);
				setState(1594);
				match(Stringliteral);
				setState(1595);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1599);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1601);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1602);
					attributespecifier();
					}
					} 
				}
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_attributespecifier);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(LeftBracket);
				setState(1609);
				match(LeftBracket);
				setState(1610);
				attributelist(0);
				setState(1611);
				match(RightBracket);
				setState(1612);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				match(Alignas);
				setState(1618);
				match(LeftParen);
				setState(1619);
				thetypeid();
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1620);
					match(Ellipsis);
					}
				}

				setState(1623);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				match(Alignas);
				setState(1626);
				match(LeftParen);
				setState(1627);
				constantexpression();
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1628);
					match(Ellipsis);
					}
				}

				setState(1631);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1636);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1639);
				attribute();
				setState(1640);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1654);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1644);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1645);
						match(Comma);
						setState(1647);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1646);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1649);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1650);
						match(Comma);
						setState(1651);
						attribute();
						setState(1652);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			attributetoken();
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1660);
				attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_attributetoken);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			attributenamespace();
			setState(1668);
			match(Doublecolon);
			setState(1669);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(LeftParen);
			setState(1674);
			balancedtokenseq(0);
			setState(1675);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1678);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1681);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1682);
					balancedtoken();
					}
					} 
				}
				setState(1687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				match(LeftParen);
				setState(1689);
				balancedtokenseq(0);
				setState(1690);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				match(LeftBracket);
				setState(1693);
				balancedtokenseq(0);
				setState(1694);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1696);
				match(LeftBrace);
				setState(1697);
				balancedtokenseq(0);
				setState(1698);
				match(RightBrace);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShift:
			case RightShift:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case SAL_NAME:
			case Identifier:
			case Integerliteral:
			case Decimalliteral:
			case Octalliteral:
			case Hexadecimalliteral:
			case Binaryliteral:
			case Integersuffix:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1701); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1700);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (LeftParen - 353)) | (1L << (RightParen - 353)) | (1L << (LeftBracket - 353)) | (1L << (RightBracket - 353)) | (1L << (LeftBrace - 353)) | (1L << (RightBrace - 353)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1703); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1708);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1711);
					match(Comma);
					setState(1712);
					initdeclarator();
					}
					} 
				}
				setState(1717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			declarator();
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1719);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_declarator);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				noptrdeclarator(0);
				setState(1724);
				parametersandqualifiers();
				setState(1725);
				trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_ptrdeclarator);
		try {
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1730);
				ptroperator();
				setState(1731);
				ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1736);
				declaratorid();
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1737);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1740);
				match(LeftParen);
				setState(1741);
				ptrdeclarator();
				setState(1742);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1757);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1746);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1747);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1748);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1749);
						match(LeftBracket);
						setState(1751);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
							{
							setState(1750);
							constantexpression();
							}
						}

						setState(1753);
						match(RightBracket);
						setState(1755);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1754);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(LeftParen);
			setState(1763);
			parameterdeclarationclause();
			setState(1764);
			match(RightParen);
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1765);
				cvqualifierseq();
				}
				break;
			}
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1768);
				refqualifier();
				}
				break;
			}
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1771);
				exceptionspecification();
				}
				break;
			}
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1774);
				attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(Arrow);
			setState(1778);
			trailingtypespecifierseq();
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1779);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_ptroperator);
		try {
			setState(1805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				match(Star);
				setState(1784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1783);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1786);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				match(And);
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1790);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1793);
				match(T__2);
				setState(1795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1794);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1797);
				nestednamespecifier(0);
				setState(1798);
				match(Star);
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1799);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1802);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			cvqualifier();
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1808);
				cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==And) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1815);
				match(Ellipsis);
				}
			}

			setState(1818);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThetypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ThetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypeid; }
	}

	public final ThetypeidContext thetypeid() throws RecognitionException {
		ThetypeidContext _localctx = new ThetypeidContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			typespecifierseq();
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1821);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_abstractdeclarator);
		try {
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1825);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1828);
				parametersandqualifiers();
				setState(1829);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1831);
				abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_ptrabstractdeclarator);
		try {
			setState(1839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				noptrabstractdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				ptroperator();
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1836);
					ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1842);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1843);
				match(LeftBracket);
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(1844);
					constantexpression();
					}
				}

				setState(1847);
				match(RightBracket);
				setState(1849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1848);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1851);
				match(LeftParen);
				setState(1852);
				ptrabstractdeclarator();
				setState(1853);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1868);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1857);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1858);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1859);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1860);
						match(LeftBracket);
						setState(1862);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
							{
							setState(1861);
							constantexpression();
							}
						}

						setState(1864);
						match(RightBracket);
						setState(1866);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
						case 1:
							{
							setState(1865);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_abstractpackdeclarator);
		try {
			setState(1877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				noptrabstractpackdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				ptroperator();
				setState(1875);
				abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1880);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1882);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1883);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1884);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1885);
						match(LeftBracket);
						setState(1887);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
							{
							setState(1886);
							constantexpression();
							}
						}

						setState(1889);
						match(RightBracket);
						setState(1891);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
						case 1:
							{
							setState(1890);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (Register - 325)) | (1L << (Short - 325)) | (1L << (Signed - 325)) | (1L << (Static - 325)) | (1L << (Struct - 325)) | (1L << (Thread_local - 325)) | (1L << (Typedef - 325)) | (1L << (Typename_ - 325)) | (1L << (Union - 325)) | (1L << (Unsigned - 325)) | (1L << (Virtual - 325)) | (1L << (Void - 325)) | (1L << (Volatile - 325)) | (1L << (Wchar - 325)) | (1L << (LeftBracket - 325)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (Doublecolon - 397)) | (1L << (SAL_NAME - 397)) | (1L << (Identifier - 397)))) != 0)) {
					{
					setState(1898);
					parameterdeclarationlist(0);
					}
				}

				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1901);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				parameterdeclarationlist(0);
				setState(1905);
				match(Comma);
				setState(1906);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1911);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1913);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1914);
					match(Comma);
					setState(1915);
					parameterdeclaration();
					}
					} 
				}
				setState(1920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1921);
					attributespecifierseq(0);
					}
				}

				setState(1924);
				declspecifierseq();
				setState(1925);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1927);
					attributespecifierseq(0);
					}
				}

				setState(1930);
				declspecifierseq();
				setState(1931);
				declarator();
				setState(1932);
				match(Assign);
				setState(1933);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1935);
					attributespecifierseq(0);
					}
				}

				setState(1938);
				declspecifierseq();
				setState(1940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1939);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1942);
					attributespecifierseq(0);
					}
				}

				setState(1945);
				declspecifierseq();
				setState(1947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (Decltype - 294)) | (1L << (LeftParen - 294)) | (1L << (LeftBracket - 294)))) != 0) || ((((_la - 361)) & ~0x3f) == 0 && ((1L << (_la - 361)) & ((1L << (Star - 361)) | (1L << (And - 361)) | (1L << (Doublecolon - 361)) | (1L << (Ellipsis - 361)) | (1L << (Identifier - 361)))) != 0)) {
					{
					setState(1946);
					abstractdeclarator();
					}
				}

				setState(1949);
				match(Assign);
				setState(1950);
				initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1954);
				attributespecifierseq(0);
				}
			}

			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1957);
				declspecifierseq();
				}
				break;
			}
			setState(1960);
			declarator();
			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1961);
				virtspecifierseq(0);
				}
			}

			setState(1964);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_functionbody);
		int _la;
		try {
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1966);
					ctorinitializer();
					}
				}

				setState(1969);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1970);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1971);
				match(Assign);
				setState(1972);
				match(Default);
				setState(1973);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1974);
				match(Assign);
				setState(1975);
				match(Delete);
				setState(1976);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_initializer);
		try {
			setState(1984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				match(LeftParen);
				setState(1981);
				expressionlist();
				setState(1982);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_braceorequalinitializer);
		try {
			setState(1989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1986);
				match(Assign);
				setState(1987);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1988);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_initializerclause);
		try {
			setState(1993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__41:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1992);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1996);
			initializerclause();
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1997);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2000);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2001);
					match(Comma);
					setState(2002);
					initializerclause();
					setState(2004);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						setState(2003);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_bracedinitlist);
		int _la;
		try {
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2011);
				match(LeftBrace);
				setState(2012);
				initializerlist(0);
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2013);
					match(Comma);
					}
				}

				setState(2016);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				match(LeftBrace);
				setState(2019);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_classname);
		try {
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			classhead();
			setState(2027);
			match(LeftBrace);
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Private - 320)) | (1L << (Protected - 320)) | (1L << (Public - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 396)) & ~0x3f) == 0 && ((1L << (_la - 396)) & ((1L << (Colon - 396)) | (1L << (Doublecolon - 396)) | (1L << (Semi - 396)) | (1L << (Ellipsis - 396)) | (1L << (SAL_NAME - 396)) | (1L << (Identifier - 396)))) != 0)) {
				{
				setState(2028);
				memberspecification();
				}
			}

			setState(2031);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_classhead);
		int _la;
		try {
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				classkey();
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2034);
					attributespecifierseq(0);
					}
				}

				setState(2037);
				classheadname();
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2038);
					classvirtspecifier();
					}
				}

				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2041);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2044);
				classkey();
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2045);
					attributespecifierseq(0);
					}
				}

				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2048);
					baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2053);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2056);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			_la = _input.LA(1);
			if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (Class - 289)) | (1L << (Struct - 289)) | (1L << (Union - 289)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_memberspecification);
		int _la;
		try {
			setState(2071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
			case T__183:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__193:
			case T__194:
			case T__195:
			case T__196:
			case T__197:
			case T__198:
			case T__199:
			case T__200:
			case T__201:
			case T__202:
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
			case T__217:
			case T__218:
			case T__219:
			case T__220:
			case T__221:
			case T__222:
			case T__223:
			case T__224:
			case T__225:
			case T__226:
			case T__227:
			case T__228:
			case T__229:
			case T__230:
			case T__231:
			case T__232:
			case T__233:
			case T__234:
			case T__235:
			case T__236:
			case T__237:
			case T__238:
			case T__239:
			case T__240:
			case T__241:
			case T__242:
			case T__243:
			case T__244:
			case T__245:
			case T__246:
			case T__247:
			case T__248:
			case T__249:
			case T__250:
			case T__251:
			case T__252:
			case T__253:
			case T__254:
			case T__255:
			case T__256:
			case T__257:
			case T__258:
			case T__259:
			case T__260:
			case T__261:
			case T__262:
			case T__263:
			case T__264:
			case T__265:
			case T__266:
			case T__267:
			case T__268:
			case T__269:
			case T__270:
			case T__271:
			case T__272:
			case T__273:
			case T__274:
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case SAL_NAME:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2062);
				memberdeclaration();
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Private - 320)) | (1L << (Protected - 320)) | (1L << (Public - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 396)) & ~0x3f) == 0 && ((1L << (_la - 396)) & ((1L << (Colon - 396)) | (1L << (Doublecolon - 396)) | (1L << (Semi - 396)) | (1L << (Ellipsis - 396)) | (1L << (SAL_NAME - 396)) | (1L << (Identifier - 396)))) != 0)) {
					{
					setState(2063);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				accessspecifier();
				setState(2067);
				match(Colon);
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignas - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Constexpr - 256)) | (1L << (Decltype - 256)) | (1L << (Double - 256)) | (1L << (Enum - 256)) | (1L << (Explicit - 256)) | (1L << (Extern - 256)) | (1L << (Float - 256)) | (1L << (Friend - 256)) | (1L << (Inline - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (Mutable - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Private - 320)) | (1L << (Protected - 320)) | (1L << (Public - 320)) | (1L << (Register - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Static - 320)) | (1L << (Static_assert - 320)) | (1L << (Struct - 320)) | (1L << (Template - 320)) | (1L << (Thread_local - 320)) | (1L << (Typedef - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Using - 320)) | (1L << (Virtual - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 396)) & ~0x3f) == 0 && ((1L << (_la - 396)) & ((1L << (Colon - 396)) | (1L << (Doublecolon - 396)) | (1L << (Semi - 396)) | (1L << (Ellipsis - 396)) | (1L << (SAL_NAME - 396)) | (1L << (Identifier - 396)))) != 0)) {
					{
					setState(2068);
					memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_memberdeclaration);
		int _la;
		try {
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2073);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2076);
					declspecifierseq();
					}
					break;
				}
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (Alignas - 278)) | (1L << (Decltype - 278)) | (1L << (Operator - 278)))) != 0) || ((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & ((1L << (LeftParen - 353)) | (1L << (LeftBracket - 353)) | (1L << (Star - 353)) | (1L << (And - 353)) | (1L << (Tilde - 353)) | (1L << (Colon - 353)) | (1L << (Doublecolon - 353)) | (1L << (Ellipsis - 353)) | (1L << (Identifier - 353)))) != 0)) {
					{
					setState(2079);
					memberdeclaratorlist(0);
					}
				}

				setState(2082);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2083);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2084);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2085);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2086);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2087);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2088);
				emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 318;
		enterRecursionRule(_localctx, 318, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2092);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2094);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2095);
					match(Comma);
					setState(2096);
					memberdeclarator();
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_memberdeclarator);
		int _la;
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2102);
				declarator();
				setState(2104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2103);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2106);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				declarator();
				setState(2111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2110);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2113);
					match(Identifier);
					}
				}

				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2116);
					attributespecifierseq(0);
					}
				}

				setState(2119);
				match(Colon);
				setState(2120);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2124);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2126);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2127);
					virtspecifier();
					}
					} 
				}
				setState(2132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(Assign);
			setState(2136);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).CompareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			match(Colon);
			setState(2140);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 330;
		enterRecursionRule(_localctx, 330, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2143);
			basespecifier();
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2144);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2148);
					match(Comma);
					setState(2149);
					basespecifier();
					setState(2151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						setState(2150);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_basespecifier);
		int _la;
		try {
			setState(2179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2158);
					attributespecifierseq(0);
					}
				}

				setState(2161);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2162);
					attributespecifierseq(0);
					}
				}

				setState(2165);
				match(Virtual);
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (Private - 322)) | (1L << (Protected - 322)) | (1L << (Public - 322)))) != 0)) {
					{
					setState(2166);
					accessspecifier();
					}
				}

				setState(2169);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2170);
					attributespecifierseq(0);
					}
				}

				setState(2173);
				accessspecifier();
				setState(2175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2174);
					match(Virtual);
					}
				}

				setState(2177);
				basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_classordecltype);
		try {
			setState(2186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2181);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2184);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2185);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			_la = _input.LA(1);
			if ( !(((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (Private - 322)) | (1L << (Protected - 322)) | (1L << (Public - 322)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(Operator);
			setState(2193);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			typespecifierseq();
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2196);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			ptroperator();
			setState(2201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2200);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(Colon);
			setState(2204);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_meminitializerlist);
		int _la;
		try {
			setState(2217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				meminitializer();
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2207);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				meminitializer();
				setState(2212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2211);
					match(Ellipsis);
					}
				}

				setState(2214);
				match(Comma);
				setState(2215);
				meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_meminitializer);
		int _la;
		try {
			setState(2229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2219);
				meminitializerid();
				setState(2220);
				match(LeftParen);
				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (This - 320)) | (1L << (Throw - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (LeftBrace - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(2221);
					expressionlist();
					}
				}

				setState(2224);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				meminitializerid();
				setState(2227);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_meminitializerid);
		try {
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2231);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2232);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TheoperatorContext theoperator() {
			return getRuleContext(TheoperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(Operator);
			setState(2236);
			theoperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_literaloperatorid);
		try {
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				match(Operator);
				setState(2239);
				match(Stringliteral);
				setState(2240);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2241);
				match(Operator);
				setState(2242);
				match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(Template);
			setState(2246);
			match(Less);
			setState(2247);
			templateparameterlist(0);
			setState(2248);
			match(Greater);
			setState(2249);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2252);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2254);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2255);
					match(Comma);
					setState(2256);
					templateparameter();
					}
					} 
				}
				setState(2261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_templateparameter);
		try {
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2262);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2263);
				parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_typeparameter);
		int _la;
		try {
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2266);
				match(Class);
				setState(2268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2267);
					match(Ellipsis);
					}
					break;
				}
				setState(2271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2270);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				match(Class);
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2274);
					match(Identifier);
					}
				}

				setState(2277);
				match(Assign);
				setState(2278);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2279);
				match(Typename_);
				setState(2281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2280);
					match(Ellipsis);
					}
					break;
				}
				setState(2284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2283);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2286);
				match(Typename_);
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2287);
					match(Identifier);
					}
				}

				setState(2290);
				match(Assign);
				setState(2291);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2292);
				match(Template);
				setState(2293);
				match(Less);
				setState(2294);
				templateparameterlist(0);
				setState(2295);
				match(Greater);
				setState(2296);
				match(Class);
				setState(2298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2297);
					match(Ellipsis);
					}
					break;
				}
				setState(2301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2300);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2303);
				match(Template);
				setState(2304);
				match(Less);
				setState(2305);
				templateparameterlist(0);
				setState(2306);
				match(Greater);
				setState(2307);
				match(Class);
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2308);
					match(Identifier);
					}
				}

				setState(2311);
				match(Assign);
				setState(2312);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			templatename();
			setState(2317);
			match(Less);
			setState(2319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Enum - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
				{
				setState(2318);
				templateargumentlist(0);
				}
			}

			setState(2321);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_templateid);
		int _la;
		try {
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				operatorfunctionid();
				setState(2325);
				match(Less);
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Enum - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(2326);
					templateargumentlist(0);
					}
				}

				setState(2329);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2331);
				literaloperatorid();
				setState(2332);
				match(Less);
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (Alignof - 256)) | (1L << (Auto - 256)) | (1L << (Bool - 256)) | (1L << (Char - 256)) | (1L << (Char16 - 256)) | (1L << (Char32 - 256)) | (1L << (Class - 256)) | (1L << (Const - 256)) | (1L << (Const_cast - 256)) | (1L << (Decltype - 256)) | (1L << (Delete - 256)) | (1L << (Double - 256)) | (1L << (Dynamic_cast - 256)) | (1L << (Enum - 256)) | (1L << (False - 256)) | (1L << (Float - 256)) | (1L << (Int - 256)) | (1L << (Long - 256)) | (1L << (New - 256)) | (1L << (Noexcept - 256)) | (1L << (Nullptr - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Operator - 320)) | (1L << (Reinterpret_cast - 320)) | (1L << (Short - 320)) | (1L << (Signed - 320)) | (1L << (Sizeof - 320)) | (1L << (Static_cast - 320)) | (1L << (Struct - 320)) | (1L << (This - 320)) | (1L << (True - 320)) | (1L << (Typeid_ - 320)) | (1L << (Typename_ - 320)) | (1L << (Union - 320)) | (1L << (Unsigned - 320)) | (1L << (Void - 320)) | (1L << (Volatile - 320)) | (1L << (Wchar - 320)) | (1L << (LeftParen - 320)) | (1L << (LeftBracket - 320)) | (1L << (Plus - 320)) | (1L << (Minus - 320)) | (1L << (Star - 320)) | (1L << (And - 320)) | (1L << (Or - 320)) | (1L << (Tilde - 320)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (PlusPlus - 390)) | (1L << (MinusMinus - 390)) | (1L << (Doublecolon - 390)) | (1L << (Identifier - 390)) | (1L << (Integerliteral - 390)) | (1L << (Characterliteral - 390)) | (1L << (Floatingliteral - 390)) | (1L << (Stringliteral - 390)) | (1L << (Userdefinedintegerliteral - 390)) | (1L << (Userdefinedfloatingliteral - 390)) | (1L << (Userdefinedstringliteral - 390)) | (1L << (Userdefinedcharacterliteral - 390)))) != 0)) {
					{
					setState(2333);
					templateargumentlist(0);
					}
				}

				setState(2336);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 372;
		enterRecursionRule(_localctx, 372, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2343);
			templateargument();
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2344);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2347);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2348);
					match(Comma);
					setState(2349);
					templateargument();
					setState(2351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
					case 1:
						{
						setState(2350);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_templateargument);
		try {
			setState(2361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2358);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2359);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2360);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_typenamespecifier);
		int _la;
		try {
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2363);
				match(Typename_);
				setState(2364);
				nestednamespecifier(0);
				setState(2365);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2367);
				match(Typename_);
				setState(2368);
				nestednamespecifier(0);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2369);
					match(Template);
					}
				}

				setState(2372);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2376);
				match(Extern);
				}
			}

			setState(2379);
			match(Template);
			setState(2380);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			match(Template);
			setState(2383);
			match(Less);
			setState(2384);
			match(Greater);
			setState(2385);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			match(Try);
			setState(2388);
			compoundstatement();
			setState(2389);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(Try);
			setState(2393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2392);
				ctorinitializer();
				}
			}

			setState(2395);
			compoundstatement();
			setState(2396);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			handler();
			setState(2400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2399);
				handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			match(Catch);
			setState(2403);
			match(LeftParen);
			setState(2404);
			exceptiondeclaration();
			setState(2405);
			match(RightParen);
			setState(2406);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2408);
					attributespecifierseq(0);
					}
				}

				setState(2411);
				typespecifierseq();
				setState(2412);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2414);
					attributespecifierseq(0);
					}
				}

				setState(2417);
				typespecifierseq();
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (Decltype - 294)) | (1L << (LeftParen - 294)) | (1L << (LeftBracket - 294)))) != 0) || ((((_la - 361)) & ~0x3f) == 0 && ((1L << (_la - 361)) & ((1L << (Star - 361)) | (1L << (And - 361)) | (1L << (Doublecolon - 361)) | (1L << (Ellipsis - 361)) | (1L << (Identifier - 361)))) != 0)) {
					{
					setState(2418);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2421);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(Throw);
			setState(2426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2425);
				assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_exceptionspecification);
		try {
			setState(2430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2429);
				noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2432);
			match(Throw);
			setState(2433);
			match(LeftParen);
			setState(2435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__47 - 42)) | (1L << (T__48 - 42)) | (1L << (T__49 - 42)) | (1L << (T__50 - 42)) | (1L << (T__51 - 42)) | (1L << (T__52 - 42)) | (1L << (T__53 - 42)) | (1L << (T__54 - 42)) | (1L << (T__55 - 42)) | (1L << (T__56 - 42)) | (1L << (T__57 - 42)) | (1L << (T__58 - 42)) | (1L << (T__59 - 42)) | (1L << (T__60 - 42)) | (1L << (T__61 - 42)) | (1L << (T__62 - 42)) | (1L << (T__63 - 42)) | (1L << (T__64 - 42)) | (1L << (T__65 - 42)) | (1L << (T__66 - 42)) | (1L << (T__67 - 42)) | (1L << (T__68 - 42)) | (1L << (T__69 - 42)) | (1L << (T__70 - 42)) | (1L << (T__71 - 42)) | (1L << (T__72 - 42)) | (1L << (T__73 - 42)) | (1L << (T__74 - 42)) | (1L << (T__75 - 42)) | (1L << (T__76 - 42)) | (1L << (T__77 - 42)) | (1L << (T__78 - 42)) | (1L << (T__79 - 42)) | (1L << (T__80 - 42)) | (1L << (T__81 - 42)) | (1L << (T__82 - 42)) | (1L << (T__83 - 42)) | (1L << (T__84 - 42)) | (1L << (T__85 - 42)) | (1L << (T__86 - 42)) | (1L << (T__87 - 42)) | (1L << (T__88 - 42)) | (1L << (T__89 - 42)) | (1L << (T__90 - 42)) | (1L << (T__91 - 42)) | (1L << (T__92 - 42)) | (1L << (T__93 - 42)) | (1L << (T__94 - 42)) | (1L << (T__95 - 42)) | (1L << (T__96 - 42)) | (1L << (T__97 - 42)) | (1L << (T__98 - 42)) | (1L << (T__99 - 42)) | (1L << (T__100 - 42)) | (1L << (T__101 - 42)) | (1L << (T__102 - 42)) | (1L << (T__103 - 42)) | (1L << (T__104 - 42)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (T__105 - 106)) | (1L << (T__106 - 106)) | (1L << (T__107 - 106)) | (1L << (T__108 - 106)) | (1L << (T__109 - 106)) | (1L << (T__110 - 106)) | (1L << (T__111 - 106)) | (1L << (T__112 - 106)) | (1L << (T__113 - 106)) | (1L << (T__114 - 106)) | (1L << (T__115 - 106)) | (1L << (T__116 - 106)) | (1L << (T__117 - 106)) | (1L << (T__118 - 106)) | (1L << (T__119 - 106)) | (1L << (T__120 - 106)) | (1L << (T__121 - 106)) | (1L << (T__122 - 106)) | (1L << (T__123 - 106)) | (1L << (T__124 - 106)) | (1L << (T__125 - 106)) | (1L << (T__126 - 106)) | (1L << (T__127 - 106)) | (1L << (T__128 - 106)) | (1L << (T__129 - 106)) | (1L << (T__130 - 106)) | (1L << (T__131 - 106)) | (1L << (T__132 - 106)) | (1L << (T__133 - 106)) | (1L << (T__134 - 106)) | (1L << (T__135 - 106)) | (1L << (T__136 - 106)) | (1L << (T__137 - 106)) | (1L << (T__138 - 106)) | (1L << (T__139 - 106)) | (1L << (T__140 - 106)) | (1L << (T__141 - 106)) | (1L << (T__142 - 106)) | (1L << (T__143 - 106)) | (1L << (T__144 - 106)) | (1L << (T__145 - 106)) | (1L << (T__146 - 106)) | (1L << (T__147 - 106)) | (1L << (T__148 - 106)) | (1L << (T__149 - 106)) | (1L << (T__150 - 106)) | (1L << (T__151 - 106)) | (1L << (T__152 - 106)) | (1L << (T__153 - 106)) | (1L << (T__154 - 106)) | (1L << (T__155 - 106)) | (1L << (T__156 - 106)) | (1L << (T__157 - 106)) | (1L << (T__158 - 106)) | (1L << (T__159 - 106)) | (1L << (T__160 - 106)) | (1L << (T__161 - 106)) | (1L << (T__162 - 106)) | (1L << (T__163 - 106)) | (1L << (T__164 - 106)) | (1L << (T__165 - 106)) | (1L << (T__166 - 106)) | (1L << (T__167 - 106)) | (1L << (T__168 - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (T__169 - 170)) | (1L << (T__170 - 170)) | (1L << (T__171 - 170)) | (1L << (T__172 - 170)) | (1L << (T__173 - 170)) | (1L << (T__174 - 170)) | (1L << (T__175 - 170)) | (1L << (T__176 - 170)) | (1L << (T__177 - 170)) | (1L << (T__178 - 170)) | (1L << (T__179 - 170)) | (1L << (T__180 - 170)) | (1L << (T__181 - 170)) | (1L << (T__182 - 170)) | (1L << (T__183 - 170)) | (1L << (T__184 - 170)) | (1L << (T__185 - 170)) | (1L << (T__186 - 170)) | (1L << (T__187 - 170)) | (1L << (T__188 - 170)) | (1L << (T__189 - 170)) | (1L << (T__190 - 170)) | (1L << (T__191 - 170)) | (1L << (T__192 - 170)) | (1L << (T__193 - 170)) | (1L << (T__194 - 170)) | (1L << (T__195 - 170)) | (1L << (T__196 - 170)) | (1L << (T__197 - 170)) | (1L << (T__198 - 170)) | (1L << (T__199 - 170)) | (1L << (T__200 - 170)) | (1L << (T__201 - 170)) | (1L << (T__202 - 170)) | (1L << (T__203 - 170)) | (1L << (T__204 - 170)) | (1L << (T__205 - 170)) | (1L << (T__206 - 170)) | (1L << (T__207 - 170)) | (1L << (T__208 - 170)) | (1L << (T__209 - 170)) | (1L << (T__210 - 170)) | (1L << (T__211 - 170)) | (1L << (T__212 - 170)) | (1L << (T__213 - 170)) | (1L << (T__214 - 170)) | (1L << (T__215 - 170)) | (1L << (T__216 - 170)) | (1L << (T__217 - 170)) | (1L << (T__218 - 170)) | (1L << (T__219 - 170)) | (1L << (T__220 - 170)) | (1L << (T__221 - 170)) | (1L << (T__222 - 170)) | (1L << (T__223 - 170)) | (1L << (T__224 - 170)) | (1L << (T__225 - 170)) | (1L << (T__226 - 170)) | (1L << (T__227 - 170)) | (1L << (T__228 - 170)) | (1L << (T__229 - 170)) | (1L << (T__230 - 170)) | (1L << (T__231 - 170)) | (1L << (T__232 - 170)))) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (T__233 - 234)) | (1L << (T__234 - 234)) | (1L << (T__235 - 234)) | (1L << (T__236 - 234)) | (1L << (T__237 - 234)) | (1L << (T__238 - 234)) | (1L << (T__239 - 234)) | (1L << (T__240 - 234)) | (1L << (T__241 - 234)) | (1L << (T__242 - 234)) | (1L << (T__243 - 234)) | (1L << (T__244 - 234)) | (1L << (T__245 - 234)) | (1L << (T__246 - 234)) | (1L << (T__247 - 234)) | (1L << (T__248 - 234)) | (1L << (T__249 - 234)) | (1L << (T__250 - 234)) | (1L << (T__251 - 234)) | (1L << (T__252 - 234)) | (1L << (T__253 - 234)) | (1L << (T__254 - 234)) | (1L << (T__255 - 234)) | (1L << (T__256 - 234)) | (1L << (T__257 - 234)) | (1L << (T__258 - 234)) | (1L << (T__259 - 234)) | (1L << (T__260 - 234)) | (1L << (T__261 - 234)) | (1L << (T__262 - 234)) | (1L << (T__263 - 234)) | (1L << (T__264 - 234)) | (1L << (T__265 - 234)) | (1L << (T__266 - 234)) | (1L << (T__267 - 234)) | (1L << (T__268 - 234)) | (1L << (T__269 - 234)) | (1L << (T__270 - 234)) | (1L << (T__271 - 234)) | (1L << (T__272 - 234)) | (1L << (T__273 - 234)) | (1L << (T__274 - 234)) | (1L << (Auto - 234)) | (1L << (Bool - 234)) | (1L << (Char - 234)) | (1L << (Char16 - 234)) | (1L << (Char32 - 234)) | (1L << (Class - 234)) | (1L << (Const - 234)) | (1L << (Decltype - 234)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (Double - 298)) | (1L << (Enum - 298)) | (1L << (Float - 298)) | (1L << (Int - 298)) | (1L << (Long - 298)) | (1L << (Short - 298)) | (1L << (Signed - 298)) | (1L << (Struct - 298)) | (1L << (Typename_ - 298)) | (1L << (Union - 298)) | (1L << (Unsigned - 298)) | (1L << (Void - 298)) | (1L << (Volatile - 298)) | (1L << (Wchar - 298)))) != 0) || _la==Doublecolon || _la==Identifier) {
				{
				setState(2434);
				typeidlist(0);
				}
			}

			setState(2437);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2440);
			thetypeid();
			setState(2442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2441);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2444);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2445);
					match(Comma);
					setState(2446);
					thetypeid();
					setState(2448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
					case 1:
						{
						setState(2447);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_noexceptspecification);
		try {
			setState(2461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2455);
				match(Noexcept);
				setState(2456);
				match(LeftParen);
				setState(2457);
				constantexpression();
				setState(2458);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2460);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_theoperator);
		try {
			setState(2514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2463);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2465);
				match(New);
				setState(2466);
				match(LeftBracket);
				setState(2467);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2468);
				match(Delete);
				setState(2469);
				match(LeftBracket);
				setState(2470);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2471);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2472);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2473);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2474);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2475);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2476);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2477);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2478);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2479);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2480);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2481);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2482);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2483);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2484);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2485);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2486);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2487);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2488);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2489);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2490);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2491);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2492);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2493);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2494);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2495);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2496);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2497);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2498);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2499);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2500);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2501);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2502);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2503);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2504);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2505);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2506);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2507);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2508);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2509);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2510);
				match(LeftParen);
				setState(2511);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2512);
				match(LeftBracket);
				setState(2513);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_literal);
		try {
			setState(2523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2516);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2517);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2518);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2519);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2520);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2521);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2522);
				userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			_la = _input.LA(1);
			if ( !(((((_la - 413)) & ~0x3f) == 0 && ((1L << (_la - 413)) & ((1L << (Userdefinedintegerliteral - 413)) | (1L << (Userdefinedfloatingliteral - 413)) | (1L << (Userdefinedstringliteral - 413)) | (1L << (Userdefinedcharacterliteral - 413)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 26:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 31:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 32:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 33:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 34:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 36:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 37:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 38:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 39:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 40:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 41:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 42:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 52:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 61:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 94:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 112:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 115:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 121:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 123:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 127:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 138:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 140:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 142:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 149:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 159:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 161:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 165:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 180:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 186:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 199:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 4);
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 2);
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 2);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 3);
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 3);
		case 48:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01a6\u09e6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\3\2\5\2\u01a0\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01ac\n\3\3\4\3\4\5\4\u01b0\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01bb\n\5\3\6\3\6\5\6\u01bf\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01ce\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u01d5\n\7\3\7\3\7\3\7\7\7\u01da\n\7\f\7\16\7\u01dd\13"+
		"\7\3\b\3\b\5\b\u01e1\n\b\3\b\3\b\3\t\3\t\5\t\u01e7\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u01f1\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01f8\n\f\3\f"+
		"\3\f\3\f\3\f\5\f\u01fe\n\f\7\f\u0200\n\f\f\f\16\f\u0203\13\f\3\r\3\r\5"+
		"\r\u0207\n\r\3\16\3\16\3\16\3\16\5\16\u020d\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0214\n\17\3\20\3\20\3\20\3\20\5\20\u021a\n\20\3\20\5\20\u021d"+
		"\n\20\3\20\5\20\u0220\n\20\3\20\5\20\u0223\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u022a\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0231\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0265\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0274\n\21\3\21\3\21\3\21"+
		"\3\21\5\21\u027a\n\21\3\21\3\21\3\21\3\21\5\21\u0280\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u028d\n\21\f\21\16\21"+
		"\u0290\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u0299\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a8"+
		"\n\25\3\25\3\25\3\25\3\25\5\25\u02ae\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02cc\n\26\3\27\3\27\3\30"+
		"\5\30\u02d1\n\30\3\30\3\30\5\30\u02d5\n\30\3\30\3\30\5\30\u02d9\n\30\3"+
		"\30\5\30\u02dc\n\30\3\30\3\30\5\30\u02e0\n\30\3\30\3\30\3\30\3\30\5\30"+
		"\u02e6\n\30\5\30\u02e8\n\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u02f0\n"+
		"\32\3\33\3\33\5\33\u02f4\n\33\3\33\5\33\u02f7\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02fe\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0305\n\34\7\34\u0307"+
		"\n\34\f\34\16\34\u030a\13\34\3\35\3\35\5\35\u030e\n\35\3\35\3\35\5\35"+
		"\u0312\n\35\3\36\5\36\u0315\n\36\3\36\3\36\3\36\5\36\u031a\n\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0320\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \5 \u032d\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0338\n!\f!\16!\u033b\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0349\n\"\f\"\16"+
		"\"\u034c\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0357\n#\f#\16#\u035a\13#"+
		"\3$\3$\3$\3$\3$\3$\3$\7$\u0363\n$\f$\16$\u0366\13$\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0379\n&\f&\16&\u037c\13&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0387\n\'\f\'\16\'\u038a\13\'\3(\3(\3("+
		"\3(\3(\3(\7(\u0392\n(\f(\16(\u0395\13(\3)\3)\3)\3)\3)\3)\7)\u039d\n)\f"+
		")\16)\u03a0\13)\3*\3*\3*\3*\3*\3*\7*\u03a8\n*\f*\16*\u03ab\13*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\7+\u03b6\n+\f+\16+\u03b9\13+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\7,\u03c4\n,\f,\16,\u03c7\13,\3-\3-\3-\3-\3-\3-\3-\5-\u03d0\n-\3"+
		".\3.\3.\3.\3.\3.\5.\u03d8\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u03e2\n\60\f\60\16\60\u03e5\13\60\3\61\3\61\3\62\3\62\5\62\u03eb\n\62"+
		"\3\62\3\62\5\62\u03ef\n\62\3\62\3\62\5\62\u03f3\n\62\3\62\3\62\5\62\u03f7"+
		"\n\62\3\62\3\62\5\62\u03fb\n\62\3\62\3\62\3\62\5\62\u0400\n\62\3\62\5"+
		"\62\u0403\n\62\3\63\5\63\u0406\n\63\3\63\3\63\3\63\3\63\5\63\u040c\n\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0414\n\63\3\63\3\63\3\63\5\63\u0419"+
		"\n\63\3\64\5\64\u041c\n\64\3\64\3\64\3\65\3\65\5\65\u0422\n\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\7\66\u042b\n\66\f\66\16\66\u042e\13\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u0444\n\67\38\38\58\u0448\n8\38\38\3"+
		"8\38\38\38\58\u0450\n8\38\38\38\38\58\u0456\n8\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\59\u046a\n9\39\39\59\u046e\n9\39\39\3"+
		"9\39\39\39\39\39\39\39\39\59\u047b\n9\3:\3:\5:\u047f\n:\3;\5;\u0482\n"+
		";\3;\3;\3;\3<\3<\5<\u0489\n<\3=\3=\3=\3=\3=\3=\5=\u0491\n=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\5=\u049b\n=\3>\3>\3?\3?\3?\3?\3?\7?\u04a4\n?\f?\16?\u04a7"+
		"\13?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b2\n@\3A\3A\3A\3A\3A\3A\3A\3A\5"+
		"A\u04bc\nA\3B\3B\3B\5B\u04c1\nB\3B\3B\3B\3B\3C\5C\u04c8\nC\3C\5C\u04cb"+
		"\nC\3C\3C\3C\5C\u04d0\nC\3C\3C\3C\5C\u04d5\nC\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04ec\nG\3H\3H\3H\5H\u04f1"+
		"\nH\3I\3I\5I\u04f5\nI\3I\3I\3I\5I\u04fa\nI\3J\3J\3J\3J\3J\3J\5J\u0502"+
		"\nJ\3K\3K\5K\u0506\nK\3K\3K\3K\3K\5K\u050c\nK\3K\3K\5K\u0510\nK\3K\3K"+
		"\5K\u0514\nK\3L\3L\3L\7L\u0519\nL\fL\16L\u051c\13L\3L\3L\3M\3M\3N\3N\3"+
		"N\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\5Q\u052e\nQ\3R\3R\3S\3S\3S\3S\5S\u0536\n"+
		"S\3T\3T\5T\u053a\nT\3T\3T\3T\5T\u053f\nT\3U\3U\5U\u0543\nU\3U\3U\3U\5"+
		"U\u0548\nU\3V\5V\u054b\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\5V\u0562\nV\3W\3W\3W\3W\5W\u0568\nW\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\5X\u0573\nX\3Y\3Y\5Y\u0577\nY\3Y\5Y\u057a\nY\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\5Y\u0584\nY\3Y\3Y\3Y\3Y\5Y\u058a\nY\3Y\5Y\u058d\nY\3Z\3"+
		"Z\3[\3[\3[\5[\u0594\n[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u059e\n[\3\\\3\\\5\\"+
		"\u05a2\n\\\3\\\5\\\u05a5\n\\\3\\\5\\\u05a8\n\\\3\\\3\\\5\\\u05ac\n\\\3"+
		"\\\3\\\3\\\5\\\u05b1\n\\\5\\\u05b3\n\\\3]\3]\5]\u05b7\n]\3]\3]\5]\u05bb"+
		"\n]\3]\3]\3^\3^\3^\3^\3^\5^\u05c4\n^\3_\3_\3_\3`\3`\3`\3`\3`\3`\7`\u05cf"+
		"\n`\f`\16`\u05d2\13`\3a\3a\3a\3a\3a\5a\u05d9\na\3b\3b\3c\3c\5c\u05df\n"+
		"c\3d\3d\3e\3e\5e\u05e5\ne\3f\3f\5f\u05e9\nf\3g\5g\u05ec\ng\3g\3g\3g\3"+
		"g\3g\3g\3h\5h\u05f5\nh\3h\3h\3h\3h\3h\3h\3i\5i\u05fe\ni\3i\3i\3i\3i\3"+
		"i\3j\5j\u0606\nj\3k\3k\3l\3l\3l\3l\3l\3l\3m\5m\u0611\nm\3m\3m\3n\3n\5"+
		"n\u0617\nn\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0622\nn\3o\5o\u0625\no\3o\3"+
		"o\3o\5o\u062a\no\3o\3o\3o\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\5q\u0639\nq\3"+
		"q\3q\3q\3q\5q\u063f\nq\3r\3r\3r\3r\3r\7r\u0646\nr\fr\16r\u0649\13r\3s"+
		"\3s\3s\3s\3s\3s\3s\5s\u0652\ns\3t\3t\3t\3t\5t\u0658\nt\3t\3t\3t\3t\3t"+
		"\3t\5t\u0660\nt\3t\3t\5t\u0664\nt\3u\3u\5u\u0668\nu\3u\3u\3u\5u\u066d"+
		"\nu\3u\3u\3u\5u\u0672\nu\3u\3u\3u\3u\3u\7u\u0679\nu\fu\16u\u067c\13u\3"+
		"v\3v\5v\u0680\nv\3w\3w\5w\u0684\nw\3x\3x\3x\3x\3y\3y\3z\3z\3z\3z\3{\3"+
		"{\5{\u0692\n{\3{\3{\7{\u0696\n{\f{\16{\u0699\13{\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\6|\u06a8\n|\r|\16|\u06a9\5|\u06ac\n|\3}\3}\3}\3}\3"+
		"}\3}\7}\u06b4\n}\f}\16}\u06b7\13}\3~\3~\5~\u06bb\n~\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u06c2\n\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u06c8\n\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u06cd\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\5\u0081\u06d3\n\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u06da\n\u0081\3\u0081\3\u0081\5\u0081\u06de\n\u0081"+
		"\7\u0081\u06e0\n\u0081\f\u0081\16\u0081\u06e3\13\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u06e9\n\u0082\3\u0082\5\u0082\u06ec\n\u0082\3"+
		"\u0082\5\u0082\u06ef\n\u0082\3\u0082\5\u0082\u06f2\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u06f7\n\u0083\3\u0084\3\u0084\5\u0084\u06fb\n\u0084\3"+
		"\u0084\5\u0084\u06fe\n\u0084\3\u0084\3\u0084\5\u0084\u0702\n\u0084\3\u0084"+
		"\3\u0084\5\u0084\u0706\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u070b\n"+
		"\u0084\3\u0084\5\u0084\u070e\n\u0084\5\u0084\u0710\n\u0084\3\u0085\3\u0085"+
		"\5\u0085\u0714\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\5\u0088"+
		"\u071b\n\u0088\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u0721\n\u0089\3"+
		"\u008a\3\u008a\5\u008a\u0725\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5"+
		"\u008a\u072b\n\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0730\n\u008b\5\u008b"+
		"\u0732\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0738\n\u008c\3"+
		"\u008c\3\u008c\5\u008c\u073c\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5"+
		"\u008c\u0742\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0749"+
		"\n\u008c\3\u008c\3\u008c\5\u008c\u074d\n\u008c\7\u008c\u074f\n\u008c\f"+
		"\u008c\16\u008c\u0752\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0758\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0762\n\u008e\3\u008e\3\u008e\5\u008e\u0766\n\u008e\7"+
		"\u008e\u0768\n\u008e\f\u008e\16\u008e\u076b\13\u008e\3\u008f\5\u008f\u076e"+
		"\n\u008f\3\u008f\5\u008f\u0771\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u0777\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\7\u0090\u077f\n\u0090\f\u0090\16\u0090\u0782\13\u0090\3\u0091\5\u0091"+
		"\u0785\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u078b\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0793\n\u0091\3"+
		"\u0091\3\u0091\5\u0091\u0797\n\u0091\3\u0091\5\u0091\u079a\n\u0091\3\u0091"+
		"\3\u0091\5\u0091\u079e\n\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u07a3\n"+
		"\u0091\3\u0092\5\u0092\u07a6\n\u0092\3\u0092\5\u0092\u07a9\n\u0092\3\u0092"+
		"\3\u0092\5\u0092\u07ad\n\u0092\3\u0092\3\u0092\3\u0093\5\u0093\u07b2\n"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\5\u0093\u07bc\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u07c3\n\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u07c8\n\u0095\3\u0096\3"+
		"\u0096\5\u0096\u07cc\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u07d1\n\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07d7\n\u0097\7\u0097\u07d9\n"+
		"\u0097\f\u0097\16\u0097\u07dc\13\u0097\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u07e1\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u07e7\n\u0098\3"+
		"\u0099\3\u0099\5\u0099\u07eb\n\u0099\3\u009a\3\u009a\3\u009a\5\u009a\u07f0"+
		"\n\u009a\3\u009a\3\u009a\3\u009b\3\u009b\5\u009b\u07f6\n\u009b\3\u009b"+
		"\3\u009b\5\u009b\u07fa\n\u009b\3\u009b\5\u009b\u07fd\n\u009b\3\u009b\3"+
		"\u009b\5\u009b\u0801\n\u009b\3\u009b\5\u009b\u0804\n\u009b\5\u009b\u0806"+
		"\n\u009b\3\u009c\5\u009c\u0809\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\5\u009f\u0813\n\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u0818\n\u009f\5\u009f\u081a\n\u009f\3\u00a0\5\u00a0\u081d"+
		"\n\u00a0\3\u00a0\5\u00a0\u0820\n\u00a0\3\u00a0\5\u00a0\u0823\n\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u082c\n"+
		"\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0834\n"+
		"\u00a1\f\u00a1\16\u00a1\u0837\13\u00a1\3\u00a2\3\u00a2\5\u00a2\u083b\n"+
		"\u00a2\3\u00a2\5\u00a2\u083e\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0842\n\u00a2"+
		"\3\u00a2\5\u00a2\u0845\n\u00a2\3\u00a2\5\u00a2\u0848\n\u00a2\3\u00a2\3"+
		"\u00a2\5\u00a2\u084c\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7"+
		"\u00a3\u0853\n\u00a3\f\u00a3\16\u00a3\u0856\13\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u0864\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u086a\n\u00a7\7\u00a7\u086c\n\u00a7\f\u00a7\16\u00a7\u086f\13\u00a7\3"+
		"\u00a8\5\u00a8\u0872\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0876\n\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u087a\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u087e\n\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u0882\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0886\n\u00a8"+
		"\3\u00a9\5\u00a9\u0889\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u088d\n\u00a9\3"+
		"\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\5\u00ad\u0898\n\u00ad\3\u00ae\3\u00ae\5\u00ae\u089c\n\u00ae\3\u00af\3"+
		"\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0\u08a3\n\u00b0\3\u00b0\3\u00b0\5"+
		"\u00b0\u08a7\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08ac\n\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u08b1\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u08b8\n\u00b1\3\u00b2\3\u00b2\5\u00b2\u08bc\n\u00b2\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4"+
		"\u08c6\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u08d4\n\u00b6\f\u00b6"+
		"\16\u00b6\u08d7\13\u00b6\3\u00b7\3\u00b7\5\u00b7\u08db\n\u00b7\3\u00b8"+
		"\3\u00b8\5\u00b8\u08df\n\u00b8\3\u00b8\5\u00b8\u08e2\n\u00b8\3\u00b8\3"+
		"\u00b8\5\u00b8\u08e6\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u08ec"+
		"\n\u00b8\3\u00b8\5\u00b8\u08ef\n\u00b8\3\u00b8\3\u00b8\5\u00b8\u08f3\n"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u08fd\n\u00b8\3\u00b8\5\u00b8\u0900\n\u00b8\3\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0908\n\u00b8\3\u00b8\3\u00b8\3"+
		"\u00b8\5\u00b8\u090d\n\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0912\n\u00b9"+
		"\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u091a\n\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0921\n\u00ba\3\u00ba"+
		"\3\u00ba\5\u00ba\u0925\n\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u092c\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0932\n"+
		"\u00bc\7\u00bc\u0934\n\u00bc\f\u00bc\16\u00bc\u0937\13\u00bc\3\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u093c\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\5\u00be\u0945\n\u00be\3\u00be\3\u00be\5\u00be\u0949"+
		"\n\u00be\3\u00bf\5\u00bf\u094c\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2"+
		"\3\u00c2\5\u00c2\u095c\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\5\u00c3\u0963\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c5\5\u00c5\u096c\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u0972\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u0976\n\u00c5\3\u00c5\5\u00c5\u0979"+
		"\n\u00c5\3\u00c6\3\u00c6\5\u00c6\u097d\n\u00c6\3\u00c7\3\u00c7\5\u00c7"+
		"\u0981\n\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0986\n\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u098d\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\5\u00c9\u0993\n\u00c9\7\u00c9\u0995\n\u00c9\f\u00c9\16"+
		"\u00c9\u0998\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u09a0\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u09d5\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u09de\n\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf"+
		"\3\u00cf\3\u00cf\2$\f\26 \66@BDFJLNPRTV^j|\u00be\u00e2\u00e8\u00f4\u00f8"+
		"\u0100\u0116\u011a\u011e\u012c\u0140\u0144\u014c\u016a\u0176\u0190\u00d0"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\2\22\4\2\u016f\u016f\u0173\u0173\5\2\3\4\u0169"+
		"\u016b\u016f\u0171\3\2\u017e\u017f\5\2\u0173\u0173\u0176\u017d\u0180\u0181"+
		"\3\2\u0163\u0164\3\2\21\60\5\2\u0130\u0130\u013a\u013a\u015e\u015e\5\2"+
		",,\62\u0115\u0161\u0161\3\2\u0163\u0168\4\2\u0124\u0124\u0160\u0160\4"+
		"\2\5\5\u016f\u016f\5\2\u0123\u0123\u0150\u0150\u015b\u015b\4\2\u0134\u0134"+
		"\u0143\u0143\3\2\u0144\u0146\4\2\u0133\u0133\u0156\u0156\3\2\u019f\u01a2"+
		"\2\u0b11\2\u019f\3\2\2\2\4\u01ab\3\2\2\2\6\u01af\3\2\2\2\b\u01ba\3\2\2"+
		"\2\n\u01bc\3\2\2\2\f\u01cd\3\2\2\2\16\u01de\3\2\2\2\20\u01e4\3\2\2\2\22"+
		"\u01f0\3\2\2\2\24\u01f2\3\2\2\2\26\u01f4\3\2\2\2\30\u0206\3\2\2\2\32\u020c"+
		"\3\2\2\2\34\u0213\3\2\2\2\36\u0215\3\2\2\2 \u0264\3\2\2\2\"\u0291\3\2"+
		"\2\2$\u0293\3\2\2\2&\u0295\3\2\2\2(\u02ad\3\2\2\2*\u02cb\3\2\2\2,\u02cd"+
		"\3\2\2\2.\u02e7\3\2\2\2\60\u02e9\3\2\2\2\62\u02ed\3\2\2\2\64\u02f6\3\2"+
		"\2\2\66\u02f8\3\2\2\28\u0311\3\2\2\2:\u031f\3\2\2\2<\u0321\3\2\2\2>\u032c"+
		"\3\2\2\2@\u032e\3\2\2\2B\u033c\3\2\2\2D\u034d\3\2\2\2F\u035b\3\2\2\2H"+
		"\u0367\3\2\2\2J\u0369\3\2\2\2L\u037d\3\2\2\2N\u038b\3\2\2\2P\u0396\3\2"+
		"\2\2R\u03a1\3\2\2\2T\u03ac\3\2\2\2V\u03ba\3\2\2\2X\u03cf\3\2\2\2Z\u03d7"+
		"\3\2\2\2\\\u03d9\3\2\2\2^\u03db\3\2\2\2`\u03e6\3\2\2\2b\u0402\3\2\2\2"+
		"d\u0418\3\2\2\2f\u041b\3\2\2\2h\u041f\3\2\2\2j\u0425\3\2\2\2l\u0443\3"+
		"\2\2\2n\u0455\3\2\2\2p\u047a\3\2\2\2r\u047e\3\2\2\2t\u0481\3\2\2\2v\u0488"+
		"\3\2\2\2x\u049a\3\2\2\2z\u049c\3\2\2\2|\u049e\3\2\2\2~\u04b1\3\2\2\2\u0080"+
		"\u04bb\3\2\2\2\u0082\u04bd\3\2\2\2\u0084\u04d4\3\2\2\2\u0086\u04d6\3\2"+
		"\2\2\u0088\u04de\3\2\2\2\u008a\u04e0\3\2\2\2\u008c\u04eb\3\2\2\2\u008e"+
		"\u04f0\3\2\2\2\u0090\u04f9\3\2\2\2\u0092\u0501\3\2\2\2\u0094\u0513\3\2"+
		"\2\2\u0096\u0515\3\2\2\2\u0098\u051f\3\2\2\2\u009a\u0521\3\2\2\2\u009c"+
		"\u0526\3\2\2\2\u009e\u0528\3\2\2\2\u00a0\u052d\3\2\2\2\u00a2\u052f\3\2"+
		"\2\2\u00a4\u0535\3\2\2\2\u00a6\u053e\3\2\2\2\u00a8\u0547\3\2\2\2\u00aa"+
		"\u0561\3\2\2\2\u00ac\u0567\3\2\2\2\u00ae\u0572\3\2\2\2\u00b0\u058c\3\2"+
		"\2\2\u00b2\u058e\3\2\2\2\u00b4\u059d\3\2\2\2\u00b6\u05b2\3\2\2\2\u00b8"+
		"\u05b4\3\2\2\2\u00ba\u05c3\3\2\2\2\u00bc\u05c5\3\2\2\2\u00be\u05c8\3\2"+
		"\2\2\u00c0\u05d8\3\2\2\2\u00c2\u05da\3\2\2\2\u00c4\u05de\3\2\2\2\u00c6"+
		"\u05e0\3\2\2\2\u00c8\u05e4\3\2\2\2\u00ca\u05e8\3\2\2\2\u00cc\u05eb\3\2"+
		"\2\2\u00ce\u05f4\3\2\2\2\u00d0\u05fd\3\2\2\2\u00d2\u0605\3\2\2\2\u00d4"+
		"\u0607\3\2\2\2\u00d6\u0609\3\2\2\2\u00d8\u0610\3\2\2\2\u00da\u0621\3\2"+
		"\2\2\u00dc\u0624\3\2\2\2\u00de\u062e\3\2\2\2\u00e0\u063e\3\2\2\2\u00e2"+
		"\u0640\3\2\2\2\u00e4\u0651\3\2\2\2\u00e6\u0663\3\2\2\2\u00e8\u066c\3\2"+
		"\2\2\u00ea\u067d\3\2\2\2\u00ec\u0683\3\2\2\2\u00ee\u0685\3\2\2\2\u00f0"+
		"\u0689\3\2\2\2\u00f2\u068b\3\2\2\2\u00f4\u068f\3\2\2\2\u00f6\u06ab\3\2"+
		"\2\2\u00f8\u06ad\3\2\2\2\u00fa\u06b8\3\2\2\2\u00fc\u06c1\3\2\2\2\u00fe"+
		"\u06c7\3\2\2\2\u0100\u06d2\3\2\2\2\u0102\u06e4\3\2\2\2\u0104\u06f3\3\2"+
		"\2\2\u0106\u070f\3\2\2\2\u0108\u0711\3\2\2\2\u010a\u0715\3\2\2\2\u010c"+
		"\u0717\3\2\2\2\u010e\u071a\3\2\2\2\u0110\u071e\3\2\2\2\u0112\u072a\3\2"+
		"\2\2\u0114\u0731\3\2\2\2\u0116\u0741\3\2\2\2\u0118\u0757\3\2\2\2\u011a"+
		"\u0759\3\2\2\2\u011c\u0776\3\2\2\2\u011e\u0778\3\2\2\2\u0120\u07a2\3\2"+
		"\2\2\u0122\u07a5\3\2\2\2\u0124\u07bb\3\2\2\2\u0126\u07c2\3\2\2\2\u0128"+
		"\u07c7\3\2\2\2\u012a\u07cb\3\2\2\2\u012c\u07cd\3\2\2\2\u012e\u07e6\3\2"+
		"\2\2\u0130\u07ea\3\2\2\2\u0132\u07ec\3\2\2\2\u0134\u0805\3\2\2\2\u0136"+
		"\u0808\3\2\2\2\u0138\u080c\3\2\2\2\u013a\u080e\3\2\2\2\u013c\u0819\3\2"+
		"\2\2\u013e\u082b\3\2\2\2\u0140\u082d\3\2\2\2\u0142\u084b\3\2\2\2\u0144"+
		"\u084d\3\2\2\2\u0146\u0857\3\2\2\2\u0148\u0859\3\2\2\2\u014a\u085d\3\2"+
		"\2\2\u014c\u0860\3\2\2\2\u014e\u0885\3\2\2\2\u0150\u088c\3\2\2\2\u0152"+
		"\u088e\3\2\2\2\u0154\u0890\3\2\2\2\u0156\u0892\3\2\2\2\u0158\u0895\3\2"+
		"\2\2\u015a\u0899\3\2\2\2\u015c\u089d\3\2\2\2\u015e\u08ab\3\2\2\2\u0160"+
		"\u08b7\3\2\2\2\u0162\u08bb\3\2\2\2\u0164\u08bd\3\2\2\2\u0166\u08c5\3\2"+
		"\2\2\u0168\u08c7\3\2\2\2\u016a\u08cd\3\2\2\2\u016c\u08da\3\2\2\2\u016e"+
		"\u090c\3\2\2\2\u0170\u090e\3\2\2\2\u0172\u0924\3\2\2\2\u0174\u0926\3\2"+
		"\2\2\u0176\u0928\3\2\2\2\u0178\u093b\3\2\2\2\u017a\u0948\3\2\2\2\u017c"+
		"\u094b\3\2\2\2\u017e\u0950\3\2\2\2\u0180\u0955\3\2\2\2\u0182\u0959\3\2"+
		"\2\2\u0184\u0960\3\2\2\2\u0186\u0964\3\2\2\2\u0188\u0978\3\2\2\2\u018a"+
		"\u097a\3\2\2\2\u018c\u0980\3\2\2\2\u018e\u0982\3\2\2\2\u0190\u0989\3\2"+
		"\2\2\u0192\u099f\3\2\2\2\u0194\u09d4\3\2\2\2\u0196\u09dd\3\2\2\2\u0198"+
		"\u09df\3\2\2\2\u019a\u09e1\3\2\2\2\u019c\u09e3\3\2\2\2\u019e\u01a0\5|"+
		"?\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\7\2\2\3\u01a2\3\3\2\2\2\u01a3\u01ac\5\u0196\u00cc\2\u01a4\u01ac"+
		"\7\u0153\2\2\u01a5\u01a6\7\u0163\2\2\u01a6\u01a7\5^\60\2\u01a7\u01a8\7"+
		"\u0164\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01ac\5\6\4\2\u01aa\u01ac\5\16\b"+
		"\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\5\3\2\2\2\u01ad\u01b0\5\b\5\2\u01ae"+
		"\u01b0\5\n\6\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\7\3\2\2\2"+
		"\u01b1\u01bb\7\u0195\2\2\u01b2\u01bb\5\u0164\u00b3\2\u01b3\u01bb\5\u0156"+
		"\u00ac\2\u01b4\u01bb\5\u0166\u00b4\2\u01b5\u01b6\7\u0171\2\2\u01b6\u01bb"+
		"\5\u0130\u0099\2\u01b7\u01b8\7\u0171\2\2\u01b8\u01bb\5\u00aeX\2\u01b9"+
		"\u01bb\5\u0172\u00ba\2\u01ba\u01b1\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3"+
		"\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\t\3\2\2\2\u01bc\u01be\5\f\7\2\u01bd\u01bf\7\u0152"+
		"\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\5\b\5\2\u01c1\13\3\2\2\2\u01c2\u01c3\b\7\1\2\u01c3\u01ce\7\u018f"+
		"\2\2\u01c4\u01c5\5\u00acW\2\u01c5\u01c6\7\u018f\2\2\u01c6\u01ce\3\2\2"+
		"\2\u01c7\u01c8\5\u00c4c\2\u01c8\u01c9\7\u018f\2\2\u01c9\u01ce\3\2\2\2"+
		"\u01ca\u01cb\5\u00aeX\2\u01cb\u01cc\7\u018f\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01c2\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01ca\3\2"+
		"\2\2\u01ce\u01db\3\2\2\2\u01cf\u01d0\f\4\2\2\u01d0\u01d1\7\u0195\2\2\u01d1"+
		"\u01da\7\u018f\2\2\u01d2\u01d4\f\3\2\2\u01d3\u01d5\7\u0152\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5\u0170\u00b9"+
		"\2\u01d7\u01d8\7\u018f\2\2\u01d8\u01da\3\2\2\2\u01d9\u01cf\3\2\2\2\u01d9"+
		"\u01d2\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\r\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\5\20\t\2\u01df\u01e1"+
		"\5\36\20\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2"+
		"\u01e2\u01e3\5h\65\2\u01e3\17\3\2\2\2\u01e4\u01e6\7\u0165\2\2\u01e5\u01e7"+
		"\5\22\n\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2"+
		"\u01e8\u01e9\7\u0166\2\2\u01e9\21\3\2\2\2\u01ea\u01f1\5\24\13\2\u01eb"+
		"\u01f1\5\26\f\2\u01ec\u01ed\5\24\13\2\u01ed\u01ee\7\u018a\2\2\u01ee\u01ef"+
		"\5\26\f\2\u01ef\u01f1\3\2\2\2\u01f0\u01ea\3\2\2\2\u01f0\u01eb\3\2\2\2"+
		"\u01f0\u01ec\3\2\2\2\u01f1\23\3\2\2\2\u01f2\u01f3\t\2\2\2\u01f3\25\3\2"+
		"\2\2\u01f4\u01f5\b\f\1\2\u01f5\u01f7\5\30\r\2\u01f6\u01f8\7\u0193\2\2"+
		"\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0201\3\2\2\2\u01f9\u01fa"+
		"\f\3\2\2\u01fa\u01fb\7\u018a\2\2\u01fb\u01fd\5\30\r\2\u01fc\u01fe\7\u0193"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01f9\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\27\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0207\5\32\16\2\u0205"+
		"\u0207\5\34\17\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\31\3\2"+
		"\2\2\u0208\u020d\7\u0195\2\2\u0209\u020a\7\u016f\2\2\u020a\u020d\7\u0195"+
		"\2\2\u020b\u020d\7\u0153\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c"+
		"\u020b\3\2\2\2\u020d\33\3\2\2\2\u020e\u020f\7\u0195\2\2\u020f\u0214\5"+
		"\u0126\u0094\2\u0210\u0211\7\u016f\2\2\u0211\u0212\7\u0195\2\2\u0212\u0214"+
		"\5\u0126\u0094\2\u0213\u020e\3\2\2\2\u0213\u0210\3\2\2\2\u0214\35\3\2"+
		"\2\2\u0215\u0216\7\u0163\2\2\u0216\u0217\5\u011c\u008f\2\u0217\u0219\7"+
		"\u0164\2\2\u0218\u021a\7\u013d\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5\u018c\u00c7\2\u021c\u021b\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0220\5\u00e2r\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0223\5\u0104"+
		"\u0083\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\37\3\2\2\2\u0224"+
		"\u0225\b\21\1\2\u0225\u0265\5\4\3\2\u0226\u0227\5\u00aaV\2\u0227\u0229"+
		"\7\u0163\2\2\u0228\u022a\5&\24\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022c\7\u0164\2\2\u022c\u0265\3\2\2\2\u022d"+
		"\u022e\5\u017a\u00be\2\u022e\u0230\7\u0163\2\2\u022f\u0231\5&\24\2\u0230"+
		"\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7\u0164"+
		"\2\2\u0233\u0265\3\2\2\2\u0234\u0235\5\u00aaV\2\u0235\u0236\5\u012e\u0098"+
		"\2\u0236\u0265\3\2\2\2\u0237\u0238\5\u017a\u00be\2\u0238\u0239\5\u012e"+
		"\u0098\2\u0239\u0265\3\2\2\2\u023a\u023b\7\u012d\2\2\u023b\u023c\7\u0174"+
		"\2\2\u023c\u023d\5\u0110\u0089\2\u023d\u023e\7\u0175\2\2\u023e\u023f\7"+
		"\u0163\2\2\u023f\u0240\5^\60\2\u0240\u0241\7\u0164\2\2\u0241\u0265\3\2"+
		"\2\2\u0242\u0243\7\u014f\2\2\u0243\u0244\7\u0174\2\2\u0244\u0245\5\u0110"+
		"\u0089\2\u0245\u0246\7\u0175\2\2\u0246\u0247\7\u0163\2\2\u0247\u0248\5"+
		"^\60\2\u0248\u0249\7\u0164\2\2\u0249\u0265\3\2\2\2\u024a\u024b\7\u0148"+
		"\2\2\u024b\u024c\7\u0174\2\2\u024c\u024d\5\u0110\u0089\2\u024d\u024e\7"+
		"\u0175\2\2\u024e\u024f\7\u0163\2\2\u024f\u0250\5^\60\2\u0250\u0251\7\u0164"+
		"\2\2\u0251\u0265\3\2\2\2\u0252\u0253\7\u0126\2\2\u0253\u0254\7\u0174\2"+
		"\2\u0254\u0255\5\u0110\u0089\2\u0255\u0256\7\u0175\2\2\u0256\u0257\7\u0163"+
		"\2\2\u0257\u0258\5^\60\2\u0258\u0259\7\u0164\2\2\u0259\u0265\3\2\2\2\u025a"+
		"\u025b\5$\23\2\u025b\u025c\7\u0163\2\2\u025c\u025d\5^\60\2\u025d\u025e"+
		"\7\u0164\2\2\u025e\u0265\3\2\2\2\u025f\u0260\5$\23\2\u0260\u0261\7\u0163"+
		"\2\2\u0261\u0262\5\u0110\u0089\2\u0262\u0263\7\u0164\2\2\u0263\u0265\3"+
		"\2\2\2\u0264\u0224\3\2\2\2\u0264\u0226\3\2\2\2\u0264\u022d\3\2\2\2\u0264"+
		"\u0234\3\2\2\2\u0264\u0237\3\2\2\2\u0264\u023a\3\2\2\2\u0264\u0242\3\2"+
		"\2\2\u0264\u024a\3\2\2\2\u0264\u0252\3\2\2\2\u0264\u025a\3\2\2\2\u0264"+
		"\u025f\3\2\2\2\u0265\u028e\3\2\2\2\u0266\u0267\f\25\2\2\u0267\u0268\7"+
		"\u0165\2\2\u0268\u0269\5^\60\2\u0269\u026a\7\u0166\2\2\u026a\u028d\3\2"+
		"\2\2\u026b\u026c\f\24\2\2\u026c\u026d\7\u0165\2\2\u026d\u026e\5\u012e"+
		"\u0098\2\u026e\u026f\7\u0166\2\2\u026f\u028d\3\2\2\2\u0270\u0271\f\23"+
		"\2\2\u0271\u0273\7\u0163\2\2\u0272\u0274\5&\24\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u028d\7\u0164\2\2\u0276\u0277"+
		"\f\16\2\2\u0277\u0279\7\u0191\2\2\u0278\u027a\7\u0152\2\2\u0279\u0278"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u028d\5\6\4\2\u027c"+
		"\u027d\f\r\2\2\u027d\u027f\7\u018c\2\2\u027e\u0280\7\u0152\2\2\u027f\u027e"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u028d\5\6\4\2\u0282"+
		"\u0283\f\f\2\2\u0283\u0284\7\u0191\2\2\u0284\u028d\5(\25\2\u0285\u0286"+
		"\f\13\2\2\u0286\u0287\7\u018c\2\2\u0287\u028d\5(\25\2\u0288\u0289\f\n"+
		"\2\2\u0289\u028d\7\u0188\2\2\u028a\u028b\f\t\2\2\u028b\u028d\7\u0189\2"+
		"\2\u028c\u0266\3\2\2\2\u028c\u026b\3\2\2\2\u028c\u0270\3\2\2\2\u028c\u0276"+
		"\3\2\2\2\u028c\u027c\3\2\2\2\u028c\u0282\3\2\2\2\u028c\u0285\3\2\2\2\u028c"+
		"\u0288\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f!\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292"+
		"\7\u0159\2\2\u0292#\3\2\2\2\u0293\u0294\7\u0159\2\2\u0294%\3\2\2\2\u0295"+
		"\u0296\5\u012c\u0097\2\u0296\'\3\2\2\2\u0297\u0299\5\f\7\2\u0298\u0297"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\5\u00acW"+
		"\2\u029b\u029c\7\u018f\2\2\u029c\u029d\7\u0171\2\2\u029d\u029e\5\u00ac"+
		"W\2\u029e\u02ae\3\2\2\2\u029f\u02a0\5\f\7\2\u02a0\u02a1\7\u0152\2\2\u02a1"+
		"\u02a2\5\u0170\u00b9\2\u02a2\u02a3\7\u018f\2\2\u02a3\u02a4\7\u0171\2\2"+
		"\u02a4\u02a5\5\u00acW\2\u02a5\u02ae\3\2\2\2\u02a6\u02a8\5\f\7\2\u02a7"+
		"\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7\u0171"+
		"\2\2\u02aa\u02ae\5\u00acW\2\u02ab\u02ac\7\u0171\2\2\u02ac\u02ae\5\u00ae"+
		"X\2\u02ad\u0298\3\2\2\2\u02ad\u029f\3\2\2\2\u02ad\u02a7\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ae)\3\2\2\2\u02af\u02cc\5 \21\2\u02b0\u02b1\7\u0188"+
		"\2\2\u02b1\u02cc\5> \2\u02b2\u02b3\7\u0189\2\2\u02b3\u02cc\5> \2\u02b4"+
		"\u02b5\5,\27\2\u02b5\u02b6\5> \2\u02b6\u02cc\3\2\2\2\u02b7\u02b8\7\u014c"+
		"\2\2\u02b8\u02cc\5*\26\2\u02b9\u02ba\7\u014c\2\2\u02ba\u02bb\7\u0163\2"+
		"\2\u02bb\u02bc\5\u0110\u0089\2\u02bc\u02bd\7\u0164\2\2\u02bd\u02cc\3\2"+
		"\2\2\u02be\u02bf\7\u014c\2\2\u02bf\u02c0\7\u0193\2\2\u02c0\u02c1\7\u0163"+
		"\2\2\u02c1\u02c2\7\u0195\2\2\u02c2\u02cc\7\u0164\2\2\u02c3\u02c4\7\u0119"+
		"\2\2\u02c4\u02c5\7\u0163\2\2\u02c5\u02c6\5\u0110\u0089\2\u02c6\u02c7\7"+
		"\u0164\2\2\u02c7\u02cc\3\2\2\2\u02c8\u02cc\5<\37\2\u02c9\u02cc\5.\30\2"+
		"\u02ca\u02cc\5:\36\2\u02cb\u02af\3\2\2\2\u02cb\u02b0\3\2\2\2\u02cb\u02b2"+
		"\3\2\2\2\u02cb\u02b4\3\2\2\2\u02cb\u02b7\3\2\2\2\u02cb\u02b9\3\2\2\2\u02cb"+
		"\u02be\3\2\2\2\u02cb\u02c3\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cb\u02ca\3\2\2\2\u02cc+\3\2\2\2\u02cd\u02ce\t\3\2\2\u02ce-\3\2"+
		"\2\2\u02cf\u02d1\7\u018f\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d4\7\u013f\2\2\u02d3\u02d5\5\60\31\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\5\62\32\2"+
		"\u02d7\u02d9\58\35\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02e8"+
		"\3\2\2\2\u02da\u02dc\7\u018f\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2"+
		"\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\7\u013f\2\2\u02de\u02e0\5\60\31\2\u02df"+
		"\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\u0163"+
		"\2\2\u02e2\u02e3\5\u0110\u0089\2\u02e3\u02e5\7\u0164\2\2\u02e4\u02e6\5"+
		"8\35\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7"+
		"\u02d0\3\2\2\2\u02e7\u02db\3\2\2\2\u02e8/\3\2\2\2\u02e9\u02ea\7\u0163"+
		"\2\2\u02ea\u02eb\5&\24\2\u02eb\u02ec\7\u0164\2\2\u02ec\61\3\2\2\2\u02ed"+
		"\u02ef\5\u00a6T\2\u02ee\u02f0\5\64\33\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\63\3\2\2\2\u02f1\u02f3\5\u0106\u0084\2\u02f2\u02f4\5\64"+
		"\33\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5"+
		"\u02f7\5\66\34\2\u02f6\u02f1\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\65\3\2"+
		"\2\2\u02f8\u02f9\b\34\1\2\u02f9\u02fa\7\u0165\2\2\u02fa\u02fb\5^\60\2"+
		"\u02fb\u02fd\7\u0166\2\2\u02fc\u02fe\5\u00e2r\2\u02fd\u02fc\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u0308\3\2\2\2\u02ff\u0300\f\3\2\2\u0300\u0301\7\u0165"+
		"\2\2\u0301\u0302\5`\61\2\u0302\u0304\7\u0166\2\2\u0303\u0305\5\u00e2r"+
		"\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u02ff"+
		"\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\67\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030d\7\u0163\2\2\u030c\u030e\5"+
		"&\24\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0312\7\u0164\2\2\u0310\u0312\5\u012e\u0098\2\u0311\u030b\3\2\2\2\u0311"+
		"\u0310\3\2\2\2\u03129\3\2\2\2\u0313\u0315\7\u018f\2\2\u0314\u0313\3\2"+
		"\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7\u012a\2\2\u0317"+
		"\u0320\5> \2\u0318\u031a\7\u018f\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3"+
		"\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\u012a\2\2\u031c\u031d\7\u0165"+
		"\2\2\u031d\u031e\7\u0166\2\2\u031e\u0320\5> \2\u031f\u0314\3\2\2\2\u031f"+
		"\u0319\3\2\2\2\u0320;\3\2\2\2\u0321\u0322\7\u0140\2\2\u0322\u0323\7\u0163"+
		"\2\2\u0323\u0324\5^\60\2\u0324\u0325\7\u0164\2\2\u0325=\3\2\2\2\u0326"+
		"\u032d\5*\26\2\u0327\u0328\7\u0163\2\2\u0328\u0329\5\u0110\u0089\2\u0329"+
		"\u032a\7\u0164\2\2\u032a\u032b\5> \2\u032b\u032d\3\2\2\2\u032c\u0326\3"+
		"\2\2\2\u032c\u0327\3\2\2\2\u032d?\3\2\2\2\u032e\u032f\b!\1\2\u032f\u0330"+
		"\5> \2\u0330\u0339\3\2\2\2\u0331\u0332\f\4\2\2\u0332\u0333\7\u0192\2\2"+
		"\u0333\u0338\5> \2\u0334\u0335\f\3\2\2\u0335\u0336\7\u018b\2\2\u0336\u0338"+
		"\5> \2\u0337\u0331\3\2\2\2\u0337\u0334\3\2\2\2\u0338\u033b\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033aA\3\2\2\2\u033b\u0339\3\2\2\2"+
		"\u033c\u033d\b\"\1\2\u033d\u033e\5@!\2\u033e\u034a\3\2\2\2\u033f\u0340"+
		"\f\5\2\2\u0340\u0341\7\u016b\2\2\u0341\u0349\5@!\2\u0342\u0343\f\4\2\2"+
		"\u0343\u0344\7\u016c\2\2\u0344\u0349\5@!\2\u0345\u0346\f\3\2\2\u0346\u0347"+
		"\7\u016d\2\2\u0347\u0349\5@!\2\u0348\u033f\3\2\2\2\u0348\u0342\3\2\2\2"+
		"\u0348\u0345\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034bC\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\b#\1\2\u034e\u034f"+
		"\5B\"\2\u034f\u0358\3\2\2\2\u0350\u0351\f\4\2\2\u0351\u0352\7\u0169\2"+
		"\2\u0352\u0357\5B\"\2\u0353\u0354\f\3\2\2\u0354\u0355\7\u016a\2\2\u0355"+
		"\u0357\5B\"\2\u0356\u0350\3\2\2\2\u0356\u0353\3\2\2\2\u0357\u035a\3\2"+
		"\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359E\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035b\u035c\b$\1\2\u035c\u035d\5D#\2\u035d\u0364\3\2\2\2\u035e"+
		"\u035f\f\3\2\2\u035f\u0360\5H%\2\u0360\u0361\5D#\2\u0361\u0363\3\2\2\2"+
		"\u0362\u035e\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365G\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\t\4\2\2\u0368"+
		"I\3\2\2\2\u0369\u036a\b&\1\2\u036a\u036b\5F$\2\u036b\u037a\3\2\2\2\u036c"+
		"\u036d\f\6\2\2\u036d\u036e\7\u0174\2\2\u036e\u0379\5F$\2\u036f\u0370\f"+
		"\5\2\2\u0370\u0371\7\u0175\2\2\u0371\u0379\5F$\2\u0372\u0373\f\4\2\2\u0373"+
		"\u0374\7\u0184\2\2\u0374\u0379\5F$\2\u0375\u0376\f\3\2\2\u0376\u0377\7"+
		"\u0185\2\2\u0377\u0379\5F$\2\u0378\u036c\3\2\2\2\u0378\u036f\3\2\2\2\u0378"+
		"\u0372\3\2\2\2\u0378\u0375\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037bK\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u037e"+
		"\b\'\1\2\u037e\u037f\5J&\2\u037f\u0388\3\2\2\2\u0380\u0381\f\4\2\2\u0381"+
		"\u0382\7\u0182\2\2\u0382\u0387\5J&\2\u0383\u0384\f\3\2\2\u0384\u0385\7"+
		"\u0183\2\2\u0385\u0387\5J&\2\u0386\u0380\3\2\2\2\u0386\u0383\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389M\3\2\2\2"+
		"\u038a\u0388\3\2\2\2\u038b\u038c\b(\1\2\u038c\u038d\5L\'\2\u038d\u0393"+
		"\3\2\2\2\u038e\u038f\f\3\2\2\u038f\u0390\7\u016f\2\2\u0390\u0392\5L\'"+
		"\2\u0391\u038e\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394"+
		"\3\2\2\2\u0394O\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0397\b)\1\2\u0397\u0398"+
		"\5N(\2\u0398\u039e\3\2\2\2\u0399\u039a\f\3\2\2\u039a\u039b\7\u016e\2\2"+
		"\u039b\u039d\5N(\2\u039c\u0399\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039fQ\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1"+
		"\u03a2\b*\1\2\u03a2\u03a3\5P)\2\u03a3\u03a9\3\2\2\2\u03a4\u03a5\f\3\2"+
		"\2\u03a5\u03a6\7\u0170\2\2\u03a6\u03a8\5P)\2\u03a7\u03a4\3\2\2\2\u03a8"+
		"\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aaS\3\2\2\2"+
		"\u03ab\u03a9\3\2\2\2\u03ac\u03ad\b+\1\2\u03ad\u03ae\5R*\2\u03ae\u03b7"+
		"\3\2\2\2\u03af\u03b0\f\4\2\2\u03b0\u03b1\7\5\2\2\u03b1\u03b6\5R*\2\u03b2"+
		"\u03b3\f\3\2\2\u03b3\u03b4\7\6\2\2\u03b4\u03b6\5R*\2\u03b5\u03af\3\2\2"+
		"\2\u03b5\u03b2\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8U\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb\b,\1\2\u03bb\u03bc"+
		"\5T+\2\u03bc\u03c5\3\2\2\2\u03bd\u03be\f\4\2\2\u03be\u03bf\7\7\2\2\u03bf"+
		"\u03c4\5T+\2\u03c0\u03c1\f\3\2\2\u03c1\u03c2\7\b\2\2\u03c2\u03c4\5T+\2"+
		"\u03c3\u03bd\3\2\2\2\u03c3\u03c0\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6W\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8"+
		"\u03d0\5V,\2\u03c9\u03ca\5V,\2\u03ca\u03cb\7\u018d\2\2\u03cb\u03cc\5^"+
		"\60\2\u03cc\u03cd\7\u018e\2\2\u03cd\u03ce\5Z.\2\u03ce\u03d0\3\2\2\2\u03cf"+
		"\u03c8\3\2\2\2\u03cf\u03c9\3\2\2\2\u03d0Y\3\2\2\2\u03d1\u03d8\5X-\2\u03d2"+
		"\u03d3\5V,\2\u03d3\u03d4\5\\/\2\u03d4\u03d5\5\u012a\u0096\2\u03d5\u03d8"+
		"\3\2\2\2\u03d6\u03d8\5\u018a\u00c6\2\u03d7\u03d1\3\2\2\2\u03d7\u03d2\3"+
		"\2\2\2\u03d7\u03d6\3\2\2\2\u03d8[\3\2\2\2\u03d9\u03da\t\5\2\2\u03da]\3"+
		"\2\2\2\u03db\u03dc\b\60\1\2\u03dc\u03dd\5Z.\2\u03dd\u03e3\3\2\2\2\u03de"+
		"\u03df\f\3\2\2\u03df\u03e0\7\u018a\2\2\u03e0\u03e2\5Z.\2\u03e1\u03de\3"+
		"\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"_\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\5X-\2\u03e7a\3\2\2\2\u03e8\u0403"+
		"\5d\63\2\u03e9\u03eb\5\u00e2r\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec\u0403\5f\64\2\u03ed\u03ef\5\u00e2r\2\u03ee"+
		"\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u0403\5h"+
		"\65\2\u03f1\u03f3\5\u00e2r\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u0403\5l\67\2\u03f5\u03f7\5\u00e2r\2\u03f6\u03f5"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u0403\5p9\2\u03f9"+
		"\u03fb\5\u00e2r\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u0403\5x=\2\u03fd\u0403\5z>\2\u03fe\u0400\5\u00e2r\2\u03ff"+
		"\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\5\u0180"+
		"\u00c1\2\u0402\u03e8\3\2\2\2\u0402\u03ea\3\2\2\2\u0402\u03ee\3\2\2\2\u0402"+
		"\u03f2\3\2\2\2\u0402\u03f6\3\2\2\2\u0402\u03fa\3\2\2\2\u0402\u03fd\3\2"+
		"\2\2\u0402\u03ff\3\2\2\2\u0403c\3\2\2\2\u0404\u0406\5\u00e2r\2\u0405\u0404"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7\u0195\2"+
		"\2\u0408\u0409\7\u018e\2\2\u0409\u0419\5b\62\2\u040a\u040c\5\u00e2r\2"+
		"\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e"+
		"\7\u011e\2\2\u040e\u040f\5`\61\2\u040f\u0410\7\u018e\2\2\u0410\u0411\5"+
		"b\62\2\u0411\u0419\3\2\2\2\u0412\u0414\5\u00e2r\2\u0413\u0412\3\2\2\2"+
		"\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7\u0129\2\2\u0416"+
		"\u0417\7\u018e\2\2\u0417\u0419\5b\62\2\u0418\u0405\3\2\2\2\u0418\u040b"+
		"\3\2\2\2\u0418\u0413\3\2\2\2\u0419e\3\2\2\2\u041a\u041c\5^\60\2\u041b"+
		"\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\u0190"+
		"\2\2\u041eg\3\2\2\2\u041f\u0421\7\u0167\2\2\u0420\u0422\5j\66\2\u0421"+
		"\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\7\u0168"+
		"\2\2\u0424i\3\2\2\2\u0425\u0426\b\66\1\2\u0426\u0427\5b\62\2\u0427\u042c"+
		"\3\2\2\2\u0428\u0429\f\3\2\2\u0429\u042b\5b\62\2\u042a\u0428\3\2\2\2\u042b"+
		"\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042dk\3\2\2\2"+
		"\u042e\u042c\3\2\2\2\u042f\u0430\7\u0139\2\2\u0430\u0431\7\u0163\2\2\u0431"+
		"\u0432\5n8\2\u0432\u0433\7\u0164\2\2\u0433\u0434\5b\62\2\u0434\u0444\3"+
		"\2\2\2\u0435\u0436\7\u0139\2\2\u0436\u0437\7\u0163\2\2\u0437\u0438\5n"+
		"8\2\u0438\u0439\7\u0164\2\2\u0439\u043a\5b\62\2\u043a\u043b\7\u012e\2"+
		"\2\u043b\u043c\5b\62\2\u043c\u0444\3\2\2\2\u043d\u043e\7\u0151\2\2\u043e"+
		"\u043f\7\u0163\2\2\u043f\u0440\5n8\2\u0440\u0441\7\u0164\2\2\u0441\u0442"+
		"\5b\62\2\u0442\u0444\3\2\2\2\u0443\u042f\3\2\2\2\u0443\u0435\3\2\2\2\u0443"+
		"\u043d\3\2\2\2\u0444m\3\2\2\2\u0445\u0456\5^\60\2\u0446\u0448\5\u00e2"+
		"r\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044a\5\u0090I\2\u044a\u044b\5\u00fc\177\2\u044b\u044c\7\u0173\2\2\u044c"+
		"\u044d\5\u012a\u0096\2\u044d\u0456\3\2\2\2\u044e\u0450\5\u00e2r\2\u044f"+
		"\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\5\u0090"+
		"I\2\u0452\u0453\5\u00fc\177\2\u0453\u0454\5\u012e\u0098\2\u0454\u0456"+
		"\3\2\2\2\u0455\u0445\3\2\2\2\u0455\u0447\3\2\2\2\u0455\u044f\3\2\2\2\u0456"+
		"o\3\2\2\2\u0457\u0458\7\u0162\2\2\u0458\u0459\7\u0163\2\2\u0459\u045a"+
		"\5n8\2\u045a\u045b\7\u0164\2\2\u045b\u045c\5b\62\2\u045c\u047b\3\2\2\2"+
		"\u045d\u045e\7\u012b\2\2\u045e\u045f\5b\62\2\u045f\u0460\7\u0162\2\2\u0460"+
		"\u0461\7\u0163\2\2\u0461\u0462\5^\60\2\u0462\u0463\7\u0164\2\2\u0463\u0464"+
		"\7\u0190\2\2\u0464\u047b\3\2\2\2\u0465\u0466\7\u0136\2\2\u0466\u0467\7"+
		"\u0163\2\2\u0467\u0469\5r:\2\u0468\u046a\5n8\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\7\u0190\2\2\u046c\u046e"+
		"\5^\60\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u0470\7\u0164\2\2\u0470\u0471\5b\62\2\u0471\u047b\3\2\2\2\u0472\u0473"+
		"\7\u0136\2\2\u0473\u0474\7\u0163\2\2\u0474\u0475\5t;\2\u0475\u0476\7\u018e"+
		"\2\2\u0476\u0477\5v<\2\u0477\u0478\7\u0164\2\2\u0478\u0479\5b\62\2\u0479"+
		"\u047b\3\2\2\2\u047a\u0457\3\2\2\2\u047a\u045d\3\2\2\2\u047a\u0465\3\2"+
		"\2\2\u047a\u0472\3\2\2\2\u047bq\3\2\2\2\u047c\u047f\5f\64\2\u047d\u047f"+
		"\5\u0084C\2\u047e\u047c\3\2\2\2\u047e\u047d\3\2\2\2\u047fs\3\2\2\2\u0480"+
		"\u0482\5\u00e2r\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483"+
		"\3\2\2\2\u0483\u0484\5\u0090I\2\u0484\u0485\5\u00fc\177\2\u0485u\3\2\2"+
		"\2\u0486\u0489\5^\60\2\u0487\u0489\5\u012e\u0098\2\u0488\u0486\3\2\2\2"+
		"\u0488\u0487\3\2\2\2\u0489w\3\2\2\2\u048a\u048b\7\u011d\2\2\u048b\u049b"+
		"\7\u0190\2\2\u048c\u048d\7\u0127\2\2\u048d\u049b\7\u0190\2\2\u048e\u0490"+
		"\7\u0149\2\2\u048f\u0491\5^\60\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2"+
		"\2\u0491\u0492\3\2\2\2\u0492\u049b\7\u0190\2\2\u0493\u0494\7\u0149\2\2"+
		"\u0494\u0495\5\u012e\u0098\2\u0495\u0496\7\u0190\2\2\u0496\u049b\3\2\2"+
		"\2\u0497\u0498\7\u0138\2\2\u0498\u0499\7\u0195\2\2\u0499\u049b\7\u0190"+
		"\2\2\u049a\u048a\3\2\2\2\u049a\u048c\3\2\2\2\u049a\u048e\3\2\2\2\u049a"+
		"\u0493\3\2\2\2\u049a\u0497\3\2\2\2\u049by\3\2\2\2\u049c\u049d\5\u0080"+
		"A\2\u049d{\3\2\2\2\u049e\u049f\b?\1\2\u049f\u04a0\5~@\2\u04a0\u04a5\3"+
		"\2\2\2\u04a1\u04a2\f\3\2\2\u04a2\u04a4\5~@\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6}\3\2\2\2"+
		"\u04a7\u04a5\3\2\2\2\u04a8\u04b2\5\u0080A\2\u04a9\u04b2\5\u0122\u0092"+
		"\2\u04aa\u04b2\5\u0168\u00b5\2\u04ab\u04b2\5\u017c\u00bf\2\u04ac\u04b2"+
		"\5\u017e\u00c0\2\u04ad\u04b2\5\u00e0q\2\u04ae\u04b2\5\u00c8e\2\u04af\u04b2"+
		"\5\u0088E\2\u04b0\u04b2\5\u008aF\2\u04b1\u04a8\3\2\2\2\u04b1\u04a9\3\2"+
		"\2\2\u04b1\u04aa\3\2\2\2\u04b1\u04ab\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b1"+
		"\u04ad\3\2\2\2\u04b1\u04ae\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b0\3\2"+
		"\2\2\u04b2\177\3\2\2\2\u04b3\u04bc\5\u0084C\2\u04b4\u04bc\5\u00dep\2\u04b5"+
		"\u04bc\5\u00d6l\2\u04b6\u04bc\5\u00dan\2\u04b7\u04bc\5\u00dco\2\u04b8"+
		"\u04bc\5\u0086D\2\u04b9\u04bc\5\u0082B\2\u04ba\u04bc\5\u00b8]\2\u04bb"+
		"\u04b3\3\2\2\2\u04bb\u04b4\3\2\2\2\u04bb\u04b5\3\2\2\2\u04bb\u04b6\3\2"+
		"\2\2\u04bb\u04b7\3\2\2\2\u04bb\u04b8\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bc\u0081\3\2\2\2\u04bd\u04be\7\u015d\2\2\u04be\u04c0"+
		"\7\u0195\2\2\u04bf\u04c1\5\u00e2r\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3"+
		"\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7\u0173\2\2\u04c3\u04c4\5\u0110"+
		"\u0089\2\u04c4\u04c5\7\u0190\2\2\u04c5\u0083\3\2\2\2\u04c6\u04c8\5\u0090"+
		"I\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9"+
		"\u04cb\5\u00f8}\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc"+
		"\3\2\2\2\u04cc\u04d5\7\u0190\2\2\u04cd\u04cf\5\u00e2r\2\u04ce\u04d0\5"+
		"\u0090I\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2"+
		"\u04d1\u04d2\5\u00f8}\2\u04d2\u04d3\7\u0190\2\2\u04d3\u04d5\3\2\2\2\u04d4"+
		"\u04c7\3\2\2\2\u04d4\u04cd\3\2\2\2\u04d5\u0085\3\2\2\2\u04d6\u04d7\7\u014e"+
		"\2\2\u04d7\u04d8\7\u0163\2\2\u04d8\u04d9\5`\61\2\u04d9\u04da\7\u018a\2"+
		"\2\u04da\u04db\7\u019e\2\2\u04db\u04dc\7\u0164\2\2\u04dc\u04dd\7\u0190"+
		"\2\2\u04dd\u0087\3\2\2\2\u04de\u04df\7\u0190\2\2\u04df\u0089\3\2\2\2\u04e0"+
		"\u04e1\5\u00e2r\2\u04e1\u04e2\7\u0190\2\2\u04e2\u008b\3\2\2\2\u04e3\u04ec"+
		"\5\u0094K\2\u04e4\u04ec\5\u008eH\2\u04e5\u04ec\5\u0092J\2\u04e6\u04ec"+
		"\5\u00a0Q\2\u04e7\u04ec\5\u009cO\2\u04e8\u04ec\7\u0137\2\2\u04e9\u04ec"+
		"\7\u0158\2\2\u04ea\u04ec\7\u0125\2\2\u04eb\u04e3\3\2\2\2\u04eb\u04e4\3"+
		"\2\2\2\u04eb\u04e5\3\2\2\2\u04eb\u04e6\3\2\2\2\u04eb\u04e7\3\2\2\2\u04eb"+
		"\u04e8\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u008d\3\2"+
		"\2\2\u04ed\u04f1\7\t\2\2\u04ee\u04f1\5\u009aN\2\u04ef\u04f1\7\n\2\2\u04f0"+
		"\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u008f\3\2"+
		"\2\2\u04f2\u04f4\5\u008cG\2\u04f3\u04f5\5\u00e2r\2\u04f4\u04f3\3\2\2\2"+
		"\u04f4\u04f5\3\2\2\2\u04f5\u04fa\3\2\2\2\u04f6\u04f7\5\u008cG\2\u04f7"+
		"\u04f8\5\u0090I\2\u04f8\u04fa\3\2\2\2\u04f9\u04f2\3\2\2\2\u04f9\u04f6"+
		"\3\2\2\2\u04fa\u0091\3\2\2\2\u04fb\u0502\7\u0147\2\2\u04fc\u0502\7\u014d"+
		"\2\2\u04fd\u0502\7\u0154\2\2\u04fe\u0502\7\u0132\2\2\u04ff\u0502\7\u013d"+
		"\2\2\u0500\u0502\5\u0098M\2\u0501\u04fb\3\2\2\2\u0501\u04fc\3\2\2\2\u0501"+
		"\u04fd\3\2\2\2\u0501\u04fe\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0500\3\2"+
		"\2\2\u0502\u0093\3\2\2\2\u0503\u0505\7\u0194\2\2\u0504\u0506\5\u0096L"+
		"\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0514\3\2\2\2\u0507\u0514"+
		"\7\13\2\2\u0508\u0514\7\f\2\2\u0509\u050b\7\r\2\2\u050a\u050c\5\u0096"+
		"L\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0514\3\2\2\2\u050d"+
		"\u050f\7\16\2\2\u050e\u0510\5\u0096L\2\u050f\u050e\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0514\3\2\2\2\u0511\u0514\7\17\2\2\u0512\u0514\7\20\2\2"+
		"\u0513\u0503\3\2\2\2\u0513\u0507\3\2\2\2\u0513\u0508\3\2\2\2\u0513\u0509"+
		"\3\2\2\2\u0513\u050d\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0512\3\2\2\2\u0514"+
		"\u0095\3\2\2\2\u0515\u051a\7\u0163\2\2\u0516\u0519\n\6\2\2\u0517\u0519"+
		"\5\u0096L\2\u0518\u0516\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u051c\3\2\2"+
		"\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051a"+
		"\3\2\2\2\u051d\u051e\7\u0164\2\2\u051e\u0097\3\2\2\2\u051f\u0520\t\7\2"+
		"\2\u0520\u0099\3\2\2\2\u0521\u0522\7\61\2\2\u0522\u0523\7\u0163\2\2\u0523"+
		"\u0524\7\u0195\2\2\u0524\u0525\7\u0164\2\2\u0525\u009b\3\2\2\2\u0526\u0527"+
		"\t\b\2\2\u0527\u009d\3\2\2\2\u0528\u0529\7\u0195\2\2\u0529\u009f\3\2\2"+
		"\2\u052a\u052e\5\u00a4S\2\u052b\u052e\5\u0132\u009a\2\u052c\u052e\5\u00b4"+
		"[\2\u052d\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e"+
		"\u00a1\3\2\2\2\u052f\u0530\t\t\2\2\u0530\u00a3\3\2\2\2\u0531\u0536\5\u00aa"+
		"V\2\u0532\u0536\5\u00b0Y\2\u0533\u0536\5\u017a\u00be\2\u0534\u0536\5\u010a"+
		"\u0086\2\u0535\u0531\3\2\2\2\u0535\u0532\3\2\2\2\u0535\u0533\3\2\2\2\u0535"+
		"\u0534\3\2\2\2\u0536\u00a5\3\2\2\2\u0537\u0539\5\u00a0Q\2\u0538\u053a"+
		"\5\u00e2r\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053f\3\2\2"+
		"\2\u053b\u053c\5\u00a0Q\2\u053c\u053d\5\u00a6T\2\u053d\u053f\3\2\2\2\u053e"+
		"\u0537\3\2\2\2\u053e\u053b\3\2\2\2\u053f\u00a7\3\2\2\2\u0540\u0542\5\u00a4"+
		"S\2\u0541\u0543\5\u00e2r\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0548\3\2\2\2\u0544\u0545\5\u00a4S\2\u0545\u0546\5\u00a8U\2\u0546\u0548"+
		"\3\2\2\2\u0547\u0540\3\2\2\2\u0547\u0544\3\2\2\2\u0548\u00a9\3\2\2\2\u0549"+
		"\u054b\5\f\7\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2"+
		"\2\2\u054c\u0562\5\u00acW\2\u054d\u054e\5\f\7\2\u054e\u054f\7\u0152\2"+
		"\2\u054f\u0550\5\u0170\u00b9\2\u0550\u0562\3\2\2\2\u0551\u0562\5\u00a2"+
		"R\2\u0552\u0562\7\u0120\2\2\u0553\u0562\7\u0121\2\2\u0554\u0562\7\u0122"+
		"\2\2\u0555\u0562\7\u0161\2\2\u0556\u0562\7\u011c\2\2\u0557\u0562\7\u014a"+
		"\2\2\u0558\u0562\7\u013b\2\2\u0559\u0562\7\u013c\2\2\u055a\u0562\7\u014b"+
		"\2\2\u055b\u0562\7\u015c\2\2\u055c\u0562\7\u0135\2\2\u055d\u0562\7\u012c"+
		"\2\2\u055e\u0562\7\u015f\2\2\u055f\u0562\7\u011b\2\2\u0560\u0562\5\u00ae"+
		"X\2\u0561\u054a\3\2\2\2\u0561\u054d\3\2\2\2\u0561\u0551\3\2\2\2\u0561"+
		"\u0552\3\2\2\2\u0561\u0553\3\2\2\2\u0561\u0554\3\2\2\2\u0561\u0555\3\2"+
		"\2\2\u0561\u0556\3\2\2\2\u0561\u0557\3\2\2\2\u0561\u0558\3\2\2\2\u0561"+
		"\u0559\3\2\2\2\u0561\u055a\3\2\2\2\u0561\u055b\3\2\2\2\u0561\u055c\3\2"+
		"\2\2\u0561\u055d\3\2\2\2\u0561\u055e\3\2\2\2\u0561\u055f\3\2\2\2\u0561"+
		"\u0560\3\2\2\2\u0562\u00ab\3\2\2\2\u0563\u0568\5\u0130\u0099\2\u0564\u0568"+
		"\5\u00b2Z\2\u0565\u0568\5\u009eP\2\u0566\u0568\5\u0170\u00b9\2\u0567\u0563"+
		"\3\2\2\2\u0567\u0564\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0566\3\2\2\2\u0568"+
		"\u00ad\3\2\2\2\u0569\u056a\7\u0128\2\2\u056a\u056b\7\u0163\2\2\u056b\u056c"+
		"\5^\60\2\u056c\u056d\7\u0164\2\2\u056d\u0573\3\2\2\2\u056e\u056f\7\u0128"+
		"\2\2\u056f\u0570\7\u0163\2\2\u0570\u0571\7\u011b\2\2\u0571\u0573\7\u0164"+
		"\2\2\u0572\u0569\3\2\2\2\u0572\u056e\3\2\2\2\u0573\u00af\3\2\2\2\u0574"+
		"\u0576\5\u013a\u009e\2\u0575\u0577\5\u00e2r\2\u0576\u0575\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u057a\5\f\7\2\u0579\u0578\3\2"+
		"\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\7\u0195\2\2\u057c"+
		"\u058d\3\2\2\2\u057d\u057e\5\u013a\u009e\2\u057e\u057f\5\u0170\u00b9\2"+
		"\u057f\u058d\3\2\2\2\u0580\u0581\5\u013a\u009e\2\u0581\u0583\5\f\7\2\u0582"+
		"\u0584\7\u0152\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585"+
		"\3\2\2\2\u0585\u0586\5\u0170\u00b9\2\u0586\u058d\3\2\2\2\u0587\u0589\7"+
		"\u012f\2\2\u0588\u058a\5\f\7\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2\2"+
		"\u058a\u058b\3\2\2\2\u058b\u058d\7\u0195\2\2\u058c\u0574\3\2\2\2\u058c"+
		"\u057d\3\2\2\2\u058c\u0580\3\2\2\2\u058c\u0587\3\2\2\2\u058d\u00b1\3\2"+
		"\2\2\u058e\u058f\7\u0195\2\2\u058f\u00b3\3\2\2\2\u0590\u0591\5\u00b6\\"+
		"\2\u0591\u0593\7\u0167\2\2\u0592\u0594\5\u00be`\2\u0593\u0592\3\2\2\2"+
		"\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\7\u0168\2\2\u0596"+
		"\u059e\3\2\2\2\u0597\u0598\5\u00b6\\\2\u0598\u0599\7\u0167\2\2\u0599\u059a"+
		"\5\u00be`\2\u059a\u059b\7\u018a\2\2\u059b\u059c\7\u0168\2\2\u059c\u059e"+
		"\3\2\2\2\u059d\u0590\3\2\2\2\u059d\u0597\3\2\2\2\u059e\u00b5\3\2\2\2\u059f"+
		"\u05a1\5\u00ba^\2\u05a0\u05a2\5\u00e2r\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2"+
		"\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\7\u0195\2\2\u05a4\u05a3\3\2\2"+
		"\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a8\5\u00bc_\2\u05a7"+
		"\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05b3\3\2\2\2\u05a9\u05ab\5\u00ba"+
		"^\2\u05aa\u05ac\5\u00e2r\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ad\3\2\2\2\u05ad\u05ae\5\f\7\2\u05ae\u05b0\7\u0195\2\2\u05af\u05b1"+
		"\5\u00bc_\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2"+
		"\2\u05b2\u059f\3\2\2\2\u05b2\u05a9\3\2\2\2\u05b3\u00b7\3\2\2\2\u05b4\u05b6"+
		"\5\u00ba^\2\u05b5\u05b7\5\u00e2r\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2"+
		"\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\7\u0195\2\2\u05b9\u05bb\5\u00bc_"+
		"\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd"+
		"\7\u0190\2\2\u05bd\u00b9\3\2\2\2\u05be\u05c4\7\u012f\2\2\u05bf\u05c0\7"+
		"\u012f\2\2\u05c0\u05c4\7\u0123\2\2\u05c1\u05c2\7\u012f\2\2\u05c2\u05c4"+
		"\7\u0150\2\2\u05c3\u05be\3\2\2\2\u05c3\u05bf\3\2\2\2\u05c3\u05c1\3\2\2"+
		"\2\u05c4\u00bb\3\2\2\2\u05c5\u05c6\7\u018e\2\2\u05c6\u05c7\5\u00a6T\2"+
		"\u05c7\u00bd\3\2\2\2\u05c8\u05c9\b`\1\2\u05c9\u05ca\5\u00c0a\2\u05ca\u05d0"+
		"\3\2\2\2\u05cb\u05cc\f\3\2\2\u05cc\u05cd\7\u018a\2\2\u05cd\u05cf\5\u00c0"+
		"a\2\u05ce\u05cb\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u00bf\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d9\5\u00c2"+
		"b\2\u05d4\u05d5\5\u00c2b\2\u05d5\u05d6\7\u0173\2\2\u05d6\u05d7\5`\61\2"+
		"\u05d7\u05d9\3\2\2\2\u05d8\u05d3\3\2\2\2\u05d8\u05d4\3\2\2\2\u05d9\u00c1"+
		"\3\2\2\2\u05da\u05db\7\u0195\2\2\u05db\u00c3\3\2\2\2\u05dc\u05df\5\u00c6"+
		"d\2\u05dd\u05df\5\u00d4k\2\u05de\u05dc\3\2\2\2\u05de\u05dd\3\2\2\2\u05df"+
		"\u00c5\3\2\2\2\u05e0\u05e1\7\u0195\2\2\u05e1\u00c7\3\2\2\2\u05e2\u05e5"+
		"\5\u00caf\2\u05e3\u05e5\5\u00d0i\2\u05e4\u05e2\3\2\2\2\u05e4\u05e3\3\2"+
		"\2\2\u05e5\u00c9\3\2\2\2\u05e6\u05e9\5\u00ccg\2\u05e7\u05e9\5\u00ceh\2"+
		"\u05e8\u05e6\3\2\2\2\u05e8\u05e7\3\2\2\2\u05e9\u00cb\3\2\2\2\u05ea\u05ec"+
		"\7\u013a\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2"+
		"\2\u05ed\u05ee\7\u013e\2\2\u05ee\u05ef\7\u0195\2\2\u05ef\u05f0\7\u0167"+
		"\2\2\u05f0\u05f1\5\u00d2j\2\u05f1\u05f2\7\u0168\2\2\u05f2\u00cd\3\2\2"+
		"\2\u05f3\u05f5\7\u013a\2\2\u05f4\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f6\3\2\2\2\u05f6\u05f7\7\u013e\2\2\u05f7\u05f8\5\u00c6d\2\u05f8\u05f9"+
		"\7\u0167\2\2\u05f9\u05fa\5\u00d2j\2\u05fa\u05fb\7\u0168\2\2\u05fb\u00cf"+
		"\3\2\2\2\u05fc\u05fe\7\u013a\2\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2"+
		"\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\7\u013e\2\2\u0600\u0601\7\u0167\2\2"+
		"\u0601\u0602\5\u00d2j\2\u0602\u0603\7\u0168\2\2\u0603\u00d1\3\2\2\2\u0604"+
		"\u0606\5|?\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u00d3\3\2\2"+
		"\2\u0607\u0608\7\u0195\2\2\u0608\u00d5\3\2\2\2\u0609\u060a\7\u013e\2\2"+
		"\u060a\u060b\7\u0195\2\2\u060b\u060c\7\u0173\2\2\u060c\u060d\5\u00d8m"+
		"\2\u060d\u060e\7\u0190\2\2\u060e\u00d7\3\2\2\2\u060f\u0611\5\f\7\2\u0610"+
		"\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\5\u00c4"+
		"c\2\u0613\u00d9\3\2\2\2\u0614\u0616\7\u015d\2\2\u0615\u0617\7\u015a\2"+
		"\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619"+
		"\5\f\7\2\u0619\u061a\5\b\5\2\u061a\u061b\7\u0190\2\2\u061b\u0622\3\2\2"+
		"\2\u061c\u061d\7\u015d\2\2\u061d\u061e\7\u018f\2\2\u061e\u061f\5\b\5\2"+
		"\u061f\u0620\7\u0190\2\2\u0620\u0622\3\2\2\2\u0621\u0614\3\2\2\2\u0621"+
		"\u061c\3\2\2\2\u0622\u00db\3\2\2\2\u0623\u0625\5\u00e2r\2\u0624\u0623"+
		"\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\7\u015d\2"+
		"\2\u0627\u0629\7\u013e\2\2\u0628\u062a\5\f\7\2\u0629\u0628\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\5\u00c4c\2\u062c\u062d"+
		"\7\u0190\2\2\u062d\u00dd\3\2\2\2\u062e\u062f\7\u011a\2\2\u062f\u0630\7"+
		"\u0163\2\2\u0630\u0631\7\u019e\2\2\u0631\u0632\7\u0164\2\2\u0632\u0633"+
		"\7\u0190\2\2\u0633\u00df\3\2\2\2\u0634\u0635\7\u0132\2\2\u0635\u0636\7"+
		"\u019e\2\2\u0636\u0638\7\u0167\2\2\u0637\u0639\5|?\2\u0638\u0637\3\2\2"+
		"\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063f\7\u0168\2\2\u063b"+
		"\u063c\7\u0132\2\2\u063c\u063d\7\u019e\2\2\u063d\u063f\5~@\2\u063e\u0634"+
		"\3\2\2\2\u063e\u063b\3\2\2\2\u063f\u00e1\3\2\2\2\u0640\u0641\br\1\2\u0641"+
		"\u0642\5\u00e4s\2\u0642\u0647\3\2\2\2\u0643\u0644\f\3\2\2\u0644\u0646"+
		"\5\u00e4s\2\u0645\u0643\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2"+
		"\2\u0647\u0648\3\2\2\2\u0648\u00e3\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064b"+
		"\7\u0165\2\2\u064b\u064c\7\u0165\2\2\u064c\u064d\5\u00e8u\2\u064d\u064e"+
		"\7\u0166\2\2\u064e\u064f\7\u0166\2\2\u064f\u0652\3\2\2\2\u0650\u0652\5"+
		"\u00e6t\2\u0651\u064a\3\2\2\2\u0651\u0650\3\2\2\2\u0652\u00e5\3\2\2\2"+
		"\u0653\u0654\7\u0118\2\2\u0654\u0655\7\u0163\2\2\u0655\u0657\5\u0110\u0089"+
		"\2\u0656\u0658\7\u0193\2\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065a\7\u0164\2\2\u065a\u0664\3\2\2\2\u065b\u065c"+
		"\7\u0118\2\2\u065c\u065d\7\u0163\2\2\u065d\u065f\5`\61\2\u065e\u0660\7"+
		"\u0193\2\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\3\2\2\2"+
		"\u0661\u0662\7\u0164\2\2\u0662\u0664\3\2\2\2\u0663\u0653\3\2\2\2\u0663"+
		"\u065b\3\2\2\2\u0664\u00e7\3\2\2\2\u0665\u0667\bu\1\2\u0666\u0668\5\u00ea"+
		"v\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066d\3\2\2\2\u0669"+
		"\u066a\5\u00eav\2\u066a\u066b\7\u0193\2\2\u066b\u066d\3\2\2\2\u066c\u0665"+
		"\3\2\2\2\u066c\u0669\3\2\2\2\u066d\u067a\3\2\2\2\u066e\u066f\f\5\2\2\u066f"+
		"\u0671\7\u018a\2\2\u0670\u0672\5\u00eav\2\u0671\u0670\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0679\3\2\2\2\u0673\u0674\f\3\2\2\u0674\u0675\7\u018a\2"+
		"\2\u0675\u0676\5\u00eav\2\u0676\u0677\7\u0193\2\2\u0677\u0679\3\2\2\2"+
		"\u0678\u066e\3\2\2\2\u0678\u0673\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u00e9\3\2\2\2\u067c\u067a\3\2\2\2\u067d"+
		"\u067f\5\u00ecw\2\u067e\u0680\5\u00f2z\2\u067f\u067e\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u00eb\3\2\2\2\u0681\u0684\7\u0195\2\2\u0682\u0684\5\u00ee"+
		"x\2\u0683\u0681\3\2\2\2\u0683\u0682\3\2\2\2\u0684\u00ed\3\2\2\2\u0685"+
		"\u0686\5\u00f0y\2\u0686\u0687\7\u018f\2\2\u0687\u0688\7\u0195\2\2\u0688"+
		"\u00ef\3\2\2\2\u0689\u068a\7\u0195\2\2\u068a\u00f1\3\2\2\2\u068b\u068c"+
		"\7\u0163\2\2\u068c\u068d\5\u00f4{\2\u068d\u068e\7\u0164\2\2\u068e\u00f3"+
		"\3\2\2\2\u068f\u0691\b{\1\2\u0690\u0692\5\u00f6|\2\u0691\u0690\3\2\2\2"+
		"\u0691\u0692\3\2\2\2\u0692\u0697\3\2\2\2\u0693\u0694\f\3\2\2\u0694\u0696"+
		"\5\u00f6|\2\u0695\u0693\3\2\2\2\u0696\u0699\3\2\2\2\u0697\u0695\3\2\2"+
		"\2\u0697\u0698\3\2\2\2\u0698\u00f5\3\2\2\2\u0699\u0697\3\2\2\2\u069a\u069b"+
		"\7\u0163\2\2\u069b\u069c\5\u00f4{\2\u069c\u069d\7\u0164\2\2\u069d\u06ac"+
		"\3\2\2\2\u069e\u069f\7\u0165\2\2\u069f\u06a0\5\u00f4{\2\u06a0\u06a1\7"+
		"\u0166\2\2\u06a1\u06ac\3\2\2\2\u06a2\u06a3\7\u0167\2\2\u06a3\u06a4\5\u00f4"+
		"{\2\u06a4\u06a5\7\u0168\2\2\u06a5\u06ac\3\2\2\2\u06a6\u06a8\n\n\2\2\u06a7"+
		"\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2"+
		"\2\2\u06aa\u06ac\3\2\2\2\u06ab\u069a\3\2\2\2\u06ab\u069e\3\2\2\2\u06ab"+
		"\u06a2\3\2\2\2\u06ab\u06a7\3\2\2\2\u06ac\u00f7\3\2\2\2\u06ad\u06ae\b}"+
		"\1\2\u06ae\u06af\5\u00fa~\2\u06af\u06b5\3\2\2\2\u06b0\u06b1\f\3\2\2\u06b1"+
		"\u06b2\7\u018a\2\2\u06b2\u06b4\5\u00fa~\2\u06b3\u06b0\3\2\2\2\u06b4\u06b7"+
		"\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u00f9\3\2\2\2\u06b7"+
		"\u06b5\3\2\2\2\u06b8\u06ba\5\u00fc\177\2\u06b9\u06bb\5\u0126\u0094\2\u06ba"+
		"\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u00fb\3\2\2\2\u06bc\u06c2\5\u00fe"+
		"\u0080\2\u06bd\u06be\5\u0100\u0081\2\u06be\u06bf\5\u0102\u0082\2\u06bf"+
		"\u06c0\5\u0104\u0083\2\u06c0\u06c2\3\2\2\2\u06c1\u06bc\3\2\2\2\u06c1\u06bd"+
		"\3\2\2\2\u06c2\u00fd\3\2\2\2\u06c3\u06c8\5\u0100\u0081\2\u06c4\u06c5\5"+
		"\u0106\u0084\2\u06c5\u06c6\5\u00fe\u0080\2\u06c6\u06c8\3\2\2\2\u06c7\u06c3"+
		"\3\2\2\2\u06c7\u06c4\3\2\2\2\u06c8\u00ff\3\2\2\2\u06c9\u06ca\b\u0081\1"+
		"\2\u06ca\u06cc\5\u010e\u0088\2\u06cb\u06cd\5\u00e2r\2\u06cc\u06cb\3\2"+
		"\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06d3\3\2\2\2\u06ce\u06cf\7\u0163\2\2\u06cf"+
		"\u06d0\5\u00fe\u0080\2\u06d0\u06d1\7\u0164\2\2\u06d1\u06d3\3\2\2\2\u06d2"+
		"\u06c9\3\2\2\2\u06d2\u06ce\3\2\2\2\u06d3\u06e1\3\2\2\2\u06d4\u06d5\f\5"+
		"\2\2\u06d5\u06e0\5\u0102\u0082\2\u06d6\u06d7\f\4\2\2\u06d7\u06d9\7\u0165"+
		"\2\2\u06d8\u06da\5`\61\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da"+
		"\u06db\3\2\2\2\u06db\u06dd\7\u0166\2\2\u06dc\u06de\5\u00e2r\2\u06dd\u06dc"+
		"\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06d4\3\2\2\2\u06df"+
		"\u06d6\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2"+
		"\2\2\u06e2\u0101\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4\u06e5\7\u0163\2\2\u06e5"+
		"\u06e6\5\u011c\u008f\2\u06e6\u06e8\7\u0164\2\2\u06e7\u06e9\5\u0108\u0085"+
		"\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb\3\2\2\2\u06ea\u06ec"+
		"\5\u010c\u0087\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3"+
		"\2\2\2\u06ed\u06ef\5\u018c\u00c7\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2"+
		"\2\2\u06ef\u06f1\3\2\2\2\u06f0\u06f2\5\u00e2r\2\u06f1\u06f0\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u0103\3\2\2\2\u06f3\u06f4\7\u018c\2\2\u06f4\u06f6"+
		"\5\u00a8U\2\u06f5\u06f7\5\u0112\u008a\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7"+
		"\3\2\2\2\u06f7\u0105\3\2\2\2\u06f8\u06fa\7\u016b\2\2\u06f9\u06fb\5\u00e2"+
		"r\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\3\2\2\2\u06fc"+
		"\u06fe\5\u0108\u0085\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0710"+
		"\3\2\2\2\u06ff\u0701\7\u016f\2\2\u0700\u0702\5\u00e2r\2\u0701\u0700\3"+
		"\2\2\2\u0701\u0702\3\2\2\2\u0702\u0710\3\2\2\2\u0703\u0705\7\5\2\2\u0704"+
		"\u0706\5\u00e2r\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0710"+
		"\3\2\2\2\u0707\u0708\5\f\7\2\u0708\u070a\7\u016b\2\2\u0709\u070b\5\u00e2"+
		"r\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c"+
		"\u070e\5\u0108\u0085\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0710"+
		"\3\2\2\2\u070f\u06f8\3\2\2\2\u070f\u06ff\3\2\2\2\u070f\u0703\3\2\2\2\u070f"+
		"\u0707\3\2\2\2\u0710\u0107\3\2\2\2\u0711\u0713\5\u010a\u0086\2\u0712\u0714"+
		"\5\u0108\u0085\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0109\3"+
		"\2\2\2\u0715\u0716\t\13\2\2\u0716\u010b\3\2\2\2\u0717\u0718\t\f\2\2\u0718"+
		"\u010d\3\2\2\2\u0719\u071b\7\u0193\2\2\u071a\u0719\3\2\2\2\u071a\u071b"+
		"\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\5\6\4\2\u071d\u010f\3\2\2\2\u071e"+
		"\u0720\5\u00a6T\2\u071f\u0721\5\u0112\u008a\2\u0720\u071f\3\2\2\2\u0720"+
		"\u0721\3\2\2\2\u0721\u0111\3\2\2\2\u0722\u072b\5\u0114\u008b\2\u0723\u0725"+
		"\5\u0116\u008c\2\u0724\u0723\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0726\3"+
		"\2\2\2\u0726\u0727\5\u0102\u0082\2\u0727\u0728\5\u0104\u0083\2\u0728\u072b"+
		"\3\2\2\2\u0729\u072b\5\u0118\u008d\2\u072a\u0722\3\2\2\2\u072a\u0724\3"+
		"\2\2\2\u072a\u0729\3\2\2\2\u072b\u0113\3\2\2\2\u072c\u0732\5\u0116\u008c"+
		"\2\u072d\u072f\5\u0106\u0084\2\u072e\u0730\5\u0114\u008b\2\u072f\u072e"+
		"\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0732\3\2\2\2\u0731\u072c\3\2\2\2\u0731"+
		"\u072d\3\2\2\2\u0732\u0115\3\2\2\2\u0733\u0734\b\u008c\1\2\u0734\u0742"+
		"\5\u0102\u0082\2\u0735\u0737\7\u0165\2\2\u0736\u0738\5`\61\2\u0737\u0736"+
		"\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\7\u0166\2"+
		"\2\u073a\u073c\5\u00e2r\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c"+
		"\u0742\3\2\2\2\u073d\u073e\7\u0163\2\2\u073e\u073f\5\u0114\u008b\2\u073f"+
		"\u0740\7\u0164\2\2\u0740\u0742\3\2\2\2\u0741\u0733\3\2\2\2\u0741\u0735"+
		"\3\2\2\2\u0741\u073d\3\2\2\2\u0742\u0750\3\2\2\2\u0743\u0744\f\7\2\2\u0744"+
		"\u074f\5\u0102\u0082\2\u0745\u0746\f\5\2\2\u0746\u0748\7\u0165\2\2\u0747"+
		"\u0749\5`\61\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\3\2"+
		"\2\2\u074a\u074c\7\u0166\2\2\u074b\u074d\5\u00e2r\2\u074c\u074b\3\2\2"+
		"\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u0743\3\2\2\2\u074e\u0745"+
		"\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0117\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0758\5\u011a\u008e\2\u0754\u0755"+
		"\5\u0106\u0084\2\u0755\u0756\5\u0118\u008d\2\u0756\u0758\3\2\2\2\u0757"+
		"\u0753\3\2\2\2\u0757\u0754\3\2\2\2\u0758\u0119\3\2\2\2\u0759\u075a\b\u008e"+
		"\1\2\u075a\u075b\7\u0193\2\2\u075b\u0769\3\2\2\2\u075c\u075d\f\5\2\2\u075d"+
		"\u0768\5\u0102\u0082\2\u075e\u075f\f\4\2\2\u075f\u0761\7\u0165\2\2\u0760"+
		"\u0762\5`\61\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\3\2"+
		"\2\2\u0763\u0765\7\u0166\2\2\u0764\u0766\5\u00e2r\2\u0765\u0764\3\2\2"+
		"\2\u0765\u0766\3\2\2\2\u0766\u0768\3\2\2\2\u0767\u075c\3\2\2\2\u0767\u075e"+
		"\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u011b\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076e\5\u011e\u0090\2\u076d\u076c"+
		"\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770\3\2\2\2\u076f\u0771\7\u0193\2"+
		"\2\u0770\u076f\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0777\3\2\2\2\u0772\u0773"+
		"\5\u011e\u0090\2\u0773\u0774\7\u018a\2\2\u0774\u0775\7\u0193\2\2\u0775"+
		"\u0777\3\2\2\2\u0776\u076d\3\2\2\2\u0776\u0772\3\2\2\2\u0777\u011d\3\2"+
		"\2\2\u0778\u0779\b\u0090\1\2\u0779\u077a\5\u0120\u0091\2\u077a\u0780\3"+
		"\2\2\2\u077b\u077c\f\3\2\2\u077c\u077d\7\u018a\2\2\u077d\u077f\5\u0120"+
		"\u0091\2\u077e\u077b\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e\3\2\2\2\u0780"+
		"\u0781\3\2\2\2\u0781\u011f\3\2\2\2\u0782\u0780\3\2\2\2\u0783\u0785\5\u00e2"+
		"r\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2\2\u0786"+
		"\u0787\5\u0090I\2\u0787\u0788\5\u00fc\177\2\u0788\u07a3\3\2\2\2\u0789"+
		"\u078b\5\u00e2r\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078c"+
		"\3\2\2\2\u078c\u078d\5\u0090I\2\u078d\u078e\5\u00fc\177\2\u078e\u078f"+
		"\7\u0173\2\2\u078f\u0790\5\u012a\u0096\2\u0790\u07a3\3\2\2\2\u0791\u0793"+
		"\5\u00e2r\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\3\2\2"+
		"\2\u0794\u0796\5\u0090I\2\u0795\u0797\5\u0112\u008a\2\u0796\u0795\3\2"+
		"\2\2\u0796\u0797\3\2\2\2\u0797\u07a3\3\2\2\2\u0798\u079a\5\u00e2r\2\u0799"+
		"\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079d\5\u0090"+
		"I\2\u079c\u079e\5\u0112\u008a\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2"+
		"\2\u079e\u079f\3\2\2\2\u079f\u07a0\7\u0173\2\2\u07a0\u07a1\5\u012a\u0096"+
		"\2\u07a1\u07a3\3\2\2\2\u07a2\u0784\3\2\2\2\u07a2\u078a\3\2\2\2\u07a2\u0792"+
		"\3\2\2\2\u07a2\u0799\3\2\2\2\u07a3\u0121\3\2\2\2\u07a4\u07a6\5\u00e2r"+
		"\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u07a9"+
		"\5\u0090I\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2"+
		"\2\u07aa\u07ac\5\u00fc\177\2\u07ab\u07ad\5\u0144\u00a3\2\u07ac\u07ab\3"+
		"\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\5\u0124\u0093"+
		"\2\u07af\u0123\3\2\2\2\u07b0\u07b2\5\u015c\u00af\2\u07b1\u07b0\3\2\2\2"+
		"\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07bc\5h\65\2\u07b4\u07bc"+
		"\5\u0182\u00c2\2\u07b5\u07b6\7\u0173\2\2\u07b6\u07b7\7\u0129\2\2\u07b7"+
		"\u07bc\7\u0190\2\2\u07b8\u07b9\7\u0173\2\2\u07b9\u07ba\7\u012a\2\2\u07ba"+
		"\u07bc\7\u0190\2\2\u07bb\u07b1\3\2\2\2\u07bb\u07b4\3\2\2\2\u07bb\u07b5"+
		"\3\2\2\2\u07bb\u07b8\3\2\2\2\u07bc\u0125\3\2\2\2\u07bd\u07c3\5\u0128\u0095"+
		"\2\u07be\u07bf\7\u0163\2\2\u07bf\u07c0\5&\24\2\u07c0\u07c1\7\u0164\2\2"+
		"\u07c1\u07c3\3\2\2\2\u07c2\u07bd\3\2\2\2\u07c2\u07be\3\2\2\2\u07c3\u0127"+
		"\3\2\2\2\u07c4\u07c5\7\u0173\2\2\u07c5\u07c8\5\u012a\u0096\2\u07c6\u07c8"+
		"\5\u012e\u0098\2\u07c7\u07c4\3\2\2\2\u07c7\u07c6\3\2\2\2\u07c8\u0129\3"+
		"\2\2\2\u07c9\u07cc\5Z.\2\u07ca\u07cc\5\u012e\u0098\2\u07cb\u07c9\3\2\2"+
		"\2\u07cb\u07ca\3\2\2\2\u07cc\u012b\3\2\2\2\u07cd\u07ce\b\u0097\1\2\u07ce"+
		"\u07d0\5\u012a\u0096\2\u07cf\u07d1\7\u0193\2\2\u07d0\u07cf\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07da\3\2\2\2\u07d2\u07d3\f\3\2\2\u07d3\u07d4\7\u018a"+
		"\2\2\u07d4\u07d6\5\u012a\u0096\2\u07d5\u07d7\7\u0193\2\2\u07d6\u07d5\3"+
		"\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\3\2\2\2\u07d8\u07d2\3\2\2\2\u07d9"+
		"\u07dc\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u012d\3\2"+
		"\2\2\u07dc\u07da\3\2\2\2\u07dd\u07de\7\u0167\2\2\u07de\u07e0\5\u012c\u0097"+
		"\2\u07df\u07e1\7\u018a\2\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1"+
		"\u07e2\3\2\2\2\u07e2\u07e3\7\u0168\2\2\u07e3\u07e7\3\2\2\2\u07e4\u07e5"+
		"\7\u0167\2\2\u07e5\u07e7\7\u0168\2\2\u07e6\u07dd\3\2\2\2\u07e6\u07e4\3"+
		"\2\2\2\u07e7\u012f\3\2\2\2\u07e8\u07eb\7\u0195\2\2\u07e9\u07eb\5\u0170"+
		"\u00b9\2\u07ea\u07e8\3\2\2\2\u07ea\u07e9\3\2\2\2\u07eb\u0131\3\2\2\2\u07ec"+
		"\u07ed\5\u0134\u009b\2\u07ed\u07ef\7\u0167\2\2\u07ee\u07f0\5\u013c\u009f"+
		"\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2"+
		"\7\u0168\2\2\u07f2\u0133\3\2\2\2\u07f3\u07f5\5\u013a\u009e\2\u07f4\u07f6"+
		"\5\u00e2r\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f7\3\2\2"+
		"\2\u07f7\u07f9\5\u0136\u009c\2\u07f8\u07fa\5\u0138\u009d\2\u07f9\u07f8"+
		"\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\3\2\2\2\u07fb\u07fd\5\u014a\u00a6"+
		"\2\u07fc\u07fb\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0806\3\2\2\2\u07fe\u0800"+
		"\5\u013a\u009e\2\u07ff\u0801\5\u00e2r\2\u0800\u07ff\3\2\2\2\u0800\u0801"+
		"\3\2\2\2\u0801\u0803\3\2\2\2\u0802\u0804\5\u014a\u00a6\2\u0803\u0802\3"+
		"\2\2\2\u0803\u0804\3\2\2\2\u0804\u0806\3\2\2\2\u0805\u07f3\3\2\2\2\u0805"+
		"\u07fe\3\2\2\2\u0806\u0135\3\2\2\2\u0807\u0809\5\f\7\2\u0808\u0807\3\2"+
		"\2\2\u0808\u0809\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080b\5\u0130\u0099"+
		"\2\u080b\u0137\3\2\2\2\u080c\u080d\7\u0134\2\2\u080d\u0139\3\2\2\2\u080e"+
		"\u080f\t\r\2\2\u080f\u013b\3\2\2\2\u0810\u0812\5\u013e\u00a0\2\u0811\u0813"+
		"\5\u013c\u009f\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u081a\3"+
		"\2\2\2\u0814\u0815\5\u0154\u00ab\2\u0815\u0817\7\u018e\2\2\u0816\u0818"+
		"\5\u013c\u009f\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\3"+
		"\2\2\2\u0819\u0810\3\2\2\2\u0819\u0814\3\2\2\2\u081a\u013d\3\2\2\2\u081b"+
		"\u081d\5\u00e2r\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f"+
		"\3\2\2\2\u081e\u0820\5\u0090I\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2"+
		"\2\u0820\u0822\3\2\2\2\u0821\u0823\5\u0140\u00a1\2\u0822\u0821\3\2\2\2"+
		"\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u082c\7\u0190\2\2\u0825"+
		"\u082c\5\u0122\u0092\2\u0826\u082c\5\u00dan\2\u0827\u082c\5\u0086D\2\u0828"+
		"\u082c\5\u0168\u00b5\2\u0829\u082c\5\u0082B\2\u082a\u082c\5\u0088E\2\u082b"+
		"\u081c\3\2\2\2\u082b\u0825\3\2\2\2\u082b\u0826\3\2\2\2\u082b\u0827\3\2"+
		"\2\2\u082b\u0828\3\2\2\2\u082b\u0829\3\2\2\2\u082b\u082a\3\2\2\2\u082c"+
		"\u013f\3\2\2\2\u082d\u082e\b\u00a1\1\2\u082e\u082f\5\u0142\u00a2\2\u082f"+
		"\u0835\3\2\2\2\u0830\u0831\f\3\2\2\u0831\u0832\7\u018a\2\2\u0832\u0834"+
		"\5\u0142\u00a2\2\u0833\u0830\3\2\2\2\u0834\u0837\3\2\2\2\u0835\u0833\3"+
		"\2\2\2\u0835\u0836\3\2\2\2\u0836\u0141\3\2\2\2\u0837\u0835\3\2\2\2\u0838"+
		"\u083a\5\u00fc\177\2\u0839\u083b\5\u0144\u00a3\2\u083a\u0839\3\2\2\2\u083a"+
		"\u083b\3\2\2\2\u083b\u083d\3\2\2\2\u083c\u083e\5\u0148\u00a5\2\u083d\u083c"+
		"\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u084c\3\2\2\2\u083f\u0841\5\u00fc\177"+
		"\2\u0840\u0842\5\u0128\u0095\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2"+
		"\u0842\u084c\3\2\2\2\u0843\u0845\7\u0195\2\2\u0844\u0843\3\2\2\2\u0844"+
		"\u0845\3\2\2\2\u0845\u0847\3\2\2\2\u0846\u0848\5\u00e2r\2\u0847\u0846"+
		"\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\7\u018e\2"+
		"\2\u084a\u084c\5`\61\2\u084b\u0838\3\2\2\2\u084b\u083f\3\2\2\2\u084b\u0844"+
		"\3\2\2\2\u084c\u0143\3\2\2\2\u084d\u084e\b\u00a3\1\2\u084e\u084f\5\u0146"+
		"\u00a4\2\u084f\u0854\3\2\2\2\u0850\u0851\f\3\2\2\u0851\u0853\5\u0146\u00a4"+
		"\2\u0852\u0850\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0855"+
		"\3\2\2\2\u0855\u0145\3\2\2\2\u0856\u0854\3\2\2\2\u0857\u0858\t\16\2\2"+
		"\u0858\u0147\3\2\2\2\u0859\u085a\7\u0173\2\2\u085a\u085b\7\u0198\2\2\u085b"+
		"\u085c\b\u00a5\1\2\u085c\u0149\3\2\2\2\u085d\u085e\7\u018e\2\2\u085e\u085f"+
		"\5\u014c\u00a7\2\u085f\u014b\3\2\2\2\u0860\u0861\b\u00a7\1\2\u0861\u0863"+
		"\5\u014e\u00a8\2\u0862\u0864\7\u0193\2\2\u0863\u0862\3\2\2\2\u0863\u0864"+
		"\3\2\2\2\u0864\u086d\3\2\2\2\u0865\u0866\f\3\2\2\u0866\u0867\7\u018a\2"+
		"\2\u0867\u0869\5\u014e\u00a8\2\u0868\u086a\7\u0193\2\2\u0869\u0868\3\2"+
		"\2\2\u0869\u086a\3\2\2\2\u086a\u086c\3\2\2\2\u086b\u0865\3\2\2\2\u086c"+
		"\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u014d\3\2"+
		"\2\2\u086f\u086d\3\2\2\2\u0870\u0872\5\u00e2r\2\u0871\u0870\3\2\2\2\u0871"+
		"\u0872\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0886\5\u0152\u00aa\2\u0874\u0876"+
		"\5\u00e2r\2\u0875\u0874\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\3\2\2"+
		"\2\u0877\u0879\7\u015e\2\2\u0878\u087a\5\u0154\u00ab\2\u0879\u0878\3\2"+
		"\2\2\u0879\u087a\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u0886\5\u0152\u00aa"+
		"\2\u087c\u087e\5\u00e2r\2\u087d\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e"+
		"\u087f\3\2\2\2\u087f\u0881\5\u0154\u00ab\2\u0880\u0882\7\u015e\2\2\u0881"+
		"\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884\5\u0152"+
		"\u00aa\2\u0884\u0886\3\2\2\2\u0885\u0871\3\2\2\2\u0885\u0875\3\2\2\2\u0885"+
		"\u087d\3\2\2\2\u0886\u014f\3\2\2\2\u0887\u0889\5\f\7\2\u0888\u0887\3\2"+
		"\2\2\u0888\u0889\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088d\5\u0130\u0099"+
		"\2\u088b\u088d\5\u00aeX\2\u088c\u0888\3\2\2\2\u088c\u088b\3\2\2\2\u088d"+
		"\u0151\3\2\2\2\u088e\u088f\5\u0150\u00a9\2\u088f\u0153\3\2\2\2\u0890\u0891"+
		"\t\17\2\2\u0891\u0155\3\2\2\2\u0892\u0893\7\u0142\2\2\u0893\u0894\5\u0158"+
		"\u00ad\2\u0894\u0157\3\2\2\2\u0895\u0897\5\u00a6T\2\u0896\u0898\5\u015a"+
		"\u00ae\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u0159\3\2\2\2\u0899"+
		"\u089b\5\u0106\u0084\2\u089a\u089c\5\u015a\u00ae\2\u089b\u089a\3\2\2\2"+
		"\u089b\u089c\3\2\2\2\u089c\u015b\3\2\2\2\u089d\u089e\7\u018e\2\2\u089e"+
		"\u089f\5\u015e\u00b0\2\u089f\u015d\3\2\2\2\u08a0\u08a2\5\u0160\u00b1\2"+
		"\u08a1\u08a3\7\u0193\2\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08ac\3\2\2\2\u08a4\u08a6\5\u0160\u00b1\2\u08a5\u08a7\7\u0193\2\2\u08a6"+
		"\u08a5\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a9\7\u018a"+
		"\2\2\u08a9\u08aa\5\u015e\u00b0\2\u08aa\u08ac\3\2\2\2\u08ab\u08a0\3\2\2"+
		"\2\u08ab\u08a4\3\2\2\2\u08ac\u015f\3\2\2\2\u08ad\u08ae\5\u0162\u00b2\2"+
		"\u08ae\u08b0\7\u0163\2\2\u08af\u08b1\5&\24\2\u08b0\u08af\3\2\2\2\u08b0"+
		"\u08b1\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\7\u0164\2\2\u08b3\u08b8"+
		"\3\2\2\2\u08b4\u08b5\5\u0162\u00b2\2\u08b5\u08b6\5\u012e\u0098\2\u08b6"+
		"\u08b8\3\2\2\2\u08b7\u08ad\3\2\2\2\u08b7\u08b4\3\2\2\2\u08b8\u0161\3\2"+
		"\2\2\u08b9\u08bc\5\u0150\u00a9\2\u08ba\u08bc\7\u0195\2\2\u08bb\u08b9\3"+
		"\2\2\2\u08bb\u08ba\3\2\2\2\u08bc\u0163\3\2\2\2\u08bd\u08be\7\u0142\2\2"+
		"\u08be\u08bf\5\u0194\u00cb\2\u08bf\u0165\3\2\2\2\u08c0\u08c1\7\u0142\2"+
		"\2\u08c1\u08c2\7\u019e\2\2\u08c2\u08c6\7\u0195\2\2\u08c3\u08c4\7\u0142"+
		"\2\2\u08c4\u08c6\7\u01a1\2\2\u08c5\u08c0\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6"+
		"\u0167\3\2\2\2\u08c7\u08c8\7\u0152\2\2\u08c8\u08c9\7\u0174\2\2\u08c9\u08ca"+
		"\5\u016a\u00b6\2\u08ca\u08cb\7\u0175\2\2\u08cb\u08cc\5~@\2\u08cc\u0169"+
		"\3\2\2\2\u08cd\u08ce\b\u00b6\1\2\u08ce\u08cf\5\u016c\u00b7\2\u08cf\u08d5"+
		"\3\2\2\2\u08d0\u08d1\f\3\2\2\u08d1\u08d2\7\u018a\2\2\u08d2\u08d4\5\u016c"+
		"\u00b7\2\u08d3\u08d0\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5"+
		"\u08d6\3\2\2\2\u08d6\u016b\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d8\u08db\5\u016e"+
		"\u00b8\2\u08d9\u08db\5\u0120\u0091\2\u08da\u08d8\3\2\2\2\u08da\u08d9\3"+
		"\2\2\2\u08db\u016d\3\2\2\2\u08dc\u08de\7\u0123\2\2\u08dd\u08df\7\u0193"+
		"\2\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e1\3\2\2\2\u08e0"+
		"\u08e2\7\u0195\2\2\u08e1\u08e0\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u090d"+
		"\3\2\2\2\u08e3\u08e5\7\u0123\2\2\u08e4\u08e6\7\u0195\2\2\u08e5\u08e4\3"+
		"\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\7\u0173\2\2"+
		"\u08e8\u090d\5\u0110\u0089\2\u08e9\u08eb\7\u015a\2\2\u08ea\u08ec\7\u0193"+
		"\2\2\u08eb\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ee\3\2\2\2\u08ed"+
		"\u08ef\7\u0195\2\2\u08ee\u08ed\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u090d"+
		"\3\2\2\2\u08f0\u08f2\7\u015a\2\2\u08f1\u08f3\7\u0195\2\2\u08f2\u08f1\3"+
		"\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\7\u0173\2\2"+
		"\u08f5\u090d\5\u0110\u0089\2\u08f6\u08f7\7\u0152\2\2\u08f7\u08f8\7\u0174"+
		"\2\2\u08f8\u08f9\5\u016a\u00b6\2\u08f9\u08fa\7\u0175\2\2\u08fa\u08fc\7"+
		"\u0123\2\2\u08fb\u08fd\7\u0193\2\2\u08fc\u08fb\3\2\2\2\u08fc\u08fd\3\2"+
		"\2\2\u08fd\u08ff\3\2\2\2\u08fe\u0900\7\u0195\2\2\u08ff\u08fe\3\2\2\2\u08ff"+
		"\u0900\3\2\2\2\u0900\u090d\3\2\2\2\u0901\u0902\7\u0152\2\2\u0902\u0903"+
		"\7\u0174\2\2\u0903\u0904\5\u016a\u00b6\2\u0904\u0905\7\u0175\2\2\u0905"+
		"\u0907\7\u0123\2\2\u0906\u0908\7\u0195\2\2\u0907\u0906\3\2\2\2\u0907\u0908"+
		"\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\7\u0173\2\2\u090a\u090b\5\6\4"+
		"\2\u090b\u090d\3\2\2\2\u090c\u08dc\3\2\2\2\u090c\u08e3\3\2\2\2\u090c\u08e9"+
		"\3\2\2\2\u090c\u08f0\3\2\2\2\u090c\u08f6\3\2\2\2\u090c\u0901\3\2\2\2\u090d"+
		"\u016f\3\2\2\2\u090e\u090f\5\u0174\u00bb\2\u090f\u0911\7\u0174\2\2\u0910"+
		"\u0912\5\u0176\u00bc\2\u0911\u0910\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913"+
		"\3\2\2\2\u0913\u0914\7\u0175\2\2\u0914\u0171\3\2\2\2\u0915\u0925\5\u0170"+
		"\u00b9\2\u0916\u0917\5\u0164\u00b3\2\u0917\u0919\7\u0174\2\2\u0918\u091a"+
		"\5\u0176\u00bc\2\u0919\u0918\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b\3"+
		"\2\2\2\u091b\u091c\7\u0175\2\2\u091c\u0925\3\2\2\2\u091d\u091e\5\u0166"+
		"\u00b4\2\u091e\u0920\7\u0174\2\2\u091f\u0921\5\u0176\u00bc\2\u0920\u091f"+
		"\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\7\u0175\2"+
		"\2\u0923\u0925\3\2\2\2\u0924\u0915\3\2\2\2\u0924\u0916\3\2\2\2\u0924\u091d"+
		"\3\2\2\2\u0925\u0173\3\2\2\2\u0926\u0927\7\u0195\2\2\u0927\u0175\3\2\2"+
		"\2\u0928\u0929\b\u00bc\1\2\u0929\u092b\5\u0178\u00bd\2\u092a\u092c\7\u0193"+
		"\2\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u0935\3\2\2\2\u092d"+
		"\u092e\f\3\2\2\u092e\u092f\7\u018a\2\2\u092f\u0931\5\u0178\u00bd\2\u0930"+
		"\u0932\7\u0193\2\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0934"+
		"\3\2\2\2\u0933\u092d\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2\2\2\u0935"+
		"\u0936\3\2\2\2\u0936\u0177\3\2\2\2\u0937\u0935\3\2\2\2\u0938\u093c\5\u0110"+
		"\u0089\2\u0939\u093c\5`\61\2\u093a\u093c\5\6\4\2\u093b\u0938\3\2\2\2\u093b"+
		"\u0939\3\2\2\2\u093b\u093a\3\2\2\2\u093c\u0179\3\2\2\2\u093d\u093e\7\u015a"+
		"\2\2\u093e\u093f\5\f\7\2\u093f\u0940\7\u0195\2\2\u0940\u0949\3\2\2\2\u0941"+
		"\u0942\7\u015a\2\2\u0942\u0944\5\f\7\2\u0943\u0945\7\u0152\2\2\u0944\u0943"+
		"\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0947\5\u0170\u00b9"+
		"\2\u0947\u0949\3\2\2\2\u0948\u093d\3\2\2\2\u0948\u0941\3\2\2\2\u0949\u017b"+
		"\3\2\2\2\u094a\u094c\7\u0132\2\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2"+
		"\2\u094c\u094d\3\2\2\2\u094d\u094e\7\u0152\2\2\u094e\u094f\5~@\2\u094f"+
		"\u017d\3\2\2\2\u0950\u0951\7\u0152\2\2\u0951\u0952\7\u0174\2\2\u0952\u0953"+
		"\7\u0175\2\2\u0953\u0954\5~@\2\u0954\u017f\3\2\2\2\u0955\u0956\7\u0157"+
		"\2\2\u0956\u0957\5h\65\2\u0957\u0958\5\u0184\u00c3\2\u0958\u0181\3\2\2"+
		"\2\u0959\u095b\7\u0157\2\2\u095a\u095c\5\u015c\u00af\2\u095b\u095a\3\2"+
		"\2\2\u095b\u095c\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\5h\65\2\u095e"+
		"\u095f\5\u0184\u00c3\2\u095f\u0183\3\2\2\2\u0960\u0962\5\u0186\u00c4\2"+
		"\u0961\u0963\5\u0184\u00c3\2\u0962\u0961\3\2\2\2\u0962\u0963\3\2\2\2\u0963"+
		"\u0185\3\2\2\2\u0964\u0965\7\u011f\2\2\u0965\u0966\7\u0163\2\2\u0966\u0967"+
		"\5\u0188\u00c5\2\u0967\u0968\7\u0164\2\2\u0968\u0969\5h\65\2\u0969\u0187"+
		"\3\2\2\2\u096a\u096c\5\u00e2r\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2"+
		"\2\u096c\u096d\3\2\2\2\u096d\u096e\5\u00a6T\2\u096e\u096f\5\u00fc\177"+
		"\2\u096f\u0979\3\2\2\2\u0970\u0972\5\u00e2r\2\u0971\u0970\3\2\2\2\u0971"+
		"\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0975\5\u00a6T\2\u0974\u0976"+
		"\5\u0112\u008a\2\u0975\u0974\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0979\3"+
		"\2\2\2\u0977\u0979\7\u0193\2\2\u0978\u096b\3\2\2\2\u0978\u0971\3\2\2\2"+
		"\u0978\u0977\3\2\2\2\u0979\u0189\3\2\2\2\u097a\u097c\7\u0155\2\2\u097b"+
		"\u097d\5Z.\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u018b\3\2\2"+
		"\2\u097e\u0981\5\u018e\u00c8\2\u097f\u0981\5\u0192\u00ca\2\u0980\u097e"+
		"\3\2\2\2\u0980\u097f\3\2\2\2\u0981\u018d\3\2\2\2\u0982\u0983\7\u0155\2"+
		"\2\u0983\u0985\7\u0163\2\2\u0984\u0986\5\u0190\u00c9\2\u0985\u0984";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988\7\u0164\2"+
		"\2\u0988\u018f\3\2\2\2\u0989\u098a\b\u00c9\1\2\u098a\u098c\5\u0110\u0089"+
		"\2\u098b\u098d\7\u0193\2\2\u098c\u098b\3\2\2\2\u098c\u098d\3\2\2\2\u098d"+
		"\u0996\3\2\2\2\u098e\u098f\f\3\2\2\u098f\u0990\7\u018a\2\2\u0990\u0992"+
		"\5\u0110\u0089\2\u0991\u0993\7\u0193\2\2\u0992\u0991\3\2\2\2\u0992\u0993"+
		"\3\2\2\2\u0993\u0995\3\2\2\2\u0994\u098e\3\2\2\2\u0995\u0998\3\2\2\2\u0996"+
		"\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0191\3\2\2\2\u0998\u0996\3\2"+
		"\2\2\u0999\u099a\7\u0140\2\2\u099a\u099b\7\u0163\2\2\u099b\u099c\5`\61"+
		"\2\u099c\u099d\7\u0164\2\2\u099d\u09a0\3\2\2\2\u099e\u09a0\7\u0140\2\2"+
		"\u099f\u0999\3\2\2\2\u099f\u099e\3\2\2\2\u09a0\u0193\3\2\2\2\u09a1\u09d5"+
		"\7\u013f\2\2\u09a2\u09d5\7\u012a\2\2\u09a3\u09a4\7\u013f\2\2\u09a4\u09a5"+
		"\7\u0165\2\2\u09a5\u09d5\7\u0166\2\2\u09a6\u09a7\7\u012a\2\2\u09a7\u09a8"+
		"\7\u0165\2\2\u09a8\u09d5\7\u0166\2\2\u09a9\u09d5\7\u0169\2\2\u09aa\u09d5"+
		"\7\u016a\2\2\u09ab\u09d5\7\u016b\2\2\u09ac\u09d5\7\u016c\2\2\u09ad\u09d5"+
		"\7\u016d\2\2\u09ae\u09d5\7\u016e\2\2\u09af\u09d5\7\u016f\2\2\u09b0\u09d5"+
		"\7\u0170\2\2\u09b1\u09d5\7\u0171\2\2\u09b2\u09d5\7\3\2\2\u09b3\u09d5\7"+
		"\4\2\2\u09b4\u09d5\7\u0173\2\2\u09b5\u09d5\7\u0174\2\2\u09b6\u09d5\7\u0175"+
		"\2\2\u09b7\u09d5\7\u0176\2\2\u09b8\u09d5\7\u0177\2\2\u09b9\u09d5\7\u0178"+
		"\2\2\u09ba\u09d5\7\u0179\2\2\u09bb\u09d5\7\u017a\2\2\u09bc\u09d5\7\u017b"+
		"\2\2\u09bd\u09d5\7\u017c\2\2\u09be\u09d5\7\u017d\2\2\u09bf\u09d5\7\u017e"+
		"\2\2\u09c0\u09d5\7\u017f\2\2\u09c1\u09d5\7\u0181\2\2\u09c2\u09d5\7\u0180"+
		"\2\2\u09c3\u09d5\7\u0182\2\2\u09c4\u09d5\7\u0183\2\2\u09c5\u09d5\7\u0184"+
		"\2\2\u09c6\u09d5\7\u0185\2\2\u09c7\u09d5\7\5\2\2\u09c8\u09d5\7\6\2\2\u09c9"+
		"\u09d5\7\7\2\2\u09ca\u09d5\7\b\2\2\u09cb\u09d5\7\u0188\2\2\u09cc\u09d5"+
		"\7\u0189\2\2\u09cd\u09d5\7\u018a\2\2\u09ce\u09d5\7\u018b\2\2\u09cf\u09d5"+
		"\7\u018c\2\2\u09d0\u09d1\7\u0163\2\2\u09d1\u09d5\7\u0164\2\2\u09d2\u09d3"+
		"\7\u0165\2\2\u09d3\u09d5\7\u0166\2\2\u09d4\u09a1\3\2\2\2\u09d4\u09a2\3"+
		"\2\2\2\u09d4\u09a3\3\2\2\2\u09d4\u09a6\3\2\2\2\u09d4\u09a9\3\2\2\2\u09d4"+
		"\u09aa\3\2\2\2\u09d4\u09ab\3\2\2\2\u09d4\u09ac\3\2\2\2\u09d4\u09ad\3\2"+
		"\2\2\u09d4\u09ae\3\2\2\2\u09d4\u09af\3\2\2\2\u09d4\u09b0\3\2\2\2\u09d4"+
		"\u09b1\3\2\2\2\u09d4\u09b2\3\2\2\2\u09d4\u09b3\3\2\2\2\u09d4\u09b4\3\2"+
		"\2\2\u09d4\u09b5\3\2\2\2\u09d4\u09b6\3\2\2\2\u09d4\u09b7\3\2\2\2\u09d4"+
		"\u09b8\3\2\2\2\u09d4\u09b9\3\2\2\2\u09d4\u09ba\3\2\2\2\u09d4\u09bb\3\2"+
		"\2\2\u09d4\u09bc\3\2\2\2\u09d4\u09bd\3\2\2\2\u09d4\u09be\3\2\2\2\u09d4"+
		"\u09bf\3\2\2\2\u09d4\u09c0\3\2\2\2\u09d4\u09c1\3\2\2\2\u09d4\u09c2\3\2"+
		"\2\2\u09d4\u09c3\3\2\2\2\u09d4\u09c4\3\2\2\2\u09d4\u09c5\3\2\2\2\u09d4"+
		"\u09c6\3\2\2\2\u09d4\u09c7\3\2\2\2\u09d4\u09c8\3\2\2\2\u09d4\u09c9\3\2"+
		"\2\2\u09d4\u09ca\3\2\2\2\u09d4\u09cb\3\2\2\2\u09d4\u09cc\3\2\2\2\u09d4"+
		"\u09cd\3\2\2\2\u09d4\u09ce\3\2\2\2\u09d4\u09cf\3\2\2\2\u09d4\u09d0\3\2"+
		"\2\2\u09d4\u09d2\3\2\2\2\u09d5\u0195\3\2\2\2\u09d6\u09de\7\u0196\2\2\u09d7"+
		"\u09de\7\u019c\2\2\u09d8\u09de\7\u019d\2\2\u09d9\u09de\7\u019e\2\2\u09da"+
		"\u09de\5\u0198\u00cd\2\u09db\u09de\5\u019a\u00ce\2\u09dc\u09de\5\u019c"+
		"\u00cf\2\u09dd\u09d6\3\2\2\2\u09dd\u09d7\3\2\2\2\u09dd\u09d8\3\2\2\2\u09dd"+
		"\u09d9\3\2\2\2\u09dd\u09da\3\2\2\2\u09dd\u09db\3\2\2\2\u09dd\u09dc\3\2"+
		"\2\2\u09de\u0197\3\2\2\2\u09df\u09e0\t\20\2\2\u09e0\u0199\3\2\2\2\u09e1"+
		"\u09e2\7\u0141\2\2\u09e2\u019b\3\2\2\2\u09e3\u09e4\t\21\2\2\u09e4\u019d"+
		"\3\2\2\2\u0146\u019f\u01ab\u01af\u01ba\u01be\u01cd\u01d4\u01d9\u01db\u01e0"+
		"\u01e6\u01f0\u01f7\u01fd\u0201\u0206\u020c\u0213\u0219\u021c\u021f\u0222"+
		"\u0229\u0230\u0264\u0273\u0279\u027f\u028c\u028e\u0298\u02a7\u02ad\u02cb"+
		"\u02d0\u02d4\u02d8\u02db\u02df\u02e5\u02e7\u02ef\u02f3\u02f6\u02fd\u0304"+
		"\u0308\u030d\u0311\u0314\u0319\u031f\u032c\u0337\u0339\u0348\u034a\u0356"+
		"\u0358\u0364\u0378\u037a\u0386\u0388\u0393\u039e\u03a9\u03b5\u03b7\u03c3"+
		"\u03c5\u03cf\u03d7\u03e3\u03ea\u03ee\u03f2\u03f6\u03fa\u03ff\u0402\u0405"+
		"\u040b\u0413\u0418\u041b\u0421\u042c\u0443\u0447\u044f\u0455\u0469\u046d"+
		"\u047a\u047e\u0481\u0488\u0490\u049a\u04a5\u04b1\u04bb\u04c0\u04c7\u04ca"+
		"\u04cf\u04d4\u04eb\u04f0\u04f4\u04f9\u0501\u0505\u050b\u050f\u0513\u0518"+
		"\u051a\u052d\u0535\u0539\u053e\u0542\u0547\u054a\u0561\u0567\u0572\u0576"+
		"\u0579\u0583\u0589\u058c\u0593\u059d\u05a1\u05a4\u05a7\u05ab\u05b0\u05b2"+
		"\u05b6\u05ba\u05c3\u05d0\u05d8\u05de\u05e4\u05e8\u05eb\u05f4\u05fd\u0605"+
		"\u0610\u0616\u0621\u0624\u0629\u0638\u063e\u0647\u0651\u0657\u065f\u0663"+
		"\u0667\u066c\u0671\u0678\u067a\u067f\u0683\u0691\u0697\u06a9\u06ab\u06b5"+
		"\u06ba\u06c1\u06c7\u06cc\u06d2\u06d9\u06dd\u06df\u06e1\u06e8\u06eb\u06ee"+
		"\u06f1\u06f6\u06fa\u06fd\u0701\u0705\u070a\u070d\u070f\u0713\u071a\u0720"+
		"\u0724\u072a\u072f\u0731\u0737\u073b\u0741\u0748\u074c\u074e\u0750\u0757"+
		"\u0761\u0765\u0767\u0769\u076d\u0770\u0776\u0780\u0784\u078a\u0792\u0796"+
		"\u0799\u079d\u07a2\u07a5\u07a8\u07ac\u07b1\u07bb\u07c2\u07c7\u07cb\u07d0"+
		"\u07d6\u07da\u07e0\u07e6\u07ea\u07ef\u07f5\u07f9\u07fc\u0800\u0803\u0805"+
		"\u0808\u0812\u0817\u0819\u081c\u081f\u0822\u082b\u0835\u083a\u083d\u0841"+
		"\u0844\u0847\u084b\u0854\u0863\u0869\u086d\u0871\u0875\u0879\u087d\u0881"+
		"\u0885\u0888\u088c\u0897\u089b\u08a2\u08a6\u08ab\u08b0\u08b7\u08bb\u08c5"+
		"\u08d5\u08da\u08de\u08e1\u08e5\u08eb\u08ee\u08f2\u08fc\u08ff\u0907\u090c"+
		"\u0911\u0919\u0920\u0924\u092b\u0931\u0935\u093b\u0944\u0948\u094b\u095b"+
		"\u0962\u096b\u0971\u0975\u0978\u097c\u0980\u0985\u098c\u0992\u0996\u099f"+
		"\u09d4\u09dd";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}