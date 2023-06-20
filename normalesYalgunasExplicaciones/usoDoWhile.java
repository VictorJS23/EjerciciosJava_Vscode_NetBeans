import java.util.Scanner;

public class usoDoWhile {
    public static void main(String[] args) {

        // ! Uso del Do While;

        int valor;
        Scanner opcion = new Scanner(System.in);

        do {
            System.out.println("Ingresar un numero segun la opcion");
            System.out.println("1- Encontrar el mayor");
            System.out.println("2- Acceso de usuario");
            System.out.println("3- Imprimir tabla");
            System.out.println("4- Salir");
            valor = opcion.nextInt();

            switch (valor) {
                case 1:
                    int numeroUno;
                    int numeroDos;
                    int numeroTres;

                    System.out.println("Ingrese el primer numero");
                    numeroUno = opcion.nextInt();

                    System.out.println("Ingrese el segundo numero");
                    numeroDos = opcion.nextInt();

                    System.out.println("Ingrese el tercer numero");
                    numeroTres = opcion.nextInt();

                    if (numeroUno > numeroDos && numeroUno > numeroTres) {
                        System.out.println("el numero mayor es: " + numeroUno);
                    } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
                        System.out.println("el numero mayor es: " + numeroDos);
                    } else {
                        System.out.println("el numero mayor es: " + numeroTres);
                    }

                    break;

                case 2:
                    String nombre;
                    String contrasena;

                    System.out.println("Ingrese su nombre de usuario \n ");
                    nombre = opcion.next();

                    System.out.println("Ingrese su contraseña \n ");
                    contrasena = opcion.next();

                    if (nombre.equals("admin") && contrasena.equals("1234")) {
                        System.out.println("Bienvenido");
                    } else {
                        System.out.println("No es bienvenido");
                    }

                    break;

                case 3:
                    int numero;

                    System.out.println("Ingresa un numero");
                    numero = opcion.nextInt();

                    for (int i = 0; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + numero * i);
                    }

            }

        } while (valor != 4);

        opcion.close();
    }
}
