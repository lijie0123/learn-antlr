// Generated from prop.g4 by ANTLR 4.9.2
package prop;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link propParser}.
 */
public interface propListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link propParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(propParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link propParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(propParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link propParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(propParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link propParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(propParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 */
	void enterEq(propParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 */
	void exitEq(propParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sc}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 */
	void enterSc(propParser.ScContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sc}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 */
	void exitSc(propParser.ScContext ctx);
}