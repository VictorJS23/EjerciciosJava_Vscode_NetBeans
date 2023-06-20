package arrays;

import java.util.Scanner;

public class arregloClase18 {
    public static void main(String[] args) {

        /*
         * En un arreglo de N elementos, determinar cuales caracteres son vocales
         */

        char[] arreglo = new char[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los caracteres a validar");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.next().charAt(0);
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (Character.toLowerCase(arreglo[i]) == 'a' || // seusapara convertir a min char
                    Character.toLowerCase(arreglo[i]) == 'e' ||
                    Character.toLowerCase(arreglo[i]) == 'i' ||
                    Character.toLowerCase(arreglo[i]) == 'o' ||
                    Character.toLowerCase(arreglo[i]) == 'u') {

                System.out.println(arreglo[i] + " este elemento es una vocal.");

            } else {

                System.out.println(arreglo[i] + " este elemento no es una vocal.");
            }
        }

        entrada.close();
    }

}