package Model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Emprestimo> emprestimos;

    public Biblioteca(List<Livro> livros, List<Autor> autores, List<Emprestimo> emprestimos) {
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public List<Livro> getListaLivros() {
        return livros;
    }

    public List<Autor> getListaAutores() {
        return autores;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return emprestimos;
    }

    public void setListaLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setListaAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setListaEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    
    
    
}
