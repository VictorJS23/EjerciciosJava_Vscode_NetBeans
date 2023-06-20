import java.util.Scanner;

public class ExcersiseDos {
    public static void main(String[] args) {
        /*
         * Hacer un programa que calcule e imprima el salario semanal de un empleado a
         * partir de sus horas semanales trabajadas y de su salario por hora;
         */

        // Se asume que trabaja 7 dias;

        int horasTrabajadas; // Seran las horas que ejerce el usuario;
        float horas; // Se declaro como float previendo un pago no entero;
        float salario; // Se declaro como float previendo no omitir ningun valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas de labor");
        horasTrabajadas = entrada.nextInt();

        System.out.println("Ingrese la cantidad de pago por horas de labor");
        horas = entrada.nextFloat();

        salario = (horas * horasTrabajadas) * 7;

        System.out.println("El salario semanal es de: " + salario);

        entrada.close();
    }
}
