package arrays;

import java.util.Scanner;

public class arregloClaseSeisYSiete {
    public static void main(String[] args) {

        /*
         * "Encontrar el elemento mayor de un arreglo y el menor"
         */

        int[] arreglo = new int[6];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite los valores del arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // Se inicializan en la posicion 0 del arreglo porque van a validar a partir de
        // esa posicion.
        // Se inicializan hasta tener el arreglo lleno.
        int max = arreglo[0];
        int min = arreglo[0];

        // Encontrar mayor
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }

        // Encontrar menor
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }

        System.out.println("El numero mayor del arreglo es: " + max);
        System.out.println("El numero menor del arreglo es: " + min);

        entrada.close();

    }
}
