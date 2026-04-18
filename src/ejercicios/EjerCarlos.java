package ejercicios;

import java.util.ArrayList;

public class EjerCarlos {

    public static void carlitos(){
        int n = 4, f = 1;

        for (int i = 0 ; i < n ; i++){
            f*=i;
        }

        int[] arr = new int[f];
        for (int i = 0 ; i < n ; i++) {
            arr[0]+=(i+1)*Math.pow(10,n-1);

        }


        }
    }
}
