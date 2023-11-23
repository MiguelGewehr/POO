#include "Departamento.h"

Departamento::Departamento(int codigo, std::string nome) : codigo(codigo), nome(nome){}

std::string Departamento::getNome() const{
    return this->nome;
}

int Departamento::getCodigo() const{
    return this->codigo;
}