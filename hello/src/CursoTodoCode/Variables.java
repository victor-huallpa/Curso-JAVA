package CursoTodoCode;

import java.util.Scanner;

public class Variables {
    public static void misVariables(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;

        //Pidiendo datos
        System.out.println("Ingrese el primer nuemero: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese el primer numero: ");
        num2 = sc.nextInt();

        suma = num1 * num2;

        System.out.println("El resultado del multiiplicacion es: " + suma);
    }
}
