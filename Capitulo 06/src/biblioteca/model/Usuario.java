
package biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int qtdLivrosEmprestados;
    private List<Livro> livrosEmprestados = new ArrayList<>();
    
    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone  = telefone;
        this.qtdLivrosEmprestados = 0;
    }

    public int getQtdLivrosEmprestados() {
        return qtdLivrosEmprestados;
    }
    
    public boolean getPossuiVaga() {
        return qtdLivrosEmprestados < 3;
    }
    
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void adicionarLivro(Livro livros) {
        livrosEmprestados.add(livros);
        qtdLivrosEmprestados++;
    }
    
    public void removerLivros(Livro livro) {
        livrosEmprestados.remove(livros);
        qtdLivrosEmprestados--;
    }
}
