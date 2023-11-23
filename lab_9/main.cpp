#include <iostream>
#include <fstream>
#include <sstream>
#include <map>
#include "Funcionario.h"

using namespace std;

int main() {
    std::ifstream in("departamentos.csv");
    std::string linha;

    map<int, Departamento> mapa;
    map<int, Funcionario> funcionarios;

    getline(in, linha);

    while (getline(in, linha)) {

        std::istringstream linhaStream(linha);
        std::string coluna1;
        std::string coluna2;
        
        std::getline(linhaStream >> std::ws, coluna1, ';');
        std::getline(linhaStream >> std::ws, coluna2, ';');

        int codigo = stoi(coluna1);
        
        if(mapa.find(codigo) == mapa.end()){
            Departamento departamento(codigo, coluna2);
            mapa.insert(std::make_pair(codigo, departamento));
        }
    }

    for(const pair<int, Departamento> &p : mapa){
        std::cout << p.second.getNome() << endl;
    }

    std::ifstream in2("funcionarios.csv");
    std::string linha2;
    getline(in2, linha2);
    while(getline(in2, linha2)) {

        std::istringstream linhaStream(linha2);
        std::string coluna1;
        std::string coluna2;
        std::string coluna3;

        std::getline(linhaStream >> std::ws, coluna1, ';');
        std::getline(linhaStream >> std::ws, coluna2, ';');
        std::getline(linhaStream >> std::ws, coluna3, ';');

        int codigo = stoi(coluna1);
        int codigoDep = stoi(coluna3);
        auto it = mapa.find(codigoDep);

        if(funcionarios.find(codigo) == funcionarios.end()){
            Funcionario funcionario(codigo, coluna2, &(it->second));
            funcionarios.insert(std::make_pair(codigo, funcionario));
        }
    }

    for(const pair<int, Funcionario> &p : funcionarios)
            std::cout << p.second.getNome() << endl;

    return 0;
}
