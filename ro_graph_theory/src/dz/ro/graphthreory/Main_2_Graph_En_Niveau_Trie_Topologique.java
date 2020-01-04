package dz.ro.graphthreory;

import dz.ro.graphthreory.graph.ListAdjacence;
import dz.ro.graphthreory.graph.Sommet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_2_Graph_En_Niveau_Trie_Topologique {
    // le nombre totale des sommet
    static final int NB_SOMMET = 8;
    // la list des sommet:
    static Sommet[] ss = new Sommet[NB_SOMMET];
    // les listes d’adjacences
    static List<ListAdjacence> graph;

    static void init() {
        // creation des sommet:
        for (int i = 0; i < NB_SOMMET; i++) {
            ss[i] = new Sommet(i);
        }
        // creation de graph:
        graph = Arrays.asList(
                new ListAdjacence(ss[0], Arrays.asList(ss[1])),
                new ListAdjacence(ss[1], Arrays.asList(ss[7])),
                new ListAdjacence(ss[2], Arrays.asList(ss[0], ss[3], ss[5])),
                new ListAdjacence(ss[3], Arrays.asList(ss[7])),
                new ListAdjacence(ss[4], Arrays.asList(ss[2])),
                new ListAdjacence(ss[5], Arrays.asList(ss[3], ss[7], ss[6])),
                new ListAdjacence(ss[6], Arrays.asList(ss[0], ss[1])),
                new ListAdjacence(ss[7], null)
        );

    }

    static void calcDegInt() {
        for (Sommet s : ss) {
            for (ListAdjacence l : graph) {
                if (l.isInAdjList(s))
                    s.incrementDegreInter();
            }
        }
    }

    static boolean isSuccesur(Sommet s1, Sommet s2) {
        for (ListAdjacence l : graph) {
            if (l.getSommet().equals(s1) && l.isInAdjList(s2))
                return true;
        }
        return false;
    }

    static void triTopologique() {
        calcDegInt();
        List<Sommet> F = new ArrayList<Sommet>();
        System.out.println("Trie topologique:");
        for (Sommet s : ss)
            if (s.getDegreInter() == 0)
                F.add(s);
        while (!F.isEmpty()) {
            Sommet s1 = F.get(0);
            F.remove(0);
            System.out.print(s1.toString() + " |" + s1.niveau + "|" + "\n");
            for (Sommet s : ss) {
                if (isSuccesur(s1, s)) {
                    s.decrementDegreInter();
                    if (s.getDegreInter() == 0) {
                        F.add(s);
                        s.niveau = s.niveau < s1.niveau + 1 ? s1.niveau + 1 : s.niveau;
                    }
                }
            }
        }
    }

    static void printGraph() {
        System.out.println("S\t|D|\t|N|");
        System.out.println("-----------");
        for (Sommet s : ss) {
            s.print();
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        init();
        System.out.println("|#| = niveau de chaque sommet");
        System.out.println("list d'adjacence (Graph):");
        System.out.println("\t" + graph.toString());
        triTopologique();
    }
}
