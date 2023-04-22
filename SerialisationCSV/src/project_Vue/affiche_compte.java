package project_Vue;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
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
        JPanel panel_comptes = new JPanel(new GridLayout(0, 3, 10, 10));
        scrollPane = new JScrollPane(panel_comptes);
        

        for (Compte compte : gestionCompte.get_comptes()) {
            JPanel panel_compte = new JPanel(new BorderLayout(10, 10));
            // Charger l'image à partir d'un fichier
            
            try {
                image = ImageIO.read(new File(compte.getIdImage()));
            } catch (IOException e) {
                e.printStackTrace();
            } 

            // Créer un objet JLabel pour afficher l'image
            ImageIcon icon = new ImageIcon(image.getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
            JLabel label_image = new JLabel(icon, JLabel.CENTER);
            panel_compte.add(label_image, BorderLayout.NORTH);

            JPanel panel_info = new JPanel(new GridLayout(0, 1, 5, 5));
            JLabel nom_compte = new JLabel("Nom : " + compte.getNom());
            JLabel prenom_compte = new JLabel("Prénom : " + compte.getPrenom());
            JLabel age_compte = new JLabel("Age : " + compte.getAge());
            panel_info.add(nom_compte);
            panel_info.add(prenom_compte);
            panel_info.add(age_compte);
            panel_compte.add(panel_info, BorderLayout.CENTER);

            panel_compte.setBorder(BorderFactory.createEtchedBorder());
            panel_comptes.add(panel_compte);
        }

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(1050, 500));

        add(scrollPane, BorderLayout.CENTER);
        setPreferredSize(new Dimension(500, 500));
    }

}


/*
public class affiche_compte extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    public JScrollPane scrollPane;

        public affiche_compte(GestionCompte gestionCompte) {
            JPanel panel_compte = new JPanel(new GridLayout(10, 3));
            scrollPane = new JScrollPane(panel_compte);

            for (Compte compte : gestionCompte.get_comptes()) {
            	System.out.println(compte.getIdImage());
            	JPanel panel_image = new JPanel(new GridLayout(1, 1));
            	// Charger l'image à partir d'un fichier
                ImageIcon icon = new ImageIcon(compte.getIdImage());
                
                

                // Créer un objet JLabel pour afficher l'image
                JLabel label = new JLabel(icon);
                panel_image.add(label);
                
                
                JLabel nom_compte = new JLabel(compte.getNom());
                JLabel prenom_compte = new JLabel(compte.getPrenom());
                //JLabel useur_compte = new JLabel();
                JLabel age_compte = new JLabel(compte.getAge()+"");
                panel_compte.add(nom_compte);
                panel_compte.add(prenom_compte);
                panel_compte.add(age_compte);
                //panel_compte.add(useur_compte);
                
                panel_compte.add(panel_image);
                panel_image.setPreferredSize(new Dimension(10, 500));
        }
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(1050, 500));
        
        add(scrollPane, BorderLayout.CENTER);
        //add(panel_compte, BorderLayout.CENTER);
        setPreferredSize(new Dimension(500, 500)); // Définir la taille préférée du panneau de connexion
    
   
    }

} */














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
