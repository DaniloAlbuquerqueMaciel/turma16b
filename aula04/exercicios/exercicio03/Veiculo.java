package exercicios.exercicio03;

public class Veiculo {
    // Atributos
    String modelo, marca;
    double consumo;

    // Construtor
    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // Métodos
    void exibirDados() {
        System.out.println("Veiculo do modelo: " + this.modelo);
        System.out.println("Veiculo da marca: " + this.marca);
    }

    double valorConsumo() {
        return this.consumo;
    }
}
