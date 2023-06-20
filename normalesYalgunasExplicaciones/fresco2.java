
public class fresco2 {
    public void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // lo esperado { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 }

        int lastNumber = array.length - 1;
        array[0] = lastNumber;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i + 1];
        }

        // Mostrar el arreglo resultante

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
