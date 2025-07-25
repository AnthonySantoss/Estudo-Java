package gerenciamento;

public class Usuario {

    private int id_user;
    private String nome;
    private String email;
    private String senha;

    public Usuario (int id_user, String nome, String email, String senha){
        this.id_user = id_user;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
