// Generated from D:/UBC/CPSC410/cpsc410_project1_team1/src/parser\HtmlParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(HtmlParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(HtmlParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(HtmlParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(HtmlParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(HtmlParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(HtmlParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(HtmlParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(HtmlParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(HtmlParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(HtmlParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(HtmlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(HtmlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#cost}.
	 * @param ctx the parse tree
	 */
	void enterCost(HtmlParser.CostContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#cost}.
	 * @param ctx the parse tree
	 */
	void exitCost(HtmlParser.CostContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(HtmlParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(HtmlParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HtmlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HtmlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(HtmlParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(HtmlParser.EmailContext ctx);
}