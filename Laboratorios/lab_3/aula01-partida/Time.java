public class Time
{
    private String nome;
    private int nTitulosMundiais=0;

    public int getnTitulosMundiais() {
        return this.nTitulosMundiais;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void incNTitulosMundiais()
    {
        nTitulosMundiais++;
    }



}
