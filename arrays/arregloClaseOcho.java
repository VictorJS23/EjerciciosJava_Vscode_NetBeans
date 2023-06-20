package arrays;

import java.util.Random;

public class arregloClaseOcho {
    public static void main(String[] args) {

        /*
         * "Llenar un arreglo con 0 y 1, 0 para las posiciones pares y 1 para las posiciones impares"
         */

        int[] arreglo = new int[10]; // Tamaño del arreglo

        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }

        // El arreglo normal seria:
        System.out.println("El arreglo sin condicion: \n");

        // Este es un bucle forEach
        for (int i : arreglo) {
            System.out.print(i + " , ");
        }

        System.out.println("\n");

        // El arreglo con la condicion seria:
        System.out.println("El arreglo con la condicion: \n");

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                System.out.print(0 + " , ");

            } else if (arreglo[i] % 2 != 0) {
                System.out.print(1 + " , ");

            }
        }

    }
}
