#include "Pessoa.h"

Pessoa::Pessoa(string nome){
    this->nome = nome;
}

string Pessoa::getNome() const
{
    return this->nome;    
}