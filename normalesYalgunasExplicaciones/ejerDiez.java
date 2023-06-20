import java.util.Scanner;

public class ejerDiez {
    public static void main(String[] args) {
        /*
         * Hacer un programa que determine cual es un año bisiesto
         */

        int anio;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un año");
        anio = entrada.nextInt();

        if (anio % 4 == 0 && (anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bicisto");
        } else {
            System.out.println("El año no es bicisto");
        }
        entrada.close();
    }
}
