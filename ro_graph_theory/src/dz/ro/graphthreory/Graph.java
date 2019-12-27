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

    public List<Sommet> succOf(Sommet sommet) {
        List<Sommet> succ_List = new ArrayList<Sommet>();
        for(Arc arc : U) {
            if(!succ_List.contains(arc.getSommetFin()) && arc.getSommetDebut().equals(sommet))
                succ_List.add(arc.getSommetFin());
        }
        return succ_List;
    }

    public List<Sommet> predOf(Sommet sommet) {
        List<Sommet> pred_List = new ArrayList<Sommet>();
        for(Arc arc : U) {
            if(!pred_List.contains(arc.getSommetDebut()) && arc.getSommetFin().equals(sommet))
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

    public void printSuccPredAdjsList(){
        for(Sommet s : X){
            System.out.println(s.toString());
            System.out.print("\tSucc="+succOf(s).toString());
            System.out.print("\n\tPred="+predOf(s).toString());
            System.out.println("\n\tAdjs="+adjs(s).toString());
        }
    }

    @Override
    public String toString() {
        return "Graph" +
                "\n\tX= " + X +
                "\n\tU= " + U +
                "\n\tOrder= " + getOrdre();
    }
}
