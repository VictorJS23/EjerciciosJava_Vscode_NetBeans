
//Imprimir la suma de 3 calificaciones presentadas por el usuario
import java.util.Scanner;

public class Excersise {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Hacer un programa que imprima la suma de tres calificaciones
         */

        double numeroUno;
        double numeroDos;
        double numeroTres;
        double result;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tus calificaciones: ");
        numeroUno = entrada.nextDouble();
        numeroDos = entrada.nextDouble();
        numeroTres = entrada.nextDouble();

        result = numeroUno + numeroDos + numeroTres;

        System.out.print("la suma de las calificaciones es de : " + result);

        entrada.close();
    }

}
