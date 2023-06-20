package arregloClaseUno;

public class array2function {
    public static void main(String[] args) {
        int arrayOne[] = { 13, 37, 10, 7, 89 };
        int arrayTwo[] = { 13, 42, 15, 7, 56 };

        int counter = repeatArray(arrayOne, arrayTwo);
        counterArray(counter);
    }

    static int repeatArray(int arrayOne[], int arrayTwo[]) {
        int counter = 0;
        System.out.println("The repeated values are: ");
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    System.out.println(arrayOne[i]);
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    static void counterArray(int counter) {
        System.out.println("The number of repeating are: " + counter);
    }
}
