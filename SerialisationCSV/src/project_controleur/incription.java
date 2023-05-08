package project_controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JTextField;

import project_Vue.Fenetre;
import project_Vue.inscription;



import project_Vue.ConnexionPanel;
import project_Vue.Fenetre;
import project_Vue.Menu;
import project_Vue.Panel_recherche;
import project_Vue.affiche_compte;
import project_Vue.inscription;

import java.awt.BorderLayout;

import javax.swing.JMenuItem;

import project_Model.Compte;
import project_Model.GestionCompte;

public class incription {
    private GestionCompte gestionCompte;
    private Fenetre f;
    public Compte compte_nouveau;
    

    
    public incription(GestionCompte gestionCompte, Fenetre f) {
        this.gestionCompte = gestionCompte;
        this.f=f;
        this.compte_nouveau = new Compte();;

        
        f.s_incrire.getconfirButton().addActionListener(e -> conextion_inscription(gestionCompte));
    }
    
    public Compte conextion_inscription(GestionCompte gestionCompte) {
    	String prenom = f.s_incrire.getprenomText().getText();
    	String nom = f.s_incrire.getNomText().getText();
    	
        String username = f.s_incrire.getusername().getText();
        String password = new String(f.s_incrire.getpassword().getPassword());
        int age = (int) f.s_incrire.getAgeSpinner().getValue();
        String sex = (String) f.s_incrire.getSexComboBox().getSelectedItem();
        String email = f.s_incrire.getEmailText().getText();
        String hobbit = (String) f.s_incrire.getHobbitComboBox().getSelectedItem();
        String Image = f.s_incrire.getIdImageText().getText();
        String idImage = "img/"+ Image;
        String orientationSexuelle = (String) f.s_incrire.getOrientationSexuelleComboBox().getSelectedItem();
        String numTel = f.s_incrire.getNumTelText().getText();
        String presentationCommentaire = f.s_incrire.getPresentationCommentaireText().getText();
        int ageMin = (int) f.s_incrire.getAgeMinSpinner().getValue();
        int ageMax = (int) f.s_incrire.getAgeMaxSpinner().getValue();
        String ville = f.s_incrire.getVilleText().getText();
        String rue = f.s_incrire.getRueText().getText();
        int numRue = (int) f.s_incrire.getNumRueSpinner().getValue();
        String codePostal = f.s_incrire.getCodePostalText().getText();
        String region = f.s_incrire.getRegionText().getText();
        String pays = f.s_incrire.getPaysText().getText();
        int jours = (int) f.s_incrire.getJoursSpinner().getValue();
        int mois = (int) f.s_incrire.getMoisSpinner().getValue();
        int annees = (int) f.s_incrire.getAnneesSpinner().getValue();
        Compte compte_nom =  gestionCompte.rechercherUser(username);
        

        	if (age>=18 && isEmailValid(email) && sex!=null && orientationSexuelle!=null && prenom!="" && nom!="" && pays!=""&& region!=""&& codePostal!=""&& rue!=""&& ville!=""&& numTel!=""&& (gestionCompte.rechercherUser(username)==(null))  )  {
        		System.out.println("| ok |");
        		
        		compte_nouveau.setNom(nom);
        		compte_nouveau.setPrenom(prenom);
                compte_nouveau.setAge(age);
                compte_nouveau.setAdresse(ville, "rue " + numRue + rue, codePostal, region, pays);
                compte_nouveau.setIdImage(idImage); // Ajout de l'attribut idImage
                compte_nouveau.setAnniversaire(LocalDate.of(annees, mois, jours)); // Ajout de l'attribut anniversaire
                compte_nouveau.setNumTel(numTel); // Ajout de l'attribut numTel
                compte_nouveau.setEmail(email); // Ajout de l'attribut email
                compte_nouveau.setSexe(sex); // Ajout de l'attribut sexe
                compte_nouveau.setAttiranceSexuelle(orientationSexuelle); // Ajout de l'attribut attiranceSexuelle
                compte_nouveau.setageMinPref(ageMin); // Ajout de l'attribut ageMinPref
                compte_nouveau.setageMaxPref(ageMax); // Ajout de l'attribut ageMaxPref
                compte_nouveau.setpresentationCommentaire(presentationCommentaire); // Ajout de l'attribut presentationCommentaire
                compte_nouveau.setUser(username); // Ajout de l'attribut user
                compte_nouveau.setmots_de_passe(password); // Ajout de l'attribut mots_de_passe
                
                gestionCompte.ajouterCompte(compte_nouveau);
                f.affiche_compte = new affiche_compte(gestionCompte);
                
        		f.remove(f.connexion_panel);
        		f.remove(f.menu.getMenu());
        		f.remove(f.affiche_compte);
        		f.remove(f.recherche);
        		f.remove(f.s_incrire);
        		
        	    
            	f.setSize(1100, 610); 
            	f.add(f.recherche, BorderLayout.NORTH);
            	f.setJMenuBar(f.menu.getMenuBar());
                f.menu.getMenu().add(new JMenuItem("déconectez"));
                f.menu.getMenu().add(new JMenuItem("home"));
            	f.add(f.affiche_compte, BorderLayout.CENTER);
            	
            }
       
        	return compte_nom;
        
    }
    
    
	public static boolean isEmailValid(String email) {
	    // Expression régulière pour vérifier si un email est valide
	    String emailRegex = "^[\\w\\.-]+@[\\w\\.-]+\\.[a-z]{2,}$";

	    // Vérifier si l'email correspond à l'expression régulière
	    return email.matches(emailRegex);
	}

	
/*
	        if (isEmailValid(email)) {
	            // Le contenu du JTextField est un email valide
	        } else {
	            // Le contenu du JTextField n'est pas un email valide
	        }*/
	    

    
}



	
	



