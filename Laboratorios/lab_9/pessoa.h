#ifndef PESSOA_H
#define PESSOA_H

#include <string>

using namespace std;

class Pessoa
{
    string nome;
public:
    Pessoa();
    Pessoa(const string &nome);
    const string &getNome() const;  ///< o cliente não pode alterar this->nome que será retornado por referência
    void setNome(const string &nome);
};

void imprimePessoa(const Pessoa &p);

#endif