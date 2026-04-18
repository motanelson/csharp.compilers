// Generated from cs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csParser}.
 */
public interface csListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(csParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(csParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(csParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(csParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void enterMembroClasse(csParser.MembroClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void exitMembroClasse(csParser.MembroClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(csParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(csParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(csParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(csParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(csParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(csParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(csParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(csParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(csParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(csParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(csParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(csParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(csParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(csParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#ifInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterIfInstrucao(csParser.IfInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#ifInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitIfInstrucao(csParser.IfInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#whileInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstrucao(csParser.WhileInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#whileInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstrucao(csParser.WhileInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#forInstrucao}.
	 * @param ctx the parse tree
	 */
	void enterForInstrucao(csParser.ForInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#forInstrucao}.
	 * @param ctx the parse tree
	 */
	void exitForInstrucao(csParser.ForInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(csParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(csParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(csParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(csParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(csParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(csParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(csParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(csParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(csParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(csParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(csParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(csParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#logicoOu}.
	 * @param ctx the parse tree
	 */
	void enterLogicoOu(csParser.LogicoOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#logicoOu}.
	 * @param ctx the parse tree
	 */
	void exitLogicoOu(csParser.LogicoOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#logicoE}.
	 * @param ctx the parse tree
	 */
	void enterLogicoE(csParser.LogicoEContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#logicoE}.
	 * @param ctx the parse tree
	 */
	void exitLogicoE(csParser.LogicoEContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void enterIgualdade(csParser.IgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void exitIgualdade(csParser.IgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(csParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(csParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(csParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(csParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(csParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(csParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(csParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(csParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(csParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(csParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#acesso}.
	 * @param ctx the parse tree
	 */
	void enterAcesso(csParser.AcessoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#acesso}.
	 * @param ctx the parse tree
	 */
	void exitAcesso(csParser.AcessoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#thisRef}.
	 * @param ctx the parse tree
	 */
	void enterThisRef(csParser.ThisRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#thisRef}.
	 * @param ctx the parse tree
	 */
	void exitThisRef(csParser.ThisRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(csParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(csParser.TipoContext ctx);
}