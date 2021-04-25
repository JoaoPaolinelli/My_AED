import java.util.*;

abstract class Book {
    String titulo;
    String autor;
    
    Book(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract void imprimir();
}
