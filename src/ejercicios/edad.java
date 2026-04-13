package ejercicios;

import java.util.Scanner;
public class edad {

    public static void main(String[] args){
        String edadS;
        Integer edad;
        boolean ver = true;

        Scanner cs = new Scanner(System.in);

        do {
            System.out.printf("Ingrese su ejercicios.edad:\t");
            edadS = cs.nextLine();

            if (!edadS.matches("-?\\d+")){
                System.out.println("Lo siento lo que ingresaste no es un numero valido.\nVuelve a intentarlo.\n");
                continue;
            }
            edad = Integer.parseInt(edadS);

            if (edad.intValue() == 0){
                System.out.println("Adios!!!\n");
                ver = false;
                break;
            }

            if (edad.intValue() < 18 && edad.intValue() > 0) {
                System.out.printf("Eres muy wawa regresa al cole!\n");
            } else if (edad.intValue() >= 18 && edad.intValue() <= 60) {
                System.out.printf("Eres mayor de ejercicios.edad, me agrada.\n");
            }else {
                System.out.printf("Lo siento tu rango de esta fuera de los limites permitidos.\n");
            }
        }while (ver);


    }



}
