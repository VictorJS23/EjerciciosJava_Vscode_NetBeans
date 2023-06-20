package arregloClaseUno;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        /*
         * Dados dos arreglos decir cuantos elementos del arreglo1 se encuentran en el
         * arreglo dos
         */

        int[] arregloUno = new int[5];
        int[] arregloDos = new int[5];
        int[] arregloTres = new int[5];
        int cont1 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores del arreglo uno: ");
        for (int i = 0; i < arregloUno.length; i++) {
            arregloUno[i] = entrada.nextInt();
        }

        System.out.println("Ingrese los valores del arreglo dos");
        for (int i = 0; i < arregloDos.length; i++) {
            arregloDos[i] = entrada.nextInt();
        }

        System.out.println("Los elementos que se repiten son: ");

        // Los elementos repetidos son:
        for (int j = 0; j < arregloUno.length; j++) {
            for (int i = 0; i < arregloDos.length; i++) {
                if (arregloUno[j] == arregloDos[i]) {
                    arregloTres[i] = arregloUno[j];
                }
            }
        }

        for (int i = 0; i < arregloTres.length; i++) {
            System.out.println(arregloTres[i]);
            cont1 = arregloTres.length;
        }

        System.out.println("La cantidad de elementos repetidos es de:" + cont1);

        entrada.close();
    }
}
