// Generated from Gramatica.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUM=16, DECIMAL=17, 
		STR=18, ID=19, OPERADOR_RELACIONAL=20, Ws=21;
	public static final int
		RULE_init = 0, RULE_bloco = 1, RULE_comando = 2, RULE_int_ = 3, RULE_double_ = 4, 
		RULE_string_ = 5, RULE_num = 6, RULE_decimal = 7, RULE_str = 8, RULE_id = 9, 
		RULE_separador_variavel = 10, RULE_operador_atribuicao = 11, RULE_tipo_variavel = 12, 
		RULE_declaracao = 13, RULE_inicializacao = 14, RULE_atribuicao = 15, RULE_comando_show = 16, 
		RULE_comando_get = 17, RULE_expressao_if = 18, RULE_comando_if = 19, RULE_comando_else_if = 20, 
		RULE_comando_else = 21, RULE_fim_comando_if = 22, RULE_fim_linha = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "bloco", "comando", "int_", "double_", "string_", "num", "decimal", 
			"str", "id", "separador_variavel", "operador_atribuicao", "tipo_variavel", 
			"declaracao", "inicializacao", "atribuicao", "comando_show", "comando_get", 
			"expressao_if", "comando_if", "comando_else_if", "comando_else", "fim_comando_if", 
			"fim_linha"
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			bloco();
			setState(50);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				inicializacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				atribuicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				comando_show();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				comando_get();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				comando_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				comando_else_if();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInt_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInt_(this);
		}
	}

	public final Int_Context int_() throws RecognitionException {
		Int_Context _localctx = new Int_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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

	public static class Double_Context extends ParserRuleContext {
		public Double_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDouble_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDouble_(this);
		}
	}

	public final Double_Context double_() throws RecognitionException {
		Double_Context _localctx = new Double_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_double_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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

	public static class String_Context extends ParserRuleContext {
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitString_(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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

	public static class Separador_variavelContext extends ParserRuleContext {
		public Separador_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separador_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSeparador_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSeparador_variavel(this);
		}
	}

	public final Separador_variavelContext separador_variavel() throws RecognitionException {
		Separador_variavelContext _localctx = new Separador_variavelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_separador_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

	public static class Operador_atribuicaoContext extends ParserRuleContext {
		public Operador_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_atribuicao(this);
		}
	}

	public final Operador_atribuicaoContext operador_atribuicao() throws RecognitionException {
		Operador_atribuicaoContext _localctx = new Operador_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operador_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_variavel(this);
		}
	}

	public final Tipo_variavelContext tipo_variavel() throws RecognitionException {
		Tipo_variavelContext _localctx = new Tipo_variavelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(84);
				int_();
				}
				break;
			case T__2:
				{
				setState(85);
				double_();
				}
				break;
			case T__3:
				{
				setState(86);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public List<Separador_variavelContext> separador_variavel() {
			return getRuleContexts(Separador_variavelContext.class);
		}
		public Separador_variavelContext separador_variavel(int i) {
			return getRuleContext(Separador_variavelContext.class,i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			tipo_variavel();
			setState(90);
			id();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(91);
				separador_variavel();
				setState(92);
				id();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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

	public static class InicializacaoContext extends ParserRuleContext {
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInicializacao(this);
		}
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			tipo_variavel();
			setState(102);
			id();
			setState(103);
			operador_atribuicao();
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(104);
				num();
				}
				break;
			case DECIMAL:
				{
				setState(105);
				decimal();
				}
				break;
			case STR:
				{
				setState(106);
				str();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			id();
			setState(112);
			operador_atribuicao();
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(113);
				num();
				}
				break;
			case DECIMAL:
				{
				setState(114);
				decimal();
				}
				break;
			case STR:
				{
				setState(115);
				str();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Comando_showContext extends ParserRuleContext {
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode STR() { return getToken(GramaticaParser.STR, 0); }
		public Comando_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_show(this);
		}
	}

	public final Comando_showContext comando_show() throws RecognitionException {
		Comando_showContext _localctx = new Comando_showContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==STR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			match(T__7);
			setState(123);
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
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Comando_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_get(this);
		}
	}

	public final Comando_getContext comando_get() throws RecognitionException {
		Comando_getContext _localctx = new Comando_getContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			setState(126);
			match(ID);
			setState(127);
			match(T__7);
			setState(128);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_if(this);
		}
	}

	public final Expressao_ifContext expressao_if() throws RecognitionException {
		Expressao_ifContext _localctx = new Expressao_ifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DECIMAL) | (1L << STR) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			match(OPERADOR_RELACIONAL);
			setState(132);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_if(this);
		}
	}

	public final Comando_ifContext comando_if() throws RecognitionException {
		Comando_ifContext _localctx = new Comando_ifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
			setState(135);
			expressao_if();
			setState(136);
			match(T__10);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					bloco();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(143);
				comando_else_if();
				}
			}

			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(146);
				comando_else();
				}
			}

			setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_else_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_else_if(this);
		}
	}

	public final Comando_else_ifContext comando_else_if() throws RecognitionException {
		Comando_else_ifContext _localctx = new Comando_else_ifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comando_else_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__11);
			setState(152);
			expressao_if();
			setState(153);
			match(T__10);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					bloco();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(160);
				comando_else_if();
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_else(this);
		}
	}

	public final Comando_elseContext comando_else() throws RecognitionException {
		Comando_elseContext _localctx = new Comando_elseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comando_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			match(T__12);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					bloco();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFim_comando_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFim_comando_if(this);
		}
	}

	public final Fim_comando_ifContext fim_comando_if() throws RecognitionException {
		Fim_comando_ifContext _localctx = new Fim_comando_ifContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fim_comando_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFim_linha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFim_linha(this);
		}
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4C\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\5\16Z\n\16\3\17\3\17\3\17\3\17\3\17\7\17a"+
		"\n\17\f\17\16\17d\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20n"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21w\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u008d\n\25\f\25\16\25\u0090\13\25\3\25\5\25\u0093\n\25"+
		"\3\25\5\25\u0096\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u009e\n\26\f"+
		"\26\16\26\u00a1\13\26\3\26\5\26\u00a4\n\26\3\26\5\26\u00a7\n\26\3\27\3"+
		"\27\7\27\u00ab\n\27\f\27\16\27\u00ae\13\27\3\30\3\30\3\31\3\31\3\31\2"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2\24\25"+
		"\3\2\22\25\2\u00b0\2\62\3\2\2\2\4\67\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nF"+
		"\3\2\2\2\fH\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22N\3\2\2\2\24P\3\2\2\2\26"+
		"R\3\2\2\2\30T\3\2\2\2\32Y\3\2\2\2\34[\3\2\2\2\36g\3\2\2\2 q\3\2\2\2\""+
		"z\3\2\2\2$\177\3\2\2\2&\u0084\3\2\2\2(\u0088\3\2\2\2*\u0099\3\2\2\2,\u00a8"+
		"\3\2\2\2.\u00af\3\2\2\2\60\u00b1\3\2\2\2\62\63\7\3\2\2\63\64\5\4\3\2\64"+
		"\65\7\3\2\2\65\3\3\2\2\2\668\5\6\4\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:\5\3\2\2\2;C\5\34\17\2<C\5\36\20\2=C\5 \21\2>C\5\"\22\2?"+
		"C\5$\23\2@C\5(\25\2AC\5*\26\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2"+
		"B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\7\4\2\2E\t\3\2\2\2FG\7\5\2"+
		"\2G\13\3\2\2\2HI\7\6\2\2I\r\3\2\2\2JK\7\22\2\2K\17\3\2\2\2LM\7\23\2\2"+
		"M\21\3\2\2\2NO\7\24\2\2O\23\3\2\2\2PQ\7\25\2\2Q\25\3\2\2\2RS\7\7\2\2S"+
		"\27\3\2\2\2TU\7\b\2\2U\31\3\2\2\2VZ\5\b\5\2WZ\5\n\6\2XZ\5\f\7\2YV\3\2"+
		"\2\2YW\3\2\2\2YX\3\2\2\2Z\33\3\2\2\2[\\\5\32\16\2\\b\5\24\13\2]^\5\26"+
		"\f\2^_\5\24\13\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3"+
		"\2\2\2db\3\2\2\2ef\5\60\31\2f\35\3\2\2\2gh\5\32\16\2hi\5\24\13\2im\5\30"+
		"\r\2jn\5\16\b\2kn\5\20\t\2ln\5\22\n\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2no"+
		"\3\2\2\2op\5\60\31\2p\37\3\2\2\2qr\5\24\13\2rv\5\30\r\2sw\5\16\b\2tw\5"+
		"\20\t\2uw\5\22\n\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\5\60\31\2"+
		"y!\3\2\2\2z{\7\t\2\2{|\t\2\2\2|}\7\n\2\2}~\5\60\31\2~#\3\2\2\2\177\u0080"+
		"\7\13\2\2\u0080\u0081\7\25\2\2\u0081\u0082\7\n\2\2\u0082\u0083\5\60\31"+
		"\2\u0083%\3\2\2\2\u0084\u0085\t\3\2\2\u0085\u0086\7\26\2\2\u0086\u0087"+
		"\t\3\2\2\u0087\'\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\5&\24\2\u008a"+
		"\u008e\7\r\2\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\5*\26\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0096\5,\27\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5.\30\2\u0098)\3\2\2\2"+
		"\u0099\u009a\7\16\2\2\u009a\u009b\5&\24\2\u009b\u009f\7\r\2\2\u009c\u009e"+
		"\5\4\3\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5*"+
		"\26\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a7\5,\27\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7+\3\2\2\2"+
		"\u00a8\u00ac\7\17\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad-\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7\20\2\2\u00b0/\3\2\2\2\u00b1\u00b2\7\21\2"+
		"\2\u00b2\61\3\2\2\2\179BYbmv\u008e\u0092\u0095\u009f\u00a3\u00a6\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}