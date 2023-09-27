package produtos;

public class Produtos{

    private float preco;
    private String nome;

    public Produtos(float preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }

    public float getPreco(){
        return preco;
    }

    public String getNome(){
        return nome;
    }
}