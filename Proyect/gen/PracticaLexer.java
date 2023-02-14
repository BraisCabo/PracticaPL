// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PracticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST_DEF_IDENTIFIER=1, IDENTIFIER=2, NUMERIC_INTEGER_CONST=3, NUMERIC_REAL_CONST=4, 
		MIXED_REAL=5, FIXED_POINT=6, INITIAL_POINT=7, EXPONENTIAL=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", 
			"MIXED_REAL", "FIXED_POINT", "INITIAL_POINT", "EXPONENTIAL", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "MIXED_REAL", "FIXED_POINT", "INITIAL_POINT", "EXPONENTIAL"
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




	public PracticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Practica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			CONST_DEF_IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CONST_DEF_IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("<CONST_DEF_IDENTIFIER, " + getText() + ">");
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("<IDENTIFIER, " + getText() + ">");
			break;
		}
	}
	private void NUMERIC_INTEGER_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("<NUMERIC_INTEGER_CONST, " + getText() + ">");
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("<NUMERIC_REAL_CONST, " + getText() + ">");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\bt\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0005\u0000\u0015\b\u0000\n\u0000"+
		"\f\u0000\u0018\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000"+
		"\n\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0002\u0004\u00026\b\u0002\u000b\u0002"+
		"\f\u00027\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0004\u0004\u0004P\b\u0004"+
		"\u000b\u0004\f\u0004Q\u0001\u0005\u0004\u0005U\b\u0005\u000b\u0005\f\u0005"+
		"V\u0001\u0005\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005\\\u0001"+
		"\u0006\u0001\u0006\u0004\u0006a\b\u0006\u000b\u0006\f\u0006b\u0001\u0007"+
		"\u0004\u0007f\b\u0007\u000b\u0007\f\u0007g\u0001\u0007\u0001\u0007\u0003"+
		"\u0007l\b\u0007\u0001\u0007\u0004\u0007o\b\u0007\u000b\u0007\f\u0007p"+
		"\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000\u0001\u0000\u0007"+
		"\u0001\u0000AZ\u0003\u000009AZ__\u0002\u0000AZaz\u0004\u000009AZ__az\u0002"+
		"\u0000++--\u0002\u0000EEee\u0001\u000009\u0085\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000\u0000"+
		"\u0003%\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u0007<"+
		"\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bT\u0001\u0000"+
		"\u0000\u0000\r^\u0001\u0000\u0000\u0000\u000fe\u0001\u0000\u0000\u0000"+
		"\u0011r\u0001\u0000\u0000\u0000\u0013\u0015\u0005_\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001d"+
		"\u0007\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0006\u0000\u0000"+
		"\u0000!\u0002\u0001\u0000\u0000\u0000\"$\u0005_\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"(,\u0007\u0002\u0000\u0000)+\u0007\u0003\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0006"+
		"\u0001\u0001\u00000\u0004\u0001\u0000\u0000\u000013\u0007\u0004\u0000"+
		"\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000046\u0003\u0011\b\u000054\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0006\u0002\u0002\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;=\u0007\u0004\u0000\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=B\u0001\u0000\u0000\u0000>C\u0003\u000b\u0005\u0000?C\u0003"+
		"\r\u0006\u0000@C\u0003\u000f\u0007\u0000AC\u0003\t\u0004\u0000B>\u0001"+
		"\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\u0003\u0003"+
		"\u0000E\b\u0001\u0000\u0000\u0000FI\u0003\u000b\u0005\u0000GI\u0003\r"+
		"\u0006\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0007\u0005\u0000\u0000KM\u0007\u0004\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NP\u0003\u0011\b\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\n\u0001\u0000"+
		"\u0000\u0000SU\u0003\u0011\b\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0005.\u0000\u0000Y[\u0003\u0011\b\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\f\u0001\u0000\u0000\u0000^`\u0005.\u0000"+
		"\u0000_a\u0003\u0011\b\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000e\u0001"+
		"\u0000\u0000\u0000df\u0003\u0011\b\u0000ed\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ik\u0007\u0005\u0000\u0000jl\u0007\u0004\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mo\u0003\u0011\b\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0010"+
		"\u0001\u0000\u0000\u0000rs\u0007\u0006\u0000\u0000s\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0000\u0016\u001d%,27<BHLQV\\bgkp\u0004\u0001\u0000"+
		"\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}