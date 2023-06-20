import java.util.Scanner;

public class fresco {
    public static void main(String[] args) {
        /*
         * Leer por teclado una serie de 10 numeros enteros. La aplicación debe indicar
         * si los numeros estan ordenados de forma creciente, decreciente o si estan
         * desordenados.
         */

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter a numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        boolean creciente = true;
        boolean decreciente = true;

        // verificar si esta ordenado de manera creciente
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                creciente = false;
            }
        }

        // verificar si esta ordenado de manera decreciente
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                decreciente = false;
            }
        }

        if (creciente == true) {
            System.out.println("\nLos numeros estan ordenados de manera creciente");
        }

        if (decreciente == true) {
            System.out.println("\nLos numeros estan ordenados de manera decreciente");
        }

        if (creciente == false && decreciente == false) {
            System.out.println("\nLos numeros estan desordenados");
        }

        input.close();

    }
}