public class App {

    public static void imprimeEmpresa(Empresa e)
    {
        System.out.println(e.getNome());
        for (Departamento d : e.getDepartamentos()) {
            System.out.println("Departamento: "+d.getNome());
            System.out.println("salário médio: R$"+d.getSalarioMedio());
            for (Funcionario f : d.getFuncionarios())
            {
                System.out.println("Funcionário "+f.getNome()+" salário: R$"+f.getSalario());
            }
        }
    }

    public static void main(String[] args) {
        Empresa acme = new Empresa("ACME");
        Departamento rh = new Departamento("Recursos Humanos");
        acme.adicionaDepartamento(rh);
        Funcionario coiote = new Funcionario("Coiote", 1000.0f);
        rh.adicionaFuncionario(coiote);
        Departamento ti = new Departamento("TI");
        acme.adicionaDepartamento(ti);
        Funcionario fulano = new Funcionario("Fulano", 10000.0f);
        ti.adicionaFuncionario(fulano);
        Funcionario maria = new Funcionario("Maria", 20000.0f);
        ti.adicionaFuncionario(maria);

        imprimeEmpresa(acme);
        ti.aumentaSalarioFuncionarios(0.1f);
        imprimeEmpresa(acme);
    }
}
