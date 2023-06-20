
// import java.util.Arrays;
import java.util.Scanner;

public class cifradoCesar {
    public static void main(String[] args) {

        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };

        Scanner input = new Scanner(System.in);
        String code;
        System.out.println("Ingrese el codigo a desifrar");
        code = input.nextLine();

        char[] codeWord = code.toCharArray();

        int index;
        int finl;

        System.out.println("ingrese el numero de rotaciones");
        index = input.nextInt();

        System.out.println("ingrese la cantidad de digitos");
        finl = input.nextInt();

        for (int i = index; i <= finl + 1; i++) {
            System.out.println(alphabet[i]);
        }

        input.close();
    }
}
