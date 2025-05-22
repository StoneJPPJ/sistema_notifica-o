# 🔔 Sistema de Notificação de Empréstimos Ativos

Este projeto foi desenvolvido com Spring Boot e simula um sistema de notificação automática de empréstimos ativos vinculados a clientes.

## 🚀 Objetivo

Criar um sistema que verifique diariamente informações de clientes e notifique-os caso haja empréstimos ativos associados ao CPF.

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Scheduler
- H2 Database
- Maven
- IntelliJ IDEA

## 📦 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/SEU_USUARIO/notificacao.git
````
2. Navegue até a pasta do projeto:

```bash
cd notificacao
```

3. Execute o projeto no IntelliJ (ou via terminal):

```bash
./mvnw spring-boot:run
mvn spring-boot:run
```

## 🗂️ Estrutura de Pastas

notificacao/
├── controller/        # Rotas da API REST
├── service/           # Lógica de negócio
├── repository/        # Acesso ao banco de dados
├── model/             # Entidades JPA
├── resources/
│   └── application.properties
└── NotificacaoApplication.java

## 📅 Agendamento
O sistema usa @Scheduled para simular notificações automáticas a cada 30 segundos.
Mensagens são exibidas no console simulando envios de alertas.

💡 Futuras melhorias
Integração com serviço de e-mail

Interface Web para cadastro e monitoramento


