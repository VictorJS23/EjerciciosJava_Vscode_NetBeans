import java.util.Scanner;

public class contCaracter {
    public static void main(String[] args) {
        /*
         * Dada una cadena de caracteres y un carácter específico, implementa un
         * programa en Java que cuente el número de repeticiones de ese carácter en la
         * cadena.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String word;
        word = input.nextLine();
        word.toLowerCase();

        System.out.println("\nIngrese el caracter especifico que desea encontrar :");
        char chars;
        chars = input.next().charAt(0);
        char caracter = Character.toLowerCase(chars);

        // convertir la palabra a un array

        char[] array = word.toCharArray();

        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == caracter) {
                cont++;
            }
        }

        if (cont >= 1) {
            System.out.println("\nEl numero de repeticiones del caracter [ " + chars + " ] es: " + cont);
        } else {
            System.out.println("\nEl caracter ingresado no se encuentra en la cadena");
        }

        input.close();

    }
}
