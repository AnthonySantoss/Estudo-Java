package biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && titulo.trim().isEmpty()){
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O campo título é obrigatório");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && autor.trim().isEmpty()){
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("O campo autor é obrigatório");
        }

    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
