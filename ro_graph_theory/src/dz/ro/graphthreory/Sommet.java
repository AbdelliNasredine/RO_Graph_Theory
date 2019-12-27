package dz.ro.graphthreory;

public class Sommet {
    private int valeur;

    public Sommet(int valeur){
        this.valeur = valeur;
    }

    public int get(){
        return valeur;
    }

    public void set(int valeur) {
        this.valeur = valeur;
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
