
package capitulo.pkg07;

public class Cachorro extends Animal {
    int corPelo;
    public Cachorro(int p, int a) {
    // pata e altura são definidos em Animal e herdados aqui
    pata = p;
    altura = a;      
}   

public Cachorro(int p, int a, int corPelo) {
    // super usa o construtor da superclasse Animal
        super(p,a);
        this.corPelo = corPelo;
    }
}
