package produtos;

public class DVD extends Produtos{
    
    float duracao;

    public DVD(float preco, String nome, float duracao){
        super(preco, nome);
        this.duracao = duracao;
    }


    public float getDuracao(){
        return this.duracao;
    }

    @Override
    public String toString(){
        return this.getNome() + " " + this.getPreco() + " " + this.duracao;
    }
}
