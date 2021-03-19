package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao;

        System.out.println("Digite o valor do salario bruto do funcionario:");
        salarioBruto = teclado.nextDouble();

        System.out.println("Digite o valor da prestação da linha de crédito:");
        valorPrestacao = teclado.nextDouble();
        
        if (valorPrestacao > (0.3 * salarioBruto)) {
            System.out.println("O emprestimo não pode ser concedido!");
        } else {
            System.out.println("O emprestimo pode ser concedido!");
        }

        teclado.close();

    }
}
