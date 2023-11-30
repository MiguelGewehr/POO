package biblioteca;

import java.util.Date;

import biblioteca.acervo.Livro;

public class Emprestimo {
    private Usuario usuario;
    private Livro livroEmprestado;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livroEmprestado)
    {
        this.usuario=usuario;
        this.livroEmprestado=livroEmprestado;
        this.dataEmprestimo=new Date();
    }

    public Date getDataEmprestimo()
    {
        return this.dataEmprestimo;
    }

    public Date getDataDevolucao()
    {
        return this.dataDevolucao;
    }

    public Usuario getUsuario()
    {
        return this.usuario;
    }

    public Livro getLivroEmprestado()
    {
        return this.livroEmprestado;
    }
}
