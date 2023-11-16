#ifndef _EMPRESTIMO_H_
#define _EMPRESTIMO_H_

#include "Livro.h"

class Emprestimo{
    Livro *livro;
    Pessoa *pessoa;

    public:
        Emprestimo(Livro &livro, Pessoa &pessoa);
        Livro &getLivro() const;
        Pessoa &getPessoa() const; 
};

#endif