package arregloClaseUno;

public class coche {

    // Atributies
    public void Coche(String color, String marca, String km) {
        this.color = color;
        this.marca = marca;
        this.km = km;
    }

    // Atributos
    String color;
    String marca;
    String km;

    public static void main(String[] args) {

        coche coche1 = new coche();

        coche1.color = "Rojo";
        coche1.marca = "Supra";
        coche1.km = (0 + " km");

        System.out.println("El color del auto es: " + coche1.color);
        System.out.println("La marca del auto es: " + coche1.marca);
        System.out.println("El km del auto es: " + coche1.km);
    }
}
