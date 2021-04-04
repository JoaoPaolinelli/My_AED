class Lista {
    protected int[] array;
    private int n;

    Lista() {
        this(6);
    };
    Lista(int tamanho) {
        this.array = new int[tamanho];
        this.n =0;
    }
    public void inserirPosicao (int elemento, int posicao) throws Exception {
        if ( n>= array.length || posicao < 0 || posicao > n ) {
            throw new Exception("Erro : Lista cheia!");
        }
        // Levar elementos para o fim do array;
        for (int i = n; i > posicao ; i--) {
            array[i] = array[i-1];
        }
        array[posicao] = elemento;
        n++;
    }
    public void inserir (int elemento) throws Exception {
        /*
            Insere elemento no comeco do array
        */

        if (n >= array.length) {
            throw new Exception("Erro!");
        }

        // Levar elementos para o fim do array;
        for (int i = n; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = elemento;
        n++;

    }
    public void inserirFinal (int elemento) throws Exception {
        if (n >= array.length) {
            throw new Exception("Erro!");
        }
            array[n] = elemento;
            n++;
    }
    public void removerPosicao (int posicao) throws Exception {
        if ( n == 0 || posicao < 0 || posicao >= n ) {
            throw new Exception("Erro");
        }
        int remover = array[posicao];
        n--;
        for (int i = posicao; i < n ; i++) {
            array[i] = array[i+1];
        }
        // O metodo pode tambem retornar o valor removido;
        //return remover;
    }
    public void removerInicio() throws Exception {
        if (n ==0) {
            throw new Exception("Erro!");
        }

        int remover = array[0];
        n--;
        for (int i = 0; i < n; i++) {
            array[i] = array[i+1];
        }

        // O metodo pode tambem retornar o valor removido;
        //return remover;
    }
    public void removerFinal() throws Exception {
        if (n == 0) {
            throw new Exception("Erro!");
        }

        // O metodo pode tambem retornar o valor removido;
        //return array[--n];
        --n;
    }
    void imprimir(){
        MyIO.print("[");
        for (int i = 0; i < n; i++) {
            MyIO.print(array[i] + " ");
        }
        MyIO.println("]");
    }

    public static void main(String[] args) throws Exception {
        Lista lista = new Lista(6);
        MyIO.println("\t# LISTA LINEAR #");
        MyIO.println("--------------------------------------------");
    }
}
