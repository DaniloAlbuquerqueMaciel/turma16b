package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salario, imposto;

        salario = teclado.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario <= 3000.00) {
                imposto = (salario - 2000) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            } else {
                if (salario <= 4500.00) {
                    imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
                    System.out.printf("R$ %.2f\n", imposto);
                } else {
                    imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
                    System.out.printf("R$ %.2f\n", imposto);
                }
            }
        }

        teclado.close();

    }
}
