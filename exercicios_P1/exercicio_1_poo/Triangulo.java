public class Triangulo{

    private Ponto[] pontos = new Ponto[3];

    public Ponto getPonto(int idx){
        return this.pontos[idx];
    }

    public void preencheTriangulo(String[] pontos){

        int idx = 0;

        Double x=0.0;
        Double y=0.0;

        for(int i=0; i < 6; i++){
            try{
                x = Double.parseDouble(pontos[i++]);
                y = Double.parseDouble(pontos[i]);
            }catch(NumberFormatException e){
                System.out.println("O formato da entrada nao e um Double!");
            }
            

            this.pontos[idx] = new Ponto(x, y);
            idx++;
        }
    }

    public Double calculaPerimetro(){
        return Ponto.calculaDistanciaPontos(this.getPonto(0), this.getPonto(1)) 
        + Ponto.calculaDistanciaPontos(this.getPonto(0), this.getPonto(2))
        + Ponto.calculaDistanciaPontos(this.getPonto(1), this.getPonto(2)) ;
    }
}