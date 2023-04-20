package project_Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class GestionCompte {

    private ArrayList<Compte> comptes;

    public GestionCompte() {
        this.comptes = new ArrayList<Compte>();
    }

    // Ajouter un nouveau compte
    public void ajouterCompte(Compte compte) {
        this.comptes.add(compte);
    }

    // Afficher tous les comptes
    public void afficherComptes() {
        for (Compte compte : this.comptes) {
            System.out.println(compte);
        }
    }
    
    // Afficher tous les comptes
    public ArrayList<Compte> get_comptes() {
    	return comptes;
    }

    // Rechercher un compte par nom et prénom
    public Compte rechercherCompte(String nom, String prenom) {
        for (Compte compte : this.comptes) {
            if (compte.getNom().equals(nom) && compte.getPrenom().equals(prenom)) {
                return compte;
            }
        }
        return null;
    }
    
    public Compte rechercherCompte(String nom, String prenom, String idImage) {
        for (Compte compte : this.comptes) {
            if (compte.getNom().equals(nom) && compte.getPrenom().equals(prenom)&& compte.getIdImage().equals(idImage)) {
                return compte;
            }
        }
        return null;
    }
    

    // Modifier son propre compte
    public void modifierCompte(String nom, String prenom, String hobbit, String idImage, int anive_ane,  int anive_mois,  int anive_jours, int age, Compte.Adresse adresse, String numTel, String email, String sexe, String attiranceSexuelle, int ageMinPref, int ageMaxPref, String presentationCommentaire) {
        Compte compte = this.rechercherCompte(nom, prenom, idImage);
        if (compte != null) {
            compte.setHobbit(hobbit);
            compte.setIdImage(idImage);
            compte.setAnniversaire(LocalDate.of(anive_ane, anive_mois, anive_jours));
            compte.setAge(age);
            compte.setAdresse(adresse);
            compte.setNumTel(numTel);
            compte.setEmail(email);
            compte.setSexe(sexe);
            compte.setAttiranceSexuelle(attiranceSexuelle);
            compte.setageMinPref(ageMinPref);
            compte.setageMaxPref(ageMaxPref);
            compte.setpresentationCommentaire(presentationCommentaire);
            System.out.println("Le compte a été modifié avec succès !");
        } else {
            System.out.println("Le compte n'a pas été trouvé !");
        }
    }

}