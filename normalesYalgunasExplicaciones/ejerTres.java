import java.util.Scanner;

public class ejerTres {
    public static void main(String[] args) {
        /*
         * "Algoritmo para calcular la velocidad de un vehiculo"
         */

        float distancia, tiempo, velocidad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Se calculara la distancia de un vehiculo \n");

        System.out.println("Ingrese la velocidad recorrida: ");
        velocidad = entrada.nextFloat();
        System.out.println("\n");

        System.out.println("Ingrese el tiempo transcurrido: ");
        tiempo = entrada.nextFloat();

        distancia = velocidad * tiempo;

        System.out.println("La distancia recorrida es de: " + distancia + " d");

        entrada.close();

    }
}
