public class secuenciaCreciente {
    public static void main(String[] args) {
        int[] arreglo1 = { 1, 3, 2, 4, 8, 7, 9 };
        int[] arreglo2 = { 1, 3, 2, 4, 8, 7, 9, 11, 25, 200 };

        int[] secuencia1 = encontrarSecuenciaCreciente(arreglo1);
        int[] secuencia2 = encontrarSecuenciaCreciente(arreglo2);

        System.out.println("Secuencia creciente más larga en arreglo1:");
        imprimirSecuencia(secuencia1);

        System.out.println("\nSecuencia creciente más larga en arreglo2:");
        imprimirSecuencia(secuencia2);
    }

    public static int[] encontrarSecuenciaCreciente(int[] arreglo) {
        int longitudMaxima = 0;
        int indiceInicio = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int longitudActual = 1;
            int indiceActual = i;

            for (int j = i; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    longitudActual++;
                } else {
                    break;
                }
            }

            if (longitudActual > longitudMaxima) {
                longitudMaxima = longitudActual;
                indiceInicio = indiceActual;
            }
        }

        int[] secuencia = new int[longitudMaxima];
        for (int i = 0; i < longitudMaxima; i++) {
            secuencia[i] = arreglo[indiceInicio + i];
        }

        return secuencia;
    }

    public static void imprimirSecuencia(int[] secuencia) {
        for (int i = 0; i < secuencia.length; i++) {
            System.out.print(secuencia[i]);

            if (i < secuencia.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
