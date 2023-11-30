public abstract class Cartao extends Lance {

    private Jogador jogadorPenalizado;

    public Jogador getJogadorPenalizado() {
        return jogadorPenalizado;
    }

    public Cartao(int minuto, Jogador jogadorPenalizado) {
        super(minuto);
        this.jogadorPenalizado=jogadorPenalizado;
    }

    
}
