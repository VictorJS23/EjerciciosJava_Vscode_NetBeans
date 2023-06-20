package arrays;

import java.util.Scanner;

public class arregloClaseTres {
    public static void main(String[] args) {
        /*
         * "Leer 5 elementos, almacenarlos en un arreglo, y calcular el factorial de cada elemento"
         */

        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[5];

        // Se piden los valores del arreglo
        System.out.println("Ingrese 5 elementos: ");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        // Se calcula el factorial de cada elemento del arreglo
        // Para calcular el factorial de un numero es ejmp: 4 = 4*3*2*1
        // La formula sera fact = fact * 1

        for (int i = 0; i < arreglo.length; i++) { // Este for es para recorrer el arreglo

            int fact = 1; // Se inicializa en uno ya que la mult * 0 seria 0, esto ademas hara que en que
                          // cada iteracion del bucle fact se reinicie a 1 y su valor sea correcto para
                          // cada elemento

            for (int j = 1; j <= arreglo[i]; j++) { // Este for es para aplicar el calculo a cada elemento

                // NOTA: j <= arreglo hace que ejecute la operacion la cantidad de veces que lo
                // requiera el numero ejmp si es 4 ira de 1 hasta 4 y asi sucesivamente.
                // la mult al ser conmutativa no afecta el orden en que sea multipicada.

                fact *= j; // Esto hace quee fact se vaya mult por j en cada iteracion
            }

            arreglo[i] = fact; // asigna cada valor que tomo el for a la dimension del arreglo.
        }

        // Mostrar arreglo resultante
        System.out.println("El factorial de cada elemento ingresado en el arreglo es: ");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        entrada.close();

    }
}
