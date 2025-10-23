

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author maria
 */



package cineminha;

import java.sql.SQLException;



import javax.swing.*;

public class Cineminha {

    public static void main(String[] args) {
        // Executa a interface gráfica na Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Caixa de diálogo com duas opções
            String[] opcoes = {"Cadastrar Filmes", "Cadastrar Gêneros"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a tela que deseja abrir:",
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            // Abre a tela escolhida
            if (escolha == 0) {
                FilmeView filmeView = new FilmeView();
                filmeView.setVisible(true);
            } else if (escolha == 1) {
                GeneroView generoView = new GeneroView();
                generoView.setVisible(true);
            } else {
                System.exit(0); // fecha se o usuário cancelar
            }
        });
    }
}
