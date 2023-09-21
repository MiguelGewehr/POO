package conta;

public class Conta {
    
    protected float saldo;
    private int numConta;

    public Conta(int numConta){
        this.numConta = numConta;
        this.saldo = 0;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public int getNumConta(){
        return this.numConta;
    }


    public void deposito(float quantia){
        this.saldo += quantia;
    }

    public void saque(float quantia) throws SaldoInsuficiente{
        
        float taxa = quantia * 0.05f;

        if(this.saldo >= quantia+ taxa)
            this.saldo -= quantia + taxa;
        else
            throw new SaldoInsuficiente();
    }

}
