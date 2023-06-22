
package Exemplo02;

public class Gato extends Animal2 {
    int corPelo;
    
    public void falar(int par, int par1){ 
        super(4, 30);
        miar();
    }
    
    private void miar(){
        super(4, 30);
        System.out.println("Miau!");
    }
}