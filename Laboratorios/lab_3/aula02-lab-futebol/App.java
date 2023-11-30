public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");
        Partida flaflu = new Partida(fla, flu);
        flaflu.incGolsTimeA();
        flaflu.incGolsTimeA();
        Campeonato c = new Campeonato();
        c.adicionaPartida(flaflu);
        // Time vasco = new Time("Vasco", 0);
        // c.adicionaPartida(new Partida(fla, vasco));

        for(Partida p : c.getPartidas())
        {
            p.getTimeB().incNumeroTitulosMundiais();
            p.imprimePartida();
        }
    }


}
