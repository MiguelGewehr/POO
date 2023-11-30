import java.util.Comparator;

public class Pessoa  {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade()
    {
        return this.idade;
    }

    // exemplo de comparador como classe estática aninhada (inner class)
    public static class ComparatorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if (o1.getIdade()!=o2.getIdade()) 
            return o1.getIdade()-o2.getIdade();
        else 
            // desempate
            return o1.getNome().compareTo(o2.getNome());
    }
}

}
