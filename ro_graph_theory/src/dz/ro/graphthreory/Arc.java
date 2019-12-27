package dz.ro.graphthreory;

public class Arc {
    private Sommet s1;
    private Sommet s2;

    public Arc(Sommet s1, Sommet s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public Sommet getSommetDebut(){
        return s1;
    }

    public Sommet getSommetFin(){
        return s2;
    }

    public void setSommetDebut(Sommet s1){
        this.s1 = s1;
    }

    public void setSommetFin(Sommet s2){
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "("+s1.toString()+","+s2.toString()+")";
    }
}
