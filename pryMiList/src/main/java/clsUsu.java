import java.util.Scanner;

public class clsUsu {

    //ATRIBUTOS
    private String nom;
    private String ape;
    private int edad;
    private double est;

    //constructor
    public clsUsu() {
        this.nom = "";
        this.ape = "";
        this.edad = 0;
        this.est = 0.0;
    }

    //ATRIBUTOS
    public void setDa(){
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nom = ing.nextLine();
        System.out.println("Ingrese su apellidos: ");
        ape = ing.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = ing.nextInt();
        System.out.println("Ingrese su estatura: ");
        est = ing.nextDouble();
    }

    public void mosDa(){
        System.out.println("Buenos dias "+nom+" "+ape);
        System.out.println("Tu edad: "+edad);
        System.out.println("Tu estatura es: "+est);
    }
}
