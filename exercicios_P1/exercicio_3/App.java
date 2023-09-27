import produtos.CD;
import produtos.DVD;
import produtos.Livro;

public class App {
    
    static public void main(String[] args){

        Livro l1 = new Livro(12, "Sapiens", "Geraldo");
        CD cd = new CD(20, "Sertanejo", 15);
        DVD dvd = new DVD(15, "Sherek", 512);

        System.out.println(l1.toString() + " " + cd.toString() + " " + dvd.toString());
    }
}
