#ifndef _FUNCIONARIO_H_
#define _FUNCIONARIO_H_

#include "Departamento.h"

class Funcionario{
    int codigo;
    std::string nome;
    Departamento *departamento;

    public:
        Funcionario(int codigo, std::string nome, Departamento *Departamento);
        int getCodigo() const;
        std::string getNome() const;
        Departamento getDepartamento() const;
};

#endif