package ast;

import libs.Node;

import java.io.PrintWriter;

public class Email extends Node {

    private final String email;
    private final String mid;
    private final String end;

    public Email(String email, String mid, String end) {
        this.email = email;
        this.mid = mid;
        this.end = end;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMid() {
        return this.mid;
    }

    public String getEnd() {
        return this.end;
    }

    @Override
    public void evaluate(PrintWriter writer) {

    }
}
