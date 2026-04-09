public class structurasControl {
    public static void main(String[] args){
        Integer objN = -15;

        if(objN.equals(10) && Integer.valueOf(objN) < 15 && Integer.valueOf(objN) > 0){
            System.out.printf("Vale:\t%d\n",Integer.valueOf(objN));

        } else if (objN.equals(15) && Integer.valueOf(objN) <= 20) {
            System.out.printf("Vale:\t%d\n",Integer.valueOf(objN));
        }else System.out.printf("el valor:\t%d no esta en el rango especificado\n",Integer.valueOf(objN));

        for (int i=5;i>0;i--){
            System.out.println("Contando;"+i);
        }
    }


}
