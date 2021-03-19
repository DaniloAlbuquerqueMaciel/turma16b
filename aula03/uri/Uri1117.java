package uri;
import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota, media;
        int validas;

        validas = 0;
        media = 0;

        while (validas < 2) {
            nota = entrada.nextDouble();
            if ((nota >= 0) && (nota <= 10)) {
                media = media + nota;
                validas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        media = media / 2;

        System.out.printf("media = %.2f\n", media);

        entrada.close();
    
    }
}