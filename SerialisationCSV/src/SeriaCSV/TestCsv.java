package SeriaCsv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestClasse {

	public TestClasse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date = new java.util.Date(); 
		SerialisationCSV monTest = new SerialisationCSV(null, null, null, null, date, 0, null, null, 0, null, null, null, null, null, null, 0, 0, null);
        //monTest.AddToCsvPointVirgule();
        try {
			monTest.AddToCsvVirgule();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
		monTest.AddToCsvPointVirgule();
		} catch (FileNotFoundException e) {
		 
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
        monTest.ObtenirChemin();
        System.out.println(monTest.ObtenirChemin());
	}

}

