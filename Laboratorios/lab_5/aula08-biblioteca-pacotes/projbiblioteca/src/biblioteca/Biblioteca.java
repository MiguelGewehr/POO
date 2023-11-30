package biblioteca;

import java.util.*;

import biblioteca.acervo.Livro;

public class Biblioteca {
    private Map<String,Livro> acervo = new java.util.HashMap<>();
    private Set<Emprestimo> emprestimos = new java.util.HashSet<>();

    @Override
    public String toString()
    {
        String result="";
        for (Livro l : acervo.values())
        {
            result+=l.getTitulo()+"\n";
        }
        return result;
    }

    public void addLivro(Livro l)
    {
        acervo.put(l.getId(), l);
    }

    public Livro getLivro(String id)
    {
        return acervo.get(id);
    }

    public void addEmprestimo(Emprestimo e)
    {
        emprestimos.add(e);
    }

    public Set<Emprestimo> getEmprestimos()
    {
        return new HashSet<Emprestimo>(this.emprestimos);
    }

    public Set<Livro> getAcervo()
    {
        return new HashSet<Livro>(acervo.values());
    }

}
