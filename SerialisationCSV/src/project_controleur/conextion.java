package project_controleur;



import project_Vue.ConnexionPanel;
import project_Vue.Fenetre;
import project_Model.Compte;
import project_Model.GestionCompte;

public class conextion {
    private ConnexionPanel view;
    private GestionCompte gestionCompte;
    public Compte compte_conect;
    
    public conextion(ConnexionPanel view, GestionCompte gestionCompte) {
        this.view = view;
        this.gestionCompte = gestionCompte;

        
        view.getLoginButton().addActionListener(e -> handleLogin());
        view.getSigninButton().addActionListener(e -> handleSignin());
    }
    
    private void handleLogin() {
        String username = view.getusername().getText();
        String password = new String(view.getpassword().getPassword());
        for (Compte compte : gestionCompte.get_comptes()) {
        	if (username.equals(compte.getUser()) && password.equals(compte.getmots_de_passe())) {
        		
        		int panel = 1;
        		compte_conect = compte;
            }
        }
        
        
        // Vérifier les informations de connexion et mettre à jour le modèle en conséquence
        
        

        // Exemple :
        
    }
    
    private void handleSignin() {
        // Ouvrir la vue d'inscription correspondante
    }
}
