package project_Vue;

import java.awt.*;
import javax.swing.*;

public class inscription extends JPanel {
	public static String[] activites = {
		    "Lecture",
		    "Écriture",
		    "Cuisine",
		    "Jardinage",
		    "Sport",
		    "Danse",
		    "Théâtre",
		    "Cinéma",
		    "Voyages",
		    "Photographie",
		    "Peinture",
		    "Sculpture",
		    "Méditation",
		    "Yoga",
		    "Musique",
		    "Natation",
		    "Escalade",
		    "Camping",
		    "Pêche",
		    "Équitation",
		    "Ski",
		    "Plongée",
		    "Surf",
		    "Voile",
		    "Marche"
		};
	
	public static  SpinnerModel spinnerModel = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel1 = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel2 = new SpinnerNumberModel(18, 18, 200, 1);
    
	
	public inscription() {
		setLayout(new BorderLayout()); // Utiliser un BorderLayout pour ce panneau
		JPanel inscriptions = new JPanel(new GridLayout(0, 1));
		
    //
    JPanel nomprenom = new JPanel();
    JLabel nom= new JLabel("nom :");
    JTextField nom_1 = new JTextField();
    JLabel prenom= new JLabel("prénom :");
    JTextField prenom_1 = new JTextField();

    
    //problème ici
    JPanel age_sexe_email = new JPanel();
    JLabel age = new JLabel("âge :");
    JSpinner age_1 = new JSpinner(spinnerModel);
    JLabel sex= new JLabel("sex :");
    JTextField sex_1 = new JTextField();
    JLabel email= new JLabel("email :");
    JTextField email_1 = new JTextField();
    
    
    JPanel hobbits = new JPanel();
    JLabel hobbit = new JLabel("hobbit :");
    JComboBox<String> hobbit_1 = new JComboBox<String>(activites);
    

    JPanel image = new JPanel();
    JLabel idImage= new JLabel("nom de votre image :");
    JTextField idImage_1 = new JTextField();

    JPanel orientation_sex_numTel = new JPanel();
    JLabel orentation_sexuelle= new JLabel("orentation sexuelle :");
    JTextField orentation_sexuelle_1 = new JTextField();
    JLabel numTel = new JLabel("votre numéro des teléphone :");
    JTextField numTel_1 = new JTextField();

    JPanel presentation_Commentaire = new JPanel();
    JLabel presentationCommentaire= new JLabel("voulez-vous renseigner d'autres informations qui vous semblent importantes :");
    JTextField presentationCommentaire_1 = new JTextField();

    JPanel agepref = new JPanel();
    JLabel agepreference= new JLabel("âge minimum et maximum :");
    JLabel agemin= new JLabel("âge minimum :");
    JSpinner agemin_1 = new JSpinner(spinnerModel1);
    JLabel agemax= new JLabel("âge maximum :");
    JSpinner agemax_1 = new JSpinner(spinnerModel2);

    JPanel adresse = new JPanel();
    JLabel adresses = new JLabel("adresse :");
    JLabel Ville = new JLabel("ville :");
    JTextField Ville_1 = new JTextField();
    JLabel rue  = new JLabel("rue :");
    JTextField rue_1 = new JTextField();
    JLabel numrue  = new JLabel("numéro de rue :");
    JTextField numrue_1 = new JTextField();
    JLabel codePostal = new JLabel("code postal :");
    JTextField codePostal_1 = new JTextField();
    JLabel region = new JLabel("région :");
    JTextField region_1 = new JTextField();
    JLabel pays = new JLabel("pays :");
    JTextField pays_1 = new JTextField();

    JPanel aniv = new JPanel();
    JLabel naissance = new JLabel("née le :");
    JLabel jours = new JLabel("jour :");
    JTextField jours_1 = new JTextField();
    JLabel mois = new JLabel("mois :");
    JTextField mois_1 = new JTextField();
    JLabel anees = new JLabel("année :");
    JTextField anees_1 = new JTextField();

    hobbits.add(hobbit);
    hobbits.add(hobbit_1);
    inscriptions.add(hobbits);

    image.add(idImage);
    image.add(idImage_1);
    inscriptions.add(image);

    orientation_sex_numTel.add(orentation_sexuelle);
    orientation_sex_numTel.add(orentation_sexuelle_1);
    orientation_sex_numTel.add(numTel);
    orientation_sex_numTel.add(numTel_1);
    inscriptions.add(orientation_sex_numTel);

    presentation_Commentaire.add(presentationCommentaire);
    presentation_Commentaire.add(presentationCommentaire_1);
    inscriptions.add(presentation_Commentaire);

    agepref.add(agepreference);
    agepref.add(agemin);
    agepref.add(agemin_1);
    agepref.add(agemax);
    agepref.add(agemax_1);
    inscriptions.add(agepref);

    adresse.add(adresses);
    adresse.add(Ville);
    adresse.add(Ville_1);
    adresse.add(rue);
    adresse.add(rue_1);
    adresse.add(numrue);
    adresse.add(numrue_1);
    adresse.add(codePostal);
    adresse.add(codePostal_1);
    adresse.add(region);
    adresse.add(region_1);
    adresse.add(pays);
    adresse.add(pays_1);
    inscriptions.add(adresse);

    aniv.add(naissance);
    aniv.add(jours);
    aniv.add(jours_1);
    aniv.add(mois);
    aniv.add(mois_1);
    aniv.add(anees);
    aniv.add(anees_1);
    inscriptions.add(aniv);
    
    

    // continue
    add(inscriptions, BorderLayout.CENTER);
    int x = 90;
    int y = 20;
    nom_1.setPreferredSize(new Dimension(x, y));
    prenom_1.setPreferredSize(new Dimension(x, y));
    age_1.setPreferredSize(new Dimension(x, y));
    sex_1.setPreferredSize(new Dimension(x, y));
    email_1.setPreferredSize(new Dimension(x, y));
    hobbit_1.setPreferredSize(new Dimension(x, y));
    idImage_1.setPreferredSize(new Dimension(x, y));
    orentation_sexuelle_1.setPreferredSize(new Dimension(x, y));
    numTel_1.setPreferredSize(new Dimension(x, y));
    presentationCommentaire_1.setPreferredSize(new Dimension(500, y));
    agemin_1.setPreferredSize(new Dimension(x, y));
    agemax_1.setPreferredSize(new Dimension(x, y));
    Ville_1.setPreferredSize(new Dimension(x, y));
    rue_1.setPreferredSize(new Dimension(x, y));
    numrue_1.setPreferredSize(new Dimension(x, y));
    codePostal_1.setPreferredSize(new Dimension(x, y));
    region_1.setPreferredSize(new Dimension(x, y));
    pays_1.setPreferredSize(new Dimension(x, y));
    jours_1.setPreferredSize(new Dimension(x, y));
    mois_1.setPreferredSize(new Dimension(x, y));
    anees_1.setPreferredSize(new Dimension(x, y));
    
	}
}
