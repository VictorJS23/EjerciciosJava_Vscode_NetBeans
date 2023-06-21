package matrices;

import java.util.Scanner;

public class mostrarTraspuesta {

    public static void main(String[] args) {
        
        int array [][] = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un numero en la posicion: ");
        System.out.println("");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("posicion [" + i + "] [" + j + "] : " );
                array[i][j] = input.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("La matriz original es: ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        int aux;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
            //Se pone j<i ya que en la segunda iteracion se pondria igual a la matriz original
            //por lo tanto se saca de la diagonal principal hacia abajo
            //Esta condición asegura que el bucle interno solo itere para las columnas que están por debajo de la diagonal principal.
                
                aux = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = aux;
            }
        }
        
        System.out.println("La matriz traspuesta es : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                if(i == j){
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        
        System.out.println("La matriz identidad  es : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        
    }
    
}
