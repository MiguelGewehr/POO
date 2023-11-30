
public class Funcionario {
    private String nome;
    private float salario;
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    /**
     * Aumenta o salário de um funcionário por uma porcentagem representada como uma fração.
     * 
     * @param porcentagem Porcentagem de aumento representada como uma fração (ex. 0.1f = 10%)
     */
    public void aumentaSalario(float porcentagem)
    {
        salario = salario * (1 + porcentagem);
    }
}
