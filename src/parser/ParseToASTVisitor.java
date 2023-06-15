package parser;

import ast.*;
import libs.Node;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ParseToASTVisitor extends HtmlParserBaseVisitor<Node>{
    @Override public Program visitProgram(HtmlParser.ProgramContext ctx) {
        Title title = visitTitle(ctx.title());
        Theme theme = visitTheme(ctx.theme());
        List<Section> sections = new ArrayList<>();
        Name name = visitName(ctx.name());
        for (HtmlParser.SectionContext section : ctx.section()) {
            sections.add(visitSection(section));
        }
        return new Program(title, theme, sections, name );
    }

    @Override public Section visitSection(HtmlParser.SectionContext ctx) {
        List<Row> rows = new ArrayList<>();
        for (HtmlParser.RowContext row : ctx.row()) {
            rows.add(visitRow(row));
        }
        return new Section(ctx.TEXT().getText(), rows);
    }

    @Override public Title visitTitle(HtmlParser.TitleContext ctx) { return new Title(ctx.TEXT().getText()); }

    @Override public Row visitRow(HtmlParser.RowContext ctx) {
        Item item = visitItem(ctx.item());
        return new Row(item);
    }

    @Override public Item visitItem(HtmlParser.ItemContext ctx) {
        Path path = visitPath(ctx.path());
        try{
            Cost cost = visitCost(ctx.cost());
            Cost decimal = visitDecimal(ctx.decimal());
            float finalDecimal = decimal.getPrice();
            if (finalDecimal < 10)
                finalDecimal /= 10;
            else
                finalDecimal /= 100;
            Cost finalCost = new Cost(cost.getPrice() + finalDecimal);
            return new Item(ctx.TEXT().getText(), path, finalCost);
        }catch(Exception e){
            throw new NumberFormatException("Had trouble reading the prices. Please make sure all prices are in format XX.XX");
        }
    }

    @Override public Path visitPath(HtmlParser.PathContext ctx) { return new Path(ctx.PATH().getText()); }

    @Override public Cost visitCost(HtmlParser.CostContext ctx) {
        int price = Integer.parseInt(ctx.NUM().getText());
        return new Cost(price);
    }

    @Override public Cost visitDecimal(HtmlParser.DecimalContext ctx) {
        if (ctx == null)
            return new Cost(0);
        int decimal = Integer.parseInt(ctx.TEXT().getText());
        return new Cost(decimal);
    }

    @Override public Name visitName(HtmlParser.NameContext ctx) {
        Email email = visitEmail(ctx.email());
        return new Name(ctx.TEXT().getText(), email);
    }

    @Override public Email visitEmail(HtmlParser.EmailContext ctx) {
        List<TerminalNode> parts = ctx.TEXT();
        String email = parts.get(0).getText();
        String mid = parts.get(1).getText();
        String end = parts.get(2).getText();
        return new Email(email, mid, end);
    }

    @Override public Theme visitTheme(HtmlParser.ThemeContext ctx) {
        if (ctx == null)
            return new Theme("ThemeA");
        return new Theme(ctx.TEXT().getText());
    }
}
