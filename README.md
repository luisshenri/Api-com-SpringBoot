# API com Spring Boot

## Sobre o Projeto

A **API com Spring Boot** foi desenvolvida como projeto de estudo para consolidar conhecimentos em desenvolvimento backend utilizando o ecossistema Java.

> **Importante:** Este projeto possui caráter acadêmico e educacional. Seu objetivo é servir como ambiente de aprendizado e experimentação das tecnologias utilizadas, não sendo destinado originalmente para ambientes produtivos.

---

## Objetivos de Aprendizagem

Durante o desenvolvimento deste projeto foram explorados conceitos como:

- Desenvolvimento de APIs REST.
- Arquitetura em camadas.
- Spring Boot.
- Injeção de Dependência (Dependency Injection).
- Persistência de dados.
- Manipulação de requisições HTTP.
- Serialização e desserialização de objetos JSON.
- Boas práticas de desenvolvimento backend com Java.

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring MVC
- Maven
- JPA/Hibernate (caso utilizado)
- Banco de Dados Relacional
- JSON
- REST API

---

## Estrutura do Projeto

```text
src/
 └── main/
      ├── java/
      │    ├── controller/
      │    ├── service/
      │    ├── repository/
      │    ├── model/
      │    └── Application.java
      │
      └── resources/
           ├── application.properties
           └── static/
```

### Responsabilidade das Camadas

| Camada | Responsabilidade |
|----------|----------------|
| Controller | Receber requisições HTTP e retornar respostas |
| Service | Regras de negócio |
| Repository | Comunicação com banco de dados |
| Model | Representação das entidades da aplicação |

---

## Como Executar o Projeto

### Pré-Requisitos

- JDK 17 ou superior
- Maven
- IDE (IntelliJ IDEA, Eclipse ou VS Code)

### Clonar o Repositório

```bash
git clone https://github.com/luisshenri/Api-com-SpringBoot.git
```

### Acessar o Diretório

```bash
cd Api-com-SpringBoot
```

### Executar o Projeto

```bash
mvn spring-boot:run
```

---

## Endpoints

Os endpoints dependerão dos controllers implementados no projeto.

| Método | Endpoint | Descrição |
|----------|-----------|-----------|
| GET | /api/entidades | Lista registros |
| GET | /api/entidades/{id} | Busca por ID |
| POST | /api/entidades | Cria registro |
| PUT | /api/entidades/{id} | Atualiza registro |
| DELETE | /api/entidades/{id} | Remove registro |

---

## Possíveis Melhorias

- Swagger/OpenAPI
- Testes unitários com JUnit
- Spring Security e JWT
- Docker
- Deploy em nuvem
- Tratamento global de exceções
- Integração contínua (CI/CD)
- Documentação completa dos endpoints

---

## Aprendizados Obtidos

Este projeto permitiu desenvolver conhecimentos importantes sobre:

- Construção de APIs REST com Java.
- Configuração de aplicações Spring Boot.
- Organização de aplicações backend.
- Integração entre camadas da aplicação.
- Estruturação de projetos para ambientes corporativos.

---

## Autor

**Luis Henrique Santos de Souza**

Projeto desenvolvido para fins de estudo e aprendizado da plataforma Java e do framework Spring Boot, com o objetivo de praticar conceitos fundamentais de desenvolvimento backend e APIs REST.
