# API de E-commerce - Microserviço de Produtos

Bem-vindo à API de e-commerce! Este projeto é uma implementação de uma arquitetura de microserviços para um sistema de comércio eletrônico. Cada microserviço é responsável por uma parte específica do sistema, proporcionando escalabilidade e flexibilidade.

## Microserviço de Produtos

O microserviço de produtos gerencia todas as operações relacionadas aos produtos disponíveis no e-commerce. Aqui estão alguns dos recursos oferecidos por este microserviço:

- **Cadastro de Produtos:** Adicione novos produtos ao catálogo.
- **Consulta de Produtos:** Recupere informações sobre produtos específicos ou obtenha uma lista de todos os produtos disponíveis.
- **Consulta de Produtos por Id:** Recupere informações sobre produtos específicos por ID.
- **Atualização de Produtos:** Modifique detalhes de produtos existentes.
- **Remoção de Produtos:** Exclua produtos do catálogo.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Banco de Dados ( MySQL)

## Pré-requisitos

- JDK 8 ou superior
- Maven
- Banco de dados configurado no `application.properties`

## Como Executar o Microserviço de Produtos

1. Clone este repositório: `https://github.com/anamsilva1981/Apis-Ecommerce.git`
2. Navegue até o diretório do microserviço de produtos: `cd seu-projeto/microservico-produtos`
3. Execute o projeto usando o Maven: `mvn spring-boot:run`
4. O microserviço estará disponível em [http://localhost:8080](http://localhost:8080)

Certifique-se de configurar corretamente as informações do banco de dados no arquivo `application.properties`.

## Documentação da API

A documentação detalhada da API, incluindo todos os endpoints disponíveis, pode ser encontrada em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

## Desenvolvedores

Esta Api está sendo desenvolvida pelos seguintes desenvolvedores: 
Ana Maria: linkedin: https://www.linkedin.com/in/anamsilva1981/ e GitHub: https://github.com/anamsilva1981
Matheus Pereira: linkedin: https://www.linkedin.com/in/matheuspereira00/ e GitHub: https://github.com/MatheusPereira00

## Próximos Passos

- **Microserviço de Pedidos:** Em desenvolvimento.
- **Microserviço de Favoritos:** Planejado.
- **Microserviço de Usuário:** Planejado.
- **Microserviço de Administrador:** Planejado.
- **Microserviço de Detalhes:** Planejado.
- **Microserviço de Categorias:** Planejado.
- **Microserviço de Subcategorias:** Planejado.
- **Microserviço de Entrega:** Planejado.
- **Microserviço de Autenticação:** Planejado.

