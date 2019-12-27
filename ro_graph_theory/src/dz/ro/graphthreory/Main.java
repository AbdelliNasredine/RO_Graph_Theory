package dz.ro.graphthreory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static GraphOriente init(){
        /* Sommets */
        Sommet s1 = new Sommet(1);
        Sommet s2 = new Sommet(2);
        Sommet s3 = new Sommet(3);
        Sommet s4 = new Sommet(4);
        /* Arcs */
        Arc arc1 = new Arc(s1,s2);
        Arc arc2 = new Arc(s1,s3);
        Arc arc3 = new Arc(s1,s4);
        Arc arc4 = new Arc(s4,s2);
        Arc arc5 = new Arc(s4,s2);
        /* U et X */
        List<Sommet> X = new ArrayList<Sommet>(){{ add(s1);add(s2);add(s3);add(s4); }};
        List<Arc> U = new ArrayList<Arc>() {{ add(arc1);add(arc2);add(arc3);add(arc4);add(arc5); }};
        return new GraphOriente(X,U);
    }

    public static void main(String[] args) {
        GraphOriente go = init();
        // aff le graph
        System.out.println(go.toString());

        // aff list succ/pred/adjs
        go.printSuccPredAdjsList();

        // aff degré/s_d_interieur/s_d_exterieur
        go.printSDegIntExt();
    }
}
