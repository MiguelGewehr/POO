public class Partida {
    private Time[] times = new Time[2];
    private int[] gols = new int[2];

    public Partida(Time timeA, Time timeB)
    {
        this.times[0]=timeA;
        this.times[1]=timeB;
    }
    public Time getTimeA() {
        return times[0];
    }
    public Time getTimeB() {
        return times[1];
    }
    public void incGolsTimeA()
    {
        gols[0]++;
    }
    public void incGolsTimeB()
    {
        gols[1]++;
    }
    public int getGolsTimeA() {
        return gols[0];
    }
    public int getGolsTimeB() {
        return gols[1];
    }

    public void imprimePartida()
    {
        System.out.print(this.getTimeA().getNome());
        System.out.print(" "+this.getGolsTimeA() + " x ");
        System.out.println(this.getGolsTimeB() + " " 
            + this.getTimeB().getNome());
    }
}
