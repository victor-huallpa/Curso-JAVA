public class datos_primitivos{

    public static void main(String[] args) {

        // =========================
        // ENTEROS
        // =========================

        byte nivel = 100;
        // byte: entero muy pequeño
        // Tamaño: 8 bits (1 byte)
        // Rango: -128 a 127
        // Uso: raro, optimización de memoria

        short anio = 2025;
        // short: entero pequeño
        // Tamaño: 16 bits (2 bytes)
        // Rango: -32,768 a 32,767
        // Uso: poco común

        int edad = 25;
        // int: entero estándar (el más usado)
        // Tamaño: 32 bits (4 bytes)
        // Rango: -2^31 a 2^31 - 1
        // Uso: edades, contadores, cantidades

        long poblacion = 8000000000L;
        // long: entero grande
        // Tamaño: 64 bits (8 bytes)
        // Rango: -2^63 a 2^63 - 1
        // Uso: números muy grandes
        // Nota: termina en 'L'


        // =========================
        // DECIMALES
        // =========================

        float temperatura = 36.5f;
        // float: decimal de precisión simple
        // Tamaño: 32 bits (4 bytes)
        // Precisión: ~6-7 dígitos
        // Uso: poco común hoy
        // Nota: termina en 'f'

        double precio = 19.99;
        // double: decimal de doble precisión
        // Tamaño: 64 bits (8 bytes)
        // Precisión: ~15-16 dígitos
        // Uso: el más usado para decimales


        // =========================
        // CARÁCTER
        // =========================

        char inicial = 'J';
        // char: un solo carácter
        // Tamaño: 16 bits (2 bytes)
        // Rango: 0 a 65,535 (Unicode)
        // Uso: letras, símbolos


        // =========================
        // BOOLEANO
        // =========================

        boolean activo = true;
        // boolean: valor lógico
        // Tamaño: no definido exacto (depende de la JVM, suele ser 1 bit lógico)
        // Valores: true o false
        // Uso: condiciones y control de flujo


        // =========================
        // SALIDA
        // =========================

        System.out.println("byte nivel: " + nivel);
        System.out.println("short anio: " + anio);
        System.out.println("int edad: " + edad);
        System.out.println("long poblacion: " + poblacion);

        System.out.println("float temperatura: " + temperatura);
        System.out.println("double precio: " + precio);

        System.out.println("char inicial: " + inicial);
        System.out.println("boolean activo: " + activo);
    }
}