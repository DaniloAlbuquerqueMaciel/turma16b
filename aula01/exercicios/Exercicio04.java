import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, consumoQuilowatt, valorQuilowatt , custoResidencia, descontoResidencia;
        
        System.out.println("Digite o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite o consumo de energia da residência em quilowatts:");
        consumoQuilowatt = entrada.nextDouble();

        valorQuilowatt = salarioMinimo / 500;
        System.out.println("O valor do quilowatt em reais é: " + (valorQuilowatt));

        custoResidencia = valorQuilowatt * consumoQuilowatt;
        System.out.println("O valor a ser pago pela energia da residência é: " + (custoResidencia));

        descontoResidencia = custoResidencia * 0.85;
        System.out.println("O valor a ser pago pela energia da residência com desconto de 15% é: " + (descontoResidencia));

        entrada.close();
    }
}