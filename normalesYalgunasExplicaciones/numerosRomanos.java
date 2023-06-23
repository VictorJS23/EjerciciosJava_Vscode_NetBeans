import java.util.Scanner;

public class numerosRomanos {
    public static void main(String[] args) {

        System.out.println("Ingrese un número y sepa cómo se escribe en romano:");

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        System.out.println(convertirARomano(numero));

        input.close();
    }

    public static String convertirARomano(int numero) {

        String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int[] valores = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String resultado = " ";

        for (int i = 0; i < romanos.length; i++) {
            int repeticiones = numero / valores[i];
            numero %= valores[i];

            for (int j = 0; j < repeticiones; j++) {
                resultado += (romanos[i]);
            }
        }

        return resultado;

    }

}

/*
 * int i = 0: La variable i se inicializa con el valor 0. Esta variable se
 * utilizará como un índice para acceder a los elementos de los arreglos romanos
 * y valores.
 * 
 * i < romanos.length: La condición establece que el ciclo se repetirá mientras
 * el valor de i sea menor que la longitud del arreglo romanos. Esto garantiza
 * que el ciclo itere a través de todos los elementos del arreglo.
 * 
 * i++: Después de cada iteración del ciclo, se ejecuta la expresión de
 * actualización, en este caso, se incrementa el valor de i en 1.
 * 
 * int repeticiones = numero / valores[i];: Se calcula la cantidad de
 * repeticiones de la letra romana actual dividiendo el número ingresado
 * (numero) por el valor correspondiente en el arreglo valores. Esto determina
 * cuántas veces se debe repetir la letra romana en la representación del número
 * romano.
 * 
 * numero %= valores[i];: Se utiliza el operador %= para actualizar el valor de
 * numero con el residuo de la división anterior. Esto asegura que en la
 * siguiente iteración, se obtenga el residuo actualizado para calcular las
 * repeticiones de la siguiente letra romana.
 * 
 * for (int j = 0; j < repeticiones; j++): Se inicia otro ciclo "for" anidado,
 * utilizando la variable j para contar las repeticiones de la letra romana
 * actual.
 * 
 * resultado += romanos[i];: Dentro del ciclo "for" anidado, se concatena la
 * letra romana (romanos[i]) al resultado (resultado) la cantidad de veces
 * determinada por el valor de repeticiones. Esto construye gradualmente la
 * representación en números romanos del número ingresado.
 */