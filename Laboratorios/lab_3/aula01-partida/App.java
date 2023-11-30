public class App {
    public static void main(String[] args) {
        Time fla = new Time();
        Time vasco = new Time();
        fla.setNome("Flamengo");
        fla.incNTitulosMundiais();

        vasco.setNome("Vasco");

        System.out.println(fla.getNome());
        System.out.println(vasco.getNome());

        Partida flavasco = new Partida();
        flavasco.setTimeA(fla);
        flavasco.setTimeB(vasco);
        fla.setNome("Flamengo FC");
        System.out.println(flavasco.getTimeA().getNome());

        imprimePlacar(flavasco);
        flavasco.setGolsTimeA(2);
        imprimePlacar(flavasco);
    }

    static void imprimePlacar(Partida p)
    {
       System.out.println("Placar da partida:");
        System.out.println(p.getTimeA().getNome() + ", número de gols = "+
            p.getGolsTimeA());
        System.out.println(p.getTimeB().getNome() + ", número de gols = "+
            p.getGolsTimeB());
    }
}
