package arrays;

public class bucleForEach {
    public static void main(String[] args) {
        // * Blucle forEach, tambien conocido como "for mejorado";
        /*
         * En el sentido de arreglos tienen la misma funcion, pero este es mas rapido;
         */

        String[] nombres = { "julio", "victor", "ana", "moises", "carlos", "luis" };

        /*
         * for (int i = 0; i < nombres.length; i++) { //length devuelve la longitud del
         * arreglo;
         * System.out.println(nombres[i]);
         * }
         */

        for (String i : nombres) {
            System.out.println("Nombre: " + i);
        }

    }
}
