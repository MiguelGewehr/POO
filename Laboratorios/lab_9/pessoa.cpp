#include "pessoa.h"

#include <iostream>

using namespace std;

/**
 * Imprime o nome da pessoa na saída padrão seguido de fim-de-linha.
 * 
 * Exemplo de função não-membro.
 * 
 * @param p a pessoa ser impressa
*/
void imprimePessoa(const Pessoa &p)
{
    cout << p.getNome() << endl ;
}

Pessoa::Pessoa()
{
}

Pessoa::Pessoa(const string &nome) : nome(nome)
{
}

const string& Pessoa::getNome() const 
{
    return this->nome;
}

void Pessoa::setNome(const string &nome)
{
    this->nome=nome;
}
