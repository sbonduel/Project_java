package project_Vue;

public class fenetre_historique_des_Rendez_vous {
	import java.awt.*;
	import javax.swing.*;

	public class Panel extends JPanel {
	    private JTextField searchBar;
	    private JButton searchButton, filterButton;

	    public Panel() {
	        setLayout(new BorderLayout());
	        searchBar = new JTextField();
	        searchButton = new JButton("Image Loup");
	        filterButton = new JButton("Image Entonnoir");

	        JPanel searchPanel = new JPanel(new BorderLayout());
	        searchPanel.add(searchBar, BorderLayout.CENTER);
	        searchPanel.add(searchButton, BorderLayout.EAST);
	        searchPanel.add(filterButton, BorderLayout.WEST);

	        add(searchPanel, BorderLayout.NORTH);
	    }
	}

	public class Menu {
	    private JMenuBar menuBar;
	    private JMenu menu;

	    public Menu() {
	        menuBar = new JMenuBar();
	        menu = new JMenu("Menu");
	        menuBar.add(menu);
	    }

	    public JMenuBar getMenuBar() {
	        return menuBar;
	    }

	    public JMenu getMenu() {
	        return menu;
	    }
	}

	public class Fenetre extends JFrame {
	    private Panel panel;
	    private Menu menu;

	    public Fenetre() {
	        super("Ma Fenetre");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 500);

	        panel = new Panel();
	        menu = new Menu();

	        setJMenuBar(menu.getMenuBar());
	        menu.getMenu().add(new JMenuItem("Connexion"));
	        menu.getMenu().add(new JMenuItem("S'inscrire"));

	        add(panel, BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        Fenetre f = new Fenetre();
	        f.setVisible(true);
	    }
	}

}
