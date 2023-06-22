import java.util.Scanner;

public class ejer13ExamenDos {
    public static void main(String[] args) {
        /*
         * - Encontrar la secuencia creciente ininterrumpida más larga: Implementa un
         * método que encuentre la secuencia
         * creciente más larga en un arreglo de números enteros. La secuencia creciente
         * es una secuencia de
         * números en la que cada número es mayor que el anterior. Por ejemplo, en el
         * arreglo
         * [1, 3, 2, 4, 8, 7, 9], la secuencia creciente más larga sería 2, 4, 8.
         * 
         * Si tuviéramos [1, 3, 2, 4, 8, 7, 9, 11, 25, 200], la secuencia más larga
         * seria 7, 9, 11, 25, 200
         * 
         */

        Scanner input = new Scanner(System.in);

        int[] arreglo = new int[7];

        System.out.println("Ingrese los valores del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = input.nextInt();
        }

        int cont = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                cont++;
            }
        }

        int[] arregloDos = new int[cont];
        int j = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                arregloDos[j] = arreglo[i];
                j++;
            }
        }

        if (arreglo.length > 0 && arreglo[arreglo.length - 1] > arregloDos[j - 1]) {
            arregloDos[j] = arreglo[arreglo.length - 1];
            j++;
        }

        System.out.println("La secuencia más larga sería:");
        System.out.println();

        for (int i = 0; i < arregloDos.length; i++) {
            System.out.println(arregloDos[i]);
        }

        input.close();
    }
}
// Aun no imprime bien los valores

// aun no imprime nada
