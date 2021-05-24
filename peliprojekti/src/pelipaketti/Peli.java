// Projektin nimi on peliprojekti, paketin nimi on pelipaketti ja luokan nimi on Peli. Huomioi kirjainkoot.

package pelipaketti;

import java.util.Scanner;

public class Peli {

	public static void main(String[] args) {
		
		// T‰h‰n alkutietoja, kuten muuttujia
		String syntym‰paikka;                   // kaupunki johon synnyt
		String nimi;                            // k‰ytt‰j‰n nimi
		String ekaAste; 						// ensimm‰isen asteen tutkinto  
		String tokaAste;						// toisen asteen tutkinto
		String opinnot;							// opintosuuntaus
		String opiskelijabileet;
		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
		Scanner laskija = new Scanner(System.in); // lukujen lukemiseen
		
		// Varsinainen koodi alkaa
		
		System.out.print("Tervetuloa El‰m‰‰n! Anna nimesi: ");
		nimi = lukija.nextLine();
		System.out.println("\n" + nimi + " on hieno nimi!");
		
		syntym‰paikka = syntym‰(); // muuttuja syntym‰paikka tulostaa kaupungin nimen
		                            //peliOhi(); - metodi lopettaa pelin

		if (syntym‰paikka == "Vantaa") {        // Vantaa polku metodeina
            lapsuus();                          // Tulostaa vuosia
            ekaAste = yhteishaku1();            // Kysyy ensimm‰isen asteen tutkinnon ekaAste tulostaa tutkinnon nimen
            tokaAste = yhteishaku2();           // Kysyy toisen asteen tutkinnon tokaAste tulostaa tutkinnon nimen            
            opinnot = opintosuuntaus();          // Kysyy mit‰ haluaa opiskella
            opiskelijabileet = bileet();        // metodi tekee taulukon jossa kysyy sanoja
            
		} else if (syntym‰paikka == "Oulu") {       // Oulun polku metodeina
			lapsuus();
			ekaAste = yhteishaku1();
			tokaAste = yhteishaku2();
			opinnot = opintosuuntaus();
			opiskelijabileet = bileet();
			
		} else {                                // Jokaisen kysymyksen 3. vaihtoehto lopettaa pelin 
		    System.out.print("\nEi kai nyt kukaan t‰ysij‰rkinen haluaisi Turkuun synty‰...");
		    peliOhi();
		    
		}
		lukija.close();  // Pidet‰‰n lukijoiden sulkemiset p‰‰metodin viimeisell‰ rivill‰, jotta
		laskija.close();  // niit‰ voi k‰ytt‰‰ koko ohjelman ajan.
		
	    

	}

	  private static String bileet() {

		int lukum‰‰r‰ = 0;
        int kyll‰VaiEi = 0;
        double[] ilkivalta;
        ilkivalta = new double [lukum‰‰r‰];
        int pituus = ilkivalta.length;
		Scanner lukija = new Scanner (System.in);

        System.out.println("\nOpiskelijabileet. Kaverisi ehdottaa ilkivaltaa. Haluatko osallistua? \n1) Kyll‰\n2) En");
        kyll‰VaiEi = lukija.nextInt();
        


        switch (kyll‰VaiEi) {
        	case 1:
        		System.out.println("\nKuinka monta lukua haluat kirjoittaa? (1-3):");
        		 lukum‰‰r‰ = lukija.nextInt();
        		    
        			for (int i = 1; i <= ilkivalta.length; ++i) {
                                System.out.print("Anna " + i + ". luku: ");
                                ilkivalta[i-1] = lukija.nextDouble();
        			}
        			System.out.println("\nKirjoitit luvut: " + ilkivalta + "kirjaston sein‰‰n. \n\nPoliisi n‰ki tekosi ja m‰‰r‰si sinulle 800 euroa sakkoja.");
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
        		
        		System.out.println("\nMit‰ tahdot opiskella korkeakoulussa?\n1) Tietojenk‰sittely‰\n2) Sosiaalitieteit‰\n3) Kauppatieteit‰ ja liiketaloutta");
        		tokaAste = lukija.nextInt();
        		switch(tokaAste) {
        		  case 1:
    			  System.out.println("\nOikein!");
        			  tokaTutkinto = "Tiko";
        			  break;
        		  case 2:
        			  System.out.println("\nT‰rke‰ ala t‰m‰kin!");
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
    		
    		System.out.println("\nMihin korkeakouluun haluat hakea?\n1) Yliopisto\n2) Ammattikorkeakoulu\n3) En minnek‰‰n");
    		tokaAste = lukija.nextInt();
    		switch(tokaAste) {
    		  case 1:
    			  System.out.println("\nMahtavaa! Aika p‰nt‰t‰");
    			  tokaTutkinto = "Lukio";
    			  break;
    		  case 2:
    			  System.out.println("\nHieno homma! Opiskelu kutsuu!");
    			  tokaTutkinto = "Ammattikoulu";
    			  break;
    		  case 3:
    		      System.out.println("\nMene tˆihin rotta!");
    		      tokaTutkinto = "Rotta";
    		      peliOhi();
    		}

    		return tokaTutkinto;
		
	}


	private static String yhteishaku1() {
	
	int ekaAste = 0;
    		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
    		String ekaTutkinto = null;
    		
    		System.out.println("\nMihin kouluun haluat hakea?\n1) Lukio\n2) Ammattikoulu\n3) En minnek‰‰n");
    		ekaAste = lukija.nextInt();
    		switch(ekaAste) {
    		  case 1:
    			  System.out.println("\nHienoa! Valmistuit ylioppilaaksi ja j‰rjestit huikeat valmistujaisjuhlat!");
    			  ekaTutkinto = "Lukio";
    			  break;
    		  case 2:
    			  System.out.println("\nHienoa! Valmistuit haluamaasi ammattiin ja j‰rjestit huikeat valmistujaisjuhlat!");
    			  ekaTutkinto = "Ammattikoulu";
    			  break;
    		  case 3:
    		      System.out.println("\nSenkin rotta! Et selvi‰ el‰m‰ss‰ n‰in!");
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
        System.out.println("\nSeuraavaksi saat p‰‰tt‰‰ mihin kouluun haet ensimmaisess‰ yhteishaussasi!");
	}

	private static String syntym‰() {
		
		int syntym‰paikka = 0;
		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
		String kaupunki = null;
		
		System.out.println("\nValitse syntym‰paikkasi:\n1) Vantaa\n2) Oulu\n3) Turku");
		syntym‰paikka = lukija.nextInt();
		switch(syntym‰paikka) {
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