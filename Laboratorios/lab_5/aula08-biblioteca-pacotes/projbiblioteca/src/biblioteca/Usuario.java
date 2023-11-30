package biblioteca;

public class Usuario {
    private String nome;
    private boolean isApto=true;

    public Usuario(String nome)
    {
        this.nome=nome;
    }

    public String getNome()
    {
        return this.nome;
    }
    
}
