import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        /*
         * Realizar un juego para adivinar un numero. Para ellp generr un número
         * aleatorio entre 0-100 y luego ir pidiendo numeros indicando, "es mayor" o
         * "es menor" segun sea mayor o menor con respecto a N. El proceso termina
         * cuando usuario acierta, mostrar el numero de intenttos.
         */

        int numero, numAlt, attemps = 0;

        numAlt = (int) (Math.random() * 100); // Se genero el numero aleatorio entre 0-100;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n");
            System.out.println("Digite un numero");
            System.out.println("\n");
            numero = entrada.nextInt();

            if (numAlt > numero) { // ? ejmp: el numero es 5 y aleatorio es 10, se necesita uno mayor;
                System.out.println("Ingresa un numero mayor !!!");
            } else { // ? contrario;
                System.out.println("Ingresa un numero menor !!!");
            }

            attemps++; // Se aumenta para ver cada vez que el usuario digite un nuevo numero;

        } while (numero != numAlt);

        System.out.println("\n Genial, adivinaste el numero en " + attemps + " intentos");

        entrada.close();
    }
}
