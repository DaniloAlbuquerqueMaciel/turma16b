package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro:");
        numero = teclado.nextInt();

        if (numero > 20) {
            System.out.println("Metade do seu numero é " + ((double) numero / 2));
        }

        teclado.close();

    }

}