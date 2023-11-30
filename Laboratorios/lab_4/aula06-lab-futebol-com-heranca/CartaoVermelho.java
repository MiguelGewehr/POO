public class CartaoVermelho extends Cartao {

    public CartaoVermelho(int minuto, Jogador jogadorPenalizado) {
        super(minuto, jogadorPenalizado);
    }

    @Override
    public String toString()
    {
        return "Cartão vermelho cometido por "+
            this.getJogadorPenalizado().getNome()
            +" no minuto "+getMinuto();
    }
    
}
