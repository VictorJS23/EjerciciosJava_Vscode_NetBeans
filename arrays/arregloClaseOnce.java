package arrays;

import java.util.Scanner;

public class arregloClaseOnce {
    public static void main(String[] args) {

        /*
         * "Algoritmo para saber si un arreglo esta ordenado"
         */

        int[] arreglo = new int[6];

        boolean ordenado = true; // Se pone true para saber si esta ordenado o no y se asume en una instancia que
                                 // esta "ordenado"

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores del arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // Saber si el arreglo esta ordenado, en mi caso de menor a mayor

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) { // verifica si el elemento actual es mayor que el siguiente

                // Si se cumple esta condición, significa que el arreglo no está ordenado de
                // menor a mayor.

                ordenado = false; // si hay elementos donde el actual es > que el sig, se pone false
                break; // por lo tanto se detiene el bucle inmeditamente. Y si acaso no se cumpliera la
                       // condicion queda en true y no cambia.
            }
        }

        if (ordenado == true) {
            System.out.println("El arreglo si esta ordenado de mayor a menor");
        } else {
            System.out.println("El arreglo esta desordenado");
        }

        entrada.close();

    }
}
