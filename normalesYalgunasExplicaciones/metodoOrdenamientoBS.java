
import java.util.Arrays;
import java.util.Scanner;

public class metodoOrdenamientoBS {
    public static void main(String[] args) {

        // Sort method Bublee Sort

        int[] array = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a number");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("\n");

        // below method will be used
        int aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        /*
         * for (int i : array) {
         * System.out.print(i + " , ");
         * }
         */

        System.out.println("The ordered array is: ");

        System.out.println("\n");

        System.out.println(Arrays.toString(array));

        input.close();

    }
}
