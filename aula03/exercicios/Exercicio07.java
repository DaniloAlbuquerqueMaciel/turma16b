package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota, somaNota, mediaTurma, somaMedia, mediaGeral;
        int TURMAS = 5;
        int ALUNOS = 20;

        somaMedia = 0;

        for (int i = 1; i <= TURMAS; i++) {
            somaNota = 0;
            for (int j = 1; j <= ALUNOS; j++) {
                System.out.print("Digite a média do aluno n° " + j + " da turma n° " + i + ":");
                nota = entrada.nextDouble();
                somaNota = somaNota + nota;
            }
            mediaTurma = somaNota / ALUNOS;
            somaMedia = somaMedia + mediaTurma;
            System.out.println("A média da turma nº" + i + " é: " + mediaTurma);
        }

        mediaGeral = somaMedia / TURMAS;
        System.out.println("A média geral das turmas é: " + mediaGeral);

        entrada.close();
    }
}