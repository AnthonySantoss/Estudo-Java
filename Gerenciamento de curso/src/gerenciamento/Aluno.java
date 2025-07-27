package gerenciamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Usuario{

    public Aluno (String nome, String email,  String senha){
        super(nome, email, senha);
    }

    //Método Inscrever em curso
    public void inscricaoAluno (Curso curso) {
        if (curso != null){
            curso.cadastrarAluno(this);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
