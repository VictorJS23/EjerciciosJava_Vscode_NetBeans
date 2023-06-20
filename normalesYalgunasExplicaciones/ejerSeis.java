import java.util.Scanner;

public class ejerSeis {
    public static void main(String[] args) {
        /*
         * Hacer un ejercicio que pida un numero e imprima su valor la tabla del uno al
         * diez
         */

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        entrada.close();

    }

}
