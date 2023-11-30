import biblioteca.Biblioteca;
import biblioteca.Livro;
import pessoa.Genero;
import pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa machado = new Pessoa(Genero.MASCULINO, "Machado de Assis"); 
        // A biblioteca é Biblioteca.INSTANCE e ela é uma factory de Livro
        Livro l = Biblioteca.INSTANCE.criaLivro("12312", "Dom Casmurro", machado);

        Pessoa p = new Pessoa(Genero.MASCULINO, "Antônio");
        Pessoa f = new Pessoa(Genero.getGenero(2), "Fulano");

        for (TamanhoCamiseta t : TamanhoCamiseta.values())
        {
            System.out.println(t+" equivale a "+t.getCorrespondenteUS());
            TamanhoCamiseta.US tamanhoUS = t.getCorrespondenteUS();
            if (tamanhoUS == TamanhoCamiseta.US.XL)
            {
                System.out.println("Achei tamanho XL");
            }
        }

    }
}
