import java.util.Scanner;

public class valueObject {
    public static void main(String[] args) {
        /*
         * Pares de suma igual: Dado un arreglo unidimensional de números enteros y un
         * valor objetivo, encuentra todos los pares de elementos en el arreglo cuya
         * suma sea igual al valor objetivo.
         */

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Ingrese los valores del arreglo : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int valueObject;

        System.out.println("\nIngrese el valor objetivo : ");
        valueObject = input.nextInt();

        System.out.println("\n");

        SumaArreglo(array, valueObject);

        input.close();

    }

    public static int[] SumaArreglo(int[] array, int value) {
        int cont = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] + array[k] == value) {
                    cont++;
                    System.out.println("Par encontrado: " + array[i] + " + " + array[k] + " = " + value);
                }
            }
        }

        System.out.println("");

        if (cont == 0) {
            System.out.println("No se encuentran los elementos: ");
        }

        return array;

    }
}

/*
 * for (int i = 0; i < arrayTwo.length - 1; i++): El bucle externo se inicia con
 * la variable i en 0 y se ejecuta hasta arrayTwo.length - 1. Recorre los
 * elementos del arreglo arrayTwo desde el índice 0 hasta el penúltimo índice.
 * 
 * for (int k = i + 1; k < arrayTwo.length; k++): El bucle interno se inicia con
 * la variable k en i + 1 y se ejecuta hasta arrayTwo.length. Recorre los
 * elementos del arreglo arrayTwo desde el siguiente índice después de i hasta
 * el último índice.
 * 
 */
