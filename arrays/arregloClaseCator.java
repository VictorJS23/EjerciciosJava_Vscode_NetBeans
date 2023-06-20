package arrays;

import java.util.Scanner;

public class arregloClaseCator {
    public static void main(String[] args) {

        /*
         * "De una lista de 500 numeros, elevarlos al cuadrado y luego mostrarlos"
         */

        // El ejercicio se hara de 5 elementos

        int[] arreglo = new int[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores del arreglo: ");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // se pondra cada elemento al cuadrado y se mostrara.
        System.out.println("El arreglo resultante es: ");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) Math.pow(arreglo[i], 2);
            System.out.println(arreglo[i]);
        }

        entrada.close();

    }
}
