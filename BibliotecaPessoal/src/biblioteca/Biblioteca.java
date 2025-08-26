package biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<Livro> Livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        this.Livros.add(livro);
    }

    public void listaLivros() {
        int n = Livros.size();
        for (int i = 0; i<n; i++ ){
            System.out.println(Livros.get(i));
        }
    }

    public void buscarLivroTitulo (String livroTitulo){
        boolean livroEncontrado = false;
        for (Livro livro : Livros){
            if (livro.getTitulo().equals(livroTitulo)){
                System.out.println("Livro encontrado: " + livroTitulo);
                livroEncontrado = true;
            }
        }
        if (!livroEncontrado){
            System.out.println("O livro " + livroTitulo + " não está disponível em sua biblioteca.");
        }
    }


    public void buscarLivroAutor (String livroAutor) {
        boolean autorEncontrado = false;
        for (Livro livro : Livros) {
            if (livro.getAutor().equalsIgnoreCase(livroAutor)){
                System.out.println("Livro encontrado: " + livro.getTitulo());
                autorEncontrado = true;
            }
        }
        if (!autorEncontrado){
            System.out.println("O Autor " + livroAutor + "não foi encontrado em sua biblioteca.");
        }
    }

    public void salvarLivros () {
        try (PrintWriter saida = new PrintWriter(new FileWriter("Biblioteca.csv"))) {
            for (Livro livro : Livros){
                saida.println(livro.formatarCsv());
            }
            System.out.println("Dados salvos com sucesso em Biblioteca.csv");
        } catch (IOException e){
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public void carregarLivros() {
        File arquivo = new File("Biblioteca.csv");
        try (Scanner leitor = new Scanner(arquivo)){
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] partes = linha.split(",");

                //Pegando partes de array e limpando os espaços em branco.
                String titulo = partes[0].trim();
                String autor = partes[1].trim();
                String genero = partes[3].trim();

                //Transformando o array do ano em inteiro.
                int anoPublicacao = Integer.parseInt(partes[2].trim());

                Livro livroDoArquivo = new Livro(titulo, autor, anoPublicacao, genero);

                this.adicionarLivro(livroDoArquivo);
            }

            System.out.println("Biblioteca carregada com sucesso.");
        } catch (FileNotFoundException e){
            System.out.println("Arquivo de biblioteca não encontrado. ");
            System.out.println("Começando uma nova biblioteca.");
        }
    }

}
