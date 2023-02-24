// Generated from Json.g4 by ANTLR 4.9.2
package json;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JsonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JsonParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(JsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(JsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInt(JsonParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInt(JsonParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBool(JsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBool(JsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNull(JsonParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link JsonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNull(JsonParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JsonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JsonParser.PairContext ctx);
}