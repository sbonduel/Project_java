package project_Vue;


import java.awt.*;
import javax.swing.*;

public class fenetre_menu extends JPanel {
    private JTextField searchBar;
    private JButton rechercheButton, filtre, connectButton, s_incrire_Button;
    private JMenuBar menuBar;
    
    public fenetre_menu() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 30));
        
        // Initialisation du menu
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("_Menu_");
        connectButton = new JButton("Connection");
        s_incrire_Button = new JButton("S'incrire");
        
        // Ajout des éléments au menu
        menu.add(connectButton);
        menu.add(s_incrire_Button);
        menuBar.add(menu);
        
        // Initialisation de la barre de recherche
        JPanel recherchePanel = new JPanel(new BorderLayout());
        rechercheButton = new JButton("Image Loup");
        filtre = new JButton("Image Entonnoir");
        searchBar = new JTextField();
        recherchePanel.add(searchBar, BorderLayout.CENTER);
        recherchePanel.add(rechercheButton, BorderLayout.EAST);
        recherchePanel.add(filtre, BorderLayout.WEST);
        
        // Ajout de la barre de recherche à la région Nord de la fenêtre
        add(recherchePanel, BorderLayout.NORTH);
    }
    
    public JMenuBar getMenuBar() {
        return menuBar;
    }
}