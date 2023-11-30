#if !defined(LIVRO_H)
#define LIVRO_H

#include "pessoa.h"
#include <iostream>

class Livro
{
    const string titulo;
    Pessoa* const autor;  // não pretendemos mudar o autor
public: 
    Livro(const string &titulo, Pessoa &autor);
    const string &getTitulo() const;
    Pessoa &getAutor() const;
};

#endif // LIVRO_H
