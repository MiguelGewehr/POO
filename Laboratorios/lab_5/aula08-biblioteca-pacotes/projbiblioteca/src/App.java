import biblioteca.Biblioteca;
import biblioteca.acervo.Autor;
import biblioteca.acervo.Livro;
import pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Autor m = new Autor("Machado de Assis");
        Livro l1 = new Livro("001","Dom Casmurro", m);
        Livro l2 = new Livro("002","Dom Casmurro", m);
        Biblioteca b = new Biblioteca();
        b.addLivro(l1);
        b.addLivro(l2);

        for (Livro l : b.getAcervo())
        {
            System.out.println(l.getId()+" "+l.getTitulo());
        }

        System.out.println(b);

    }
}
