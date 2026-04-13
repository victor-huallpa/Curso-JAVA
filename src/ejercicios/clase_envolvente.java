package ejercicios;

public class clase_envolvente {
    //CLASES ENVOLVENTES
    /*
    Las clases envolventes lo que hacen es convertir un tipo de dato a objeto, esto se realiza de dos formas
    autoboxing y unboxing
     */


    public static  void main(String[] args){
        //AUTOBOXING
        int nume = 10;
        Integer objNum = nume;
        boolean ok = true;
        Boolean objB = ok;
        char michar = 'H';
        Character objC = michar;
        byte miByte = 12;
        Byte objBy = miByte;
        short miShort = 1234;
        Short objS = miShort;
        long miLong = 234523452345L;
        Long objL = miLong;
        float miFloat = 1.3443f;
        Float objF = miFloat;
        double miDouble = 23.3435345;
        Double objD = miDouble;


        //UNBOXING
        Integer objNum1 = 15;
        Boolean objB1 = true;
        Character objC1 = 'G';
        Byte objBy1 = 12;
        Short objS1 = 456;
        Long objL1 = 15643165465L;
        Float objF1 = 1534.15f;
        Double objD1 = 15.165464798;
        String objT = "hello";


        System.out.printf("numero: %d\n",objNum);
        System.out.printf("numero: %f\n",objF);
        System.out.printf("valor: %b\n",objBy1);
        System.out.printf("numero: %f\n",objD1);

        //Metodos para las clases envolventes.


    }

}
