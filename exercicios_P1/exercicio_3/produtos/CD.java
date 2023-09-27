package produtos;

public class CD extends Produtos{
    
    private int numFaixas;

    public CD(float preco, String nome, int numFaixas){
        super(preco, nome);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas(){
        return this.numFaixas;
    }

    @Override
    public String toString(){
        return this.getNome() + " " + this.getPreco() + " " + this.numFaixas;
    }
}
