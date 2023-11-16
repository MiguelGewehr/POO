#ifndef _LIVRO_H_
#define _LIVRO_H_

#include "Pessoa.h"
#include <list>

class Livro{

    string titulo;
    std::list<Pessoa*> autores;

    public:
        Livro(const string &titulo);
        string getTitulo() const;
        std::list<Pessoa*> getAutores() const;
        void addAutor(Pessoa &autor);
        void imprimeLivro();
};

#endif