package arrays;

import java.util.Scanner;

public class excerTres {
    public static void main(String[] args) {
        /*
         * Leer dos tablas (2 arreglos) de 10 numeros enteros y mezclarlas en una
         * tercera de la forma: el 1° de A
         * 1° de B, el 2° de A el 2° de B, etc.
         */

        final int a[], b[], c[];

        a = new int[10]; // arreglo a 10 elementos
        b = new int[10]; // arreglo b 10 elementos
        c = new int[20]; // arreglo c 20 elementos

        Scanner entrada = new Scanner(System.in);

        // Pedimos arreglo Uno
        System.out.println("Digite la primera tabla: ");
        for (int i = 0; i < 10; i++) {
            a[i] = entrada.nextInt();
        }

        // pedimos arreglo Dos
        System.out.println("Digite la Segunda tabla: ");
        for (int i = 0; i < 10; i++) {
            b[i] = entrada.nextInt();
        }

        // Mezcla de los arreglos en arreglo c
        // iterador i para a,b y j para c

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; // 1° a
            j++;
            c[j] = b[i]; // 1° b
            j++;
        }

        System.out.println("La tabla resultante es de: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + " ");
        }

        entrada.close();

    }

}
