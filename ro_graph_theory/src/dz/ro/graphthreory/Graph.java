package dz.ro.graphthreory;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Sommet> X;
    private List<Arc> U;

    public Graph() {
        this.X = new ArrayList<Sommet>();
        this.U = new ArrayList<Arc>();
    }

    public Graph(List<Sommet> x, List<Arc> u) {
        X = x;
        U = u;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "\tX=" + X +
                "\n\tU=" + U +
                "\n}";
    }
}
