package project_controleur;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import project_Model.*;

public class fenetre_principale extends JFrame implements ActionListener {


	//CompteMenu 
	    private JTextField searchBar;
	    private JButton searchButton, connectButton, s_incrire_Button, homeButton;
	    
	    //panel s'indentifier 
	    private JLabel nomLabel, prenomLabel, hobbitLabel, anniversaireLabel, ageLabel, /*JLabel adresseLabel, */numTelLabel, emailLabel, sexeLabel, attiranceLabel, agePrefLabel, presentationLabel; 
	    private JLabel nom, prenom, hobbit, anniversaire, age, /*adresse,*/ numTel, email, sexe, attirance, ageMinPref, ageMaxPref,presentation; 

	    
	    public fenetre_principale() {
	        setTitle("Menu Compte");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        // Créer une barre de recherche et des boutons
	        searchBar = new JTextField(20);
	        searchButton = new JButton("Rechercher");
	        connectButton = new JButton("Se Connecter");
	        s_incrire_Button = new JButton("S'inscription"); 
	        homeButton = new JButton(new ImageIcon("maison.png"));
	        
	        // Ajouter des écouteurs d'événements aux boutons
	        searchButton.addActionListener(this);
	        connectButton.addActionListener(this);
	        s_incrire_Button.addActionListener(this);
	        homeButton.addActionListener(this);
	        
	        // Créer un menu avec les boutons de recherche, de connexion et de forme maison
	        JMenuBar menuBar = new JMenuBar();
	        JMenu menu = new JMenu("°*°_Menu_°*°");
	        menu.add(searchButton);
	        menu.add(connectButton);
	        menu.add(s_incrire_Button);
	        menu.add(homeButton);
	        menuBar.add(menu);
	        setJMenuBar(menuBar);
	        
	        // Ajouter la barre de recherche en haut de la fenêtre
	        JPanel topPanel = new JPanel(new BorderLayout());
	        topPanel.add(searchBar, BorderLayout.CENTER);
	        topPanel.add(searchButton, BorderLayout.EAST);
	        getContentPane().add(topPanel, BorderLayout.NORTH);
	        
	        //Ajouter la fnetre s'idenfier par défaut  dans la fenêtre
	        JPanel Panelprincipal = new JPanel(new BorderLayout());
	        
	        
	        setSize(500, 300);
	        setVisible(true);
	    }
	    
