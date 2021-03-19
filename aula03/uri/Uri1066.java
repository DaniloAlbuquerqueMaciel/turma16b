package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, positivo, negativo, par, impar;

        positivo = 0;
        negativo = 0;
        par = 0;
        impar = 0;

        for (int i = 1; i <= 5; i++) {
           num = entrada.nextInt();
           if (num > 0) {
                positivo++;
           }
           if (num < 0) {
                negativo++;
           }
           if ((num % 2) == 0) {
               par++;
           } else {
               impar++;
           }
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        entrada.close();
    }
}