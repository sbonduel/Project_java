package project_Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import project_Model.Compte.Adresse;

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
    public Compte rechercherCompteParNom(String nom) {
        for (Compte compte : this.comptes) {
            if (compte.getNom().equals(nom)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParPrenom(String prenom) {
        for (Compte compte : this.comptes) {
            if (compte.getPrenom().equals(prenom)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParHobbit(String hobbit) {
        for (Compte compte : this.comptes) {
            if (compte.getHobbit().equals(hobbit)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParIdImage(String idImage) {
        for (Compte compte : this.comptes) {
            if (compte.getIdImage().equals(idImage)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAnniversaire(LocalDate anniversaire) {
        for (Compte compte : this.comptes) {
            if (compte.getAnniversaire().equals(anniversaire)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAge(int age) {
        for (Compte compte : this.comptes) {
            if (compte.getAge() == age) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAdresse(Adresse adresse) {
        for (Compte compte : this.comptes) {
            if (compte.getAdresse().equals(adresse)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParNumTel(String numTel) {
        for (Compte compte : this.comptes) {
            if (compte.getNumTel().equals(numTel)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParEmail(String email) {
        for (Compte compte : this.comptes) {
            if (compte.getEmail().equals(email)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParSexe(String sexe) {
        for (Compte compte : this.comptes) {
            if (compte.getSexe().equals(sexe)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAttiranceSexuelle(String attiranceSexuelle) {
        for (Compte compte : this.comptes) {
            if (compte.getAttiranceSexuelle().equals(attiranceSexuelle)) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAgeMinPref(int ageMinPref) {
        for (Compte compte : this.comptes) {
            if (compte.getAgeMinPref() == ageMinPref) {
                return compte;
            }
        }
        return null;
    }

    public Compte rechercherCompteParAgeMaxPref(int ageMaxPref) {
        for (Compte compte : this.comptes) {
            if (compte.getAgeMaxPref() == ageMaxPref) {
                return compte;
            }
        }
        return null;
    }
    
    public Compte rechercherCompteParAgeMaxPref(int ageMaxPref, int ageMinPref) {
        for (Compte compte : this.comptes) {
            if (compte.getAgeMaxPref() <= ageMaxPref && compte.getAgeMinPref() >= ageMinPref ) {
                return compte;
            }
        }
        return null;
    }
    
    public Compte rechercherUser(String user) {
        for (Compte compte : this.comptes) {
            if (compte.getUser() == user) {
                return compte;
            }
        }
        return null;
    }

    // Modifier son propre compte
    public void modifierCompte(String nom, String prenom, String hobbit, String idImage, int anive_ane,  int anive_mois,  int anive_jours, int age, Compte.Adresse adresse, String numTel, String email, String sexe, String attiranceSexuelle, int ageMinPref, int ageMaxPref, String presentationCommentaire,  String user, String mots_de_passe) {
        Compte compte =  rechercherUser(user);
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
            compte.setUser(user);
            compte.setmots_de_passe(mots_de_passe);
            System.out.println("Le compte a été modifié avec succès !");
        } else {
            System.out.println("Le compte n'a pas été trouvé !");
        }
    }

}