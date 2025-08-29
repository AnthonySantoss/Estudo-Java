# **Gerenciador de Biblioteca Pessoal**

## **📖 Sobre o Projeto**

Este é um simples, porém funcional, sistema de gerenciamento de biblioteca pessoal desenvolvido em Java. A aplicação permite que o usuário adicione, liste e busque livros em sua coleção particular. Todos os dados são persistidos em um arquivo local (`Biblioteca.csv`), garantindo que as informações não sejam perdidas ao fechar o programa.

O projeto foi estruturado de forma orientada a objetos para garantir um código limpo, organizado e de fácil manutenção.

---

## **✨ Funcionalidades Principais**

* **Adicionar Livros:** Cadastre novos livros informando Título, Autor, Ano de Publicação e Gênero.
* **Listar Livros:** Visualize todos os livros cadastrados na sua biblioteca.
* **Busca por Título:** Encontre um livro específico pesquisando pelo seu título.
* **Busca por Autor:** Encontre todos os livros de um determinado autor.
* **Validação de Dados:** O sistema possui validações para garantir que dados essenciais (como título e autor) não fiquem em branco e que o ano de publicação seja um valor válido.
* **Persistência de Dados:** Salva e carrega automaticamente a coleção de livros em um arquivo `.csv`, permitindo que sua biblioteca seja mantida entre as sessões de uso.

---

## **🛠️ Estrutura do Projeto**

O projeto é composto por três classes principais, cada uma com sua responsabilidade bem definida:

* **`Livro.java`**: Representa a entidade principal do sistema. É responsável por armazenar os atributos de um livro (título, autor, ano de publicação e gênero) e por validar esses dados.
* **`Biblioteca.java`**: É a classe que gerencia a coleção de livros. Contém os métodos para adicionar, listar, buscar, salvar e carregar os livros da biblioteca.
* **`Main.java`**: É a classe de entrada da aplicação. Responsável por interagir com o usuário através de um menu de console, capturando as entradas e invocando os métodos apropriados da classe `Biblioteca`.

---

## **🚀 Como Executar o Projeto**

Para compilar e executar este projeto, você precisará ter o **JDK (Java Development Kit)** instalado em sua máquina.

### **Passos para a Execução:**

**Clone o Repositório (ou copie os arquivos):** Faça o download ou clone este repositório para um diretório de sua escolha.  
Bash  
git clone https://github.com/AnthonySantoss/Estudo-Java.git

1.
2. **Abra o Terminal ou Prompt de Comando:** Navegue até o diretório onde os arquivos `.java` estão localizados (dentro da pasta `biblioteca`).

**Compile os Arquivos Java:** Execute o seguinte comando para compilar todas as classes do projeto.  
Bash  
javac biblioteca/Livro.java biblioteca/Biblioteca.java Main.java

3.

**Execute a Aplicação:** Após a compilação bem-sucedida, execute a classe principal.  
Bash  
java Main

4.

Ao executar pela primeira vez, o sistema criará um arquivo chamado `Biblioteca.csv` no diretório raiz do projeto. Este arquivo será usado para armazenar os dados dos seus livros.

---

## **💻 Como Usar**

Ao iniciar a aplicação, um menu interativo será exibido no console:

\-------------------  
Biblioteca Pessoal  
\-------------------  
Menu  
1 \- Adicionar Livro  
2 \- Listar Livros  
3 \- Buscar por Título  
4 \- Buscar por Autor  
0 \- Fechar Biblioteca

* **Opção 1:** Solicitará que você insira os detalhes do novo livro (título, autor, ano e gênero).
* **Opção 2:** Exibirá a lista completa de livros atualmente cadastrados na biblioteca.
* **Opção 3:** Pedirá o título de um livro e mostrará se ele foi encontrado.
* **Opção 4:** Pedirá o nome de um autor e listará todos os livros dele que estão na sua coleção.
* **Opção 0:** Salvará todas as alterações no arquivo `Biblioteca.csv` e encerrará o programa.

---

## **👨‍💻 Autor**

Este projeto foi desenvolvido como um exemplo de aplicação de console em Java, demonstrando conceitos fundamentais de Orientação a Objetos, manipulação de coleções (`ArrayList`) e persistência de dados em arquivos.

