package produtos;

public class Livro extends Produtos{
    
    String autor;

    public Livro(float preco, String nome, String autor){

        super(preco, nome);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return this.getNome() + " " + this.getPreco() + " " + this.autor;
    }

}
