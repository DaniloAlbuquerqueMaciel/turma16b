package uri;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int codPeca1, codPeca2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, custo;

        codPeca1 = teclado.nextInt();
        numPeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();

        codPeca2 = teclado.nextInt();
        numPeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();

        custo = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", custo);

        teclado.close();

    }
}
