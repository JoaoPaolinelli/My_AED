import java.io.*;
import java.util.*;

public class RunningTime {

    public static final int limite_I = 2000000000;
    public static final int limite_II = 1000;


    public static boolean isPrimo(Integer num) {
        boolean isPrime = true;

        if (num == 0 || num == 1)
            return false;

        stopNow:
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrime = false;
                break stopNow;
            }
            if(num > limite_II && j >= limite_II) break stopNow;
        }
        return isPrime;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int numEntradas = Integer.parseInt(in.readLine());

        Integer constante = 1;

        if (numEntradas <= 30) {
            Tickets: 
            while (1 <= constante && numEntradas != 0) {
                boolean isPrime = true;
                constante = Integer.parseInt(in.readLine());
                if(constante < limite_I){
                    System.out.println(isPrimo(constante) ? "Prime" : "Not prime");
                }else{
                    isPrime=false;
                    break Tickets;
                }
        
                numEntradas--;
            }
        }
    }
}
