public class ExersiseTres {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Esta es solo una prueba mental de como se manejan los arreglos en java. Al
         * parecer por el momento son "Similares" con JavaScript. Nota no se si este
         * arreglo esta bien hecho.
         */

        final int[] arreglo = { 2, 4, 6, 10, 34, 56, 67, 9, 35 };

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                System.out.println("Los numeros pares del arreglo son: " + arreglo[i]);

            }
            if (arreglo[i] % 2 != 0) {
                System.out.println("Los numeros impares del arreglo son: " + arreglo[i]);

            }
        }
        System.out.println("\n");

        System.out.println("Este es el arreglo con cada elemento elevado al cuadrado: ");

        System.out.println("\n");

        for (int j = 0; j < arreglo.length; j++) {
            arreglo[j] = (int) Math.pow(arreglo[j], 2);
            System.out.println("El elemento al cuadrado seria: " + arreglo[j]);

        }
    }
}
// Por el momento el algoritmo muestra los resultados esperados.
