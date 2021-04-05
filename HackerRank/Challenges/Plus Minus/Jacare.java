
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Jacare{
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        int maior_zero = 0;
        int menor_zero = 0;
        int zero = 0;
        DecimalFormat format = new DecimalFormat("0.000000");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                maior_zero++;    
            }else if (arr[i] < 0) {
                menor_zero++;    
            }else{
                zero++;
            }
            
        }
        
        System.out.println(format.format((float)maior_zero/arr.length));
        System.out.println(format.format((float)(menor_zero)/arr.length));
        System.out.println(format.format((float)(zero)/arr.length));
        
    }

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        in.close();
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        
    }
}
