package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto;
    private double segundo;

    public Relogio(int hora, int minuto, double segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if ((hora >= 0) && (hora <= 23)) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if ((minuto >= 0) && (minuto <= 59)) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(double segundo) {
        if ((segundo >= 0) && (segundo < 60)) {
            this.segundo = segundo;
        }
    }

    public void exibirRelogio() {
        System.out.println("Relógio:");
        // System.out.println(this.getHora() + "h " + this.getMinuto() + "min " + this.getSegundo() + "s ");
        System.out.printf("%02d:%02d:%02.0f\n", this.getHora(), this.getMinuto(), this.getSegundo());
    }
}