# 🏥 Vollmed - Sistema de Gestão de Clínica Médica

O **Vollmed** é uma aplicação Back-end desenvolvida para otimizar o fluxo de agendamentos e cadastros em uma clínica médica. O sistema gerencia informações de médicos e pacientes, garantindo a integridade dos dados e facilitando a marcação de consultas.



## 🛠 Tecnologias e Ferramentas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3
* **Gerenciador de Dependências:** Maven
* **Banco de Dados:** MySQL
* **Persistência de Dados:** Spring Data JPA / Hibernate

## 📋 Funcionalidades (CRUD)

O sistema foi construído seguindo os princípios de **Clean Code** e **SOLID**:

1.  **Médicos:** Cadastro completo, listagem, edição e exclusão.
2.  **Pacientes:** Registro de dados pessoais e histórico.
3.  **Consultas:** Agendamento vinculando um Médico a um Paciente, com data e hora.
4.  **Listagem:** Paginação de resultados para otimizar a performance da API.



## 📋 Como executar o projeto

1.  **Clone este repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/vollmed.git](https://github.com/seu-usuario/vollmed.git)
    ```
2.  **Configure o banco de dados:**
    Edite o arquivo `src/main/resources/application.properties` com suas credenciais do MySQL:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_db
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```
3.  **Compile e rode o projeto:**
    ```bash
    mvn spring-boot:run
    ```

## 🏗 Estrutura do Banco de Dados (MySQL)
* **Tabela Medicos:** `id, nome, email, crm, especialidade, telefone, endereco`
* **Tabela Pacientes:** `id, nome, email, cpf, telefone, endereco`
* **Tabela Consultas:** `id, medico_id, paciente_id, data_hora`

---
*Projeto desenvolvido para fins de estudo e prática de desenvolvimento Back-end.*
