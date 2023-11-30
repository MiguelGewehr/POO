public class PilhaArray
{
    private String[] items;
    private int tamanho;

    private int capacidadeMaxima;

    /**
     * Constrói pilha com capacidade máxima padrão.
     */
    public PilhaArray()
    {
        capacidadeMaxima=5;
        items=new String[capacidadeMaxima];
    }

    /**
     * Constrói pilha com definição do número máximo
     * de elementos.
     * 
     * @param capacidadeMaxima capacidade máxima da pilha
     */
    public PilhaArray(int capacidadeMaxima)
    {
        items=new String[capacidadeMaxima];
    }

    /**
     * Empilha um elemento.
     * 
     * Pré-condição: tamanho<capacidadeMaxima
     * @param s String a ser empilhada
     */
    public void empilha(String s)
    {
        if (tamanho<5)
        { 
            items[tamanho]=s;
            tamanho++;
        }
    }

    /**
     * Desempilha o elemento no topo da pilha.
     * 
     * @return o elemento no topo da pilha ou null se a pilha estiver vazia.
     */
    public String desempilha()
    {
        if (tamanho==0) return null;
        tamanho--;
        return items[tamanho];
    }
    
    /**
     * Retorna o número de elementos na pilha.
     * 
     * @return o número de elementos na pilha
     */
    public int getTamanho()
    {
        return tamanho;
    }
}