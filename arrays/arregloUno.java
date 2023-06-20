package arrays;

import java.util.Scanner;

public class arregloUno {
    public static void main(String[] args) {
        // ? arrays unidimensionales:

        // * Tipo_de_variable[] nombre = new Tipo_de_variable[dimension];

        int nArray;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el tamaño del arreglo: ");

        nArray = entrada.nextInt();

        int[] arreglo = new int[nArray]; // El usuario ingreo la cant de N elementos;

        System.out.println("Ingrese los elementos del arreglo: ");

        for (int i = 0; i < nArray; i++) {
            System.out.println(" .Digite un numero: "); // i+1 es solo para que el user no se confunda;
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\nLos numeros ingresados son: ");

        for (int i = 0; i < nArray; i++) {
            System.out.println(arreglo[i] + (" "));
        }

        entrada.close();
    }
}
