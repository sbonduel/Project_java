package project_Vue;

import java.awt.*;
import java.util.Date;

import javax.swing.*;

import project_Model.Compte.Adresse;


public class fenetre_principale extends JFrame {
    private JPanel inscription;
    private JTextField searchBar;
    private JButton rechercheButton, filtre, connectButton, s_incrire_Button, homeButton, paramètre;

    public fenetre_principale() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ma fenêtre principale");
        setPreferredSize(new Dimension(800, 500));

        // Initialisation du menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        connectButton = new JButton("Connexion");
        s_incrire_Button = new JButton("S'inscrire");
        homeButton = new JButton("Lien pour une maison PNJ à modifier");
        paramètre = new JButton("Lien pour un engrenage PNJ à modifier");

        // Ajout des éléments de menu dans le menu
        menu.add(connectButton);
        menu.add(s_incrire_Button);
        menu.add(homeButton);
        menu.add(paramètre);
        menuBar.add(menu);

        // Ajout de la barre de recherche et des boutons de recherche dans la région NORTH de la fenêtre principale
        JPanel recherchePanel = new JPanel(new BorderLayout());
        searchBar = new JTextField();
        
        //panelle bouton
        JPanel rechercheBoutonPanel = new JPanel(new BorderLayout());
        rechercheButton = new JButton("Image Loup");
        filtre = new JButton("Image Entonnoir");
        rechercheBoutonPanel.add(rechercheButton, BorderLayout.CENTER);
        rechercheBoutonPanel.add(filtre,  BorderLayout.WEST);
        
        
        recherchePanel.add(searchBar, BorderLayout.CENTER);
        recherchePanel.add(rechercheBoutonPanel, BorderLayout.EAST);;
        add(recherchePanel, BorderLayout.NORTH);

        // Initialisation du panel principal de la fenêtre s'incription
        inscription = new JPanel();
        
        //
        JPanel nomprenom = new JPanel();
        JLabel nom= new JLabel("nom :");
        JLabel prenom= new JLabel("prénom :");
        
        //
        JPanel age_sexe_email = new JPanel();
        JLabel age = new JLabel("âge :");
        JLabel sex= new JLabel("sex :");
        JLabel email= new JLabel("email :");
        
        JPanel hobbits = new JPanel();
        JLabel hobbit = new JLabel("hobbit :");

        JPanel image = new JPanel();
        JLabel idImage= new JLabel("nom de votre image :");
        
        JPanel orientation_sex_numTel = new JPanel();
        JLabel orentation_sexuelle= new JLabel("orentation sexuelle :");
        JLabel numTel = new JLabel("votre numéro des teléphone :");
        
        JPanel presentation_Commentaire = new JPanel();
        JLabel presentationCommentaire= new JLabel("vouler vous renseignez d'autre information qui vous semble important :");
        
        
        JPanel agepref = new JPanel();
        JLabel agepreference= new JLabel("age minimum et maximum :");
        JLabel agemin= new JLabel("age mini :");
        JLabel agemax= new JLabel("age maxi :");
        
        
        JPanel adresse = new JPanel();
        JLabel adresses = new JLabel("adresse :");
        JLabel Ville = new JLabel("Ville :");
        JLabel rue  = new JLabel("rue :");
        JLabel numrue  = new JLabel("numéro de rue :");
        JLabel codePostal = new JLabel("code postale :");
        JLabel region = new JLabel("région :");
        JLabel pays = new JLabel("pays :") ;
        

        
        JPanel aniv = new JPanel();
        JLabel naissance = new JLabel("née le :");
        JLabel jours = new JLabel("jours :");
        JLabel mois = new JLabel("mois  :");
        JLabel anees = new JLabel("anées :");
        
    // pack 
        inscription.add(nomprenom);
        nomprenom.add(nom);
        nomprenom.add(prenom);
        
        // panelle age_sexe_email
        inscription.add(age_sexe_email);
        age_sexe_email.add(age);
        age_sexe_email.add(sex);
        age_sexe_email.add(email);
        
        //  panelle image
        inscription.add(image);
        image.add(idImage);
        
        
        //  panelle orientation_sex_numTel
        inscription.add(orientation_sex_numTel);
        orientation_sex_numTel.add(orentation_sexuelle);
        orientation_sex_numTel.add(numTel);
        
 
        
        //  panelle presentation_Commentaire
        inscription.add(presentation_Commentaire);
        presentation_Commentaire.add(presentationCommentaire);
        

        //  panelle agepreference
        agepref.add(agepreference);
        agepref.add(agemin);
        agepref.add(agemax);
        inscription.add(agepref);

        // panelle adresse
        adresse.add(adresses);
        adresse.add(Ville);
        adresse.add(rue);
        adresse.add(numrue);
        adresse.add(codePostal);
        adresse.add(region);
        adresse.add(pays);
        inscription.add(adresse);
        
        // panelle aniv
        aniv.add(naissance);
        aniv.add(jours);
        aniv.add(mois);
        aniv.add(anees);
        inscription.add(aniv);
        
        
        // continue
        add(inscription, BorderLayout.CENTER);

        // Ajout de la barre de menu à la fenêtre principale
        setJMenuBar(menuBar);

        // Affichage de la fenêtre
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
    	fenetre_principale fenetre = new fenetre_principale();
    }
}