	    // Implémenter l'action lorsqu'un bouton est cliqué
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == searchButton) {
	            // Code pour effectuer la recherche
	        }
	        else if (e.getSource() == connectButton) {
	            // Code pour gérer la connexion
	        }
	        else if (e.getSource() == homeButton) {
	            //  Code pour gérer autre
	        }
	        else if (e.getSource()== s_incrire_Button) {
	        	

	            
	            Compte compte = new Compte();
	                nomLabel = new JLabel("Nom: ");
	                prenomLabel = new JLabel("Prénom: ");
	                hobbitLabel = new JLabel("Hobbit préféré: ");
	                anniversaireLabel = new JLabel("Anniversaire: ");
	                ageLabel = new JLabel("Âge: ");
	                //adresseLabel = new JLabel("Adresse: ");
	                numTelLabel = new JLabel("Numéro de téléphone: ");
	                emailLabel = new JLabel("Email: ");
	                sexeLabel = new JLabel("Sexe: ");
	                attiranceLabel = new JLabel("Attirance sexuelle: ");
	                agePrefLabel = new JLabel("Âge préférentiel: ");
	                presentationLabel = new JLabel("Présentation: ");

	                // création des JLabels avec les valeurs des attributs du compte
	                nom = new JLabel(compte.getNom());
	                prenom = new JLabel(compte.getPrenom());
	                hobbit = new JLabel(compte.getHobbit());
	                anniversaire = new JLabel(new SimpleDateFormat("dd/MM/yyyy").format(compte.getAnniversaire()));
	                age = new JLabel(Integer.toString(compte.getAge()));
	                //adresse = new JLabel(compte.getAdresseRue_Numero() + " " + compte.getAdressecodePostal() + " " + compte.getAdresseVile() + " " + compte.getAdresseregion() + " " + compte.getAdressepays());
	                numTel = new JLabel(compte.getNumTel());
	                email = new JLabel(compte.getEmail());
	                sexe = new JLabel(compte.getSexe());
	                attirance = new JLabel(compte.getAttiranceSexuelle());
	                ageMinPref = new JLabel(Integer.toString(compte.getAgeMinPref()));
	                ageMaxPref = new JLabel(Integer.toString(compte.getAgeMaxPref()));
	                presentation = new JLabel(compte.getPresentationCommentaire());

	                // création du JPanel principal
	                JPanel pane = new JPanel(new GridBagLayout());
	                getContentPane().add(pane);
	                pane.add(nom);
	                pane.add(prenom);
	                pane.add(hobbit);
	                pane.add(anniversaire);
	                pane.add(age);
	                //pane.add(adresse);
	                pane.add(numTel);
	                pane.add(email);
	                pane.add(sexe);
	                pane.add(attirance);
	                pane.add(ageMinPref);
	                pane.add(ageMaxPref);
	                pane.add(presentation);
	                
	                
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	    	GestionCompte Basse_des_comptes = new GestionCompte();
	    	
	    	Compte compte = new Compte();

	    	// Adresse(String ville, String rueNumero, int codePostal, String region, String pays)
	    		Compte.Adresse a1 = compte.new Adresse("Paris", "1 rue de la Paix", 75008, "Île-de-France", "France");
	    		Compte compte1 = new Compte("Doe", "John", "Jouer de la guitare", "default1.png", new Date(2000, 1, 1), 23, 
	    	        a1,
	    	        "0601020304", "john.doe@gmail.com", "Homme", "Femme", 20, 30, "Salut, je suis John !");

	    		Compte.Adresse a2 = compte.new Adresse("Lyon", "12 rue du Rhône", 69002, "Auvergne-Rhône-Alpes", "France");
	    	    Compte compte2 = new Compte("Doe", "Jane", "Lecture", "default2.png", new Date(2002, 5, 15), 20, 
	    	        a2, 
	    	        "0602030405", "jane.doe@gmail.com", "Femme", "Homme", 18, 25, "Bonjour, je m'appelle Jane !");

	    	    Compte.Adresse a3 = compte.new Adresse("New York", "5th Avenue", 10001, "New York", "USA");
	    	    Compte compte3 = new Compte("Smith", "Tom", "Voyage", "default3.png", new Date(1998, 11, 30), 24, 
	    	       a3, 
	    	        "2125550123", "tom.smith@gmail.com", "Homme", "Femme", 22, 30, "Hi, I'm Tom !");
	    	    

	    	/*
	    	Compte compte1 = new Compte("Doe", "John", "Jouer de la guitare", "default1.png", new Date(2000, 1, 1), 23, 
	    			null,
	    			"0601020304", "john.doe@gmail.com", "Homme", "Femme", 20, 30, "Salut, je suis John !");
	    	compte1.setAdresse("Paris", "1 rue de la Paix",75008,"Île-de-France", "France");

	    		Compte compte2 = new Compte("Doe", "Jane", "Lecture", "default2.png", new Date(2002, 5, 15), 20, 
	    		    null, 
	    		    "0602030405", "jane.doe@gmail.com", "Femme", "Homme", 18, 25, "Bonjour, je m'appelle Jane !");
	    		compte2.setAdresse("Lyon", "12 rue du Rhône", 69002, "Auvergne-Rhône-Alpes", "France");

	    		Compte compte3 = new Compte("Smith", "Tom", "Voyage", "default3.png", new Date(1998, 11, 30), 24, 
	    		    null, 
	    		    "2125550123", "tom.smith@gmail.com", "Homme", "Femme", 22, 30, "Hi, I'm Tom !");
	    		compte3.setAdresse("New York", "5th Avenue", 10001, "New York", "USA");
	    		
	    		*/
	    		
	    		Basse_des_comptes.ajouterCompte(compte1); 
	    		Basse_des_comptes.ajouterCompte(compte2); 
	    		Basse_des_comptes.ajouterCompte(compte3);
	    		 
	        new fenetre_principale();
	    }
	}