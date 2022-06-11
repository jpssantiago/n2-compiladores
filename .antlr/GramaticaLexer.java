// Generated from c:\Users\jps_s\dev\anhembi\compiladores\n2-compiladores\Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUM=16, DECIMAL=17, 
		STR=18, ID=19, OPERADOR_RELACIONAL=20, Ws=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUM", "DECIMAL", 
			"STR", "ID", "OPERADOR_RELACIONAL", "Ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'script.'", "'int'", "'double'", "'string'", "','", "' = '", "'show('", 
			"')'", "'get('", "'if '", "':'", "'else if '", "'else:'", "'end.'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUM", "DECIMAL", "STR", "ID", "OPERADOR_RELACIONAL", 
			"Ws"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\6\21x\n\21\r\21\16\21y\3\22\6\22}\n\22\r\22\16\22~\3\22\3\22"+
		"\6\22\u0083\n\22\r\22\16\22\u0084\3\23\3\23\6\23\u0089\n\23\r\23\16\23"+
		"\u008a\3\23\3\23\3\24\6\24\u0090\n\24\r\24\16\24\u0091\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009d\n\25\3\26\6\26\u00a0\n\26\r"+
		"\26\16\26\u00a1\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\3"+
		"\2\62;\6\2\"\"\62;C\\c|\3\2c|\4\2>>@@\5\2\13\f\17\17\"\"\2\u00ae\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\7"+
		"9\3\2\2\2\t@\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17M\3\2\2\2\21S\3\2\2\2\23"+
		"U\3\2\2\2\25Z\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33i\3\2\2\2\35o\3\2\2\2"+
		"\37t\3\2\2\2!w\3\2\2\2#|\3\2\2\2%\u0086\3\2\2\2\'\u008f\3\2\2\2)\u009c"+
		"\3\2\2\2+\u009f\3\2\2\2-.\7u\2\2./\7e\2\2/\60\7t\2\2\60\61\7k\2\2\61\62"+
		"\7r\2\2\62\63\7v\2\2\63\64\7\60\2\2\64\4\3\2\2\2\65\66\7k\2\2\66\67\7"+
		"p\2\2\678\7v\2\28\6\3\2\2\29:\7f\2\2:;\7q\2\2;<\7w\2\2<=\7d\2\2=>\7n\2"+
		"\2>?\7g\2\2?\b\3\2\2\2@A\7u\2\2AB\7v\2\2BC\7t\2\2CD\7k\2\2DE\7p\2\2EF"+
		"\7i\2\2F\n\3\2\2\2GH\7.\2\2H\f\3\2\2\2IJ\7\"\2\2JK\7?\2\2KL\7\"\2\2L\16"+
		"\3\2\2\2MN\7u\2\2NO\7j\2\2OP\7q\2\2PQ\7y\2\2QR\7*\2\2R\20\3\2\2\2ST\7"+
		"+\2\2T\22\3\2\2\2UV\7i\2\2VW\7g\2\2WX\7v\2\2XY\7*\2\2Y\24\3\2\2\2Z[\7"+
		"k\2\2[\\\7h\2\2\\]\7\"\2\2]\26\3\2\2\2^_\7<\2\2_\30\3\2\2\2`a\7g\2\2a"+
		"b\7n\2\2bc\7u\2\2cd\7g\2\2de\7\"\2\2ef\7k\2\2fg\7h\2\2gh\7\"\2\2h\32\3"+
		"\2\2\2ij\7g\2\2jk\7n\2\2kl\7u\2\2lm\7g\2\2mn\7<\2\2n\34\3\2\2\2op\7g\2"+
		"\2pq\7p\2\2qr\7f\2\2rs\7\60\2\2s\36\3\2\2\2tu\7\60\2\2u \3\2\2\2vx\t\2"+
		"\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\"\3\2\2\2{}\t\2\2\2|{\3"+
		"\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\7.\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085$\3\2\2\2\u0086\u0088\7$\2\2\u0087"+
		"\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7$\2\2\u008d"+
		"&\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092(\3\2\2\2\u0093\u009d\t"+
		"\5\2\2\u0094\u0095\7>\2\2\u0095\u009d\7?\2\2\u0096\u0097\7@\2\2\u0097"+
		"\u009d\7?\2\2\u0098\u0099\7?\2\2\u0099\u009d\7?\2\2\u009a\u009b\7#\2\2"+
		"\u009b\u009d\7?\2\2\u009c\u0093\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0096"+
		"\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009a\3\2\2\2\u009d*\3\2\2\2\u009e"+
		"\u00a0\t\6\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\26\2\2\u00a4"+
		",\3\2\2\2\n\2y~\u0084\u008a\u0091\u009c\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}