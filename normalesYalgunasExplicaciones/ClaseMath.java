
import java.util.Arrays;

public class ClaseMath {

    public static void main(String[] args) {
        // ! se hara una prueba de algunos metodos de la clase math.

        System.out.println("Metodo abs");
        // * Prueba de el metodo abs.
        // ? devuelve el valor absoluto de x.
        int numUno = 5;
        int numDos = -3;
        float numTres = 4.6f;
        float numFor = 4.3f;

        int a = Math.abs(numUno);
        int b = Math.abs(numDos);

        System.out.println(a);
        System.out.println(b);

        System.out.println("\n Metodo ceil");
        // devuelve el entero mas pequeño que es mayor o igual a x
        // redondea hacia arriba

        int c = (int) Math.ceil(numTres);
        int d = (int) Math.ceil(numFor);

        System.out.println(c);
        System.out.println(d);

        System.out.println("\n Metodo Floor");
        // devuelve el entero mas grande que es menor o igual a x
        // redondea hacia abajo

        int e = (int) Math.floor(numTres);
        int f = (int) Math.floor(numFor);

        System.out.println(e);
        System.out.println(f);

        int j = (int) (Math.random() * 100);
        System.out.println(j);

        int arreglo[] = new int[5];
        int maximo = 50;
        int minimo = 20;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = minimo + (int) (Math.random() * (maximo - minimo));
        }

        System.out.println(Arrays.toString(arreglo));

        double cateto1 = 3.0;
        double cateto2 = 4.0;

        double hipotenusa = Math.hypot(cateto1, cateto2);

        System.out.println("La hipotenusa de un triángulo rectángulo con catetos " + cateto1 + " y " + cateto2 + " es: "
                + hipotenusa);

        double num = -15.0;
        double signo = Math.signum(num);
        System.out.println("El signo de " + num + " es: " + signo);

        double numxd = 2.0;
        int potencia = 3;
        double resultado = Math.scalb(num, potencia);
        System.out.println(numxd + " escalado por 2^" + potencia + " es: " + resultado);

    }

}
