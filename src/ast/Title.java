package ast;

import libs.Node;

import java.io.PrintWriter;

public class Title extends Node {

    private final String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public void evaluate(PrintWriter writer) {
        writer.println("<div class = \"header\" id = \"home\">\n" +
                "  <h1>"+this.name+"</h1>\n" +
                "</div>\n" +
                "\n" +
                "<br><br>\n" +
                "<br><br>\n" +
                "<br><br>\n" +
                "<br><br>");

    }
}
