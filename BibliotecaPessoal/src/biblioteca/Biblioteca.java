package biblioteca;

import java.util.ArrayList;

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

    public void buscarLivroTitulo (String livroTitulo){
        for (Livro livro : Livros){
            if (livro.getTitulo().equals(livroTitulo)){
                System.out.println("Livro encontrado: " + livroTitulo);
            } else {
                System.out.println("O livro não está disponível");
            }
        }
    }


    public void buscarLivroAutor (String livroAutor) {
        for (Livro livro : Livros) {
            if (livro.getAutor().equals(livroAutor)){
                System.out.println("Livro encontrado: " + livroAutor);
            } else {
                System.out.println("O livro não está disponível");
            }
        }
    }

}
