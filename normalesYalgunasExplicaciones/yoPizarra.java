
import java.util.Scanner;

public class yoPizarra {
    public static void main(String[] args) {
        /*
         * Hacer un ejercicio que oida un nombre de usuario y una contraseña; si el
         * usuario es == admin && la contraseña es 1234; debe darle la bienvenida sino
         * que se vaya a la pija
         */

        String nombre;
        String contrasena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su contraseña");
        contrasena = entrada.nextLine();

        if (nombre.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("No es bienvenido");
        }

        entrada.close();
    }
}