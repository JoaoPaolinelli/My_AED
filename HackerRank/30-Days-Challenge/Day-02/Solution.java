import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(Double meal_cost, int tip_percent, int tax_percent) {
        
        double tip = ((meal_cost/100) * tip_percent);
        double tax = ((meal_cost/100) *tax_percent);
        System.out.println(Math.round(meal_cost + tax + tip));
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String meal = scanner.nextLine();
        meal = meal.replace(",", ".");
        Double meal_cost = Double.parseDouble(meal);

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
