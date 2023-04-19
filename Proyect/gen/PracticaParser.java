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
		RULE_if = 30, RULE_else = 31, RULE_else1 = 32, RULE_while = 33, RULE_dowhile = 34, 
		RULE_for = 35, RULE_for1 = 36, RULE_expcond = 37, RULE_expcond_tail = 38, 
		RULE_oplog = 39, RULE_factorcond = 40, RULE_opcomp = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "funlist", "sentlist", "dcl", "ctelist", "simpvalue", 
			"varlist", "vardef", "vardef2", "tbas", "tvoid", "struct", "varlist2", 
			"funcdef", "funchead", "typedef1", "typedef2_tail", "mainhead", "code", 
			"sent", "asig", "exp", "exp1", "op", "factor", "funccall", "subpparamlist", 
			"explist", "explist1", "if", "else", "else1", "while", "dowhile", "for", 
			"for1", "expcond", "expcond_tail", "oplog", "factorcond", "opcomp"
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
			match(LBRACE);
			setState(105);
			code();
			setState(106);
			match(RBRACE);
			((SentlistContext)_localctx).text = "<A NAME=\"Main\">\n<code>\n"+((SentlistContext)_localctx).mainhead.text+"\n{"+"\n}\n" +"\n<br/>\n</code>\n"+
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
			((CtelistContext)_localctx).text =  "<SPAN CLASS=\"palres\">" +  (((CtelistContext)_localctx).DEFINE!=null?((CtelistContext)_localctx).DEFINE.getText():null) + "</SPAN> " + "<A NAME=\""+ (((CtelistContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtelistContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\">" + "<SPAN CLASS=\"ident\">" + (((CtelistContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtelistContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</SPAN> " +"<SPAN CLASS=\"cte\">"+ ((CtelistContext)_localctx).simpvalue.text + "</SPAN>";
					
			}
		}
		catch (RecognitionException re) {
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
				((SimpvalueContext)_localctx).text = (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null);
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).text = (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).text = (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
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
			((VardefContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((VardefContext)_localctx).tbas.type + "</SPAN> " + "<A NAME=\""+ (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "\">" + "<SPAN CLASS=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" +  ((VardefContext)_localctx).vardef2.text;
					
			}
		}
		catch (RecognitionException re) {
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
				((Vardef2Context)_localctx).text =  "<SPAN CLASS=\"palres\"> " + (((Vardef2Context)_localctx).SASIGN!=null?((Vardef2Context)_localctx).SASIGN.getText():null)  + "</SPAN> " + "<SPAN CLASS=\"cte\">"+ ((Vardef2Context)_localctx).simpvalue.text + "</SPAN>";
						
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
				struct();
				((TbasContext)_localctx).type = "struct";
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
			match(STRUCT);
			setState(164);
			match(LBRACE);
			setState(165);
			varlist();
			setState(166);
			varlist2();
			setState(167);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				varlist();
				setState(170);
				varlist2();
				}
				break;
			case RBRACE:
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
	public static class FuncdefContext extends ParserRuleContext {
		public String body;
		public String header;
		public FuncheadContext funchead;
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
			setState(175);
			((FuncdefContext)_localctx).funchead = funchead();
			setState(176);
			match(LBRACE);
			setState(177);
			code();
			setState(178);
			match(RBRACE);
			((FuncdefContext)_localctx).body =  "<A NAME=\""+ ((FuncdefContext)_localctx).funchead.name + "\">\n"
					+ "<code>\n" + ((FuncdefContext)_localctx).funchead.text + "\n{\n" + "}\n" + "<br/>\n</code>\n"
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
		public Typedef1Context typedef1;
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
			setState(181);
			((FuncheadContext)_localctx).tbas = tbas();
			setState(182);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(183);
			match(LPARENTHESIS);
			setState(184);
			((FuncheadContext)_localctx).typedef1 = typedef1();
			setState(185);
			match(RPARENTHESIS);
			((FuncheadContext)_localctx).name =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null); ((FuncheadContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((FuncheadContext)_localctx).tbas.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>" +  "(" + ((FuncheadContext)_localctx).typedef1.text + ")";
					((FuncheadContext)_localctx).header =  ((FuncheadContext)_localctx).tbas.type + " " + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +  "(" + ((FuncheadContext)_localctx).typedef1.header + ")";
			}
		}
		catch (RecognitionException re) {
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
			setState(194);
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
				setState(189);
				((Typedef1Context)_localctx).tbas = tbas();
				setState(190);
				((Typedef1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(191);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(COMMA);
				setState(197);
				((Typedef2_tailContext)_localctx).tbas = tbas();
				setState(198);
				((Typedef2_tailContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(199);
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
		public Typedef1Context typedef1;
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
			setState(205);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(206);
			((MainheadContext)_localctx).MAIN = match(MAIN);
			setState(207);
			match(LPARENTHESIS);
			setState(208);
			((MainheadContext)_localctx).typedef1 = typedef1();
			setState(209);
			match(RPARENTHESIS);
			((MainheadContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((MainheadContext)_localctx).tvoid.type + "</SPAN> " + "<SPAN CLASS=\"ident\">" + (((MainheadContext)_localctx).MAIN!=null?((MainheadContext)_localctx).MAIN.getText():null) + "</SPAN>" +  "(" + ((MainheadContext)_localctx).typedef1.text + ")";
			                                                                                                                                      		
			}
		}
		catch (RecognitionException re) {
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
			setState(217);
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
				setState(213);
				((CodeContext)_localctx).sent = sent();
				setState(214);
				((CodeContext)_localctx).code = code();
				((CodeContext)_localctx).text =  ((CodeContext)_localctx).sent.text + ((CodeContext)_localctx).code.text;
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
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				asig();
				setState(220);
				match(SEMICOLON);
				((SentContext)_localctx).text = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				funccall();
				setState(224);
				match(SEMICOLON);
				((SentContext)_localctx).text = "";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				vardef();
				setState(228);
				match(SEMICOLON);
				((SentContext)_localctx).text = "";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				if_();
				((SentContext)_localctx).text = "";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				while_();
				((SentContext)_localctx).text = "";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				for_();
				((SentContext)_localctx).text = "";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				dowhile();
				((SentContext)_localctx).text = "";
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
			setState(245);
			match(IDENTIFIER);
			setState(246);
			match(SASIGN);
			setState(247);
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
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			factor();
			setState(250);
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
		enterRule(_localctx, 46, RULE_exp1);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case LESS:
			case TIMES:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				op();
				setState(253);
				factor();
				setState(254);
				exp1();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				simpvalue();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(LPARENTHESIS);
				setState(263);
				exp();
				setState(264);
				match(RPARENTHESIS);
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
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
		enterRule(_localctx, 52, RULE_funccall);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(IDENTIFIER);
				setState(270);
				subpparamlist();
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(CONST_DEF_IDENTIFIER);
				setState(272);
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(LPARENTHESIS);
				setState(276);
				explist();
				setState(277);
				match(RPARENTHESIS);
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
		enterRule(_localctx, 56, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			exp();
			setState(283);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(COMMA);
				setState(286);
				explist();
				}
				break;
			case RPARENTHESIS:
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
		public TerminalNode IF() { return getToken(PracticaParser.IF, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
		enterRule(_localctx, 60, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IF);
			setState(291);
			expcond();
			setState(292);
			match(LBRACE);
			setState(293);
			code();
			setState(294);
			match(RBRACE);
			setState(295);
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
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
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
		enterRule(_localctx, 62, RULE_else);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(ELSE);
				setState(298);
				else1();
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
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public TerminalNode IF() { return getToken(PracticaParser.IF, 0); }
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
		enterRule(_localctx, 64, RULE_else1);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(LBRACE);
				setState(303);
				code();
				setState(304);
				match(RBRACE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(IF);
				setState(307);
				expcond();
				setState(308);
				match(LBRACE);
				setState(309);
				code();
				setState(310);
				match(RBRACE);
				setState(311);
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
		public TerminalNode WHILE() { return getToken(PracticaParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
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
		enterRule(_localctx, 66, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(WHILE);
			setState(316);
			match(LPARENTHESIS);
			setState(317);
			expcond();
			setState(318);
			match(RPARENTHESIS);
			setState(319);
			match(LBRACE);
			setState(320);
			code();
			setState(321);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DO() { return getToken(PracticaParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(PracticaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PracticaParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(PracticaParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 68, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(DO);
			setState(324);
			match(LBRACE);
			setState(325);
			code();
			setState(326);
			match(RBRACE);
			setState(327);
			match(WHILE);
			setState(328);
			match(LPARENTHESIS);
			setState(329);
			expcond();
			setState(330);
			match(RPARENTHESIS);
			setState(331);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FOR() { return getToken(PracticaParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
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
		enterRule(_localctx, 70, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(FOR);
			setState(334);
			match(LPARENTHESIS);
			setState(335);
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
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				vardef();
				setState(338);
				match(SEMICOLON);
				setState(339);
				expcond();
				setState(340);
				match(SEMICOLON);
				setState(341);
				asig();
				setState(342);
				match(RPARENTHESIS);
				setState(343);
				match(LBRACE);
				setState(344);
				code();
				setState(345);
				match(RBRACE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				asig();
				setState(348);
				match(SEMICOLON);
				setState(349);
				expcond();
				setState(350);
				match(SEMICOLON);
				setState(351);
				asig();
				setState(352);
				match(RPARENTHESIS);
				setState(353);
				match(LBRACE);
				setState(354);
				code();
				setState(355);
				match(RBRACE);
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
		enterRule(_localctx, 74, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			factorcond();
			setState(360);
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
		enterRule(_localctx, 76, RULE_expcond_tail);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				oplog();
				setState(363);
				factorcond();
				setState(364);
				expcond_tail();
				}
				break;
			case LBRACE:
			case SEMICOLON:
			case RPARENTHESIS:
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				exp();
				setState(372);
				opcomp();
				setState(373);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(LPARENTHESIS);
				setState(376);
				expcond();
				setState(377);
				match(RPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(NOT);
				setState(380);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 130023424L) != 0) ) {
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
		"\u0004\u0001/\u0182\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00ae\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c3\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00cc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00da\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00f4\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0102\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u010c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0112\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0119\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0121\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u012d\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u013a"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0166\b$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0170\b&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u017e\b(\u0001"+
		")\u0001)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"\u0000\u0003\u0001\u0000\u001c \u0001\u0000\u0013\u0014\u0001\u0000\u0016"+
		"\u001a\u0177\u0000T\u0001\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000"+
		"\u0004e\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bs\u0001"+
		"\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000"+
		"\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000"+
		"\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000"+
		"\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000"+
		"\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000"+
		"\"\u00cb\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&\u00d9"+
		"\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*\u00f5\u0001\u0000"+
		"\u0000\u0000,\u00f9\u0001\u0000\u0000\u0000.\u0101\u0001\u0000\u0000\u0000"+
		"0\u0103\u0001\u0000\u0000\u00002\u010b\u0001\u0000\u0000\u00004\u0111"+
		"\u0001\u0000\u0000\u00006\u0118\u0001\u0000\u0000\u00008\u011a\u0001\u0000"+
		"\u0000\u0000:\u0120\u0001\u0000\u0000\u0000<\u0122\u0001\u0000\u0000\u0000"+
		">\u012c\u0001\u0000\u0000\u0000@\u0139\u0001\u0000\u0000\u0000B\u013b"+
		"\u0001\u0000\u0000\u0000D\u0143\u0001\u0000\u0000\u0000F\u014d\u0001\u0000"+
		"\u0000\u0000H\u0165\u0001\u0000\u0000\u0000J\u0167\u0001\u0000\u0000\u0000"+
		"L\u016f\u0001\u0000\u0000\u0000N\u0171\u0001\u0000\u0000\u0000P\u017d"+
		"\u0001\u0000\u0000\u0000R\u017f\u0001\u0000\u0000\u0000TU\u0003\u0002"+
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
		"\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u000e"+
		"\u0007\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u001b\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005\u0001\u0000"+
		"\u0000\u00b1\u00b2\u0003&\u0013\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000"+
		"\u00b3\u00b4\u0006\u000e\uffff\uffff\u0000\u00b4\u001d\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0014\n\u0000\u00b6\u00b7\u0005\"\u0000\u0000"+
		"\u00b7\u00b8\u0005\f\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9"+
		"\u00ba\u0005\r\u0000\u0000\u00ba\u00bb\u0006\u000f\uffff\uffff\u0000\u00bb"+
		"\u001f\u0001\u0000\u0000\u0000\u00bc\u00c3\u0006\u0010\uffff\uffff\u0000"+
		"\u00bd\u00be\u0003\u0014\n\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf"+
		"\u00c0\u0003\"\u0011\u0000\u00c0\u00c1\u0006\u0010\uffff\uffff\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\n\u0000\u0000\u00c5\u00c6\u0003\u0014\n\u0000\u00c6\u00c7\u0005"+
		"\"\u0000\u0000\u00c7\u00c8\u0003\"\u0011\u0000\u00c8\u00c9\u0006\u0011"+
		"\uffff\uffff\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00cc\u0006"+
		"\u0011\uffff\uffff\u0000\u00cb\u00c4\u0001\u0000\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc#\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0016\u000b\u0000\u00ce\u00cf\u0005\u000b\u0000\u0000\u00cf\u00d0\u0005"+
		"\f\u0000\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d2\u0005\r\u0000"+
		"\u0000\u00d2\u00d3\u0006\u0012\uffff\uffff\u0000\u00d3%\u0001\u0000\u0000"+
		"\u0000\u00d4\u00da\u0006\u0013\uffff\uffff\u0000\u00d5\u00d6\u0003(\u0014"+
		"\u0000\u00d6\u00d7\u0003&\u0013\u0000\u00d7\u00d8\u0006\u0013\uffff\uffff"+
		"\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00da\'\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0003*\u0015\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd"+
		"\u00de\u0006\u0014\uffff\uffff\u0000\u00de\u00f4\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u00034\u001a\u0000\u00e0\u00e1\u0005\u0004\u0000\u0000\u00e1"+
		"\u00e2\u0006\u0014\uffff\uffff\u0000\u00e2\u00f4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0003\u0010\b\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5"+
		"\u00e6\u0006\u0014\uffff\uffff\u0000\u00e6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0003<\u001e\u0000\u00e8\u00e9\u0006\u0014\uffff\uffff\u0000"+
		"\u00e9\u00f4\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003B!\u0000\u00eb\u00ec"+
		"\u0006\u0014\uffff\uffff\u0000\u00ec\u00f4\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0003F#\u0000\u00ee\u00ef\u0006\u0014\uffff\uffff\u0000\u00ef\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003D\"\u0000\u00f1\u00f2\u0006"+
		"\u0014\uffff\uffff\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00db"+
		"\u0001\u0000\u0000\u0000\u00f3\u00df\u0001\u0000\u0000\u0000\u00f3\u00e3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000\u0000\u00f3\u00ea"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f4)\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\"\u0000\u0000\u00f6\u00f7\u0005\u001b\u0000\u0000\u00f7\u00f8\u0003,"+
		"\u0016\u0000\u00f8+\u0001\u0000\u0000\u0000\u00f9\u00fa\u00032\u0019\u0000"+
		"\u00fa\u00fb\u0003.\u0017\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u00030\u0018\u0000\u00fd\u00fe\u00032\u0019\u0000\u00fe\u00ff\u0003."+
		"\u0017\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102/\u0001\u0000\u0000\u0000\u0103\u0104\u0007\u0000\u0000"+
		"\u0000\u01041\u0001\u0000\u0000\u0000\u0105\u010c\u0003\f\u0006\u0000"+
		"\u0106\u0107\u0005\f\u0000\u0000\u0107\u0108\u0003,\u0016\u0000\u0108"+
		"\u0109\u0005\r\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u010c"+
		"\u00034\u001a\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0106\u0001"+
		"\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c3\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\"\u0000\u0000\u010e\u0112\u00036\u001b"+
		"\u0000\u010f\u0110\u0005!\u0000\u0000\u0110\u0112\u00036\u001b\u0000\u0111"+
		"\u010d\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"5\u0001\u0000\u0000\u0000\u0113\u0114\u0005\f\u0000\u0000\u0114\u0115"+
		"\u00038\u001c\u0000\u0115\u0116\u0005\r\u0000\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0113\u0001"+
		"\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u01197\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0003,\u0016\u0000\u011b\u011c\u0003:\u001d\u0000"+
		"\u011c9\u0001\u0000\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e"+
		"\u0121\u00038\u001c\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011d"+
		"\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121;\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005\u000e\u0000\u0000\u0123\u0124\u0003"+
		"J%\u0000\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0126\u0003&\u0013"+
		"\u0000\u0126\u0127\u0005\u0002\u0000\u0000\u0127\u0128\u0003>\u001f\u0000"+
		"\u0128=\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u000f\u0000\u0000\u012a"+
		"\u012d\u0003@ \u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d?\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005\u0001\u0000\u0000\u012f\u0130\u0003&\u0013"+
		"\u0000\u0130\u0131\u0005\u0002\u0000\u0000\u0131\u013a\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005\u000e\u0000\u0000\u0133\u0134\u0003J%\u0000\u0134"+
		"\u0135\u0005\u0001\u0000\u0000\u0135\u0136\u0003&\u0013\u0000\u0136\u0137"+
		"\u0005\u0002\u0000\u0000\u0137\u0138\u0003>\u001f\u0000\u0138\u013a\u0001"+
		"\u0000\u0000\u0000\u0139\u012e\u0001\u0000\u0000\u0000\u0139\u0132\u0001"+
		"\u0000\u0000\u0000\u013aA\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0010"+
		"\u0000\u0000\u013c\u013d\u0005\f\u0000\u0000\u013d\u013e\u0003J%\u0000"+
		"\u013e\u013f\u0005\r\u0000\u0000\u013f\u0140\u0005\u0001\u0000\u0000\u0140"+
		"\u0141\u0003&\u0013\u0000\u0141\u0142\u0005\u0002\u0000\u0000\u0142C\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u0011\u0000\u0000\u0144\u0145\u0005"+
		"\u0001\u0000\u0000\u0145\u0146\u0003&\u0013\u0000\u0146\u0147\u0005\u0002"+
		"\u0000\u0000\u0147\u0148\u0005\u0010\u0000\u0000\u0148\u0149\u0005\f\u0000"+
		"\u0000\u0149\u014a\u0003J%\u0000\u014a\u014b\u0005\r\u0000\u0000\u014b"+
		"\u014c\u0005\u0004\u0000\u0000\u014cE\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005\u0012\u0000\u0000\u014e\u014f\u0005\f\u0000\u0000\u014f\u0150\u0003"+
		"H$\u0000\u0150G\u0001\u0000\u0000\u0000\u0151\u0152\u0003\u0010\b\u0000"+
		"\u0152\u0153\u0005\u0004\u0000\u0000\u0153\u0154\u0003J%\u0000\u0154\u0155"+
		"\u0005\u0004\u0000\u0000\u0155\u0156\u0003*\u0015\u0000\u0156\u0157\u0005"+
		"\r\u0000\u0000\u0157\u0158\u0005\u0001\u0000\u0000\u0158\u0159\u0003&"+
		"\u0013\u0000\u0159\u015a\u0005\u0002\u0000\u0000\u015a\u0166\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0003*\u0015\u0000\u015c\u015d\u0005\u0004\u0000"+
		"\u0000\u015d\u015e\u0003J%\u0000\u015e\u015f\u0005\u0004\u0000\u0000\u015f"+
		"\u0160\u0003*\u0015\u0000\u0160\u0161\u0005\r\u0000\u0000\u0161\u0162"+
		"\u0005\u0001\u0000\u0000\u0162\u0163\u0003&\u0013\u0000\u0163\u0164\u0005"+
		"\u0002\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0151\u0001"+
		"\u0000\u0000\u0000\u0165\u015b\u0001\u0000\u0000\u0000\u0166I\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0003P(\u0000\u0168\u0169\u0003L&\u0000\u0169"+
		"K\u0001\u0000\u0000\u0000\u016a\u016b\u0003N\'\u0000\u016b\u016c\u0003"+
		"P(\u0000\u016c\u016d\u0003L&\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170M\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0007\u0001\u0000\u0000\u0172O\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0003,\u0016\u0000\u0174\u0175\u0003R)\u0000\u0175\u0176\u0003,\u0016"+
		"\u0000\u0176\u017e\u0001\u0000\u0000\u0000\u0177\u0178\u0005\f\u0000\u0000"+
		"\u0178\u0179\u0003J%\u0000\u0179\u017a\u0005\r\u0000\u0000\u017a\u017e"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0015\u0000\u0000\u017c\u017e"+
		"\u0003P(\u0000\u017d\u0173\u0001\u0000\u0000\u0000\u017d\u0177\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017eQ\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0007\u0002\u0000\u0000\u0180S\u0001\u0000\u0000\u0000"+
		"\u0015^es\u0080\u0090\u009e\u00ad\u00c2\u00cb\u00d9\u00f3\u0101\u010b"+
		"\u0111\u0118\u0120\u012c\u0139\u0165\u016f\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}