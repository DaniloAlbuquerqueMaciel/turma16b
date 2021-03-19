package exemplos.exemplo03;

public class AppPessoa {

    public static void main(String[] args) {
        //Instancia Objetos
        Pessoa p = new Pessoa("Emerson");
        Pessoa p2 = new Pessoa("Amanda");

        //Executa Métodos
        p.apresentar();
        p2.apresentar();

    }
}