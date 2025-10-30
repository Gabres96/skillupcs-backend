# 🎯 **SkillUp CS2 — Backend**
> 🚧 *Projeto em desenvolvimento*

Backend da aplicação **SkillUp CS2**, desenvolvido em **Spring Boot 3.x (Java 21+)**, com **PostgreSQL** via **Docker** para gerenciamento de **mapas, posições e táticas** voltadas ao aprimoramento de jogadores de CS2.

---

## ⚙️ **Tecnologias Principais**

| Categoria | Tecnologia |
|-----------|------------|
| ☕ Linguagem | Java 21+ |
| 🚀 Framework | Spring Boot 3.x |
| 🗄️ Banco de Dados | PostgreSQL 18 (Docker) |
| 🧩 ORM | Spring Data JPA / Hibernate |
| 🧰 Build Tool | Maven |
| 🧠 IDE Recomendada | IntelliJ IDEA |

---

## 🧭 **Guia de Configuração Rápida**

Siga os passos abaixo para configurar e executar o projeto localmente.

### 📋 **Pré-requisitos**

Certifique-se de ter instalado e configurado:

- **Java JDK 21+**
- **Docker + Docker Compose**
- **Maven**
- **IntelliJ IDEA (ou outra IDE compatível com Maven)**

---
### 🌀 **1. Clonar o Repositório**

```bash
git clone https://github.com/SEU_USUARIO/skillupcs2.git
cd skillupcs2/backend
```
###  2. Configurar O Banco De Dados (postgresql Via Docker)
Execute o Docker Compose na pasta `backend` para subir o container do banco de dados. O `docker-compose.yml` irá criar o serviço PostgreSQL e o volume para persistência de dados.

```bash
docker-compose up -d
```

## 🛡️ Segurança (Spring Security)
## 🛑 Limpando o Ambiente (Opcional)
