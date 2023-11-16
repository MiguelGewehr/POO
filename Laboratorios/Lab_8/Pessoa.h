#ifndef _PESSOA_H_
#define _PESSOA_H_

#include <string>
#include <iostream>

using namespace std;

class Pessoa{
    string nome;
    
    public:
        Pessoa(string nome);
        string getNome() const;

};

#endif