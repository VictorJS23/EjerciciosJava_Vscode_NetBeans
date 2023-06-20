package arrays;

import java.util.Scanner;

public class arregloClase20 {
    public static void main(String[] args) {
        /*
         * En un arreglo, se desean almacenar 5 contraseñas, con la particularidad de
         * que esas contraseñas las debe ingresar el usuario y solamente se almacenen
         * las que tengan mas de 8 caracteres y que no contengan la letra Z, tanto en
         * mayuscula como en minuscula.
         */

        Scanner entrada = new Scanner(System.in);

        String contrasenas[] = new String[5];
        String password;
        int i = 0;

        while (i < 5) {
            System.out.println("ingrese una contraseña de 8 digitos que no contenga la letra z en ella: ");
            password = entrada.nextLine();

            if (password.length() < 8 || password.contains("z")) {
                System.out.println("La contraseña no es valida");
            } else {
                System.out.println("La contraseña es valida");
                contrasenas[i] = password;
                i++;
            }
        }

        System.out.println("Las contraseñas válidas ingresadas son las siguientes: ");

        for (int j = 0; j < contrasenas.length; j++) {
            System.out.println(contrasenas[j]);
        }

        entrada.close();
    }
}
