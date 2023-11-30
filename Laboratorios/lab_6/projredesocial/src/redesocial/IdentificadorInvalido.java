package redesocial;

public class IdentificadorInvalido extends Exception {
    private int idInvalido;
    public IdentificadorInvalido(int id)
    {
        this.idInvalido=id;
    }
    @Override 
    public String getMessage()
    {
        return "Identificador de usuário inválido "+idInvalido;
    }
}
