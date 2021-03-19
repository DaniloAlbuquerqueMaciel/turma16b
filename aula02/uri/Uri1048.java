package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario, reajuste;
        int percentual;

        salario = teclado.nextDouble();

        if (salario <= 400.00) {
            novoSalario = salario * 1.15;
            reajuste = salario * 0.15;
            percentual = 15;
        } else {
            if (salario <= 800.00) {
                novoSalario = salario * 1.12;
                reajuste = salario * 0.12;
                percentual = 12;
            } else {
                if (salario <= 1200.00) {
                    novoSalario = salario * 1.10;
                    reajuste = salario * 0.10;
                    percentual = 10;
                } else {
                    if (salario <= 2000.00) {
                        novoSalario = salario * 1.07;
                        reajuste = salario * 0.07;
                        percentual = 7;
                    } else {
                        novoSalario = salario * 1.04;
                        reajuste = salario * 0.04;
                        percentual = 4;
                    }
                }
            }
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        teclado.close();

    }
}