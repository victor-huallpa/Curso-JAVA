import java.util.Scanner;

public class cslUsuario {
    //nombre apellido edad y estatura con inicializacion// crear el ingreso de datos de usuario
    //metodo para crear o ingresar datos del usuario
    private String nom;
    private String ape;
    private int edad;
    private double est;

    public cslUsuario() {
        this.nom = "";
        this.ape = "";
        this.edad = 0;
        this.est = 0.0;
    }

    public void ingInfoUsu(){
        Scanner ent = new Scanner(System.in);
        System.out.println("ingrese el nombre de usuario: ");
        nom = ent.nextLine();
        System.out.println("ingrese el apellido de usuario: ");
        ape = ent.nextLine();
        System.out.println("ingrese la edad de usuario: ");
        edad = ent.nextInt();
        System.out.println("ingrese a estatura de usuario: ");
        est = ent.nextDouble();
    }

    public  void mostInfoUsu(){
        System.out.println("Buenos dias" + nom + " " + ape);
        System.out.println("Tu estatura es"  + est );
        System.out.println("Tu edad es: " + edad);
    }

}
