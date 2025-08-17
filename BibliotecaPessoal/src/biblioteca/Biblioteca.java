package biblioteca;

import java.util.ArrayList;
import java.util.Map;

public class Biblioteca {

    ArrayList<Livro> Livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        this.Livros.add(livro);
    }
}
