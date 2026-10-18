# POO - Programação Orientada a Objetos

Repositório dedicado ao armazenamento de atividades, exercícios e projetos práticos desenvolvidos durante as aulas de Programação Orientada a Objetos (POO).

## Tecnologias Estudadas

Neste repositório, exploramos os principais conceitos da programação orientada a objetos por meio de atividades práticas.

- ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) **Java:** Desenvolvimento de aplicações utilizando os princípios da programação orientada a objetos.

## Conteúdos Estudados

- **Classes e Objetos:** Estruturação e criação de objetos.
- **Atributos e Métodos:** Definição de características e comportamentos.
- **Construtores:** Inicialização de objetos.
- **Encapsulamento:** Controle de acesso aos dados.
- **Herança:** Reutilização de funcionalidades entre classes.
- **Polimorfismo:** Diferentes comportamentos para métodos e objetos.
- **Abstração:** Representação dos elementos essenciais de um sistema.

## Projeto: Sistema de Academia

### Sobre o Projeto

O Sistema de Academia é um projeto desenvolvido em Java durante as aulas de Programação Orientada a Objetos. Seu objetivo é simular o cadastro e a consulta de alunos matriculados em diferentes planos de uma academia, utilizando conceitos de POO para organizar o código.

### Funcionalidades

- **Cadastro de Plano Básico:** Permite cadastrar alunos no plano básico.
- **Cadastro de Plano VIP:** Permite cadastrar alunos no plano VIP, informando a quantidade de meses e escolhendo se deseja incluir personal trainer.
- **Validação de Dados:** Utiliza métodos de validação para receber informações dos alunos, como nome, CPF e números inteiros.
- **Listagem de Alunos:** Exibe as informações dos alunos cadastrados.
- **Limite de Cadastros:** Permite cadastrar até três alunos.
- **Menu Interativo:** Oferece opções para cadastrar alunos, consultar os cadastros e encerrar o sistema.

### Conceitos de POO Aplicados

- **Classes e Objetos:** Utilizados para representar os planos e organizar as informações dos alunos.
- **Herança:** Aplicada na especialização dos tipos de plano.
- **Polimorfismo:** Utilizado para trabalhar com diferentes tipos de plano por meio de uma referência comum.
- **Encapsulamento:** Utilizado para organizar e controlar o acesso aos dados, conforme a implementação das classes.
- **Abstração:** Aplicada na representação dos elementos essenciais do sistema.
- **Organização em Classes:** O código é dividido em classes com responsabilidades específicas, como validação de dados e exibição de informações.

### Estrutura do Projeto

As principais classes utilizadas no sistema são:

- `Plano`: representa a estrutura comum dos planos.
- `PlanoBasico`: representa o plano básico da academia.
- `PlanoVip`: representa o plano VIP, com opção de personal trainer.
- `Fidelizavel`: interface relacionada à funcionalidade de fidelização, conforme sua implementação.
- `Validador`: reúne métodos de validação de dados.
- `InformacoesAluno`: responsável pela exibição das informações dos alunos.
- `main`: contém o menu principal e controla a execução do sistema.

### Como Executar

**Requisitos:**
- JDK 25 ou versão compatível com a API `java.lang.IO` utilizada no projeto.
- Uma IDE compatível com a versão do Java, como IntelliJ IDEA, ou um ambiente configurado para executar o código.

**Passos:**
1. Clone ou baixe este repositório.
2. Abra o projeto na sua IDE.
3. Configure o JDK adequado.
4. Localize o arquivo que contém o método principal `main`.
5. Execute o programa e utilize as opções apresentadas no menu.

---

**Desenvolvedores:** Matheus Vinicius e Victor Correa.
