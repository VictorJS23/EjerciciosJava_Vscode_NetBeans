package arrays;

import java.util.Scanner;

public class arregloClaseDiez {
    public static void main(String[] args) {

        /*
         * "Buscar un nombre en un arreglo y decir si existe o no"
         */

        String[] nombres = { "Martha", "Luis", "Carlos", "Juan", "Ana", "Victor" };
        String name;
        boolean existe = false; // Indicara si el nombre existe o no.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre que desea buscar: ");
        name = entrada.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(name)) {
                // Esto es para que no distinga entre mayusculas y minusculas.
                // para comparar cada elemento del arreglo nombres con el nombre ingresado por
                // el usuario. Si se encuentra una coincidencia, se establece la variable existe
                // en true, lo que indica que el nombre existe en el arreglo.

                existe = true;
                break; // se utiliza para salir del bucle si se cumple la condicion.
            }
        }

        if (existe == true) {
            System.out.println("El nombre si existe en el arreglo.");
        } else {
            System.out.println("El nombre no existe en el arreglo.");
        }

        entrada.close();
    }
}
