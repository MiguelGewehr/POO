package simulado_q1;

import java.util.HashSet;
import java.util.Set;

public class UserBase {
    
    private Set<User> usuarios = new HashSet<>();

    public Set<User> getUsuarios() {
        return new HashSet<>(this.usuarios);
    }

    public void addUsuario(User usuario){
        this.usuarios.add(usuario);
    }

    public float calculaMediaTweets(){

        float media = 0;
        int qtdTweets = 0;
        int numPalavras = 0;
        
        for(User u : usuarios){
            for(Tweet t : u.getTweets()){
                String[] partes = t.getText().split(" ");
                numPalavras += partes.length;
                qtdTweets++;
            }
        }
        
        media = numPalavras/qtdTweets; 
        
        return media;
    }

    public  float porcentagemUserVerificados(){

        float porcentagem = 0;
        float qtdVerificados = 0;

        for(User u : usuarios){
            if(u instanceof VerifiedUser)
                qtdVerificados++;
        }
        
        porcentagem = qtdVerificados / usuarios.size() * 100;
 
        return porcentagem;
    }
}
