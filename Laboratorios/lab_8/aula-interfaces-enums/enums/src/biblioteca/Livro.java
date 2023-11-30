package biblioteca;

import pessoa.Pessoa;

public class Livro {
    private String isbn, titulo;
    private pessoa.Pessoa autor;

    // o construtor não é público, apenas outras classes no pacote
    // como Biblioteca podem criar livros
    Livro(String isbn, String titulo, Pessoa autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public pessoa.Pessoa getAutor() {
        return autor;
    }


}
