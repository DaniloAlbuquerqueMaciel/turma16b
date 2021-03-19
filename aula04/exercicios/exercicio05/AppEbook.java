package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("O Hobbit", "J. R. R. Tolkien", 336);

        ebook.mostrarCapa();

        System.out.println("Pagina Atual: " + ebook.exibirPagina());

        ebook.retrocederPagina();

        System.out.println("Pagina Atual: " + ebook.exibirPagina());

        ebook.irParaPagina(336);

        System.out.println("Pagina Atual: " + ebook.exibirPagina());

        ebook.avancarPagina();

        System.out.println("Pagina Atual: " + ebook.exibirPagina());

        ebook.retrocederPagina();

        System.out.println("Pagina Atual: " + ebook.exibirPagina());

    }
}