// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PracticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, CONST_DEF_IDENTIFIER=33, IDENTIFIER=34, NUMERIC_INTEGER_CONST=35, 
		NUMERIC_REAL_CONST=36, MIXED_REAL=37, FIXED_POINT=38, INITIAL_POINT=39, 
		EXPONENTIAL=40, STRING_CONST=41, DOUBLE=42, SIMPLE=43, COMMENT=44, ONE_LINE=45, 
		IGNORE=46, MULTIPLE_LINE=47;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_funlist = 2, RULE_sentlist = 3, 
		RULE_dcl = 4, RULE_ctelist = 5, RULE_ctelist1 = 6, RULE_simpvalue = 7, 
		RULE_varlist = 8, RULE_varlis1 = 9, RULE_vardef = 10, RULE_tbas = 11, 
		RULE_tvoid = 12, RULE_struct = 13, RULE_funcdef = 14, RULE_funchead = 15, 
		RULE_typedef1 = 16, RULE_typedef2 = 17, RULE_typedef2_tail = 18, RULE_mainhead = 19, 
		RULE_code = 20, RULE_sent = 21, RULE_asig = 22, RULE_exp = 23, RULE_exp1 = 24, 
		RULE_op = 25, RULE_factor = 26, RULE_funccall = 27, RULE_subpparamlist = 28, 
		RULE_explist = 29, RULE_explist1 = 30, RULE_if = 31, RULE_else = 32, RULE_else1 = 33, 
		RULE_while = 34, RULE_dowhile = 35, RULE_for = 36, RULE_for1 = 37, RULE_expcond = 38, 
		RULE_expcond_tail = 39, RULE_oplog = 40, RULE_factorcond = 41, RULE_opcomp = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "funlist", "sentlist", "dcl", "ctelist", "ctelist1", 
			"simpvalue", "varlist", "varlis1", "vardef", "tbas", "tvoid", "struct", 
			"funcdef", "funchead", "typedef1", "typedef2", "typedef2_tail", "mainhead", 
			"code", "sent", "asig", "exp", "exp1", "op", "factor", "funccall", "subpparamlist", 
			"explist", "explist1", "if", "else", "else1", "while", "dowhile", "for", 
			"for1", "expcond", "expcond_tail", "oplog", "factorcond", "opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'#define'", "';'", "'='", "'integer'", "'float'", 
			"'string'", "'void'", "'struct'", "'('", "')'", "','", "'Main'", "'+'", 
			"'-'", "'*'", "'DIV'", "'MOD'", "'if'", "'else'", "'while'", "'do'", 
			"'for'", "'||'", "'&'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "CONST_DEF_IDENTIFIER", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "MIXED_REAL", 
			"FIXED_POINT", "INITIAL_POINT", "EXPONENTIAL", "STRING_CONST", "DOUBLE", 
			"SIMPLE", "COMMENT", "ONE_LINE", "IGNORE", "MULTIPLE_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PracticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			dcllist();
			setState(87);
			funlist();
			setState(88);
			sentlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				dcl();
				setState(92);
				dcllist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunlistContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public FunlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFunlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFunlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFunlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunlistContext funlist() throws RecognitionException {
		FunlistContext _localctx = new FunlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funlist);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				funcdef();
				setState(98);
				funlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public MainheadContext mainhead() {
			return getRuleContext(MainheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			mainhead();
			setState(103);
			match(T__0);
			setState(104);
			code();
			setState(105);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				ctelist();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				varlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__2);
			setState(112);
			match(CONST_DEF_IDENTIFIER);
			setState(113);
			simpvalue();
			setState(114);
			ctelist1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ctelist1Context extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public Ctelist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCtelist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCtelist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitCtelist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist1Context ctelist1() throws RecognitionException {
		Ctelist1Context _localctx = new Ctelist1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctelist1);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__2);
				setState(117);
				match(CONST_DEF_IDENTIFIER);
				setState(118);
				simpvalue();
				setState(119);
				ctelist1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(PracticaParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(PracticaParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(PracticaParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2302102470656L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Varlis1Context varlis1() {
			return getRuleContext(Varlis1Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			vardef();
			setState(127);
			match(T__3);
			setState(128);
			varlis1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Varlis1Context extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Varlis1Context varlis1() {
			return getRuleContext(Varlis1Context.class,0);
		}
		public Varlis1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlis1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterVarlis1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitVarlis1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitVarlis1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlis1Context varlis1() throws RecognitionException {
		Varlis1Context _localctx = new Varlis1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_varlis1);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				vardef();
				setState(131);
				match(T__3);
				setState(132);
				varlis1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardefContext extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardef);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				tbas();
				setState(138);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				tbas();
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(T__4);
				setState(143);
				simpvalue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tbas);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				tvoid();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				struct();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TvoidContext extends ParserRuleContext {
		public TvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitTvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvoidContext tvoid() throws RecognitionException {
		TvoidContext _localctx = new TvoidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__9);
			setState(157);
			match(T__0);
			setState(158);
			varlist();
			setState(159);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdefContext extends ParserRuleContext {
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			funchead();
			setState(162);
			match(T__0);
			setState(163);
			code();
			setState(164);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheadContext extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public FuncheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funchead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFunchead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFunchead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFunchead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncheadContext funchead() throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funchead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			tbas();
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(T__10);
			setState(169);
			typedef1();
			setState(170);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef1Context extends ParserRuleContext {
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTypedef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTypedef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitTypedef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef1Context typedef1() throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedef1);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				typedef2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2Context extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public Typedef2_tailContext typedef2_tail() {
			return getRuleContext(Typedef2_tailContext.class,0);
		}
		public Typedef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTypedef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTypedef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitTypedef2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef2Context typedef2() throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_typedef2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			tbas();
			setState(177);
			match(IDENTIFIER);
			setState(178);
			typedef2_tail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2_tailContext extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public Typedef2_tailContext typedef2_tail() {
			return getRuleContext(Typedef2_tailContext.class,0);
		}
		public Typedef2_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef2_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTypedef2_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTypedef2_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitTypedef2_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef2_tailContext typedef2_tail() throws RecognitionException {
		Typedef2_tailContext _localctx = new Typedef2_tailContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedef2_tail);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__12);
				setState(181);
				tbas();
				setState(182);
				match(IDENTIFIER);
				setState(183);
				typedef2_tail();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainheadContext extends ParserRuleContext {
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public MainheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMainhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMainhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMainhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainheadContext mainhead() throws RecognitionException {
		MainheadContext _localctx = new MainheadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			tvoid();
			setState(189);
			match(T__13);
			setState(190);
			match(T__10);
			setState(191);
			typedef1();
			setState(192);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_code);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				sent();
				setState(196);
				code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sent);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				asig();
				setState(201);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				funccall();
				setState(204);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				vardef();
				setState(207);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				while_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				dowhile();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(T__4);
			setState(217);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			factor();
			setState(220);
			exp1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp1Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp1);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				op();
				setState(223);
				factor();
				setState(224);
				exp1();
				}
				break;
			case T__0:
			case T__3:
			case T__11:
			case T__12:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				simpvalue();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__10);
				setState(233);
				exp();
				setState(234);
				match(T__11);
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				funccall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funccall);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(IDENTIFIER);
				setState(240);
				subpparamlist();
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(CONST_DEF_IDENTIFIER);
				setState(242);
				subpparamlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subpparamlist);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__10);
				setState(246);
				explist();
				setState(247);
				match(T__11);
				}
				break;
			case T__0:
			case T__3:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist1Context explist1() {
			return getRuleContext(Explist1Context.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			exp();
			setState(253);
			explist1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Explist1Context extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExplist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExplist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExplist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explist1Context explist1() throws RecognitionException {
		Explist1Context _localctx = new Explist1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist1);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__12);
				setState(256);
				explist();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__19);
			setState(261);
			expcond();
			setState(262);
			match(T__0);
			setState(263);
			code();
			setState(264);
			match(T__1);
			setState(265);
			else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public Else1Context else1() {
			return getRuleContext(Else1Context.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_else);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__20);
				setState(268);
				else1();
				}
				break;
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else1Context extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public Else1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterElse1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitElse1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitElse1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else1Context else1() throws RecognitionException {
		Else1Context _localctx = new Else1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_else1);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__0);
				setState(273);
				code();
				setState(274);
				match(T__1);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__19);
				setState(277);
				expcond();
				setState(278);
				match(T__0);
				setState(279);
				code();
				setState(280);
				match(T__1);
				setState(281);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__21);
			setState(286);
			match(T__10);
			setState(287);
			expcond();
			setState(288);
			match(T__11);
			setState(289);
			match(T__0);
			setState(290);
			code();
			setState(291);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DowhileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__22);
			setState(294);
			match(T__0);
			setState(295);
			code();
			setState(296);
			match(T__1);
			setState(297);
			match(T__21);
			setState(298);
			match(T__10);
			setState(299);
			expcond();
			setState(300);
			match(T__11);
			setState(301);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public For1Context for1() {
			return getRuleContext(For1Context.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__23);
			setState(304);
			match(T__10);
			setState(305);
			for1();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For1Context extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public For1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For1Context for1() throws RecognitionException {
		For1Context _localctx = new For1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_for1);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				vardef();
				setState(308);
				match(T__3);
				setState(309);
				expcond();
				setState(310);
				match(T__3);
				setState(311);
				asig();
				setState(312);
				match(T__11);
				setState(313);
				match(T__0);
				setState(314);
				code();
				setState(315);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				asig();
				setState(318);
				match(T__3);
				setState(319);
				expcond();
				setState(320);
				match(T__3);
				setState(321);
				asig();
				setState(322);
				match(T__11);
				setState(323);
				match(T__0);
				setState(324);
				code();
				setState(325);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_tailContext expcond_tail() {
			return getRuleContext(Expcond_tailContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			factorcond();
			setState(330);
			expcond_tail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expcond_tailContext extends ParserRuleContext {
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_tailContext expcond_tail() {
			return getRuleContext(Expcond_tailContext.class,0);
		}
		public Expcond_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExpcond_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExpcond_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitExpcond_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond_tailContext expcond_tail() throws RecognitionException {
		Expcond_tailContext _localctx = new Expcond_tailContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expcond_tail);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				oplog();
				setState(333);
				factorcond();
				setState(334);
				expcond_tail();
				}
				break;
			case T__0:
			case T__3:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factorcond);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				exp();
				setState(342);
				opcomp();
				setState(343);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__10);
				setState(346);
				expcond();
				setState(347);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(T__26);
				setState(350);
				factorcond();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0) ) {
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
		"\u0004\u0001/\u0164\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"_\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0088\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0099\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00af\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bb\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c7\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00d6\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e4\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00ee\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u00f4\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u00fb\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0103\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u010f\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u011c"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u0148\b%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0152\b\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0160"+
		"\b)\u0001*\u0001*\u0001*\u0000\u0000+\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRT\u0000\u0004\u0002\u0000#$))\u0001\u0000\u000f\u0013\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\u001c \u0157\u0000V\u0001\u0000\u0000\u0000\u0002"+
		"^\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006f\u0001"+
		"\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000"+
		"\fz\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010~\u0001"+
		"\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u0091\u0001"+
		"\u0000\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u009a\u0001"+
		"\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00a1\u0001"+
		"\u0000\u0000\u0000\u001e\u00a6\u0001\u0000\u0000\u0000 \u00ae\u0001\u0000"+
		"\u0000\u0000\"\u00b0\u0001\u0000\u0000\u0000$\u00ba\u0001\u0000\u0000"+
		"\u0000&\u00bc\u0001\u0000\u0000\u0000(\u00c6\u0001\u0000\u0000\u0000*"+
		"\u00d5\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000.\u00db\u0001"+
		"\u0000\u0000\u00000\u00e3\u0001\u0000\u0000\u00002\u00e5\u0001\u0000\u0000"+
		"\u00004\u00ed\u0001\u0000\u0000\u00006\u00f3\u0001\u0000\u0000\u00008"+
		"\u00fa\u0001\u0000\u0000\u0000:\u00fc\u0001\u0000\u0000\u0000<\u0102\u0001"+
		"\u0000\u0000\u0000>\u0104\u0001\u0000\u0000\u0000@\u010e\u0001\u0000\u0000"+
		"\u0000B\u011b\u0001\u0000\u0000\u0000D\u011d\u0001\u0000\u0000\u0000F"+
		"\u0125\u0001\u0000\u0000\u0000H\u012f\u0001\u0000\u0000\u0000J\u0147\u0001"+
		"\u0000\u0000\u0000L\u0149\u0001\u0000\u0000\u0000N\u0151\u0001\u0000\u0000"+
		"\u0000P\u0153\u0001\u0000\u0000\u0000R\u015f\u0001\u0000\u0000\u0000T"+
		"\u0161\u0001\u0000\u0000\u0000VW\u0003\u0002\u0001\u0000WX\u0003\u0004"+
		"\u0002\u0000XY\u0003\u0006\u0003\u0000Y\u0001\u0001\u0000\u0000\u0000"+
		"Z_\u0001\u0000\u0000\u0000[\\\u0003\b\u0004\u0000\\]\u0003\u0002\u0001"+
		"\u0000]_\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`e\u0001\u0000\u0000\u0000"+
		"ab\u0003\u001c\u000e\u0000bc\u0003\u0004\u0002\u0000ce\u0001\u0000\u0000"+
		"\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000e\u0005\u0001"+
		"\u0000\u0000\u0000fg\u0003&\u0013\u0000gh\u0005\u0001\u0000\u0000hi\u0003"+
		"(\u0014\u0000ij\u0005\u0002\u0000\u0000j\u0007\u0001\u0000\u0000\u0000"+
		"kn\u0003\n\u0005\u0000ln\u0003\u0010\b\u0000mk\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000n\t\u0001\u0000\u0000\u0000op\u0005\u0003\u0000"+
		"\u0000pq\u0005!\u0000\u0000qr\u0003\u000e\u0007\u0000rs\u0003\f\u0006"+
		"\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0005"+
		"!\u0000\u0000vw\u0003\u000e\u0007\u0000wx\u0003\f\u0006\u0000x{\u0001"+
		"\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\r\u0001\u0000\u0000\u0000|}\u0007\u0000\u0000"+
		"\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f"+
		"\u0080\u0005\u0004\u0000\u0000\u0080\u0081\u0003\u0012\t\u0000\u0081\u0011"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005"+
		"\u0004\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0013\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a\u008b\u0005\"\u0000"+
		"\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0016\u000b"+
		"\u0000\u008d\u008e\u0005\"\u0000\u0000\u008e\u008f\u0005\u0005\u0000\u0000"+
		"\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000"+
		"\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0099\u0005\u0006\u0000\u0000"+
		"\u0094\u0099\u0005\u0007\u0000\u0000\u0095\u0099\u0005\b\u0000\u0000\u0096"+
		"\u0099\u0003\u0018\f\u0000\u0097\u0099\u0003\u001a\r\u0000\u0098\u0093"+
		"\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\t\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\n\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003\u0010"+
		"\b\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u001b\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005\u0001\u0000"+
		"\u0000\u00a3\u00a4\u0003(\u0014\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000"+
		"\u00a5\u001d\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000"+
		"\u00a7\u00a8\u0005\"\u0000\u0000\u00a8\u00a9\u0005\u000b\u0000\u0000\u00a9"+
		"\u00aa\u0003 \u0010\u0000\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u001f"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0003\"\u0011\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af!\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0016"+
		"\u000b\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2\u00b3\u0003$\u0012"+
		"\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\r\u0000\u0000"+
		"\u00b5\u00b6\u0003\u0016\u000b\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7"+
		"\u00b8\u0003$\u0012\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb%\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003"+
		"\u0018\f\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be\u00bf\u0005\u000b"+
		"\u0000\u0000\u00bf\u00c0\u0003 \u0010\u0000\u00c0\u00c1\u0005\f\u0000"+
		"\u0000\u00c1\'\u0001\u0000\u0000\u0000\u00c2\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003*\u0015\u0000\u00c4\u00c5\u0003(\u0014\u0000\u00c5\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c7)\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003"+
		",\u0016\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca\u00d6\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u00036\u001b\u0000\u00cc\u00cd\u0005\u0004\u0000"+
		"\u0000\u00cd\u00d6\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000"+
		"\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d6\u0003>\u001f\u0000\u00d2\u00d6\u0003D\"\u0000\u00d3\u00d6"+
		"\u0003H$\u0000\u00d4\u00d6\u0003F#\u0000\u00d5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\"\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0005\u0000\u0000\u00d9\u00da\u0003.\u0017\u0000\u00da"+
		"-\u0001\u0000\u0000\u0000\u00db\u00dc\u00034\u001a\u0000\u00dc\u00dd\u0003"+
		"0\u0018\u0000\u00dd/\u0001\u0000\u0000\u0000\u00de\u00df\u00032\u0019"+
		"\u0000\u00df\u00e0\u00034\u001a\u0000\u00e0\u00e1\u00030\u0018\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3"+
		"\u00de\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"1\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e63\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ee\u0003\u000e\u0007\u0000\u00e8\u00e9\u0005"+
		"\u000b\u0000\u0000\u00e9\u00ea\u0003.\u0017\u0000\u00ea\u00eb\u0005\f"+
		"\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ee\u00036\u001b"+
		"\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee5\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u00f4\u00038\u001c\u0000\u00f1"+
		"\u00f2\u0005!\u0000\u0000\u00f2\u00f4\u00038\u001c\u0000\u00f3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f47\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6\u00f7\u0003:\u001d"+
		"\u0000\u00f7\u00f8\u0005\f\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003.\u0017\u0000\u00fd\u00fe\u0003<\u001e\u0000\u00fe;\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\r\u0000\u0000\u0100\u0103\u0003:"+
		"\u001d\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103=\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\u0014\u0000\u0000\u0105\u0106\u0003L&\u0000\u0106"+
		"\u0107\u0005\u0001\u0000\u0000\u0107\u0108\u0003(\u0014\u0000\u0108\u0109"+
		"\u0005\u0002\u0000\u0000\u0109\u010a\u0003@ \u0000\u010a?\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005\u0015\u0000\u0000\u010c\u010f\u0003B!\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010fA\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u0001\u0000\u0000\u0111\u0112\u0003(\u0014\u0000\u0112\u0113"+
		"\u0005\u0002\u0000\u0000\u0113\u011c\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\u0014\u0000\u0000\u0115\u0116\u0003L&\u0000\u0116\u0117\u0005\u0001"+
		"\u0000\u0000\u0117\u0118\u0003(\u0014\u0000\u0118\u0119\u0005\u0002\u0000"+
		"\u0000\u0119\u011a\u0003@ \u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b"+
		"\u0110\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000\u011c"+
		"C\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0016\u0000\u0000\u011e\u011f"+
		"\u0005\u000b\u0000\u0000\u011f\u0120\u0003L&\u0000\u0120\u0121\u0005\f"+
		"\u0000\u0000\u0121\u0122\u0005\u0001\u0000\u0000\u0122\u0123\u0003(\u0014"+
		"\u0000\u0123\u0124\u0005\u0002\u0000\u0000\u0124E\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u0017\u0000\u0000\u0126\u0127\u0005\u0001\u0000\u0000"+
		"\u0127\u0128\u0003(\u0014\u0000\u0128\u0129\u0005\u0002\u0000\u0000\u0129"+
		"\u012a\u0005\u0016\u0000\u0000\u012a\u012b\u0005\u000b\u0000\u0000\u012b"+
		"\u012c\u0003L&\u0000\u012c\u012d\u0005\f\u0000\u0000\u012d\u012e\u0005"+
		"\u0004\u0000\u0000\u012eG\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0018"+
		"\u0000\u0000\u0130\u0131\u0005\u000b\u0000\u0000\u0131\u0132\u0003J%\u0000"+
		"\u0132I\u0001\u0000\u0000\u0000\u0133\u0134\u0003\u0014\n\u0000\u0134"+
		"\u0135\u0005\u0004\u0000\u0000\u0135\u0136\u0003L&\u0000\u0136\u0137\u0005"+
		"\u0004\u0000\u0000\u0137\u0138\u0003,\u0016\u0000\u0138\u0139\u0005\f"+
		"\u0000\u0000\u0139\u013a\u0005\u0001\u0000\u0000\u013a\u013b\u0003(\u0014"+
		"\u0000\u013b\u013c\u0005\u0002\u0000\u0000\u013c\u0148\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0003,\u0016\u0000\u013e\u013f\u0005\u0004\u0000\u0000"+
		"\u013f\u0140\u0003L&\u0000\u0140\u0141\u0005\u0004\u0000\u0000\u0141\u0142"+
		"\u0003,\u0016\u0000\u0142\u0143\u0005\f\u0000\u0000\u0143\u0144\u0005"+
		"\u0001\u0000\u0000\u0144\u0145\u0003(\u0014\u0000\u0145\u0146\u0005\u0002"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0133\u0001\u0000"+
		"\u0000\u0000\u0147\u013d\u0001\u0000\u0000\u0000\u0148K\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0003R)\u0000\u014a\u014b\u0003N\'\u0000\u014bM\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0003P(\u0000\u014d\u014e\u0003R)\u0000"+
		"\u014e\u014f\u0003N\'\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u0152\u0001\u0000\u0000\u0000\u0151\u014c\u0001\u0000\u0000\u0000\u0151"+
		"\u0150\u0001\u0000\u0000\u0000\u0152O\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0007\u0002\u0000\u0000\u0154Q\u0001\u0000\u0000\u0000\u0155\u0156\u0003"+
		".\u0017\u0000\u0156\u0157\u0003T*\u0000\u0157\u0158\u0003.\u0017\u0000"+
		"\u0158\u0160\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u000b\u0000\u0000"+
		"\u015a\u015b\u0003L&\u0000\u015b\u015c\u0005\f\u0000\u0000\u015c\u0160"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u001b\u0000\u0000\u015e\u0160"+
		"\u0003R)\u0000\u015f\u0155\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160S\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0007\u0003\u0000\u0000\u0162U\u0001\u0000\u0000\u0000"+
		"\u0015^dmz\u0087\u0091\u0098\u00ae\u00ba\u00c6\u00d5\u00e3\u00ed\u00f3"+
		"\u00fa\u0102\u010e\u011b\u0147\u0151\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}