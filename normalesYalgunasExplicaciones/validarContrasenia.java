import java.util.Scanner;

public class validarContrasenia {
    public static void main(String[] args) {
        /*
         * Implementa un método que valide si una cadena de caracteres representa
         * una contraseña segura. La contraseña debe cumplir ciertas reglas, como
         * tener al menos 8 caracteres, contener al menos una letra mayúscula, una
         * letra minúscula, un número y un carácter especial.
         */

        Scanner scanner = new Scanner(System.in);

        String probable;

        String[] contrasenia = new String[5];

        int indice = 0;

        while (indice < 5) {

            System.out.println("ingrese una contrasenia de  8 digitos  que no contenga la z: ");

            probable = scanner.nextLine();

            if (probable.length() < 8 || probable.contains("z")) {

                System.out.println("la contrasenia no es apta");

            } else {

                System.out.println("su contrasenia es apta");
                contrasenia[indice] = probable;
                indice++;

            }

            for (int i = 0; i < contrasenia.length; i++) {
                System.out.println(contrasenia[i]);
            }
        }

        scanner.close();

    }
}
