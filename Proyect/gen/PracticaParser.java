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
		LBRACE=1, RBRACE=2, DEFINE=3, SEMICOLON=4, INTEGER=5, FLOAT=6, STRING=7, 
		VOID=8, STRUCT=9, COMMA=10, MAIN=11, LPARENTHESIS=12, RPARENTHESIS=13, 
		IF=14, ELSE=15, WHILE=16, DO=17, FOR=18, AND=19, OR=20, NOT=21, SMORE=22, 
		SLESS=23, SMOREE=24, SLESSE=25, SEQUAL=26, SASIGN=27, PLUS=28, LESS=29, 
		TIMES=30, DIV=31, MOD=32, CONST_DEF_IDENTIFIER=33, IDENTIFIER=34, NUMERIC_INTEGER_CONST=35, 
		NUMERIC_REAL_CONST=36, MIXED_REAL=37, FIXED_POINT=38, INITIAL_POINT=39, 
		EXPONENTIAL=40, STRING_CONST=41, DOUBLE=42, SIMPLE=43, COMMENT=44, ONE_LINE=45, 
		IGNORE=46, MULTIPLE_LINE=47;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_funlist = 2, RULE_sentlist = 3, 
		RULE_dcl = 4, RULE_ctelist = 5, RULE_simpvalue = 6, RULE_varlist = 7, 
		RULE_vardef = 8, RULE_vardef2 = 9, RULE_tbas = 10, RULE_tvoid = 11, RULE_struct = 12, 
		RULE_varlist2 = 13, RULE_funcdef = 14, RULE_funchead = 15, RULE_typedef1 = 16, 
		RULE_typedef2_tail = 17, RULE_mainhead = 18, RULE_code = 19, RULE_sent = 20, 
		RULE_asig = 21, RULE_exp = 22, RULE_exp1 = 23, RULE_op = 24, RULE_factor = 25, 
		RULE_funccall = 26, RULE_subpparamlist = 27, RULE_explist = 28, RULE_explist1 = 29, 
		RULE_miif = 30, RULE_mielse = 31, RULE_else1 = 32, RULE_miwhile = 33, 
		RULE_midowhile = 34, RULE_mifor = 35, RULE_for1 = 36, RULE_expcond = 37, 
		RULE_expcond_tail = 38, RULE_oplog = 39, RULE_factorcond = 40, RULE_opcomp = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "funlist", "sentlist", "dcl", "ctelist", "simpvalue", 
			"varlist", "vardef", "vardef2", "tbas", "tvoid", "struct", "varlist2", 
			"funcdef", "funchead", "typedef1", "typedef2_tail", "mainhead", "code", 
			"sent", "asig", "exp", "exp1", "op", "factor", "funccall", "subpparamlist", 
			"explist", "explist1", "miif", "mielse", "else1", "miwhile", "midowhile", 
			"mifor", "for1", "expcond", "expcond_tail", "oplog", "factorcond", "opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'#define'", "';'", "'integer'", "'float'", "'string'", 
			"'void'", "'struct'", "','", "'Main'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'do'", "'for'", "'&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "DEFINE", "SEMICOLON", "INTEGER", "FLOAT", 
			"STRING", "VOID", "STRUCT", "COMMA", "MAIN", "LPARENTHESIS", "RPARENTHESIS", 
			"IF", "ELSE", "WHILE", "DO", "FOR", "AND", "OR", "NOT", "SMORE", "SLESS", 
			"SMOREE", "SLESSE", "SEQUAL", "SASIGN", "PLUS", "LESS", "TIMES", "DIV", 
			"MOD", "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "MIXED_REAL", "FIXED_POINT", "INITIAL_POINT", "EXPONENTIAL", 
			"STRING_CONST", "DOUBLE", "SIMPLE", "COMMENT", "ONE_LINE", "IGNORE", 
			"MULTIPLE_LINE"
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
		public DcllistContext dcllist;
		public FunlistContext funlist;
		public SentlistContext sentlist;
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
			setState(84);
			((ProgramContext)_localctx).dcllist = dcllist();
			setState(85);
			((ProgramContext)_localctx).funlist = funlist();
			setState(86);
			((ProgramContext)_localctx).sentlist = sentlist();
			System.out.println("<UL>\n<LI><A HREF=\"#Main\">Programa Principal</A></LI>\n"+((ProgramContext)_localctx).funlist.headers + "</UL>\n</body>\n<hr/>\n" + ((ProgramContext)_localctx).funlist.bodys);
					                                    System.out.println("<H2>Programa Principal</H2>\n\n<code>\n" + ((ProgramContext)_localctx).dcllist.text + "</code>\n<br/>\n");
					                                    System.out.println(((ProgramContext)_localctx).sentlist.text);
					
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
		public String text;
		public DclContext dcl;
		public DcllistContext dcllist;
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
				((DcllistContext)_localctx).text = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((DcllistContext)_localctx).dcl = dcl();
				setState(91);
				((DcllistContext)_localctx).dcllist = dcllist();
				((DcllistContext)_localctx).text =  "<DIV>" + ((DcllistContext)_localctx).dcl.text  + "</DIV>\n" + ((DcllistContext)_localctx).dcllist.text;
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
		public String headers;
		public String bodys;
		public FuncdefContext funcdef;
		public FunlistContext funlist;
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((FunlistContext)_localctx).headers = ""; ((FunlistContext)_localctx).bodys = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((FunlistContext)_localctx).funcdef = funcdef();
				setState(98);
				((FunlistContext)_localctx).funlist = funlist();
				((FunlistContext)_localctx).headers = ((FunlistContext)_localctx).funcdef.header + ((FunlistContext)_localctx).funlist.headers; ((FunlistContext)_localctx).bodys = ((FunlistContext)_localctx).funcdef.body + ((FunlistContext)_localctx).funlist.bodys;
						
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
		public String text;
		public MainheadContext mainhead;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public MainheadContext mainhead() {
			return getRuleContext(MainheadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
			setState(103);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(104);
			((SentlistContext)_localctx).LBRACE = match(LBRACE);
			setState(105);
			((SentlistContext)_localctx).code = code();
			setState(106);
			((SentlistContext)_localctx).RBRACE = match(RBRACE);
			((SentlistContext)_localctx).text = "<A NAME=\"Main\"></A>\n<code>\n"+((SentlistContext)_localctx).mainhead.text+"\n"+ "<SPAN CLASS=\"palres\">" + (((SentlistContext)_localctx).LBRACE!=null?((SentlistContext)_localctx).LBRACE.getText():null) + "</SPAN>" +"\n"+ ((SentlistContext)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((SentlistContext)_localctx).RBRACE!=null?((SentlistContext)_localctx).RBRACE.getText():null) + "</SPAN>" +"\n\n<br/>\n</code>\n"+
			"<A HREF=\"#Main\">Inicio del programa principal</A>\n<A HREF=\"#inicio\">Inicio del programa</A>";
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
		public String text;
		public CtelistContext ctelist;
		public VarlistContext varlist;
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((DclContext)_localctx).ctelist = ctelist();
				((DclContext)_localctx).text = ((DclContext)_localctx).ctelist.text;
				}
				break;
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((DclContext)_localctx).varlist = varlist();
				((DclContext)_localctx).text = ((DclContext)_localctx).varlist.text;
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
		public String text;
		public Token DEFINE;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TerminalNode DEFINE() { return getToken(PracticaParser.DEFINE, 0); }
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
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
			setState(117);
			((CtelistContext)_localctx).DEFINE = match(DEFINE);
			setState(118);
			((CtelistContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
			setState(119);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			((CtelistContext)_localctx).text =  "<SPAN CLASS=\"palres\">" +  (((CtelistContext)_localctx).DEFINE!=null?((CtelistContext)_localctx).DEFINE.getText():null) + "</SPAN> " + "<A NAME=\""+ (((CtelistContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtelistContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\">" + "<SPAN CLASS=\"ident\"/>" + (((CtelistContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtelistContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</SPAN></A> " + ((CtelistContext)_localctx).simpvalue.text;
					
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
		public String text;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
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
		enterRule(_localctx, 12, RULE_simpvalue);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).text =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) + "</SPAN>";
						
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).text =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).text =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) + "</SPAN>";
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
	public static class VarlistContext extends ParserRuleContext {
		public String text;
		public VardefContext vardef;
		public Token SEMICOLON;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 14, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((VarlistContext)_localctx).vardef = vardef();
			setState(131);
			((VarlistContext)_localctx).SEMICOLON = match(SEMICOLON);
			((VarlistContext)_localctx).text =  ((VarlistContext)_localctx).vardef.text + "<SPAN CLASS=\"palres\">" + (((VarlistContext)_localctx).SEMICOLON!=null?((VarlistContext)_localctx).SEMICOLON.getText():null) + "</SPAN>";
					
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
		public String text;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Vardef2Context vardef2;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public Vardef2Context vardef2() {
			return getRuleContext(Vardef2Context.class,0);
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
		enterRule(_localctx, 16, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((VardefContext)_localctx).tbas = tbas();
			setState(135);
			((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(136);
			((VardefContext)_localctx).vardef2 = vardef2();
			((VardefContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((VardefContext)_localctx).tbas.type + "</SPAN> " + "<A NAME=\""+ (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "\">" + "<SPAN CLASS=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</SPAN></A>" +  ((VardefContext)_localctx).vardef2.text;
					
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
	public static class Vardef2Context extends ParserRuleContext {
		public String text;
		public Token SASIGN;
		public SimpvalueContext simpvalue;
		public TerminalNode SASIGN() { return getToken(PracticaParser.SASIGN, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Vardef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterVardef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitVardef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitVardef2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vardef2Context vardef2() throws RecognitionException {
		Vardef2Context _localctx = new Vardef2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardef2);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SASIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((Vardef2Context)_localctx).SASIGN = match(SASIGN);
				setState(140);
				((Vardef2Context)_localctx).simpvalue = simpvalue();
				((Vardef2Context)_localctx).text =  "<SPAN CLASS=\"palres\"> " + (((Vardef2Context)_localctx).SASIGN!=null?((Vardef2Context)_localctx).SASIGN.getText():null)  + "</SPAN> " + ((Vardef2Context)_localctx).simpvalue.text;
						
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				((Vardef2Context)_localctx).text = "";
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
	public static class TbasContext extends ParserRuleContext {
		public String type;
		public TvoidContext tvoid;
		public StructContext struct;
		public TerminalNode INTEGER() { return getToken(PracticaParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(PracticaParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PracticaParser.STRING, 0); }
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
		enterRule(_localctx, 20, RULE_tbas);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(INTEGER);
				((TbasContext)_localctx).type = "integer";
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(FLOAT);
				((TbasContext)_localctx).type = "float";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(STRING);
				((TbasContext)_localctx).type = "string";
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				((TbasContext)_localctx).tvoid = tvoid();
				((TbasContext)_localctx).type = ((TbasContext)_localctx).tvoid.type;
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((TbasContext)_localctx).struct = struct();
				((TbasContext)_localctx).type = ((TbasContext)_localctx).struct.text;
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
		public String type;
		public TerminalNode VOID() { return getToken(PracticaParser.VOID, 0); }
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
		enterRule(_localctx, 22, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(VOID);
			((TvoidContext)_localctx).type = "void";
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
		public String text;
		public Token STRUCT;
		public Token LBRACE;
		public VarlistContext varlist;
		public Varlist2Context varlist2;
		public Token RBRACE;
		public TerminalNode STRUCT() { return getToken(PracticaParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
		enterRule(_localctx, 24, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((StructContext)_localctx).STRUCT = match(STRUCT);
			setState(164);
			((StructContext)_localctx).LBRACE = match(LBRACE);
			setState(165);
			((StructContext)_localctx).varlist = varlist();
			setState(166);
			((StructContext)_localctx).varlist2 = varlist2();
			setState(167);
			((StructContext)_localctx).RBRACE = match(RBRACE);
			((StructContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((StructContext)_localctx).STRUCT!=null?((StructContext)_localctx).STRUCT.getText():null) + "</SPAN> " + "<SPAN CLASS=\"palres\">" + (((StructContext)_localctx).LBRACE!=null?((StructContext)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n<DIV style=\"padding-left: 0.5cm\">" + ((StructContext)_localctx).varlist.text + "</DIV>\n" + ((StructContext)_localctx).varlist2.text + "<SPAN CLASS=\"palres\">" + (((StructContext)_localctx).RBRACE!=null?((StructContext)_localctx).RBRACE.getText():null) + "</SPAN>";
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
	public static class Varlist2Context extends ParserRuleContext {
		public String text;
		public VarlistContext varlist;
		public Varlist2Context varlist2;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public Varlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterVarlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitVarlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitVarlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist2Context varlist2() throws RecognitionException {
		Varlist2Context _localctx = new Varlist2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_varlist2);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((Varlist2Context)_localctx).varlist = varlist();
				setState(171);
				((Varlist2Context)_localctx).varlist2 = varlist2();
				((Varlist2Context)_localctx).text =  "\n<DIV style=\"padding-left: 0.5cm\">" + ((Varlist2Context)_localctx).varlist.text + "</DIV>\n" + ((Varlist2Context)_localctx).varlist2.text;
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
				((Varlist2Context)_localctx).text =  "";
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
	public static class FuncdefContext extends ParserRuleContext {
		public String body;
		public String header;
		public FuncheadContext funchead;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
			setState(177);
			((FuncdefContext)_localctx).funchead = funchead();
			setState(178);
			((FuncdefContext)_localctx).LBRACE = match(LBRACE);
			setState(179);
			((FuncdefContext)_localctx).code = code();
			setState(180);
			((FuncdefContext)_localctx).RBRACE = match(RBRACE);
			((FuncdefContext)_localctx).body =  "<A NAME=\""+ ((FuncdefContext)_localctx).funchead.name + "\"></A>\n"
					+ "<code>\n" + ((FuncdefContext)_localctx).funchead.text + "\n" + "<SPAN CLASS=\"palres\">" + (((FuncdefContext)_localctx).LBRACE!=null?((FuncdefContext)_localctx).LBRACE.getText():null) + "</SPAN>" + "\n" + ((FuncdefContext)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((FuncdefContext)_localctx).RBRACE!=null?((FuncdefContext)_localctx).RBRACE.getText():null) + "</SPAN>" + "\n" + "<br/>\n</code>\n"
					+ "<A HREF=\"#" + ((FuncdefContext)_localctx).funchead.name + "\">Inicio de la función</A>\n"
					+ "<A HREF=\"#inicio\">Inicio del programa</A>\n"+
					"<hr/>\n\n";
					((FuncdefContext)_localctx).header =  "<LI><A HREF=\"#" + ((FuncdefContext)_localctx).funchead.name + "\">"+ ((FuncdefContext)_localctx).funchead.header+"</A></LI>\n";
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
		public String name;
		public String text;
		public String header;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Token LPARENTHESIS;
		public Typedef1Context typedef1;
		public Token RPARENTHESIS;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
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
			setState(183);
			((FuncheadContext)_localctx).tbas = tbas();
			setState(184);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(185);
			((FuncheadContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(186);
			((FuncheadContext)_localctx).typedef1 = typedef1();
			setState(187);
			((FuncheadContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
			((FuncheadContext)_localctx).name =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null); ((FuncheadContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((FuncheadContext)_localctx).tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" +  "<SPAN CLASS=\"palres\">" + (((FuncheadContext)_localctx).LPARENTHESIS!=null?((FuncheadContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((FuncheadContext)_localctx).typedef1.text + "<SPAN CLASS=\"palres\">" + (((FuncheadContext)_localctx).RPARENTHESIS!=null?((FuncheadContext)_localctx).RPARENTHESIS.getText():null) + "</SPAN>";
					((FuncheadContext)_localctx).header =  ((FuncheadContext)_localctx).tbas.type + " " + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +  (((FuncheadContext)_localctx).LPARENTHESIS!=null?((FuncheadContext)_localctx).LPARENTHESIS.getText():null) + ((FuncheadContext)_localctx).typedef1.header +  (((FuncheadContext)_localctx).RPARENTHESIS!=null?((FuncheadContext)_localctx).RPARENTHESIS.getText():null) ;
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
		public String text;
		public String header;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef2_tailContext typedef2_tail;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public Typedef2_tailContext typedef2_tail() {
			return getRuleContext(Typedef2_tailContext.class,0);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				((Typedef1Context)_localctx).text = "";
						((Typedef1Context)_localctx).header = "";
				}
				break;
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((Typedef1Context)_localctx).tbas = tbas();
				setState(192);
				((Typedef1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(193);
				((Typedef1Context)_localctx).typedef2_tail = typedef2_tail();
				((Typedef1Context)_localctx).text = "<SPAN CLASS=\"palres\">" + ((Typedef1Context)_localctx).tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((Typedef1Context)_localctx).IDENTIFIER!=null?((Typedef1Context)_localctx).IDENTIFIER.getText():null) + "</SPAN>" + ((Typedef1Context)_localctx).typedef2_tail.text;
						((Typedef1Context)_localctx).header =  ((Typedef1Context)_localctx).tbas.type + " " + (((Typedef1Context)_localctx).IDENTIFIER!=null?((Typedef1Context)_localctx).IDENTIFIER.getText():null)  + ((Typedef1Context)_localctx).typedef2_tail.header;
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
	public static class Typedef2_tailContext extends ParserRuleContext {
		public String text;
		public String header;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef2_tailContext typedef2_tail;
		public TerminalNode COMMA() { return getToken(PracticaParser.COMMA, 0); }
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
		enterRule(_localctx, 34, RULE_typedef2_tail);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(COMMA);
				setState(199);
				((Typedef2_tailContext)_localctx).tbas = tbas();
				setState(200);
				((Typedef2_tailContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(201);
				((Typedef2_tailContext)_localctx).typedef2_tail = typedef2_tail();
				((Typedef2_tailContext)_localctx).text = ", " + "<SPAN CLASS=\"palres\">" + ((Typedef2_tailContext)_localctx).tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((Typedef2_tailContext)_localctx).IDENTIFIER!=null?((Typedef2_tailContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" + ((Typedef2_tailContext)_localctx).typedef2_tail.text;
						((Typedef2_tailContext)_localctx).header = ", " + ((Typedef2_tailContext)_localctx).tbas.type + " " + (((Typedef2_tailContext)_localctx).IDENTIFIER!=null?((Typedef2_tailContext)_localctx).IDENTIFIER.getText():null) + ((Typedef2_tailContext)_localctx).typedef2_tail.header;
				}
				break;
			case RPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				((Typedef2_tailContext)_localctx).text = "";
				      ((Typedef2_tailContext)_localctx).header = "";
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
		public String text;
		public TvoidContext tvoid;
		public Token MAIN;
		public Token LPARENTHESIS;
		public Typedef1Context typedef1;
		public Token RPARENTHESIS;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(PracticaParser.MAIN, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
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
		enterRule(_localctx, 36, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(208);
			((MainheadContext)_localctx).MAIN = match(MAIN);
			setState(209);
			((MainheadContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(210);
			((MainheadContext)_localctx).typedef1 = typedef1();
			setState(211);
			((MainheadContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
			((MainheadContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((MainheadContext)_localctx).tvoid.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((MainheadContext)_localctx).MAIN!=null?((MainheadContext)_localctx).MAIN.getText():null) + "</SPAN>" +  "<SPAN CLASS=\"palres\">" + (((MainheadContext)_localctx).LPARENTHESIS!=null?((MainheadContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((MainheadContext)_localctx).typedef1.text + "<SPAN CLASS=\"palres\">" + (((MainheadContext)_localctx).RPARENTHESIS!=null?((MainheadContext)_localctx).RPARENTHESIS.getText():null) + "</SPAN>";
			                                                                                                                                      		
					
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
		public String text;
		public SentContext sent;
		public CodeContext code;
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
		enterRule(_localctx, 38, RULE_code);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				((CodeContext)_localctx).text = "";
				}
				break;
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((CodeContext)_localctx).sent = sent();
				setState(216);
				((CodeContext)_localctx).code = code();
				((CodeContext)_localctx).text =  "<DIV style=\"padding-left: .5cm\">" + ((CodeContext)_localctx).sent.text + "</DIV>\n" + ((CodeContext)_localctx).code.text;
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
		public String text;
		public AsigContext asig;
		public Token SEMICOLON;
		public FunccallContext funccall;
		public VardefContext vardef;
		public MiifContext miif;
		public MiwhileContext miwhile;
		public MiforContext mifor;
		public MidowhileContext midowhile;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public MiifContext miif() {
			return getRuleContext(MiifContext.class,0);
		}
		public MiwhileContext miwhile() {
			return getRuleContext(MiwhileContext.class,0);
		}
		public MiforContext mifor() {
			return getRuleContext(MiforContext.class,0);
		}
		public MidowhileContext midowhile() {
			return getRuleContext(MidowhileContext.class,0);
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
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((SentContext)_localctx).asig = asig();
				setState(222);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  ((SentContext)_localctx).asig.text + "<SPAN CLASS=\"palres\">" + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null) + "</SPAN> ";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((SentContext)_localctx).funccall = funccall();
				setState(226);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  ((SentContext)_localctx).funccall.text + "<SPAN CLASS=\"palres\">" + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null) + "</SPAN> ";
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				((SentContext)_localctx).vardef = vardef();
				setState(230);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  ((SentContext)_localctx).vardef.text + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				((SentContext)_localctx).miif = miif();
				((SentContext)_localctx).text =  ((SentContext)_localctx).miif.text;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				((SentContext)_localctx).miwhile = miwhile();
				((SentContext)_localctx).text = ((SentContext)_localctx).miwhile.text;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				((SentContext)_localctx).mifor = mifor();
				((SentContext)_localctx).text = ((SentContext)_localctx).mifor.text;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				((SentContext)_localctx).midowhile = midowhile();
				((SentContext)_localctx).text = ((SentContext)_localctx).midowhile.text;
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
		public String text;
		public Token IDENTIFIER;
		public Token SASIGN;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public TerminalNode SASIGN() { return getToken(PracticaParser.SASIGN, 0); }
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
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(248);
			((AsigContext)_localctx).SASIGN = match(SASIGN);
			setState(249);
			((AsigContext)_localctx).exp = exp();
			((AsigContext)_localctx).text =  "<SPAN CLASS=\"ident\">" + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" + " <SPAN CLASS=\"palres\">" + (((AsigContext)_localctx).SASIGN!=null?((AsigContext)_localctx).SASIGN.getText():null) + "</SPAN> " + ((AsigContext)_localctx).exp.text;
					
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
		public String text;
		public FactorContext factor;
		public Exp1Context exp1;
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
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((ExpContext)_localctx).factor = factor();
			setState(253);
			((ExpContext)_localctx).exp1 = exp1();
			((ExpContext)_localctx).text =  ((ExpContext)_localctx).factor.text + ((ExpContext)_localctx).exp1.text;
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
		public String text;
		public OpContext op;
		public FactorContext factor;
		public Exp1Context exp1;
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
		enterRule(_localctx, 46, RULE_exp1);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case LESS:
			case TIMES:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((Exp1Context)_localctx).op = op();
				setState(257);
				((Exp1Context)_localctx).factor = factor();
				setState(258);
				((Exp1Context)_localctx).exp1 = exp1();
				((Exp1Context)_localctx).text = ((Exp1Context)_localctx).op.text + ((Exp1Context)_localctx).factor.text + ((Exp1Context)_localctx).exp1.text;
				}
				break;
			case LBRACE:
			case SEMICOLON:
			case COMMA:
			case RPARENTHESIS:
			case AND:
			case OR:
			case SMORE:
			case SLESS:
			case SMOREE:
			case SLESSE:
			case SEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				((Exp1Context)_localctx).text =  "";
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
		public String text;
		public Token PLUS;
		public Token LESS;
		public Token TIMES;
		public Token DIV;
		public Token MOD;
		public TerminalNode PLUS() { return getToken(PracticaParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(PracticaParser.LESS, 0); }
		public TerminalNode TIMES() { return getToken(PracticaParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(PracticaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PracticaParser.MOD, 0); }
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
		enterRule(_localctx, 48, RULE_op);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				((OpContext)_localctx).PLUS = match(PLUS);
				((OpContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpContext)_localctx).PLUS!=null?((OpContext)_localctx).PLUS.getText():null) + "</SPAN> ";
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				((OpContext)_localctx).LESS = match(LESS);
				((OpContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpContext)_localctx).LESS!=null?((OpContext)_localctx).LESS.getText():null) + "</SPAN> ";
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				((OpContext)_localctx).TIMES = match(TIMES);
				((OpContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpContext)_localctx).TIMES!=null?((OpContext)_localctx).TIMES.getText():null) + "</SPAN> ";
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				((OpContext)_localctx).DIV = match(DIV);
				((OpContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpContext)_localctx).DIV!=null?((OpContext)_localctx).DIV.getText():null) + "</SPAN> ";
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				((OpContext)_localctx).MOD = match(MOD);
				((OpContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpContext)_localctx).MOD!=null?((OpContext)_localctx).MOD.getText():null) + "</SPAN> ";
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
	public static class FactorContext extends ParserRuleContext {
		public String text;
		public SimpvalueContext simpvalue;
		public Token LPARENTHESIS;
		public ExpContext exp;
		public Token RPARENTHESIS;
		public FunccallContext funccall;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
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
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).text =  ((FactorContext)_localctx).simpvalue.text;
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				((FactorContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(280);
				((FactorContext)_localctx).exp = exp();
				setState(281);
				((FactorContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((FactorContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((FactorContext)_localctx).LPARENTHESIS!=null?((FactorContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((FactorContext)_localctx).exp.text + "<SPAN CLASS=\"palres\">" + (((FactorContext)_localctx).RPARENTHESIS!=null?((FactorContext)_localctx).RPARENTHESIS.getText():null) + "</SPAN>";
						
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((FactorContext)_localctx).funccall = funccall();
				((FactorContext)_localctx).text =  ((FactorContext)_localctx).funccall.text;
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
		public String text;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public Token CONST_DEF_IDENTIFIER;
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
		enterRule(_localctx, 52, RULE_funccall);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(290);
				((FunccallContext)_localctx).subpparamlist = subpparamlist();
				((FunccallContext)_localctx).text =  "<SPAN CLASS=\"ident\">" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" + ((FunccallContext)_localctx).subpparamlist.text;
						
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(294);
				((FunccallContext)_localctx).subpparamlist = subpparamlist();
				((FunccallContext)_localctx).text =  "<SPAN CLASS=\"ident\">" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</SPAN>" + ((FunccallContext)_localctx).subpparamlist.text;
						
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
		public String text;
		public Token LPARENTHESIS;
		public ExplistContext explist;
		public Token RPARENTHESIS;
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
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
		enterRule(_localctx, 54, RULE_subpparamlist);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((SubpparamlistContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(300);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(301);
				((SubpparamlistContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((SubpparamlistContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((SubpparamlistContext)_localctx).LPARENTHESIS!=null?((SubpparamlistContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((SubpparamlistContext)_localctx).explist.text + "<SPAN CLASS=\"palres\">" + (((SubpparamlistContext)_localctx).RPARENTHESIS!=null?((SubpparamlistContext)_localctx).RPARENTHESIS.getText():null) + "</SPAN>";
						
				}
				break;
			case LBRACE:
			case SEMICOLON:
			case COMMA:
			case RPARENTHESIS:
			case AND:
			case OR:
			case SMORE:
			case SLESS:
			case SMOREE:
			case SLESSE:
			case SEQUAL:
			case PLUS:
			case LESS:
			case TIMES:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).text = "";
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
		public String text;
		public ExpContext exp;
		public Explist1Context explist1;
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
		enterRule(_localctx, 56, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((ExplistContext)_localctx).exp = exp();
			setState(308);
			((ExplistContext)_localctx).explist1 = explist1();
			((ExplistContext)_localctx).text =  ((ExplistContext)_localctx).exp.text + ((ExplistContext)_localctx).explist1.text;
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
		public String text;
		public Token COMMA;
		public ExplistContext explist;
		public TerminalNode COMMA() { return getToken(PracticaParser.COMMA, 0); }
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
		enterRule(_localctx, 58, RULE_explist1);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				((Explist1Context)_localctx).COMMA = match(COMMA);
				setState(312);
				((Explist1Context)_localctx).explist = explist();
				((Explist1Context)_localctx).text =   "<SPAN CLASS=\"palres\">" + (((Explist1Context)_localctx).COMMA!=null?((Explist1Context)_localctx).COMMA.getText():null) + "</SPAN> " + ((Explist1Context)_localctx).explist.text;
				}
				break;
			case RPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				((Explist1Context)_localctx).text = "";
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
	public static class MiifContext extends ParserRuleContext {
		public String text;
		public Token IF;
		public ExpcondContext expcond;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public MielseContext mielse;
		public TerminalNode IF() { return getToken(PracticaParser.IF, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public MielseContext mielse() {
			return getRuleContext(MielseContext.class,0);
		}
		public MiifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMiif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMiif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMiif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiifContext miif() throws RecognitionException {
		MiifContext _localctx = new MiifContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_miif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((MiifContext)_localctx).IF = match(IF);
			setState(319);
			((MiifContext)_localctx).expcond = expcond();
			setState(320);
			((MiifContext)_localctx).LBRACE = match(LBRACE);
			setState(321);
			((MiifContext)_localctx).code = code();
			setState(322);
			((MiifContext)_localctx).RBRACE = match(RBRACE);
			setState(323);
			((MiifContext)_localctx).mielse = mielse();
			((MiifContext)_localctx).text = "<SPAN CLASS=\"palres\">" + (((MiifContext)_localctx).IF!=null?((MiifContext)_localctx).IF.getText():null) + "</SPAN> " + ((MiifContext)_localctx).expcond.text +
			"\n" + "<SPAN CLASS=\"palres\">" + (((MiifContext)_localctx).LBRACE!=null?((MiifContext)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n" + ((MiifContext)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((MiifContext)_localctx).RBRACE!=null?((MiifContext)_localctx).RBRACE.getText():null) + "</SPAN>" + "\n" + "<br/>\n"  + "\n" + ((MiifContext)_localctx).mielse.text;
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
	public static class MielseContext extends ParserRuleContext {
		public String text;
		public Token ELSE;
		public Else1Context else1;
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
		public Else1Context else1() {
			return getRuleContext(Else1Context.class,0);
		}
		public MielseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mielse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMielse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMielse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMielse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MielseContext mielse() throws RecognitionException {
		MielseContext _localctx = new MielseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mielse);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((MielseContext)_localctx).ELSE = match(ELSE);
				setState(327);
				((MielseContext)_localctx).else1 = else1();
				((MielseContext)_localctx).text =   "<SPAN CLASS=\"palres\">" + (((MielseContext)_localctx).ELSE!=null?((MielseContext)_localctx).ELSE.getText():null) + "</SPAN> " + ((MielseContext)_localctx).else1.text + "\n";
				}
				break;
			case RBRACE:
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				((MielseContext)_localctx).text =  "";
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
		public String text;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public MiifContext miif;
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public MiifContext miif() {
			return getRuleContext(MiifContext.class,0);
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
		enterRule(_localctx, 64, RULE_else1);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((Else1Context)_localctx).LBRACE = match(LBRACE);
				setState(334);
				((Else1Context)_localctx).code = code();
				setState(335);
				((Else1Context)_localctx).RBRACE = match(RBRACE);
				((Else1Context)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((Else1Context)_localctx).LBRACE!=null?((Else1Context)_localctx).LBRACE.getText():null) + "</SPAN>" + "\n<DIV style=\"padding-left: 0.5cm\">\n" + ((Else1Context)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((Else1Context)_localctx).RBRACE!=null?((Else1Context)_localctx).RBRACE.getText():null) + "</SPAN>" + "\n" + "<br/>\n"  + "</DIV>\n";
						
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				((Else1Context)_localctx).miif = miif();
				((Else1Context)_localctx).text =  ((Else1Context)_localctx).miif.text ;
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
	public static class MiwhileContext extends ParserRuleContext {
		public String text;
		public Token WHILE;
		public ExpcondContext expcond;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public TerminalNode WHILE() { return getToken(PracticaParser.WHILE, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public MiwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMiwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMiwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMiwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiwhileContext miwhile() throws RecognitionException {
		MiwhileContext _localctx = new MiwhileContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_miwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((MiwhileContext)_localctx).WHILE = match(WHILE);
			setState(344);
			((MiwhileContext)_localctx).expcond = expcond();
			setState(345);
			((MiwhileContext)_localctx).LBRACE = match(LBRACE);
			setState(346);
			((MiwhileContext)_localctx).code = code();
			setState(347);
			((MiwhileContext)_localctx).RBRACE = match(RBRACE);
			((MiwhileContext)_localctx).text = "<SPAN CLASS=\"palres\">" + (((MiwhileContext)_localctx).WHILE!=null?((MiwhileContext)_localctx).WHILE.getText():null) + "</SPAN> " + ((MiwhileContext)_localctx).expcond.text +
			                                     "\n" + "<SPAN CLASS=\"palres\">" + (((MiwhileContext)_localctx).LBRACE!=null?((MiwhileContext)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n" + ((MiwhileContext)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((MiwhileContext)_localctx).RBRACE!=null?((MiwhileContext)_localctx).RBRACE.getText():null) + "</SPAN>" + "\n" + "<br/>\n"  + "\n";
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
	public static class MidowhileContext extends ParserRuleContext {
		public String text;
		public Token DO;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public Token WHILE;
		public ExpcondContext expcond;
		public Token SEMICOLON;
		public TerminalNode DO() { return getToken(PracticaParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(PracticaParser.WHILE, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
		public MidowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMidowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMidowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMidowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidowhileContext midowhile() throws RecognitionException {
		MidowhileContext _localctx = new MidowhileContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_midowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((MidowhileContext)_localctx).DO = match(DO);
			setState(351);
			((MidowhileContext)_localctx).LBRACE = match(LBRACE);
			setState(352);
			((MidowhileContext)_localctx).code = code();
			setState(353);
			((MidowhileContext)_localctx).RBRACE = match(RBRACE);
			setState(354);
			((MidowhileContext)_localctx).WHILE = match(WHILE);
			setState(355);
			((MidowhileContext)_localctx).expcond = expcond();
			setState(356);
			((MidowhileContext)_localctx).SEMICOLON = match(SEMICOLON);
			((MidowhileContext)_localctx).text =  _localctx.text ="<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).DO!=null?((MidowhileContext)_localctx).DO.getText():null) + "</SPAN>" + "\n" + "<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).LBRACE!=null?((MidowhileContext)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n" + ((MidowhileContext)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).RBRACE!=null?((MidowhileContext)_localctx).RBRACE.getText():null) + "</SPAN>" + "\n" + "<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).WHILE!=null?((MidowhileContext)_localctx).WHILE.getText():null) + "</SPAN> " + ((MidowhileContext)_localctx).expcond.text + "<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).SEMICOLON!=null?((MidowhileContext)_localctx).SEMICOLON.getText():null) + "</SPAN>";
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
	public static class MiforContext extends ParserRuleContext {
		public String text;
		public Token FOR;
		public Token LPARENTHESIS;
		public For1Context for1;
		public TerminalNode FOR() { return getToken(PracticaParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public For1Context for1() {
			return getRuleContext(For1Context.class,0);
		}
		public MiforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMifor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMifor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMifor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiforContext mifor() throws RecognitionException {
		MiforContext _localctx = new MiforContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((MiforContext)_localctx).FOR = match(FOR);
			setState(360);
			((MiforContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(361);
			((MiforContext)_localctx).for1 = for1();
			((MiforContext)_localctx).text =  _localctx.text ="<SPAN CLASS=\"palres\">" + (((MiforContext)_localctx).FOR!=null?((MiforContext)_localctx).FOR.getText():null) + "</SPAN>" + "<SPAN CLASS=\"palres\">" + (((MiforContext)_localctx).LPARENTHESIS!=null?((MiforContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((MiforContext)_localctx).for1.text;
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
		public String text;
		public VardefContext vardef;
		public Token SEMICOLON;
		public ExpcondContext expcond;
		public AsigContext asig;
		public Token RPARENTHESIS;
		public Token LBRACE;
		public CodeContext code;
		public Token RBRACE;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PracticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PracticaParser.SEMICOLON, i);
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
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
		enterRule(_localctx, 72, RULE_for1);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				((For1Context)_localctx).vardef = vardef();
				setState(365);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(366);
				((For1Context)_localctx).expcond = expcond();
				setState(367);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(368);
				((For1Context)_localctx).asig = asig();
				setState(369);
				((For1Context)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				setState(370);
				((For1Context)_localctx).LBRACE = match(LBRACE);
				setState(371);
				((For1Context)_localctx).code = code();
				setState(372);
				((For1Context)_localctx).RBRACE = match(RBRACE);
				((For1Context)_localctx).text =  ((For1Context)_localctx).vardef.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + "</SPAN> " + ((For1Context)_localctx).expcond.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + "</SPAN> " + ((For1Context)_localctx).asig.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).RPARENTHESIS!=null?((For1Context)_localctx).RPARENTHESIS.getText():null) + "</SPAN>" + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).LBRACE!=null?((For1Context)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n" + ((For1Context)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).RBRACE!=null?((For1Context)_localctx).RBRACE.getText():null) + "</SPAN>";
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				((For1Context)_localctx).asig = asig();
				setState(376);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(377);
				((For1Context)_localctx).expcond = expcond();
				setState(378);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(379);
				((For1Context)_localctx).asig = asig();
				setState(380);
				((For1Context)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				setState(381);
				((For1Context)_localctx).LBRACE = match(LBRACE);
				setState(382);
				((For1Context)_localctx).code = code();
				setState(383);
				((For1Context)_localctx).RBRACE = match(RBRACE);
				((For1Context)_localctx).text =  ((For1Context)_localctx).asig.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + "</SPAN> " + ((For1Context)_localctx).expcond.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + "</SPAN> " + ((For1Context)_localctx).asig.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).RPARENTHESIS!=null?((For1Context)_localctx).RPARENTHESIS.getText():null) + "</SPAN>" + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).LBRACE!=null?((For1Context)_localctx).LBRACE.getText():null) + "</SPAN>" +  "\n" + ((For1Context)_localctx).code.text + "<SPAN CLASS=\"palres\">" + (((For1Context)_localctx).RBRACE!=null?((For1Context)_localctx).RBRACE.getText():null) + "</SPAN>";
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
		public String text;
		public FactorcondContext factorcond;
		public Expcond_tailContext expcond_tail;
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
		enterRule(_localctx, 74, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(389);
			((ExpcondContext)_localctx).expcond_tail = expcond_tail();
			((ExpcondContext)_localctx).text =  ((ExpcondContext)_localctx).factorcond.text + ((ExpcondContext)_localctx).expcond_tail.text;
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
		public String text;
		public OplogContext oplog;
		public FactorcondContext factorcond;
		public Expcond_tailContext expcond_tail;
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
		enterRule(_localctx, 76, RULE_expcond_tail);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((Expcond_tailContext)_localctx).oplog = oplog();
				setState(393);
				((Expcond_tailContext)_localctx).factorcond = factorcond();
				setState(394);
				((Expcond_tailContext)_localctx).expcond_tail = expcond_tail();
				((Expcond_tailContext)_localctx).text =  ((Expcond_tailContext)_localctx).oplog.text + ((Expcond_tailContext)_localctx).factorcond.text + ((Expcond_tailContext)_localctx).expcond_tail.text;
				}
				break;
			case LBRACE:
			case SEMICOLON:
			case RPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				((Expcond_tailContext)_localctx).text =  "";
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
		public String text;
		public Token OR;
		public Token AND;
		public TerminalNode OR() { return getToken(PracticaParser.OR, 0); }
		public TerminalNode AND() { return getToken(PracticaParser.AND, 0); }
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
		enterRule(_localctx, 78, RULE_oplog);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((OplogContext)_localctx).OR = match(OR);
				((OplogContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OplogContext)_localctx).OR!=null?((OplogContext)_localctx).OR.getText():null) + "</SPAN> ";
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				((OplogContext)_localctx).AND = match(AND);
				((OplogContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OplogContext)_localctx).AND!=null?((OplogContext)_localctx).AND.getText():null) + "</SPAN> ";
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
	public static class FactorcondContext extends ParserRuleContext {
		public String text;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public Token LPARENTHESIS;
		public ExpcondContext expcond;
		public Token RPARENTHESIS;
		public Token NOT;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
		public TerminalNode NOT() { return getToken(PracticaParser.NOT, 0); }
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
		enterRule(_localctx, 80, RULE_factorcond);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((FactorcondContext)_localctx).e1 = exp();
				setState(407);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(408);
				((FactorcondContext)_localctx).e2 = exp();
				((FactorcondContext)_localctx).text =  ((FactorcondContext)_localctx).e1.text + ((FactorcondContext)_localctx).opcomp.text + ((FactorcondContext)_localctx).e2.text;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				((FactorcondContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(412);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(413);
				((FactorcondContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((FactorcondContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((FactorcondContext)_localctx).LPARENTHESIS!=null?((FactorcondContext)_localctx).LPARENTHESIS.getText():null) + "</SPAN>" + ((FactorcondContext)_localctx).expcond.text + "<SPAN CLASS=\"palres\">" + (((FactorcondContext)_localctx).RPARENTHESIS!=null?((FactorcondContext)_localctx).RPARENTHESIS.getText():null) + "</SPAN>";
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				((FactorcondContext)_localctx).NOT = match(NOT);
				setState(417);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((FactorcondContext)_localctx).NOT!=null?((FactorcondContext)_localctx).NOT.getText():null) + "</SPAN>" + ((FactorcondContext)_localctx).factorcond.text;
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
		public String text;
		public Token SMORE;
		public Token SLESS;
		public Token SMOREE;
		public Token SLESSE;
		public Token SEQUAL;
		public TerminalNode SMORE() { return getToken(PracticaParser.SMORE, 0); }
		public TerminalNode SLESS() { return getToken(PracticaParser.SLESS, 0); }
		public TerminalNode SMOREE() { return getToken(PracticaParser.SMOREE, 0); }
		public TerminalNode SLESSE() { return getToken(PracticaParser.SLESSE, 0); }
		public TerminalNode SEQUAL() { return getToken(PracticaParser.SEQUAL, 0); }
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
		enterRule(_localctx, 82, RULE_opcomp);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SMORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				((OpcompContext)_localctx).SMORE = match(SMORE);
				((OpcompContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpcompContext)_localctx).SMORE!=null?((OpcompContext)_localctx).SMORE.getText():null) + "</SPAN> ";
				}
				break;
			case SLESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				((OpcompContext)_localctx).SLESS = match(SLESS);
				((OpcompContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpcompContext)_localctx).SLESS!=null?((OpcompContext)_localctx).SLESS.getText():null) + "</SPAN> ";
				}
				break;
			case SMOREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				((OpcompContext)_localctx).SMOREE = match(SMOREE);
				((OpcompContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpcompContext)_localctx).SMOREE!=null?((OpcompContext)_localctx).SMOREE.getText():null) + "</SPAN> ";
				}
				break;
			case SLESSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				((OpcompContext)_localctx).SLESSE = match(SLESSE);
				((OpcompContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpcompContext)_localctx).SLESSE!=null?((OpcompContext)_localctx).SLESSE.getText():null) + "</SPAN> ";
				}
				break;
			case SEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				((OpcompContext)_localctx).SEQUAL = match(SEQUAL);
				((OpcompContext)_localctx).text =  " <SPAN CLASS=\"palres\">" + (((OpcompContext)_localctx).SEQUAL!=null?((OpcompContext)_localctx).SEQUAL.getText():null) + "</SPAN> ";
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

	public static final String _serializedATN =
		"\u0004\u0001/\u01b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001_\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0091"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009f\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00c5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00ce\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00dc\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00f6\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0107\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0113\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0120\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012a\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0132\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u013d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u014c\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0156\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0183\b$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u018f\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u0195\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01a5\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01b1"+
		"\b)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000"+
		"\u0000\u01b1\u0000T\u0001\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000"+
		"\u0004e\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bs\u0001"+
		"\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000"+
		"\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000"+
		"\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000"+
		"\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000"+
		"\u0000\u001e\u00b7\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000\u0000"+
		"\"\u00cd\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00db"+
		"\u0001\u0000\u0000\u0000(\u00f5\u0001\u0000\u0000\u0000*\u00f7\u0001\u0000"+
		"\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000.\u0106\u0001\u0000\u0000\u0000"+
		"0\u0112\u0001\u0000\u0000\u00002\u011f\u0001\u0000\u0000\u00004\u0129"+
		"\u0001\u0000\u0000\u00006\u0131\u0001\u0000\u0000\u00008\u0133\u0001\u0000"+
		"\u0000\u0000:\u013c\u0001\u0000\u0000\u0000<\u013e\u0001\u0000\u0000\u0000"+
		">\u014b\u0001\u0000\u0000\u0000@\u0155\u0001\u0000\u0000\u0000B\u0157"+
		"\u0001\u0000\u0000\u0000D\u015e\u0001\u0000\u0000\u0000F\u0167\u0001\u0000"+
		"\u0000\u0000H\u0182\u0001\u0000\u0000\u0000J\u0184\u0001\u0000\u0000\u0000"+
		"L\u018e\u0001\u0000\u0000\u0000N\u0194\u0001\u0000\u0000\u0000P\u01a4"+
		"\u0001\u0000\u0000\u0000R\u01b0\u0001\u0000\u0000\u0000TU\u0003\u0002"+
		"\u0001\u0000UV\u0003\u0004\u0002\u0000VW\u0003\u0006\u0003\u0000WX\u0006"+
		"\u0000\uffff\uffff\u0000X\u0001\u0001\u0000\u0000\u0000Y_\u0006\u0001"+
		"\uffff\uffff\u0000Z[\u0003\b\u0004\u0000[\\\u0003\u0002\u0001\u0000\\"+
		"]\u0006\u0001\uffff\uffff\u0000]_\u0001\u0000\u0000\u0000^Y\u0001\u0000"+
		"\u0000\u0000^Z\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000"+
		"`f\u0006\u0002\uffff\uffff\u0000ab\u0003\u001c\u000e\u0000bc\u0003\u0004"+
		"\u0002\u0000cd\u0006\u0002\uffff\uffff\u0000df\u0001\u0000\u0000\u0000"+
		"e`\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000f\u0005\u0001\u0000"+
		"\u0000\u0000gh\u0003$\u0012\u0000hi\u0005\u0001\u0000\u0000ij\u0003&\u0013"+
		"\u0000jk\u0005\u0002\u0000\u0000kl\u0006\u0003\uffff\uffff\u0000l\u0007"+
		"\u0001\u0000\u0000\u0000mn\u0003\n\u0005\u0000no\u0006\u0004\uffff\uffff"+
		"\u0000ot\u0001\u0000\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0006\u0004"+
		"\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000t\t\u0001\u0000\u0000\u0000uv\u0005\u0003\u0000"+
		"\u0000vw\u0005!\u0000\u0000wx\u0003\f\u0006\u0000xy\u0006\u0005\uffff"+
		"\uffff\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0005#\u0000\u0000{\u0081"+
		"\u0006\u0006\uffff\uffff\u0000|}\u0005$\u0000\u0000}\u0081\u0006\u0006"+
		"\uffff\uffff\u0000~\u007f\u0005)\u0000\u0000\u007f\u0081\u0006\u0006\uffff"+
		"\uffff\u0000\u0080z\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085"+
		"\u0006\u0007\uffff\uffff\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0003\u0014\n\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u0089"+
		"\u0003\u0012\t\u0000\u0089\u008a\u0006\b\uffff\uffff\u0000\u008a\u0011"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001b\u0000\u0000\u008c\u008d"+
		"\u0003\f\u0006\u0000\u008d\u008e\u0006\t\uffff\uffff\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0006\t\uffff\uffff\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0013"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0005\u0000\u0000\u0093\u009f"+
		"\u0006\n\uffff\uffff\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095\u009f"+
		"\u0006\n\uffff\uffff\u0000\u0096\u0097\u0005\u0007\u0000\u0000\u0097\u009f"+
		"\u0006\n\uffff\uffff\u0000\u0098\u0099\u0003\u0016\u000b\u0000\u0099\u009a"+
		"\u0006\n\uffff\uffff\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003\u0018\f\u0000\u009c\u009d\u0006\n\uffff\uffff\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000\u0000\u009e\u0094"+
		"\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u0015"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\b\u0000\u0000\u00a1\u00a2\u0006"+
		"\u000b\uffff\uffff\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\t\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000\u00a5\u00a6\u0003"+
		"\u000e\u0007\u0000\u00a6\u00a7\u0003\u001a\r\u0000\u00a7\u00a8\u0005\u0002"+
		"\u0000\u0000\u00a8\u00a9\u0006\f\uffff\uffff\u0000\u00a9\u0019\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac\u0003\u001a"+
		"\r\u0000\u00ac\u00ad\u0006\r\uffff\uffff\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0006\r\uffff\uffff\u0000\u00af\u00aa\u0001\u0000"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0003\u001e\u000f\u0000\u00b2\u00b3\u0005\u0001"+
		"\u0000\u0000\u00b3\u00b4\u0003&\u0013\u0000\u00b4\u00b5\u0005\u0002\u0000"+
		"\u0000\u00b5\u00b6\u0006\u000e\uffff\uffff\u0000\u00b6\u001d\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0003\u0014\n\u0000\u00b8\u00b9\u0005\"\u0000"+
		"\u0000\u00b9\u00ba\u0005\f\u0000\u0000\u00ba\u00bb\u0003 \u0010\u0000"+
		"\u00bb\u00bc\u0005\r\u0000\u0000\u00bc\u00bd\u0006\u000f\uffff\uffff\u0000"+
		"\u00bd\u001f\u0001\u0000\u0000\u0000\u00be\u00c5\u0006\u0010\uffff\uffff"+
		"\u0000\u00bf\u00c0\u0003\u0014\n\u0000\u00c0\u00c1\u0005\"\u0000\u0000"+
		"\u00c1\u00c2\u0003\"\u0011\u0000\u00c2\u00c3\u0006\u0010\uffff\uffff\u0000"+
		"\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000"+
		"\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c5!\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0003\u0014\n\u0000\u00c8\u00c9"+
		"\u0005\"\u0000\u0000\u00c9\u00ca\u0003\"\u0011\u0000\u00ca\u00cb\u0006"+
		"\u0011\uffff\uffff\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0006\u0011\uffff\uffff\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000\u00d1\u00d2"+
		"\u0005\f\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d4\u0005"+
		"\r\u0000\u0000\u00d4\u00d5\u0006\u0012\uffff\uffff\u0000\u00d5%\u0001"+
		"\u0000\u0000\u0000\u00d6\u00dc\u0006\u0013\uffff\uffff\u0000\u00d7\u00d8"+
		"\u0003(\u0014\u0000\u00d8\u00d9\u0003&\u0013\u0000\u00d9\u00da\u0006\u0013"+
		"\uffff\uffff\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d6\u0001"+
		"\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc\'\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0003*\u0015\u0000\u00de\u00df\u0005\u0004\u0000"+
		"\u0000\u00df\u00e0\u0006\u0014\uffff\uffff\u0000\u00e0\u00f6\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u00034\u001a\u0000\u00e2\u00e3\u0005\u0004\u0000"+
		"\u0000\u00e3\u00e4\u0006\u0014\uffff\uffff\u0000\u00e4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0003\u0010\b\u0000\u00e6\u00e7\u0005\u0004\u0000"+
		"\u0000\u00e7\u00e8\u0006\u0014\uffff\uffff\u0000\u00e8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0003<\u001e\u0000\u00ea\u00eb\u0006\u0014\uffff"+
		"\uffff\u0000\u00eb\u00f6\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003B!\u0000"+
		"\u00ed\u00ee\u0006\u0014\uffff\uffff\u0000\u00ee\u00f6\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0003F#\u0000\u00f0\u00f1\u0006\u0014\uffff\uffff\u0000"+
		"\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003D\"\u0000\u00f3"+
		"\u00f4\u0006\u0014\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f5\u00dd\u0001\u0000\u0000\u0000\u00f5\u00e1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e5\u0001\u0000\u0000\u0000\u00f5\u00e9\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ec\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6)\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\"\u0000\u0000\u00f8\u00f9\u0005\u001b\u0000\u0000\u00f9\u00fa"+
		"\u0003,\u0016\u0000\u00fa\u00fb\u0006\u0015\uffff\uffff\u0000\u00fb+\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u00032\u0019\u0000\u00fd\u00fe\u0003.\u0017"+
		"\u0000\u00fe\u00ff\u0006\u0016\uffff\uffff\u0000\u00ff-\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u00030\u0018\u0000\u0101\u0102\u00032\u0019\u0000\u0102"+
		"\u0103\u0003.\u0017\u0000\u0103\u0104\u0006\u0017\uffff\uffff\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0107\u0006\u0017\uffff\uffff\u0000"+
		"\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107/\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001c\u0000\u0000\u0109"+
		"\u0113\u0006\u0018\uffff\uffff\u0000\u010a\u010b\u0005\u001d\u0000\u0000"+
		"\u010b\u0113\u0006\u0018\uffff\uffff\u0000\u010c\u010d\u0005\u001e\u0000"+
		"\u0000\u010d\u0113\u0006\u0018\uffff\uffff\u0000\u010e\u010f\u0005\u001f"+
		"\u0000\u0000\u010f\u0113\u0006\u0018\uffff\uffff\u0000\u0110\u0111\u0005"+
		" \u0000\u0000\u0111\u0113\u0006\u0018\uffff\uffff\u0000\u0112\u0108\u0001"+
		"\u0000\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0112\u010c\u0001"+
		"\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0115\u0003\f"+
		"\u0006\u0000\u0115\u0116\u0006\u0019\uffff\uffff\u0000\u0116\u0120\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118\u0119\u0003,"+
		"\u0016\u0000\u0119\u011a\u0005\r\u0000\u0000\u011a\u011b\u0006\u0019\uffff"+
		"\uffff\u0000\u011b\u0120\u0001\u0000\u0000\u0000\u011c\u011d\u00034\u001a"+
		"\u0000\u011d\u011e\u0006\u0019\uffff\uffff\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u0117\u0001\u0000"+
		"\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u01203\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005\"\u0000\u0000\u0122\u0123\u00036\u001b\u0000"+
		"\u0123\u0124\u0006\u001a\uffff\uffff\u0000\u0124\u012a\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005!\u0000\u0000\u0126\u0127\u00036\u001b\u0000\u0127"+
		"\u0128\u0006\u001a\uffff\uffff\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000"+
		"\u012a5\u0001\u0000\u0000\u0000\u012b\u012c\u0005\f\u0000\u0000\u012c"+
		"\u012d\u00038\u001c\u0000\u012d\u012e\u0005\r\u0000\u0000\u012e\u012f"+
		"\u0006\u001b\uffff\uffff\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0006\u001b\uffff\uffff\u0000\u0131\u012b\u0001\u0000\u0000\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u01327\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0003,\u0016\u0000\u0134\u0135\u0003:\u001d\u0000\u0135\u0136\u0006"+
		"\u001c\uffff\uffff\u0000\u01369\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"\n\u0000\u0000\u0138\u0139\u00038\u001c\u0000\u0139\u013a\u0006\u001d"+
		"\uffff\uffff\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u013d\u0006"+
		"\u001d\uffff\uffff\u0000\u013c\u0137\u0001\u0000\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d;\u0001\u0000\u0000\u0000\u013e\u013f\u0005"+
		"\u000e\u0000\u0000\u013f\u0140\u0003J%\u0000\u0140\u0141\u0005\u0001\u0000"+
		"\u0000\u0141\u0142\u0003&\u0013\u0000\u0142\u0143\u0005\u0002\u0000\u0000"+
		"\u0143\u0144\u0003>\u001f\u0000\u0144\u0145\u0006\u001e\uffff\uffff\u0000"+
		"\u0145=\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u000f\u0000\u0000\u0147"+
		"\u0148\u0003@ \u0000\u0148\u0149\u0006\u001f\uffff\uffff\u0000\u0149\u014c"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0006\u001f\uffff\uffff\u0000\u014b"+
		"\u0146\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c"+
		"?\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0001\u0000\u0000\u014e\u014f"+
		"\u0003&\u0013\u0000\u014f\u0150\u0005\u0002\u0000\u0000\u0150\u0151\u0006"+
		" \uffff\uffff\u0000\u0151\u0156\u0001\u0000\u0000\u0000\u0152\u0153\u0003"+
		"<\u001e\u0000\u0153\u0154\u0006 \uffff\uffff\u0000\u0154\u0156\u0001\u0000"+
		"\u0000\u0000\u0155\u014d\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000"+
		"\u0000\u0000\u0156A\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0010\u0000"+
		"\u0000\u0158\u0159\u0003J%\u0000\u0159\u015a\u0005\u0001\u0000\u0000\u015a"+
		"\u015b\u0003&\u0013\u0000\u015b\u015c\u0005\u0002\u0000\u0000\u015c\u015d"+
		"\u0006!\uffff\uffff\u0000\u015dC\u0001\u0000\u0000\u0000\u015e\u015f\u0005"+
		"\u0011\u0000\u0000\u015f\u0160\u0005\u0001\u0000\u0000\u0160\u0161\u0003"+
		"&\u0013\u0000\u0161\u0162\u0005\u0002\u0000\u0000\u0162\u0163\u0005\u0010"+
		"\u0000\u0000\u0163\u0164\u0003J%\u0000\u0164\u0165\u0005\u0004\u0000\u0000"+
		"\u0165\u0166\u0006\"\uffff\uffff\u0000\u0166E\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005\u0012\u0000\u0000\u0168\u0169\u0005\f\u0000\u0000\u0169"+
		"\u016a\u0003H$\u0000\u016a\u016b\u0006#\uffff\uffff\u0000\u016bG\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0003\u0010\b\u0000\u016d\u016e\u0005\u0004"+
		"\u0000\u0000\u016e\u016f\u0003J%\u0000\u016f\u0170\u0005\u0004\u0000\u0000"+
		"\u0170\u0171\u0003*\u0015\u0000\u0171\u0172\u0005\r\u0000\u0000\u0172"+
		"\u0173\u0005\u0001\u0000\u0000\u0173\u0174\u0003&\u0013\u0000\u0174\u0175"+
		"\u0005\u0002\u0000\u0000\u0175\u0176\u0006$\uffff\uffff\u0000\u0176\u0183"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0003*\u0015\u0000\u0178\u0179\u0005"+
		"\u0004\u0000\u0000\u0179\u017a\u0003J%\u0000\u017a\u017b\u0005\u0004\u0000"+
		"\u0000\u017b\u017c\u0003*\u0015\u0000\u017c\u017d\u0005\r\u0000\u0000"+
		"\u017d\u017e\u0005\u0001\u0000\u0000\u017e\u017f\u0003&\u0013\u0000\u017f"+
		"\u0180\u0005\u0002\u0000\u0000\u0180\u0181\u0006$\uffff\uffff\u0000\u0181"+
		"\u0183\u0001\u0000\u0000\u0000\u0182\u016c\u0001\u0000\u0000\u0000\u0182"+
		"\u0177\u0001\u0000\u0000\u0000\u0183I\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0003P(\u0000\u0185\u0186\u0003L&\u0000\u0186\u0187\u0006%\uffff\uffff"+
		"\u0000\u0187K\u0001\u0000\u0000\u0000\u0188\u0189\u0003N\'\u0000\u0189"+
		"\u018a\u0003P(\u0000\u018a\u018b\u0003L&\u0000\u018b\u018c\u0006&\uffff"+
		"\uffff\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018f\u0006&\uffff"+
		"\uffff\u0000\u018e\u0188\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018fM\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0014\u0000"+
		"\u0000\u0191\u0195\u0006\'\uffff\uffff\u0000\u0192\u0193\u0005\u0013\u0000"+
		"\u0000\u0193\u0195\u0006\'\uffff\uffff\u0000\u0194\u0190\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195O\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0003,\u0016\u0000\u0197\u0198\u0003R)\u0000\u0198\u0199"+
		"\u0003,\u0016\u0000\u0199\u019a\u0006(\uffff\uffff\u0000\u019a\u01a5\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0005\f\u0000\u0000\u019c\u019d\u0003J"+
		"%\u0000\u019d\u019e\u0005\r\u0000\u0000\u019e\u019f\u0006(\uffff\uffff"+
		"\u0000\u019f\u01a5\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0015\u0000"+
		"\u0000\u01a1\u01a2\u0003P(\u0000\u01a2\u01a3\u0006(\uffff\uffff\u0000"+
		"\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u0196\u0001\u0000\u0000\u0000"+
		"\u01a4\u019b\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a5Q\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0016\u0000\u0000\u01a7"+
		"\u01b1\u0006)\uffff\uffff\u0000\u01a8\u01a9\u0005\u0017\u0000\u0000\u01a9"+
		"\u01b1\u0006)\uffff\uffff\u0000\u01aa\u01ab\u0005\u0018\u0000\u0000\u01ab"+
		"\u01b1\u0006)\uffff\uffff\u0000\u01ac\u01ad\u0005\u0019\u0000\u0000\u01ad"+
		"\u01b1\u0006)\uffff\uffff\u0000\u01ae\u01af\u0005\u001a\u0000\u0000\u01af"+
		"\u01b1\u0006)\uffff\uffff\u0000\u01b0\u01a6\u0001\u0000\u0000\u0000\u01b0"+
		"\u01a8\u0001\u0000\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1"+
		"S\u0001\u0000\u0000\u0000\u0018^es\u0080\u0090\u009e\u00af\u00c4\u00cd"+
		"\u00db\u00f5\u0106\u0112\u011f\u0129\u0131\u013c\u014b\u0155\u0182\u018e"+
		"\u0194\u01a4\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}