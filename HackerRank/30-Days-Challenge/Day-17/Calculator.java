import java.util.*;
import java.math.*;

public class Calculator{
   
    Calculator(){}

    int power(int a, int b) throws Exception {
        if( a < 0 || b < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow((int)a, (int)b);
    }
}