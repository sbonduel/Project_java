package SeriaCSV;

import java.util.Date;

public class SerialisationCSV {
	private String nom;
    private String prenom;
    private String hobbit;
    private String idImage;
    
    private Date anniversaire;
    private String Jour;
    private String Mois;
    private String Annee;
    
    private int age;
    private String Age;
   // private Adresse adresse;
    private String ville;
    private String rueNumero;
    
    private int codePostal;
    private String codePostal;
    
    private String region;
    private String pays;
    private String numTel;
    private String email;
    private String sexe;
    private String attiranceSexuelle;
    
    private String AgeMinimumPreference;
    private int ageMinPref;
    
    private int ageMaxPref;
    private String AgeMaximumPreference;
    
    private String presentationCommentaire; 

	public SerialisationCSV() {
		
		//Constructeur à finir
		SerialisationCSV(String name,String sirname,String Hobbys,String identifImage,Date BirthDayDate,int Age,String Ville,String RueNum,int CodePost,String Region,String Country,String NumeroDeTel,String Email,String Sexe,String Attirance,int AgeMin,int AgeMax,string Commentary)
		{
		 nom=name;
		 prenom=sirname;
		 hobbit=Hobbys;
		 idImage=identifImage;
		 //...
		}
		
		//Redef Constructeur
		// TODO Auto-generated constructor stub
		
		public void AddToCsvVirgule()
		{
			
		}
		
		public void AddToCsvPointVirgule()
		{
			
		}

	}

}
