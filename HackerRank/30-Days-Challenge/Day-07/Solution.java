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

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int contador=1;
        for (int i = 0; i < (arr.length+1)/2; i++) {
            
            int tmp = arr[i];
            arr[i] = arr[arr.length-contador];
            arr[arr.length-contador] = tmp;
            contador++; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   
        }

        scanner.close();
    }
}
