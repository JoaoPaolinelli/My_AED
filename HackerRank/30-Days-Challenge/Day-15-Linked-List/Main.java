import java.util.Scanner;

public class Main {

    public static Celula inserir(Celula head, int data) {
        if(head == null){

            head = new Celula(data);
            return head;
        }else {

            Celula novaCelula = new Celula(data);
            Celula tmp = head;

            while(tmp.next != null) {

                tmp = tmp.next;
            }
            
            tmp.next = novaCelula;
        }
        
       return head;
    }
    
    public static void imprimir(Celula head) {

        Celula tmp = head;

        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Celula head = null;

        int numero = in.nextInt();

        while(numero-- > 0) {

            int ele = in.nextInt();
            head = inserir(head,ele);
        }
        System.out.println("##");

        imprimir(head);

        in.close();
    }
}
