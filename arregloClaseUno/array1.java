package arregloClaseUno;

public class array1 {
    public static void main(String[] args) {

        int[] numeros1 = { 2, 4, 6, 1, 3, 7, 9, 11, 18, 20, 35, -19, 50, 32, 47, -115, 625 };

        int[] numeros2 = { 1, 7, 2, 4, 9, 115, 200, -127, 284, 382, 594, -720, 115, 214 };

        int[] numeros3 = { 1, 3, 5, 7, 9, 13, 17, 19 };

        int suma1 = 0, suma2 = 0, suma3 = 0;

        // Suma arreglo 1
        for (int i = 0; i < numeros1.length; i++) {
            suma1 += numeros1[i];
        }
        System.out.println("La suma del arreglo Uno es: " + suma1);

        // Suma arreglo 2
        for (int i = 0; i < numeros2.length; i++) {
            suma2 += numeros2[i];
        }
        System.out.println("La suma del arreglo dos es: " + suma2);

        // Suma 3
        for (int i = 0; i < numeros3.length; i++) {
            suma3 += numeros3[i];
        }
        System.out.println("La suma del arreglo Tres es: " + suma3);

        // Ver que suma es la mayor

        if (suma1 > suma2 && suma1 > suma3) {
            System.out.println("La suma numero uno es la mayor");
        } else if (suma2 > suma1 && suma2 > suma3) {
            System.out.println("La segunda suma es la mayor");
        } else {
            System.out.println("La suma tres es la mayor");
        }
    }

}
