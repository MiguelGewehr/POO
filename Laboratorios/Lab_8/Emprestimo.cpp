#include "Emprestimo.h"

Emprestimo::Emprestimo(Livro &livro, Pessoa &pessoa): livro(&livro), pessoa(&pessoa){}

Livro &Emprestimo::getLivro() const{
    return *(this->livro); 
}

Pessoa &Emprestimo::getPessoa() const{
    return *(this->pessoa);
}