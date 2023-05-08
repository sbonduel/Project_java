package project_controleur;

import java.awt.BorderLayout;
import java.awt.Button;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JMenuItem;



import project_Model.Compte;
import project_Model.GestionCompte;
import project_Vue.Fenetre;
import project_Vue.affiche_compte;

public class Controleur_affiche_compte {
	    private Compte gestionCompte;
	    private Fenetre f;
	    private Stack<JButton> a;
	    private JButton rencontre, modifier;
	    

	    
	    public Controleur_affiche_compte(Compte gestionCompte, Fenetre f, JButton rencontre2, JButton modifier2) {
	        this.gestionCompte = gestionCompte;
	        this.f=f;
	        this.rencontre=rencontre2;
	        this.modifier=modifier2;
	        
	        rencontre2.addActionListener(e -> rancontre_compte(gestionCompte));
	        modifier2.addActionListener(e -> modifier_compte(gestionCompte));
	    }
	    

	        
	        
	    
	    
	    public void rancontre_compte(Compte gestionCompte2) {
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
		    public void modifier_compte(Compte gestionCompte) {
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
	