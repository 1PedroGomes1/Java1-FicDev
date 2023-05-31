

import java.util.Scanner;

public class DobroDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado = numero * 2;

        System.out.println("O dobro do número " + numero + " é: " + resultado);
        scanner.close();
    }
}
