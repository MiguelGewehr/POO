import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Pessoa("Zorro",50);
        pessoas[1] = new Pessoa("Antônia",40);

        // 
        System.out.println("Na ordem inicial:");
        for (Pessoa p : pessoas)
            System.out.println(p.getNome());

        // 
        System.out.println("Em ordem alfabética crescente:");
        Arrays.sort(pessoas, Pessoa.ComparatorNome.INSTANCE);
        for (Pessoa p : pessoas)
            System.out.println(p.getNome());

        // 
        System.out.println("Em ordem de idade:");
        Arrays.sort(pessoas, Pessoa.ComparatorIdade.INSTANCE);
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
