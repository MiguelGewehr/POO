package biblioteca.acervo;

import pessoa.Pessoa;

public class Autor extends Pessoa {
    private String nome;
    public Autor(String nome)
    {
        this.nome=nome;
    }
    public String getNome()
    {
        return this.nome;
    }
}
