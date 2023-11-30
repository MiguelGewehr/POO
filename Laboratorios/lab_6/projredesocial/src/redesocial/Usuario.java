package redesocial;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private int id;
    private String nome;
    private Set<Usuario> amigos = new HashSet<>(); 

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Set<Usuario> getAmigos()
    {
        return new HashSet<Usuario>(this.amigos);
    }

    public void addAmigo(Usuario u)
    {
        amigos.add(u);
    }

    public void removeAmigo(Usuario u)
    {
        amigos.remove(u);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
