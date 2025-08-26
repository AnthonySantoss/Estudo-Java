import biblioteca.Biblioteca;
import biblioteca.Livro;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca minhaBiblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);

        minhaBiblioteca.carregarLivros();

        int opcao;

        do {
            System.out.println("-------------------");
            System.out.println("Biblioteca Pessoal");
            System.out.println("-------------------");
            System.out.println("Menu");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Buscar por Título");
            System.out.println("4 - Buscar por Autor");
            System.out.println("0 - Fechar Biblioteca");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("Cadastro de Livro");
                    System.out.println("------------------");

                try {
                    System.out.println("Título: ");
                    String titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Ano de Publicação: ");
                    int anoPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Gênero: ");
                    String genero = sc.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao, genero);

                    minhaBiblioteca.adicionarLivro(novoLivro);

                } catch (IllegalArgumentException e){
                    System.out.println("\n ERRO NO CADASTRO: " + e.getMessage() + ", Tente novamente!");
                }
                break;

                case 2:
                    System.out.println("Lista de livros");
                    System.out.println("----------------");

                    minhaBiblioteca.listaLivros();

                    break;

                case 3:
                    System.out.println("Buscar Livro por Título");
                    System.out.println("------------------------");
                    System.out.println("Digite o título que deseja buscar: ");
                    String titulo = sc.nextLine();

                    minhaBiblioteca.buscarLivroTitulo(titulo);

                    break;

                case 4:
                    System.out.println("Buscar Livro por Autor");
                    System.out.println("----------------------");
                    System.out.println("Digite o nome do autor que deseja buscar: ");
                    String autor = sc.nextLine();


                    minhaBiblioteca.buscarLivroAutor(autor);

                    break;

            }
        } while (opcao != 0);

        minhaBiblioteca.salvarLivros();

        sc.close();

    }
}