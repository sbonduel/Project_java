package project_Vue;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import project_Model.Compte;
import project_Model.GestionCompte;

public class recherche extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;

    public recherche(String imagePath, GestionCompte gestionCompte) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        JPanel panel_compte = new JPanel(new GridLayout(0, 1));

        for (Compte compte : gestionCompte.get_comptes()) {
            String imagePString = compte.getIdImage();
            recherche imagePanel = new recherche(imagePath, gestionCompte);
            imagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel_compte.add(imagePanel);
    }

    
   
    }

    JScrollPane scrollPane = new JScrollPane(panel);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
}