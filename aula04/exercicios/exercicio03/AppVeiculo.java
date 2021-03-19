package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        // Instancia
        Veiculo palio = new Veiculo("Palio", "Fiat", 15.0);
        Veiculo onix = new Veiculo("Onix", "Chevrolet", 13.0);

        // Executa
        palio.exibirDados();
        System.out.println("O consumo do Palio é " + (palio.consumo) + " km/l\n");

        onix.exibirDados();
        System.out.println("O consumo do Onix é " + (onix.consumo) + " km/l\n");
    }
}