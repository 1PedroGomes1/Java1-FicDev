
package capitulo.pkg03;


public class Pessoa {
    // atributos 
    private String nome;
    private int idade;
    
    
    // metodos
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    
    public int getIdade() {
        return idade;
    }
}


class TestePessoa {
    public static void main(String[] args) {
        // instanciação da classe Pessoa
        Pessoa p1 = new Pessoa();
        
        // atribuição de valores aos atributos
        p1.setNome("Pedro");
        p1.setIdade(20);
        
        // exibição dos valores atribuídos
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());  
    }
}

