import java.util.Scanner;

public class diagonalPrincipal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz : ");
        int size;
        size = input.nextInt();

        System.out.println("");

        int[][] matriz = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Ingrese el elemento en la posicion [" + i + "] [" + j + "] : ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n La matriz resultante es :\n ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.print("\nLa diagonal principal es : ");
        for (int i = 0; i < size; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("");

        System.out.print("\nLa diagonal secundaria es : ");
        for (int i = 0; i < size; i++) {
            System.out.print(matriz[i][size - i - 1] + "  ");
        }

        System.out.println("");
        System.out.println("");

        input.close();

    }
}
