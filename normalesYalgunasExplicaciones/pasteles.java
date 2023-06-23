import java.util.Scanner;

public class pasteles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harinaPorPastel = 3;
        int azucarPorPastel = 5;
        int huevosPorPastel = 4;

        System.out.println("Ingrese la cantidad de harina disponible : ");
        int harina;
        harina = input.nextInt();

        System.out.println("Ingrese la cantidad de azucar disponible : ");
        int azucar;
        azucar = input.nextInt();

        System.out.println("Ingrese la cantidad de huevos disponibles : ");
        int huevos;
        huevos = input.nextInt();

        int pastelesRealizables = Math.min(harina / harinaPorPastel,
                Math.min(azucar / azucarPorPastel, huevos / huevosPorPastel));

        System.out.println("La cantidad de pasteles realizables es de : " + pastelesRealizables);

        input.close();
    }
}
