package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arregloClaseDos {
    public static void main(String[] args) {
        // llenar un arreglo con los primeros 8 numeros primos;

        Scanner entrada = new Scanner(System.in);

        int primos[] = new int[8];
        int cont1 = 0;
        int num = 1;

        while (cont1 < 8) {

            int cont2 = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cont2++;
                }
            }

            if (cont2 == 2) {
                primos[cont1] = num;
                cont1++;
            }
            num++;
        }

        System.out.println(Arrays.toString(primos));

        entrada.close();

    }
}
