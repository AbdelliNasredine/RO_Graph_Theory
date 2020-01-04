package dz.ro.graphthreory.graph;

import java.util.List;

public class ListAdjacence {
    Sommet s;
    List<Sommet> adjs;

    public ListAdjacence(Sommet s, List<Sommet> adjs) {
        this.s = s;
        this.adjs = adjs;
    }

    public boolean isInAdjList(Sommet s) {
        if (adjs == null)
            return false;
        return adjs.contains(s);
    }

    public Sommet getSommet() {
        return s;
    }

    public List<Sommet> getListSucc() {
        return adjs;
    }

    @Override
    public String toString() {
        return s.toString() + "=" + (adjs == null ? "[]" : adjs.toString());
    }
}
