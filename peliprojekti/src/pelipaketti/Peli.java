// Projektin nimi on peliprojekti, paketin nimi on pelipaketti ja luokan nimi on Peli. Huomioi kirjainkoot.

package pelipaketti;

import java.util.*;

public class Peli {

	public static void main(String[] args) {

		// Tähän alkutietoja, kuten muuttujia
		String syntymäpaikka; // kaupunki johon synnyt
		String nimi; // käyttäjän nimi
		String ekaAste; // ensimmäisen asteen tutkinto
		String tokaAste; // toisen asteen tutkinto
		String opinnot; // opintosuuntaus
		String työ1; // työ
		String tikoTyö; // tiko työ
		String työ2;
		String sosiaaliTyö;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		Scanner laskija = new Scanner(System.in); // lukujen lukemiseen
		
		// Varsinainen koodi alkaa
		System.out.println("Tervetuloa pelaamaan Tomte™ Corperationin®\n\n\t\tELÄMÄN_PELIÄ©    :)\n");
		System.out.print("Anna nimesi: ");
		nimi = lukija.nextLine();
		System.out.println("\n" + nimi + " on hieno nimi!");

		syntymäpaikka = syntymä(); // muuttuja syntymäpaikka tulostaa kaupungin nimen
									// peliOhi(); - metodi lopettaa pelin

		if (syntymäpaikka == "Vantaa") { // Vantaa polku metodeina
			lapsuus(); // Tulostaa vuosia
			ekaAste = yhteishaku1(); // Kysyy ensimmäisen asteen tutkinnon ekaAste tulostaa tutkinnon nimen
			ruletti3();
			tokaAste = yhteishaku2(); // Kysyy toisen asteen tutkinnon tokaAste tulostaa tutkinnon nimen
			opinnot = opintosuuntaus(); // Kysyy mitä haluaa opiskella
			bileet(); // metodi tekee listan jossa kysyy sanoja
			ruletti();
			if (opinnot == "Tiko"){         // riippuen opiskelupaikasta, kysyy mitä haluaa työskennellä
				työ1 = työura1();           // Kysyy työstä
			} else {
				työ2 = työura2();
            }
            cursedRuletti();
            
		} else if (syntymäpaikka == "Oulu") { // Oulun polku metodeina
			lapsuus();
			ekaAste = yhteishaku1();
			ruletti3();
			tokaAste = yhteishaku2();
			opinnot = opintosuuntaus();
			bileet();
			ruletti();
			if (opinnot == "Tiko"){         
            	työ1 = työura1(); // Kysyy työstä
           	} else {
            	työ2 = työura2();
            }
            cursedRuletti();
                        
		} else { // Jokaisen kysymyksen 3. vaihtoehto lopettaa pelin
			System.out.print("\nEi kai nyt kukaan täysijärkinen haluaisi Turkuun syntyä...");
			peliOhi();

		}
		lukija.close(); // Pidetään lukijoiden sulkemiset päämetodin viimeisellä rivillä, jotta
		laskija.close(); // niitä voi käyttää koko ohjelman ajan.

	}
	
