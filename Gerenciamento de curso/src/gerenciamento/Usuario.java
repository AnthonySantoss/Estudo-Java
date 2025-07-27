package gerenciamento;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario (String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Verificando se campo nome está vazio.
        if (nome != null){
            this.nome = nome;
        } else {
            System.out.println("É obrigatorio preencher campo nome");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //Criado para verificação do indice "@"
        int emailValido = email.indexOf('@');
        //Verificar se campo está vazio e validando o email.
        if (email != null && emailValido > 0) {
            this.email = email;
        } else {
            System.out.println("Email inválido ou campo vázio");
        }
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) {
        //Verificando se senha está vazia.
        if (senha != null){
            this.senha = senha;
        } else {
            System.out.println("Preencher campo correspondente a senha.");
        }

    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
