package ejercicios;

public class TransponerM {

    public static void transponerM(int[][] arr){
        int[][] arrT = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                arrT[i][j]= arr[j][i];
            }
        }
        iter(arrT);
    }

    private static void iter(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
