package project;


import java.util.Date;

public class Compte {
    private String nom;
    private String prenom;
    private String hobbit;
    private String idImage;
    private Date anniversaire;
    private int age;
    private Adresse adresse;
    private String numTel;
    private String email;
    private String sexe;
    private String attiranceSexuelle;
    private int ageMinPref;
    private int ageMaxPref;
    private String presentationCommentaire;
    
    public class Adresse {
        private String ville;
        private String rueNumero;
        private int codePostal;
        private String region;
        private String pays;
        
        public Adresse(String ville, String rueNumero, int codePostal, String region, String pays) {
            this.ville = ville;
            this.rueNumero = rueNumero;
            this.codePostal = codePostal;
            this.region = region;
            this.pays = pays;
        }
    }
    
    public Compte(String nom, String prenom, String hobbit, String idImage, Date anniversaire, int age, Adresse adresse, String numTel, String email, String sexe, String attiranceSexuelle, int ageMinPref, int ageMaxPref, String presentationCommentaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.hobbit = hobbit;
        this.idImage = idImage;
        this.anniversaire = anniversaire;
        this.age = age;
        this.adresse = adresse;
        this.numTel = numTel;
        this.email = email;
        this.sexe = sexe;
        this.attiranceSexuelle = attiranceSexuelle;
        this.ageMinPref = ageMinPref;
        this.ageMaxPref = ageMaxPref;
        this.presentationCommentaire = presentationCommentaire;
    }
    
    public Compte() {
    	this.nom = null;
        this.prenom = null;
        this.hobbit = null;
        this.idImage = null;
        this.anniversaire = null;
        this.age = 18;
        this.adresse = null;
        this.numTel = null;
        this.email = null;
        this.sexe = null;
        this.attiranceSexuelle = null;
        this.ageMinPref = 18;
        this.ageMaxPref = 0;
        this.presentationCommentaire = null;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public String getHobbit() {
        return hobbit;
    }
    
    public String getIdImage() {
        return idImage;
    }
    
    public Date getAnniversaire() {
        return anniversaire;
    }
    
    public int getAge() {
        return age;
    }
    
    public Adresse getAdresse() {
        return adresse;
    }
    /*
    private String ville;
    private String rueNumero;
    private String codePostal;
    private String region;
    private String pays;*/
    
    public String getAdresseVile() {
        return adresse.ville;
    }
    
    public String getAdresseRue_Numero() {
        return adresse.rueNumero;
    }
    
    public int getAdressecodePostal() {
        return adresse.codePostal;
    }
    
    public String getAdresseregion() {
        return adresse.region;
    }
    
    public String getAdressepays() {
        return adresse.pays;
    }
    
    public String getNumTel() {
        return numTel;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSexe() {
        return sexe;
    }
    
    public String getAttiranceSexuelle() {
        return attiranceSexuelle;
    }
    
    public int getAgeMinPref() {
        return ageMinPref;
    }
    
    public int getAgeMaxPref() {
        return ageMaxPref;
    }
    
    public String getPresentationCommentaire() {
        return presentationCommentaire;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }
    
    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }
    
    public void setAnniversaire(Date anniversaire) {
        this.anniversaire = anniversaire;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
    public void setAdresse(String ville, String rueNumero,  int codePostal, String region, String pays) {
    	this.adresse.ville = ville;
    	this.adresse.rueNumero = rueNumero;
    	this.adresse.codePostal = codePostal;
    	this.adresse.region = region;
    	this.adresse.pays = pays;
    }

    
    public void setAdresseVile(String ville) {
        this.adresse.ville = ville;
    }
    
    public void setAdresseRue_Numero(String rueNumero) {
    	this.adresse.rueNumero = rueNumero;
    }
    
    public void setAdressePostal(int codePostal) {
    	this.adresse.codePostal = codePostal; 
    }
    
    public void setAdresseeregion(String region) {
    	 this.adresse.region = region; 
    }
    
    public void setAdressepays(String pays) {
    	 this.adresse.pays = pays;
    }
    
    
    
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    public void setAttiranceSexuelle(String attiranceSexuelle) {
        this.attiranceSexuelle = attiranceSexuelle;
    }
    
    public void setageMinPref(int ageMinP) {
        this.ageMinPref = ageMinP;
    }
    
    public void setageMaxPref(int ageMaxP) {
        this.ageMaxPref = ageMaxP;
    }
    
    public void setpresentationCommentaire(String presentationCommentaire) {
        this.presentationCommentaire = presentationCommentaire;
    }

}