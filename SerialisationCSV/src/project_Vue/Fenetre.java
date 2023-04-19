package project_Vue;

import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {
    public Panel_recherche recherche;
    public ConnexionPanel connexion_panel;
    private Menu menu;
    private inscription s_incrire;

    public Fenetre() {
        super("Champo_Love");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrer la fenêtre sur l'écran

        recherche = new Panel_recherche();
        menu = new Menu();
        connexion_panel = new ConnexionPanel();
        s_incrire = new inscription();
        add(Box.createRigidArea(new Dimension(0, 510))); // Ajouter un espace rigide pour déplacer le panneau de connexion vers le centre
        
        //pack(); // Ajuster la taille de la fenêtre pour qu'elle s'adapte à son contenu
    }

    public static void main(String[] args) {
        Fenetre f = new Fenetre();
        f.setVisible(true);
    	int panel = 1;
        if (panel==0) {
    		f.add(f.connexion_panel, BorderLayout.CENTER);
    	}
        if (panel==1) {
        	f.setSize(1100, 600); 
        	f.add(f.recherche, BorderLayout.NORTH);
        	f.setJMenuBar(f.menu.getMenuBar());
            f.menu.getMenu().add(new JMenuItem("déconectez"));
            f.menu.getMenu().add(new JMenuItem("S'inscrire"));
        	f.add(f.s_incrire, BorderLayout.CENTER);
        }
        if (panel==2) {
        	f.setSize(1100, 600); 
        	f.add(f.recherche, BorderLayout.NORTH);
        	f.setJMenuBar(f.menu.getMenuBar());
            f.menu.getMenu().add(new JMenuItem("déconectez"));
            f.menu.getMenu().add(new JMenuItem("S'inscrire"));
            
        	f.add(f.s_incrire, BorderLayout.CENTER);
        }
    	
    	

    }
}