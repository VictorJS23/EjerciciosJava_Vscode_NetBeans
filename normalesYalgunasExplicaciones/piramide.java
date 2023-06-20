import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        /*
         * Hacer un programa que imprima lo siguente:
         * +
         * ++
         * +++
         * ++++
         * +++++
         * -> Debe de ser un metodo que le solucite al usuario el simbolo, la letra o
         * numero a imprimir y el tamaño de la piramide. =>
         */

        char character;
        int size;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a symbol, number or letter ");
        character = input.next().charAt(0);

        System.out.println("Enter the size of the piramid ");
        size = input.nextInt();

        System.out.println("\n");

        System.out.println("The first piramid is: \n");
        piramidOne(character, size);

        System.out.println("the piramid other way round is: \n");
        piramidTwo(character, size);

        System.out.println("The piramid crazy is: \n");
        piramidThree(character, size);

        input.close();
    }

    public static char piramidOne(char character, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        return character;
    }

    public static char piramidTwo(char character, int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

        return character;
    }

    public static char piramidThree(char character, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
        return character;
    }

}
