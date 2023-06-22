import java.util.List;
import java.util.Scanner;
import biblioteca.model.Livro;
import biblioteca.model.Usuario;
import biblioteca.service.BibliotecaService;

public class App {
    
    private static BibliotecaService bibliotecaService = new BibliotecaService();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao = -1;
    
        while (opcao != 0) {
            System.out.println("\n\nBiblioteca\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar devolução");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Listar usuários");
            System.out.println("7 - Buscar livro");
            System.out.println("8 - Buscar usuário");
            System.out.println("0 - Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    realizarEmprestimo();
                    break;
                case 4:
                    realizarDevolucao();
                    break;
                case 5:
                    listarLivros();
                    break;
            }
        }
    }
    
    private static void cadastrarLivro() {
        System.out.println("\nCadastro de livro\n");
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        System autor = scanner.nextLine();
        Livro livro = new Livro(titulo, autor);
        bibliotecaService.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso. ");
    }
    
    private static void cadastrarUsuario() {
        System.out.println("\nCadastro de Usuário\n");
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
    }
}
