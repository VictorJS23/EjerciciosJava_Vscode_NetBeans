package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class traspuestas {

    public static void main(String[] args) {
        int matriz[][];
        int nFilas;
        int nColumnas;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de filas");
        nFilas = input.nextInt();
        System.out.println("");
        
        System.out.println("Ingrese el numero de columnas");
        nColumnas = input.nextInt();
        System.out.println("");
        
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Ingrese los elementos de la matriz : ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print("posicion [" + i + "] [" + j + "] : ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\n");
        
        boolean simetrica = true;
        
        
        if(nFilas == nColumnas){
           int i, j;
           i = 0;
           
           while( i < nFilas && simetrica == true){
               j = 0;
               while(j < i && simetrica == true){
                   if(matriz[i][j] != matriz[j][i]){
                       simetrica = false;
                   }
                   j++;
               }
               i++;
           }
           
           if(simetrica == true){
               System.out.println("La matriz es simetrica");
           } else {
               System.out.println("La matriz no es simetrica");
           }
        } else {
            System.out.println("La matriz no es simetrica");
        }
        
        System.out.println("");
        
        System.out.println("La matriz resultante es : ");
        
        for (int[] arreglo : matriz) {
            System.out.println(Arrays.toString(arreglo));
        }
        
        
    
    }
    
}
