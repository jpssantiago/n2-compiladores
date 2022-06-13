// Generated from c:\Users\jps_s\dev\anhembi\compiladores\n2-compiladores\Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NEW_LINE=24, 
		NUM=25, DECIMAL=26, STR=27, ID=28, OPERADOR_RELACIONAL=29, Ws=30;
	public static final int
		RULE_init = 0, RULE_bloco = 1, RULE_comando = 2, RULE_int_ = 3, RULE_double_ = 4, 
		RULE_string_ = 5, RULE_num = 6, RULE_decimal = 7, RULE_str = 8, RULE_id = 9, 
		RULE_tipo_variavel = 10, RULE_declaracao = 11, RULE_operador_matematico = 12, 
		RULE_termo = 13, RULE_operacao = 14, RULE_operacao_parenteses = 15, RULE_expressao = 16, 
		RULE_inicializacao = 17, RULE_atribuicao = 18, RULE_comando_show = 19, 
		RULE_comando_get = 20, RULE_expressao_if = 21, RULE_comando_if = 22, RULE_comando_else_if = 23, 
		RULE_comando_else = 24, RULE_fim_comando_if = 25, RULE_comando_while = 26, 
		RULE_fim_comando_while = 27, RULE_expressao_if_do_while = 28, RULE_comando_do_while = 29, 
		RULE_fim_comando_do_while = 30, RULE_fim_linha = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "bloco", "comando", "int_", "double_", "string_", "num", "decimal", 
			"str", "id", "tipo_variavel", "declaracao", "operador_matematico", "termo", 
			"operacao", "operacao_parenteses", "expressao", "inicializacao", "atribuicao", 
			"comando_show", "comando_get", "expressao_if", "comando_if", "comando_else_if", 
			"comando_else", "fim_comando_if", "comando_while", "fim_comando_while", 
			"expressao_if_do_while", "comando_do_while", "fim_comando_do_while", 
			"fim_linha"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(65);
				bloco();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ComandoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Comando_showContext comando_show() {
			return getRuleContext(Comando_showContext.class,0);
		}
		public Comando_getContext comando_get() {
			return getRuleContext(Comando_getContext.class,0);
		}
		public Comando_ifContext comando_if() {
			return getRuleContext(Comando_ifContext.class,0);
		}
		public Comando_else_ifContext comando_else_if() {
			return getRuleContext(Comando_else_ifContext.class,0);
		}
		public Comando_whileContext comando_while() {
			return getRuleContext(Comando_whileContext.class,0);
		}
		public Comando_do_whileContext comando_do_while() {
			return getRuleContext(Comando_do_whileContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				inicializacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				atribuicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				comando_show();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				comando_get();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				comando_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				comando_else_if();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				comando_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				comando_do_while();
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

	public static class Int_Context extends ParserRuleContext {
		public Int_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_; }
	}

	public final Int_Context int_() throws RecognitionException {
		Int_Context _localctx = new Int_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_Context extends ParserRuleContext {
		public Double_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_; }
	}

	public final Double_Context double_() throws RecognitionException {
		Double_Context _localctx = new Double_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_double_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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

	public static class String_Context extends ParserRuleContext {
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(GramaticaParser.DECIMAL, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(GramaticaParser.STR, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_variavelContext extends ParserRuleContext {
		public Int_Context int_() {
			return getRuleContext(Int_Context.class,0);
		}
		public Double_Context double_() {
			return getRuleContext(Double_Context.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public Tipo_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variavel; }
	}

	public final Tipo_variavelContext tipo_variavel() throws RecognitionException {
		Tipo_variavelContext _localctx = new Tipo_variavelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(103);
				int_();
				}
				break;
			case T__3:
				{
				setState(104);
				double_();
				}
				break;
			case T__4:
				{
				setState(105);
				string_();
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			tipo_variavel();
			setState(109);
			match(T__5);
			setState(110);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(111);
				match(T__6);
				setState(112);
				match(ID);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			fim_linha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_matematicoContext extends ParserRuleContext {
		public Operador_matematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_matematico; }
	}

	public final Operador_matematicoContext operador_matematico() throws RecognitionException {
		Operador_matematicoContext _localctx = new Operador_matematicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operador_matematico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class TermoContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(122);
				num();
				}
				break;
			case DECIMAL:
				{
				setState(123);
				decimal();
				}
				break;
			case ID:
				{
				setState(124);
				id();
				}
				break;
			case STR:
				{
				setState(125);
				str();
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

	public static class OperacaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Operador_matematicoContext> operador_matematico() {
			return getRuleContexts(Operador_matematicoContext.class);
		}
		public Operador_matematicoContext operador_matematico(int i) {
			return getRuleContext(Operador_matematicoContext.class,i);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			termo();
			setState(129);
			match(T__5);
			setState(130);
			operador_matematico();
			setState(131);
			match(T__5);
			setState(132);
			termo();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(133);
				match(T__5);
				setState(134);
				operador_matematico();
				setState(135);
				match(T__5);
				setState(136);
				termo();
				}
				}
				setState(142);
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

	public static class Operacao_parentesesContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Operador_matematicoContext> operador_matematico() {
			return getRuleContexts(Operador_matematicoContext.class);
		}
		public Operador_matematicoContext operador_matematico(int i) {
			return getRuleContext(Operador_matematicoContext.class,i);
		}
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Operacao_parentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_parenteses; }
	}

	public final Operacao_parentesesContext operacao_parenteses() throws RecognitionException {
		Operacao_parentesesContext _localctx = new Operacao_parentesesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operacao_parenteses);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(T__11);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(148);
				termo();
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					match(T__12);
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case DECIMAL:
				case STR:
				case ID:
					{
					setState(154);
					termo();
					}
					break;
				case T__11:
					{
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(155);
						match(T__11);
						}
						}
						setState(158); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__11 );
					setState(160);
					operacao();
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(161);
						match(T__12);
						}
						}
						setState(164); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__12 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168);
				match(T__5);
				setState(169);
				operador_matematico();
				setState(170);
				match(T__5);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case DECIMAL:
				case STR:
				case ID:
					{
					setState(171);
					termo();
					}
					break;
				case T__11:
					{
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(172);
						match(T__11);
						}
						}
						setState(175); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__11 );
					setState(177);
					operacao();
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(178);
						match(T__12);
						}
						}
						setState(181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__12 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(185);
					match(T__5);
					setState(186);
					operador_matematico();
					setState(187);
					match(T__5);
					setState(200);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUM:
					case DECIMAL:
					case STR:
					case ID:
						{
						setState(188);
						termo();
						}
						break;
					case T__11:
						{
						setState(190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(189);
							match(T__11);
							}
							}
							setState(192); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__11 );
						setState(194);
						operacao();
						setState(196); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(195);
							match(T__12);
							}
							}
							setState(198); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__12 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Operacao_parentesesContext operacao_parenteses() {
			return getRuleContext(Operacao_parentesesContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressao);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				operacao_parenteses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				operacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				termo();
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

	public static class InicializacaoContext extends ParserRuleContext {
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			tipo_variavel();
			setState(215);
			match(T__5);
			setState(216);
			match(ID);
			setState(217);
			match(T__13);
			setState(218);
			expressao();
			setState(219);
			fim_linha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			setState(222);
			match(T__13);
			setState(223);
			expressao();
			setState(224);
			fim_linha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_showContext extends ParserRuleContext {
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Comando_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_show; }
	}

	public final Comando_showContext comando_show() throws RecognitionException {
		Comando_showContext _localctx = new Comando_showContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__14);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(227);
				id();
				}
				break;
			case STR:
				{
				setState(228);
				str();
				}
				break;
			case NUM:
				{
				setState(229);
				num();
				}
				break;
			case DECIMAL:
				{
				setState(230);
				decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			match(T__12);
			setState(234);
			fim_linha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_getContext extends ParserRuleContext {
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Comando_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_get; }
	}

	public final Comando_getContext comando_get() throws RecognitionException {
		Comando_getContext _localctx = new Comando_getContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comando_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__15);
			{
			setState(237);
			match(ID);
			}
			setState(238);
			match(T__12);
			setState(239);
			fim_linha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_ifContext extends ParserRuleContext {
		public TerminalNode OPERADOR_RELACIONAL() { return getToken(GramaticaParser.OPERADOR_RELACIONAL, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GramaticaParser.NUM, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(GramaticaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(GramaticaParser.DECIMAL, i);
		}
		public List<TerminalNode> STR() { return getTokens(GramaticaParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GramaticaParser.STR, i);
		}
		public Expressao_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_if; }
	}

	public final Expressao_ifContext expressao_if() throws RecognitionException {
		Expressao_ifContext _localctx = new Expressao_ifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DECIMAL) | (1L << STR) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			match(T__5);
			setState(243);
			match(OPERADOR_RELACIONAL);
			setState(244);
			match(T__5);
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DECIMAL) | (1L << STR) | (1L << ID))) != 0)) ) {
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

	public static class Comando_ifContext extends ParserRuleContext {
		public Expressao_ifContext expressao_if() {
			return getRuleContext(Expressao_ifContext.class,0);
		}
		public Fim_comando_ifContext fim_comando_if() {
			return getRuleContext(Fim_comando_ifContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public Comando_else_ifContext comando_else_if() {
			return getRuleContext(Comando_else_ifContext.class,0);
		}
		public Comando_elseContext comando_else() {
			return getRuleContext(Comando_elseContext.class,0);
		}
		public Comando_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_if; }
	}

	public final Comando_ifContext comando_if() throws RecognitionException {
		Comando_ifContext _localctx = new Comando_ifContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comando_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__16);
			setState(248);
			expressao_if();
			setState(249);
			match(T__17);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					bloco();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(256);
				comando_else_if();
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(259);
				comando_else();
				}
			}

			setState(262);
			fim_comando_if();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_else_ifContext extends ParserRuleContext {
		public Expressao_ifContext expressao_if() {
			return getRuleContext(Expressao_ifContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public Comando_else_ifContext comando_else_if() {
			return getRuleContext(Comando_else_ifContext.class,0);
		}
		public Comando_elseContext comando_else() {
			return getRuleContext(Comando_elseContext.class,0);
		}
		public Comando_else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_else_if; }
	}

	public final Comando_else_ifContext comando_else_if() throws RecognitionException {
		Comando_else_ifContext _localctx = new Comando_else_ifContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comando_else_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__18);
			setState(265);
			expressao_if();
			setState(266);
			match(T__17);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					bloco();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273);
				comando_else_if();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(276);
				comando_else();
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

	public static class Comando_elseContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public Comando_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_else; }
	}

	public final Comando_elseContext comando_else() throws RecognitionException {
		Comando_elseContext _localctx = new Comando_elseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comando_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			match(T__19);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					bloco();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Fim_comando_ifContext extends ParserRuleContext {
		public Fim_comando_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_comando_if; }
	}

	public final Fim_comando_ifContext fim_comando_if() throws RecognitionException {
		Fim_comando_ifContext _localctx = new Fim_comando_ifContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fim_comando_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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

	public static class Comando_whileContext extends ParserRuleContext {
		public Expressao_ifContext expressao_if() {
			return getRuleContext(Expressao_ifContext.class,0);
		}
		public Fim_comando_whileContext fim_comando_while() {
			return getRuleContext(Fim_comando_whileContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public Comando_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_while; }
	}

	public final Comando_whileContext comando_while() throws RecognitionException {
		Comando_whileContext _localctx = new Comando_whileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comando_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__20);
			setState(289);
			expressao_if();
			setState(290);
			match(T__17);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(291);
				bloco();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			fim_comando_while();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fim_comando_whileContext extends ParserRuleContext {
		public Fim_comando_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_comando_while; }
	}

	public final Fim_comando_whileContext fim_comando_while() throws RecognitionException {
		Fim_comando_whileContext _localctx = new Fim_comando_whileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fim_comando_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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

	public static class Expressao_if_do_whileContext extends ParserRuleContext {
		public TerminalNode OPERADOR_RELACIONAL() { return getToken(GramaticaParser.OPERADOR_RELACIONAL, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GramaticaParser.NUM, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(GramaticaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(GramaticaParser.DECIMAL, i);
		}
		public List<TerminalNode> STR() { return getTokens(GramaticaParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GramaticaParser.STR, i);
		}
		public Expressao_if_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_if_do_while; }
	}

	public final Expressao_if_do_whileContext expressao_if_do_while() throws RecognitionException {
		Expressao_if_do_whileContext _localctx = new Expressao_if_do_whileContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressao_if_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DECIMAL) | (1L << STR) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			match(T__5);
			setState(303);
			match(OPERADOR_RELACIONAL);
			setState(304);
			match(T__5);
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DECIMAL) | (1L << STR) | (1L << ID))) != 0)) ) {
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

	public static class Comando_do_whileContext extends ParserRuleContext {
		public Expressao_if_do_whileContext expressao_if_do_while() {
			return getRuleContext(Expressao_if_do_whileContext.class,0);
		}
		public Fim_comando_do_whileContext fim_comando_do_while() {
			return getRuleContext(Fim_comando_do_whileContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public Comando_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_do_while; }
	}

	public final Comando_do_whileContext comando_do_while() throws RecognitionException {
		Comando_do_whileContext _localctx = new Comando_do_whileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comando_do_while);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__21);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					bloco();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(314);
			match(T__20);
			setState(315);
			expressao_if_do_while();
			setState(316);
			match(T__5);
			setState(317);
			fim_comando_do_while();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fim_comando_do_whileContext extends ParserRuleContext {
		public Fim_comando_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_comando_do_while; }
	}

	public final Fim_comando_do_whileContext fim_comando_do_while() throws RecognitionException {
		Fim_comando_do_whileContext _localctx = new Fim_comando_do_whileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fim_comando_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public static class Fim_linhaContext extends ParserRuleContext {
		public Fim_linhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_linha; }
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\6\3M\n\3\r\3\16\3N\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\7\rt\n\r\f\r\16\rw\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u0081\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008d"+
		"\n\20\f\20\16\20\u0090\13\20\3\21\6\21\u0093\n\21\r\21\16\21\u0094\3\21"+
		"\3\21\6\21\u0099\n\21\r\21\16\21\u009a\3\21\3\21\6\21\u009f\n\21\r\21"+
		"\16\21\u00a0\3\21\3\21\6\21\u00a5\n\21\r\21\16\21\u00a6\5\21\u00a9\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\6\21\u00b0\n\21\r\21\16\21\u00b1\3\21\3\21\6"+
		"\21\u00b6\n\21\r\21\16\21\u00b7\5\21\u00ba\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\6\21\u00c1\n\21\r\21\16\21\u00c2\3\21\3\21\6\21\u00c7\n\21\r\21\16"+
		"\21\u00c8\5\21\u00cb\n\21\7\21\u00cd\n\21\f\21\16\21\u00d0\13\21\5\21"+
		"\u00d2\n\21\3\22\3\22\3\22\5\22\u00d7\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ea"+
		"\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u00fe\n\30\f\30\16\30\u0101\13\30\3\30"+
		"\5\30\u0104\n\30\3\30\5\30\u0107\n\30\3\30\3\30\3\31\3\31\3\31\3\31\7"+
		"\31\u010f\n\31\f\31\16\31\u0112\13\31\3\31\5\31\u0115\n\31\3\31\5\31\u0118"+
		"\n\31\3\32\3\32\7\32\u011c\n\32\f\32\16\32\u011f\13\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\7\34\u0127\n\34\f\34\16\34\u012a\13\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0138\n\37\f\37\16"+
		"\37\u013b\13\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\3\2\n\r"+
		"\3\2\33\36\2\u0151\2B\3\2\2\2\4L\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\n]\3\2"+
		"\2\2\f_\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26l\3"+
		"\2\2\2\30n\3\2\2\2\32z\3\2\2\2\34\u0080\3\2\2\2\36\u0082\3\2\2\2 \u00d1"+
		"\3\2\2\2\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00df\3\2\2\2(\u00e4\3\2\2\2"+
		"*\u00ee\3\2\2\2,\u00f3\3\2\2\2.\u00f9\3\2\2\2\60\u010a\3\2\2\2\62\u0119"+
		"\3\2\2\2\64\u0120\3\2\2\2\66\u0122\3\2\2\28\u012d\3\2\2\2:\u012f\3\2\2"+
		"\2<\u0135\3\2\2\2>\u0141\3\2\2\2@\u0143\3\2\2\2BF\7\3\2\2CE\5\4\3\2DC"+
		"\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\4\2\2J"+
		"\3\3\2\2\2KM\5\6\4\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2"+
		"\2PZ\5\30\r\2QZ\5$\23\2RZ\5&\24\2SZ\5(\25\2TZ\5*\26\2UZ\5.\30\2VZ\5\60"+
		"\31\2WZ\5\66\34\2XZ\5<\37\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2\2YT"+
		"\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\7\5\2\2"+
		"\\\t\3\2\2\2]^\7\6\2\2^\13\3\2\2\2_`\7\7\2\2`\r\3\2\2\2ab\7\33\2\2b\17"+
		"\3\2\2\2cd\7\34\2\2d\21\3\2\2\2ef\7\35\2\2f\23\3\2\2\2gh\7\36\2\2h\25"+
		"\3\2\2\2im\5\b\5\2jm\5\n\6\2km\5\f\7\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m"+
		"\27\3\2\2\2no\5\26\f\2op\7\b\2\2pu\7\36\2\2qr\7\t\2\2rt\7\36\2\2sq\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\5@!\2y\31\3\2"+
		"\2\2z{\t\2\2\2{\33\3\2\2\2|\u0081\5\16\b\2}\u0081\5\20\t\2~\u0081\5\24"+
		"\13\2\177\u0081\5\22\n\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\177\3\2\2\2\u0081\35\3\2\2\2\u0082\u0083\5\34\17\2\u0083\u0084"+
		"\7\b\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\b\2\2\u0086\u008e\5\34\17"+
		"\2\u0087\u0088\7\b\2\2\u0088\u0089\5\32\16\2\u0089\u008a\7\b\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\37\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\7\16\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\5\34\17\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00d2\3\2\2\2\u009c"+
		"\u00a9\5\34\17\2\u009d\u009f\7\16\2\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\5\36\20\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u009c\3\2\2\2\u00a8\u009e\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\b"+
		"\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00b9\7\b\2\2\u00ad\u00ba\5\34\17\2\u00ae"+
		"\u00b0\7\16\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\5\36\20\2\u00b4"+
		"\u00b6\7\17\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9"+
		"\u00af\3\2\2\2\u00ba\u00ce\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\32"+
		"\16\2\u00bd\u00ca\7\b\2\2\u00be\u00cb\5\34\17\2\u00bf\u00c1\7\16\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c7\7\17\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c0\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u0092\3\2\2\2\u00d1\u00a8\3\2\2\2\u00d2!\3\2\2\2\u00d3\u00d7\5 \21\2"+
		"\u00d4\u00d7\5\36\20\2\u00d5\u00d7\5\34\17\2\u00d6\u00d3\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9\5\26\f\2"+
		"\u00d9\u00da\7\b\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd"+
		"\5\"\22\2\u00dd\u00de\5@!\2\u00de%\3\2\2\2\u00df\u00e0\7\36\2\2\u00e0"+
		"\u00e1\7\20\2\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3\5@!\2\u00e3\'\3\2\2\2"+
		"\u00e4\u00e9\7\21\2\2\u00e5\u00ea\5\24\13\2\u00e6\u00ea\5\22\n\2\u00e7"+
		"\u00ea\5\16\b\2\u00e8\u00ea\5\20\t\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7\17\2\2\u00ec\u00ed\5@!\2\u00ed)\3\2\2\2\u00ee\u00ef\7\22\2\2"+
		"\u00ef\u00f0\7\36\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\5@!\2\u00f2+\3"+
		"\2\2\2\u00f3\u00f4\t\3\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\7\37\2\2\u00f6"+
		"\u00f7\7\b\2\2\u00f7\u00f8\t\3\2\2\u00f8-\3\2\2\2\u00f9\u00fa\7\23\2\2"+
		"\u00fa\u00fb\5,\27\2\u00fb\u00ff\7\24\2\2\u00fc\u00fe\5\4\3\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5\60\31\2\u0103\u0102\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5\62\32\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5\64"+
		"\33\2\u0109/\3\2\2\2\u010a\u010b\7\25\2\2\u010b\u010c\5,\27\2\u010c\u0110"+
		"\7\24\2\2\u010d\u010f\5\4\3\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0115\5\60\31\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0117\3\2\2\2\u0116\u0118\5\62\32\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\61\3\2\2\2\u0119\u011d\7\26\2\2\u011a\u011c\5\4\3\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\63\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\4\2\2\u0121\65"+
		"\3\2\2\2\u0122\u0123\7\27\2\2\u0123\u0124\5,\27\2\u0124\u0128\7\24\2\2"+
		"\u0125\u0127\5\4\3\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\58\35\2\u012c\67\3\2\2\2\u012d\u012e\7\4\2\2\u012e9\3\2\2\2\u012f"+
		"\u0130\t\3\2\2\u0130\u0131\7\b\2\2\u0131\u0132\7\37\2\2\u0132\u0133\7"+
		"\b\2\2\u0133\u0134\t\3\2\2\u0134;\3\2\2\2\u0135\u0139\7\30\2\2\u0136\u0138"+
		"\5\4\3\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\27"+
		"\2\2\u013d\u013e\5:\36\2\u013e\u013f\7\b\2\2\u013f\u0140\5> \2\u0140="+
		"\3\2\2\2\u0141\u0142\7\4\2\2\u0142?\3\2\2\2\u0143\u0144\7\31\2\2\u0144"+
		"A\3\2\2\2!FNYlu\u0080\u008e\u0094\u009a\u00a0\u00a6\u00a8\u00b1\u00b7"+
		"\u00b9\u00c2\u00c8\u00ca\u00ce\u00d1\u00d6\u00e9\u00ff\u0103\u0106\u0110"+
		"\u0114\u0117\u011d\u0128\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}