import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        
        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();

        System.out.println("A média do aluno é: " + ((nota1 + nota2)/2));

        entrada.close();
    }
}