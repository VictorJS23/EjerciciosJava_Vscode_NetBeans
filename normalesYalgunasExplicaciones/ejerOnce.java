import java.util.Scanner;

public class ejerOnce {
    public static void main(String[] args) {
        /*
         * Elaborar un programa que determine si un numero es primo
         */

        int num;
        int cont = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado no es primo");
        }

        entrada.close();

    }
}
