// Generated from cs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(csParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(csParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#membroClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembroClasse(csParser.MembroClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(csParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#parametroLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroLista(csParser.ParametroListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(csParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(csParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(csParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(csParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(csParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#ifInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstrucao(csParser.IfInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#whileInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstrucao(csParser.WhileInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#forInstrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInstrucao(csParser.ForInstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(csParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(csParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(csParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMetodo(csParser.ChamadaMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#argumentoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentoLista(csParser.ArgumentoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(csParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#logicoOu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoOu(csParser.LogicoOuContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#logicoE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoE(csParser.LogicoEContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#igualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdade(csParser.IgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#comparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacao(csParser.ComparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(csParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(csParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(csParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimario(csParser.PrimarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcesso(csParser.AcessoContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#thisRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisRef(csParser.ThisRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link csParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(csParser.TipoContext ctx);
}