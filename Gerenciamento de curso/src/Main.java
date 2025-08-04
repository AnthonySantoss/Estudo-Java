import gerenciamento.Aluno;
import gerenciamento.Curso;
import gerenciamento.Instrutor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        String email;
        String senha;
        String materia;
        String nivelAcademico;

        System.out.println("-------------------");
        System.out.println("Plataforma de cursos");
        System.out.println("-------------------");



        int opcao;

        do {
            System.out.println("-------------------");
            System.out.println("Área de cadastro");
            System.out.println("Insira opção 1 para professor / Insira opção 2 para Aluno / Insira opção 0 para Sair");
            System.out.println("-------------------");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1){
                System.out.println("Cadastro de instrutor");
                System.out.println("-------------------");
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                System.out.print("e-mail: ");
                email = entrada.nextLine();
                System.out.print("senha: ");
                senha = entrada.nextLine();
                System.out.print("materia: ");
                materia = entrada.nextLine();
                System.out.print("Nível academico (Tecnico, Especialista, Mestrado, Doutorado): ");
                nivelAcademico = entrada.nextLine();

                //Criação de um novo instrutor
                Instrutor novoInstrutor = new Instrutor(nome, email, senha, materia, nivelAcademico);

                //Metodo para validar opção de titulo academico
                novoInstrutor.setNivel_academico(nivelAcademico);

                System.out.println("Instrutor " + novoInstrutor.getNome() + " cadastrado!");
            } else if (opcao == 2) {
                System.out.println("Cadastro de Aluno");
                System.out.println("-------------------");
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                System.out.print("e-mail: ");
                email = entrada.nextLine();
                System.out.print("senha: ");
                senha = entrada.nextLine();

                //Criação de um novo Aluno
                Aluno novoAluno = new Aluno(nome, email, senha);

                System.out.println("Aluno " + novoAluno.getNome() + " cadastrado!");
            }

        } while (opcao != 0);







    }
}