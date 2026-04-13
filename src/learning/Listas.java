package learning;
import java.util.ArrayList;

public class Listas {

    public void arrList(){
        // se crea por referencia
        ArrayList<String> nombres = new ArrayList<>();//solo puede tener un tipo de dato

        //agregar elementos a un arraList
        nombres.add("Pedro");
        nombres.add("Juaquin");
        nombres.add("George");

        //Obtener dato de un arrayList
        System.out.println("\nObtener datos por indice.");
        System.out.println(nombres.get(0));

        //iterar con for un arrayList
        System.out.println("\nObtener datos por iteracion for.");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre "+(i+1)+": "+nombres.get(i));
        }

        //iterar con foreatch un arrayList
        System.out.println("Obtener datos con un Foretch\n");
        for (String value:nombres){
            System.out.printf("Nombre %s:\n",value);
        }

        //Borrar o remover un elemento de un arraylist
        System.out.printf("Numero de elementos del ArrayList: %d\nelemento 2: %s\n", nombres.size(),nombres.get(1));
        nombres.remove(1);
        System.out.printf("Numero de elementos del ArrayList: %d\nelemento 2: %s\n", nombres.size(),nombres.get(1));

        //Limpiar todo el ArrayList
        nombres.clear();
        System.out.println("elementos: "+nombres.size());

    }




}