	private static void ruletti() {
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		System.out.print("\n   __,_____\n  / __.==--''\n /#(-'\n `-'");
		System.out.print("\nKadulla oleva kaiffari pakottaa sinut pelaamaan venäläistä rulettia.");
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(6) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 6){                   // luku joka tappaa
            System.out.print("\nKuolit");
            peliOhi();
        } else {
            System.out.print("\nSelvisit. Elämäsi jatkuu. Toistaiseksi...\n\n");
            }
	}

	private static void ilkivalta() {
		
		Scanner skanneri = new Scanner (System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
        String sana;
        System.out.println("\nMontako sanaa tahdot kirjoittaa?");
        int maara = skanneri.nextInt();
        System.out.println("\nAnna sanat: ");

        for (int i = 0; i < maara + 1; i++) {
            sana = skanneri.nextLine();
            lista.add(sana);
        }

        System.out.print("\nKirjoitit sanat: ");
        for (String sanoja:lista) {
            System.out.println(sanoja);
            
        }
		System.out.println("kirjaston seinään.\n\nPoliisi näki tekosi ja määräsi sinulle 800 euroa sakkoja.");
	}
	private static void bileet() {

        int kylläEi = 0;
		Scanner lukija = new Scanner (System.in);

		System.out.println("\nKaverisi ehdottaa ilkivaltaa.\n\nHaluatko osallistua? \n1) Kyllä\n2) En");
        kylläEi = lukija.nextInt();

        while(true) {
            if (kylläEi > 0 && kylläEi < 3){
                switch(kylläEi){
                    case 1:
                    	    ilkivalta();
                    	    break;
                    case 2:
                    	    System.out.println("\nHienoa, lainkuuliaista toimintaa!");
                }
                    break;
        	} else {
            	System.out.print("\nAnna luku 1 tai 2: ");
            	kylläEi = lukija.nextInt();
                }
          }
}

	private static String opintosuuntaus() {

		int tokaAste = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String tokaTutkinto = null;

		System.out.println(
				"\nMitä tahdot opiskella korkeakoulussa?\n1) Tietojenkäsittelyä\n2) Sosiaalitieteitä\n3) Kauppatieteitä ja liiketaloutta");
		tokaAste = lukija.nextInt();
					
		while(true) {
			if (tokaAste > 0 && tokaAste < 4) {
				switch(tokaAste) {
					case 1:
						System.out.println("\nOikein!");
						tokaTutkinto = "Tiko";
						opiskeluaika();
						break;
					case 2:
						System.out.println("\nTärkeä ala tämäkin!");
						tokaTutkinto = "Sosiaali";
						opiskeluaika();
						break;
					case 3:
						System.out.println("\nEt oo tosissas...");
						tokaTutkinto = "liiketalous";
						peliOhi();
				 	}	
				break;
			} else {
				System.out.print("\nAnna luku 1-3: ");
				tokaAste = lukija.nextInt();
		        }
		    }
		return tokaTutkinto;
        }

	private static void peliOhi() {
		System.out.println("\n\nPeli ohi!\n\nKiitos, kun pelasit!");
		System.out.println("\n\n\t\t*CREDITS:*\n\nLead Developer: Eetu Kuittinen\nGameplay Designer: Miika Mononen\nSFX editor: Marlo Pietarinen\n\nSpecial thanks to Kaiffari and Jasse\n\nAll rights reserved under Tomte™ Corperation®");
		System.exit(0);
	}

	private static void opiskeluaika() {
		int i = 1;

		do {
			System.out.println("Niin kului " + i + ". vuotesi opiskelujen parissa.");
			i++;
		} while (i <= 5);
	}

	private static String yhteishaku2() {

		int tokaAste = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String tokaTutkinto = null;

		System.out.println("\nMihin korkeakouluun haluat hakea?\n1) Yliopisto\n2) Ammattikorkeakoulu\n3) En minnekään");
		tokaAste = lukija.nextInt();
		while (true) {
			if (tokaAste > 0 && tokaAste < 4) {
				switch (tokaAste) {
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
				break;
			} else {
        System.out.print("\nAnna luku 1-3: ");
        tokaAste = lukija.nextInt();
			}
		}

		return tokaTutkinto;

	}

	private static String yhteishaku1() {

		int ekaAste = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String ekaTutkinto = null;

		System.out.println("\nMihin kouluun haluat hakea?\n1) Lukio\n2) Ammattikoulu\n3) En minnekään");
		ekaAste = lukija.nextInt();
		while(true) {
        if (ekaAste > 0 && ekaAste < 4) {
        	switch (ekaAste) {
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
		   	break;
		  } else {
        System.out.print("\nAnna luku 1-3: ");
        ekaAste = lukija.nextInt();
		    }
		}
		
		return ekaTutkinto;
	}

	private static void lapsuus() {
		System.out.println("\nLapsuutesi kuluu...");
		for (int i = 0; i <= 15; i += 5) {
			System.out.println("Olet nyt " + i + " vuotta vanha");
		}
		System.out.println("\nSeuraavaksi saat päättää mihin kouluun haet ensimmaisessä yhteishaussasi!");
	}

	private static String syntymä() {

		int syntymäpaikka = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String kaupunki = null;

		System.out.println("\nValitse syntymäpaikkasi:\n1) Vantaa\n2) Oulu\n3) Turku");
		syntymäpaikka = lukija.nextInt();
		
		while(true) {  
		if (syntymäpaikka > 0 && syntymäpaikka < 4) {
			switch (syntymäpaikka) {
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
			break;
		} else {
        System.out.print("\nAnna luku 1-3: ");
        syntymäpaikka = lukija.nextInt();
		}
	
	
		}
		return kaupunki;
	}

	private static String työura1() {

		int työ1 = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String tikoTyö = null;

		System.out.println("\nMikä on tuleva ammattisi?\n1) Koodari\n2) Yrittäjä\n3) Myyjä");
		työ1 = lukija.nextInt();
		
		
        while(true) {
		if (työ1 > 0 && työ1 < 4) {
			switch (työ1) {
		    case 1:
		    	System.out.println("\nSelkäkivut ja raha odottavat sinua.");
		    	tikoTyö = "Koodata";
			break;
		    case 2:
			    System.out.println("\nPitkät päivät edessä, kova työ palkitaan.");
			    tikoTyö = "Yrittäjä";
			break;
	    	case 3:
		    	System.out.println("\nMites sulla noi liittymä asiat oikein on?");
			    tikoTyö = "Myyjä";
			    peliOhi();
	        }
		    break;
		} else {
        System.out.print("\nAnna luku 1-3: ");
        työ1 = lukija.nextInt();
		    }		
        }
		return tikoTyö;
        }

	private static String työura2() {

		int työ2 = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String sosiaaliTyö = null;

		System.out.println("\nMitä tahdot tehdä työksesi?\n1) Toimia kuraattorina\n2) Ajaa ambulanssia\n3) Pestä");
		työ2 = lukija.nextInt();
		
		
		while(true) {
        if (työ2 > 0 && työ2 < 4) {
            switch (työ2) {
		    case 1:
		    	System.out.println("\nHoivaamisen iloa!");
			    sosiaaliTyö = "Hoivata";
			break;
		    case 2:
		    	System.out.println("\nKovaa ajoa");
		    	sosiaaliTyö = "Ajaa ambulanssia";
				ruletti2();
				
			break;
		    case 3:
		    	System.out.println("\nPeset loppu elämän");
		    	sosiaaliTyö = "Pestä";
			    peliOhi();
		    }
			break;
		} else {
        System.out.print("\nAnna luku 1-3: ");
        työ2 = lukija.nextInt();
		        }
         }
		return sosiaaliTyö;
	    }

private static void ruletti2() {
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		
		
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(3) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 3){                   // luku joka tappaa
            System.out.print("\nRankka sade yllättää ja tie on todella liukas...");
            System.out.print("\nAjoit kolarin");
            peliOhi();
        } 
	}
	private static void ruletti3() {
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		
		
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(3) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 3){                   // luku joka tappaa
            System.out.print("\nViriti derpi moposi kulkemaan 100km/h ");
            System.out.print("\nKeulit tiellä ja menetät mopon hallinnan ");
			System.out.print("\nKaadut ja loukkaannut, jonka seurauksena halvaannut keskivartalosta alaspäin ");
            peliOhi();
        } 
	}

private static void cursedRuletti() {
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		
		
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(5) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 1){                   // luku joka tappaa
            System.out.print("\nTyö painaa liikaa päälle ja sairastut vakavaan masennukseen");
            System.out.print("\nHirttäydyt yksiöösi");
            peliOhi();
        } 
	}
}