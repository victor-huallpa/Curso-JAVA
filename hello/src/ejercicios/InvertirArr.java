package ejercicios;

public class InvertirArr {

    public void inver(int[] arr){
        int temp ;
        int numIter = (arr.length/2);
        for (int i = 0; i < numIter; i++) {

                temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
        }

    }

    public static void iter(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }
}
