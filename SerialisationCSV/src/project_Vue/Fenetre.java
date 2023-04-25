package project_Vue;

import java.awt.*;
import javax.swing.*;
import project_Model.*;
import project_controleur.*;

import java.time.LocalDate;


public class Fenetre extends JFrame {
    public Panel_recherche recherche;
    public ConnexionPanel connexion_panel;
    public affiche_compte affiche_compte;
    
    public  Menu menu;
    public inscription s_incrire;
    /*
    package project_Vue;

    import java.awt.BorderLayout;
    import java.awt.Dimension;

    import javax.swing.JFrame;
    import javax.swing.JPanel;

    import project_Model.GestionCompte;

    public class Fenetre extends JFrame {
        private static final long serialVersionUID = 1L;
        private GestionCompte gestionCompte;
        private affiche_compte afficheCompte;
        private ConnexionPanel connexionPanel;

        public Fenetre(GestionCompte gestionCompte) {
            this.gestionCompte = gestionCompte;
            this.afficheCompte = new affiche_compte(gestionCompte);
            this.connexionPanel = new ConnexionPanel();

            // Ecouter les événements de connexion
            connexionPanel.addConnexionListener((nom, prenom, age) -> {
                // Ajouter un compte à la gestion des comptes
                gestionCompte.add_compte(nom, prenom, age, "default.jpg");

                // Mettre à jour l'affichage des comptes
                getContentPane().removeAll();
                afficheCompte = new affiche_compte(gestionCompte);
                getContentPane().add(afficheCompte, BorderLayout.CENTER);
                getContentPane().revalidate();
                getContentPane().repaint();
            });

            // Ajouter les composants à la fenêtre
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(connexionPanel, BorderLayout.NORTH);
            panel.add(afficheCompte, BorderLayout.CENTER);
            getContentPane().add(panel);

            // Configurer la fenêtre
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Gestion des comptes");
            setPreferredSize(new Dimension(1200, 800));
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    */

    public Fenetre(GestionCompte gestionCompte) {
    	
        super("Champo_Love");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrer la fenêtre sur l'écran

        recherche = new Panel_recherche();
        menu = new Menu();
        connexion_panel = new ConnexionPanel();
        s_incrire = new inscription();
        affiche_compte = new affiche_compte(gestionCompte);
        add(Box.createRigidArea(new Dimension(0, 510))); // Ajouter un espace rigide pour déplacer le panneau de connexion vers le centre
        
        //pack(); // Ajuster la taille de la fenêtre pour qu'elle s'adapte à son contenu

        
    }
    

