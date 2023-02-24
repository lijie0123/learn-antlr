// Generated from rlang.g4 by ANTLR 4.9.2
package rlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rlangParser}.
 */
public interface rlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(rlangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(rlangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(rlangParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(rlangParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(rlangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(rlangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(rlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(rlangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(rlangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(rlangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#formList}.
	 * @param ctx the parse tree
	 */
	void enterFormList(rlangParser.FormListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#formList}.
	 * @param ctx the parse tree
	 */
	void exitFormList(rlangParser.FormListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(rlangParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(rlangParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#subList}.
	 * @param ctx the parse tree
	 */
	void enterSubList(rlangParser.SubListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#subList}.
	 * @param ctx the parse tree
	 */
	void exitSubList(rlangParser.SubListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlangParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(rlangParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlangParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(rlangParser.SubContext ctx);
}