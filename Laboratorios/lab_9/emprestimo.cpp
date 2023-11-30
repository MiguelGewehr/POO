#include "emprestimo.h"

Emprestimo::Emprestimo(Livro &livro, Pessoa &usuario) : livro(&livro), usuario(&usuario)
{
    cout << livro.getTitulo() << " foi emprestado!" << endl; 
}

Livro& Emprestimo::getLivroEmprestado() const
{
    return *(this->livro);
}

Pessoa& Emprestimo::getUsuario() const
{
    return *(this->usuario);
}

bool Emprestimo::livroDevolvido() const
{
    return !this->isAtual;
}

void Emprestimo::devolveLivro()
{
    this->isAtual=false;
}
