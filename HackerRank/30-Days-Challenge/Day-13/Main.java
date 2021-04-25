import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String titulo = in.nextLine();
        String autor = in.nextLine();

        int preco = in.nextInt();

        in.close();

        Book book = new MyBook(titulo, autor, preco);
        book.imprimir();
    }
}