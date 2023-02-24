// Generated from Gps.g4 by ANTLR 4.9.2
package gps;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GpsParser}.
 */
public interface GpsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GpsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GpsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GpsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GpsParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GpsParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GpsParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GpsParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GpsParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GpsParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(GpsParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GpsParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(GpsParser.SequenceContext ctx);
}