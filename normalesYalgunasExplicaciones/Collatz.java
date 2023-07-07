import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        /*
         * Implementa un programa en Java que calcule la secuencia de Collatz para un
         * número entero positivo dado. La secuencia de Collatz se obtiene siguiendo las
         * siguientes reglas: si el número es par, se divide por 2; si es impar, se
         * multiplica por 3 y se le suma 1. El proceso se repite hasta llegar a 1.
         * 
         * Aquí hay un ejemplo de la sucesión de Collatz para el número 6:
         * 
         * Para el número 6, la secuencia de Collatz sería:
         * 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
         * 
         * Comenzamos con el número 6. Como es par, lo dividimos por 2 y obtenemos 3.
         * Como 3 es impar, lo multiplicamos por 3 y le sumamos 1, obteniendo 10.
         * Continuamos aplicando las reglas de la sucesión de Collatz hasta que llegamos
         * al número 1, que marca el final de la secuencia.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();

        if (num >= 1) {
            System.out.println("\nLa sucesion de collatz del numero | " + num + " | es:\n ");

            System.out.print("| " + num + " | = ");

            for (int i = num; i != 1;) {
                if (i % 2 == 0) {
                    i /= 2;
                    System.out.print(i + " -> ");
                } else {
                    i = (3 * i) + 1;
                    System.out.print(i + " -> ");
                }
            }
        } else {
            System.out.println("\nEl numero ingresado no es valido, debe ser positivo y mayor a 0.");
        }

        System.out.println();

        input.close();

    }
}

/*
 * (int i = num; i != 1;) inicializa la variable i con el valor de num y
 * establece
 * la condición de terminación del ciclo para que se ejecute mientras i sea
 * diferente de 1.
 * 
 * El (;) al final de la condicion del ciclo for es utilizado para separar las
 * tres partes del ciclo for y se utiliza
 * para indicar el final de una expresión y el inicio de la siguiente.
 * 
 * (int i = num; i != 1;), es importante destacar que falta la
 * expresión de incremento/decremento. Sin esta expresión, el ciclo no se
 * actualizará correctamente y potencialmente resultará en un bucle infinito o
 * en un comportamiento no deseado.
 * 
 * basicamente ese ; le dice al for que i puede aumentar y disminuir en la
 * respectiva iteracion en la que se encuentre.
 */
