package gerenciamento;

public class Instrutor extends Usuario{

    public String materia;
    public String nivel_academico;

    Instrutor (int id_user, String nome, String email, String senha, String materia, String nivel_academico){
        super(id_user, nome, email, senha);
        this.materia = materia;
        this.nivel_academico = nivel_academico;
    }

    public String getMateria() {
        return materia;
    }

    public String getNivel_academico() {
        return nivel_academico;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNivel_academico(String nivel_academico) {
        this.nivel_academico = nivel_academico;
    }
}
