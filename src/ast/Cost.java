package ast;

import libs.Node;

import java.io.PrintWriter;

public class Cost extends Node {

    private final float price;

    public Cost(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public void evaluate(PrintWriter writer) {

    }
}
