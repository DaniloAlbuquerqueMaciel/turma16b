import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario;
        
        System.out.println("Digite o salário do funcionário:");
        salario = entrada.nextDouble();

        System.out.println("O novo salário do funcionário com aumento de 25% é: " + (salario * 1.25));

        entrada.close();
    }
}
