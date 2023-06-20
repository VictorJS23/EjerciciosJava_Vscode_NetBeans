package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arregloClase19 {
    public static void main(String[] args) {
        /*
         * Almacenar los nombres de 100 estudiantes y su genero, y luego decir cuantos
         * hombres y cuantas mujeres hay
         */

        Scanner entrada = new Scanner(System.in);

        String nombres[] = new String[10];
        char generos[] = new char[10];
        int cantHombre = 0;
        int cantMujer = 0;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombres[i] = entrada.nextLine();

            System.out.println("Ingrese el género del estudiante (Masculino/Femenino): ");
            generos[i] = entrada.nextLine().charAt(0);
        }

        for (char genero : generos) {
            if (genero == 'M' || genero == 'm') {
                cantHombre++;
            } else if (genero == 'F' || genero == 'f') {
                cantMujer++;
            }
        }

        System.out.println("Cantidad de hombres: " + cantHombre);
        System.out.println("Cantidad de mujeres: " + cantMujer);
        System.out.println("\n");
        System.out.println("Lista de estudiantes: ");
        System.out.println(Arrays.toString(nombres));

        entrada.close();
    }
}
