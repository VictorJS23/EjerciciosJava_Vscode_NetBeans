import java.util.Scanner;

public class ejerSiete {
    public static void main(String[] args) {
        /*
         * "Calcular el factorial de un numero"
         */

        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();

        if (num > 0) {

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = i * fact;
            }
            System.out.println("El factorial del numero " + " ' " + num + " ' " + " es : " + fact);

        } else {
            System.out.println("El numero debe de ser mayor !!!");
        }

        entrada.close();
    }
}
