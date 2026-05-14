package ejercicios;

import java.util.Scanner;

public class Login {
    final private int PIN = 3456;

    //constructor
    Login(){

    }

    public int getPin(){
        return PIN;
    }

    //pedir datos y msotar intentos
    public static String datos(Scanner cs, int contador, int intentos){
        System.out.println("-----------------");
        System.out.printf("Intentos: %d\n",intentos-contador);
        System.out.println("-----------------");
        System.out.println("Ingrese su PIN: ");

        return cs.nextLine();
    }

    //Tiempo para procesar
    public static void proccesTime(int tiempo, String messages){
        try {
            System.out.println(messages);
            Thread.sleep(tiempo);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //validando Ingreso de usuario
    public static boolean validateUser(int pin, int pinU){
        if (pinU == pin){
            System.out.println("Desbloqueado!...");
            return false;
        }else {
            System.out.println("PIN incorrecto\nVuelva a intentarlo.\n");
            return true;
        }
    }

}
