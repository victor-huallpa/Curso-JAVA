public class metodosEnvolventes {
    public static void main(String[] args){
        //los variables envolventes contienen metodos que ayudan a realizar acciones con los datos primitivos.
        //INTEGER
        Integer num = 10;

        String tex = num.toString();//convierte a string el dato
        int miNum = num.intValue(); //devuelve el valor del envolvente
        System.out.printf("texto :\t%s\n",tex);
        System.out.printf("tipo :\t%s\n",tex.getClass().getName());//para ver el tipo de dato de un envolvente o variables primitivas
        int num2 = Integer.parseInt(tex);//lo convierte a int
        Integer num3 = Integer.valueOf(tex);//lo convierte a integer
        System.out.printf("Tipo:\t%s\n", ((Object)num2).getClass().getName());
        System.out.printf("Tipo:\t%s\n", num3.getClass().getName());//tener cuidado con el formatear y el tipo de datos que estas usando.

        int num5 = 16;
        int num6 = 15;

        System.out.printf("el mayor valor es:\t%d\n", Integer.max(num5, num6));//maximo valor
        System.out.printf("el minimo valor es:\t%d\n", Integer.min(num5, num6));//minimo valor
        System.out.printf("la suma es:\t%d\n", Integer.sum(num5, num6));//suma de dos valores valor
        System.out.printf("comparcion es:\t%d\n", Integer.compare(num5, num6));//minimo valor


    }
}
