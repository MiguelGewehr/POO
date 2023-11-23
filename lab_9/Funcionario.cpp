#include "Funcionario.h"

Funcionario::Funcionario(int codigo, std::string nome, Departamento *Departamento) : codigo(codigo), nome(nome), departamento(departamento){}

int Funcionario::getCodigo() const{
    return this->codigo;
}

std::string Funcionario::getNome() const{
    return this->nome;
}

Departamento Funcionario::getDepartamento() const{
    return *(this->departamento);
}