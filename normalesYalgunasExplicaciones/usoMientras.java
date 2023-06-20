import java.util.Scanner;

public class usoMientras {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Hacer un ejercicio que pida un numero e imprima su valor la tabla del uno al
         * diez
         */

        int numero;
        int cont = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();

        while (cont <= 10) {
            System.out.println(numero + " x " + cont + " = " + numero * cont);
            cont++;
        }

        entrada.close();
    }
}
