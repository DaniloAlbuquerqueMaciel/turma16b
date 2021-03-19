package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        num = entrada.nextInt();

        if (ePar(num)) {
            System.out.println("Esse numero é par!");
        } else {
            System.out.println("Esse numero não é par!");
        }
        
        entrada.close();
    }

    static boolean ePar(int num) {
        return ((num % 2) == 0);
    }
}