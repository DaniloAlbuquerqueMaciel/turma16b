package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = entrada.nextInt();

        System.out.println("O menor numero é " + (menor(num1,num2,num3)));

        entrada.close();

    }

    static int menor (int num1, int num2, int num3){
        if ((num1 <= num2) && (num1 <= num3)) {
            return num1;
        }
        if ((num2 <= num1) && (num2 <= num3)) {
            return num2;
        } 
        return num3;
    }
}