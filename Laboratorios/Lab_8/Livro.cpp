#include "Livro.h"

Livro::Livro(const string &titulo) : titulo(titulo){}

string Livro::getTitulo() const{
    return this->titulo;
}

std::list<Pessoa*> Livro::getAutores() const{
    return this->autores;
}

void Livro::addAutor(Pessoa &autor){
    this->autores.push_back(&autor);
}

void Livro::imprimeLivro(){
    cout << "Titulo: " + this->titulo<< endl;
}