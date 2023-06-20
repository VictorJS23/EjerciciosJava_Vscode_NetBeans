package POO;

import java.util.Scanner;

public class clasesyObjetos {

    // Estos son los atributos
    int numeroUno;
    int numeroDos;
    int suma;
    int resta;
    int multiplicacion;
    int divicion;

    // * Metodos

    // metodo para pedirle al usuario que ingrese dos numeros
    Scanner entrada = new Scanner(System.in);

    public void leerNumeros() {
        System.out.print("Ingrese el primer numero: ");
        numeroUno = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numeroDos = entrada.nextInt();
        entrada.close();
    }

    public void sumar() {
        suma = numeroUno + numeroDos;

    }

    public void restar() {
        resta = numeroUno - numeroDos;
    }

    public void multiplicar() {
        multiplicacion = numeroUno * numeroDos;
    }

    public void dividir() {
        divicion = numeroUno / numeroDos;
    }

    public void mostrarResultados() {
        System.out.println("La suma de los numeros es : " + suma);
        System.out.println("La resta de los numeros es : " + resta);
        System.out.println("La multiplicacion de los numeros es : " + multiplicacion);
        System.out.println("La division de los numeros es : " + divicion);
    }

}