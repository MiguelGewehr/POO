package simulado_q2;

public class Pokemon implements PersonagemDeLuta<Pokemon>{
    
    private int pontosVitalidade;
    private int[] danos = new int[2];
    
    public Pokemon(int pontosVitalidade, int dano1, int dano2){
        this.pontosVitalidade = pontosVitalidade;
        this.danos[0] = dano1;
        this.danos[1] = dano2;
    }

    public int getPontosVitalidade() {
        return pontosVitalidade;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        
        
    }

    @Override
    public void regenera() {

    }
}
