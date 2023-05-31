public class Animal {
    private final String nome;
    private final int idade;

    public Animal (String nome , int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println (nome + " esta comendo.");
    }

    public void dormir () {
        System.out.println (nome + " esta dormindo.");
    }


     public String getNome() {
         return nome ;
 }
 
     public int getIdade() { 
         return idade;
     }
}


     class Principal {
         public static void main(String[] args) {
             Animal cachorro = new Animal("Toto", 5);
             cachorro.comer();
             cachorro.dormir();
             System.out.println("Nome: " + cachorro.getNome());
             System.out.println("Idade: " + cachorro.getIdade());
         }
     }