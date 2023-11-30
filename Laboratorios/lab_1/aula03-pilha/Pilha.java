import java.util.LinkedList;

/**
 * Pilha implementada sobre lista duplamente encadeada.
 * 
 * A pilha tem uma semântica last-in-first-out (LIFO).
 */
public class Pilha
{
    private LinkedList<String> items = new LinkedList<>();

    /**
     * Empilha um elemento.
     * 
     * @param s String a ser empilhada
     */
    public void empilha(String s)
    {
        items.addLast(s);
    }

    /**
     * Desempilha o elemento no topo da pilha.
     * 
     * @return o elemento no topo da pilha ou null se a pilha estiver vazia.
     */
    public String desempilha()
    {
        if (items.isEmpty()) return null;
        return items.removeLast();
    }
    
    /**
     * Retorna o número de elementos na pilha.
     * 
     * @return o número de elementos na pilha
     */
    public int getTamanho()
    {
        return items.size();
    }

    /**
     * Indica se a pilha está vazia.
     */
    public boolean isVazia()
    {
        return this.getTamanho()==0;
    }

}