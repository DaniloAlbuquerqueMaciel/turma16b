package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = teclado.nextDouble();
        
        System.out.println("Numeros em ordem não crescente:");

        if (num1 > num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }

        teclado.close();

    }

}