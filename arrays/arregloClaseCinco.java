package arrays;

import java.util.Scanner;

public class arregloClaseCinco {
    public static void main(String[] args) {

        /*
         * "Calcular la media de todos los valores impares almacenados en un arreglo"
         */

        int[] arreglo = new int[6];
        float impares = 0, contImpares = 0;
        float mediaImp;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite los valores del arreglo");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // Media de los numeros impares

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                impares += arreglo[i];
                contImpares++;
            }
        }

        mediaImp = impares / contImpares;

        System.out.println("La media de los numeros impares es de: " + mediaImp);

        entrada.close();
    }
}
