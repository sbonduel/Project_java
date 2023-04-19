package project_Vue;

import java.awt.*;
import javax.swing.*;

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
