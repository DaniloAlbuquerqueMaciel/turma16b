package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        nota2 = teclado.nextDouble();

        media = (0.4 * nota1) + (0.6 * nota2);

        System.out.println("A média do aluno é " + media);

        if (media >= 6.0) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }

        teclado.close();

    }
}
