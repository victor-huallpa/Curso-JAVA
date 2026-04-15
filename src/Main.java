
import ejercicios.InvertirArr;
import ejercicios.EncontrarMayorMenor;
import ejercicios.ConrParImpar;
import ejercicios.DeleteDuplicate;
import ejercicios.SumMatriz;
import ejercicios.DiagonalM;
import ejercicios.TransponerM;
import learning.Arreglos;
import learning.Listas;

import ejercicios.EncontrarMayorMenor;
public class Main {
    public static void main(String[] args){
        //forma en al que no inicializas con elementos
//        int[] numbers = new int[5];

        //inicializando con elementos
        int[] numbers = {12,43,43,65,13,234,0,44,13};
        int[][] numbersM = {
                {2,3,5},{5,7,6},{45,34,15},{456,45,23,90,100}
        };

        System.out.println();

        Arreglos arr = new Arreglos();
        Listas lis = new Listas();
        EncontrarMayorMenor res = new EncontrarMayorMenor();
        InvertirArr inver = new InvertirArr();
        ConrParImpar con = new ConrParImpar();
        DeleteDuplicate dell = new DeleteDuplicate();
        SumMatriz sumM = new SumMatriz();
        DiagonalM diagon = new DiagonalM();
        TransponerM trans = new TransponerM();

        trans.transponerM(numbersM);
//        diagon.matrizD(numbersM);
//        System.out.println("la suma es: "+ sumM.sumaM(numbersM));
//        dell.dele(numbers);
//        System.out.println();
//        int[] parIm = con.contParImpar(numbers);
//        System.out.printf("Pares: %d\nImpares: %d\n",parIm[0],parIm[1]);
//        System.out.println("El mayor numero es: "+res.mayor(numbers));
//        System.out.println("El menor numero es: "+res.menor(numbers));
//        arr.arrBi();
//        lis.arrList();
//        System.out.println("Arreglo original");
//        inver.iter(numbers);
//        inver.inver(numbers);
//        System.out.println("\n\nArreglo invertido");
//        inver.iter(numbers);

//        int num = 7;
//        System.out.println(num/2);
        System.out.println("\n\nHello!!");

        //configurar el raton con ctl para minimizar o maximizar el codigo en size.
    }
}
