// Classe pai
class Animal {
    // Atributos
    String nome;
    String raca; // novo atributo

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Raça: " + raca);
    }
}

// Classe filha, que herda de Animal
class Cachorro extends Animal {
    // Construtor da classe filha
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    // Método específico da classe Cachorro
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    // Cachorro também anda
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe herdeira
class Passaro extends Animal {
    // Construtor da classe Passaro
    public Passaro(String nome, String raca) {
        super(nome, raca);
    }

    // Método específico da classe Passaro
    public void voar() {
        System.out.println(nome + " está voando!");
    }

    // Passaro também anda
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador");
        Passaro passaro = new Passaro("Luis", "Periquito");

        // Cachorro
        meuCachorro.exibirInfo();
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println();

        // Passaro
        passaro.exibirInfo();
        passaro.comer();
        passaro.voar();
        passaro.andar();
    }
}