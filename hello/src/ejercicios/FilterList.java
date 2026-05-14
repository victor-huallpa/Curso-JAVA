package ejercicios;


import java.util.ArrayList;

public class FilterList {
    public static void filter(ArrayList<Integer> arr , int ma){
        ArrayList<Integer> mayores = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > ma ){
                System.out.print(arr.get(i)+", ");
            }
        }

    }

}
