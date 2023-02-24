// Generated from prop.g4 by ANTLR 4.9.2
package prop;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link propParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface propVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link propParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(propParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link propParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(propParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(propParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sc}
	 * labeled alternative in {@link propParser#ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSc(propParser.ScContext ctx);
}