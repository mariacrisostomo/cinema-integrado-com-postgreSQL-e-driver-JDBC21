/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineminha;

/**
 *
 * @author maria
 */
public class Filme {
    private int idFilme;
    private String titulo;
    private int anoProducao;
    private int duracao;
    private String idGenero;
    
    public Filme(String titulo, int anoProducao, int duracao, String idGenero) {
        this.titulo = titulo;
        this.anoProducao = anoProducao;
        this.duracao = duracao;
        this.idGenero = idGenero;
    }
    
    public Filme(int idFilme, String titulo, int anoProducao, int duracao, String idGenero) {
        this(titulo, anoProducao, duracao, idGenero);
        this.idFilme = idFilme;
    }
    
    
    public int getIdFilme() { 
        return idFilme; 
    }
    
    public String getTitulo() { 
        return titulo; 
    }
    
    public int getAnoProducao() { 
        return anoProducao; 
    }
    
    public int getDuracao() { 
        return duracao; 
    }
    
    public String getIdGenero() { 
        return idGenero; 
    }
    
}
