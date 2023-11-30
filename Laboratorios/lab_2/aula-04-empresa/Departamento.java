import java.util.LinkedList;

public class Departamento {
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private String nome;
    
    public Departamento(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaFuncionario(Funcionario f)
    {
        funcionarios.add(f);
    }
    public void removeFuncionario(Funcionario f)
    {
        funcionarios.remove(f);
    }
    public LinkedList<Funcionario> getFuncionarios()
    {
        return new LinkedList<Funcionario>(funcionarios);
    }
    public void aumentaSalarioFuncionarios(float porcentagem)
    {
        for(Funcionario f : funcionarios)
        {
            f.aumentaSalario(porcentagem);
        }
    }
    public float getSalarioMedio()
    {
        float soma=0.0f;
        for(Funcionario f : funcionarios)
        {
            soma+=f.getSalario();
        }
        return soma/funcionarios.size();
    }

}
