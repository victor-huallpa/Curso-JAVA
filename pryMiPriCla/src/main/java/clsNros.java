public class clsNros {
    private int enteros;
    private float flotante;
    private double dobPress;
    private long entLargo;
    //constructores
    public clsNros() {
        enteros = 0;
        flotante = 0.0f;
        dobPress = 0.0;
        entLargo = 0;
    }

//    public clsNros(int interos, long entLargo){
//        this.enteros = enteros;
//        this.entLargo = entLargo;
//    }


    public clsNros(double dobPress, float flotante) {
        this.dobPress = dobPress;
        this.flotante = flotante;
    }

    //Metodos
    public void mostrarAtrib(){
        System.out.println("Mostar Atributo: "+ enteros);
        System.out.println("Segundo Atributo: "+ flotante);
        System.out.println("Tercero Atributo: "+ dobPress);
        System.out.println("Cuarto Atributo: "+ entLargo);
    }

    public void mostTamAtrib(){
        System.out.println("Tam. Mostar Atributo entero: "+ Integer.BYTES + "B");//B bytes and b bits
        System.out.println("Tam. Segundo Atributo flotante: "+ Float.BYTES + "B");
        System.out.println("Tam. Tercero Atributo double: "+ Double.BYTES + "B");
        System.out.println("Tam. Cuarto Atributo long: "+ Long.BYTES + "B");
    }
}
