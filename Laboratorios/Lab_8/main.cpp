#include <string>
#include "Emprestimo.h"

int main(){

    Pessoa pessoa("Miguel");
    
    Livro livro("Dom Casmurro");

    livro.addAutor(pessoa); 
    
    Emprestimo Emprestimo(livro, pessoa);
    
    livro.imprimeLivro();
    return 0;
}