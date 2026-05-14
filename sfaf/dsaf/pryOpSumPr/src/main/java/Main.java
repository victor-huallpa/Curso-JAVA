import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        clsVen venta = new clsVen();

        System.out.println("Cantidad de productos: ");
        int n = ent.nextInt();
        ent.nextLine();

        String nom = "";
        double pre = 0.0;
        int cant = 0;

        for( int i=0; 1<n; i++){
            System.out.println("\nNombre: ");
            nom = ent.nextLine();
            System.out.println("Precio: ");
            pre = ent.nextDouble();
            System.out.println("Cantidad: ");
            cant = ent.nextInt();
            ent.nextLine();

            clsPr p= new clsPr(nom, pre, cant);
            venta.agrePr(p);
        }

        System.out.println("\n===== PRODUCTOS (S/. Totales =====");
        venta.mostPr();

        System.out.println("\nTOTAL GENERAL: S/. " + venta.calTotal());

        if (n>2){
            System.out.println("\nTotal de los dos primeros productos ");
            System.out.println("S/. " +
                    venta.calTotal(
                            venta.getPr(0),
                            venta.getPr(1)
                    )

                    );
        }
        System.out.println("\nTotal con descuento (primer producto)");
        System.out.println("S/. " +
                venta.calTotal(
                        venta.getPr(0), 10)
                );
    }
}
