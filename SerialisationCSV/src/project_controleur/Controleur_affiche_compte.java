package project_controleur;

import java.awt.BorderLayout;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JMenuItem;



import project_Model.Compte;
import project_Model.GestionCompte;
import project_Vue.Fenetre;
import project_Vue.affiche_compte;

public class Controleur_affiche_compte {
	    private GestionCompte gestionCompte;
	    private Fenetre f;
	    private Stack<JButton> a;
	    

	    
	    public Controleur_affiche_compte(GestionCompte gestionCompte, Fenetre f) {
	        this.gestionCompte = gestionCompte;
	        this.f=f;
	        this.a =f.affiche_compte.get_all_buton();
	        f.affiche_compte.getRencontre().addActionListener(e -> rancontre_compte(gestionCompte));
	        f.affiche_compte.getModifier().addActionListener(e -> modifier_compte(gestionCompte));
	        f.affiche_compte.getMatchemaiking().addActionListener(e -> matche_making(gestionCompte));
	    }
	    

	        
	        
	    
	    
	    public void rancontre_compte(GestionCompte gestionCompte) {
	        String username = f.connexion_panel.getusername().getText();
	        String password = new String(f.connexion_panel.getpassword().getPassword());
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
	                System.out.println("compte");
	            	f.add(f.affiche_compte, BorderLayout.CENTER);
	        	}
	        }

	     }
		    public void modifier_compte(GestionCompte gestionCompte) {
		        String username = f.connexion_panel.getusername().getText();
		        String password = new String(f.connexion_panel.getpassword().getPassword());
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
		    }
			    public void matche_making(GestionCompte gestionCompte) {
			        String username = f.connexion_panel.getusername().getText();
			        String password = new String(f.connexion_panel.getpassword().getPassword());
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
			    }

	        
	        
	        
	        
	    }
	