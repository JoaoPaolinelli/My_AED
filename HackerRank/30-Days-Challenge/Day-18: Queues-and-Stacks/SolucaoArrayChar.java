import java.io.*;
import java.util.*;

public class SolucaoArrayChar {

    char pilha[] = new char[555];
    int topo_pilha = -1;

    char fila[] = new char [555];
    int primeiro_fila = -1;
    int final_fila = -1;

    public void pushCharacter(char c) {
        topo_pilha++;
        pilha[topo_pilha] = c;
    }

    public char popCharacter() {
        // de forma abstrata, eliminar a ultima posicao da fila
        topo_pilha--;
        return pilha[topo_pilha+1];
    }
    public void enqueueCharacter(char c) {

        final_fila++;
        fila[final_fila] = c;
    }
    public char dequeueCharacter() {

        primeiro_fila++;
        return fila[primeiro_fila];
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        in.close();
        
        char[] s = input.toCharArray();

        SolucaoArrayChar p = new SolucaoArrayChar();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }  
}
