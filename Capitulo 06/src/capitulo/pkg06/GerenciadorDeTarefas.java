import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private int prioridade;
    private boolean concluida;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Pendente";
        return "Tarefa: " + descricao + " | Prioridade: " + prioridade + " | Status: " + status;
    }
}

class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída: " + tarefa.getDescricao());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Gerenciador de Tarefas =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Exibir tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a prioridade da tarefa (1 - Baixa, 2 - Média, 3 - Alta): ");
                    int prioridade = scanner.nextInt();
                    Tarefa tarefa = new Tarefa(descricao, prioridade);
                    gerenciador.adicionarTarefa(tarefa);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indice = scanner.nextInt();
                    gerenciador.marcarTarefaComoConcluida(indice);
                    break;
                case 3:
                    gerenciador.exibirTarefas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
