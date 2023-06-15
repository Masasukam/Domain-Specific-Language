package ast;

import libs.Node;

import java.io.File;
import java.io.PrintWriter;
import java.util.Objects;

public class Item extends Node {
    private final Path itemPath;
    private final String itemName;

    private final Cost itemCost;

    public Item(String itemName, Path itemPath, Cost itemCost) {
        this.itemName = itemName;
        this.itemPath = itemPath;
        this.itemCost = itemCost;
    }

    @Override
    public void evaluate(PrintWriter writer) throws Exception {
        writer.println("<div class = sale1>");
        writer.println("<div class = \"cc\"><h3>"+itemName+"</h3><h3>"+"$"+itemCost.getPrice()+"</h3></div>");
        writer.println("<br>");
        writer.println("<div class= sale >");
        itemPath.evaluate(writer);

        File directoryPath = new File(itemPath.getPathStr());
        String[] contents = directoryPath.list();

        System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < Objects.requireNonNull(contents).length; i++) {
            if(contents[i].equals(".DS_Store")) {
                continue;
            }
            System.out.println(contents[i]);
            String id = "'" + itemName + '_' + itemPath.getPathStr() + "_" + contents[i] + "'";
            String click = " onclick = " + "\"clickImage("+id+")\"";
            String src = "src = " + itemPath.getPathStr()  + "/" + contents[i];

            if(i == 0){
                id = "\"" + itemName  + "_main\"";
                writer.println("<div class = \"gg\"> <img "+ src + click +" id = " + id + "/>"+  "</div>");
                continue;
            }
            writer.println("<div class = \"aa\"> <img "+ src + click +" id = " + id + "/>" + "</div>");
        }


        writer.println("</div>");
        writer.println("</div>");
        writer.println(" <br><br>\n" +
                "  <br><br>");
    }
}
