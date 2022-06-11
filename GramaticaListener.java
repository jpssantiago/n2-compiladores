// Generated from Gramatica.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#int_}.
	 * @param ctx the parse tree
	 */
	void enterInt_(GramaticaParser.Int_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#int_}.
	 * @param ctx the parse tree
	 */
	void exitInt_(GramaticaParser.Int_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#float_}.
	 * @param ctx the parse tree
	 */
	void enterFloat_(GramaticaParser.Float_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#float_}.
	 * @param ctx the parse tree
	 */
	void exitFloat_(GramaticaParser.Float_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(GramaticaParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(GramaticaParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(GramaticaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(GramaticaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(GramaticaParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(GramaticaParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(GramaticaParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(GramaticaParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#separador_variavel}.
	 * @param ctx the parse tree
	 */
	void enterSeparador_variavel(GramaticaParser.Separador_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#separador_variavel}.
	 * @param ctx the parse tree
	 */
	void exitSeparador_variavel(GramaticaParser.Separador_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void enterTipo_variavel(GramaticaParser.Tipo_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void exitTipo_variavel(GramaticaParser.Tipo_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao(GramaticaParser.InicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao(GramaticaParser.InicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void enterFim_linha(GramaticaParser.Fim_linhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void exitFim_linha(GramaticaParser.Fim_linhaContext ctx);
}