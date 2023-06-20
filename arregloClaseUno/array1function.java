package arregloClaseUno;

public class array1function {
    public static void main(String[] args) {

        int arrayOne[] = { 4, 6, 77, 98, -45, 0, 98, 8, 5, 10 };
        int arrayTwo[] = { 67, 145, -67, -173, 614, 5 };
        int arrayThree[] = { 45, 985, 98, -70 };

        int sum1 = sumArrayOne(arrayOne);
        int sum2 = sumArrayTwo(arrayTwo);
        int sum3 = sumArrayThree(arrayThree);

        mainArray(sum1, sum2, sum3);
    }

    static int sumArrayOne(int arrayOne[]) {

        int sum1 = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            sum1 += arrayOne[i];
        }
        System.out.println("The sum of the first array is: " + sum1);
        return sum1;
    }

    static int sumArrayTwo(int arrayTwo[]) {

        int sum2 = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            sum2 += arrayTwo[i];
        }
        System.out.println("The sum of the second array is : " + sum2);
        return sum2;
    }

    static int sumArrayThree(int arrayThree[]) {

        int sum3 = 0;
        for (int i = 0; i < arrayThree.length; i++) {
            sum3 += arrayThree[i];
        }
        System.out.println("The suma of the third array is : " + sum3);
        System.out.println("\n");
        return sum3;
    }

    static void mainArray(int sum1, int sum2, int sum3) {

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println("The array One is the largest");

        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println("The array Second is the largest ");

        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println("The array Third is the largest");
        }
    }
}
