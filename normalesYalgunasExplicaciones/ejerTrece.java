public class ejerTrece {
    public static void main(String[] args) {
        /*
         * Elaborar la sucesion de finonachi
         */

        int numUno = 0;
        int numDos = 1;
        int numTres = 0;

        System.out.println("Se imprimiran los primeros 20 numeros de la sucesion de fibonacci");

        for (int i = 0; i <= 20; i++) {

            numTres = numDos + numUno;
            numUno = numDos;
            numDos = numTres;

            System.out.println(numDos);

        }

    }
}
