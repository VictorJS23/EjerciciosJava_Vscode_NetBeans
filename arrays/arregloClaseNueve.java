package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arregloClaseNueve {
    public static void main(String[] args) {

        /*
         * "Calcular la mediana de los elementos de un arreglo"
         */

        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5];
        float mediana;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los valores: ");
            arreglo[i] = entrada.nextInt();
        }

        Arrays.sort(arreglo);

        if (arreglo.length % 2 == 0) {
            int num1 = arreglo.length / 2 + 1;
            int num2 = arreglo.length / 2;
            mediana = (float) ((num1 + num2) / 2.0);
        } else {
            mediana = arreglo.length / 2 + 1;
        }

        System.out.println("La mediana del arreglo es: " + mediana);

        entrada.close();

    }
}
