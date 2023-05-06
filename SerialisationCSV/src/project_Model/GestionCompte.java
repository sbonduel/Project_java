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

    //
    // 
    
    public ArrayList rechercherComptePar_Prenom(String prenom) {
    	ArrayList<Compte> recherche_prenom = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getPrenom().equals(prenom)) {
            	recherche_prenom.add(compte);
            }
        }
        return recherche_prenom;
    }
    
    public ArrayList rechercherComptePar_Nom(String nom) {
    	ArrayList<Compte> recherche_nom = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getNom().equals(nom)) {
            	recherche_nom.add(compte);
            }
        }
        if (recherche_nom.isEmpty()) {
        	return null;
        }
        else {
        	return recherche_nom;
        }
    }
    
    public ArrayList<Compte> rechercherComptesPar_Hobbit(String hobbit) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getHobbit().equals(hobbit)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList<Compte> rechercherComptesPar_IdImage(String idImage) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getIdImage().equals(idImage)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    

    public ArrayList rechercherComptePar_Anniversaire(LocalDate anniversaire) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAnniversaire().equals(anniversaire)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList rechercherComptePar_Age(int age) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAge()==(age)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
/*
    public ArrayList rechercherComptePar_Adresse(Adresse adresse) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdresse().equals(adresse)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
*/
    
    public ArrayList rechercherComptePar_ville( String ville) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdresseVile().equals(ville)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    public ArrayList rechercherComptePar_rueNumero(String rueNumero) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdresseRue_Numero().equals(rueNumero)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    
    public ArrayList rechercherComptePar_codePostal(String codePostal) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdressestringcodePostal().equals(codePostal)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    
    public ArrayList rechercherComptePar_pays( String pays) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdressepays().equals(pays)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    public ArrayList rechercherComptePar_region(String region) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAdresseregion().equals(region)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    
    public ArrayList rechercherComptePar_NumTel(String numTel) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getNumTel().equals(numTel)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList rechercherComptePar_Email(String email) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getEmail().equals(email)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList rechercherComptePar_Sexe(String sexe) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getSexe().equals(sexe)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    public ArrayList rechercherComptePar_AttiranceSexuelle(String attiranceSexuelle) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAttiranceSexuelle().equals(attiranceSexuelle)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList rechercherCompteParAgeMin_Pref(int ageMinPref) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAgeMinPref()>=ageMinPref) {
                resultats.add(compte);
            }
        }
        return resultats;
    }

    public ArrayList rechercherComptePar_AgeMaxPref(int ageMaxPref) {
        ArrayList<Compte> resultats = new ArrayList<Compte>(); 
        for (Compte compte : this.comptes) {
            if (compte.getAgeMaxPref()<=(ageMaxPref)) {
                resultats.add(compte);
            }
        }
        return resultats;
    }
    
    public ArrayList rechercherComptePar_AgeMaxPref(int ageMaxPref, int ageMinPref) {
        ArrayList<Compte> resultats = new ArrayList<Compte>();
        for (Compte compte : this.comptes) {
            if ((compte.getAgeMinPref()>=ageMinPref) && (compte.getAgeMaxPref()<=(ageMaxPref))){
                resultats.add(compte);
            }
        }
        return resultats;
    }
    

 // ... 
    
    public ArrayList rechercherCompte(String nom, String prenom, String hobbit, int age, Adresse adresse, String numTel, String email, String sexe, String attiranceSexuelle, int ageMinPref, int ageMaxPref, String ville, String rueNumero, String codePostal,  String region, String pays){
    	

    	ArrayList<Compte> resultats = new ArrayList<Compte>(); 
    	ArrayList<Compte> presresultats1 = new ArrayList<Compte>();
    	ArrayList<Compte> presresultats2 = new ArrayList<Compte>();
    	
    	if(!rechercherComptePar_Prenom(prenom).isEmpty()) {
    		resultats.addAll(rechercherComptePar_Prenom(prenom));
    	}
    	
		if(!rechercherComptePar_Nom(nom).isEmpty() ) {
			presresultats1.addAll(rechercherComptePar_Nom(nom));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();

			
		}
		if(!rechercherComptesPar_Hobbit(hobbit).isEmpty()) {
			presresultats1.addAll(rechercherComptesPar_Hobbit(hobbit));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
		
		}
		if(!rechercherComptePar_Age(age).isEmpty()) {
			presresultats1.addAll(rechercherComptePar_Age(age));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
		
		}
		if(!rechercherComptePar_NumTel(numTel).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_NumTel(numTel));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		
		}
		if(!rechercherComptePar_Email(email).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_Email(email));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		
		}
		if(!rechercherComptePar_Sexe(sexe).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_Sexe(sexe));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_AttiranceSexuelle(attiranceSexuelle).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_AttiranceSexuelle(attiranceSexuelle));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_AgeMaxPref(ageMaxPref, ageMinPref).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_AgeMaxPref(ageMaxPref, ageMinPref));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_ville(ville).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_ville(ville));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_rueNumero(rueNumero).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_rueNumero(rueNumero));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_codePostal(codePostal).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_codePostal(codePostal));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_region(region).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_region(region));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
		if(!rechercherComptePar_pays(pays).isEmpty()) {
			//lol
			presresultats1.addAll(rechercherComptePar_pays(pays));
			for (Compte compte : presresultats1) {
				if (resultats.contains(compte)) {
					presresultats2.add(compte);
				}
			}
			presresultats1 = new ArrayList<Compte>();
			resultats = new ArrayList<Compte>();
			for (Compte compte : presresultats2) {
				resultats.add(compte);
			}
			presresultats2= new ArrayList<Compte>();
			//lol
		}
    return resultats;
}
    
    
    //...
    
    public Compte rechercherCompteParPrenom(String prenom) {
        for (Compte compte : this.comptes) {
            if (compte.getPrenom().equals(prenom)) {
            	return compte;
            }
        }
		return null;
    }
    
    public Compte rechercherCompteParNom(String nom) {
        for (Compte compte : this.comptes) {
            if (compte.getNom().equals(nom)) {
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