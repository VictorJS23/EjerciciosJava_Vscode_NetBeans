import java.util.Scanner;

public class ejerUno {
    public static void main(String[] args) {

        /*
         * "Calcular el pago de un trabajador, sabiendo las horas trabajadas, el precio por hora, y el 20% de impuesto"
         */

        byte horasTrab;
        float precioHr;
        double pagoTotal, pagoIVA, pagoNeto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas que ejerce en su trabajo: ");
        horasTrab = entrada.nextByte();

        System.out.println("Ingrese el pago por hora: ");
        precioHr = entrada.nextFloat();

        pagoTotal = horasTrab * precioHr;

        pagoIVA = pagoTotal * 0.20;

        pagoNeto = pagoTotal - pagoIVA;

        System.out.println("El pago total del trabajador con el 20% de impuesto es de : \n " + pagoNeto);

        entrada.close();

    }
}
