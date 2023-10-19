package simulado_q3;

public class Banco {
    
    private String nome;

    public Banco(String nome){
        this.nome = nome;
    }
    public Agencia criaAgencia(String nomeAgencia){
        return new Agencia(nomeAgencia);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Nome do Banco: " + this.nome; 
    }

}
