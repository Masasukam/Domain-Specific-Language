// Generated from D:/UBC/CPSC410/cpsc410_project1_team1/src/parser\HtmlParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(HtmlParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(HtmlParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(HtmlParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(HtmlParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(HtmlParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(HtmlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost(HtmlParser.CostContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(HtmlParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HtmlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(HtmlParser.EmailContext ctx);
}