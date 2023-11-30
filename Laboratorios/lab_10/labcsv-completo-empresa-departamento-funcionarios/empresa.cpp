#include "empresa.h"

Departamento &Empresa::createDepartamento(int codigo, const string &nome)
{
    Departamento d(codigo,nome);
    departamentos.insert({codigo,d});
    return departamentos.at(codigo);
}

bool Empresa::containsDepartamento(int codigo) const
{
    return departamentos.find(codigo)!=departamentos.end();
}

Departamento &Empresa::findDepartamento(int codigo)
{
    return departamentos.at(codigo);
}

const map<int, Departamento> &Empresa::getDepartamentos() const
{
    return this->departamentos;
}
