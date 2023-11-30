package biblioteca;

import java.util.HashMap;
import java.util.Map;

import pessoa.Pessoa;

public enum Biblioteca {
    // exemplo de "singleton", instância única
    INSTANCE;

    // com comportamento "DA biblioteca", não "de uma biblioteca"
    
    private Map<String,Livro> acervo = new HashMap<>();

    public Livro criaLivro(String isbn, String titulo, Pessoa autor)
    {
        Livro l=new Livro(isbn, titulo, autor);
        acervo.put(isbn, l);
        return l;
    }

}
