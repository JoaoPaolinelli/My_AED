public class MyBook extends Book{
    private int preco;

    MyBook(String titulo, String autor, int preco) {
        super(titulo, autor);
        this.preco = preco;
    }

    void imprimir() {
        System.out.println("Titulo: " + titulo +
        "\n" + "Autor: " + autor
        + "\n" + "Preco: " + preco);
    }
}
