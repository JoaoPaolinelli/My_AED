import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        String entrada = bufferedReader.readLine().trim();
        String[] split = entrada.split(" ");
        Integer[] num = new Integer[n];
        int numSwap = 0;
        int l = 0;
        
        while(l < n) {
            num[l] = Integer.parseInt(split[l]);
            l++;
        }        
                    
        for(int i = 0; i < n; i++) {
            for(int j=i+1; j < n; j++) {
                if(num[i] > num[j]) {
                    numSwap += 1;
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in "+ numSwap+" swaps.");
        System.out.println("First Element: " + num[0]);
        System.out.println("Last Element: " + num[n-1]);
       
        bufferedReader.close();
    }
    
}
