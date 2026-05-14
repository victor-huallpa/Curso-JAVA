import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean continuar = true;
        String[] tipos = {"nombre", "apellido", "edad", "estatura"};

        //lista de objetos de usaurio
        List<clsUsuario> ObjUsus = new ArrayList<>();

        //escaner para obenteer datos de terminal
        Scanner ing = new Scanner(System.in);

        while (continuar) {
            String[] usu = leerDatUsu(tipos);
            creaUsu(usu, ObjUsus);

            System.out.println("¿Desea agregar otro usuario? (s/n): ");
            String resp = ing.nextLine();

            if (resp.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        mostUsu(ObjUsus, 1);

        System.out.println("\nTotal usuarios: " + ObjUsus.size());
    }

    public static String pedDatUsu(String tipo){
        String dato;
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese su "+tipo+": ");
        dato = ing.nextLine();

        //validar que no sea nulo o vacio
        if (dato == null || dato.trim().isEmpty()) {
            System.out.println("Dato invalido.\nIntentelo de nuevo!");
            return "error";
        }
        return dato;
    }


    public static void creaUsu(String[] datos, List<clsUsuario> ObjUsus){
        clsUsuario u = new clsUsuario();

        u.setNom(datos[0]);
        u.setApe(datos[1]);
        u.setEdad(Integer.parseInt(datos[2]));
        u.setEst(Double.parseDouble(datos[3]));

        ObjUsus.add(u);
    }


    public static String[] leerDatUsu(String[] tipos) {

        String[] usu = new String[tipos.length];
        String dato;

        for (int i = 0; i < tipos.length; i++) {
            dato = pedDatUsu(tipos[i]);

            if ("error".equals(dato)) {
                i--;
                continue;
            }

            if (i == 2 || i == 3) {
                try {
                    if (i == 2) {
                        Integer.parseInt(dato);
                    } else {
                        Double.parseDouble(dato);
                    }
                } catch (NumberFormatException e) {
                    if (i == 2) {
                        System.out.println("Ingrese una edad válida (entero)");
                    } else {
                        System.out.println("Ingrese una estatura válida (decimal)");
                    }
                    i--;
                    continue;
                }
            }

            usu[i] = dato;
        }

        return usu;
    }


    public static void mostUsu(List<clsUsuario> objUsus, int indi){
        System.out.println("USUARIO " + (indi + 1));

        System.out.println("Nombre completo: "
                + objUsus.get(indi).getNom() + " "
                + objUsus.get(indi).getApe());

        System.out.println("Edad: " + objUsus.get(indi).getEdad());
        System.out.println("Estatura: " + objUsus.get(indi).getEst());
    }

}
