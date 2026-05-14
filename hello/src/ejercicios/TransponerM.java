package ejercicios;

public class TransponerM {

    public static void transponerM(int[][] arr){
        int filas = arr.length;
        int maxColumnas = 0;

        for (int i = 0; i < filas; i++) {
            if (maxColumnas < arr[i].length) maxColumnas = arr[i].length;
        }

        int[][] arrT = new int[maxColumnas][filas];

        for (int i = 0; i < maxColumnas; i++) {
            for (int j = 0; j < filas ; j++) {
                if (i < arr[j].length)arrT[i][j] = arr[j][i];
                else arrT[i][j] = 0;
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
