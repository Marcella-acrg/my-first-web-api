# Projeto desenvolvido com Spring WEB API e Swagger

Projeto desenvolvido durante bootcamp da DIO - Desenvolvimento Java com IA, tem como objetivo criar uma API REST, documentar com Spring WEB e Swagger, bem como, estruturar o controller e habilitar o tratamento de exceções.

## Principais Conceitos 
API (Interface Application Program) é um código programável que faz a "ponte" de comunicação entre duas aplicações distintas.

REST e RESTFUL - A API REST (Representational State Transfer) é como um guia de boas práticas e RESTFUL é a capacidade de determinado sistema aplicar os princípios de REST.

Para que uma arquitetura seja RESTFUL, é necessário ter uma série de princípios ou padrões, conforme detalhado a seguir:

cliente-servidor — significa aprimorar a portabilidade entre várias plataformas de interface do usuário e do servidor, permitindo uma evolução independente do sistema;

interface uniforme — representa uma interação uniforme entre cliente e servidor. Para isso, é preciso ter uma interface que identifique e represente recursos, mensagens autodescritivas, bem como hypermedia (HATEOAS);

stateless — indica que cada interação via API tem acesso a dados completos e compreensíveis;

cache — necessário para reduzir o tempo médio de resposta, melhorar a eficiência, desempenho e escalabilidade da comunicação;

camadas — permite que a arquitetura seja menos complexa e altamente flexível.


### Spring Framework x Spring Boot x Spring Web

Spring Framework é uma plataforma abrangente e poderosa para o desenvolvimento de aplicações empresariais em Java. Ela oferece um conjunto vasto de funcionalidades que abrangem várias áreas do desenvolvimento de software. É o núcleo de onde muitos outros projetos Spring (como Spring Boot e Spring Web) derivam.

Principais Componentes do Spring Framework:
- Inversão de Controle (IoC) / Injeção de Dependências (DI): Permite a criação de aplicações flexíveis e configuráveis através da inversão de controle e injeção de dependências.
- Aspect-Oriented Programming (AOP): Suporta a programação orientada a aspectos, facilitando a separação de preocupações transversais, como logging e segurança.
- Spring Data: Facilita a interação com bancos de dados e outras fontes de dados, abstraindo a complexidade das operações de CRUD (Create, Read, Update, Delete).
- Spring MVC (Spring Web): Um framework para construir aplicações web e APIs REST usando o padrão MVC (Model-View-Controller).
- Spring Security: Oferece autenticação e controle de acesso robustos para aplicações.

Spring Boot é uma extensão do Spring Framework que visa simplificar o desenvolvimento de novas aplicações Spring. Ele faz isso através de configuração automática e boas práticas, permitindo que desenvolvedores foquem na lógica de negócio em vez de configurar a infraestrutura.

Principais Características do Spring Boot:
- Configuração Automática: Reduz a necessidade de configuração manual extensa através de convenções e pré-configurações.
- Starters: Conjuntos de dependências pré-configuradas para diferentes tipos de aplicações, como spring-boot-starter-web para aplicações web.
- Servidor Embutido: Inclui servidores de aplicação como Tomcat, Jetty ou Undertow, permitindo a execução autônoma da aplicação sem necessidade de configuração de servidores externos.
- Actuator: Fornece endpoints prontos para monitoramento e gerenciamento da aplicação.

Spring Web (Spring MVC), também conhecido como Spring MVC (Model-View-Controller), é um módulo do Spring Framework que oferece suporte para construir aplicações web e APIs REST. Ele segue o padrão MVC para separar as preocupações de navegação, lógica de negócio e apresentação.

Principais Características do Spring Web:
- Controladores: Mapeamento de URLs para métodos que lidam com requisições HTTP.
- Views: Suporte para várias tecnologias de view (como JSP, Thymeleaf) para renderização da interface do usuário.
- APIs REST: Facilita a criação de APIs RESTful com suporte para JSON e XML.
- Validação e Formulários: Suporte para validação de dados e manipulação de formulários.

Principais diferenças entre aplicações WEB e APIs REST:

- Uma aplicação web é destinada a ser usada diretamente por usuários finais através de um navegador. Ela oferece uma interface gráfica com a qual os usuários podem interagir.
Exemplo: Um site de e-commerce onde os usuários podem navegar por produtos, adicionar itens ao carrinho e realizar compras.

- Uma API REST (Representational State Transfer) é destinada a ser usada por outras aplicações ou serviços, não por usuários finais diretamente. Ela fornece acesso a funcionalidades e dados da aplicação através de chamadas HTTP.
- Oferece uma interface de programação que permite que diferentes sistemas se comuniquem uns com os outros. A comunicação geralmente ocorre através de requisições HTTP e respostas em formatos como JSON ou XML.
- Fornece endpoints que permitem a criação, leitura, atualização e exclusão de recursos (CRUD). Esses recursos podem ser dados ou funcionalidades da aplicação.
Exemplo: Uma API REST para um sistema de e-commerce pode oferecer endpoints para obter a lista de produtos, detalhes de um produto específico, criar um novo pedido, etc.

## Verbos HTTP
- GET - Obter
- POST - Salvar
- PUT - Alterar
- DELETE - Remover

## Configuração do Spring Initializr - [Link de acesso ao Spring Initializr](https://start.spring.io/)
- Project Maven
- Language Java 17
- Spring Boot 3.3.2 
- Dependecies: Spring Web

## Como rodar a API REST
- Realize um git clone do repositório my-first-web-api em seu computador;
- Abra a repositório clonado na IDE de preferência e rode a aplicação;
- Acesse o Swagger e teste os verbos HTTP configurados - [Link de acesso ao Swagger](http://localhost:8080/swagger-ui/index.html);
- A aplicação também pode ser testada através do Postman;




