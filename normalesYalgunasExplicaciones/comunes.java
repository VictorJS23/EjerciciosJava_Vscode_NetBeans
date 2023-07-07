import java.util.Arrays;
import java.util.Scanner;

public class comunes {
    public static void main(String[] args) {

        /*
         * Dados dos arreglos ordenados de longitud "m" y "n", implementa un programa en
         * Java que encuentre e imprima los elementos comunes entre ambos arreglos.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer arreglo: ");
        int longUno;
        longUno = input.nextInt();

        int[] arrayOne = new int[longUno];

        System.out.println("\nIngrese los elementos del arreglo uno: ");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = input.nextInt();
        }

        System.out.println("Ingrese la longitud del segundo arreglo: ");
        int longDos;
        longDos = input.nextInt();

        int[] arrayTwo = new int[longDos];

        System.out.println("\nIngrese los elementos del arreglo dos: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = input.nextInt();
        }

        // Ordenar los arreglos

        Arrays.sort(arrayOne);

        Arrays.sort(arrayTwo);

        // verificar si hay elementos comunes

        int lengthOne = arrayOne.length;

        int lengthTwo = arrayTwo.length;

        System.out.println("\nLos elementos comunes son : ");

        for (int i = 0, j = 0; i < lengthOne && j < lengthTwo;) {
            if (arrayOne[i] < arrayTwo[j]) {
                i++;
            } else if (arrayOne[i] > arrayTwo[j]) {
                j++;
            } else {
                System.out.print(arrayOne[i] + " | ");
                i++;
                j++;
            }
        }

        input.close();

    }
}

/*
 * El ciclo for se inicia con la declaración y la inicialización de las
 * variables i y j. Estas variables se utilizan para rastrear las posiciones
 * actuales en los arreglos arrayOne y arrayTwo.
 * 
 * La condición de terminación del ciclo for se evalúa en cada iteración: i <
 * lengthOne
 * && j < lengthTwo. El ciclo continuará ejecutándose mientras i sea menor que
 * la
 * longitud del arreglo arrayOne (lengthOne) y j sea menor que la longitud del
 * arreglo
 * arrayTwo (lengthTwo).
 * 
 * la condición de terminación del ciclo for para que sea i < lengthOne && j <
 * lengthTwo, lo cual permitirá que el ciclo siga ejecutándose hasta que se
 * recorran ambos arreglos completamente, sin importar sus longitudes
 * respectivas.
 * 
 * Dentro del ciclo for, se comparan los elementos en las posiciones i y j de
 * los arreglos arrayOne y arrayTwo:
 * 
 * ------ESTE METODO SE BASA EN QUE PRIMERAMENTE LOS ARREGLOS ESTAN
 * ORDENADOS------
 * 
 * Si arrayOne[i] es menor que arrayTwo[j], significa que el elemento en
 * arrayOne[i] no está presente en arrayTwo, por lo tanto, incrementamos i para
 * pasar al siguiente elemento en arrayOne.
 * 
 * Si arrayOne[i] es mayor que arrayTwo[j], significa que el elemento en
 * arrayTwo[j] no está presente en arrayOne, por lo tanto, incrementamos j para
 * pasar al siguiente elemento en arrayTwo.
 * 
 * Si arrayOne[i] es igual a arrayTwo[j], significa que hemos encontrado un
 * elemento común. En este caso, imprimimos el elemento utilizando
 * System.out.print(arrayOne[i] + " | "), incrementamos tanto i como j para
 * pasar
 * al siguiente elemento en ambos arreglos.
 * 
 * Es importante destacar que, en cada caso, incrementamos i y/o j para avanzar
 * en los arreglos solo cuando es necesario. Esto asegura que seguimos
 * comparando todos los elementos de ambos arreglos de manera ordenada.
 * 
 * Este proceso se repite hasta que se cumpla alguna de las condiciones de
 * terminación del ciclo for, es decir, cuando hayamos recorrido uno de los
 * arreglos completamente.
 * 
 */