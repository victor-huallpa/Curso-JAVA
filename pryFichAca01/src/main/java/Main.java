public class Main {
    public static void main(String[] args){
        //BOLETA DE NOTAS
        String nombre = "Victor";
        String curso = "Programacion Orientada Objetos";
        int nota1 = 12;
        int nota2 = 10;
        int nota3 = 9;
        int nota4 = 15;
        //calulos
        float promedio = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("=========BOLETA DE NOTA=======");
        System.out.println("Estudiante: "+nombre);
        System.out.println("Curso: "+curso);
        System.out.println("Nota mas alta: "+nota4);
        System.out.println("Nota mas baja: "+nota3);
        System.out.println("Promedio general: "+promedio);

        //PLANTILLADE SUELDO
        //variables
        String trabajador = "Victor Hugo Huallpa H.";
        int horaT =15;
        float pagoH = 10.00f;
        float descuento = 10/100; //descontando 10% del sueldo bruto
        // calculando
        float sueldoBruto = horaT*pagoH;
        float sueldo = sueldoBruto*descuento;

        System.out.println();
    }

}
