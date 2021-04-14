import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String dec2bin = Integer.toString(n,2);
        String[] numeros1 = dec2bin.split("0");
        int resposta = 0;
        for (int i = 0; i < numeros1.length; i++) {
            if(resposta < numeros1[i].length()){
                resposta = numeros1[i].length();
            }
            
        }
        System.out.println(resposta);
        scanner.close();
    }
}
