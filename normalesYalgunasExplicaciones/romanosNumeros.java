import java.util.Scanner;

public class romanosNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para convertir a romano");
        int numero;

        numero = input.nextInt();

        System.out.println(covertirRomano(numero));

        input.close();

    }

    public static String covertirRomano(int numero) {

        String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int[] valores = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String resultado = " ";

        for (int i = 0; i < romanos.length; i++) {
            int repeticiones = numero / valores[i];
            numero %= valores[i];

            for (int j = 0; j < repeticiones; j++) {
                resultado += romanos[i];
            }
        }

        return resultado;

    }

}

/*
 * se declaran el arreglos de string de numero romanos de mayor y su equivalente
 * aun arreglo de numeros enteros.
 * 
 * se declara una variable de string vacia, que a ir almacenando las
 * concatenaciones de de cada indice romano correpondiente al numero ingresado
 * por el usuario.
 * 
 * se crea un for que recorrera el arreglo de los numeros romanos.
 * 
 * se crea una variable llamada repeticiones que esta almacenara la repeticion
 * la letra romana actual dividiendo el número ingresado por el valor
 * correspondiente en el arreglo.
 * 
 * numero %= valores[i]; hace que guarda el resulta de numero / valores[i]
 * 
 * el en for anidado j < repeticiones sirve para contar las repeticiones de la
 * letra actual
 * 
 * resultado += romanos[i]; lo que hace es que concatena la cantidad de veces
 * determinadas por el valor de repeticiones
 */
