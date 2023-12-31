
import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int matriz[][];
        int nFilas;
        int nColumnas;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas");
        nFilas = input.nextInt();
        System.out.println("");

        System.out.println("Ingrese el numero de columnas");
        nColumnas = input.nextInt();
        System.out.println("");

        matriz = new int[nFilas][nColumnas];

        System.out.println("Ingrese los elementos de la matriz : ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("posicion [" + i + "] [" + j + "] : ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n La matriz resultante es: ");

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " , ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Usando el metodo llamado Arrays.deepToString : ");

        System.out.println(Arrays.deepToString(matriz));

        input.close();

    }

}
