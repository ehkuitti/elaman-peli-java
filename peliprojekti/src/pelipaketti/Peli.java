// Projektin nimi on peliprojekti, paketin nimi on pelipaketti ja luokan nimi on Peli. Huomioi kirjainkoot.

package pelipaketti;

import java.util.Scanner;

public class Peli {

	public static void main(String[] args) {
		
		// Tähän alkutietoja, kuten muuttujia
		String syntymäpaikka;                   // kaupunki johon synnyt
		String nimi;                            // käyttäjän nimi
		String ekaAste; 						// ensimmäisen asteen tutkinto  
		String tokaAste;						// toisen asteen tutkinto
		String opinnot;							// opintosuuntaus
		String opiskelijabileet;
		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
		Scanner laskija = new Scanner(System.in); // lukujen lukemiseen
		
		// Varsinainen koodi alkaa
		
		System.out.print("Tervetuloa Elämään! Anna nimesi: ");
		nimi = lukija.nextLine();
		System.out.println("\n" + nimi + " on hieno nimi!");
		
		syntymäpaikka = syntymä(); // muuttuja syntymäpaikka tulostaa kaupungin nimen
		                            //peliOhi(); - metodi lopettaa pelin

		if (syntymäpaikka == "Vantaa") {        // Vantaa polku metodeina
            lapsuus();                          // Tulostaa vuosia
            ekaAste = yhteishaku1();            // Kysyy ensimmäisen asteen tutkinnon ekaAste tulostaa tutkinnon nimen
            tokaAste = yhteishaku2();           // Kysyy toisen asteen tutkinnon tokaAste tulostaa tutkinnon nimen            
            opinnot = opintosuuntaus();          // Kysyy mitä haluaa opiskella
            opiskelijabileet = bileet();        // metodi tekee taulukon jossa kysyy sanoja
            
		} else if (syntymäpaikka == "Oulu") {       // Oulun polku metodeina
			lapsuus();
			ekaAste = yhteishaku1();
			tokaAste = yhteishaku2();
			opinnot = opintosuuntaus();
			opiskelijabileet = bileet();
			
		} else {                                // Jokaisen kysymyksen 3. vaihtoehto lopettaa pelin 
		    System.out.print("\nEi kai nyt kukaan täysijärkinen haluaisi Turkuun syntyä...");
		    peliOhi();
		    
		}
		lukija.close();  // Pidetään lukijoiden sulkemiset päämetodin viimeisellä rivillä, jotta
		laskija.close();  // niitä voi käyttää koko ohjelman ajan.
		
	    

	}

	  private static String bileet() {

		int lukumäärä = 0;
        int kylläVaiEi = 0;
        double[] ilkivalta;
        ilkivalta = new double [lukumäärä];
        int pituus = ilkivalta.length;
		Scanner lukija = new Scanner (System.in);

        System.out.println("\nOpiskelijabileet. Kaverisi ehdottaa ilkivaltaa. Haluatko osallistua? \n1) Kyllä\n2) En");
        kylläVaiEi = lukija.nextInt();
        


        switch (kylläVaiEi) {
        	case 1:
        		System.out.println("\nKuinka monta lukua haluat kirjoittaa? (1-3):");
        		 lukumäärä = lukija.nextInt();
        		    
        			for (int i = 1; i <= ilkivalta.length; ++i) {
                                System.out.print("Anna " + i + ". luku: ");
                                ilkivalta[i-1] = lukija.nextDouble();
        			}
        			System.out.println("\nKirjoitit luvut: " + ilkivalta + "kirjaston seinään. \n\nPoliisi näki tekosi ja määräsi sinulle 800 euroa sakkoja.");
        			break;
    		   
        	case 2:
        		System.out.println("\nHienoa, lainkuuliaista toimintaa!");

		}

		return null;
	}

