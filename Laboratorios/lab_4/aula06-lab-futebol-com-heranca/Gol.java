public class Gol extends Lance {

    private Jogador autor;

    // TODO adicionar time que sofreu o gol

    public Gol(int minuto, Jogador autor) {
        super(minuto);
        this.autor=autor;
    }

    public Jogador getAutor()
    {
        return this.autor;
    }

    @Override
    public String toString()
    {
        return "Gol feito por "+getAutor().getNome()+
            " no minuto "+getMinuto();
    }
    
}
