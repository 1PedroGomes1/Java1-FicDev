
package capitulo.pkg03;


public class Externa {
    private final int valor = 10;
    
    public class Interna {
        public void imprimeValor() { 
            System.out.println("O valor de classe interna é: " + valor);
        }
    }
    
   public static void main(String[] args) {
       Externa externa = new Externa();
       Externa.Interna interna = externa.new Interna();
       interna.imprimeValor();
   }
}