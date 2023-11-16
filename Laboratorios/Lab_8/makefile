main: main.o Pessoa.o Livro.o Emprestimo.o
	g++ -std=c++17 -o main  main.o Pessoa.o Livro.o Emprestimo.o

main.o: main.cpp Pessoa.h Livro.h Emprestimo.h
	g++ -std=c++17 -c -o main.o main.cpp

Pessoa.o: Pessoa.cpp Pessoa.h
	g++ -std=c++17 -c -o Pessoa.o Pessoa.cpp

Livro.o: Livro.cpp Livro.h Pessoa.h
	g++ -std=c++17 -c -o Livro.o Livro.cpp

Emprestimo.o: Emprestimo.cpp Emprestimo.h Livro.h Pessoa.h
	g++ -std=c++17 -c -o Emprestimo.o Emprestimo.cpp

clean:
	rm *.o main