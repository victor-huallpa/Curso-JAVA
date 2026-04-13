package learning;

import java.util.Arrays;

public class Arreglos {
    //Atributo
    int[] numbers = new int[5];//unidimencional
    int[][] matriz = new int[3][3];//bidimenicnoal

    public Arreglos (){

    }

    public void arrUni(){
        //creando un arreglo unidimencional

        //Asignando valores al arreglo/modificar tambien
        numbers[0] = 12;
        numbers[1] = 1;
        numbers[2] = 23;
        numbers[3] = 54;
        numbers[4] = 11;

        //bucle for
        System.out.println("for comun.");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Arreglo valor "+(i+1) +": "+numbers[i]);;
        }
        //foretch itera el arreglo de acuerdo a la cantiada de elemetneo.
        System.out.println("foreatch.");
        for(int value : numbers){
            System.out.println("Numero: "+ value);
        }

        System.out.println(Arrays.stream(numbers).max());
    }

    public void arrBi(){
        //forma de llenar arreglo dimencional
        matriz[0][0] = 34;
        matriz[0][1] = 34;
        matriz[0][2] = 34;

        matriz[1][0] = 231;
        matriz[1][1] = 231;
        matriz[1][2] = 231;

        matriz[2][0] = 56;
        matriz[2][1] = 56;
        matriz[2][2] = 56;


        //iterar
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("fila %d; ",i+1);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
