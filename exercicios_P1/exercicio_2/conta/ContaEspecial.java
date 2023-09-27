package conta;

public class ContaEspecial extends Conta{
    
    public ContaEspecial(int numConta){
        super(numConta);
    }

    @Override
    public void saque(float quantia) throws SaldoInsuficiente{
        
        float taxa = quantia * 0.01f;

        if(this.saldo >= quantia+ taxa)
            this.saldo -= quantia + taxa;
        else
            throw new SaldoInsuficiente();
    }
}
