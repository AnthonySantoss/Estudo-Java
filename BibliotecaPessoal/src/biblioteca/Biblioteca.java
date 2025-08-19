package biblioteca;

import java.util.ArrayList;
import java.util.Map;

public class Biblioteca {

    ArrayList<Livro> Livros = new ArrayList<>();

    public void adicionarLivro(String livro, String autor, int anoPublicacao, String genero){
        Livro novoLivro = new Livro(livro, autor, anoPublicacao, genero);
        this.Livros.add(novoLivro);
    }

    public void listaLivros() {
        int n = Livros.size();
        for (int i = 0; i<n; i++ ){
            System.out.println(Livros.get(i));
        }
    }

    public void buscarLivro (){

    }
}
