
import java.util.Scanner;

public class sumaFyCMatriz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][];
        int nFilas;
        int nColumnas;

        System.out.print("Ingrese el numero de filas : ");
        nFilas = input.nextInt();
        System.out.println("");

        System.out.print("Ingrese el numero de columnas : ");
        nColumnas = input.nextInt();
        System.out.println("");

        System.out.println("Ingrese los elementos en la posicion : ");
        System.out.println("");

        matriz = new int[nFilas][nColumnas];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("posicion [" + i + "] [" + j + "] : ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("");
        System.out.println("La matriz resultante es : ");

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("");

        // la suma de las filas y columnas

        int sumaFilas, sumaColumnas;

        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.print("\n La suma de la fila [" + i + "] es : " + sumaFilas);
        }
        System.out.println("");

        for (int j = 0; j < nColumnas; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < nColumnas; i++) {
                sumaColumnas += matriz[i][j];
            }
            System.out.print("\n La suma de la columna [" + j + "] es : " + sumaColumnas);
        }
        System.out.println("");

        input.close();

    }

}
