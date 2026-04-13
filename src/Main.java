
import learning.Arreglos;
import learning.Listas;

import ejercicios.EncontrarMayorMenor;
public class Main {
    public static void main(String[] args){
        //forma en al que no inicializas con elementos
//        int[] numbers = new int[5];

        //inicializando con elementos
        int[] numbers = {12,3,43,65,13,234,0};

        System.out.println();

        Arreglos arr = new Arreglos();
        Listas lis = new Listas();
        EncontrarMayorMenor res = new EncontrarMayorMenor();

        System.out.println("El mayor numero es: "+res.mayor(numbers));
        System.out.println("El menor numero es: "+res.menor(numbers));
//        arr.arrBi();
//        lis.arrList();
        System.out.println("Hello!!");

        //configurar el raton con ctl para minimizar o maximizar el codigo en size.
    }
}
