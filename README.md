
# Desafio junior backend simplify



 Projeto e uma To-do list (CRUD) do [desse desafio](https://github.com/simplify-tec/desafio-junior-backend-simplify) , a aplicação consiste em um sistema de gerenciamento de tarefas, onde os usuários podem criar, visualizar, editar e excluir tarefas.

##  Tecnologias usadas
- [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/)

- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)

- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)

- [MySQL](https://dev.mysql.com/doc/)


## Práticas adotadas


- SOLID, DRY
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar
 Esse projeto vai estar com o banco de dados h2 como padrão.
 Para trocar para o MySQL comente as linhas de configuração do H2 e descomem-te as linhas do MySQL.
 

- Local do arquivo

```
 desafio-junior-backend-simplify/src/main/resources
```
 - Nome do arquivo
 ```
  application.properties
 ```
- Clonar repositório git

```
 git clone https://github.com/felipemelozx/desafio-junior-backend-simplify.git
```
- Construir o projeto:

```
 ./mvnw clean package
```

- Executar a aplicação:
```
java -jar target/desafioBackEndJavaJunior-0.0.1-SNAPSHOT.jar
```

Acesse a API em [localhost:8080/todos](http://localhost:8080/todos).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Como Usar a API

### Criar Todo
#### Verbo HTTP: POST 

#### URL:

```
localhost:8080/todos
```
#### Corpo da Requisição:
```
  {
    "id": 0,
    "name": "string",
    "description": "string",
    "status": true,
    "priority": 0
  }
```
### Listar Todos
#### Verbo HTTP: GET 

#### URL:

```
localhost:8080/todos
```

### Update Todo
#### Verbo HTTP: PUT 

#### URL:

```
localhost:8080/todos/id
```
- Troque o campo id pelo numero id da todo ex: localhost:8080/todos/2
```
  {
    "id": 0,
    "name": "string",
    "description": "string",
    "status": true,
    "priority": 0
  }
```

### Delete Todo
#### Verbo HTTP: DELETE 

#### URL:

```
localhost:8080/todos/id
```
- Troque o campo id pelo numero id da todo ex: localhost:8080/todos/2
