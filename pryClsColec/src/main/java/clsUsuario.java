
public class clsUsuario {
    private String nom;
    private String ape;
    private int edad;
    private double est;


    public clsUsuario() {
        this.nom = "";
        this.ape = "";
        this.edad = 0;
        this.est = 0.0;
    }

    //METODOS

    //set edad
    public void setEdad(int edad) {

        if (edad > 0 && edad < 110) {
            this.edad = edad;
        }else{
            System.out.println("Edad invalidad.\nIntente de nuevo!");
        }
    }
    //set nombre
    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {

            this.nom = nom;
        }else{
            System.out.println("Nombre invalido\nIntente de nuevo!");
        }
    }
    //set apellido
    public void setApe(String ape) {
        if (ape != null && !ape.isEmpty()) {

            this.ape = ape;
        }else{
            System.out.println("Apellido invalido\nIntente de nuevo!");
        }
    }

    //set estatura
    public void setEst(double est) {
        if (est > 0.0 && est < 3.0) {
            this.est = est;
        }else{
            System.out.println("Estatura invalida.\nIntente de nuevo!");
        }
    }

    //get nombre
    public String getNom() {
        return nom;
    }

    //get apellido
    public String getApe() {
        return ape;
    }

    //get edad
    public int getEdad() {
        return edad;
    }

    //get estatura
    public double getEst() {
        return est;
    }

}
