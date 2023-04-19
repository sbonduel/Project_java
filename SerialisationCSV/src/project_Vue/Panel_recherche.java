package project_Vue;

import java.awt.*;
import javax.swing.*;

public class Panel_recherche extends JPanel {
    private JTextField searchBar;
    private JButton searchButton, filterButton;

    public Panel_recherche() {
        setLayout(new BorderLayout());
        searchBar = new JTextField();
        searchButton = new JButton("Image Loup");
        filterButton = new JButton("Image Entonnoir");

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.add(searchBar, BorderLayout.NORTH);
        searchPanel.add(searchButton, BorderLayout.EAST);
        searchPanel.add(filterButton);

        add(searchPanel, BorderLayout.NORTH);
    }
}