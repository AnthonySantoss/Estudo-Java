package gerenciamento;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private String cod_curso;

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();


    public Curso (String nome, String cod_curso){
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

    void cadastrarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void listaAlunos() {
        for (Aluno aluno: listaAlunos){
            System.out.println(aluno);
        }
    }
}
