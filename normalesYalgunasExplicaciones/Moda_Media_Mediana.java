import java.util.Arrays;

public class Moda_Media_Mediana {
    public static void main(String[] args) {

        /*
         * 1 - Media : Es el promedio donde se suman todos los elementos y se dividen
         * entre
         * el total de elementos.
         * 
         * 2 - Moda : Es el conjunto de numeros que mas aparece, los elementos deben de
         * estar ordenados de mamera ascendente.
         * 
         * 3 - Mediana : Es el numero o numeros medio de un conjunto de numeros, que
         * deben
         * estar ordenados de menor a
         * mayor, en el caso de que en la mitad solo se encuetre un numero se toma dicho
         * numero, pero si hay dos se suman y se dividen entre dos.
         */

        // ? Calcular la mediana

        int[] arreglo = { 7, 2, 5, 1, 9, 3, 6, 8, 4 }; // Ejemplo de arreglo

        Arrays.sort(arreglo); // Ordena el arreglo en orden ascendente

        double mediana;
        int tamaño = arreglo.length;

        if (tamaño % 2 == 0) {
            // Tamaño par, calcular promedio de los dos elementos centrales
            int indice1 = tamaño / 2 - 1;
            int indice2 = tamaño / 2;
            mediana = (arreglo[indice1] + arreglo[indice2]) / 2.0;
        } else {
            // Tamaño impar, mediana es el elemento central
            int indice = tamaño / 2;
            mediana = arreglo[indice];
        }

        System.out.println("La mediana del arreglo es: " + mediana);

    }
}

/*
 * 1 - Se define un arreglo llamado arreglo con los valores de ejemplo.
 * 
 * int[] arreglo = {7, 2, 5, 1, 9, 3, 6, 8, 4};
 */

/*
 * 2 - Se utiliza Arrays.sort(arreglo) para ordenar el arreglo en orden
 * ascendente.
 * 
 * Arrays.sort(arreglo);
 */

/*
 * 3 - Se declara una variable mediana para almacenar el resultado del cálculo
 * de la mediana y una variable tamaño para almacenar el tamaño del arreglo.
 * 
 * double mediana;
 * int tamaño = arreglo.length;
 */

/*
 * 4 - int tamaño = arreglo.length;
 * Se verifica si el tamaño del arreglo es par o impar utilizando el operador
 * módulo %. Si el tamaño es par, se procede al cálculo de la mediana utilizando
 * los dos elementos centrales. Si es impar, se utiliza el elemento central.
 *
 * if (tamaño % 2 == 0) {
 * // Tamaño par, calcular promedio de los dos elementos centrales
 * // ...
 * } else {
 * // Tamaño impar, mediana es el elemento central
 * // ...
 * }
 */

/*
 * 5 - En el caso de que el tamaño del arreglo sea par, se obtienen los índices
 * de los dos elementos centrales. Se divide el tamaño por 2 y se resta 1 al
 * índice para obtener el primer elemento central y se utiliza el tamaño
 * dividido por 2 para obtener el segundo elemento central. Luego, se calcula el
 * promedio de estos dos elementos para obtener la mediana.
 * 
 * int indice1 = tamaño / 2 - 1;
 * int indice2 = tamaño / 2;
 * mediana = (arreglo[indice1] + arreglo[indice2]) / 2.0;
 */

/*
 * 6 - En el caso de que el tamaño del arreglo sea impar, se obtiene el índice
 * del elemento central dividiendo el tamaño por 2. Luego, se asigna
 * directamente el valor del elemento central a la variable mediana.
 * 
 * int indice = tamaño / 2;
 * mediana = arreglo[indice];
 */

/*
 * 7 - Finalmente, se imprime la mediana del arreglo.
 * 
 * System.out.println("La mediana del arreglo es: " + mediana);
 */