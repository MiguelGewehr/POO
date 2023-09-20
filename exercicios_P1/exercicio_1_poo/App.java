public class App {
    public static void main(String[] args) {
        
        Triangulo tri = new Triangulo();

        tri.preencheTriangulo(args);

        System.out.println("O perimetro é " + tri.calculaPerimetro());
    }
}
