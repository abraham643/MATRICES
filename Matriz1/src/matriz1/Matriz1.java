package matriz1;

import java.util.Scanner;

public class Matriz1 {
 public static void main(String[] args) {
          Scanner teclado = new Scanner (System.in);
         int x, y;
        System.out.println("Inserta numero impar para hacer las filas)");
        x=teclado.nextInt();
        System.out.println("Inserta numero impar para hacer las columnas\n");
        y=teclado.nextInt();
        char matriz[][]= new char [x][y];
        for (int i=0; i<matriz.length; i++){
         for(int j=0;j<matriz.length; j++) {
             
             if ((i==0) || (i==matriz.length-1) || (j==0) || (j==matriz.length-1)){
                 
                 matriz[i][j] = 'x'; 
             }
             else {
                 
                 matriz[i][j] = ' ';          
             }
             
             System.out.print(matriz[i][j]+" ");
        }   
                 System.out.println(" ");
            }
    }   
}
