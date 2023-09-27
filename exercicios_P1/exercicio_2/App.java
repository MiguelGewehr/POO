import conta.Conta;
import conta.ContaEspecial;
import conta.SaldoInsuficiente;

public class App {
    public static void main(String[] args){
        
        Conta c1 = new Conta(123);

        c1.deposito(100f);

        ContaEspecial c2 = new ContaEspecial(321);

        c2.deposito(100f);

        System.out.println("Saldo c1:" + c1.getSaldo());
        System.out.println("Saldo c2:" + c2.getSaldo());

        try{
            c2.saque(96f);
            System.out.println("Saldo c2 depois saque:" + c2.getSaldo());
            c1.saque(96f);
            System.out.println("Saldo c1 depois saque:" + c1.getSaldo());
        }
        catch(SaldoInsuficiente e){
            System.out.println("Saldo Insuficiente!");    
        }

    }
}
