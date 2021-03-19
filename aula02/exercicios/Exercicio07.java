package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Digite o seu salario:");
        salario = teclado.nextDouble();

        if (salario <= 600.00) {
            System.out.println("Você está isento do INSS!");
        } else {
            if (salario <= 1200.00) {
                System.out.println("Você pagará 20% ao INSS!");
            } else {
                if (salario <= 2000.00) {
                    System.out.println("Você pagará 25% ao INSS!");
                } else {
                    System.out.println("Você pagará 30% ao INSS!");
                }
            }
        }

        teclado.close();
        
    }
}
