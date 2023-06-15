package ast;

import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Section extends Node {

    public String getSectionName() {
        return sectionName;
    }

    public List<Row> getRows() {
        return rows;
    }

    private final String sectionName;
    private final List<Row> rows;

    public Section(String sectionName, List<Row> rows) {
        this.sectionName = sectionName;
        this.rows = rows;
    }

    @Override
    public void evaluate(PrintWriter writer) throws Exception {

        writer.println("<div class = " + this.sectionName+ "\t"+"id = " + this.sectionName+ "1>\n" +
                "  <div class = \"dd\"  >\n" +
                "  <button id = "+ this.sectionName + " onclick = clickButton('"+ this.sectionName +"')"+ ">"+this.sectionName+"</button>\n" +
                "  </div>");
        writer.println("  <br><br>\n" +
                "  <br><br>\n" +
                "  <br><br>");

        for (Row r : rows){
            r.evaluate(writer);
        }
        writer.println("</div>");
    }
}
