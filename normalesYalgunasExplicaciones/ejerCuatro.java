import java.util.Scanner;

public class ejerCuatro {
    public static void main(String[] args) {
        /*
         * "Dada la temperatura en Celsius convertir a Farenheit" && Dada la temperatura
         * en Farenheit convertir a Celsius"
         */

        double temp, tempFinal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celcius");
        temp = entrada.nextFloat();

        tempFinal = (temp * 9 / 5) + 32;

        System.out.println("La temperatura en Farenheit es de: " + tempFinal + "\n");

        // -------------------------------------------------------------------------

        double tempDos, tempFinalDos;

        System.out.println("Ingrese la temperatura en Farenheit");
        tempDos = entrada.nextFloat();

        tempFinalDos = (tempDos - 32) * 5 / 9;

        System.out.println("La temperatura en celcius es de: " + tempFinalDos);

        entrada.close();

    }
}
