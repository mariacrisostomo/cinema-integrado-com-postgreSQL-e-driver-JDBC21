  HELLOUU! Este é Cineminha. Um sistema em java swing que desenvolvi para integrar todos os conhecimentos adquiridos no segundo ano. Ele é fofinnho, simples e perfeito pra estudar CRUD com PostgreSQL.


🌸 1️⃣ Funcionalidades


✨ Gêneros
➡️ Cadastrar ID (3 caracteres)
➡️ Cadastrar descrição (até 35 caracteres)
➡️ Listar, alterar e excluir


✨ Filmes
➡️ Cadastrar ID (auto-incremento)
➡️ Título (até 40 caracteres)
➡️ Ano de produção
➡️ Duração em minutos
➡️ ID do gênero (chave estrangeira)
➡️ Listar, alterar e excluir


✨ Menu Principal
➡️ Escolher se quer acessar Filmes ou Gêneros


💌 2️⃣ Tecnologias
Java 21 (Swing)
PostgreSQL
JDBC
NetBeans 25


🌸 3️⃣ Estrutura do Projeto
cineminha/
│
├─ Filme.java        → Modelo de filme
├─ Genero.java       → Modelo de gênero
├─ FilmeDAO.java     → CRUD de filmes
├─ GeneroDAO.java    → CRUD de gêneros
├─ FilmeView.java    → Tela Swing filmes
├─ GeneroView.java   → Tela Swing gêneros
├─ Conexao.java      → Gerencia conexão PostgreSQL
└─ Cineminha.java    → Main com menu principal


🌸 4️⃣ Configuração do Banco
1️⃣ Crie o banco cineminha no PostgreSQL.
2️⃣ Crie as tabelas:

CREATE TABLE genero (
    id_genero CHAR(3) PRIMARY KEY,
    descricao VARCHAR(35) NOT NULL
);

CREATE TABLE filme (
    id_filme SERIAL PRIMARY KEY,
    titulo VARCHAR(40) NOT NULL,
    ano_producao INTEGER NOT NULL,
    duracao_minutos INTEGER NOT NULL,
    id_genero CHAR(3) NOT NULL,
    FOREIGN KEY (id_genero) REFERENCES genero(id_genero)
);



3️⃣ Atualize a conexão em Conexao.java:
// esses sao os padroes, mas bote suas credenciais certas!
private static final String URL = "jdbc:postgresql://localhost:5432/cineminha";
private static final String USER = "postgres";
private static final String PASSWORD = "postgres"; 

⚠️ Não esqueça de adicionar o driver JDBC do PostgreSQL no projeto!



🌸 5️⃣ Como Rodar
1️⃣ Abra o projeto no NetBeans.
2️⃣ Compile e execute Cineminha.java.
3️⃣ Escolha se quer abrir Filmes ou Gêneros.
4️⃣ Pronto! Agora você pode inserir, listar, alterar e excluir registros.



🌸 6️⃣ Dicas
✅ Verifique se a URL do JDBC aponta para o banco correto (cineminha).
✅ Se aparecer erro Driver JDBC do PostgreSQL não encontrado, cheque se o JAR do driver está no projeto.
✅ Preencha os campos de ID corretamente:
Filmes → números
Gêneros → 3 caracteres
