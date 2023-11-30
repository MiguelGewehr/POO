import java.util.LinkedList;

public class Empresa
{
    private LinkedList<Departamento> departamentos = new LinkedList<Departamento>();
    private String nome;
    
    public Empresa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaDepartamento(Departamento d)
    {
        departamentos.add(d);
    }
    public void removeDepartamento(Departamento d)
    {
        departamentos.remove(d);
    }
    public LinkedList<Departamento> getDepartamentos()
    {
        return new LinkedList<Departamento>(departamentos);
    }

    public void aumentaSalarioFuncionarios(float porcentagem)
    {
        for(Departamento d : departamentos)
        {
            d.aumentaSalarioFuncionarios(porcentagem);
        }
    }

    public float getSalarioMedio()
    {
        int i;
        float soma=0.0f;
        i=0;
        for(Departamento d : departamentos)
        {
            for(Funcionario f : d.getFuncionarios())
            {
                soma+=f.getSalario();
                i++;
            }
        }
        return soma/i;
    }

}