package arrays;

import java.util.Scanner;

public class excerCuatro {
    public static void main(String[] args) {
        /*
         * leer 10 numeros en un arreglo y ordenar de mayor a menor y viceversa.
         */

        final int[] arreglo = new int[10];
        int aux;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite los valores del arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\n");
        System.out.println("El arreglo ordenado de menor a mayor es: ");
        System.out.println("\n");

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[i]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("\n");
        System.out.println("El arreglo ordenado de mayor a menor es: ");
        System.out.println("\n");

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[i]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        entrada.close();

    }

}
