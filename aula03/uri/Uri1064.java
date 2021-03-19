package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, soma, media;
        int positivo;

        positivo = 0;
        soma = 0;

        for (int i = 1; i <= 6; i++) {
           num = entrada.nextDouble();
           if (num > 0) {
                positivo = positivo + 1;
                soma = soma + num;
           }
        }
        
        media = soma / positivo;

        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", media);

        entrada.close();
    }
}