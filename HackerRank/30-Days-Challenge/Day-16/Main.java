import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void convert_2_number(String s) throws Exception{
        try{
            int numero = Integer.parseInt(s);
            System.out.println(numero);
        }catch (Exception e) {
            System.out.println("Bad String");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convert_2_number(S);    
    }
}