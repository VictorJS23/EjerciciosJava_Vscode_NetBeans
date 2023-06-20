
public class ExplicacionUno {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            imprimirHolaMundo();
        }

        printName("Victor");

        int suma = suma(4, 3);
        System.out.println(suma);

    }

    static void imprimirHolaMundo() {
        System.out.println("Hola Mundo");
    }

    static void printName(String name) {
        System.out.println("Hola" + name);
    }

    static int suma(int n1, int n2) {
        return n1 + n2;
    }
}
/*
 * 
 */