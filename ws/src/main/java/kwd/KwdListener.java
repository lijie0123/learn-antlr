// Generated from Kwd.g4 by ANTLR 4.9.2
package kwd;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KwdParser}.
 */
public interface KwdListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KwdParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KwdParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KwdParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KwdParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KwdParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(KwdParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KwdParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(KwdParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KwdParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KwdParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KwdParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KwdParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KwdParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(KwdParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KwdParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(KwdParser.IdContext ctx);
}