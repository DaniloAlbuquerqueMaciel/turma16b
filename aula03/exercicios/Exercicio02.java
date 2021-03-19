package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont;

        cont = 0;
        System.out.println("Digite um número:");
        num = entrada.nextInt();

        System.out.println("Tabuada:");

        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont++;
        }

        entrada.close();

    }
}