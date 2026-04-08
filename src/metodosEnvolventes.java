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

        //BOOLEAN
        Boolean objBool = true;

        boolean bool = objBool.booleanValue();
        String texB = objBool.toString();
        System.out.printf("Valor bolean:\t%b\n",objBool);
        System.out.printf("Valor String:\t%s\n",texB);
        System.out.printf("tipo:\t%s\n",texB.getClass().getName());
        System.out.printf("tipo:\t%b\n",Boolean.parseBoolean(texB));//convirtiendo texto a boleano
        System.out.printf("tipo:\t%b\n",Boolean.valueOf(texB));//convierte de texto a Boolean
        System.out.printf("comparacion:\t%b\n",Boolean.compare(objBool,false));

        //CHARARCTER
        Character c = 'A';

        System.out.printf("Es digito:\t%b\n", Character.isDigit(c));
        System.out.printf("Es caracter:\t%b\n", Character.isLetter(c));
        System.out.printf("Es mayuscula:\t%b\n", Character.isUpperCase(c));
        System.out.printf("Es minuscula:\t%b\n", Character.isLowerCase(c));
        System.out.printf("convertir a mayuscula:\t%b\n", Character.toUpperCase(c));
        System.out.printf("convertir a minuscula:\t%b\n", Character.toLowerCase(c));
        System.out.printf("tipo:\t%s\n",c.getClass().getName());



        char miC = c.charValue();
        System.out.printf("Obteniedo valor de Character:\t%c\n", miC);

        //SOUBLE/FLOAT
        Double objD = 10.5;

        double d = objD.doubleValue();
        String tex3 = objD.toString();

        System.out.printf("tipo:\t%s\n",tex3.getClass().getName());
        System.out.printf("double:\t%s\n",Double.parseDouble(tex3));// strting -> double
        System.out.printf("Double:\t%s\n",Double.valueOf(tex3));// strting -> Double
        System.out.printf("Es NaN:\t%b\n",Double.isNaN(objD));// veifica si es NaN
        System.out.printf("Es infinito:\t%b\n", Double.isInfinite(objD));








    }
}
