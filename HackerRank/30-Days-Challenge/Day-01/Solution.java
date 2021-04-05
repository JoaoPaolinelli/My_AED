import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		

        Scanner scan = new Scanner(System.in);

        String[] allEntrada = new String[3];
        for (int j = 0; j < allEntrada.length; j++) {
            allEntrada[j] = scan.nextLine();
        }
        
        scan.close();

        System.out.println(i + Integer.parseInt(allEntrada[0]));
        System.out.println(d + Double.parseDouble(allEntrada[1]));
        System.out.println(s + allEntrada[2]);
       
    }
}

        