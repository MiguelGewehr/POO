package simulado_q3;

import java.util.LinkedList;
import java.util.List;

public class Agencia {
    
    private String nome;
    private List<Conta> contas = new LinkedList<>();
    
    
    public Agencia(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<Conta> getContas() {
        return new LinkedList<>(contas);
    }

    public void adicionaConta(Conta c){
        this.contas.add(c);
    }

    @Override
    public String toString(){
        return "Agência: Jardim da Penha";
    }
}
