public class Ponto {
    
    private Double x;
    private Double y;

    public Ponto(Double x, Double y){

        this.x = x;
        this.y = y;
    }

    public Double getX(){
        return this.x;
    }

    public Double getY(){
        return this.y;
    }

    public static Double calculaDistanciaPontos(Ponto p1, Ponto p2){
        
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }
}
