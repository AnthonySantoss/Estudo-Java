import gerenciamento.Aluno;
import gerenciamento.Curso;
import gerenciamento.Instrutor;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Instrutor> instrutores = new ArrayList<>();

        System.out.println("-------------------");
        System.out.println("Plataforma de cursos");
        System.out.println("-------------------");

        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Cadastrar Instrutor");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Criar Curso (Ação do Instrutor)");
            System.out.println("4. Inscrever Aluno em Curso");
            System.out.println("5. Listar Cursos");
            System.out.println("6. Listar Alunos de um Curso");
            System.out.println("0. Sair");
            System.out.println("-------------------");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Instrutor ---");

                    try {
                        System.out.print("Nome: ");
                        String nomeInstrutor = entrada.nextLine();
                        System.out.print("E-mail: ");
                        String emailInstrutor = entrada.nextLine();
                        System.out.print("Senha: ");
                        String senhaInstrutor = entrada.nextLine();
                        System.out.print("Matéria: ");
                        String materia = entrada.nextLine();
                        System.out.print("Nível acadêmico (Tecnico, Especialista, Mestrado, Doutorado): ");
                        String nivelAcademico = entrada.nextLine();


                        Instrutor novoInstrutor = new Instrutor(nomeInstrutor, emailInstrutor, senhaInstrutor, materia, nivelAcademico);

                        instrutores.add(novoInstrutor);
                        System.out.println("Instrutor " + novoInstrutor.getNome() + " cadastrado com sucesso!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("\n!!! ERRO NO CADASTRO: " + e.getMessage() + " Tente novamente. !!!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Aluno ---");

                    try {
                        System.out.print("Nome: ");
                        String nomeAluno = entrada.nextLine();
                        System.out.print("E-mail: ");
                        String emailAluno = entrada.nextLine();
                        System.out.print("Senha: ");
                        String senhaAluno = entrada.nextLine();


                        Aluno novoAluno = new Aluno(nomeAluno, emailAluno, senhaAluno);

                        alunos.add(novoAluno);
                        System.out.println("Aluno " + novoAluno.getNome() + " cadastrado com sucesso!");

                    } catch (IllegalArgumentException e) {
                        // Captura o erro e informa ao usuário
                        System.out.println("\n!!! ERRO NO CADASTRO: " + e.getMessage() + " Tente novamente. !!!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Criação de Curso ---");
                    System.out.print("Nome do curso: ");
                    String nomeCurso = entrada.nextLine();
                    System.out.print("Código do curso: ");
                    String codCurso = entrada.nextLine();

                    Curso novoCurso = new Curso(nomeCurso, codCurso);
                    cursos.add(novoCurso); // Adiciona o curso à lista de cursos disponíveis
                    System.out.println("Curso '" + novoCurso.getNome() + "' criado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n--- Inscrição em Curso ---");
                    if (alunos.isEmpty() || cursos.isEmpty()) {
                        System.out.println("É necessário ter pelo menos um aluno e um curso cadastrado para realizar a inscrição.");
                        break;
                    }

                    System.out.print("Digite o email do aluno: ");
                    String emailBusca = entrada.nextLine();
                    Aluno alunoParaInscrever = null;
                    for (Aluno a : alunos) {
                        if (a.getEmail().equals(emailBusca)) {
                            alunoParaInscrever = a;
                            break;
                        }
                    }

                    if (alunoParaInscrever == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    System.out.print("Digite o nome do curso: ");
                    String nomeBuscar = entrada.nextLine();
                    Curso cursoParaInscrever = null;
                    for (Curso c : cursos) {
                        if (c.getNome().equals(nomeBuscar)) {
                            cursoParaInscrever = c;
                            break;
                        }
                    }

                    if (cursoParaInscrever == null) {
                        System.out.println("Curso não encontrado.");
                        break;
                    }


                    alunoParaInscrever.inscricaoAluno(cursoParaInscrever);
                    System.out.println("Aluno " + alunoParaInscrever.getNome() + " inscrito no curso " + cursoParaInscrever.getNome() + " com sucesso!");
                    break;

                case 5:
                    System.out.println("\n--- Lista de Cursos Disponíveis ---");
                    if (cursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                    } else {
                        for (Curso c : cursos) {
                            System.out.println("Nome: " + c.getNome() + ", Código: " + c.getCod_curso());
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n--- Listar Alunos por Curso ---");
                    if (cursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                        break;
                    }
                    System.out.print("Digite o nome do curso para ver os alunos inscritos: ");
                    String codNomeCurso = entrada.nextLine();
                    Curso cursoSelecionado = null;
                    for(Curso c : cursos) {
                        if(c.getNome().equals(codNomeCurso)) {
                            cursoSelecionado = c;
                            break;
                        }
                    }

                    if(cursoSelecionado == null) {
                        System.out.println("Curso não encontrado.");
                    } else {
                        System.out.println("Alunos do curso '" + cursoSelecionado.getNome() + "':");
                        cursoSelecionado.listaAlunos();
                    }
                    break;

                case 0:
                    System.out.println("Saindo da plataforma...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}