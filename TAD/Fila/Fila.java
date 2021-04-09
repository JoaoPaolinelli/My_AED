class Fila {
    protected int[] array;
    private int primeiro, ultimo;

    Fila() {
        this(5);
    };
    Fila(int tamanho) {
        this.array = new int[tamanho+1];
        primeiro = ultimo = 0;

    }
    public void inserir (int elemento) throws Exception {
        /*
            Insere elemento no comeco do array
        */

        if (((ultimo + 1) % array.length) == primeiro) {
            throw new Exception("Erro!");
        }

        // Levar elementos para o fim do array;
        array[ultimo] = elemento;
        ultimo = (ultimo + 1) % array.length;


    }
    public int remover () throws Exception{
        if (primeiro == ultimo) {
            throw new Exception("Erro");
        }
        int remover = array[primeiro];
        primeiro = (primeiro + 1) % array.length;
        return remover;
    }
    void imprimir(){
        int i = primeiro;
        MyIO.print("[");
        while (i != ultimo){
            MyIO.print(array[i] + " ");
            i = (i+1) % array.length;
        }
        MyIO.println("]");
    }
    /*
    # Metodo recursivo de impressao;
    #
        void imprimir(int i){
            if (i != ultimo){
                MyIO.print(array[i] + " ");
                imprimir((i+1)% array.length);
            }else{
                MyIO.println("]");
            }
        }
        void imprimir(){
            int i = primeiro;
            MyIO.print("[");
            imprimir(i);
        }
     */
    int retornaPosicao(int posicao) throws Exception {
        if (primeiro >= array.length || ultimo >= array.length ||  posicao < 0 || posicao > ultimo){
            throw new Exception("Erro posicao");
        }

        return array[posicao];
    }
    public boolean isVazio() throws Exception {
        boolean isVazio = false;
        if (primeiro == ultimo){
            isVazio = true;
            throw new Exception("Fila vazia");
        }

        return isVazio;
    }
    public void pesquisar(int elemento) throws Exception {
        if (isVazio()){
            throw new Exception("Erro de pesquisa, lista vazia");
        }
        boolean pesquisar = false;
        int i = primeiro;
        while ( i != ultimo && !pesquisar){
            if (array[i] == elemento){
                MyIO.println("Elemento: ["+ elemento + "] encontrado");
                pesquisar = true;
            }
            i = (i+1) % array.length;
        }
        if (!pesquisar){
            MyIO.println("Elemento [" + elemento + "] nao encontrado");
        }
    }

    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(6);
        MyIO.println("\t\t\t # Fila Circular #");
        MyIO.println("\t\t\t # First In, First Out #");
        fila.inserir(1);
        fila.inserir(3);
        fila.inserir(4);
        fila.inserir(5);
        fila.inserir(6);
        fila.inserir(5);
        fila.imprimir();
        fila.remover();
        fila.imprimir();
        MyIO.println("--------------------------------------------");
        String xxt = "        Essa eh minha senha hahaha         ";
        




    }
}
