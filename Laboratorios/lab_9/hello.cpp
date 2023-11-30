#include <iostream>
using namespace std;

#include "pessoa.h"
#include "livro.h"
#include "emprestimo.h"

int main()
{
    Pessoa ppp;
    Pessoa m("Machado de Assis");
    Livro l("Dom Casmurro",m);
    Pessoa fulano("Fulano");
    Emprestimo e(l,fulano);
    cout << "Nome autor do livro antes de alteração: " << e.getLivroEmprestado().getAutor().getNome() << endl;
    e.getLivroEmprestado().getAutor().setNome("MdA");
    cout << "Nome autor do livro depois de alteração: " << e.getLivroEmprestado().getAutor().getNome() << endl;
    cout << "Nome autor do livro depois de alteração: " << m.getNome() << endl;
    imprimePessoa(m);
}
