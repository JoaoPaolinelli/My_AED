import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static void plusMinus(int[] arr) {
        
        int maior_zero = 0;
        int menor_zero = 0;
        int zero = 0;
        DecimalFormat formatar = new DecimalFormat("0.000000");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                maior_zero++;    
            }else if (arr[i] < 0) {
                menor_zero++;    
            }else{
                zero++;
            }
        }

        System.out.println(formatar.format((float)maior_zero/arr.length));
        System.out.println(formatar.format((float)(menor_zero)/arr.length));
        System.out.println(formatar.format((float)(zero)/arr.length));
        
    }

    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        
    }
}
