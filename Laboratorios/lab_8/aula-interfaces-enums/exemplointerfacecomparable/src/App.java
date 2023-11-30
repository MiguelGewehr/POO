import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("João");
        pessoas[1] = new Pessoa("Pedro");
        pessoas[2] = new Pessoa("Antônia");

        List<Pessoa> pessoas2 = new LinkedList<>();
        pessoas2.add(pessoas[0]);
        pessoas2.add(pessoas[1]);
        pessoas2.add(pessoas[2]);

        Collections.sort(pessoas2);

        Arrays.sort(pessoas);
        System.out.println("Em ordem alfabética crescente:");
        for (Pessoa p : pessoas2) {
            System.out.println(p.getNome());
        }

        // usando lambda functions
        Arrays.sort(pessoas,  (p1, p2) -> p2.getNome().compareTo(p1.getNome()) );
        System.out.println("Em ordem alfabética decrescente:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
        Arrays.sort(pessoas,  (p1, p2) -> p1.getNome().compareTo(p2.getNome()) );
        System.out.println("Em ordem alfabética crescente:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }

    }
}
