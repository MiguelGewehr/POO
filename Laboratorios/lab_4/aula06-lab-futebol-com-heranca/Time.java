import java.util.LinkedList;

public class Time
{
    private String nome;
    private int nTitulosMundiais;
    private LinkedList<Jogador> elenco = new LinkedList<Jogador>();

    public Time(String nome)
    {
        this.nome=nome;
    }
    public Time(String nome, int nTitulosMundiais)
    {
        this.nome=nome;
        this.nTitulosMundiais=nTitulosMundiais;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void incNumeroTitulosMundiais()
    {
        nTitulosMundiais++;
    }
    public int getNumeroTitulosMundiais()
    {
        return nTitulosMundiais;
    }

}