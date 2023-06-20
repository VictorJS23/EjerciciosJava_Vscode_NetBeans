
import java.util.Arrays;
import java.util.Scanner;

public class metodoOrdenamientoInsert {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter a numbers :\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("\n");

        // Method insertion
        int position, aux;

        for (int i = 0; i < array.length; i++) {
            position = i;
            aux = array[i];

            while ((position > 0) && (array[position - 1] > aux)) {
                array[position] = array[position - 1];
                position--;
            }

            array[position] = aux;
        }

        System.out.println("The ordereed array is: ");

        System.out.println(Arrays.toString(array));

        input.close();
    }
}
