# Sistema de Gerenciamento para Agência de Viagens

Sistema de linha de comando desenvolvido em *Java* com persistência em banco de dados *MariaDB* para a matéria de Linguagens e Técnicas de Programação II. Seu objetivo é facilitar o gerenciamento de uma agência de viagens, incluindo clientes, pacotes, serviços adicionais e pedidos.

---

## Funcionalidades

### Clientes
- Cadastro de clientes nacionais (com CPF) e estrangeiros (com passaporte).
- Listagem completa de clientes.
- Busca de cliente por ID.
- Exclusão de clientes.

### Pacotes de Viagem
- Cadastro de pacotes dos seguintes tipos:
  - Aventura
  - Luxo
  - Cultural
  - Outro (personalizado)
- Listagem completa de pacotes.
- Busca por ID.
- Exclusão de pacotes (restrita a pacotes sem pedidos vinculados).

### Serviços Adicionais
- Cadastro de serviços (ex: translado, passeios, aluguel de veículos).
- Listagem de serviços cadastrados.
- Busca por ID.
- Exclusão de serviços.

### Pedidos
- Registro de pedidos vinculando cliente e pacote de viagem.
- Inclusão da data de contratação.
- Listagem completa de pedidos.
- Busca por ID.
- Exclusão de pedidos (restrita a pedidos sem serviços vinculados).

---

## Tecnologias Utilizadas

- Java 21
- JDBC (Java Database Connectivity)
- MariaDB

---

## Regras de Negócio

- Clientes nacionais precisam de CPF; estrangeiros, de passaporte.
- Pacotes devem ter nome, preço e destino obrigatórios.
- Pacotes só podem ser removidos se não estiverem vinculados a pedidos.
- Um cliente pode contratar vários pacotes.
- Um pedido pode conter vários serviços adicionais.

---

## Banco de Dados

### Principais tabelas:
- `cliente`
- `pacote_viagem`
- `pedido`
- `servico`
- `pedido_servico` (tabela de associação)

### Observação:
Um script SQL contendo a estrutura do banco e dados de exemplo deve ser executado previamente. As credenciais de acesso são configuradas em `Conexao.java`.

---

## Execução

1. Crie o banco de dados e execute o script SQL (estrutura e dados).
2. Configure usuário, senha e nome do banco em `Conexao.java`.
3. Compile o projeto com Java 11+.
4. Execute a classe `Main` para iniciar a aplicação.

---

**Augusto Sodré**

---
