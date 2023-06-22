// Classe Transporte (superclasse)
class Transporte {
    private String tipo;
    private int capacidade;

    public Transporte(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void transportarCarga(int peso) {
        System.out.println("Transportando carga de " + peso + " kg.");
    }

    public void transportarPessoas(int quantidade) {
        System.out.println("Transportando " + quantidade + " pessoas.");
    }
}

// Classe Automovel (subclasse de Transporte)
class Automovel extends Transporte {
    private String modelo;
    private int velocidadeMaxima;

    public Automovel(String tipo, int capacidade, String modelo, int velocidadeMaxima) {
        super(tipo, capacidade);
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void acelerar() {
        System.out.println("Acelerando o automóvel.");
    }

    public void frear() {
        System.out.println("Freando o automóvel.");
    }
}

// Classe Carroça (subclasse de Transporte)
class Carroça extends Transporte {
    public Carroça(int capacidade) {
        super("Carroça", capacidade);
    }

    public void transportarCarga(int peso) {
        System.out.println("Transportando carga de " + peso + " kg na carroça.");
    }

    public void transportarPessoas(int quantidade) {
        System.out.println("Transportando " + quantidade + " pessoas na carroça.");
    }
}

// Classe Carro (subclasse de Automovel)
class Carro extends Automovel {
    public Carro(String modelo, int velocidadeMaxima) {
        super("Carro", 5, modelo, velocidadeMaxima);
    }
}

// Classe Caminhão (subclasse de Automovel)
class Caminhão extends Automovel {
    private int capacidadeCarga;

    public Caminhão(String modelo, int velocidadeMaxima, int capacidadeCarga) {
        super("Caminhão", 2, modelo, velocidadeMaxima);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void transportarCarga(int peso) {
        if (peso <= capacidadeCarga) {
            System.out.println("Transportando carga de " + peso + " kg no caminhão.");
        } else {
            System.out.println("Carga excede a capacidade do caminhão!");
        }
    }
}

// Classe Moto (subclasse de Automovel)
class Moto extends Automovel {
    public Moto(String modelo, int velocidadeMaxima) {
        super("Moto", 2, modelo, velocidadeMaxima);
    }

    public void empinar() {
        System.out.println("Empinando a moto!");
    }
}

// Classe Triciclo (subclasse de Transporte)
class Triciclo extends Transporte {
    public Triciclo() {
        super("Triciclo", 1);
    }

    public void transportarPessoas(int quantidade) {
        if (quantidade <= getCapacidade()) {
            System.out.println("Transportando " + quantidade + " pessoa(s) no triciclo.");
        } else {
            System.out.println("Capacidade excedida!");
        }
    }
}

// Classe Bicicleta (subclasse de Transporte)
class Bicicleta extends Transporte {
    public Bicicleta() {
        super("Bicicleta", 1);
    }

    public void transportarPessoas(int quantidade) {
        if (quantidade <= getCapacidade()) {
            System.out.println("Transportando " + quantidade + " pessoa(s) na bicicleta.");
        } else {
            System.out.println("Capacidade excedida!");
        }
    }
}

// Classe Charrete (subclasse de Transporte)
class Charrete extends Transporte {
    public Charrete() {
        super("Charrete", 2);
    }

    public void transportarCarga(int peso) {
        System.out.println("Transportando carga de " + peso + " kg na charrete.");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Uno", 160);
        carro.acelerar();
        carro.frear();
        carro.transportarPessoas(4);

        Caminhão caminhão = new Caminhão("Volvo FH", 100, 5000);
        caminhão.transportarCarga(3000);
        caminhão.transportarCarga(6000);

        Moto moto = new Moto("Honda CB500", 180);
        moto.acelerar();
        moto.empinar();

        Triciclo triciclo = new Triciclo();
        triciclo.transportarPessoas(1);
        triciclo.transportarPessoas(2);

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.transportarPessoas(1);
        bicicleta.transportarPessoas(2);

        Charrete charrete = new Charrete();
        charrete.transportarCarga(500);
    }
}
