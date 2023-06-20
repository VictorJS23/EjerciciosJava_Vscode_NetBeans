import java.util.Scanner;

public class ejerNueve {
    public static void main(String[] args) {
        /*
         * "Calcular el precio de venta de un producto, si se sabe que este debe tener una ganancia del 30% en relacion al precio de compra"
         */

        double precioVenta, precioCompra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        precioCompra = entrada.nextFloat();

        precioVenta = precioCompra + (precioCompra * 0.30);

        System.out.println("El precio de venta del producto es de: " + precioVenta);

        entrada.close();

    }
}
