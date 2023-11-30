import java.util.Arrays;
import java.util.Comparator;

class ComparatorNome implements Comparator<Pessoa> {
    // só pra dar um exemplo de estado no comparador
    private boolean isCrescente;

    public ComparatorNome()
    {
        isCrescente=true;
    }
    public ComparatorNome(boolean isCrescente)
    {
        this.isCrescente=isCrescente;
    }

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if (isCrescente)
            return o1.getNome().compareTo(o2.getNome());
        else 
            return o2.getNome().compareTo(o1.getNome());
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("Zorro",50);
        pessoas[1] = new Pessoa("Antônia",40);
        pessoas[2] = new Pessoa("Aaron",40);

        // 
        System.out.println("Na ordem inicial:");
        for (Pessoa p : pessoas)
            System.out.println(p.getNome());

        // 
        System.out.println("Em ordem alfabética crescente:");
        Arrays.sort(pessoas, new ComparatorNome(false));
        for (Pessoa p : pessoas)
            System.out.println(p.getNome());

        // 
        System.out.println("Em ordem de idade:");
        Arrays.sort(pessoas, new Pessoa.ComparatorIdade());
        for (Pessoa p : pessoas)
            System.out.println(p.getNome());


        // usando comparator anônimo para fazer descrescente por nome
        Arrays.sort(pessoas,  new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p2.getNome().compareTo(p1.getNome());
            }
        } );
        System.out.println("Em ordem alfabética decrescente:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }

    }
}