	private static String opintosuuntaus() {
    	
    	        int tokaAste = 0;
        		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
        		String tokaTutkinto = null;
        		
        		System.out.println("\nMitä tahdot opiskella korkeakoulussa?\n1) Tietojenkäsittelyä\n2) Sosiaalitieteitä\n3) Kauppatieteitä ja liiketaloutta");
        		tokaAste = lukija.nextInt();
        		switch(tokaAste) {
        		  case 1:
    			  System.out.println("\nOikein!");
        			  tokaTutkinto = "Tiko";
        			  break;
        		  case 2:
        			  System.out.println("\nTärkeä ala tämäkin!");
        			  tokaTutkinto = "Sosiaali";
        			  break;
        		  case 3:
        		      System.out.println("\nEt oo tosissas...");
        		      tokaTutkinto = "liiketalous";
        		      peliOhi();
        		}
    
        		return tokaTutkinto;
    		
    	}
	
	private static void peliOhi() {
        System.out.println("\n\nPeli ohi!\n\nKiitos, kun pelasit!");
	    System.exit(0);
	}

        private static String yhteishaku2() {
	
	        int tokaAste = 0;
    		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
    		String tokaTutkinto = null;
    		
    		System.out.println("\nMihin korkeakouluun haluat hakea?\n1) Yliopisto\n2) Ammattikorkeakoulu\n3) En minnekään");
    		tokaAste = lukija.nextInt();
    		switch(tokaAste) {
    		  case 1:
    			  System.out.println("\nMahtavaa! Aika päntätä");
    			  tokaTutkinto = "Yliopisto";
    			  break;
    		  case 2:
    			  System.out.println("\nHieno homma! Opiskelu kutsuu!");
    			  tokaTutkinto = "Ammattikorkeakoulu";
    			  break;
    		  case 3:
    		      System.out.println("\nMene töihin rotta!");
    		      tokaTutkinto = "Rotta";
    		      peliOhi();
    		}

    		return tokaTutkinto;
		
	}


	private static String yhteishaku1() {
	
	int ekaAste = 0;
    		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
    		String ekaTutkinto = null;
    		
    		System.out.println("\nMihin kouluun haluat hakea?\n1) Lukio\n2) Ammattikoulu\n3) En minnekään");
    		ekaAste = lukija.nextInt();
    		switch(ekaAste) {
    		  case 1:
    			  System.out.println("\nHienoa! Valmistuit ylioppilaaksi ja järjestit huikeat valmistujaisjuhlat!");
    			  ekaTutkinto = "Lukio";
    			  break;
    		  case 2:
    			  System.out.println("\nHienoa! Valmistuit haluamaasi ammattiin ja järjestit huikeat valmistujaisjuhlat!");
    			  ekaTutkinto = "Ammattikoulu";
    			  break;
    		  case 3:
    		      System.out.println("\nSenkin rotta! Et selviä elämässä näin!");
    		      ekaTutkinto = "Rotta";
    		      peliOhi();
    		}
    		
    		return ekaTutkinto;
		
	}

	private static void lapsuus() {
		System.out.println("\nLapsuutesi kuluu...");
		for (int i = 0; i <= 15; i+=5) {
			System.out.println("Olet nyt " + i + " vuotta vanha");
		}
        System.out.println("\nSeuraavaksi saat päättää mihin kouluun haet ensimmaisessä yhteishaussasi!");
	}

	private static String syntymä() {
		
		int syntymäpaikka = 0;
		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
		String kaupunki = null;
		
		System.out.println("\nValitse syntymäpaikkasi:\n1) Vantaa\n2) Oulu\n3) Turku");
		syntymäpaikka = lukija.nextInt();
		switch(syntymäpaikka) {
		  case 1:
			  System.out.println("Tervetuloa Vantaalle!");
			  kaupunki = "Vantaa";
			  break;
		  case 2:
			  System.out.println("Tervetuloa Ouluun!");
			  kaupunki = "Oulu";
			  break;
		  case 3:
		      kaupunki = "Turku";
		      break;
		}
		
		return kaupunki;
		
	
	}

}