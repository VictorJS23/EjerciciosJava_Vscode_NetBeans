public class ejerDoce {
    public static void main(String[] args) {
        /*
         * "Recorrer los numeros del 1 al 100, y luego imprimirlos en pantalla, teniendo
         * en cuenta que los numeros que sean multiplos de 3 se debera imprimir la
         * palabra 'fizz', si es multiplo de 5 se imprime la palabra 'buzz', y si es
         * multiplo de 3 y de 5 se imprime 'fizzbuzz', en caso contrario imprimir
         * solamente el numero"
         */

        String uno = "fizz"; // Multiplo de 3;
        String dos = "buzz"; // Multiplo de 5;
        String tres = "fizzbuzz"; // Multiplo de 3 y 5;

        System.out.println("Se imprimiran los numeros del 1 al 100 con las pautas correpondientes ");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("' " + tres + " ' ");
            } else if (i % 3 == 0) {
                System.out.println("' " + uno + " ' ");
            } else if (i % 5 == 0) {
                System.out.println("' " + dos + " ' ");
            } else {
                System.out.println(i);
            }

        }

    }
}
