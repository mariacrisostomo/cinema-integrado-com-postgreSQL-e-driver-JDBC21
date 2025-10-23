package cineminha;

import java.sql.*;
import java.util.*;

public class FilmeDAO {

    // Inserir novo filme
    public void inserir(Filme f) throws SQLException {
        String sql = "INSERT INTO filme (titulo, ano_producao, duracao_minutos, id_genero) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getTitulo());
            stmt.setInt(2, f.getAnoProducao());
            stmt.setInt(3, f.getDuracao());
            stmt.setString(4, f.getIdGenero());
            stmt.executeUpdate();
        }
    }

    // Atualizar filme existente
    public void atualizar(Filme f) throws SQLException {
        String sql = "UPDATE filme SET titulo = ?, ano_producao = ?, duracao_minutos = ?, id_genero = ? WHERE id_filme = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getTitulo());
            stmt.setInt(2, f.getAnoProducao());
            stmt.setInt(3, f.getDuracao());
            stmt.setString(4, f.getIdGenero());
            stmt.setInt(5, f.getIdFilme());
            stmt.executeUpdate();
        }
    }

    // Excluir filme pelo id
    public void excluir(int idFilme) throws SQLException {
        String sql = "DELETE FROM filme WHERE id_filme = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idFilme);
            stmt.executeUpdate();
        }
    }

    // Listar todos os filmes
    public List<Filme> listar() throws SQLException {
        List<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM filme";
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Filme(
                        rs.getInt("id_filme"),
                        rs.getString("titulo"),
                        rs.getInt("ano_producao"),
                        rs.getInt("duracao_minutos"),
                        rs.getString("id_genero")
                ));
            }
        }
        return lista;
    }
}
