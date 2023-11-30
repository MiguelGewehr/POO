public class App {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilha("Alo1");
        p.empilha("Alo2");
        p.empilha("Alo3");
        p.empilha("Alo4");
        p.empilha("Alo5");
        System.out.println(p.desempilha());
        System.out.println(p.getTamanho());

    }
}
