package gerenciamento;

import java.util.ArrayList;

public class Sistema {

    ArrayList<Curso> listarCurso = new ArrayList<>();
    ArrayList<Aluno> listarAluno = new ArrayList<>();



    //Metodo listar Cursos
    public void listaCursos () {
        for (Curso cursos : listarCurso){
            System.out.println(cursos);
        }
    }

    //Metodo listar Alunos
    public void listarAluno (){
        for (Aluno alunos : listarAluno){
            System.out.println(alunos);
        }
    }
}
