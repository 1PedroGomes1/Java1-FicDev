package capitulo.pkg04;

import javax.swing.JOptionPane;

public class MenuBebidas {
    public static void main(String[] args ) {
        int opcao;
        double preco = 0.0;
        
        String menu = "Menu de Bebidas:\n" +
                      "1. Refrigerante\n" +
                      "2. Suco\n" +
                      "3. Água\n" +
                      "4. Chá\n";
opcao = Integer.parseInt(JOptionPane.showInputDialog(menu +
        "Digite a opção desejada: "));

                        switch (opcao) {
                            case 1:
                                preco = 4.50;
                                break;
                            case 2:
                                preco = 5.00;
                                break;
                            case 3:
                                preco = 2.00;
                                break;
                            case 4:
                                preco = 3.00;
                                break;
                            default:
                  
 JOptionPane.showMessageDialog(null, "Opção Inválida.");
                                 
                                 break;
                        }
                           
                        if (preco != 0.0) {
                            JOptionPane.showMessageDialog(null,
String.format("O preço da bebida escolhida é R$%.2f", preco));
      
        }
    } 
}