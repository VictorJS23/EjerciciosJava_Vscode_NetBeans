package arrays;

import java.util.Scanner;

public class arregloClaseTrece {
    public static void main(String[] args) {

        /*
         * "Llenar un arreglo, y luego pasarlo a otro en orden inverso"
         */

        int[] arregloUno = new int[5];
        int[] arregloDos = new int[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores del arreglo: ");

        for (int i = 0; i < arregloUno.length; i++) {
            arregloUno[i] = entrada.nextInt();
        }

        // se pasan los valores de arreglo uno a arreglo dos

        int j = 0;
        for (int i = 0; i < arregloDos.length; i++) {
            arregloDos[j] = arregloUno[i];
            j++;
        }

        // Se pondran e imprimiran en orden inverso

        System.out.println("El arreglo en orden inverso es: ");

        for (int i = arregloDos.length - 1; i >= 0; i--) {
            // se pone arreglo - 1 para siga con la regla se 0 hasta n numero, solo que en
            // esta caso de orden inverso.

            System.out.println(arregloDos[i]);
        }

        entrada.close();

    }
}
