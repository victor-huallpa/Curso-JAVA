import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clsUsuario {

    //atributos
    private String nom;
    private int edad;
    private String correo;
    private Pattern patExpReg;
    private Matcher matcher;

    //consturctor
    public clsUsuario() {
        this.nom = "";
        this.edad = 0;
        this.correo = "";
        this.patExpReg = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    //metodos

    public String getNom() {
        return nom;
    }

    public int getEdad(int edad) {

        return edad; //devuelve el atributo evaluado a una variables
    }

    public String getCorreo() {
        return correo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <= 110){
            this.edad = edad;
        }else {
            System.out.println("La edad debe estar entre 1 e c110");
        }
//        (edad > 0 && edad <= 110) ? this.edad = edad : System.out.println("La edad debe estar entre 1 y 110");
    }

    public void setCorreo(String correo) {
        Matcher relacionador = patExpReg.matcher(correo);
        if (relacionador.matches()){
            this.correo = correo;
        }else{
            System.out.println("ERROR: Correo invalido.");
        }
    }
}
