package redesocial;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedeSocial {

    private Map<Integer,Usuario> usuarios = new HashMap<>();
    private int proxId;

    public Usuario getUsuario(int id) throws IdentificadorInvalido
    {
        Usuario u = usuarios.get(id);
        if (u==null) {
            throw new IdentificadorInvalido(id);
        } else 
            return u;

    }

    public Usuario criaUsuario(String nome)
    {
        Usuario u = new Usuario(proxId, nome);
        usuarios.put(proxId,u);
        proxId++;
        return u;
    }

    public Set<Usuario> getUsuarios()
    {
        return new HashSet<Usuario>(this.usuarios.values());
    }

    
}
