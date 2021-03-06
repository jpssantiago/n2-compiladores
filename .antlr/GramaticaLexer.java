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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NEW_LINE=24, 
		NUM=25, DECIMAL=26, STR=27, ID=28, OPERADOR_RELACIONAL=29, Ws=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "NEW_LINE", "NUM", 
			"DECIMAL", "STR", "ID", "OPERADOR_RELACIONAL", "Ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start.'", "'end.'", "'int'", "'double'", "'string'", "' '", "', '", 
			"'/'", "'*'", "'+'", "'-'", "'('", "')'", "' = '", "'show('", "'get('", 
			"'if '", "':'", "'else if '", "'else:'", "'while '", "'do:'", "'.'", 
			"'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEW_LINE", "NUM", "DECIMAL", "STR", "ID", "OPERADOR_RELACIONAL", "Ws"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\6\32\u00a4\n\32\r\32\16\32\u00a5\3\33\6\33"+
		"\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33\6\33\u00af\n\33\r\33\16\33\u00b0"+
		"\3\34\3\34\3\34\3\34\7\34\u00b7\n\34\f\34\16\34\u00ba\13\34\3\34\3\34"+
		"\3\35\5\35\u00bf\n\35\3\35\7\35\u00c2\n\35\f\35\16\35\u00c5\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00d0\n\36\3\37\6\37\u00d3"+
		"\n\37\r\37\16\37\u00d4\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\t\3\2\62;\b\2\"\"..\60\60\62"+
		";C\\c|\b\2##,-//\61\61<Aaa\4\2C\\c|\5\2\62;C\\c|\4\2>>@@\5\2\13\f\17\17"+
		"\"\"\2\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tO\3\2\2"+
		"\2\13V\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2"+
		"\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37r\3\2\2\2!x\3\2"+
		"\2\2#}\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u008c\3\2\2\2+\u0092\3"+
		"\2\2\2-\u0099\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a3\3\2\2\2"+
		"\65\u00a8\3\2\2\2\67\u00b2\3\2\2\29\u00be\3\2\2\2;\u00cf\3\2\2\2=\u00d2"+
		"\3\2\2\2?@\7u\2\2@A\7v\2\2AB\7c\2\2BC\7t\2\2CD\7v\2\2DE\7\60\2\2E\4\3"+
		"\2\2\2FG\7g\2\2GH\7p\2\2HI\7f\2\2IJ\7\60\2\2J\6\3\2\2\2KL\7k\2\2LM\7p"+
		"\2\2MN\7v\2\2N\b\3\2\2\2OP\7f\2\2PQ\7q\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2"+
		"TU\7g\2\2U\n\3\2\2\2VW\7u\2\2WX\7v\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7"+
		"i\2\2\\\f\3\2\2\2]^\7\"\2\2^\16\3\2\2\2_`\7.\2\2`a\7\"\2\2a\20\3\2\2\2"+
		"bc\7\61\2\2c\22\3\2\2\2de\7,\2\2e\24\3\2\2\2fg\7-\2\2g\26\3\2\2\2hi\7"+
		"/\2\2i\30\3\2\2\2jk\7*\2\2k\32\3\2\2\2lm\7+\2\2m\34\3\2\2\2no\7\"\2\2"+
		"op\7?\2\2pq\7\"\2\2q\36\3\2\2\2rs\7u\2\2st\7j\2\2tu\7q\2\2uv\7y\2\2vw"+
		"\7*\2\2w \3\2\2\2xy\7i\2\2yz\7g\2\2z{\7v\2\2{|\7*\2\2|\"\3\2\2\2}~\7k"+
		"\2\2~\177\7h\2\2\177\u0080\7\"\2\2\u0080$\3\2\2\2\u0081\u0082\7<\2\2\u0082"+
		"&\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2"+
		"\2\u008a\u008b\7\"\2\2\u008b(\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7"+
		"n\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7<\2\2\u0091*"+
		"\3\2\2\2\u0092\u0093\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098\7\"\2\2\u0098,\3\2\2\2\u0099"+
		"\u009a\7f\2\2\u009a\u009b\7q\2\2\u009b\u009c\7<\2\2\u009c.\3\2\2\2\u009d"+
		"\u009e\7\60\2\2\u009e\60\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\62\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\64\3\2\2\2\u00a7"+
		"\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7.\2\2\u00ad"+
		"\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\66\3\2\2\2\u00b2\u00b8\7$\2\2\u00b3\u00b7"+
		"\t\3\2\2\u00b4\u00b7\5\61\31\2\u00b5\u00b7\t\4\2\2\u00b6\u00b3\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7$\2\2\u00bc8\3\2\2\2\u00bd\u00bf\t\5\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c3\3\2\2\2\u00c0\u00c2\t\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4:\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00d0\t\7\2\2\u00c7\u00c8\7>\2\2\u00c8\u00d0\7?\2\2\u00c9"+
		"\u00ca\7@\2\2\u00ca\u00d0\7?\2\2\u00cb\u00cc\7?\2\2\u00cc\u00d0\7?\2\2"+
		"\u00cd\u00ce\7#\2\2\u00ce\u00d0\7?\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7"+
		"\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"<\3\2\2\2\u00d1\u00d3\t\b\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\b\37\2\2\u00d7>\3\2\2\2\r\2\u00a5\u00aa\u00b0\u00b6\u00b8\u00be\u00c1"+
		"\u00c3\u00cf\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}