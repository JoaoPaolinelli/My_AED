import java.util.Arrays;

public class Pilha{
    private static Celula topo;

    public Pilha(){
        topo = null;
    }
    public void inserir(int x){
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }
    public int remover() throws Exception{
        if(topo == null){
            throw new Exception("Erro ao remover");
        }
        int elemento = topo.getElemento();
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }
    public void mostrar() {
        System.out.print("[");
        for (Celula i = topo; i != null; i = i.prox) {
            System.out.print(i.getElemento()+" ");
        }
        System.out.println("]");
    }
    static int somar(){
        int soma = 0;
        for(Celula i = topo; i != null; i = i.prox){
            soma += i.getElemento();
        }
        return soma;
    }
    static int somarRecursivo(Celula i,int x){
        
        if(i != null){
        x += i.getElemento();
        // i = i.prox;
        System.out.println(x);
        return somarRecursivo(i.prox,x);
        }else{
            return x;
        }
        
        
    }
    static int maiorElementoRecursivo(Celula i, int elementoMaior){

        if(i != null){
            if(i.getElemento() > elementoMaior){
                elementoMaior = i.getElemento();
            }
            return maiorElementoRecursivo(i.prox, elementoMaior);
        }else{
            return elementoMaior;
        }
    }
    static int maiorElemento(int maior){
        
        for (Celula i = topo;  i != null; i = i.prox) {

            if(i.getElemento() > maior)
                maior = i.getElemento();
            
        }
        return maior;
    }
    static void ordemSaida() {
        System.out.print("[");
        for (Celula i = topo; i != null; i = i.prox) {
            System.out.print(i.getElemento()+" ");
        }
        System.out.println("]");
    }
    public static String ordemEntrada(){
        //6
        int qtdElementos = 0;
        String tentativa = "";
        for ( Celula i = topo; i != null; i = i.prox){
            tentativa += Integer.toString(i.getElemento()) + " ";
        }
        String[] inverterString = tentativa.split(" ");
        int numL = inverterString.length-1;
        for (int i = 0; i < inverterString.length/2; i++) {
            String tmp= inverterString[i];
            inverterString[i] = inverterString[numL];
            inverterString[numL] = tmp;
            numL--;
        }
        return Arrays.toString(inverterString);
    }
    public static void ordemEntradaRecursivo(Celula i){
        //5
        String juntar = "";
        
        String[] c2 = new String[20];
        
        int contador = 0;
        int parada = 0;
        if(i != null){
            juntar += Integer.toString(i.getElemento()) + " ";
            contador++;
            ordemEntradaRecursivo(i.prox);
        }else if (parada == 0) {
            String[] reverseEntrada = juntar.split(" ");
            parada++;
            c2 = reverseEntrada;
        }else{
            juntar = inverterPalavra(0, c2.length-1, c2);
            
        }
       
        System.out.print(juntar + " ");
    
    }
    public static String inverterPalavra(int i, int j, String[] s ){
        if(i < j){
            String tmp = s[i];
            s[i] = s[j];
            s[j] = s[i];
            inverterPalavra(i++, j++, s);
        }
        return Arrays.toString(s);
    }
    
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        pilha.inserir(3);
        pilha.inserir(5);
        pilha.inserir(7);
        pilha.inserir(1);
        pilha.inserir(100);
        pilha.inserir(80);
        pilha.inserir(103);
        pilha.inserir(80);
        pilha.inserir(90);

        // int x = pilha.remover();
        // System.out.println(x);

        pilha.mostrar();

        /*
        Exercicio 01 - Somar os elementos de forma recursiva
        */
        // int k = somarRecursivo(Pilha.topo, 0);
        // System.out.println(k);

        
        /*
        Exercicio 02 - Maior elemento contido na pilha
        */
        // int k = maiorElemento(0);
        // String k = ordemEntrada();
        
        
        /*
        Exercicio 03 - Maior elemento contido na pilha (RECURSIVO)
        */
        // int k = maiorElementoRecursivo(topo, topo.getElemento());
        // System.out.println(k);

        // ordemEntradaRecursivo(topo);

        /*
        Exercicio 04 - Ordem de remocao (RECURSIVO)
        */
        // ordemSaida();

        /*
        Exercicio 05 - 
        -Ordem que os elementos foram inseridos (RECURSIVO)
        */
        // ordemEntradaRecursivo(topo);

        /*
        Exercicio 06 - 
        -Ordem que os elementos foram inseridos (INTERATIVO)
        */
        // ordemEntrada();
        
        /*Exercicio 07 -
        Imagens do codigo em zip.
        */

        
        /*
        Playground 
        */
        // Referencia topo = Ultimo elemento
        // Celula b = pilha.topo;
        // Celula c = pilha.topo.prox;
        // System.out.println(b.getElemento()); 
        // System.out.println(c.getElemento());
        // Referencia interna para a Celula do topo.
        // Celula c = pilha.topo.prox;  
        // System.out.println(c.getElemento());
    }
}