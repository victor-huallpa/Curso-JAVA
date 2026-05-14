package ejercicios;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        //SECUENCIA DE ESPACPE.
        System.out.println("\"SECUENCIAS DE ESCAPE\"");
        System.out.println("Comilla doble");
        System.out.print("\\\"\n");
        System.out.print("Hello");
        System.out.println("Comillas simple");
        System.out.print("\\\'\n");
        System.out.print("\'linea 1\'\n");
        System.out.println("Barra invertida");
        System.out.print("\\\\ \n");
        System.out.print("linea 1\\linea 2\n");
        System.out.println("Salto de linea");
        System.out.print("\"\\n\"\n");
        System.out.print("linea 1\nlinea 2\n");
        System.out.println("Tabulacion");
        System.out.print("\"\\t\"\n");
        System.out.print("nombre:\tJuan\n");

        //ejercicio.
        System.out.println("\n\nNombre:\tJuan\nEdad:\t20\nRuta\tc:\\user\\Juan ");

    }
}