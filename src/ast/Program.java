package ast;

import libs.Node;

import java.io.PrintWriter;
import java.util.List;

public class Program extends Node {
    private final Title title;
    private final Theme theme;
    private final List<Section> sections;

    private final Name name;

    
    String startBeforeTheme = """
            <!DOCTYPE html>
            <html>
            <head>
            <title>shop</title>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://fonts.google.com/specimen/Macondo">
            """;
    String startAfterTHEME = """
            </head>
            <body>

            """;

    String navbarStart = """
              <div class = "navbar" >
              <ul>
               <li><a href="#home">Home</a></li>
               <li><a href="#footer">Contact Me</a><li>
            """;
    String navbarEnd = """
                </ul>
            </div>
            """;

    String end = """
              
                        
                        
            <script src = index.js>
                        
                        
            </script>
                      
            </body>
            </html>
            """;

    public Program(Title title, Theme theme, List<Section> sections, Name name) {
        this.title = title;
        this.theme = theme;
        this.sections = sections;
        this.name = name;
    }

    @Override
    public void evaluate(PrintWriter writer) throws Exception{
        String sectionPart = "";
        for(int i = 0,j = 1; i < sections.size(); i++,j++) {
            sectionPart += "<li><a href = #" + sections.get(i).getSectionName() + "1>"+ sections.get(i).getSectionName() + "</a></li>\n";
        }

        writer.println(startBeforeTheme);
        theme.evaluate(writer);

        writer.println(startAfterTHEME + navbarStart + sectionPart + navbarEnd);
        title.evaluate(writer);

        for (Section s : sections){
            s.evaluate(writer);
        }

        name.evaluate(writer);

        writer.println(end);
    }
}
