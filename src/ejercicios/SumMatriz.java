package ejercicios;

public class SumMatriz {

    public static int sumaM(int[][] arr){
        int result = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length; j++) {
                result+=arr[i][j];
            }
        }

        return  result;
    }
}
