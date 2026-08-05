package com.ejercicios._2;

// 2. (Sencillo) Declara variables de todos los tipos primitivos y muestra sus valores.

public class VariablesTipoPrimitivo {
    public static void main(String[] args) {
        byte numeroPequeno = 100;          // Entero de 8 bits
        short numeroCorto = 30_000;        // Entero de 16 bits
        int numeroEntero = 2_000_000;      // Entero de 32 bits
        long numeroGrande = 9_000_000_000L; // Entero de 64 bits

        float decimalSimple = 3.14F;       // Decimal de 32 bits
        double decimalPreciso = 3.141592;   // Decimal de 64 bits

        char caracter = 'A';               // Un solo carácter
        boolean activo = true;             // true o false

        System.out.printf("""
                \n====== Impresión de datos primitivos ======
                byte:   %d
                short:  %d
                int:    %d
                long:   %d
                float:  %f
                double: %f
                char:   %c
                boolean:%b
                """,
                numeroPequeno,
                numeroCorto,
                numeroEntero,
                numeroGrande,
                decimalSimple,
                decimalPreciso,
                caracter,
                activo);
    }
}
