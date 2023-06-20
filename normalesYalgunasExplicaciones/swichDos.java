import java.util.Scanner;

public class swichDos {
    public static void main(String[] args) {

        /*
         * Pedir un numero del 1 al 7 y decir en ese numero en que dia correponde;
         */

        char caracter;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un caracter");
        caracter = entrada.next().charAt(0);

        switch (caracter) {
            case '1':
                System.out.println("Lunes");
                break;

            case '2':
                System.out.println("Martes");
                break;

            case '3':
                System.out.println("Miercoles");
                break;

            case '4':
                System.out.println("Jueves");
                break;

            case '5':
                System.out.println("Viernes");
                break;

            case '6':
                System.out.println("Sabado");
                break;

            case '7':
                System.out.println("Domingo");

            default:
                System.out.println("El numero ingresado no es valido");

                entrada.close();

        }

    }
}
