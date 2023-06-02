// Pacote principal (com.mycompany)
package minhaEmpresa;

// Importar classes e pacotes necessários
import empregados.Empregado;

// Classe principal (Main)
public class Main {
    public static void main(String[] args) {
        // Código do programa principal
        Empregado empregado = new Empregado("Pedro", "Gomes", 5000);
        System.out.println(empregado.getFullName());
        System.out.println("Salário: " + empregado.getSalary());
    }
}