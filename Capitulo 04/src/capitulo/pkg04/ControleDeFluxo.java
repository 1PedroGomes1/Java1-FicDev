package capitulo.pkg04;

public class ControleDeFluxo {
    public static void main(String[] args) {
        int age = 20;

        // Comando de seleção (if-else)
        if (age >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Comando de repetição (for)
        System.out.println("Contando até 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Comando de repetição (while)
        int i = 1;
        System.out.println("Contando até 5 (usando while):");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Comando de repetição (do-while)
        int j = 1;
        System.out.println("Contando até 5 (usando do-while):");
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}