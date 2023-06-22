public class ExemploPassagemParametros {
    public void alterarNumero(int numero) {
        numero = 10;
    }
    
    public static void main(String[] args) {
        int numero = 5;
        ExemploPassagemParametros exemplo = new ExemploPassagemParametros();
        exemplo.alterarNumero(numero);
        System.out.println(numero);  // Saída: 5
    }
}
