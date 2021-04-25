import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* @author: Joao Paolinelli e Silva
* 24-04-20
*/
public class Solution {

    /*@function: soma_ampulheta
    * somar os valores da matriz contidos na posicao correspondente a ampulheta
    */
    static int soma_ampulheta (int[][] matriz) {
        int linha = matriz.length;
        int coluna = matriz[0].length;

        int max_soma_ampulheta = -63;

        for(int i = 0; i < linha-2; i++) {
            for(int j = 0; j < coluna-2; j++) {

                int atual_soma_ampulheta = matriz[i][j] + matriz[i][j+1] + matriz[i][j+2] + 
                matriz[i+1][j+1] +
                matriz[i+2][j] + matriz[i+2][j+1] + matriz[i+2][j+2] ;

                max_soma_ampulheta = Math.max(atual_soma_ampulheta, max_soma_ampulheta);
            }
        }
        return max_soma_ampulheta;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int resultado = soma_ampulheta(arr);

        System.out.println(resultado);
        
        scanner.close();
    }
}
