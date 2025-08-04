package gerenciamento;

import java.util.Random;

public class Matricula {

    private int matricula;
    private String status;

    Matricula () {
        this.matricula = 0;
        this.status = "Pendente";
    }

    //Metodo para Gerar a matricula
    void criarMatricular () {
        Random geradorMatricula = new Random();
        //Gerando matricula entre 0 até 99999.
        this.matricula = geradorMatricula.nextInt(100000);
        //Mudando o Status para Ativo.
        this.status = "Ativa";
    }
}
