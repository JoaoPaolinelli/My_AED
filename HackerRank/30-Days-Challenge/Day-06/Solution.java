import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    static void imprimir(String par, String impar){
        System.out.print(par + " " + impar +"\n");
        
    }
    static void contador(String entrada){
        String par = "";
        String impar = "";
        for (int i = 0; i < entrada.length(); i++) {
            if( i%2 == 0) {
                par += entrada.charAt(i);
            }else{
                impar += entrada.charAt(i);
            }
        }
        imprimir(par, impar);
    }

    static void dividirPalavra(String entrada) {
        contador(entrada);
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numero = in.nextLine();
        int numEntrada = Integer.parseInt(numero);

        String palavras;
        for (int i = 0; i < numEntrada; i++) {
            palavras= in.nextLine();
            dividirPalavra(palavras);
        }
        int idEntrada = 0;
        
        in.close();
    }
}