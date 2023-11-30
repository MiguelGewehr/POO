import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PartidaDetalhada extends Partida {

    private List<Lance> lances = new ArrayList<Lance>();

    public PartidaDetalhada(Time timeA, Time timeB) {
        super(timeA, timeB);
    }

    public void adicionaLance(Lance l)
    {
        //FIXME tratar os gols com incremento do placar
        lances.add(l);
    }

    //TODO getGols()

    public List<Lance> getLances()
    {
        return new LinkedList<Lance>(lances);
    }
    
}
