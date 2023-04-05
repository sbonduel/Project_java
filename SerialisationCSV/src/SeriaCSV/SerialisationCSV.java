//package Test;
package SeriaCSV;
//Type date à local date à changer

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
    private String CodePostal;
    
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


		
		//Constructeur avec des ints
	public	SerialisationCSV(String name,String sirname,String Hobbys,String identifImage,Date BirthDayDate,int AgePers,String Ville,String RueNum,int CodePost,String Region,String Country,String NumeroDeTel,String Email,String Sexe,String Attirance,int AgeMin,int AgeMax,String Commentary)
		{
		 nom=name;
		 prenom=sirname;
		 hobbit=Hobbys;
		 idImage=identifImage;
		
  
		  anniversaire=BirthDayDate;
		  
		  String DateF=anniversaire.toString();
		//--> jour sem ? Jour=DateF.substring(0, Math.min(DateF.length(), 3));
			Mois=DateF.substring(4, Math.min(DateF.length(), 7));
			Jour=DateF.substring(8, Math.min(DateF.length(), 10));
			//String Heures=DateF.substring(11, Math.min(DateF.length(), 19));
			 Annee=DateF.substring(24, Math.min(DateF.length(), 28));
		    
		   age = AgePers;
		    
		    ville=Ville;
		    rueNumero=RueNum;
		    
		    codePostal=CodePost;
		    CodePostal= Integer.toString(codePostal);
		    
		     region = Region;
		     pays = Country;
		     numTel=NumeroDeTel;
		    email=Email;
		    sexe = Sexe;
		     attiranceSexuelle = Attirance;
		    
		  ageMinPref = AgeMin;
		 AgeMinimumPreference = Integer.toString(ageMinPref);

		   ageMaxPref = AgeMax;
		AgeMaximumPreference = Integer.toString(ageMaxPref);

		    
		    presentationCommentaire = Commentary;	
		 
		}
		
		//Redef Constructeur
		// TODO Auto-generated constructor stub
		
		
		public void AddToCsvVirgule() throws FileNotFoundException, IOException
		{
			//Obtention du chemin actuel et mise en forme
			String CheminG=System.getProperty("user.dir");
			String old ="\\";
			String mnew="/";
			CheminG=CheminG.replace(old,mnew);
			//Création du fichier de donnés txt dans le chemin actuel
			File fichier = new File(CheminG,"Data.csv");
			//Ecriture des données selon le format correspondant
			
			PrintWriter writer = new PrintWriter(CheminG+"/Data.csv", "UTF-8");
			writer.println(nom+","+prenom+","+hobbit+","+idImage+","+Jour+"/"+Mois+"/"+Annee+","+Age+","+ville+","+rueNumero+","+CodePostal+","+region+","+pays+","+numTel+","+email+","+sexe+","+attiranceSexuelle+","+AgeMinimumPreference+","+AgeMaximumPreference+","+presentationCommentaire+",");
			
			
			//writer.println("Test "+Sujet);
			//Recuperation et ecriture de la date selon le format correspondant
			//java.util.Date date = new java.util.Date(); 
			//String DateF=date.toString();
			//String Jour=DateF.substring(0, Math.min(DateF.length(), 3));
			//String Mois=DateF.substring(4, Math.min(DateF.length(), 7));
			//String numJour=DateF.substring(8, Math.min(DateF.length(), 10));
			//String Heures=DateF.substring(11, Math.min(DateF.length(), 19));
			//String Annee=DateF.substring(24, Math.min(DateF.length(), 28));
			//writer.println("Date: "+Jour+", "+numJour+" "+Mois+" "+Annee+" "+Heures);

			//	writer.println("");
			//writer.println(Contenu);
			writer.close();

		}

		public String ObtenirChemin()
		{
			//Renvoie le chemin dans lequel se situe le fichier de données
			String CheminG=System.getProperty("user.dir");
			String old ="\\";
			String mnew="/";
			CheminG=CheminG.replace(old,mnew);
			String Chemin = CheminG+"/Data.csv";
			return Chemin;
		}
		
		
		
		public void AddToCsvPointVirgule() throws FileNotFoundException, UnsupportedEncodingException
		{
			String CheminG=System.getProperty("user.dir");
			String old ="\\";
			String mnew="/";
			CheminG=CheminG.replace(old,mnew);
			File fichier = new File(CheminG,"Data2.csv");
			//Création du fichier de donnés txt dans le chemin actuel
			//File fichier = new File(CheminG,"Data.csv");
			//Ecriture des données selon le format correspondant
			
			PrintWriter writer =  new PrintWriter(CheminG+"/Data2.csv", "UTF-8");
			writer.println(nom+";"+prenom+";"+hobbit+";"+idImage+";"+Jour+"/"+Mois+"/"+Annee+";"+Age+";"+ville+";"+rueNumero+";"+CodePostal+";"+region+";"+pays+";"+numTel+";"+email+";"+sexe+";"+attiranceSexuelle+";"+AgeMinimumPreference+";"+AgeMaximumPreference+";"+presentationCommentaire+";");
			writer.close();
			
		}

	

}
