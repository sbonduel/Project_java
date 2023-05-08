package project_controleur;



import project_Vue.ConnexionPanel;
import project_Vue.Fenetre;
import project_Vue.Menu;
import project_Vue.Panel_recherche;
import project_Vue.affiche_compte;
import project_Vue.inscription;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import project_Model.Compte;
import project_Model.GestionCompte;

public class conextion {
    private GestionCompte gestionCompte;
	private Fenetre f;
	private Compte compte_nom;


    
    public conextion(GestionCompte gestionCompte, Fenetre f) {
        this.gestionCompte = gestionCompte;
        this.f=f;

        
        f.connexion_panel.getLoginButton().addActionListener(e -> handleLogin(gestionCompte));
        f.connexion_panel.getSigninButton().addActionListener(e -> handleSignin(gestionCompte));
    }
    
    public Compte handleLogin(GestionCompte gestionCompte) {
        String username = f.connexion_panel.getusername().getText();
        String password = new String(f.connexion_panel.getpassword().getPassword());
        compte_nom =  gestionCompte.rechercherUser(username);
        for (Compte compte : gestionCompte.get_comptes()) {
        	if (username.equals(compte.getUser()) && password.equals(compte.getmots_de_passe())) {
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
        	

        }
        return compte_nom;
        
        
        
    }
    
    public void handleSignin(GestionCompte gestionCompte) {
        // Ouvrir la vue d'inscription correspondante
		f.remove(f.connexion_panel);
		f.remove(f.menu.getMenu());
		f.remove(f.affiche_compte);
		f.remove(f.recherche);
		f.remove(f.s_incrire);

    	f.setSize(1100, 600); 
    	f.setJMenuBar(f.menu.getMenuBar());
        f.menu.getMenu().add(new JMenuItem("conextion"));
    	f.add(f.s_incrire, BorderLayout.CENTER);
    	
    }
    public Compte getcompte() {
    	return compte_nom;
    }
}


