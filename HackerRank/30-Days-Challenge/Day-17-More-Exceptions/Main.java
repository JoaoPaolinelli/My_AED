import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            
            Calculator myCalculator = new Calculator();
            try {
                int resultado = myCalculator.power(n, p);
                System.out.println(resultado);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}