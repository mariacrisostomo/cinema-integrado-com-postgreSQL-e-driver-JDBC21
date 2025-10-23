/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineminha;

import java.sql.*;
import java.util.*;
/**
 *
 * @author maria
 */
public class GeneroDAO {
    
    public void inserir(Genero g) throws SQLException {
        String sql = "INSERT INTO genero (id_genero, descricao) VALUES (?, ?)";
        try (Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, g.getIdGenero());
            stmt.setString(2, g.getDescricao());
            stmt.executeUpdate();
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void atualizar(Genero g) throws SQLException {
        String sql = "UPDATE Genero SET descricao = ? WHERE id_genero = ?";
        try (Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, g.getDescricao());
            stmt.setString(2, g.getIdGenero());
            stmt.executeUpdate();
        }
    }
    
    public void excluir(String idGenero) throws SQLException {
        String sql = "DELETE FROM genero WHERE id_genero = ?";
        try (Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, idGenero);
            stmt.executeUpdate();
            
        }
    } 
    
    public List<Genero> listar() throws SQLException {
        List<Genero> lista = new ArrayList<>();
        String sql = "SELECT * FROM genero";
        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Genero(rs.getString("id_genero"), rs.getString("descricao")));
                
            }
        }
        return lista;
    }
}
