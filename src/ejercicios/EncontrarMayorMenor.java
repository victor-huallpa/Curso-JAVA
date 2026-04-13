package ejercicios;

public class EncontrarMayorMenor {


    public static int menor(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }

    public int mayor(int[] arr){
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }

        return temp;
    }
}
