package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String senha;
        final String SENHA_CORRETA = "R10p5";
        boolean senhaAceita;

        System.out.println("Digite a senha para ter acesso:");
        senha = teclado.nextLine();

        senhaAceita = senha.equals(SENHA_CORRETA);

        if (senhaAceita) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }

        teclado.close();
    }
}