package gerenciamento;

public class Curso {

    public String nome;
    private String cod_curso;

    Curso (){
        this.nome = nome;
        this.cod_curso = cod_curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(String cod_curso) {
        this.cod_curso = cod_curso;
    }
}
