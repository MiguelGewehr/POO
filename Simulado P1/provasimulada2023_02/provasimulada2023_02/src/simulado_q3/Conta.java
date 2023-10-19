package simulado_q3;

public class Conta {
    
    private String nomeCliente;
    private Double saldo;
    
    public Conta(String nomeCliente, Double saldo){
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    
}
