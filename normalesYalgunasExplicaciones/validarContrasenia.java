import java.util.Scanner;

public class validarContrasenia {
    public static void main(String[] args) {
        /*
         * Implementa un método que valide si una cadena de caracteres representa
         * una contraseña segura. La contraseña debe cumplir ciertas reglas, como
         * tener al menos 8 caracteres, contener al menos una letra mayúscula, una
         * letra minúscula, un número y un carácter especial.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu contraseña : \n");
        String password = input.nextLine(); // Cambia esta cadena por la contraseña que desees verificar

        if (validarContraseña(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos de seguridad.");
        }

        input.close();
    }

    public static boolean validarContraseña(String contraseña) {
        // Verificar la longitud mínima de la contraseña
        if (contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        // Verificar cada carácter de la contraseña
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            // Verificar si el carácter es una letra mayúscula
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            // Verificar si el carácter es una letra minúscula
            else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
            // Verificar si el carácter es un número
            else if (Character.isDigit(c)) {
                tieneNumero = true;
            }
            // Verificar si el carácter es un carácter especial
            else if (!Character.isLetterOrDigit(c)) {
                tieneCaracterEspecial = true;
            }

        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }
}
