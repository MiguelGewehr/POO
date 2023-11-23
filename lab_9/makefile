main: main.o Departamento.o Funcionario.o
	g++ -o main main.o Departamento.o Funcionario.o

main.o: main.cpp Departamento.h Funcionario.h
	g++ -c -o main.o main.cpp

Departamento.o: Departamento.cpp Departamento.h
	g++ -c -o Departamento.o Departamento.cpp

Funcionario.o: Funcionario.cpp Funcionario.h Departamento.h
	g++ -c -o Funcionario.o Funcionario.cpp
