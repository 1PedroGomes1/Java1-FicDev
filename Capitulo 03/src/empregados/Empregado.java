// Pacote com.mycompany.employees
package empregados;

// Classe Employee
public class Empregado {
    private String firstName;
    private String lastName;
    private double salary;

    // Construtor da classe Employee
    public Empregado(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Métodos da classe Employee
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }
}