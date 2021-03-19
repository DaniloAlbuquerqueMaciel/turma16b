import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Variaveis
        Scanner entrada = new Scanner(System.in);
        double km, milha, jarda, pe, polegada;

        //Entrada
        System.out.println("Digite a distância em km:");
        km = entrada.nextDouble();

        //Processamento
        milha = 0.62137 * km;
        jarda = 1760 * milha;
        pe = 3 * jarda;
        polegada = 12 * pe;

        //Saida
        System.out.println("O valor da distância em milhas é: " + (milha));
        System.out.println("O valor da distância em jardas é: " + (jarda));
        System.out.println("O valor da distância em pés é: " + (pe));
        System.out.printf("O valor da distância em polegadas é: %.2f\n", polegada);

        entrada.close();
    }
}