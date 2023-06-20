import java.util.Scanner;

public class ejerDos {
    public static void main(String[] args) {
        /*
         * "Algoritmo para calcular la velocidad de un vehiculo"
         */

        float distancia, tiempo, velocidad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Se calculara la velocidad de un vehiculo \n");

        System.out.println("Ingrese la distancia recorrida: ");
        distancia = entrada.nextFloat();
        System.out.println("\n");

        System.out.println("Ingrese el tiempo transcurrido: ");
        tiempo = entrada.nextFloat();
        System.out.println("\n");

        System.out.println("la distancia ingresada es de: " + distancia + " km");

        System.out.println("el tiempo ingresado es de: " + tiempo + " sg");
        System.out.println("\n");

        velocidad = distancia / tiempo;

        System.out.println("La velocidad del vehiculo es de: " + velocidad + " V");

        entrada.close();

    }
}
