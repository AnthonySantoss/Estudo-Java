import biblioteca.Biblioteca;
import biblioteca.Livro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
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


        } while (opcao != 0);



    }
}