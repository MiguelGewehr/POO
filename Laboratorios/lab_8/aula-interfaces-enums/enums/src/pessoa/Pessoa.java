package pessoa;
public class Pessoa {

    // veja aqui o tipo Genero sendo usado, e não "int" 
    private Genero genero;
    private String nome;

    public Pessoa(Genero genero, String nome)
    {
        this.genero=genero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString()
    {
        // aqui a "constante" é usada (Genero.FEMININO não é realmente
        // uma constante é um objeto que foi pré-enumerado)
        String prefix = (this.genero==Genero.FEMININO) ? "Sra" : "Sr";
        return prefix + " " + getNome();
    }
}
