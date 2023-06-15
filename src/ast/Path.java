package ast;

import libs.Node;

import java.io.File;
import java.io.PrintWriter;

public class Path extends Node {
    private final String pathStr;

    public Path(String path) {
        this.pathStr = path;
    }

    public String getPathStr() {
        return pathStr;
    }

    @Override
    public void evaluate(PrintWriter writer) throws Exception {
        File directoryPath = new File(pathStr);
        String[] contents = directoryPath.list();
        if (contents == null) throw new Exception("Path " + pathStr + " does not exist.");
    }

}
