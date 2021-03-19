import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        //Variaveis
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, porcentagemDistribuidor, impostos, custoConsumidor;

        //Entrada
        System.out.println("Digite o custo de fábrica do veículo:");
        custoFabrica = entrada.nextDouble();

        //Processamento
        porcentagemDistribuidor = 0.28 * custoFabrica;
        impostos = 0.45 * custoFabrica;
        custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;

        //Saida
        System.out.println("O valor do veículo para o consumidor é: " + (custoConsumidor));
        System.out.println("O valor dos impostos sobre o veículo é: " + (impostos));

        entrada.close();
    }
}