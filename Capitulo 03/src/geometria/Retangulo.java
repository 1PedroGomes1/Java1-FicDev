
// Definindo o pacote do programa
package geometria;

// Definindo a classe Retangulo
public class Retangulo {
    
    // Propriedades do retângulo
    private final double base;
    private final double altura;
    
    // Construtor da Classe
    public Retangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
    }
 
    // Método para calcular a área do retângulo
    public double calcularArea() {
      return this.base * this.altura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}