package biblioteca.acervo;

import java.util.*;

public class Livro
{
    private String titulo;
    private List<Autor> autores = new LinkedList<>();
    private String id;
    
    public Livro(String id, String titulo, Autor primeiroAutor)
    {
        this.id=id;
        this.titulo=titulo;
        autores.add(primeiroAutor);
    }
    public String getTitulo() { return this.titulo; }
    public String getId() { return this.id; }
    public void addAutor(Autor a) { autores.add(a); }

}