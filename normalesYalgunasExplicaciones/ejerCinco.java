import java.util.Scanner;

public class ejerCinco {
    public static void main(String[] args) {
        /*
         * "Calcular binomio al cuadrado (a+b)^2",
         */

        int a, b;
        double d;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        a = entrada.nextInt();

        System.out.println("Ingrese un numero: ");
        b = entrada.nextInt();

        d = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);

        System.out.println("El binomio al cuadrado es de: " + d);

        entrada.close();

    }
}
