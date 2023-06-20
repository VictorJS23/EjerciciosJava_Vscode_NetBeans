package arrays;

import java.util.Scanner;

public class arregloClaseCuatro {
    public static void main(String[] args) {

        /*
         * "Calcular la media de todos los valores pares almacenados en un arreglo"
         */

        int[] arreglo = new int[5];
        int suma = 0, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite los valores del arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // Calcular la media de los valores

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        media = suma / arreglo.length;

        // mostrar media

        System.out.println("La media de los valores almacenados es de: " + media);

        entrada.close();

    }
}
