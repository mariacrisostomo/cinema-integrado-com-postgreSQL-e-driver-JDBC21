/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineminha;

/**
 *
 * @author maria
 */
public class Genero {
    private String idGenero;
    private String descricao;
    
    public Genero(String idGenero, String descricao){
        this.idGenero = idGenero;
        this.descricao = descricao;
    }
    
    public String getIdGenero() {
        return idGenero;
}

    public String getDescricao() {
        return descricao;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
    
