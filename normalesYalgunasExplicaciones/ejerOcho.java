import java.util.Scanner;

public class ejerOcho {
    public static void main(String[] args) {
        /*
         * "A partir del costo unitario de un articulo, la cantidad de articulos y la cantidad de dinero entregada por el cliente, imprima la cantidad de vuelto que debe recibir"
         */

        float costUnit, cantMoney, vuelto, costFinal;
        int cantArt;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio unitario del articulo: ");
        costUnit = entrada.nextFloat();

        System.out.println("Ingrese la cantidad de articulos: ");
        cantArt = entrada.nextInt();

        System.out.println("Ingrese la cantidad de dinero con la que se realizara el pago: ");
        cantMoney = entrada.nextFloat();

        costFinal = cantArt * costUnit;

        if (cantMoney >= costFinal) {
            vuelto = cantMoney - costFinal;
            System.out.println("El vuelto por la compra es de: " + vuelto);
        } else {
            System.out.println("La cantidad de dinero no es suficiente: ");
        }

        entrada.close();

    }
}
