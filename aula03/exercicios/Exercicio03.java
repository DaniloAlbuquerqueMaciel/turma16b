package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont, limite;

        cont = 1;
        System.out.println("Digite o numero limite para sequencia:");
        num = entrada.nextInt();
        limite = num / 2;
        while (cont <= limite) {
            System.out.printf("%d, ", cont);
            cont *= 2;
        }
        System.out.printf("%d", cont);
        entrada.close();
    }
}