package dz.ro.graphthreory.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphOriente extends Graph{
    public GraphOriente(){
        super();
    }

    public GraphOriente(List<Sommet> x, List<Arc> u){
        super(x, u);
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

    private List<Sommet> getListSommetNoNMarque(ArrayList<List<Sommet>> pred) {
        List<Sommet> l = new ArrayList<Sommet>();
        for (List<Sommet> p : pred) {
            //if(p.isEmpty())
        }
        return l;
    }

    public List<Sommet> enNiveaux() {
        int niveau = 0;
        List<Sommet> list_sommet_niveau = new ArrayList<>();
        ArrayList<List<Sommet>> list_pred = new ArrayList<List<Sommet>>();
        for (Sommet s : X) {
            list_pred.add(predOf(s));
        }
        while (!list_pred.isEmpty()) {
            List<Sommet> list_sommet_non_marque;
        }
        return list_sommet_niveau;
    }

    public int demiDegInter(Sommet sommet){
        return succOf(sommet).size();
    }

    public int demiDegExter(Sommet sommet){
        return predOf(sommet).size();
    }

    public int degre(Sommet sommet){
        return demiDegInter(sommet) + demiDegExter(sommet);
    }

    public void printSuccPredAdjsList(){
        System.out.println("List des succ/préd/adjs:");
        for(Sommet s : X){
            System.out.println("\t*"+s.toString());
            System.out.print("\t\tSucc="+succOf(s).toString());
            System.out.print("\n\t\tPred="+predOf(s).toString());
            System.out.println("\n\t\tAdjs="+adjs(s).toString());
        }
        System.out.println("-------------------------------");
    }

    public void printSDegIntExt(){
        System.out.println("List des semi_deg_int/ext/degré:");
        for(Sommet s : X){
            System.out.println("\t*"+s.toString());
            System.out.print("\t\tSD_inter="+demiDegInter(s));
            System.out.print("\n\t\tSD_exter="+demiDegExter(s));
            System.out.println("\n\t\tdegre="+degre(s));
        }
        System.out.println("-------------------------------");
    }
}
