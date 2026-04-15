package ejercicios;

public class DeleteDuplicate {

    public static void dele(int[] arr){
//        Integer[] arrI = conI(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j!=i) arr[j]=0;
            }
        }
        iter(arr);
    }

    private static void iter(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }

//    private static Integer[] conI(int[] arr){
//        Integer[] arrNew = new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrNew[i] = arr[i];
//        }
//        return arrNew;
//    }
}
