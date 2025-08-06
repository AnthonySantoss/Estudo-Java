package gerenciamento;

import java.util.regex.Pattern;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario (String nome, String email, String senha){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Verificando se campo nome está vazio.
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O campo nome é obrigatório.");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        if (email != null && Pattern.matches(emailRegex, email)) {
            this.email = email;
        } else {
            // A exceção que será capturada pela classe Main.
            throw new IllegalArgumentException("Formato de e-mail inválido.");
        }
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) {
        if (senha != null && !senha.isEmpty()) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("O campo senha é obrigatório.");
        }
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
