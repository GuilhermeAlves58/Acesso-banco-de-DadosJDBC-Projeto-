# 💻 Projeto: Acesso a Dados com JDBC em Java

Repositório criado para o módulo de **acesso ao banco de dados** do curso de Java do professor **Nélio Alves**.

Este projeto demonstra o uso da API JDBC (Java Database Connectivity) para realizar operações com banco de dados MySQL em Java, incluindo a implementação do padrão de projeto DAO (Data Access Object).

📚 Curso: **Programação Orientada a Objetos com Java**  
👨‍🏫 Professor: **Dr. Nélio Alves**  
🔗 Repositório original: [github.com/acenelio/demo-dao-jdbc](https://github.com/acenelio/demo-dao-jdbc)

---

## 🎯 Objetivo Geral

- Conhecer os principais recursos do JDBC na teoria e prática
- Elaborar a estrutura básica de um projeto com JDBC
- Implementar o padrão DAO manualmente com JDBC

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

- Java SE 8+
- Eclipse IDE
- MySQL Server
- MySQL Workbench
- MySQL Connector/J
- JDBC API (`java.sql`, `javax.sql`)

---

## 🧱 Estrutura do Projeto

```bash
src/
├── application/
│   └── Program.java             # Classe principal de teste
├── db/
│   ├── DB.java                  # Métodos auxiliares de conexão
│   ├── DbException.java         # Exceção personalizada
│   └── DbIntegrityException.java# Exceção para integridade referencial
├── model/
│   ├── entities/
│   │   ├── Seller.java
│   │   └── Department.java
│   └── dao/
│       ├── SellerDao.java
│       ├── DepartmentDao.java
│       ├── DaoFactory.java
│       └── impl/
│           ├── SellerDaoJDBC.java
│           └── DepartmentDaoJDBC.java
└── resources/
    └── db.properties            # Arquivo com dados de conexão
