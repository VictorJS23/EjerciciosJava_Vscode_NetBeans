import java.util.Scanner;

public class ejerPractice {
    public static void main(String[] args) {
        String[] words = new String[5];
        String aux;

        System.out.println("Ingresa 5 palabras");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            words[i] = input.nextLine();
        }

        // el arreglo ordenado es
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    aux = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = aux;

                }
            }
        }

        // Se imprime el arreglo

        System.out.println("El arreglo de palabras ordenadas es: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        input.close();

    }
}
