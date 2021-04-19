public class Celula{
    private int elemento;
    public Celula prox;

    public Celula() { this(0); }
    public Celula(int x) {
        this.elemento = x;
        this.prox = null;
    }
    int getElemento(){
        return elemento;
    }
    void setCelula(Celula referencia){
        this.prox = referencia;
    }
    Celula getCelula(){
        return prox;
    }
}
