package arrays;

import java.util.Scanner;

public class arregloClase {
    public static void main(String[] args) {

        // hacer dos arreglos de 5 elementos y un 3er la * de cada uno

        int[] arregloUno = new int[5];
        int[] arregloDos = new int[5];
        int[] arregloTres = new int[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("llenar arreglo Uno");
        for (int i = 0; i < arregloUno.length; i++) {
            arregloUno[i] = entrada.nextInt();
        }

        System.out.println("llenar arreglo Dos");
        for (int i = 0; i < arregloDos.length; i++) {
            arregloDos[i] = entrada.nextInt();
        }

        int j = 0;
        for (int i = 0; i < arregloTres.length; i++) {
            arregloTres[j] = arregloUno[i] * arregloDos[i];
            j++;
        }

        System.out.println("El arreglo resultante es: ");
        for (int i = 0; i < arregloTres.length; i++) {
            System.out.println(arregloTres[i]);
        }

        entrada.close();

    }
}