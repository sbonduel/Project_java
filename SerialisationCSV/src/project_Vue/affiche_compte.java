package project_Vue;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;

public class affiche_compte extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    public JScrollPane scrollPane;

        public affiche_compte(GestionCompte gestionCompte) {
            JPanel panel_compte = new JPanel(new GridLayout(0, 1));

            for (Compte compte : gestionCompte.get_comptes()) {
                String imagePString = compte.getIdImage();
                affiche_compte imagePanel = new affiche_compte(gestionCompte);
                imagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel_compte.add(imagePanel);
        }
        scrollPane = new JScrollPane(panel_compte);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        add(scrollPane, BorderLayout.CENTER);
        setPreferredSize(new Dimension(500, 500)); // Définir la taille préférée du panneau de connexion
    
   
    }

}
/*

public class ConnexionPanel extends JPanel {
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public ConnexionPanel() {
        setLayout(new BorderLayout()); // Utiliser un BorderLayout pour ce panneau
        JPanel connexionPanel = new JPanel(new GridLayout(0, 1)); // Utiliser un GridLayout pour le panneau de connexion
        usernameLabel = new JLabel("Nom d'utilisateur:");
        connexionPanel.add(usernameLabel);
        usernameField = new JTextField();
        connexionPanel.add(usernameField);
        passwordLabel = new JLabel("Mot de passe:");
        connexionPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        connexionPanel.add(passwordField);
        loginButton = new JButton("Se connecter");
        connexionPanel.add(loginButton);
        add(connexionPanel, BorderLayout.CENTER); // Ajouter le panneau de connexion au centre du panneau principal
        
        setPreferredSize(new Dimension(500, 500)); // Définir la taille préférée du panneau de connexion
    }
}
*/
