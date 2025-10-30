# 🗺️ SkillUp CS2 Backend

Backend da aplicação SkillUp CS2, desenvolvido em Spring Boot e utilizando PostgreSQL com Docker para gerenciamento de mapas e posições táticas.

---

## 🚀 Como Executar o Projeto (Guia de Configuração Rápida)

Este projeto utiliza **Docker** para provisionar o banco de dados PostgreSQL.

### Pré-requisitos

* [**Java Development Kit (JDK) 21+**](https://www.oracle.com/java/technologies/downloads/)
* [**Docker e Docker Compose**](https://www.docker.com/products/docker-desktop/) (Docker Desktop)
* [**Maven**](https://maven.apache.org/download.cgi) (Geralmente incluído no seu IDE, como IntelliJ)
* [**IntelliJ IDEA**](https://www.jetbrains.com/idea/) (Recomendado)

### 1. Clonar o Repositório

```bash
git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)
cd SEU_REPOSITORIO/backend
2. Configurar o Banco de Dados (PostgreSQL via Docker)
Execute o Docker Compose para subir o container do banco de dados. Este comando irá construir o volume de dados necessário.

Bash

docker-compose up -d
Verificação Rápida: Abra o Docker Desktop. Você deve ver o container skillupcs-postgres rodando na porta 5432.

3. Configurar e Executar a Aplicação Spring Boot
Após o banco de dados estar ativo, você pode iniciar o backend.

Abrir no IDE: Importe a pasta backend no IntelliJ IDEA como um projeto Maven.

Executar a Classe Principal: Localize e execute a classe com.skillupcs.backend.BackendApplication.

O log no console deve terminar com a mensagem de sucesso:

Tomcat started on port 8080 (http) with context path '/'
Started BackendApplication in X.XXX seconds
O backend estará acessível em http://localhost:8080.

🛡️ Segurança (Spring Security)
O projeto está configurado com Spring Security para fornecer autenticação básica.

Credencial	Valor Padrão
Usuário	user
Senha	A senha é gerada aleatoriamente a cada inicialização da aplicação e é exibida no log do console (Ex: Using generated security password: XXXXXXXX-....).

Exportar para as Planilhas

Para acessar qualquer endpoint, use o usuário user e a senha gerada mais recente.

🛠️ Detalhes Técnicos
Linguagem: Java 21+

Framework: Spring Boot 3.x

Banco de Dados: PostgreSQL 18.0 (via Docker)

Mapeamento ORM: Spring Data JPA / Hibernate

Estrutura de Dados: Mapeamento One-to-Many entre Map e Position.

Map.java: Entidade principal para mapas (ex: Dust2, Inferno).

Position.java: Entidade para posições táticas dentro de um mapa.

🛑 Limpando o Ambiente (Opcional)
Para derrubar o container do Docker e remover todos os dados persistidos no volume:

Bash

# Derruba containers, remove redes e remove VOLUMES de dados.
docker-compose down -v
✒️ Autor
[Seu Nome/GitHub User] - Desenvolvimento Inicial


### Próxima Ação

Você pode copiar este texto para um arquivo chamado `README.md` na raiz do seu repositório.

**Após criar o README, podemos prosseguir para o próximo passo, que é criar o `MapController` para começar a testar seus endpoints da API! Gostaria de continuar?**
