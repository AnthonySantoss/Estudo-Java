package biblioteca;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    private LocalDate date = LocalDate.now();

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
        setGenero(genero);
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
        if (titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("O campo título é obrigatório");
        } else {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()){
            throw new IllegalArgumentException("O campo autor é obrigatório");
        } else {
            this.autor = autor;
        }

    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao <= date.getYear()){
            this.anoPublicacao = anoPublicacao;
        } else {
            throw new IllegalArgumentException("O ano tem que ser menor ou igual do que o ano atual.");
        }

    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()){
            throw new IllegalArgumentException("O campo gênero é obrigatório");
        } else {
            this.genero = genero;
        }
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() +
                ", Autor:" + getAutor() +
                ", Ano de Publicação: " + getAnoPublicacao() +
                ", Gênero: " + getGenero();
    }

    public String formatarCsv(){
        return getTitulo() + ", " + getAutor() + ", " + getAnoPublicacao() + ", " + getGenero();
    }
}
