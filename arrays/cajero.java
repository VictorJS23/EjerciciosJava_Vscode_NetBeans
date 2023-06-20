package arrays;

import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        /*
         * Hacer un programa que simule un cajero automatico con un saldo inicial de
         * 1000U$, con el siguente menu de opciones:
         * 
         * 1. Ingresar dinero a la cuenta
         * 2. Retirar Dinero de la cuenta
         * 3. Salir
         */

        // Saldo inicia del cajero.
        float SaldoInicial = 1000f;

        // Ingrese la opcion a validar
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Ingresar el numero segun la opcion\n");
            System.out.println("1.  Ingresar dinero a la cuenta.");
            System.out.println("2.  Retirar dinero de la cuenta.");
            System.out.println("3.  Salir. \n");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto que desea ingresar");
                    float monto;

                    monto = entrada.nextFloat();

                    if (monto >= 1) {
                        SaldoInicial += monto;
                        System.out.println(
                                "El monto actual de la cuenta con el efectivo ingresado es de: " + SaldoInicial);
                    } else {
                        System.out.println("Este monto no esta permitido !!!");
                    }

                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar de la cuenta: ");
                    float retiro;

                    retiro = entrada.nextFloat();

                    if (retiro <= SaldoInicial && retiro >= 1) {
                        SaldoInicial -= retiro;
                        System.out
                                .println("El monto actual de la cuenta con el retiro efectuado es de: " + SaldoInicial);
                    } else if (SaldoInicial == 0) {
                        System.out.println("La cuenta ya no posee fondos, realize un deposito !!!");
                    } else {
                        System.out.println(
                                "El monto ingresado no es valido, debe de ser mayor a 1 y menor o igual a su monto actual !!!. Su monto actual es de: "
                                        + SaldoInicial);
                    }

                    break;

                case 3:
                    System.out.println("\nGracias por utilizar el cajero !!!\n");

                    break;
            }

        } while (opcion != 3);

        entrada.close();

    }
}
