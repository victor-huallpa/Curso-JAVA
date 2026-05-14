public class clsPr {
    private final String nom;
    private final double pre;
    private final int cant;

    public clsPr(String nom, double pre, int cant) {
        this.nom = nom;
        this.pre = pre;
        this.cant = cant;
    }

    public String getNom() {
        return nom;
    }
    public double getTotal(){
        return pre*cant;
    }

}
