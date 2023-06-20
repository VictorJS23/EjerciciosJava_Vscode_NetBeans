package arrays;

public class arregloClaseQuince {
    public static void main(String[] args) {

        /*
         * Encontrar la diferencia entre el numero mas grande y el mas pequenio de un
         * arreglo
         */

        int[] arreglo = { 2, 4, 5, 1, 8, 9, 10, 34, 7, 6 };

        // Se declaran variables para recorre el arreglo, se inicializan en la posicion
        // 0 ya que de ahi comenzaran a validar.

        int max = arreglo[0];
        int min = arreglo[0];
        int dif;

        // se encuentra el mayor
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }

        // se encuentra el menor
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }

        dif = max - min;

        System.out.println("La diferencia entre el numero mas grande y el mas pequeño del arreglo es: " + dif);

    }
}
