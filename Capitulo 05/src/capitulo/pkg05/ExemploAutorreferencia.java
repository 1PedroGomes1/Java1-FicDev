public class ExemploAutorreferencia {
    private int numero;
    
    public ExemploAutorreferencia(int numero) {
        this.numero = numero;
    }
    
    public void exibirNumero() {
        System.out.println(this.numero);
    }
    
    public static void main(String[] args) {
        ExemploAutorreferencia exemplo = new ExemploAutorreferencia(10);
        exemplo.exibirNumero();  // Saída: 10
    }
}
