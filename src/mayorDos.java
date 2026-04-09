import java.util.Scanner;
public class mayorDos {

    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int num[] = {0,0};

        int contador = 0;
        do {
            System.out.printf("Ingrese un numero:\t");
            num[contador] = cs.nextInt();
            contador++;
        }while (contador<2);

        System.out.printf("El mayor de %d y %d es:\t%d",num[0],num[1],Integer.max(num[0],num[1]));


    }

}
