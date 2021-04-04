class Pilha {
    protected int[] array;
    private int n;

    Pilha() {
        this(6);
    };
    Pilha(int tamanho) {
        this.array = new int[tamanho];
        this.n =0;
    }

    public void empilhar(int elemento) throws Exception {
        if (n >= array.length) {
            throw new Exception("Erro!");
        }
            array[n] = elemento;
            n++;
    }
    public int desempilhar() throws Exception {
        if (n == 0) {
            throw new Exception("Erro!");
        }

        // O metodo pode tambem retornar o valor removido;
        return array[--n];
//        --n;
    }
    void imprimir(){
        MyIO.println("--------------------------------------------");
        for (int i = 0; i < n; i++) {
            MyIO.println("[ "+array[i] + " ]");
        }
        MyIO.print("[   ]\n");
    }

    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(6);
        MyIO.println("\t\t\t # Pilha #");
        MyIO.println("\t\t#First In, Last Out (FILO) #  ");
        pilha.empilhar(1);
        pilha.empilhar(3);
        pilha.empilhar(7);
        MyIO.println("Desempilhar:  " +pilha.desempilhar());

        MyIO.println("--------------------------------------------");
    }
}
