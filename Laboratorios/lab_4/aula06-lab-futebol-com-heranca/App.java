public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");
        PartidaDetalhada flaflu = new PartidaDetalhada(fla, flu);
        Campeonato c = new Campeonato();
        c.adicionaPartida(flaflu);

        Jogador fulano = new Jogador("Fulano");
        Gol golDeFulano1 = new Gol(12, fulano);
        flaflu.adicionaLance(golDeFulano1);
        Gol golDeFulano2 = new Gol(32, fulano);
        flaflu.adicionaLance(golDeFulano2);
        CartaoVermelho cv = new CartaoVermelho(50, fulano);
        flaflu.adicionaLance(cv);

        for(Lance l : flaflu.getLances())
        {
            System.out.println(l);
        }

    }


}
