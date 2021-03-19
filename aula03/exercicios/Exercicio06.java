package exercicios;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par, impar;
        double somaPar, mediaPar, percentImpar;
        
        par = 0;
        somaPar = 0;
        impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = entrada.nextInt();
            if ((num % 2) == 0) {
                par++;
                somaPar = somaPar + num;
            } else {
                impar++;
            }
        }

        mediaPar = somaPar/par;
        percentImpar = impar * 10;

        System.out.println("A média dos pares é: " + mediaPar);
        System.out.println("A percentagem de impares é: " + percentImpar + "%");
        entrada.close();
    }
}