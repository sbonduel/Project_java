package project_Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConnexionPanel extends JPanel implements ActionListener {
    
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public ConnexionPanel() {
        setLayout(new GridLayout(3, 2));
        usernameLabel = new JLabel("Nom d'utilisateur:");
        add(usernameLabel);
        usernameField = new JTextField();
        add(usernameField);
        passwordLabel = new JLabel("Mot de passe:");
        add(passwordLabel);
        passwordField = new JPasswordField();
        add(passwordField);
        loginButton = new JButton("Se connecter");
        loginButton.addActionListener(this);
        add(loginButton);
    }
    
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if (username.equals("utilisateur") && password.equals("motdepasse")) {
            JOptionPane.showMessageDialog(this, "Connexion réussie!");
        } else {
            JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect.");
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Connexion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        ConnexionPanel panel = new ConnexionPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
