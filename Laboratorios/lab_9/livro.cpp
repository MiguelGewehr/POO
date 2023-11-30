#include "livro.h"

Livro::Livro(const string &titulo, Pessoa &autor) : titulo(titulo), autor(&autor)
{
}

const string &Livro::getTitulo() const
{
    return this->titulo;
}

Pessoa& Livro::getAutor() const
{
    return *(this->autor);
}

