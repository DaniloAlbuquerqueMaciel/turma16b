package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Digite um valor positivo:");
            valor = in.nextInt();
        } while (valor <= 0);

        System.out.println("OK");

        in.close();
    }
}
