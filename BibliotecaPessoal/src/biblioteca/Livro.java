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
        if (anoPublicacao <= date.getYear()){
            this.anoPublicacao = anoPublicacao;
        } else {
            throw new IllegalArgumentException("O ano tem que ser menor ou igual do que o ano atual.");
        }

    }

    public void setGenero(String genero) {
        if (genero != null && genero.equalsIgnoreCase(genero)){
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("O campo gênero é obrigatório");
        }
    }
}
