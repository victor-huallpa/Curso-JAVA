//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("4. Ver resumen de ventas");
//        //Variables locales
//        int opcion;//para capturar l oque ingrese el usuario
//        boolean sisActi = true;//para que el sistema este actvo.
//
//        //creadno lista
//        ArrayList<clsProd> listaProd = new ArrayList<>();
//
//        //scaner(para capturar la entradad por la termnal
//        Scanner ing = new Scanner(System.in);
//
//
//        while(sisActi){
//            //creando menu de interfaz para la terminal
//            System.out.println("=======================================");
//            System.out.println("        SISTEMA DE VENTAS");
//            System.out.println("=======================================");
//            System.out.println("1. Ingresar producto");
//            System.out.println("2. Vender producto");
//            System.out.println("3. Mostrar productos");
//            System.out.println("4. Salir");
//            System.out.println("=======================================");
//            System.out.print("Seleccione una opción: ");
//            opcion = ing.nextInt();
//
//            //validando la opcion que el usuario ingresara(vendedor)
//
//            if (opcion == 1) {//opcion ingresar producto
//                System.out.println("Has elegido: Ingresar producto");
//
//                clsProd p = new clsProd();
//
//                System.out.print("Ingrese nombre: ");
//                ing.nextLine(); // limpiar buffer
//                String nombre = ing.nextLine();
//                p.setNomProd(nombre);
//
//                System.out.print("Ingrese precio: ");
//                float precio = ing.nextFloat();
//                p.setPrecio(precio);
//
//                System.out.print("Ingrese cantidad: ");
//                int cantidad = ing.nextInt();
//                p.setCantProd(cantidad);
//
//                listaProd.add(p);
//
//            } else if (opcion == 2) {//opcion vender producto
//                System.out.println("Has elegido: Vender producto");
//
//                if (listaProd.size() == 0) {
//                    System.out.println("No hay productos registrados");
//                } else {
//                    for (int i = 0; i < listaProd.size(); i++) {
//                        System.out.println(i + ". " );
//                        listaProd.get(i).mostProd();
//                    }
//
//                    System.out.print("Seleccione producto: ");
//                    int pos = ing.nextInt();
//
//                    System.out.print("Cantidad a vender: ");
//                    int cant = ing.nextInt();
//
//                    listaProd.get(pos).venta(cant);
//                }
//
//            } else if (opcion == 3) {//opcion mostrar productos
//                System.out.println("Has elegido: Mostrar productos");
//
//                if (listaProd.size() == 0) {
//                    System.out.println("No hay productos");
//                } else {
//                    for (int i = 0; i < listaProd.size(); i++) {
//                        System.out.println("Producto " + i+1);
//                        listaProd.get(i).mostProd();
//                        System.out.println("-------------------");
//                    }
//                }
//
//            } else if (opcion == 4) {
//                System.out.println("Saliendo del sistema...");
//                sisActi = false;
//
//            } else {
//                System.out.println("Opción no válida");
//            }
//        }
//
//
//        /*
//        NOTA:
//            - No uso switch porque aun no aprendidmos.
//            - Tengo tenclado ingles por ende no uso la "n" con "~".
//            - Disculpe si use While no me pude resister a que mi sistema estubiera en funcionamiento asta que el ususario
//              decida lo contrario.
//         */
//    }
//}
