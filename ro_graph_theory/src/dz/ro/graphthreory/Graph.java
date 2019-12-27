package dz.ro.graphthreory;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    // X = List des sommets
    public List<Sommet> X;
    // U = List des arc
    public List<Arc> U;

    public Graph() {
        this.X = new ArrayList<Sommet>();
        this.U = new ArrayList<Arc>();
    }

    public Graph(List<Sommet> x, List<Arc> u) {
        X = x;
        U = u;
    }

    public int getOrdre(){
        return X.size();
    }

    @Override
    public String toString() {
        return "Graph" +
                "\n\tX= " + X +
                "\n\tU= " + U +
                "\n\tOrder= " + getOrdre();
    }
}
