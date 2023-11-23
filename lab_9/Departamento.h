#ifndef _DEPARTAMENTOS_H_
#define  _DEPARTAMENTOS_H_

#include <iostream>

using namespace std;

class Departamento{
    int codigo;
    std::string nome;

    public:
        Departamento(int codigo, std::string nome);
        std::string getNome() const;
        int getCodigo() const; 
};

#endif