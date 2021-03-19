package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        setTitulo(titulo);
        setAutor(autor);
        setTotalPaginas(totalPaginas);
        irParaPagina(0);
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        } else {
            System.out.println("Total de páginas inválido");
        }
    }

    public void irParaPagina(int pagina) {
        if ((pagina >= 0) && (pagina <= this.totalPaginas)) {
            this.paginaAtual = pagina;
        } else {
            System.out.println("Página fora dos limites");
        }
    }

    public void mostrarCapa() {
        irParaPagina(0);
        System.out.println("Ebook");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de paginas: " + getTotalPaginas());
    }

    public void avancarPagina() {
        irParaPagina(exibirPagina() + 1);
    }

    public void retrocederPagina() {
        irParaPagina(exibirPagina() - 1);
    }
}