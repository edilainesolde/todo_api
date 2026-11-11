## README.md — Aula 09 Backend

# 🚀 Aula 09 – Backend | Todo API

## 📌 Sobre o projeto

Este projeto foi desenvolvido durante a **Aula 09 de Backend**, com o objetivo de praticar os conceitos de desenvolvimento Back-end por meio da construção de uma API para gerenciamento de tarefas (*Todo API*).

A aplicação tem como finalidade organizar e gerenciar tarefas, permitindo trabalhar com conceitos de programação Java, organização de camadas, regras de negócio e desenvolvimento de serviços.

## 🎯 Objetivos da aula

- Compreender a estrutura de uma aplicação Back-end.
- Desenvolver uma API para gerenciamento de tarefas.
- Aplicar conceitos de Programação Orientada a Objetos.
- Organizar o código utilizando separação de responsabilidades.
- Trabalhar com entidades, serviços e controladores.
- Compreender o funcionamento de requisições HTTP.
- Utilizar Git e GitHub para versionamento do projeto.

## 🛠️ Tecnologias utilizadas

- **Java:** linguagem de programação.
- **Maven:** gerenciamento de dependências e construção do projeto.
- **Spring Boot:** framework de desenvolvimento Back-end, caso utilizado na configuração da aplicação.
- **Git:** controle de versão.
- **GitHub:** hospedagem e gerenciamento do código-fonte.

## 📂 Estrutura do projeto

```
todo_api/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   └── main/
│       └── java/
│           └── com/examplo/todo_api/
│               │
│               ├── controller/
│               │
│               ├── entity/
│               │   └── Todo.java
│               │
│               └── service/
│                   └── TodoService.java
│
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

### Organização das camadas

| Camada     | Responsabilidade                               |
| ---------- | ---------------------------------------------- |
| Entity     | Representação das entidades do sistema.        |
| Service    | Implementação das regras de negócio.           |
| Controller | Recebimento e tratamento das requisições HTTP. |

## ⚙️ Funcionalidades propostas

- Criar tarefas.
- Consultar tarefas cadastradas.
- Atualizar informações de tarefas.
- Excluir tarefas.
- Gerenciar o estado das tarefas.

## 💻 Como executar o projeto

### 1. Clonar o repositório

```
git clone https://github.com/edilainesolde/todo_api.git
```

### 2. Acessar a pasta

```
cd todo_api
```

### 3. Executar o projeto

No Windows:

```
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```
./mvnw spring-boot:run
```

*O comando pressupõe que o projeto esteja configurado com Spring Boot e o respectivo plugin Maven.*

## 🔄 Versionamento

O projeto utiliza Git e GitHub para controle de versão e armazenamento do código-fonte.

Principais comandos:

```
git add .
git commit -m "feat: desenvolvimento da API Todo"
git push origin main
```

## 📚 Aprendizados

Durante o desenvolvimento da Aula 09, são trabalhados conceitos importantes para a construção de aplicações Back-end, incluindo:

- Estruturação de projetos Java.
- Separação de responsabilidades.
- Organização em camadas.
- Desenvolvimento de APIs.
- Implementação de regras de negócio.
- Controle de versão com Git e GitHub.

## 👩‍💻 Repositório

Projeto disponível em:

[GitHub – edilainesolde/todo_api](https://github.com/edilainesolde/todo_api)

---

**Projeto acadêmico – Aula 09 | Desenvolvimento Back-end**

## Como adicionar ao GitHub

Na pasta do projeto, abra o terminal e execute:

```
notepad README.md
```

Cole o conteúdo acima e salve.

Depois execute:

```
git add README.md
git commit -m "docs: adicionar README da aula 09 backend"
git push origin main
```

Documentação preparada

Uma observação: os endpoints e as funcionalidades descritas precisam ser conferidos com os controllers e o `pom.xml` antes de considerar o README como documentação definitiva. Não consegui validar o conteúdo interno desses arquivos pela página pública.
