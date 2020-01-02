package dz.ro.graphthreory.graph;

public class Sommet {
    private int valeur;
    private int niveau;

    public Sommet(int valeur){
        this.valeur = valeur;
    }

    public int get(){
        return valeur;
    }

    public void set(int valeur) {
        this.valeur = valeur;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "S"+valeur;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Sommet)obj).get() == this.valeur;
    }
}
