import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int tamanho) {
        int controle = 0;
        //Inicializar matriz
        //Previnir elementos null
        String[][] matriz = new String[tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
        //Armazenar # posicoes StairCase
        for (int i = matriz.length-1; i >= 0; i--) {
            
            for (int j = matriz.length-1; j >= controle; j--) {
                matriz[i][j] = "#";
            }
            controle++;
        }
        //Printar a Matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
