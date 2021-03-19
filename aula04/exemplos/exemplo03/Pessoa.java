package exemplos.exemplo03;

public class Pessoa {
    
    //Atributos
    String nome;

    //Construtor
    Pessoa (String nome) {
        this.nome = nome;
    }

    //Métodos
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

}
