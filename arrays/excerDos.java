package arrays;

import java.util.Scanner;

public class excerDos {
    public static void main(String[] args) {
        /*
         * Leer 10 numeros, guardarlos en un arreglo, realizar media de numeros
         * negativos y positivos y hacer un contador de ceros
         */

        // ? nota: este programa funciona con cualquier tipo de dato numerico;

        final int[] numeros = new int[10];
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        float mediaPositivos, mediaNegativos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] >= 1) {
                contPositivos++;
                sumaPositivos += numeros[i]; // esto es = sumaP = sumaP + num[i];
            } else if (numeros[i] < 0) {
                contNegativos++;
                sumaNegativos += numeros[i]; // esto es = sumaN = sumaN + num[i];
            } else {
                contCeros++;
            }
        }

        // Media positivos
        if (contPositivos == 0) {
            System.out.println("La division entre 0 no es posible !!!");
        } else {
            mediaPositivos = sumaPositivos / contPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }

        // Media Negativos
        if (contNegativos == 0) {
            System.out.println("La division entre 0 no es posible !!!");
        } else {
            mediaNegativos = sumaNegativos / contPositivos;
            System.out.println("La media de los numeros negativos es: " + mediaNegativos);
        }

        // Contador de ceros
        System.out.println("La cantidad de ceros es de: " + contCeros);

        entrada.close();

    }
}
