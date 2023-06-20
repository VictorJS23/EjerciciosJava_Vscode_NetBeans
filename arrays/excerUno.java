package arrays;

import java.util.Scanner;

public class excerUno {
    public static void main(String[] args) {
        /*
         * Leer 5 numeros, guardarlos en un arreglo, imprimirlos en el mismo orden
         * introducido;
         */

        final int[] numeros = new int[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Los digitos introducidos son: ");

        for (int i : numeros) {
            System.out.println(i);
        }

        entrada.close();
    }
}
