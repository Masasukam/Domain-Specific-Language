package ast;

import libs.Node;

import java.io.PrintWriter;

public class Row extends Node {
    private final Item item;

    public Row(Item item) {
        this.item = item;
    }

    @Override
    public void evaluate(PrintWriter writer) throws Exception {
        writer.println();
        this.item.evaluate(writer);
    }
}
