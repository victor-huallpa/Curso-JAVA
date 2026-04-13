package ejercicios;

public class ConrParImpar {

    public static int[] contParImpar(int[] arr){
        int[] parImp = {0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                parImp[0] ++;
                continue;
            }
            parImp[1]++;
        }

        return parImp;
    }
}
