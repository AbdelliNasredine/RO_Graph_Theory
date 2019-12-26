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

    public List<Sommet> succOf(Sommet sommet) {
        List<Sommet> succ_List = new ArrayList<Sommet>();
        for(Arc arc : U) {
            if(arc.getSommetDebut().equals(sommet))
                succ_List.add(arc.getSommetFin());
        }
        return succ_List;
    }

    public List<Sommet> predOf(Sommet sommet) {
        List<Sommet> pred_List = new ArrayList<Sommet>();
        for(Arc arc : U) {
            if(arc.getSommetFin().equals(sommet))
                pred_List.add(arc.getSommetDebut());
        }
        return pred_List;
    }

    public List<Sommet> adjs(Sommet sommet){
        List<Sommet> adjs_List = succOf(sommet);
        for(Sommet s : predOf(sommet)){
            if(!adjs_List.contains(s))
                adjs_List.add(s);
        }
        return adjs_List;
    }

    @Override
    public String toString() {
        return "Graph" +
                "\n\tX=" + X +
                "\n\tU=" + U;
    }
}
