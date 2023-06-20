package arrays;

import java.util.Scanner;

public class excerCinco {
    public static void main(String[] args) {

        /*
         * Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
         * Estos los guardaremos en una tabla de tamaño 10. Leer un numero N , e
         * insertarlo en el lugar adeacuado para que la tabla siga ordenada.
         */

        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        boolean creciente = true; // Se inicializa asi porque esta ordenado a no ser que se demuestre lo !=;
        int numero, sitioNum = 0, j = 0;

        System.out.println("Digite los numeros del arreglo: ");

        do {

            // Llenando el arreglo
            for (int i = 0; i < 5; i++) {
                arreglo[i] = entrada.nextInt();
            }

            // Comprobar si el arreglo esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) { // creciente 1-2-3
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) { // decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitar");
            }

        } while (creciente == false);

        // Pedir el elemento a insertar
        System.out.println("\nDigite un elemento a insertar: ");

        numero = entrada.nextInt();

        // Esto es para saber en que posiscion va el numero
        while (arreglo[j] < numero && j < 5) { // j < 5 verifica si aun no se completa la cant de elementos del array
            sitioNum++;
            j++;
        }

        // Traslado de una posicion en el arreglo a los elementos que van detras de
        // numero
        for (int i = 4; i >= sitioNum; i--) { // i=4 porque es el numero de elementos
            arreglo[i + 1] = arreglo[i];
        }

        // Se inserta el numero que usuario ingreso
        arreglo[sitioNum] = numero;

        System.out.println("\nEl arreglo resultante es: ");

        for (int i = 0; i < 6; i++) {
            System.out.println(" - " + arreglo[i]);
        }

        System.out.println();

        entrada.close();

    }

}