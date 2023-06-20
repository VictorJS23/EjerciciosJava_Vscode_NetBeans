package arrays;

import java.util.Scanner;

public class arregloClase16 {
    public static void main(String[] args) {
        /*
         * "Se tienen 10 estudiantes, se necesita guardar el nombre de cada estudiante, su  * * nota de acumulado, su nota de examen, y luego imprimir una lista de los  *estudiantes con su nota final"
         */

        String[] estudiantes = new String[10];
        float[] notaAcumulado = new float[10];
        float[] notaExamen = new float[10];
        float[] notaFinal = new float[10];

        Scanner entrada = new Scanner(System.in);

        // Se piden los nombres de los estudiantes
        System.out.println("Ingrese los nombres de los estudiantes: ");
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = entrada.nextLine();
        }

        // Se piden las notas de acumulado
        System.out.println("Ingrese las notas de acumulado de los estudiantes: ");
        for (int i = 0; i < notaAcumulado.length; i++) {
            notaAcumulado[i] = entrada.nextFloat();
        }

        // Se piden las notas de examenes
        System.out.println("Ingrese las notas de examen de los estudiantes: ");
        for (int i = 0; i < notaExamen.length; i++) {
            notaExamen[i] = entrada.nextFloat();
        }

        // Se calcula la suma entre la nota de acumulado y la nota de examen
        for (int i = 0; i < notaFinal.length; i++) {
            notaFinal[i] = notaAcumulado[i] + notaExamen[i];
        }

        // Se imprimen los estudiantes con su nota final
        for (int i = 0; i < notaFinal.length; i++) {
            System.out.println("La nota final de " + estudiantes[i] + " es " + notaFinal[i]);
        }

        entrada.close();
    }
}
