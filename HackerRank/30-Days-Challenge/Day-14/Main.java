import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho_array_elementos = in.nextInt();

        int[] elementos = new int[tamanho_array_elementos];

        for(int i = 0; i < tamanho_array_elementos; i++) {
            elementos[i] = in.nextInt();
        }
        in.close();

        Difference diferente = new Difference(elementos);

        diferente.computeDifference();

        System.out.println(diferente.diferencaAbsoluta());

    }
}