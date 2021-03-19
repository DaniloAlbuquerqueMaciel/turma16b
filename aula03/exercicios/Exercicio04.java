package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont;

        cont = 0;
        num = 1;

        while (num != 0) {
            System.out.println("Digite um numero para somar (caso queira sair, digite 0):");
            num = entrada.nextInt();
            cont = cont + num;
        }
        
        System.out.println("A soma dos valores é: " + cont);
        entrada.close();
    }
}