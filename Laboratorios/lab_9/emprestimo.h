#if !defined(EMPRESTIMO_H)
#define EMPRESTIMO_H

#include "livro.h"
#include "pessoa.h"

class Emprestimo
{
private:
    Livro* const livro;     // nós nunca vamos mudar o ponteiro, não temos setter
    Pessoa* const usuario;  // nós nunca vamos mudar o ponteiro, não temos setter
    bool isAtual;

public:
    Emprestimo(Livro &livro, Pessoa &usuario);
    Livro &getLivroEmprestado() const;
    Pessoa &getUsuario() const;
    bool livroDevolvido() const;
    void devolveLivro();
};

#endif // EMPRESTIMO_H
