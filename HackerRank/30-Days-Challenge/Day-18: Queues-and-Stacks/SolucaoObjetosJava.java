import java.io.*;
import java.util.*;

public class SolucaoObjetosJava {
    Stack pilha;
    Queue fila;

    SolucaoObjetosJava() {
        pilha = new Stack<>();
        fila = new LinkedList();
    }
    
    public void pushCharacter(char c) {
        pilha.push(c);
    }

    public char popCharacter() {
        return (char)pilha.pop();
    }

    public void enqueueCharacter(char c) {
        fila.add(c);
    }

    public char dequeueCharacter(){
        return (char)fila.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        
        char[] s = input.toCharArray();

        SolucaoObjetosJava p = new SolucaoObjetosJava();

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