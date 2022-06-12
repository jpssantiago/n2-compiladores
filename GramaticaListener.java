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
	 * Enter a parse tree produced by {@link GramaticaParser#double_}.
	 * @param ctx the parse tree
	 */
	void enterDouble_(GramaticaParser.Double_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#double_}.
	 * @param ctx the parse tree
	 */
	void exitDouble_(GramaticaParser.Double_Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#operador_matematico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_matematico(GramaticaParser.Operador_matematicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_matematico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_matematico(GramaticaParser.Operador_matematicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#comando_show}.
	 * @param ctx the parse tree
	 */
	void enterComando_show(GramaticaParser.Comando_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_show}.
	 * @param ctx the parse tree
	 */
	void exitComando_show(GramaticaParser.Comando_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_get}.
	 * @param ctx the parse tree
	 */
	void enterComando_get(GramaticaParser.Comando_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_get}.
	 * @param ctx the parse tree
	 */
	void exitComando_get(GramaticaParser.Comando_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_if}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_if(GramaticaParser.Expressao_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_if}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_if(GramaticaParser.Expressao_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_if}.
	 * @param ctx the parse tree
	 */
	void enterComando_if(GramaticaParser.Comando_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_if}.
	 * @param ctx the parse tree
	 */
	void exitComando_if(GramaticaParser.Comando_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_else_if}.
	 * @param ctx the parse tree
	 */
	void enterComando_else_if(GramaticaParser.Comando_else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_else_if}.
	 * @param ctx the parse tree
	 */
	void exitComando_else_if(GramaticaParser.Comando_else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_else}.
	 * @param ctx the parse tree
	 */
	void enterComando_else(GramaticaParser.Comando_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_else}.
	 * @param ctx the parse tree
	 */
	void exitComando_else(GramaticaParser.Comando_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fim_comando_if}.
	 * @param ctx the parse tree
	 */
	void enterFim_comando_if(GramaticaParser.Fim_comando_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fim_comando_if}.
	 * @param ctx the parse tree
	 */
	void exitFim_comando_if(GramaticaParser.Fim_comando_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_while}.
	 * @param ctx the parse tree
	 */
	void enterComando_while(GramaticaParser.Comando_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_while}.
	 * @param ctx the parse tree
	 */
	void exitComando_while(GramaticaParser.Comando_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fim_comando_while}.
	 * @param ctx the parse tree
	 */
	void enterFim_comando_while(GramaticaParser.Fim_comando_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fim_comando_while}.
	 * @param ctx the parse tree
	 */
	void exitFim_comando_while(GramaticaParser.Fim_comando_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_if_do_while}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_if_do_while(GramaticaParser.Expressao_if_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_if_do_while}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_if_do_while(GramaticaParser.Expressao_if_do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_do_while}.
	 * @param ctx the parse tree
	 */
	void enterComando_do_while(GramaticaParser.Comando_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_do_while}.
	 * @param ctx the parse tree
	 */
	void exitComando_do_while(GramaticaParser.Comando_do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fim_comando_do_while}.
	 * @param ctx the parse tree
	 */
	void enterFim_comando_do_while(GramaticaParser.Fim_comando_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fim_comando_do_while}.
	 * @param ctx the parse tree
	 */
	void exitFim_comando_do_while(GramaticaParser.Fim_comando_do_whileContext ctx);
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