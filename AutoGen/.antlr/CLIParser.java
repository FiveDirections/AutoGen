// Generated from e:\Data\Projects\FiveDir\AutoGen\AutoGen\CLI.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ALL=9, 
		DATABASE=10, EXCLUDE_DLLS=11, EXPORTS=12, GENERATE=13, NOGENERATE=14, 
		HELP=15, IMPORTS=16, INCLUDE_DLLS=17, OUTPUT=18, RECURSE=19, VERBOSE=20, 
		WEBSCRAPE=21, NOWEBSCRAPE=22, FILE_NAME=23, COMMENT=24, WS=25;
	public static final int
		RULE_start = 0, RULE_script = 1, RULE_input_files = 2, RULE_qualifier = 3, 
		RULE_all_qual = 4, RULE_database_qual = 5, RULE_exclude_dlls_qual = 6, 
		RULE_exports_qual = 7, RULE_generate_qual = 8, RULE_help_qual = 9, RULE_imports_qual = 10, 
		RULE_include_dlls_qual = 11, RULE_output_qual = 12, RULE_recurse_qual = 13, 
		RULE_verbose_qual = 14, RULE_webscrape_qual = 15, RULE_file = 16, RULE_file_list = 17, 
		RULE_qual_char = 18, RULE_assignment_char = 19;
	public static final String[] ruleNames = {
		"start", "script", "input_files", "qualifier", "all_qual", "database_qual", 
		"exclude_dlls_qual", "exports_qual", "generate_qual", "help_qual", "imports_qual", 
		"include_dlls_qual", "output_qual", "recurse_qual", "verbose_qual", "webscrape_qual", 
		"file", "file_list", "qual_char", "assignment_char"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'('", "')'", "','", "'/'", "'-'", "'='", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ALL", "DATABASE", 
		"EXCLUDE_DLLS", "EXPORTS", "GENERATE", "NOGENERATE", "HELP", "IMPORTS", 
		"INCLUDE_DLLS", "OUTPUT", "RECURSE", "VERBOSE", "WEBSCRAPE", "NOWEBSCRAPE", 
		"FILE_NAME", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "CLI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public List<QualifierContext> qualifier() {
			return getRuleContexts(QualifierContext.class);
		}
		public QualifierContext qualifier(int i) {
			return getRuleContext(QualifierContext.class,i);
		}
		public List<Input_filesContext> input_files() {
			return getRuleContexts(Input_filesContext.class);
		}
		public Input_filesContext input_files(int i) {
			return getRuleContext(Input_filesContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				script();
				}
				break;
			case EOF:
			case T__4:
			case T__5:
			case FILE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41);
						qualifier();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FILE_NAME) {
					{
					{
					setState(47);
					input_files();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==T__5) {
					{
					{
					setState(53);
					qualifier();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode FILE_NAME() { return getToken(CLIParser.FILE_NAME, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(FILE_NAME);
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

	public static class Input_filesContext extends ParserRuleContext {
		public List<TerminalNode> FILE_NAME() { return getTokens(CLIParser.FILE_NAME); }
		public TerminalNode FILE_NAME(int i) {
			return getToken(CLIParser.FILE_NAME, i);
		}
		public Input_filesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_files; }
	}

	public final Input_filesContext input_files() throws RecognitionException {
		Input_filesContext _localctx = new Input_filesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_files);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					match(FILE_NAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QualifierContext extends ParserRuleContext {
		public All_qualContext all_qual() {
			return getRuleContext(All_qualContext.class,0);
		}
		public Database_qualContext database_qual() {
			return getRuleContext(Database_qualContext.class,0);
		}
		public Exclude_dlls_qualContext exclude_dlls_qual() {
			return getRuleContext(Exclude_dlls_qualContext.class,0);
		}
		public Exports_qualContext exports_qual() {
			return getRuleContext(Exports_qualContext.class,0);
		}
		public Help_qualContext help_qual() {
			return getRuleContext(Help_qualContext.class,0);
		}
		public Generate_qualContext generate_qual() {
			return getRuleContext(Generate_qualContext.class,0);
		}
		public Imports_qualContext imports_qual() {
			return getRuleContext(Imports_qualContext.class,0);
		}
		public Include_dlls_qualContext include_dlls_qual() {
			return getRuleContext(Include_dlls_qualContext.class,0);
		}
		public Output_qualContext output_qual() {
			return getRuleContext(Output_qualContext.class,0);
		}
		public Recurse_qualContext recurse_qual() {
			return getRuleContext(Recurse_qualContext.class,0);
		}
		public Verbose_qualContext verbose_qual() {
			return getRuleContext(Verbose_qualContext.class,0);
		}
		public Webscrape_qualContext webscrape_qual() {
			return getRuleContext(Webscrape_qualContext.class,0);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifier);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				all_qual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				database_qual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				exclude_dlls_qual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				exports_qual();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				help_qual();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				generate_qual();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				imports_qual();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				include_dlls_qual();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				output_qual();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				recurse_qual();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(79);
				verbose_qual();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(80);
				webscrape_qual();
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

	public static class All_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode ALL() { return getToken(CLIParser.ALL, 0); }
		public All_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_qual; }
	}

	public final All_qualContext all_qual() throws RecognitionException {
		All_qualContext _localctx = new All_qualContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_all_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			qual_char();
			setState(84);
			match(ALL);
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

	public static class Database_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(CLIParser.DATABASE, 0); }
		public Assignment_charContext assignment_char() {
			return getRuleContext(Assignment_charContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public Database_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_qual; }
	}

	public final Database_qualContext database_qual() throws RecognitionException {
		Database_qualContext _localctx = new Database_qualContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_database_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			qual_char();
			setState(87);
			match(DATABASE);
			setState(88);
			assignment_char();
			setState(89);
			file();
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

	public static class Exclude_dlls_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode EXCLUDE_DLLS() { return getToken(CLIParser.EXCLUDE_DLLS, 0); }
		public Assignment_charContext assignment_char() {
			return getRuleContext(Assignment_charContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public File_listContext file_list() {
			return getRuleContext(File_listContext.class,0);
		}
		public Exclude_dlls_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_dlls_qual; }
	}

	public final Exclude_dlls_qualContext exclude_dlls_qual() throws RecognitionException {
		Exclude_dlls_qualContext _localctx = new Exclude_dlls_qualContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exclude_dlls_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			qual_char();
			setState(92);
			match(EXCLUDE_DLLS);
			setState(93);
			assignment_char();
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE_NAME:
				{
				setState(94);
				file();
				}
				break;
			case T__1:
				{
				setState(95);
				match(T__1);
				setState(96);
				file_list();
				setState(97);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exports_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode EXPORTS() { return getToken(CLIParser.EXPORTS, 0); }
		public Exports_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports_qual; }
	}

	public final Exports_qualContext exports_qual() throws RecognitionException {
		Exports_qualContext _localctx = new Exports_qualContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exports_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			qual_char();
			setState(102);
			match(EXPORTS);
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

	public static class Generate_qualContext extends ParserRuleContext {
		public Generate_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_qual; }
	 
		public Generate_qualContext() { }
		public void copyFrom(Generate_qualContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class No_generateContext extends Generate_qualContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode NOGENERATE() { return getToken(CLIParser.NOGENERATE, 0); }
		public No_generateContext(Generate_qualContext ctx) { copyFrom(ctx); }
	}
	public static class GenerateContext extends Generate_qualContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode GENERATE() { return getToken(CLIParser.GENERATE, 0); }
		public GenerateContext(Generate_qualContext ctx) { copyFrom(ctx); }
	}

	public final Generate_qualContext generate_qual() throws RecognitionException {
		Generate_qualContext _localctx = new Generate_qualContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_generate_qual);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new GenerateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				qual_char();
				setState(105);
				match(GENERATE);
				}
				break;
			case 2:
				_localctx = new No_generateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				qual_char();
				setState(108);
				match(NOGENERATE);
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

	public static class Help_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode HELP() { return getToken(CLIParser.HELP, 0); }
		public Help_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help_qual; }
	}

	public final Help_qualContext help_qual() throws RecognitionException {
		Help_qualContext _localctx = new Help_qualContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_help_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			qual_char();
			setState(113);
			match(HELP);
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

	public static class Imports_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode IMPORTS() { return getToken(CLIParser.IMPORTS, 0); }
		public Imports_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports_qual; }
	}

	public final Imports_qualContext imports_qual() throws RecognitionException {
		Imports_qualContext _localctx = new Imports_qualContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imports_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			qual_char();
			setState(116);
			match(IMPORTS);
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

	public static class Include_dlls_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode INCLUDE_DLLS() { return getToken(CLIParser.INCLUDE_DLLS, 0); }
		public Assignment_charContext assignment_char() {
			return getRuleContext(Assignment_charContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public File_listContext file_list() {
			return getRuleContext(File_listContext.class,0);
		}
		public Include_dlls_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_dlls_qual; }
	}

	public final Include_dlls_qualContext include_dlls_qual() throws RecognitionException {
		Include_dlls_qualContext _localctx = new Include_dlls_qualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_include_dlls_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			qual_char();
			setState(119);
			match(INCLUDE_DLLS);
			setState(120);
			assignment_char();
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE_NAME:
				{
				setState(121);
				file();
				}
				break;
			case T__1:
				{
				setState(122);
				match(T__1);
				setState(123);
				file_list();
				setState(124);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Output_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(CLIParser.OUTPUT, 0); }
		public Assignment_charContext assignment_char() {
			return getRuleContext(Assignment_charContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public Output_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_qual; }
	}

	public final Output_qualContext output_qual() throws RecognitionException {
		Output_qualContext _localctx = new Output_qualContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			qual_char();
			setState(129);
			match(OUTPUT);
			setState(130);
			assignment_char();
			setState(131);
			file();
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

	public static class Recurse_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode RECURSE() { return getToken(CLIParser.RECURSE, 0); }
		public Recurse_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurse_qual; }
	}

	public final Recurse_qualContext recurse_qual() throws RecognitionException {
		Recurse_qualContext _localctx = new Recurse_qualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recurse_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			qual_char();
			setState(134);
			match(RECURSE);
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

	public static class Verbose_qualContext extends ParserRuleContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode VERBOSE() { return getToken(CLIParser.VERBOSE, 0); }
		public Verbose_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbose_qual; }
	}

	public final Verbose_qualContext verbose_qual() throws RecognitionException {
		Verbose_qualContext _localctx = new Verbose_qualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_verbose_qual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			qual_char();
			setState(137);
			match(VERBOSE);
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

	public static class Webscrape_qualContext extends ParserRuleContext {
		public Webscrape_qualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webscrape_qual; }
	 
		public Webscrape_qualContext() { }
		public void copyFrom(Webscrape_qualContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class No_webscrapeContext extends Webscrape_qualContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode NOWEBSCRAPE() { return getToken(CLIParser.NOWEBSCRAPE, 0); }
		public No_webscrapeContext(Webscrape_qualContext ctx) { copyFrom(ctx); }
	}
	public static class WebscrapeContext extends Webscrape_qualContext {
		public Qual_charContext qual_char() {
			return getRuleContext(Qual_charContext.class,0);
		}
		public TerminalNode WEBSCRAPE() { return getToken(CLIParser.WEBSCRAPE, 0); }
		public WebscrapeContext(Webscrape_qualContext ctx) { copyFrom(ctx); }
	}

	public final Webscrape_qualContext webscrape_qual() throws RecognitionException {
		Webscrape_qualContext _localctx = new Webscrape_qualContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_webscrape_qual);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new WebscrapeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				qual_char();
				setState(140);
				match(WEBSCRAPE);
				}
				break;
			case 2:
				_localctx = new No_webscrapeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				qual_char();
				setState(143);
				match(NOWEBSCRAPE);
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILE_NAME() { return getToken(CLIParser.FILE_NAME, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FILE_NAME);
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

	public static class File_listContext extends ParserRuleContext {
		public List<TerminalNode> FILE_NAME() { return getTokens(CLIParser.FILE_NAME); }
		public TerminalNode FILE_NAME(int i) {
			return getToken(CLIParser.FILE_NAME, i);
		}
		public File_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_list; }
	}

	public final File_listContext file_list() throws RecognitionException {
		File_listContext _localctx = new File_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_file_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FILE_NAME);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(150);
				match(T__3);
				setState(151);
				match(FILE_NAME);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Qual_charContext extends ParserRuleContext {
		public Qual_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qual_char; }
	}

	public final Qual_charContext qual_char() throws RecognitionException {
		Qual_charContext _localctx = new Qual_charContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qual_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class Assignment_charContext extends ParserRuleContext {
		public Assignment_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_char; }
	}

	public final Assignment_charContext assignment_char() throws RecognitionException {
		Assignment_charContext _localctx = new Assignment_charContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\5\2>\n\2\3\3\3"+
		"\3\3\3\3\4\6\4D\n\4\r\4\16\4E\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0094\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u009b\n\23"+
		"\f\23\16\23\u009e\13\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\7\b\3\2\t\n\2\u00a4\2=\3\2\2\2"+
		"\4?\3\2\2\2\6C\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fX\3\2\2\2\16]\3\2\2\2\20"+
		"g\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26u\3\2\2\2\30x\3\2\2\2\32\u0082\3\2"+
		"\2\2\34\u0087\3\2\2\2\36\u008a\3\2\2\2 \u0093\3\2\2\2\"\u0095\3\2\2\2"+
		"$\u0097\3\2\2\2&\u009f\3\2\2\2(\u00a1\3\2\2\2*>\5\4\3\2+-\5\b\5\2,+\3"+
		"\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5"+
		"\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2"+
		"\2\2\66\64\3\2\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2=*\3\2\2\2=.\3\2\2\2>\3\3\2\2\2?@\7\3\2\2@A\7\31"+
		"\2\2A\5\3\2\2\2BD\7\31\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7"+
		"\3\2\2\2GT\5\n\6\2HT\5\f\7\2IT\5\16\b\2JT\5\20\t\2KT\5\24\13\2LT\5\22"+
		"\n\2MT\5\26\f\2NT\5\30\r\2OT\5\32\16\2PT\5\34\17\2QT\5\36\20\2RT\5 \21"+
		"\2SG\3\2\2\2SH\3\2\2\2SI\3\2\2\2SJ\3\2\2\2SK\3\2\2\2SL\3\2\2\2SM\3\2\2"+
		"\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2UV\5&\24"+
		"\2VW\7\13\2\2W\13\3\2\2\2XY\5&\24\2YZ\7\f\2\2Z[\5(\25\2[\\\5\"\22\2\\"+
		"\r\3\2\2\2]^\5&\24\2^_\7\r\2\2_e\5(\25\2`f\5\"\22\2ab\7\4\2\2bc\5$\23"+
		"\2cd\7\5\2\2df\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\17\3\2\2\2gh\5&\24\2hi\7\16"+
		"\2\2i\21\3\2\2\2jk\5&\24\2kl\7\17\2\2lq\3\2\2\2mn\5&\24\2no\7\20\2\2o"+
		"q\3\2\2\2pj\3\2\2\2pm\3\2\2\2q\23\3\2\2\2rs\5&\24\2st\7\21\2\2t\25\3\2"+
		"\2\2uv\5&\24\2vw\7\22\2\2w\27\3\2\2\2xy\5&\24\2yz\7\23\2\2z\u0080\5(\25"+
		"\2{\u0081\5\"\22\2|}\7\4\2\2}~\5$\23\2~\177\7\5\2\2\177\u0081\3\2\2\2"+
		"\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\5&\24\2\u0083"+
		"\u0084\7\24\2\2\u0084\u0085\5(\25\2\u0085\u0086\5\"\22\2\u0086\33\3\2"+
		"\2\2\u0087\u0088\5&\24\2\u0088\u0089\7\25\2\2\u0089\35\3\2\2\2\u008a\u008b"+
		"\5&\24\2\u008b\u008c\7\26\2\2\u008c\37\3\2\2\2\u008d\u008e\5&\24\2\u008e"+
		"\u008f\7\27\2\2\u008f\u0094\3\2\2\2\u0090\u0091\5&\24\2\u0091\u0092\7"+
		"\30\2\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094"+
		"!\3\2\2\2\u0095\u0096\7\31\2\2\u0096#\3\2\2\2\u0097\u009c\7\31\2\2\u0098"+
		"\u0099\7\6\2\2\u0099\u009b\7\31\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d%\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\'\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2"+
		")\3\2\2\2\r.\64:=ESep\u0080\u0093\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}