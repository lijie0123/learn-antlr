// Generated from Cppstat.g4 by ANTLR 4.9.2
package cppstat;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppstatParser}.
 */
public interface CppstatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppstatParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CppstatParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppstatParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CppstatParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppstatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CppstatParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppstatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CppstatParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppstatParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CppstatParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppstatParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CppstatParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppstatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CppstatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppstatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CppstatParser.ExprContext ctx);
}