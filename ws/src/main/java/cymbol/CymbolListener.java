// Generated from Cymbol.g4 by ANTLR 4.9.2
package cymbol;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CymbolParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CymbolParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CymbolParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CymbolParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CymbolParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CymbolParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CymbolParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CymbolParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExp(CymbolParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExp(CymbolParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CymbolParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CymbolParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolParser.ExprListContext ctx);
}