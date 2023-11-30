#include <iostream> // cout
#include <fstream>  // ifstream
#include <sstream>  // istringstream
#include <map>      // map :-)

#include "departamento.h"
#include "empresa.h"

using namespace std;

void leDepartamentos(Empresa &e)
{
    ifstream inputStream("departamentos.csv");
    string linha;
    getline(inputStream,linha); // cabeçalho
    while (getline(inputStream,linha))
    {
        istringstream linhaStream(linha);
        string codigoDepStr;
        getline(linhaStream,codigoDepStr,';');
        int codigoDep = stoi(codigoDepStr);
        string nomeDepartamento;
        getline(linhaStream,nomeDepartamento,';');
        e.createDepartamento(codigoDep,nomeDepartamento);
    }
    inputStream.close();
}

void leFuncionarios(Empresa &e)
{
    ifstream inputStream("funcionarios.csv");
    string linha;
    getline(inputStream,linha); // cabeçalho
    while (getline(inputStream,linha))
    {
        istringstream linhaStream(linha);
        string codigoFunStr;
        getline(linhaStream,codigoFunStr,';');
        int codigoFun = stoi(codigoFunStr);
        string nomeFuncionario;
        getline(linhaStream,nomeFuncionario,';');
        string codigoDepStr;
        getline(linhaStream,codigoDepStr,';');
        int codigoDep = stoi(codigoDepStr);
        // inv: tenho dados para criar funcionario
        e.findDepartamento(codigoDep).createFuncionario(codigoFun,nomeFuncionario);
    }
    inputStream.close();
}


int main()
{
    Empresa e;
    leDepartamentos(e);
    leFuncionarios(e);
    // inv: departamentos.csv e funcionarios.csv lidos
    for ( auto &[codigoDep, departamento] : e.getDepartamentos() )
    {
        cout << departamento.getNome() << ", código [" << codigoDep << "], funcionários:" << endl;
        for ( auto &[codigoFun, funcionario] : departamento.getFuncionarios() )
        {
            cout << "\t" << funcionario.getNome() << ", código [" << codigoFun << "]";
            // para demonstrar a navegabilidade Funcionario->Departamento
            cout << ", departamento " << funcionario.getDepartamento()->getNome() << endl;
        }
    }
}