    public static void main(String[] args) {
    	
    	GestionCompte gestionCompte = new GestionCompte();
    	int panel = 0;
        // Créer un compte 1
        Compte compte1 = new Compte();
        compte1.setNom("Dupont");
        compte1.setPrenom("Pierre");
        compte1.setAge(25);
        compte1.setAdresse("Paris", "rue du Faubourg Saint-Honoré", "75008", "Ile-de-France", "France");
        compte1.setIdImage("img/1.jpg"); // Ajout de l'attribut idImage
        compte1.setAnniversaire(LocalDate.of(1998, 5, 12)); // Ajout de l'attribut anniversaire
        compte1.setNumTel("0123456789"); // Ajout de l'attribut numTel
        compte1.setEmail("pierre.dupont@email.com"); // Ajout de l'attribut email
        compte1.setSexe("homme"); // Ajout de l'attribut sexe
        compte1.setAttiranceSexuelle("femme"); // Ajout de l'attribut attiranceSexuelle
        compte1.setageMinPref(20); // Ajout de l'attribut ageMinPref
        compte1.setageMaxPref(30); // Ajout de l'attribut ageMaxPref
        compte1.setpresentationCommentaire("Bonjour, je suis Pierre, un jeune Parisien qui aime les voyages et la gastronomie."); // Ajout de l'attribut presentationCommentaire
        compte1.setUser("User1"); // Ajout de l'attribut user
        compte1.setmots_de_passe("mdp1"); // Ajout de l'attribut mots_de_passe

        // Créer un compte 2
        Compte compte2 = new Compte();
        compte2.setNom("Lefebvre");
        compte2.setPrenom("Sophie");
        compte2.setAge(28);
        compte2.setAdresse("Lille", "rue Nationale", "59000", "Hauts-de-France", "France");
        compte2.setIdImage("img/5.jpg");
        compte2.setAnniversaire(LocalDate.of(1995, 9, 2));
        compte2.setNumTel("0678901234");
        compte2.setEmail("sophie.lefebvre@email.com");
        compte2.setSexe("femme");
        compte2.setAttiranceSexuelle("homme");
        compte2.setageMinPref(25);
        compte2.setageMaxPref(35);
        compte2.setpresentationCommentaire("Bonjour, je m'appelle Sophie et je suis une passionnée de musique et de danse. J'adore également découvrir de nouvelles cultures en voyageant.");
        compte2.setUser("1"); // Ajout de l'attribut user
        compte2.setmots_de_passe("2"); // Ajout de l'attribut mots_de_passe

        // Créer un compte 3
        Compte compte3 = new Compte();
        compte3.setNom("Leroy");
        compte3.setPrenom("Camille");
        compte3.setAge(24);
        compte3.setAdresse("Nantes", "rue de la Paix", "44000", "Pays de la Loire", "France");
        compte3.setIdImage("img/23.jpg");
        compte3.setAnniversaire(LocalDate.of(1999, 3, 21));
        compte3.setNumTel("0689123456");
        compte3.setEmail("camille.leroy@email.com");
        compte3.setSexe("femme");
        compte3.setAttiranceSexuelle("femme");
        compte3.setageMinPref(22);
        compte3.setageMaxPref(30);
        compte3.setpresentationCommentaire("Coucou, je m'appelle Camille et je suis étudiante en art à Nantes. J'adore la peinture et la photographie, et je recherche une personne avec qui partager ma passion pour l'art.");
        compte3.setUser("User3"); // Ajout de l'attribut user
        compte3.setmots_de_passe("mdp3"); // Ajout de l'attribut mots_de_passe
        
        // Créer un compte 4
        Compte compte4 = new Compte();
        compte4.setNom("Martin");
        compte4.setPrenom("Antoine");
        compte4.setAge(32);
        compte4.setAdresse("Toulouse", "avenue Jean Chaubet", "31000", "Occitanie", "France");
        compte4.setIdImage("img/12.jpg");
        compte4.setAnniversaire(LocalDate.of(1989, 12, 8));
        compte4.setNumTel("0645678901");
        compte4.setEmail("antoine.martin@email.com");
        compte4.setSexe("homme");
        compte4.setAttiranceSexuelle("homme");
        compte4.setageMinPref(28);
        compte4.setageMaxPref(40);
        compte4.setpresentationCommentaire("Salut, je suis Antoine, un Toulousain fan de rugby et de randonnées en montagne. Je cherche quelqu'un avec qui partager ces passions.");
        compte4.setUser("User4"); // Ajout de l'attribut user
        compte4.setmots_de_passe("mdp4"); // Ajout de l'attribut mots_de_passe
        
        // Créer un compte 6
        Compte compte6 = new Compte();
        compte6.setNom("Bouchard");
        compte6.setPrenom("Julie");
        compte6.setAge(28);
        compte6.setAdresse("Montreal", "rue Sainte-Catherine", "H3G 1M8", "Quebec", "Canada");
        compte6.setIdImage("img/6.jpg");
        compte6.setAnniversaire(LocalDate.of(1995, 9, 8));
        compte6.setNumTel("+1 514-123-4567");
        compte6.setEmail("julie.bouchard@email.com");
        compte6.setSexe("femme");
        compte6.setAttiranceSexuelle("homme");
        compte6.setageMinPref(25);
        compte6.setageMaxPref(35);
        compte6.setpresentationCommentaire("Bonjour, je m'appelle Julie et j'aime les activités de plein air, la musique et les voyages. Je suis à la recherche de quelqu'un avec qui partager de bons moments.");
        compte6.setUser("User6"); // Ajout de l'attribut user
        compte6.setmots_de_passe("mdp6"); // Ajout de l'attribut mots_de_passe
        
        // Créer un compte 7
        Compte compte7 = new Compte();
        compte7.setNom("Nguyen");
        compte7.setPrenom("Trung");
        compte7.setAge(31);
        compte7.setAdresse("Ho Chi Minh", "rue Nguyen Hue", "700000", "Sud", "Vietnam");
        compte7.setIdImage("img/11.jpg");
        compte7.setAnniversaire(LocalDate.of(1992, 11, 18));
        compte7.setNumTel("+84 123-456-789");
        compte7.setEmail("trung.nguyen@email.com");
        compte7.setSexe("homme");
        compte7.setAttiranceSexuelle("homme");
        compte7.setageMinPref(25);
        compte7.setageMaxPref(40);
        compte7.setpresentationCommentaire("Bonjour, je suis Trung et je suis passionné de cuisine et de sport. Je cherche à rencontrer des personnes partageant les mêmes centres d'intérêt.");
        compte7.setUser("User7"); // Ajout de l'attribut user
        compte7.setmots_de_passe("mdp7"); // Ajout de l'attribut mots_de_passe

        // Créer un compte 8
        Compte compte8 = new Compte();
        compte8.setNom("Smith");
        compte8.setPrenom("Emma");
        compte8.setAge(26);
        compte8.setAdresse("London", "Oxford Street", "W1D 2DW", "Greater London", "United Kingdom");

        compte8.setIdImage("img/6.png");
        compte8.setAnniversaire(LocalDate.of(1997, 4, 25));
        compte8.setNumTel("+44 20 1234 5678");
        compte8.setEmail("emma.smith@email.com");
        compte8.setSexe("femme");
        compte8.setAttiranceSexuelle("femme");
        compte8.setageMinPref(20);
        compte8.setageMaxPref(30);
        compte8.setpresentationCommentaire("Hello, I'm Emma and I love to travel, read and dance. Looking for someone to share some fun experiences with!");
        compte8.setUser("User8"); // Ajout de l'attribut user
        compte8.setmots_de_passe("mdp8"); // Ajout de l'attribut mots_de_passe


        // Ajouter les comptes à la liste de gestion de comptes
        gestionCompte.ajouterCompte(compte1);
        gestionCompte.ajouterCompte(compte2);
        gestionCompte.ajouterCompte(compte3);
        gestionCompte.ajouterCompte(compte4);

        gestionCompte.ajouterCompte(compte6);
        gestionCompte.ajouterCompte(compte7);
        gestionCompte.ajouterCompte(compte8);
        
        
        Fenetre f = new Fenetre(gestionCompte);
        conextion c = new conextion(gestionCompte,  f) ;
        incription i = new incription(gestionCompte,  f);
        
        
        f.setVisible(true);
    	
    	
        

        
        f.add(f.connexion_panel, BorderLayout.CENTER);
        if (panel==1) {
        	f.setSize(1100, 600); 
        	f.setJMenuBar(f.menu.getMenuBar());
            f.menu.getMenu().add(new JMenuItem("conextion"));
        	f.add(f.s_incrire, BorderLayout.CENTER);
        	
        }
        if (panel==2) {
        	f.setSize(1100, 610); 
        	f.add(f.recherche, BorderLayout.NORTH);
        	f.setJMenuBar(f.menu.getMenuBar());
            f.menu.getMenu().add(new JMenuItem("déconectez"));
            f.menu.getMenu().add(new JMenuItem("home"));
            
        	f.add(f.affiche_compte, BorderLayout.CENTER);
        }
    	
    	

    }

}