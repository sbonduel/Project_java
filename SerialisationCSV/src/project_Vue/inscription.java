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
	
	
	public static String[] type_sexe = {
		    "femme",
		    "hemme",
		    "transsexuel",
		    "non binaire",
		    "herms",
		    "ferms",
		    "merms",
		};
	
	public static  SpinnerModel spinnerModel = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel1 = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel2 = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel3 = new SpinnerNumberModel(18, 18, 200, 1);
	public static  SpinnerModel spinnerModel4 = new SpinnerNumberModel(1, 1, 31, 1);
	public static  SpinnerModel spinnerModel5 = new SpinnerNumberModel(1, 1, 12, 1);
	public static  SpinnerModel spinnerModel6 = new SpinnerNumberModel (1500 , 1500, 2050, 1);
	
	public JTextField nom_1 = new JTextField();
	public JTextField prenom_1 = new JTextField();
	public JSpinner age_1 = new JSpinner(spinnerModel);
	public JComboBox<String> sex_1 = new JComboBox<String>(type_sexe);
	public JTextField email_1 = new JTextField();
	public JComboBox<String> hobbit_1 = new JComboBox<String>(activites);
	public JTextField idImage_1 = new JTextField();
	public JComboBox<String> orentation_sexuelle_1 = new JComboBox<String>(type_sexe);
	public JTextField numTel_1 = new JTextField();
	public JTextField presentationCommentaire_1 = new JTextField();
	public JSpinner agemin_1 = new JSpinner(spinnerModel1);
	public JSpinner agemax_1 = new JSpinner(spinnerModel2);
	public JTextField Ville_1 = new JTextField();
	public JTextField rue_1 = new JTextField();
	public JSpinner numrue_1 = new JSpinner(spinnerModel3);
	public JTextField codePostal_1 = new JTextField();
	public JTextField region_1 = new JTextField();
	public JTextField pays_1 = new JTextField();
	public JSpinner jours_1 = new JSpinner(spinnerModel4);
	public JSpinner mois_1 = new JSpinner(spinnerModel5);
	public JSpinner anees_1 = new JSpinner(spinnerModel6);
	
	
	public JButton confirme = new JButton("confirmer");
	
	public inscription() {
		setLayout(new BorderLayout()); // Utiliser un BorderLayout pour ce panneau
		JPanel inscriptions = new JPanel(new GridLayout(0, 1));
		
    //
	JPanel nomprenom = new JPanel();
    JLabel nom= new JLabel("nom :");
    JLabel prenom= new JLabel("prénom :");

    //
    JPanel age_sexe_email = new JPanel();
    JLabel age = new JLabel("âge :");
    JLabel sex= new JLabel("sex :");
    JLabel email= new JLabel("email :");
    
    
    
    JPanel hobbits = new JPanel();
    JLabel hobbit = new JLabel("hobbit :");
    
    

    JPanel image = new JPanel();
    JLabel idImage= new JLabel("nom de votre image :");
    

    JPanel orientation_sex_numTel = new JPanel();
    JLabel orentation_sexuelle= new JLabel("orentation sexuelle :");
    JLabel numTel = new JLabel("votre numéro des teléphone :");
    

    JPanel presentation_Commentaire = new JPanel();
    JLabel presentationCommentaire= new JLabel("voulez-vous renseigner d'autres informations qui vous semblent importantes :");
    

    JPanel agepref = new JPanel();
    JLabel agepreference= new JLabel("âge minimum et maximum :");
    JLabel agemin= new JLabel("âge minimum :");
    JLabel agemax= new JLabel("âge maximum :");

    JPanel adresse = new JPanel();
    JLabel adresses = new JLabel("adresse :");
    JLabel Ville = new JLabel("ville :");
    JLabel rue  = new JLabel("rue :");
    JLabel numrue  = new JLabel("numéro de rue :");
    JLabel codePostal = new JLabel("code postal :");
    JLabel region = new JLabel("région :");
    JLabel pays = new JLabel("pays :");


    JPanel aniv = new JPanel();
    JLabel naissance = new JLabel("née le :");
    JLabel jours = new JLabel("jour :");
    JLabel mois = new JLabel("mois :");
    JLabel anees = new JLabel("année :");


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
    
    age_sexe_email.add(age);
    age_sexe_email.add(age_1);
    age_sexe_email.add(sex);
    age_sexe_email.add(sex_1);
    age_sexe_email.add(email);
    age_sexe_email.add(email_1);
    inscriptions.add(age_sexe_email);
    
    inscriptions.add(confirme);

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
