# Biblioteca

API backend desenvolvida em Spring Boot para gerenciamento de livros.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

## Funcionalidades

- Cadastro de livros
- Listagem de livros
- Busca de livro por ID
- Alteração de livros
- Documentação dos endpoints

## Endpoints

### Sistema

`GET /`

`GET /documentacao`

### Livros

`GET /livros`

`POST /livros/cadastrar`

`GET /livros/{id}`

`PUT /livros/alterar/{id}`

### Exemplo de cadastro

```json
{
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis",
  "isbn": "9788535910663",
  "anoPublicacao": 1899
}
```

### Exemplo de alteração

```json
{
  "titulo": "Dom Casmurro - Edição Atualizada",
  "autor": "Machado de Assis",
  "isbn": "9788535910663",
  "anoPublicacao": 1900
}
```

## Banco de dados

PostgreSQL executado em container Docker.

- Banco: `biblioteca`
- Porta: `5435`

## Autor

Ricardo Jairi Silvestre