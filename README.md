# 🎯 **SkillUp CS2 — Backend**
> 🚧 *Projeto em desenvolvimento*

Backend da aplicação **SkillUp CS2**, desenvolvido em **Spring Boot 3.x (Java 21+)**, com **PostgreSQL** via **Docker** para gerenciamento de **mapas, posições e táticas** voltadas ao aprimoramento de jogadores de CS2.

---

## 🧠 **Sobre o Projeto**

O **SkillUpCS** é uma plataforma voltada para jogadores de **Counter-Strike 2 (CS2)** que desejam **melhorar suas habilidades individuais e táticas em equipe**.  
A aplicação tem como objetivo oferecer uma **análise inteligente e personalizada** das partidas do usuário, integrando dados de plataformas como **Gamers Club**, **Faceit** e o **matchmaking oficial do CS2**.

Por meio da plataforma, o jogador poderá:
- Escolher o **mapa** e a **posição** em que prefere jogar;
- Receber **recomendações personalizadas** de jogadas, utilitários (smokes, flashes, molotovs) e estratégias em equipe;
- Obter **sugestões de jogadores profissionais** com **demos e vídeos de referência**;
- Acompanhar **relatórios mensais** com destaques de desempenho, pontos de melhoria e vídeos das próprias jogadas;
- Contar com o suporte de **inteligência artificial**, que mantém as recomendações sempre atualizadas conforme as mudanças do **metagame** e **map pool**.

Em resumo, o SkillUpCS é uma plataforma de **treinamento inteligente para jogadores de CS2**, unindo dados, vídeos e IA para ajudar o jogador a evoluir de forma contínua e estratégica.

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
