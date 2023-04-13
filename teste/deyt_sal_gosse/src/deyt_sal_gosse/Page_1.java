package deyt_sal_gosse;


import java.awt.*;
import javax.swing.*;

public class Page_1 extends JPanel {
    private JLabel lblTitre, lblNom, lblPrenom, lblAge, lblAdresse, lblEmail, lblTelephone;
    private JLabel lblNomValue, lblPrenomValue, lblAgeValue, lblAdresseValue, lblEmailValue, lblTelephoneValue;
    private Image imgBackground;

    public Page_1() {
        // chargement de l'image de fond
        ImageIcon iconBackground = new ImageIcon("background.jpg");
        imgBackground = iconBackground.getImage();
        
        
        
        // création des composants de la page
        lblTitre = new JLabel("Informations du compte");
        lblTitre.setHorizontalAlignment(JLabel.CENTER);
        lblNom = new JLabel("Nom:");
        lblPrenom = new JLabel("Prénom:");
        lblAge = new JLabel("Âge:");
        lblAdresse = new JLabel("Adresse:");
        lblEmail = new JLabel("E-mail:");
        lblTelephone = new JLabel("Téléphone:");
        
        //exemple mais je ne peut travaille car coruption 
        lblNomValue = new JLabel("Doe");
        lblPrenomValue = new JLabel("John");
        lblAgeValue = new JLabel("30");
        lblAdresseValue = new JLabel("123, rue Principale");
        lblEmailValue = new JLabel("john.doe@example.com");
        lblTelephoneValue = new JLabel("555-1234");

        // création du panneau principal avec un GridLayout
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(lblTitre);
        panel.add(new JLabel());
        panel.add(lblNom);
        panel.add(lblNomValue);
        panel.add(lblPrenom);
        panel.add(lblPrenomValue);
        panel.add(lblAge);
        panel.add(lblAgeValue);
        panel.add(lblAdresse);
        panel.add(lblAdresseValue);
        panel.add(lblEmail);
        panel.add(lblEmailValue);
        panel.add(lblTelephone);
        panel.add(lblTelephoneValue);

        // ajout du panneau principal au panneau "page_1"
        this.add(panel);
        
    }
        // surcharge de la méthode paintComponent pour dessiner l'image de fond
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imgBackground, 0, 0, getWidth(), getHeight(), this);
        }
    
    }


