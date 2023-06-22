import java.util.Arrays;
import java.util.Scanner;

public class cifrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };

        System.out.print("Ingrese la palabra a cifrar: ");
        String word = input.nextLine();

        String lowerCaseWord = word.toLowerCase();
        System.out.println(lowerCaseWord);

        String[] letters = lowerCaseWord.split("");
        System.out.println(Arrays.toString(letters));

        int rotation;
        System.out.print("\nIngrese la rotacion del cifrado: ");
        rotation = input.nextInt();

        String[] parabraCifrada = CaesarCipher(letters, alphabet, rotation);
        System.out.println(Arrays.toString(parabraCifrada));

        input.close();
    }

    public static String[] CaesarCipher(String[] wordArray, String[] alphabet, int rotation) {
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (wordArray[i].equals(alphabet[j])) {
                    int newIndex = (j + rotation) % alphabet.length;
                    wordArray[i] = alphabet[newIndex];
                    break;
                }
            }
        }
        return wordArray;
    }

}