package arrays;

import java.util.Scanner;

public class arregloClaseDoce {
    public static void main(String[] args) {

        /*
         * "Vuelto, denominaciones y cantidad de billetes o monedas de cada tipo"
         */

        float[] billetes = new float[9];
        float monto, cantidad;

        billetes[0] = 500;
        billetes[1] = 200;
        billetes[2] = 100;
        billetes[3] = 50;
        billetes[4] = 20;
        billetes[5] = 10;
        billetes[6] = 5;
        billetes[7] = 1;
        billetes[8] = 0.5f;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un monto");
        monto = entrada.nextFloat();

        for (int i = 0; i < billetes.length; i++) {

            cantidad = (float) Math.floor(monto / billetes[i]); // devuelve el numero mas pequeño o igual ejmp = 5.4=5

            monto = monto - cantidad * billetes[i];

            System.out.println("Numero de billetes / monedas de " + billetes[i] + " = " + cantidad);

        }

        entrada.close();

    }
}
