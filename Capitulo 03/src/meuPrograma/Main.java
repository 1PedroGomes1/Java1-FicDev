// Definindo a classe Main
package meuPrograma;

import geometria.Retangulo;

public class Main {
    
    // Método principal do programa
    public static void main(String[] args) {
        
      // Criando um objeto da classe Retangulo com base 5 e altura 10
      Retangulo retangulo = new Retangulo(5, 10);
      
      // Calculando a área e o perímetro do retângulo
      double area = retangulo.calcularArea();
      double perimetro = retangulo.calcularPerimetro();
      
      // Imprimindo os resultados na tela
      System.out.println("Área do retângulo: " + area);
      System.out.println("Perímetro do retângulo: " + perimetro);
      
    }
}
