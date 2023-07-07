import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
    public static void main(String[] args) {

        /*
         * Dadas dos cadenas de caracteres, implementa un programa en Java que determine
         * si son anagramas, es decir, si contienen exactamente las mismas letras pero
         * en un orden diferente. El programa debe mostrar "true" si son anagramas, y
         * "false" en caso contrario.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cadena: ");
        String plbStUno;
        plbStUno = input.nextLine();
        plbStUno.toLowerCase();

        System.out.println("\nIngresa otra cadena para verificar si es un anagrama");
        String plbStDos;
        plbStDos = input.nextLine();
        plbStDos.toLowerCase();

        // se convierten a arreglos las cadenas ingresadas

        char[] arrayOne = plbStUno.toCharArray();

        char[] arrayTwo = plbStDos.toCharArray();

        // se ordenan los arreglos

        Arrays.sort(arrayOne);

        Arrays.sort(arrayTwo);

        // se compara caracter por caracter si son iguales

        boolean verify = false;

        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] == arrayTwo[i]) {
                    verify = true;
                } else {
                    verify = false;
                    break;
                }
            }

            if (verify == true) {
                System.out.println("\nLas palabras ingresadas son anagramas");
            } else {
                System.out.println("\nLas palabras ingresadas no son anagramas");
            }

        } else {
            System.out.println("\nLas palabras deben contener la misma cantidad de letras !!!");
        }

        input.close();

    }

}
