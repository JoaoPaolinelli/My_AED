import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String primeiroNome = in.next();
        String ultimoNome = in.next();

        int identificador = in.nextInt();
        int quantidade_nota = in.nextInt();

        int[] nota = new int[quantidade_nota];

        for (int i = 0; i < nota.length; i++) {
            nota[i] = in.nextInt();
        }

        in.close();

        Student estudante = new Student(primeiroNome, ultimoNome, identificador, nota);

        estudante.imprimir();
        
        System.out.println("Media: " + estudante.calculate()); 
    }
}
