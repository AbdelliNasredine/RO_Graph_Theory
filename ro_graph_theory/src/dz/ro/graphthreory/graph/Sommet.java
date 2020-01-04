package dz.ro.graphthreory.graph;

public class Sommet {
    private int valeur;
    public int niveau = 0;
    private int degreInter = 0;

    public Sommet(int valeur){
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void incrementDegreInter() {
        degreInter++;
    }

    public void decrementDegreInter() {
        degreInter--;
    }

    public int getDegreInter() {
        return degreInter;
    }

    public void print() {
        System.out.println(this.toString() + "\t|" + degreInter + "|\t|" + niveau + "|");
    }

    @Override
    public String toString() {
        return "S" + (valeur + 1);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Sommet) obj).getValeur() == this.valeur;
    }
}
