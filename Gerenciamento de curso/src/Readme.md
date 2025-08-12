# **📚 Sistema de Gerenciamento de Cursos**

## **🎯 Sobre o Projeto**

Este projeto é um sistema de gerenciamento para uma plataforma de cursos, totalmente operacional via terminal. O seu principal objetivo é aplicar e solidificar os conceitos fundamentais e os pilares da **Programação Orientada a Objetos (POO)** em um cenário prático e coeso.

Através de uma interface de console simples, o sistema permite que instrutores criem e gerenciem cursos, enquanto alunos podem se inscrever e visualizar os cursos disponíveis.

## **✨ Conceitos Chave Aplicados**

O desenvolvimento deste sistema foi guiado pela aplicação dos seguintes conceitos:

### **🐘 Pilares da Programação Orientada a Objetos (POO)**

* **Classes e Objetos**: A base do sistema. Usuario, Aluno, Instrutor e Curso são modelados como classes que geram objetos para representar as entidades do mundo real.
* **Encapsulamento**: Os atributos das classes são privados e acessados através de métodos públicos (getters e setters), protegendo a integridade dos dados e ocultando a complexidade interna. A validação de dados, como o formato do e-mail e a obrigatoriedade de campos, é feita dentro dos setters, garantindo que os objetos estejam sempre em um estado válido.
* **Herança**: A classe Usuario serve como base, e as classes Aluno e Instrutor herdam seus atributos e comportamentos (nome, email, senha), promovendo o reuso de código e criando uma hierarquia de tipos ("é um").
* **Polimorfismo**: Embora não haja sobrescrita complexa de métodos, o polimorfismo de subtipo é a base da estrutura. Objetos de Aluno e Instrutor podem ser armazenados em coleções de Usuario, permitindo tratar diferentes tipos de usuários de forma genérica.
* **Abstração**: A classe Usuario é um exemplo de abstração, definindo um modelo (ou contrato) comum para todas as entidades que são usuários do sistema, focando no que é essencial e escondendo a complexidade da validação de dados.

### **☕ Fundamentos de Java**

* **Estruturas de Controle**: A lógica do menu interativo na classe Main é controlada por um loop do-while e uma estrutura switch-case para direcionar as ações do usuário.
* **Coleções (Collections)**: ArrayList é utilizado extensivamente para armazenar e gerenciar de forma dinâmica as listas de cursos, alunos, instrutores e as inscrições dos alunos nos cursos.
* **Tratamento de Exceções**: O sistema utiliza blocos try-catch na classe Main para lidar com IllegalArgumentException lançadas pelos setters da classe Usuario (ex: email inválido, campos obrigatórios vazios), garantindo que a aplicação não pare de forma inesperada e forneça feedback claro ao usuário.

## **🏗️ Modelagem do Sistema**

As entidades do sistema foram modeladas da seguinte forma:

      classDiagram  


      class Usuario {  
         \-String nome  
         \-String email  
         \-String senha  
         \+getNome()  
         \+getEmail()  
         \+setNome(String)  
         \+setEmail(String)  
         \+setSenha(String)  
      }

    class Aluno {  
        \-ArrayList\~Curso\~ cursosInscritos  
        \+inscricaoAluno(Curso)  
    }

    class Instrutor {  
        \+String materia  
        \+String nivel\_academico  
        \+criarCurso(String)  
    }

    class Curso {  
        \-String nome  
        \-String cod\_curso  
        \-ArrayList\~Aluno\~ listaAlunos  
        \+cadastrarAluno(Aluno)  
        \+listaAlunos()  
    }

    Usuario \<|-- Aluno  
    Usuario \<|-- Instrutor  
    Instrutor "1" \-- "0..\*" Curso : cria  
    Aluno "1" \-- "0..\*" Curso : inscreve-se em

* **Usuario**: Classe base que contém os dados comuns a todos os usuários e a lógica de validação.
* **Aluno**: Herda de Usuario e representa um estudante que pode se inscrever nos cursos.
* **Instrutor**: Herda de Usuario e representa um professor que pode criar cursos.
* **Curso**: Representa um curso, contendo informações como nome, código e a lista de alunos inscritos.

## **⚙️ Funcionalidades**

O sistema oferece as seguintes operações via terminal, conforme implementado em Main.java:

1. **Cadastrar Instrutor**: Cadastra um novo instrutor no sistema com nome, email, senha, matéria e nível acadêmico.
2. **Cadastrar Aluno**: Cadastra um novo aluno no sistema com nome, email e senha.
3. **Criar Curso**: Permite a criação de um novo curso com nome e código.
4. **Inscrever Aluno em Curso**: Associa um aluno a um curso através do email do aluno e nome do curso.
5. **Listar Cursos**: Exibe todos os cursos disponíveis na plataforma com seus nomes e códigos.
6. **Listar Alunos de um Curso**: Mostra todos os alunos inscritos em um curso específico.
7. **Sair (Opção 0\)**: Encerra a aplicação.

## **🚀 Como Executar o Projeto**

Para compilar e executar o projeto localmente, siga os passos abaixo:

1. **Estrutura de Pastas**: Certifique-se de que seus arquivos .java estão na seguinte estrutura:  
   seu-projeto/  
   └── src/  
   ├── Main.java  
   └── gerenciamento/  
   ├── Usuario.java  
   ├── Aluno.java  
   ├── Instrutor.java  
   └── Curso.java

2. **Abra o terminal na pasta src:**  
   cd caminho/para/seu-projeto/src

3. **Compile os arquivos Java:**  
   javac Main.java gerenciamento/\*.java

   *Este comando compila a classe Main e todas as classes do pacote gerenciamento.*
4. **Execute a aplicação:**  
   java Main

5. Após a execução, o menu interativo será exibido no seu terminal. Siga as instruções para usar o sistema.
## **👨‍💻 Autor**

* **Anthony Santos**
* [LinkedIn](https://www.linkedin.com/in/anthony-santos12/)
* [GitHub](https://github.com/AnthonySantoss)