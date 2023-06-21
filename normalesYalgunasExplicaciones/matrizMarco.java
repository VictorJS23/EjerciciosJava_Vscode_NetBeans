
import java.util.Scanner;

public class matrizMarco {

    public static void main(String[] args) {

        int array[][] = new int[5][5];

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero en la posicion: ");
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("posicion [" + i + "] [" + j + "] : ");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("");
        System.out.println("La matriz original es: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("La matriz modificada es: ");
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    array[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }

        input.close();
    }

}
/*
 * La condición i == 0 || i == 4 || j == 0 || j == 4 se utiliza para verificar
 * si el elemento actual de la matriz se encuentra en el borde.
 * 
 * La matriz es de tamaño 5x5, por lo tanto, los índices válidos para las filas
 * y columnas van desde 0 hasta 4. Al evaluar la condición, estamos verificando
 * si el elemento actual está en una de las siguientes situaciones:
 * 
 * i == 0: Indica que estamos en la primera fila de la matriz (borde superior).
 * i == 4: Indica que estamos en la última fila de la matriz (borde inferior).
 * j == 0: Indica que estamos en la primera columna de la matriz (borde
 * izquierdo).
 * j == 4: Indica que estamos en la última columna de la matriz (borde derecho).
 * Si cualquiera de estas condiciones se cumple, significa que el elemento
 * actual se encuentra en el borde de la matriz.
 * 
 * En ese caso, se establece el valor de 1 en el elemento correspondiente de la
 * matriz utilizando la instrucción matriz[i][j] = 1.
 * 
 * De lo contrario, si ninguna de las condiciones se cumple, significa que el
 * elemento actual está en el interior de la matriz, por lo tanto, se establece
 * el valor de 0 en ese elemento utilizando la instrucción matriz[i][j] = 0.
 * 
 * Esta condición es esencial para distinguir entre los elementos del borde y
 * los elementos interiores y así asignar los valores correctos.
 */