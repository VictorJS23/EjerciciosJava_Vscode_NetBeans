import java.util.Scanner;

public class dias {
    public static void main(String[] args) {
        /*
         * Hacer un programa que dado un numoero de horas, devuelva la cantidad de
         * semanas dias y horas equivalentes.
         */

        // ? Ejemplo: Dado un total de 1000 horas debe de mostras 5 semanas, 6 dias y 16
        // ? horas.

        int horasTotales, semanas, dias, horas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero de horas");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168; // ? 168 se debe al numero de horas de un dia * los 7 dias de la semana;

        dias = horasTotales % 168 / 24;
        // ? Se necesita el residuo de la division ya que de esa manera se determinan
        // ? cuantas horas sobran para sacar los dias y divide / 24 ya que es el numero
        // ? de horas en un dia;

        horas = horasTotales % 24;

        System.out.println("\n");
        System.out.println("El equivalente de " + horasTotales + " es: \n");
        System.out.println("El numero de semanas: " + semanas);
        System.out.println("El numero total de dias: " + dias);
        System.out.println("El numero total de horas: " + horas);

        entrada.close();
    }
}
