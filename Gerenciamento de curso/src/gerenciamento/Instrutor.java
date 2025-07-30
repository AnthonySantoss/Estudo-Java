package gerenciamento;

import java.util.ArrayList;

public class Instrutor extends Usuario{

    public String materia;
    public String nivel_academico;

    public Instrutor(String nome, String email, String senha, String materia, String nivelAcademico){
        super(nome, email, senha);
        this.materia = materia;
        this.nivel_academico = nivelAcademico;
    }

    public String getMateria() {
        return materia;
    }

    //Verificando se o campo materia está vazia
    public void setMateria(String materia) {
        if (materia != null){
            this.materia = materia;
        } else {
            System.out.println("Digite o nome da matéria");
        }

    }

    public String getNivel_academico() {
        return nivel_academico;
    }

    //Verificando o tipo de nível academico.
    public void setNivel_academico(String nivel_academico) {
        switch (nivel_academico){
            case "Tecnico":
                this.nivel_academico = nivel_academico;
            break;
            case "Especialista":
                this.nivel_academico = nivel_academico;
            break;
            case "Mestrado":
                this.nivel_academico = nivel_academico;
            break;
            case "Doutorado":
                this.nivel_academico = nivel_academico;
            break;
            default:
                System.out.println("Título academico inválido.");
        };
    }


    ArrayList<String> adicionarCursos = new ArrayList<>();

    //Metodo para instrutores criar curso.
    public void criarCurso(String curso){
        if (curso != null){
            adicionarCursos.add(curso);
        } else {
            System.out.println("Digite o nome do curso");
        }
    }
}
