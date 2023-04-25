// Generated from java-escape by ANTLR 4.11.1

    import java.util.*;

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
		TIMES=30, DIV=31, MOD=32, RETURN=33, CONST_DEF_IDENTIFIER=34, IDENTIFIER=35, 
		NUMERIC_INTEGER_CONST=36, NUMERIC_REAL_CONST=37, MIXED_REAL=38, FIXED_POINT=39, 
		INITIAL_POINT=40, EXPONENTIAL=41, STRING_CONST=42, DOUBLE=43, SIMPLE=44, 
		COMMENT=45, ONE_LINE=46, IGNORE=47, MULTIPLE_LINE=48;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_funlist = 2, RULE_sentlist = 3, 
		RULE_dcl = 4, RULE_ctelist = 5, RULE_simpvalue = 6, RULE_varlist = 7, 
		RULE_vardef = 8, RULE_vardef2 = 9, RULE_tbas = 10, RULE_tvoid = 11, RULE_struct = 12, 
		RULE_varlist2 = 13, RULE_funcdef = 14, RULE_funchead = 15, RULE_typedef1 = 16, 
		RULE_typedef2_tail = 17, RULE_mainhead = 18, RULE_code = 19, RULE_sent = 20, 
		RULE_aux = 21, RULE_asig = 22, RULE_mireturn = 23, RULE_exp = 24, RULE_exp1 = 25, 
		RULE_op = 26, RULE_factor = 27, RULE_funccall = 28, RULE_subpparamlist = 29, 
		RULE_explist = 30, RULE_explist1 = 31, RULE_miif = 32, RULE_mielse = 33, 
		RULE_else1 = 34, RULE_miwhile = 35, RULE_midowhile = 36, RULE_mifor = 37, 
		RULE_for1 = 38, RULE_expcond = 39, RULE_expcond_tail = 40, RULE_oplog = 41, 
		RULE_factorcond = 42, RULE_opcomp = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "funlist", "sentlist", "dcl", "ctelist", "simpvalue", 
			"varlist", "vardef", "vardef2", "tbas", "tvoid", "struct", "varlist2", 
			"funcdef", "funchead", "typedef1", "typedef2_tail", "mainhead", "code", 
			"sent", "aux", "asig", "mireturn", "exp", "exp1", "op", "factor", "funccall", 
			"subpparamlist", "explist", "explist1", "miif", "mielse", "else1", "miwhile", 
			"midowhile", "mifor", "for1", "expcond", "expcond_tail", "oplog", "factorcond", 
			"opcomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'#define'", "';'", "'integer'", "'float'", "'string'", 
			"'void'", "'struct'", "','", "'Main'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'do'", "'for'", "'&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "DEFINE", "SEMICOLON", "INTEGER", "FLOAT", 
			"STRING", "VOID", "STRUCT", "COMMA", "MAIN", "LPARENTHESIS", "RPARENTHESIS", 
			"IF", "ELSE", "WHILE", "DO", "FOR", "AND", "OR", "NOT", "SMORE", "SLESS", 
			"SMOREE", "SLESSE", "SEQUAL", "SASIGN", "PLUS", "LESS", "TIMES", "DIV", 
			"MOD", "RETURN", "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
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



	    HashMap<String, String> tablaSimbolos = new HashMap<>();

	       public String addSimbolo(String bloque, String funcion, String nombre){
	           if (!bloque.equals("no")){
	               if (funcion.equals("")){
	                   tablaSimbolos.put(nombre, bloque+":"+nombre);
	                   return "<A NAME=\""+ bloque+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
	               }else{
	                   tablaSimbolos.put(funcion+":"+nombre, bloque+":"+funcion+":"+nombre);
	                   return "<A NAME=\""+ bloque+":"+funcion+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
	               }}
	           return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
	       }

	   public String getSimbolo(String funcion, String nombre){
	        if (tablaSimbolos.containsKey(funcion+":"+nombre)){
	            return "<A HREF=\"#" + tablaSimbolos.get(funcion+":"+nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
	        }else if (tablaSimbolos.containsKey(nombre)){
	            return "<A HREF=\"#" + tablaSimbolos.get(nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
	        }else{
	            return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
	        }

	    }

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
			setState(88);
			((ProgramContext)_localctx).dcllist = dcllist();
			setState(89);
			((ProgramContext)_localctx).funlist = funlist();
			setState(90);
			((ProgramContext)_localctx).sentlist = sentlist();
			System.out.println("<UL>\n<LI><A HREF=\"#Programa Principal\">Programa Principal</A></LI>\n"+((ProgramContext)_localctx).funlist.headers + "</UL>\n</body>\n<hr/>\n" + ((ProgramContext)_localctx).funlist.bodys);
					                                    System.out.println("<A NAME=\"Programa Principal\"><H2>Programa Principal</H2></A>\n\n<code>\n" + ((ProgramContext)_localctx).dcllist.text + "</code>\n<br/>\n");
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
			setState(98);
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
				setState(94);
				((DcllistContext)_localctx).dcl = dcl();
				setState(95);
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
			setState(105);
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
				setState(101);
				((FunlistContext)_localctx).funcdef = funcdef();
				setState(102);
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
			setState(107);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(108);
			((SentlistContext)_localctx).LBRACE = match(LBRACE);
			setState(109);
			((SentlistContext)_localctx).code = code("Programa principal", "Main");
			setState(110);
			((SentlistContext)_localctx).RBRACE = match(RBRACE);
			((SentlistContext)_localctx).text = "<A NAME=\"Main\"></A>\n<code>\n"+((SentlistContext)_localctx).mainhead.text+"\n"+  "<br/>" + (((SentlistContext)_localctx).LBRACE!=null?((SentlistContext)_localctx).LBRACE.getText():null) +"\n"+ ((SentlistContext)_localctx).code.text + (((SentlistContext)_localctx).RBRACE!=null?((SentlistContext)_localctx).RBRACE.getText():null) +"\n\n<br/>\n</code>\n"+
			"<A HREF=\"#Programa Principal\">Inicio del programa principal</A>\n<A HREF=\"#inicio\">Inicio del programa</A><hr/>";
			}
		}
		catch (RecognitionException re) {
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((DclContext)_localctx).ctelist = ctelist("Programa principal", "");
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
				setState(116);
				((DclContext)_localctx).varlist = varlist("Programa principal", "");
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
		public String bloque;
		public String funcion;
		public String text;
		public Token DEFINE;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TerminalNode DEFINE() { return getToken(PracticaParser.DEFINE, 0); }
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final CtelistContext ctelist(String bloque,String funcion) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 10, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((CtelistContext)_localctx).DEFINE = match(DEFINE);
			setState(122);
			((CtelistContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
			setState(123);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			((CtelistContext)_localctx).text =  "<SPAN CLASS=\"palres\">" +  (((CtelistContext)_localctx).DEFINE!=null?((CtelistContext)_localctx).DEFINE.getText():null) + "</SPAN> " + addSimbolo(_localctx.bloque, _localctx.funcion, (((CtelistContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtelistContext)_localctx).CONST_DEF_IDENTIFIER.getText():null)) + " " + ((CtelistContext)_localctx).simpvalue.text;
			}
		}
		catch (RecognitionException re) {
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).text =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) + "</SPAN>";
						
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).text =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
		public String bloque;
		public String funcion;
		public String text;
		public VardefContext vardef;
		public Token SEMICOLON;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final VarlistContext varlist(String bloque,String funcion) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 14, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((VarlistContext)_localctx).vardef = vardef(_localctx.bloque, _localctx.funcion);
			setState(135);
			((VarlistContext)_localctx).SEMICOLON = match(SEMICOLON);
			((VarlistContext)_localctx).text =  ((VarlistContext)_localctx).vardef.text + (((VarlistContext)_localctx).SEMICOLON!=null?((VarlistContext)_localctx).SEMICOLON.getText():null);
					
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
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
		public VardefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VardefContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final VardefContext vardef(String bloque,String funcion) throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 16, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((VardefContext)_localctx).tbas = tbas();
			setState(139);
			((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(140);
			((VardefContext)_localctx).vardef2 = vardef2();
			((VardefContext)_localctx).text =  ((VardefContext)_localctx).tbas.text + addSimbolo(_localctx.bloque, _localctx.funcion, (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null)) +  ((VardefContext)_localctx).vardef2.text;
			}
		}
		catch (RecognitionException re) {
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SASIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((Vardef2Context)_localctx).SASIGN = match(SASIGN);
				setState(144);
				((Vardef2Context)_localctx).simpvalue = simpvalue();
				((Vardef2Context)_localctx).text =  " " + (((Vardef2Context)_localctx).SASIGN!=null?((Vardef2Context)_localctx).SASIGN.getText():null)  + " " + ((Vardef2Context)_localctx).simpvalue.text;
						
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
		public String text;
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(INTEGER);
				((TbasContext)_localctx).type = "integer"; ((TbasContext)_localctx).text =  "<SPAN CLASS=\"palres\">integer</SPAN> " ;
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(FLOAT);
				((TbasContext)_localctx).type = "float"; ((TbasContext)_localctx).text =  "<SPAN CLASS=\"palres\">float</SPAN> " ;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(STRING);
				((TbasContext)_localctx).type = "string"; ((TbasContext)_localctx).text =  "<SPAN CLASS=\"palres\">string</SPAN> " ;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				((TbasContext)_localctx).tvoid = tvoid();
				((TbasContext)_localctx).type = ((TbasContext)_localctx).tvoid.type; ((TbasContext)_localctx).text =  ((TbasContext)_localctx).tvoid.text;
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				((TbasContext)_localctx).struct = struct();
				((TbasContext)_localctx).type = ((TbasContext)_localctx).struct.type; ((TbasContext)_localctx).text =  ((TbasContext)_localctx).struct.text;
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
		public String text;
		public Token VOID;
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
			setState(164);
			((TvoidContext)_localctx).VOID = match(VOID);
			((TvoidContext)_localctx).type = "void"; ((TvoidContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((TvoidContext)_localctx).VOID!=null?((TvoidContext)_localctx).VOID.getText():null) + "</SPAN> ";
			}
		}
		catch (RecognitionException re) {
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
		public String type;
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
			setState(167);
			((StructContext)_localctx).STRUCT = match(STRUCT);
			setState(168);
			((StructContext)_localctx).LBRACE = match(LBRACE);
			setState(169);
			((StructContext)_localctx).varlist = varlist("no","");
			setState(170);
			((StructContext)_localctx).varlist2 = varlist2();
			setState(171);
			((StructContext)_localctx).RBRACE = match(RBRACE);
			((StructContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((StructContext)_localctx).STRUCT!=null?((StructContext)_localctx).STRUCT.getText():null) + "</SPAN> " + "<br/>" + (((StructContext)_localctx).LBRACE!=null?((StructContext)_localctx).LBRACE.getText():null) +  "\n<DIV style=\"padding-left: 0.5cm\">" + ((StructContext)_localctx).varlist.text + "</DIV>\n" + ((StructContext)_localctx).varlist2.text + (((StructContext)_localctx).RBRACE!=null?((StructContext)_localctx).RBRACE.getText():null)  + "<br/>";
			((StructContext)_localctx).type =  (((StructContext)_localctx).STRUCT!=null?((StructContext)_localctx).STRUCT.getText():null) + " " + "<br/>" + (((StructContext)_localctx).LBRACE!=null?((StructContext)_localctx).LBRACE.getText():null)  + "\n<DIV style=\"padding-left: 0.5cm\">" + ((StructContext)_localctx).varlist.text + "</DIV>\n" + ((StructContext)_localctx).varlist2.text  + (((StructContext)_localctx).RBRACE!=null?((StructContext)_localctx).RBRACE.getText():null);

			}
		}
		catch (RecognitionException re) {
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
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((Varlist2Context)_localctx).varlist = varlist("no","");
				setState(175);
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
			setState(181);
			((FuncdefContext)_localctx).funchead = funchead("Funciones");
			setState(182);
			((FuncdefContext)_localctx).LBRACE = match(LBRACE);
			setState(183);
			((FuncdefContext)_localctx).code = code("Funciones", ((FuncdefContext)_localctx).funchead.name);
			setState(184);
			((FuncdefContext)_localctx).RBRACE = match(RBRACE);
			((FuncdefContext)_localctx).body = "<code>\n" + ((FuncdefContext)_localctx).funchead.text + "\n" + "<br/>" + (((FuncdefContext)_localctx).LBRACE!=null?((FuncdefContext)_localctx).LBRACE.getText():null) + "\n" + ((FuncdefContext)_localctx).code.text + (((FuncdefContext)_localctx).RBRACE!=null?((FuncdefContext)_localctx).RBRACE.getText():null) + "\n" + "<br/>\n</code>\n"
					+ "<A HREF=\"#Funciones:" + ((FuncdefContext)_localctx).funchead.name + "\">Inicio de la función</A>\n"
					+ "<A HREF=\"#inicio\">Inicio del programa</A>\n"+
					"<hr/>\n\n";
					((FuncdefContext)_localctx).header =  "<LI><A HREF=\"#Funciones:" + ((FuncdefContext)_localctx).funchead.name + "\">"+ ((FuncdefContext)_localctx).funchead.header+"</A></LI>\n";
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
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
		public FuncheadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FuncheadContext(ParserRuleContext parent, int invokingState, String bloque) {
			super(parent, invokingState);
			this.bloque = bloque;
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

	public final FuncheadContext funchead(String bloque) throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState(), bloque);
		enterRule(_localctx, 30, RULE_funchead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((FuncheadContext)_localctx).tbas = tbas();
			setState(188);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(189);
			((FuncheadContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(190);
			((FuncheadContext)_localctx).typedef1 = typedef1(_localctx.bloque, (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null));
			setState(191);
			((FuncheadContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
			((FuncheadContext)_localctx).name =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null); ((FuncheadContext)_localctx).text =  ((FuncheadContext)_localctx).tbas.text + addSimbolo("Funciones", "", (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null)) +  (((FuncheadContext)_localctx).LPARENTHESIS!=null?((FuncheadContext)_localctx).LPARENTHESIS.getText():null) + ((FuncheadContext)_localctx).typedef1.text + (((FuncheadContext)_localctx).RPARENTHESIS!=null?((FuncheadContext)_localctx).RPARENTHESIS.getText():null);
					((FuncheadContext)_localctx).header =  ((FuncheadContext)_localctx).tbas.type + " " + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) +  (((FuncheadContext)_localctx).LPARENTHESIS!=null?((FuncheadContext)_localctx).LPARENTHESIS.getText():null) + ((FuncheadContext)_localctx).typedef1.header +  (((FuncheadContext)_localctx).RPARENTHESIS!=null?((FuncheadContext)_localctx).RPARENTHESIS.getText():null);
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
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
		public Typedef1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef1Context(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final Typedef1Context typedef1(String bloque,String funcion) throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 32, RULE_typedef1);
		try {
			setState(200);
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
				setState(195);
				((Typedef1Context)_localctx).tbas = tbas();
				setState(196);
				((Typedef1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(197);
				((Typedef1Context)_localctx).typedef2_tail = typedef2_tail(_localctx.bloque, _localctx.funcion);
				((Typedef1Context)_localctx).text = ((Typedef1Context)_localctx).tbas.text + addSimbolo(_localctx.bloque, _localctx.funcion, (((Typedef1Context)_localctx).IDENTIFIER!=null?((Typedef1Context)_localctx).IDENTIFIER.getText():null)) + ((Typedef1Context)_localctx).typedef2_tail.text;
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
		public String bloque;
		public String funcion;
		public String text;
		public String header;
		public Token COMMA;
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
		public Typedef2_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef2_tailContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final Typedef2_tailContext typedef2_tail(String bloque,String funcion) throws RecognitionException {
		Typedef2_tailContext _localctx = new Typedef2_tailContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 34, RULE_typedef2_tail);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((Typedef2_tailContext)_localctx).COMMA = match(COMMA);
				setState(203);
				((Typedef2_tailContext)_localctx).tbas = tbas();
				setState(204);
				((Typedef2_tailContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(205);
				((Typedef2_tailContext)_localctx).typedef2_tail = typedef2_tail(_localctx.bloque, _localctx.funcion);
				((Typedef2_tailContext)_localctx).text = (((Typedef2_tailContext)_localctx).COMMA!=null?((Typedef2_tailContext)_localctx).COMMA.getText():null) + ((Typedef2_tailContext)_localctx).tbas.text + addSimbolo(_localctx.bloque, _localctx.funcion, (((Typedef2_tailContext)_localctx).IDENTIFIER!=null?((Typedef2_tailContext)_localctx).IDENTIFIER.getText():null)) + ((Typedef2_tailContext)_localctx).typedef2_tail.text;
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
			setState(211);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(212);
			match(MAIN);
			setState(213);
			((MainheadContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(214);
			((MainheadContext)_localctx).typedef1 = typedef1("Programa principal", "Main");
			setState(215);
			((MainheadContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
			((MainheadContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + ((MainheadContext)_localctx).tvoid.type + "</SPAN> " + addSimbolo("Programa principal", "", "Main") +  (((MainheadContext)_localctx).LPARENTHESIS!=null?((MainheadContext)_localctx).LPARENTHESIS.getText():null) + ((MainheadContext)_localctx).typedef1.text + (((MainheadContext)_localctx).RPARENTHESIS!=null?((MainheadContext)_localctx).RPARENTHESIS.getText():null);
					
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
		public String text;
		public SentContext sent;
		public CodeContext code;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final CodeContext code(String bloque,String funcion) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 38, RULE_code);
		try {
			setState(223);
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
			case RETURN:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((CodeContext)_localctx).sent = sent(_localctx.bloque, _localctx.funcion);
				setState(220);
				((CodeContext)_localctx).code = code(_localctx.bloque, _localctx.funcion);
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
		public String bloque;
		public String funcion;
		public String text;
		public Token IDENTIFIER;
		public AuxContext aux;
		public Token SEMICOLON;
		public Token CONST_DEF_IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public VardefContext vardef;
		public MiifContext miif;
		public MiwhileContext miwhile;
		public MiforContext mifor;
		public MidowhileContext midowhile;
		public MireturnContext mireturn;
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public AuxContext aux() {
			return getRuleContext(AuxContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
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
		public MireturnContext mireturn() {
			return getRuleContext(MireturnContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final SentContext sent(String bloque,String funcion) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(226);
				((SentContext)_localctx).aux = aux(_localctx.funcion);
				setState(227);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  getSimbolo(_localctx.funcion, (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null)) + ((SentContext)_localctx).aux.text + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null);
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((SentContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(231);
				((SentContext)_localctx).subpparamlist = subpparamlist(_localctx.funcion);
				setState(232);
				match(SEMICOLON);
				((SentContext)_localctx).text =  getSimbolo(_localctx.funcion, (((SentContext)_localctx).CONST_DEF_IDENTIFIER!=null?((SentContext)_localctx).CONST_DEF_IDENTIFIER.getText():null)) + ((SentContext)_localctx).subpparamlist.text;
				}
				break;
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				((SentContext)_localctx).vardef = vardef(_localctx.bloque, _localctx.funcion);
				setState(236);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  ((SentContext)_localctx).vardef.text + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				((SentContext)_localctx).miif = miif(_localctx.bloque, _localctx.funcion);
				((SentContext)_localctx).text =  ((SentContext)_localctx).miif.text;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				((SentContext)_localctx).miwhile = miwhile(_localctx.bloque, _localctx.funcion);
				((SentContext)_localctx).text = ((SentContext)_localctx).miwhile.text;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				((SentContext)_localctx).mifor = mifor(_localctx.bloque, _localctx.funcion);
				((SentContext)_localctx).text = ((SentContext)_localctx).mifor.text;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				((SentContext)_localctx).midowhile = midowhile(_localctx.bloque, _localctx.funcion);
				((SentContext)_localctx).text = ((SentContext)_localctx).midowhile.text;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				((SentContext)_localctx).mireturn = mireturn(_localctx.funcion);
				setState(252);
				((SentContext)_localctx).SEMICOLON = match(SEMICOLON);
				((SentContext)_localctx).text =  ((SentContext)_localctx).mireturn.text + (((SentContext)_localctx).SEMICOLON!=null?((SentContext)_localctx).SEMICOLON.getText():null);
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
	public static class AuxContext extends ParserRuleContext {
		public String funcion;
		public String text;
		public Token SASIGN;
		public ExpContext exp;
		public SubpparamlistContext subpparamlist;
		public TerminalNode SASIGN() { return getToken(PracticaParser.SASIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public AuxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AuxContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
		}
		@Override public int getRuleIndex() { return RULE_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxContext aux(String funcion) throws RecognitionException {
		AuxContext _localctx = new AuxContext(_ctx, getState(), funcion);
		enterRule(_localctx, 42, RULE_aux);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SASIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((AuxContext)_localctx).SASIGN = match(SASIGN);
				setState(258);
				((AuxContext)_localctx).exp = exp(_localctx.funcion);
				((AuxContext)_localctx).text = " " + (((AuxContext)_localctx).SASIGN!=null?((AuxContext)_localctx).SASIGN.getText():null) + " " + ((AuxContext)_localctx).exp.text;
				}
				break;
			case SEMICOLON:
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((AuxContext)_localctx).subpparamlist = subpparamlist(_localctx.funcion);
				((AuxContext)_localctx).text =  ((AuxContext)_localctx).subpparamlist.text;
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
	public static class AsigContext extends ParserRuleContext {
		public String funcion;
		public String text;
		public Token IDENTIFIER;
		public Token SASIGN;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public TerminalNode SASIGN() { return getToken(PracticaParser.SASIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AsigContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final AsigContext asig(String funcion) throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState(), funcion);
		enterRule(_localctx, 44, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(267);
			((AsigContext)_localctx).SASIGN = match(SASIGN);
			setState(268);
			((AsigContext)_localctx).exp = exp(_localctx.funcion);
			((AsigContext)_localctx).text =   getSimbolo(_localctx.funcion, (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null)) + " " + (((AsigContext)_localctx).SASIGN!=null?((AsigContext)_localctx).SASIGN.getText():null) + " " + ((AsigContext)_localctx).exp.text;
					
			}
		}
		catch (RecognitionException re) {
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
	public static class MireturnContext extends ParserRuleContext {
		public String funcion;
		public String text;
		public Token RETURN;
		public ExpContext exp;
		public TerminalNode RETURN() { return getToken(PracticaParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MireturnContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MireturnContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
		}
		@Override public int getRuleIndex() { return RULE_mireturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMireturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMireturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PracticaVisitor ) return ((PracticaVisitor<? extends T>)visitor).visitMireturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MireturnContext mireturn(String funcion) throws RecognitionException {
		MireturnContext _localctx = new MireturnContext(_ctx, getState(), funcion);
		enterRule(_localctx, 46, RULE_mireturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((MireturnContext)_localctx).RETURN = match(RETURN);
			setState(272);
			((MireturnContext)_localctx).exp = exp(_localctx.funcion);
			((MireturnContext)_localctx).text =  "<SPAN CLASS=\"palres\">" + (((MireturnContext)_localctx).RETURN!=null?((MireturnContext)_localctx).RETURN.getText():null) + "</SPAN> " + ((MireturnContext)_localctx).exp.text;
			}
		}
		catch (RecognitionException re) {
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
		public String funcion;
		public String text;
		public FactorContext factor;
		public Exp1Context exp1;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final ExpContext exp(String funcion) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), funcion);
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((ExpContext)_localctx).factor = factor(_localctx.funcion);
			setState(276);
			((ExpContext)_localctx).exp1 = exp1(_localctx.funcion);
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
		public String funcion;
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
		public Exp1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp1Context(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final Exp1Context exp1(String funcion) throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState(), funcion);
		enterRule(_localctx, 50, RULE_exp1);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case LESS:
			case TIMES:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				((Exp1Context)_localctx).op = op();
				setState(280);
				((Exp1Context)_localctx).factor = factor(_localctx.funcion);
				setState(281);
				((Exp1Context)_localctx).exp1 = exp1(_localctx.funcion);
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
		enterRule(_localctx, 52, RULE_op);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((OpContext)_localctx).PLUS = match(PLUS);
				((OpContext)_localctx).text =  " " + (((OpContext)_localctx).PLUS!=null?((OpContext)_localctx).PLUS.getText():null) + " ";
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				((OpContext)_localctx).LESS = match(LESS);
				((OpContext)_localctx).text =  " " + (((OpContext)_localctx).LESS!=null?((OpContext)_localctx).LESS.getText():null) + " ";
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				((OpContext)_localctx).TIMES = match(TIMES);
				((OpContext)_localctx).text =  " " + (((OpContext)_localctx).TIMES!=null?((OpContext)_localctx).TIMES.getText():null) + " ";
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				((OpContext)_localctx).DIV = match(DIV);
				((OpContext)_localctx).text =  " " + (((OpContext)_localctx).DIV!=null?((OpContext)_localctx).DIV.getText():null) + " ";
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				((OpContext)_localctx).MOD = match(MOD);
				((OpContext)_localctx).text =  " " + (((OpContext)_localctx).MOD!=null?((OpContext)_localctx).MOD.getText():null) + " ";
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
		public String funcion;
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
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final FactorContext factor(String funcion) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), funcion);
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).text =  ((FactorContext)_localctx).simpvalue.text;
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				((FactorContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(303);
				((FactorContext)_localctx).exp = exp(_localctx.funcion);
				setState(304);
				((FactorContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((FactorContext)_localctx).text =  (((FactorContext)_localctx).LPARENTHESIS!=null?((FactorContext)_localctx).LPARENTHESIS.getText():null) + ((FactorContext)_localctx).exp.text + (((FactorContext)_localctx).RPARENTHESIS!=null?((FactorContext)_localctx).RPARENTHESIS.getText():null);
						
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				((FactorContext)_localctx).funccall = funccall(_localctx.funcion);
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
		public String funcion;
		public String text;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public Token CONST_DEF_IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PracticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(PracticaParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunccallContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final FunccallContext funccall(String funcion) throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState(), funcion);
		enterRule(_localctx, 56, RULE_funccall);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(313);
				((FunccallContext)_localctx).subpparamlist = subpparamlist(_localctx.funcion);
				((FunccallContext)_localctx).text =   getSimbolo(_localctx.funcion, (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null)) + ((FunccallContext)_localctx).subpparamlist.text;
						
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(317);
				((FunccallContext)_localctx).subpparamlist = subpparamlist(_localctx.funcion);
				((FunccallContext)_localctx).text =  getSimbolo(_localctx.funcion, (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null)) + ((FunccallContext)_localctx).subpparamlist.text;
						
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
		public String funcion;
		public String text;
		public Token LPARENTHESIS;
		public ExplistContext explist;
		public Token RPARENTHESIS;
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PracticaParser.RPARENTHESIS, 0); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final SubpparamlistContext subpparamlist(String funcion) throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState(), funcion);
		enterRule(_localctx, 58, RULE_subpparamlist);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				((SubpparamlistContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(323);
				((SubpparamlistContext)_localctx).explist = explist(_localctx.funcion);
				setState(324);
				((SubpparamlistContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((SubpparamlistContext)_localctx).text =  (((SubpparamlistContext)_localctx).LPARENTHESIS!=null?((SubpparamlistContext)_localctx).LPARENTHESIS.getText():null) + ((SubpparamlistContext)_localctx).explist.text + (((SubpparamlistContext)_localctx).RPARENTHESIS!=null?((SubpparamlistContext)_localctx).RPARENTHESIS.getText():null);
						
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
		public String funcion;
		public String text;
		public ExpContext exp;
		public Explist1Context explist1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist1Context explist1() {
			return getRuleContext(Explist1Context.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final ExplistContext explist(String funcion) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), funcion);
		enterRule(_localctx, 60, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((ExplistContext)_localctx).exp = exp(_localctx.funcion);
			setState(331);
			((ExplistContext)_localctx).explist1 = explist1(_localctx.funcion);
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
		public String funcion;
		public String text;
		public Token COMMA;
		public ExplistContext explist;
		public TerminalNode COMMA() { return getToken(PracticaParser.COMMA, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Explist1Context(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final Explist1Context explist1(String funcion) throws RecognitionException {
		Explist1Context _localctx = new Explist1Context(_ctx, getState(), funcion);
		enterRule(_localctx, 62, RULE_explist1);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				((Explist1Context)_localctx).COMMA = match(COMMA);
				setState(335);
				((Explist1Context)_localctx).explist = explist(_localctx.funcion);
				((Explist1Context)_localctx).text =  (((Explist1Context)_localctx).COMMA!=null?((Explist1Context)_localctx).COMMA.getText():null) + " " + ((Explist1Context)_localctx).explist.text;
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
		public String bloque;
		public String funcion;
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
		public MiifContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MiifContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final MiifContext miif(String bloque,String funcion) throws RecognitionException {
		MiifContext _localctx = new MiifContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 64, RULE_miif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			((MiifContext)_localctx).IF = match(IF);
			setState(342);
			((MiifContext)_localctx).expcond = expcond(_localctx.funcion);
			setState(343);
			((MiifContext)_localctx).LBRACE = match(LBRACE);
			setState(344);
			((MiifContext)_localctx).code = code(_localctx.bloque, _localctx.funcion);
			setState(345);
			((MiifContext)_localctx).RBRACE = match(RBRACE);
			setState(346);
			((MiifContext)_localctx).mielse = mielse(_localctx.bloque, _localctx.funcion);
			((MiifContext)_localctx).text = "<SPAN CLASS=\"palres\">" + (((MiifContext)_localctx).IF!=null?((MiifContext)_localctx).IF.getText():null) + "</SPAN> " + ((MiifContext)_localctx).expcond.text +
			"\n" + "<br/>" + (((MiifContext)_localctx).LBRACE!=null?((MiifContext)_localctx).LBRACE.getText():null) +  "\n" + ((MiifContext)_localctx).code.text + (((MiifContext)_localctx).RBRACE!=null?((MiifContext)_localctx).RBRACE.getText():null) + "\n" + "<br/>\n"  + "\n" + ((MiifContext)_localctx).mielse.text;
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
		public String text;
		public Token ELSE;
		public Else1Context else1;
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
		public Else1Context else1() {
			return getRuleContext(Else1Context.class,0);
		}
		public MielseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MielseContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final MielseContext mielse(String bloque,String funcion) throws RecognitionException {
		MielseContext _localctx = new MielseContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 66, RULE_mielse);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((MielseContext)_localctx).ELSE = match(ELSE);
				setState(350);
				((MielseContext)_localctx).else1 = else1(_localctx.bloque, _localctx.funcion);
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
			case RETURN:
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
		public String bloque;
		public String funcion;
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
		public Else1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else1Context(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final Else1Context else1(String bloque,String funcion) throws RecognitionException {
		Else1Context _localctx = new Else1Context(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 68, RULE_else1);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((Else1Context)_localctx).LBRACE = match(LBRACE);
				setState(357);
				((Else1Context)_localctx).code = code(_localctx.bloque, _localctx.funcion);
				setState(358);
				((Else1Context)_localctx).RBRACE = match(RBRACE);
				((Else1Context)_localctx).text =  "<br/>" + (((Else1Context)_localctx).LBRACE!=null?((Else1Context)_localctx).LBRACE.getText():null) + ((Else1Context)_localctx).code.text + (((Else1Context)_localctx).RBRACE!=null?((Else1Context)_localctx).RBRACE.getText():null) + "\n" + "<br/>\n"  + "\n";
						
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((Else1Context)_localctx).miif = miif(_localctx.bloque, _localctx.funcion);
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
		public String bloque;
		public String funcion;
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
		public MiwhileContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MiwhileContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final MiwhileContext miwhile(String bloque,String funcion) throws RecognitionException {
		MiwhileContext _localctx = new MiwhileContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 70, RULE_miwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((MiwhileContext)_localctx).WHILE = match(WHILE);
			setState(367);
			((MiwhileContext)_localctx).expcond = expcond(_localctx.funcion);
			setState(368);
			((MiwhileContext)_localctx).LBRACE = match(LBRACE);
			setState(369);
			((MiwhileContext)_localctx).code = code(_localctx.bloque, _localctx.funcion);
			setState(370);
			((MiwhileContext)_localctx).RBRACE = match(RBRACE);
			((MiwhileContext)_localctx).text = "<SPAN CLASS=\"palres\">" + (((MiwhileContext)_localctx).WHILE!=null?((MiwhileContext)_localctx).WHILE.getText():null) + "</SPAN> " + ((MiwhileContext)_localctx).expcond.text +
			                                     "\n" + "<br/>" + (((MiwhileContext)_localctx).LBRACE!=null?((MiwhileContext)_localctx).LBRACE.getText():null) +  "\n" + ((MiwhileContext)_localctx).code.text + (((MiwhileContext)_localctx).RBRACE!=null?((MiwhileContext)_localctx).RBRACE.getText():null) + "\n" + "<br/>\n"  + "\n";
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
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
		public MidowhileContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MidowhileContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final MidowhileContext midowhile(String bloque,String funcion) throws RecognitionException {
		MidowhileContext _localctx = new MidowhileContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 72, RULE_midowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((MidowhileContext)_localctx).DO = match(DO);
			setState(374);
			((MidowhileContext)_localctx).LBRACE = match(LBRACE);
			setState(375);
			((MidowhileContext)_localctx).code = code(_localctx.bloque, _localctx.funcion);
			setState(376);
			((MidowhileContext)_localctx).RBRACE = match(RBRACE);
			setState(377);
			((MidowhileContext)_localctx).WHILE = match(WHILE);
			setState(378);
			((MidowhileContext)_localctx).expcond = expcond(_localctx.funcion);
			setState(379);
			((MidowhileContext)_localctx).SEMICOLON = match(SEMICOLON);
			((MidowhileContext)_localctx).text =  _localctx.text ="<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).DO!=null?((MidowhileContext)_localctx).DO.getText():null) + "</SPAN>" + "\n" + "<br/>" + (((MidowhileContext)_localctx).LBRACE!=null?((MidowhileContext)_localctx).LBRACE.getText():null) +  "\n" + ((MidowhileContext)_localctx).code.text + (((MidowhileContext)_localctx).RBRACE!=null?((MidowhileContext)_localctx).RBRACE.getText():null) + "\n" + "<SPAN CLASS=\"palres\">" + (((MidowhileContext)_localctx).WHILE!=null?((MidowhileContext)_localctx).WHILE.getText():null) + "</SPAN> " + ((MidowhileContext)_localctx).expcond.text + (((MidowhileContext)_localctx).SEMICOLON!=null?((MidowhileContext)_localctx).SEMICOLON.getText():null);
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
		public String text;
		public Token FOR;
		public Token LPARENTHESIS;
		public For1Context for1;
		public TerminalNode FOR() { return getToken(PracticaParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PracticaParser.LPARENTHESIS, 0); }
		public For1Context for1() {
			return getRuleContext(For1Context.class,0);
		}
		public MiforContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MiforContext(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final MiforContext mifor(String bloque,String funcion) throws RecognitionException {
		MiforContext _localctx = new MiforContext(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 74, RULE_mifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((MiforContext)_localctx).FOR = match(FOR);
			setState(383);
			((MiforContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
			setState(384);
			((MiforContext)_localctx).for1 = for1(_localctx.bloque, _localctx.funcion);
			((MiforContext)_localctx).text =  _localctx.text ="<SPAN CLASS=\"palres\">" + (((MiforContext)_localctx).FOR!=null?((MiforContext)_localctx).FOR.getText():null) + "</SPAN>" + (((MiforContext)_localctx).LPARENTHESIS!=null?((MiforContext)_localctx).LPARENTHESIS.getText():null) + ((MiforContext)_localctx).for1.text;
			}
		}
		catch (RecognitionException re) {
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
		public String bloque;
		public String funcion;
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
		public For1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For1Context(ParserRuleContext parent, int invokingState, String bloque, String funcion) {
			super(parent, invokingState);
			this.bloque = bloque;
			this.funcion = funcion;
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

	public final For1Context for1(String bloque,String funcion) throws RecognitionException {
		For1Context _localctx = new For1Context(_ctx, getState(), bloque, funcion);
		enterRule(_localctx, 76, RULE_for1);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case STRING:
			case VOID:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				((For1Context)_localctx).vardef = vardef(_localctx.bloque, _localctx.funcion);
				setState(388);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(389);
				((For1Context)_localctx).expcond = expcond(_localctx.funcion);
				setState(390);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(391);
				((For1Context)_localctx).asig = asig(_localctx.funcion);
				setState(392);
				((For1Context)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				setState(393);
				((For1Context)_localctx).LBRACE = match(LBRACE);
				setState(394);
				((For1Context)_localctx).code = code(_localctx.bloque, _localctx.funcion);
				setState(395);
				((For1Context)_localctx).RBRACE = match(RBRACE);
				((For1Context)_localctx).text =  ((For1Context)_localctx).vardef.text + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + " " + ((For1Context)_localctx).expcond.text + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + " " + ((For1Context)_localctx).asig.text + (((For1Context)_localctx).RPARENTHESIS!=null?((For1Context)_localctx).RPARENTHESIS.getText():null) + "<br/>" + (((For1Context)_localctx).LBRACE!=null?((For1Context)_localctx).LBRACE.getText():null) +  "\n" + ((For1Context)_localctx).code.text + (((For1Context)_localctx).RBRACE!=null?((For1Context)_localctx).RBRACE.getText():null);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((For1Context)_localctx).asig = asig(_localctx.funcion);
				setState(399);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(400);
				((For1Context)_localctx).expcond = expcond(_localctx.funcion);
				setState(401);
				((For1Context)_localctx).SEMICOLON = match(SEMICOLON);
				setState(402);
				((For1Context)_localctx).asig = asig(_localctx.funcion);
				setState(403);
				((For1Context)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				setState(404);
				((For1Context)_localctx).LBRACE = match(LBRACE);
				setState(405);
				((For1Context)_localctx).code = code(_localctx.bloque, _localctx.funcion);
				setState(406);
				((For1Context)_localctx).RBRACE = match(RBRACE);
				((For1Context)_localctx).text =  ((For1Context)_localctx).asig.text + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + " " + ((For1Context)_localctx).expcond.text + (((For1Context)_localctx).SEMICOLON!=null?((For1Context)_localctx).SEMICOLON.getText():null) + " " + ((For1Context)_localctx).asig.text + (((For1Context)_localctx).RPARENTHESIS!=null?((For1Context)_localctx).RPARENTHESIS.getText():null) + "<br/>" + (((For1Context)_localctx).LBRACE!=null?((For1Context)_localctx).LBRACE.getText():null) +  "\n" + ((For1Context)_localctx).code.text + (((For1Context)_localctx).RBRACE!=null?((For1Context)_localctx).RBRACE.getText():null);
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
		public String funcion;
		public String text;
		public FactorcondContext factorcond;
		public Expcond_tailContext expcond_tail;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_tailContext expcond_tail() {
			return getRuleContext(Expcond_tailContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final ExpcondContext expcond(String funcion) throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState(), funcion);
		enterRule(_localctx, 78, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			((ExpcondContext)_localctx).factorcond = factorcond(_localctx.funcion);
			setState(412);
			((ExpcondContext)_localctx).expcond_tail = expcond_tail(_localctx.funcion);
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
		public String funcion;
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
		public Expcond_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond_tailContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final Expcond_tailContext expcond_tail(String funcion) throws RecognitionException {
		Expcond_tailContext _localctx = new Expcond_tailContext(_ctx, getState(), funcion);
		enterRule(_localctx, 80, RULE_expcond_tail);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((Expcond_tailContext)_localctx).oplog = oplog();
				setState(416);
				((Expcond_tailContext)_localctx).factorcond = factorcond(_localctx.funcion);
				setState(417);
				((Expcond_tailContext)_localctx).expcond_tail = expcond_tail(_localctx.funcion);
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
		enterRule(_localctx, 82, RULE_oplog);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				((OplogContext)_localctx).OR = match(OR);
				((OplogContext)_localctx).text =  " " + (((OplogContext)_localctx).OR!=null?((OplogContext)_localctx).OR.getText():null) + " ";
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				((OplogContext)_localctx).AND = match(AND);
				((OplogContext)_localctx).text =  " " + (((OplogContext)_localctx).AND!=null?((OplogContext)_localctx).AND.getText():null) + " ";
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
		public String funcion;
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
		public FactorcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorcondContext(ParserRuleContext parent, int invokingState, String funcion) {
			super(parent, invokingState);
			this.funcion = funcion;
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

	public final FactorcondContext factorcond(String funcion) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), funcion);
		enterRule(_localctx, 84, RULE_factorcond);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				((FactorcondContext)_localctx).e1 = exp(_localctx.funcion);
				setState(430);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(431);
				((FactorcondContext)_localctx).e2 = exp(_localctx.funcion);
				((FactorcondContext)_localctx).text =  ((FactorcondContext)_localctx).e1.text + ((FactorcondContext)_localctx).opcomp.text + ((FactorcondContext)_localctx).e2.text;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				((FactorcondContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(435);
				((FactorcondContext)_localctx).expcond = expcond(_localctx.funcion);
				setState(436);
				((FactorcondContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((FactorcondContext)_localctx).text =  (((FactorcondContext)_localctx).LPARENTHESIS!=null?((FactorcondContext)_localctx).LPARENTHESIS.getText():null) + ((FactorcondContext)_localctx).expcond.text + (((FactorcondContext)_localctx).RPARENTHESIS!=null?((FactorcondContext)_localctx).RPARENTHESIS.getText():null);
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				((FactorcondContext)_localctx).NOT = match(NOT);
				setState(440);
				((FactorcondContext)_localctx).factorcond = factorcond(_localctx.funcion);
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
		enterRule(_localctx, 86, RULE_opcomp);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SMORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				((OpcompContext)_localctx).SMORE = match(SMORE);
				((OpcompContext)_localctx).text =  " " + (((OpcompContext)_localctx).SMORE!=null?((OpcompContext)_localctx).SMORE.getText():null) + " ";
				}
				break;
			case SLESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				((OpcompContext)_localctx).SLESS = match(SLESS);
				((OpcompContext)_localctx).text =  " " + (((OpcompContext)_localctx).SLESS!=null?((OpcompContext)_localctx).SLESS.getText():null) + " ";
				}
				break;
			case SMOREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				((OpcompContext)_localctx).SMOREE = match(SMOREE);
				((OpcompContext)_localctx).text =  " " + (((OpcompContext)_localctx).SMOREE!=null?((OpcompContext)_localctx).SMOREE.getText():null) + " ";
				}
				break;
			case SLESSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				((OpcompContext)_localctx).SLESSE = match(SLESSE);
				((OpcompContext)_localctx).text =  " " + (((OpcompContext)_localctx).SLESSE!=null?((OpcompContext)_localctx).SLESSE.getText():null) + " ";
				}
				break;
			case SEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				((OpcompContext)_localctx).SEQUAL = match(SEQUAL);
				((OpcompContext)_localctx).text =  " " + (((OpcompContext)_localctx).SEQUAL!=null?((OpcompContext)_localctx).SEQUAL.getText():null) + " ";
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
		"\u0004\u00010\u01ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"x\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d2"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0100\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0109\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011e\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012a\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0137\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0141\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0149\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0154\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0163\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u016d\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u019a"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01a6\b(\u0001)\u0001)\u0001)\u0001)\u0003)\u01ac\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u01bc\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01c8\b+\u0001+\u0000\u0000"+
		",\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0000\u01c8\u0000X\u0001"+
		"\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000"+
		"\u0000\u0006k\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001"+
		"\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000"+
		"\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000"+
		"\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000"+
		"\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000"+
		"\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000"+
		"\u0000\u0000 \u00c8\u0001\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000"+
		"\u0000$\u00d3\u0001\u0000\u0000\u0000&\u00df\u0001\u0000\u0000\u0000("+
		"\u00ff\u0001\u0000\u0000\u0000*\u0108\u0001\u0000\u0000\u0000,\u010a\u0001"+
		"\u0000\u0000\u0000.\u010f\u0001\u0000\u0000\u00000\u0113\u0001\u0000\u0000"+
		"\u00002\u011d\u0001\u0000\u0000\u00004\u0129\u0001\u0000\u0000\u00006"+
		"\u0136\u0001\u0000\u0000\u00008\u0140\u0001\u0000\u0000\u0000:\u0148\u0001"+
		"\u0000\u0000\u0000<\u014a\u0001\u0000\u0000\u0000>\u0153\u0001\u0000\u0000"+
		"\u0000@\u0155\u0001\u0000\u0000\u0000B\u0162\u0001\u0000\u0000\u0000D"+
		"\u016c\u0001\u0000\u0000\u0000F\u016e\u0001\u0000\u0000\u0000H\u0175\u0001"+
		"\u0000\u0000\u0000J\u017e\u0001\u0000\u0000\u0000L\u0199\u0001\u0000\u0000"+
		"\u0000N\u019b\u0001\u0000\u0000\u0000P\u01a5\u0001\u0000\u0000\u0000R"+
		"\u01ab\u0001\u0000\u0000\u0000T\u01bb\u0001\u0000\u0000\u0000V\u01c7\u0001"+
		"\u0000\u0000\u0000XY\u0003\u0002\u0001\u0000YZ\u0003\u0004\u0002\u0000"+
		"Z[\u0003\u0006\u0003\u0000[\\\u0006\u0000\uffff\uffff\u0000\\\u0001\u0001"+
		"\u0000\u0000\u0000]c\u0006\u0001\uffff\uffff\u0000^_\u0003\b\u0004\u0000"+
		"_`\u0003\u0002\u0001\u0000`a\u0006\u0001\uffff\uffff\u0000ac\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000c\u0003"+
		"\u0001\u0000\u0000\u0000dj\u0006\u0002\uffff\uffff\u0000ef\u0003\u001c"+
		"\u000e\u0000fg\u0003\u0004\u0002\u0000gh\u0006\u0002\uffff\uffff\u0000"+
		"hj\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000"+
		"\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0003$\u0012\u0000lm\u0005\u0001"+
		"\u0000\u0000mn\u0003&\u0013\u0000no\u0005\u0002\u0000\u0000op\u0006\u0003"+
		"\uffff\uffff\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0003\n\u0005\u0000"+
		"rs\u0006\u0004\uffff\uffff\u0000sx\u0001\u0000\u0000\u0000tu\u0003\u000e"+
		"\u0007\u0000uv\u0006\u0004\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000"+
		"wq\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000x\t\u0001\u0000\u0000"+
		"\u0000yz\u0005\u0003\u0000\u0000z{\u0005\"\u0000\u0000{|\u0003\f\u0006"+
		"\u0000|}\u0006\u0005\uffff\uffff\u0000}\u000b\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005$\u0000\u0000\u007f\u0085\u0006\u0006\uffff\uffff\u0000\u0080"+
		"\u0081\u0005%\u0000\u0000\u0081\u0085\u0006\u0006\uffff\uffff\u0000\u0082"+
		"\u0083\u0005*\u0000\u0000\u0083\u0085\u0006\u0006\uffff\uffff\u0000\u0084"+
		"~\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"\u0010\b\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0006\u0007"+
		"\uffff\uffff\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0003"+
		"\u0014\n\u0000\u008b\u008c\u0005#\u0000\u0000\u008c\u008d\u0003\u0012"+
		"\t\u0000\u008d\u008e\u0006\b\uffff\uffff\u0000\u008e\u0011\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u001b\u0000\u0000\u0090\u0091\u0003\f\u0006"+
		"\u0000\u0091\u0092\u0006\t\uffff\uffff\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0006\t\uffff\uffff\u0000\u0094\u008f\u0001\u0000\u0000"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u00a3\u0006\n\uffff\uffff"+
		"\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099\u00a3\u0006\n\uffff\uffff"+
		"\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u00a3\u0006\n\uffff\uffff"+
		"\u0000\u009c\u009d\u0003\u0016\u000b\u0000\u009d\u009e\u0006\n\uffff\uffff"+
		"\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000"+
		"\u00a0\u00a1\u0006\n\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u0096\u0001\u0000\u0000\u0000\u00a2\u0098\u0001\u0000\u0000\u0000"+
		"\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000"+
		"\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0006\u000b\uffff\uffff\u0000"+
		"\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\t\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0001\u0000\u0000\u00a9\u00aa\u0003\u000e\u0007\u0000\u00aa"+
		"\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0005\u0002\u0000\u0000\u00ac\u00ad"+
		"\u0006\f\uffff\uffff\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0003\u000e\u0007\u0000\u00af\u00b0\u0003\u001a\r\u0000\u00b0\u00b1\u0006"+
		"\r\uffff\uffff\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4\u0006"+
		"\r\uffff\uffff\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u001b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003"+
		"\u001e\u000f\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\u00b8\u0003"+
		"&\u0013\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000\u00b9\u00ba\u0006\u000e"+
		"\uffff\uffff\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003"+
		"\u0014\n\u0000\u00bc\u00bd\u0005#\u0000\u0000\u00bd\u00be\u0005\f\u0000"+
		"\u0000\u00be\u00bf\u0003 \u0010\u0000\u00bf\u00c0\u0005\r\u0000\u0000"+
		"\u00c0\u00c1\u0006\u000f\uffff\uffff\u0000\u00c1\u001f\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c9\u0006\u0010\uffff\uffff\u0000\u00c3\u00c4\u0003\u0014"+
		"\n\u0000\u00c4\u00c5\u0005#\u0000\u0000\u00c5\u00c6\u0003\"\u0011\u0000"+
		"\u00c6\u00c7\u0006\u0010\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\n\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0014\n\u0000\u00cc\u00cd\u0005#\u0000\u0000\u00cd"+
		"\u00ce\u0003\"\u0011\u0000\u00ce\u00cf\u0006\u0011\uffff\uffff\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d2\u0006\u0011\uffff\uffff\u0000"+
		"\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0016\u000b\u0000\u00d4"+
		"\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0005\f\u0000\u0000\u00d6\u00d7"+
		"\u0003 \u0010\u0000\u00d7\u00d8\u0005\r\u0000\u0000\u00d8\u00d9\u0006"+
		"\u0012\uffff\uffff\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da\u00e0\u0006"+
		"\u0013\uffff\uffff\u0000\u00db\u00dc\u0003(\u0014\u0000\u00dc\u00dd\u0003"+
		"&\u0013\u0000\u00dd\u00de\u0006\u0013\uffff\uffff\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00df\u00db\u0001"+
		"\u0000\u0000\u0000\u00e0\'\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005#"+
		"\u0000\u0000\u00e2\u00e3\u0003*\u0015\u0000\u00e3\u00e4\u0005\u0004\u0000"+
		"\u0000\u00e4\u00e5\u0006\u0014\uffff\uffff\u0000\u00e5\u0100\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7\u00e8\u0003:\u001d"+
		"\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00ea\u0006\u0014\uffff"+
		"\uffff\u0000\u00ea\u0100\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003\u0010"+
		"\b\u0000\u00ec\u00ed\u0005\u0004\u0000\u0000\u00ed\u00ee\u0006\u0014\uffff"+
		"\uffff\u0000\u00ee\u0100\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003@ \u0000"+
		"\u00f0\u00f1\u0006\u0014\uffff\uffff\u0000\u00f1\u0100\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0003F#\u0000\u00f3\u00f4\u0006\u0014\uffff\uffff\u0000"+
		"\u00f4\u0100\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003J%\u0000\u00f6\u00f7"+
		"\u0006\u0014\uffff\uffff\u0000\u00f7\u0100\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0003H$\u0000\u00f9\u00fa\u0006\u0014\uffff\uffff\u0000\u00fa\u0100"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003.\u0017\u0000\u00fc\u00fd\u0005"+
		"\u0004\u0000\u0000\u00fd\u00fe\u0006\u0014\uffff\uffff\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00e1\u0001\u0000\u0000\u0000\u00ff\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ff\u00eb\u0001\u0000\u0000\u0000\u00ff\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ff\u00f2\u0001\u0000\u0000\u0000\u00ff\u00f5"+
		"\u0001\u0000\u0000\u0000\u00ff\u00f8\u0001\u0000\u0000\u0000\u00ff\u00fb"+
		"\u0001\u0000\u0000\u0000\u0100)\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"\u001b\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103\u0104\u0006\u0015"+
		"\uffff\uffff\u0000\u0104\u0109\u0001\u0000\u0000\u0000\u0105\u0106\u0003"+
		":\u001d\u0000\u0106\u0107\u0006\u0015\uffff\uffff\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0101\u0001\u0000\u0000\u0000\u0108\u0105\u0001"+
		"\u0000\u0000\u0000\u0109+\u0001\u0000\u0000\u0000\u010a\u010b\u0005#\u0000"+
		"\u0000\u010b\u010c\u0005\u001b\u0000\u0000\u010c\u010d\u00030\u0018\u0000"+
		"\u010d\u010e\u0006\u0016\uffff\uffff\u0000\u010e-\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005!\u0000\u0000\u0110\u0111\u00030\u0018\u0000\u0111\u0112"+
		"\u0006\u0017\uffff\uffff\u0000\u0112/\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u00036\u001b\u0000\u0114\u0115\u00032\u0019\u0000\u0115\u0116\u0006\u0018"+
		"\uffff\uffff\u0000\u01161\u0001\u0000\u0000\u0000\u0117\u0118\u00034\u001a"+
		"\u0000\u0118\u0119\u00036\u001b\u0000\u0119\u011a\u00032\u0019\u0000\u011a"+
		"\u011b\u0006\u0019\uffff\uffff\u0000\u011b\u011e\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0006\u0019\uffff\uffff\u0000\u011d\u0117\u0001\u0000\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e3\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005\u001c\u0000\u0000\u0120\u012a\u0006\u001a\uffff\uffff"+
		"\u0000\u0121\u0122\u0005\u001d\u0000\u0000\u0122\u012a\u0006\u001a\uffff"+
		"\uffff\u0000\u0123\u0124\u0005\u001e\u0000\u0000\u0124\u012a\u0006\u001a"+
		"\uffff\uffff\u0000\u0125\u0126\u0005\u001f\u0000\u0000\u0126\u012a\u0006"+
		"\u001a\uffff\uffff\u0000\u0127\u0128\u0005 \u0000\u0000\u0128\u012a\u0006"+
		"\u001a\uffff\uffff\u0000\u0129\u011f\u0001\u0000\u0000\u0000\u0129\u0121"+
		"\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a5\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0003\f\u0006\u0000\u012c\u012d\u0006\u001b"+
		"\uffff\uffff\u0000\u012d\u0137\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"\f\u0000\u0000\u012f\u0130\u00030\u0018\u0000\u0130\u0131\u0005\r\u0000"+
		"\u0000\u0131\u0132\u0006\u001b\uffff\uffff\u0000\u0132\u0137\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u00038\u001c\u0000\u0134\u0135\u0006\u001b\uffff"+
		"\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u012b\u0001\u0000"+
		"\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u0133\u0001\u0000"+
		"\u0000\u0000\u01377\u0001\u0000\u0000\u0000\u0138\u0139\u0005#\u0000\u0000"+
		"\u0139\u013a\u0003:\u001d\u0000\u013a\u013b\u0006\u001c\uffff\uffff\u0000"+
		"\u013b\u0141\u0001\u0000\u0000\u0000\u013c\u013d\u0005\"\u0000\u0000\u013d"+
		"\u013e\u0003:\u001d\u0000\u013e\u013f\u0006\u001c\uffff\uffff\u0000\u013f"+
		"\u0141\u0001\u0000\u0000\u0000\u0140\u0138\u0001\u0000\u0000\u0000\u0140"+
		"\u013c\u0001\u0000\u0000\u0000\u01419\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\f\u0000\u0000\u0143\u0144\u0003<\u001e\u0000\u0144\u0145\u0005"+
		"\r\u0000\u0000\u0145\u0146\u0006\u001d\uffff\uffff\u0000\u0146\u0149\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0006\u001d\uffff\uffff\u0000\u0148\u0142"+
		"\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149;\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u00030\u0018\u0000\u014b\u014c\u0003>\u001f"+
		"\u0000\u014c\u014d\u0006\u001e\uffff\uffff\u0000\u014d=\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150\u0003<\u001e\u0000"+
		"\u0150\u0151\u0006\u001f\uffff\uffff\u0000\u0151\u0154\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0006\u001f\uffff\uffff\u0000\u0153\u014e\u0001\u0000"+
		"\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154?\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005\u000e\u0000\u0000\u0156\u0157\u0003N\'\u0000"+
		"\u0157\u0158\u0005\u0001\u0000\u0000\u0158\u0159\u0003&\u0013\u0000\u0159"+
		"\u015a\u0005\u0002\u0000\u0000\u015a\u015b\u0003B!\u0000\u015b\u015c\u0006"+
		" \uffff\uffff\u0000\u015cA\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u000f"+
		"\u0000\u0000\u015e\u015f\u0003D\"\u0000\u015f\u0160\u0006!\uffff\uffff"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u0163\u0006!\uffff\uffff"+
		"\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0163C\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0001\u0000\u0000"+
		"\u0165\u0166\u0003&\u0013\u0000\u0166\u0167\u0005\u0002\u0000\u0000\u0167"+
		"\u0168\u0006\"\uffff\uffff\u0000\u0168\u016d\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0003@ \u0000\u016a\u016b\u0006\"\uffff\uffff\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016c\u0169"+
		"\u0001\u0000\u0000\u0000\u016dE\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0010\u0000\u0000\u016f\u0170\u0003N\'\u0000\u0170\u0171\u0005\u0001"+
		"\u0000\u0000\u0171\u0172\u0003&\u0013\u0000\u0172\u0173\u0005\u0002\u0000"+
		"\u0000\u0173\u0174\u0006#\uffff\uffff\u0000\u0174G\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0005\u0011\u0000\u0000\u0176\u0177\u0005\u0001\u0000\u0000"+
		"\u0177\u0178\u0003&\u0013\u0000\u0178\u0179\u0005\u0002\u0000\u0000\u0179"+
		"\u017a\u0005\u0010\u0000\u0000\u017a\u017b\u0003N\'\u0000\u017b\u017c"+
		"\u0005\u0004\u0000\u0000\u017c\u017d\u0006$\uffff\uffff\u0000\u017dI\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0005\u0012\u0000\u0000\u017f\u0180\u0005"+
		"\f\u0000\u0000\u0180\u0181\u0003L&\u0000\u0181\u0182\u0006%\uffff\uffff"+
		"\u0000\u0182K\u0001\u0000\u0000\u0000\u0183\u0184\u0003\u0010\b\u0000"+
		"\u0184\u0185\u0005\u0004\u0000\u0000\u0185\u0186\u0003N\'\u0000\u0186"+
		"\u0187\u0005\u0004\u0000\u0000\u0187\u0188\u0003,\u0016\u0000\u0188\u0189"+
		"\u0005\r\u0000\u0000\u0189\u018a\u0005\u0001\u0000\u0000\u018a\u018b\u0003"+
		"&\u0013\u0000\u018b\u018c\u0005\u0002\u0000\u0000\u018c\u018d\u0006&\uffff"+
		"\uffff\u0000\u018d\u019a\u0001\u0000\u0000\u0000\u018e\u018f\u0003,\u0016"+
		"\u0000\u018f\u0190\u0005\u0004\u0000\u0000\u0190\u0191\u0003N\'\u0000"+
		"\u0191\u0192\u0005\u0004\u0000\u0000\u0192\u0193\u0003,\u0016\u0000\u0193"+
		"\u0194\u0005\r\u0000\u0000\u0194\u0195\u0005\u0001\u0000\u0000\u0195\u0196"+
		"\u0003&\u0013\u0000\u0196\u0197\u0005\u0002\u0000\u0000\u0197\u0198\u0006"+
		"&\uffff\uffff\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0183\u0001"+
		"\u0000\u0000\u0000\u0199\u018e\u0001\u0000\u0000\u0000\u019aM\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0003T*\u0000\u019c\u019d\u0003P(\u0000\u019d"+
		"\u019e\u0006\'\uffff\uffff\u0000\u019eO\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0003R)\u0000\u01a0\u01a1\u0003T*\u0000\u01a1\u01a2\u0003P(\u0000"+
		"\u01a2\u01a3\u0006(\uffff\uffff\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a6\u0006(\uffff\uffff\u0000\u01a5\u019f\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6Q\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0005\u0014\u0000\u0000\u01a8\u01ac\u0006)\uffff\uffff\u0000\u01a9"+
		"\u01aa\u0005\u0013\u0000\u0000\u01aa\u01ac\u0006)\uffff\uffff\u0000\u01ab"+
		"\u01a7\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"S\u0001\u0000\u0000\u0000\u01ad\u01ae\u00030\u0018\u0000\u01ae\u01af\u0003"+
		"V+\u0000\u01af\u01b0\u00030\u0018\u0000\u01b0\u01b1\u0006*\uffff\uffff"+
		"\u0000\u01b1\u01bc\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\f\u0000\u0000"+
		"\u01b3\u01b4\u0003N\'\u0000\u01b4\u01b5\u0005\r\u0000\u0000\u01b5\u01b6"+
		"\u0006*\uffff\uffff\u0000\u01b6\u01bc\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0005\u0015\u0000\u0000\u01b8\u01b9\u0003T*\u0000\u01b9\u01ba\u0006*"+
		"\uffff\uffff\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01ad\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b2\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bcU\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0016"+
		"\u0000\u0000\u01be\u01c8\u0006+\uffff\uffff\u0000\u01bf\u01c0\u0005\u0017"+
		"\u0000\u0000\u01c0\u01c8\u0006+\uffff\uffff\u0000\u01c1\u01c2\u0005\u0018"+
		"\u0000\u0000\u01c2\u01c8\u0006+\uffff\uffff\u0000\u01c3\u01c4\u0005\u0019"+
		"\u0000\u0000\u01c4\u01c8\u0006+\uffff\uffff\u0000\u01c5\u01c6\u0005\u001a"+
		"\u0000\u0000\u01c6\u01c8\u0006+\uffff\uffff\u0000\u01c7\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8W\u0001\u0000\u0000\u0000\u0019biw\u0084\u0094\u00a2"+
		"\u00b3\u00c8\u00d1\u00df\u00ff\u0108\u011d\u0129\u0136\u0140\u0148\u0153"+
		"\u0162\u016c\u0199\u01a5\u01ab\u01bb\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}