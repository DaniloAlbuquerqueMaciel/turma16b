package exercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o comprimento do lado a:");
        a = teclado.nextDouble();

        System.out.println("Digite o comprimento do lado b:");
        b = teclado.nextDouble();

        System.out.println("Digite o comprimento do lado c:");
        c = teclado.nextDouble();

        
        if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
            System.out.println("Eles não formam um triângulo!");
        } else {
            if ((a == b) && (a == c) && (b ==c)) {
                System.out.println("Eles formam um triângulo equilátero!");
            } else {
                if ((a == b) || (a == c) || (b ==c)) {
                    System.out.println("Eles formam um triângulo isósceles!");
                } else {
                    System.out.println("Eles formam um triângulo escaleno!");
                }
            }
        }

        teclado.close();
        
    }
}
