public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Pessoa (String nome)
    {
        this.nome=nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        // ordem alfabética crescente de nome
        return this.getNome().compareTo(o.getNome());
    }
    
}
