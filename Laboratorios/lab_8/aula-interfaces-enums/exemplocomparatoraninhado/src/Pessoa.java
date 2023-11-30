import java.util.Comparator;

public class Pessoa {

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

    public int getIdade() {
        return this.idade;
    }

    // classes aninhadas estáticas... ainda combinadas com o singleton pattern
    // podem ser acessadas por Pessoa.ComparatorNome e Pessoa.ComparatorIdade

    public static enum ComparatorNome implements Comparator<Pessoa> {
        INSTANCE;
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    }

    public static enum ComparatorIdade implements Comparator<Pessoa> {
        INSTANCE;
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return o1.getIdade() - o2.getIdade();
        }
    }

}
