# 🗺️ SkillUp CS2 Backend

Backend da aplicação SkillUp CS2, desenvolvido em **Spring Boot 3.x** (Java 21+) e utilizando **PostgreSQL** com Docker para gerenciamento de mapas e posições táticas.

---

## 🚀 Como Executar o Projeto (Guia de Configuração Rápida)

Este guia detalha como configurar e iniciar o ambiente de desenvolvimento, que utiliza o Docker para o banco de dados.

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas e configuradas:

* **Java Development Kit (JDK) 21+**
* **Docker e Docker Compose** (Docker Desktop)
* **Maven** (Para gerenciamento de dependências e build)
* **IntelliJ IDEA** (Recomendado para desenvolvimento)

### 1. Clonar o Repositório

```bash
git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)
cd SEU_REPOSITORIO/backend


### 2. Configurar o Banco de Dados (PostgreSQL via Docker)

Execute o Docker Compose na pasta `backend` para subir o container do banco de dados. O `docker-compose.yml` irá criar o serviço PostgreSQL e o volume para persistência de dados.

```bash
docker-compose up -d
