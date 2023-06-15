package ast;

import libs.Node;

import java.io.PrintWriter;
import java.util.Objects;

public class Theme extends Node {
    private final String themeName;
    public Theme(String themeName) {
        this.themeName = themeName;
    }

    String theme1 =  """
            <link rel= stylesheet href= ./themeA.css >
            """;

    String theme2 = """
            <link rel= stylesheet href= ./themeB.css >
            """;
    String theme3 = """
            <link rel= stylesheet href= ./themeC.css >
            """;

    @Override
    public void evaluate(PrintWriter writer) throws Exception {
        if (Objects.equals(themeName, "themeA"))
            writer.println(theme1);
        else if (Objects.equals(themeName, "themeB"))
            writer.println(theme2);
        else if (Objects.equals(themeName, "themeC"))
            writer.println(theme3);
        else
            throw new Exception("We currently only support 3 themes. Please choose themeA, themeB, or themeC.");
    }

}
