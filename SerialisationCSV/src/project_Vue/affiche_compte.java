package project_Vue;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;

public class affiche_compte extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    public JScrollPane scrollPane;
    public JButton rencontre;
    public JButton matchemaiking;
    public JButton modifier;
    public Fenetre f;

    public affiche_compte(GestionCompte gestionCompte) {
        JPanel panel_comptes = new JPanel(new GridLayout(0, 3, 10, 10));
        scrollPane = new JScrollPane(panel_comptes);

        for (Compte compte : gestionCompte.get_comptes()) {
            JPanel panel_compte = new JPanel(new BorderLayout(10, 10));

            try {
                image = ImageIO.read(new File(compte.getIdImage()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            ImageIcon icon = new ImageIcon(image.getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
            JLabel label_image = new JLabel(icon, JLabel.CENTER);
            panel_compte.add(label_image, BorderLayout.NORTH);

            JPanel panel_info = new JPanel(new GridLayout(0, 1, 5, 5));
            JLabel nom_compte = new JLabel("Nom : " + compte.getNom());
            JLabel prenom_compte = new JLabel("Prénom : " + compte.getPrenom());
            JLabel age_compte = new JLabel("Age : " + compte.getAge());
            JButton rencontre = new JButton("rencontre");
            JButton matchemaiking = new JButton("matchemaiking");
            JButton modifier = new JButton("modifier");

            panel_info.add(rencontre);
            panel_info.add(matchemaiking);
            panel_info.add(modifier);
            panel_info.add(nom_compte);
            panel_info.add(prenom_compte);
            panel_info.add(age_compte);
            panel_compte.add(panel_info, BorderLayout.CENTER);

            panel_compte.setBorder(BorderFactory.createEtchedBorder());
            panel_comptes.add(panel_compte);

            // Ajouter un ActionListener à chaque bouton
            rencontre.addActionListener(e -> {
                // Code à exécuter lors du clic sur le bouton "rencontre"
                // ...
            });

            matchemaiking.addActionListener(e -> {
                // Code à exécuter lors du clic sur le bouton "matchemaiking"
                // ...
            });

            modifier.addActionListener(e -> {
                // Code à exécuter lors du clic sur le bouton "modifier"
                // ...
            });
        }

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(1050, 500));

        add(scrollPane, BorderLayout.CENTER);
        setPreferredSize(new Dimension(500, 500));
    }

    public JButton getRencontre() {
        return rencontre;
    }

    public JButton getMatchemaiking() {
        return matchemaiking;
    }

    public JButton getModifier() {
        return modifier;
    }

}


/*
 * import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;

public class affiche_compte extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    public JScrollPane scrollPane;
    public Stack <JButton> bouton= new Stack<JButton>();

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
            JButton rencontre = new JButton("rencontre");
            JButton matchemaiking = new JButton("matchemaiking");
            JButton modifier = new JButton("modifier");
            //freq.

            // Ajouter un listener à chaque bouton
            rencontre.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Bouton rencontre cliqué pour le compte : " + compte.getId());
                }
            });

            matchemaiking.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Bouton matchemaiking cliqué pour le compte : " + compte.getId());
                }
            });

            modifier.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Bouton modifier cliqué pour le compte : " + compte.getId());
                }
            });

            bouton.push(rencontre);
            bouton.push(matchemaiking);
            bouton.push(modifier);

            panel_info.add(nom_compte);
            panel_info.add(prenom_compte);
            panel_info.add(age_compte);
            panel_info.add(rencontre);
            panel_info.add(matchemaiking);
            panel_info.add(modifier);
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

    public Stack<JButton> get_all_buton() {
        return bouton;
    }

}
*/


/*
public PriorityQueue<JButton> boutons = new PriorityQueue<JButton>(new Comparator<JButton>() {
    @Override
    public int compare(JButton b1, JButton b2) {
        // Comparaison des boutons en fonction de leur priorité
        // Dans cet exemple, on considère que la priorité est donnée par l'ordre d'ajout dans la file
        return Integer.compare(b1.hashCode(), b2.hashCode());
    }
});

public void affiche_compte(GestionCompte gestionCompte) {
private static final long serialVersionUID = 1L;
private BufferedImage image;
public JScrollPane scrollPane;
public JButton rencontre;
public JButton matchemaiking;
public JButton modifier;
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
        JButton rencontre = new JButton("rencontre");
        JButton matchemaiking = new JButton("matchemaiking");
        JButton modifier = new JButton("modifier");

        // Ajouter les boutons à la file à priorité
        boutons.add(rencontre);
        boutons.add(matchemaiking);
        boutons.add(modifier);

        panel_info.add(rencontre);
        panel_info.add(matchemaiking);
        panel_info.add(modifier);

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
} 
*/





/*
public class affiche_compte extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    public JScrollPane scrollPane;
    public JButton rencontre;
    public JButton matchemaiking;
    public JButton modifier;
    

    public Stack <JButton> bouton= new Stack<JButton>();

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
            JButton rencontre = new JButton("rencontre");
            JButton matchemaiking = new JButton("matchemaiking");
            JButton modifier = new JButton("modifier");
            //freq.
            
            bouton.push(rencontre);
            bouton.push(matchemaiking);
            bouton.push(modifier);
            
            panel_info.add(rencontre);
            panel_info.add(matchemaiking);
            panel_info.add(modifier);
            //
            panel_info.add(nom_compte);
            panel_info.add(prenom_compte);
            panel_info.add(age_compte);
            panel_info.add(rencontre);
            panel_info.add(matchemaiking);
            panel_info.add(modifier);
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
    public JButton getRencontre() {
    	return rencontre;
    }
    public JButton getMatchemaiking() {
    	return matchemaiking;
    }
    public JButton getModifier() {
    	return modifier;
    }
    public  Stack get_all_buton() {
    	return bouton;
    }

}
*/







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
public class conextion {
    private GestionCompte gestionCompte;
    private Fenetre f;
    

    
    public conextion(GestionCompte gestionCompte, Fenetre f) {
        this.gestionCompte = gestionCompte;
        this.f=f;

        
        f.connexion_panel.getLoginButton().addActionListener(e -> handleLogin(gestionCompte));
        f.connexion_panel.getSigninButton().addActionListener(e -> handleSignin(gestionCompte));
    }
    
    public void handleLogin(GestionCompte gestionCompte) {
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
}
*/
