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
		System.out.println("Tervetuloa pelaamaan Tomte™ Corperationin®\n\n\t\tELÄMÄN_PELIÄ©    :)\n"); //toivotetaan pelaaja tervetulleeksi
		System.out.println("Ohjeet: Vedä aluksi console IDE:ssäsi niin isoksi kuin mahdollista. Tämä helpottaa pelaamista huomattavasti. Tämän jälkeen klikkaa \"Anna nimesi\" -rivin lopusta tyhjältä alueelta.\nVastaa pelissä kirjoittamalla numero tai sana pyydetyn mukaisesti ja painamalla sitten enteriä. Hyviä pelihetkiä toivottaa Tomten väki!\n"); //syötetään ohjeet
		System.out.print("Anna nimesi: "); //kysytään pelaajan nimeä
		nimi = lukija.nextLine(); //scanneri taltio nimen
		System.out.println("\n" + nimi + " on hieno nimi!"); //nimi tulostuu

		syntymäpaikka = syntymä(); // muuttuja syntymäpaikka tulostaa kaupungin nimen
									// peliOhi(); - metodi lopettaa pelin

		if (syntymäpaikka == "Vantaa") { // Vantaan polku metodeina
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
            cursedRuletti(); //mahdollisuus hävitä peli vielä kerran ennen voittoa
            lopetus(); //pelin voittamisen metodi
            peliOhi(); //pelin lopetusmetodi
            
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
            lopetus();
            peliOhi();
                        
		} else { // Jokaisen kysymyksen 3. vaihtoehto lopettaa pelin (paitsi tietovisoissa)
			System.out.print("\nEi kai nyt kukaan täysijärkinen haluaisi Turkuun syntyä...");
			peliOhi();

		}
		lukija.close(); // Pidetään lukijoiden sulkemiset päämetodin viimeisellä rivillä, jotta
		laskija.close(); // niitä voi käyttää koko ohjelman ajan.

	}
	
	private static void lopetus() { //pelinvoittamismetodi 
        System.out.println("\nSelvisit elämäsi loppuun asti, onnittelut ja pitkää ikää!\n\n\n\t*VOITIT PELIN*");
	}

	private static void tentti() {


		int pistemäärä = 0; //taltioi pistemäärän
		int vastaus = 0; //taltioi vastauksen

		Scanner laskija = new Scanner (System.in);

	    System.out.println("Kuinka monta norsulajia on olemassa?\n1) 2\n2) 3\n3) 5");
	    vastaus = laskija.nextInt();

	    if (vastaus == 2) {
	    	System.out.println("\nOikein! Oli muuten helppo :]");
	    	pistemäärä++; //tämä rivi kasvattaa pistemäärää aina kun vastaus menee oikein
	    } else {
	    	System.out.println("\nVäärin! Eikö tämä nyt ole ihan yleistietoa... ¯\\_(ツ)_/¯");
	    }
	    
	    System.out.println("\nKetä Disney-prinsessoista nähdään elokuvissa vähiten? \n1) Ruusunen\n2) Jasmine\n3) Lumikki");
	    vastaus = laskija.nextInt();

	    if (vastaus == 1) {
	    	System.out.println("\nOikein! Läksyt selvästikin luettu!");
	    	pistemäärä++;
	    } else {
	    	System.out.println("\nVäärin! Aika katsoa lisää piirreetyjä! =)");
	    }
	    System.out.println("\nIlman laskinta: Paljonko on 30% 546:sta? \n1) 163.8\n2) 166.6\n3) 173.95");
	    vastaus = laskija.nextInt();

	    if (vastaus == 1) {
	    	System.out.println("\nOikein! Matikkapäätäkin löytyy!");
	    	pistemäärä++;
	    } else {
	    	System.out.println("\nVäärin! Ei kai tämä niin vaikea ollut?");
	    }
	    System.out.println("\nMaantietoa: Mikä on Yhdysvaltain pääkaupungin *muodollinen* (formaali) nimi? \n1) Washington\n2) Washington, D.C.\n3) District Of Columbia");
	    vastaus = laskija.nextInt();

	    if (vastaus == 3) {
	    	System.out.println("\nOikein! Tämä oli paha!");
	    	pistemäärä++;
	    } else {
	    	System.out.println("\nEipä ollu! Washington on osavaltio Yhdysvaltain länsirannikolla ja Washington, D.C. on virallinen *epäformaali* nimi.");
	    }
        System.out.println("\nMika ainesosa ei kuulu Boulevardier-cocktailiin? \n1) Viski\n2) Campari\n3) Rommi");
	    vastaus = laskija.nextInt();

	    if (vastaus == 3) {
	    	System.out.println("\nOikein! Tullut useinkin maisteltua?");
	    	pistemäärä++;
	    } else {
	    	System.out.println("\nVäärin! Et taida olla alkoholin perään?");
	    }
	    
	    if (pistemäärä == 5) {
	    	System.out.println("\nArvosanasi on " + pistemäärä + "/5. Senkin hikke!");
	    } else if (pistemäärä > 1 && pistemäärä < 5) {
	        System.out.println("\nArvosanasi on " + pistemäärä + "/5. Olet täysin keskiverto ihminen, hyvää työtä ༼ つ ◕◕ ༽つ");
	    } else {
	        System.out.println("\nArvosanasi on " + pistemäärä + "/5. Yritä ees...");
	    }
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
            System.out.print("\nSelvisit. Elämäsi jatkuu. Toistaiseksi...\n"); //sattumia voi tulla myös myöhemmin, siksi toistaiseksi
            }
	}

	private static void ilkivalta() {
		
		Scanner skanneri = new Scanner (System.in); //luodaan oma skanneri metodiin
		
		ArrayList<String> lista = new ArrayList<String>(); //lista sanojen tallentamista ja tulostamista varten
        String sana; //taltioi syötteen
        System.out.println("\nPäätätte kaverisi kanssa kirjoittaa sanoja seinään. Montako sanaa tahdot kirjoittaa?");
        int maara = skanneri.nextInt();
        System.out.println("\nKirjota sanat (paina enteriä sanojen välissä): ");

        for (int i = 0; i < maara + 1; i++) { //silmukka pyörii, kunnes haluttu lukumäärä täyttyy
            sana = skanneri.nextLine();
            lista.add(sana); // halutut sanat listalle tulostusta varten
        }

        System.out.print("\nKirjoitit sanat: \n");
        for (String sanoja:lista) {
            System.out.println(sanoja);
            
        }
		System.out.println("\nkirjaston seinään.\n\nPoliisi näki tekosi ja määräsi sinulle 800 euroa sakkoja.");
	}
	private static void bileet() {

        int kylläEi = 0; //taltioi syötteen
		Scanner lukija = new Scanner (System.in); //mahdollistaa syötteen taltioinnin

		System.out.println("\nKaverisi ehdottaa ilkivaltaa.\n\nHaluatko osallistua? \n1) Kyllä\n2) En");
        kylläEi = lukija.nextInt();

        while(true) { //pyörii niin kauan, kun on tosi
            if (kylläEi > 0 && kylläEi < 3){
                switch(kylläEi){ //vaihtoehdot 1 ja 2
                    case 1: //jos kirjoittaa 1
                    	    ilkivalta(); //toteuttaa ilkivalta-metodin
                    	    break; //poistuu silmukasta
                    case 2: //jos kirjoittaa 2
                    	    System.out.println("\nHienoa, lainkuuliaista toimintaa!"); //tulostuu, jos ei osallistu ilkivaltaan
                }
                    break;
        	} else {
            	System.out.print("\nAnna luku 1 tai 2: ");
            	kylläEi = lukija.nextInt();
                }
          }
}

	private static String opintosuuntaus() {

		int tokaAste = 0; //taltioi syötteen
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String tokaTutkinto = null; //merkkijono alustetaan tyhjällä arvolla

		System.out.println(
				"\nMitä tahdot opiskella korkeakoulussa?\n1) Tietojenkäsittelyä\n2) Sosiaalitieteitä\n3) Kauppatieteitä ja liiketaloutta");
		tokaAste = lukija.nextInt();
					
		while(true) { //pyörii niin kauan, että saadaan sopiva arvo
			if (tokaAste > 0 && tokaAste < 4) { //sopivan arvon rajaaminen
				switch(tokaAste) {
					case 1:
						System.out.println("\nOikein!\n");
						tokaTutkinto = "Tiko";
						opiskeluaika();
						break;
					case 2:
						System.out.println("\nTärkeä ala tämäkin!\n");
						tokaTutkinto = "Sosiaali";
						opiskeluaika();
						break;
					case 3:
						System.out.println("\nEt oo tosissas...\n");
						tokaTutkinto = "liiketalous";
						peliOhi();
				 	}	
				break; //poistutaan silmukasta
			} else {
				System.out.print("\nAnna luku 1-3: "); //mikäli syöte ei täytä ehtoja
				tokaAste = lukija.nextInt();
		        }
		    }
		return tokaTutkinto; //palautetaan haluttu tutkinto
        }

	private static void peliOhi() {
		System.out.println("\n\nPeli ohi!\n\nKiitos, kun pelasit!");
		System.out.println("\n\n\t\t*CREDITS:*\n\n\nLead Developer: Eetu Kuittinen\nGameplay Designer: Miika Mononen\nSFX editor: Marlo Pietarinen\n\nSpecial thanks to Kaiffari and Jasse\n\n\nAll rights reserved under Tomte™ Corperation®"); //lopputekstit
		System.exit(0); //lopettaa ohjelman suorittamisen
	}

	private static void opiskeluaika() {
		int i = 1; //alustetaan muuttuja i arvolla 1

		do {
			System.out.println("Niin kului " + i + ". vuotesi opiskelujen parissa.");
			i++; //kasvatetaan yhdellä kunnes 5
		} while (i <= 5); //silmukka tulostaa tekstiä vuosien arvoilla 1-5
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
			        System.out.println("\nHyvä valinta! Lukiossassi järjestetään tentti, jossa kysytään seuraavia asioita (listalta puuttuvan numeron syöttäminen tulkitaan vääräksi vastaukseksi) :\n");
			        tentti(); //lukion tietovisametodi
			        System.out.println("\nValmistuit ylioppilaaksi ja järjestit huikeat valmistujaisjuhlat!");
			        ekaTutkinto = "Lukio";
		    	break;
		        case 2:
		        	System.out.println("\nHieno valinta! Ammattikoulussasi järjestetään tentti, jossa kysytään seuraavia asioita (listalta puuttuvan numeron syöttäminen tulkitaan vääräksi vastaukseksi) :\n");
		        	koe(); //ammattikoulun tietovisametodi, eri kysymykset kuin lukiossa
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
		System.out.println("\nLapsuutesi kuluu..."); //lapsuus kuluu tulostamalla for-loopilla tekstiä viiden vuoden välein
		for (int i = 0; i <= 15; i += 5) { //alkaa nollasta, kasvatetaan viidellä kunnes 15
			System.out.println("Olet nyt " + i + " vuotta vanha"); //tulostetaan i:n arvo muun tulostuksen seassa
		}
		System.out.println("\nSeuraavaksi saat päättää mihin kouluun haet ensimmaisessä yhteishaussasi!");
	}

	private static String syntymä() {

		int syntymäpaikka = 0;
		Scanner lukija = new Scanner(System.in); // tekstin lukemiseen
		String kaupunki = null;

		System.out.println("\nValitse syntymäpaikkasi:\n1) Vantaa\n2) Oulu\n3) Turku"); //pelaaja valitsee kotipaikkansa
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
		    	System.out.println("\nMites sulla noi liittymäasiat oikein on?");
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

		System.out.println("\nMitä tahdot tehdä työksesi?\n1) Toimia kuraattorina\n2) Ajaa ambulanssia\n3) Pestä"); //vaihtoehdot, jotka rajattu tähän työtehtävään
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

private static void ruletti2() { // sattumaan perustuva mahdollisuus kuolla
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
	private static void ruletti3() { // sattumaan perustuva mahdollisuus kuolla
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		
		
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(4) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 3){                   // luku joka tappaa
            System.out.print("\nViritit Derbi-moposi kulkemaan 100km/h ");
            System.out.print("\nKeulit tiellä ja menetät mopon hallinnan ");
			System.out.print("\nKaadut ja loukkaannut ");
            peliOhi();
        } 
	}

private static void cursedRuletti() { // sattumaan perustuva mahdollisuus kuolla
		// arvotaan luku väliltä 1-6, jossa 6 tappaa sinut

		int answer = 0; // tappava arvo
		
		Random luoti = new Random(); // luo uuden RNG:n "luoti"
		
		
		for(int i =0; i < 1; i++)
        {
            answer = luoti.nextInt(5) + 1; // suluissa mahdollisuuksien määrä
        }
        if (answer == 1){                   // luku joka tappaa
            System.out.print("\nTyö painaa liikaa päälle ja sairastut vakavaan masennukseen");
            System.out.print("\nYksiösi vie mennessään");
            peliOhi();
        } 
	}


private static void koe() { //ammattikoulun tietovisa


	int pistemäärä = 0;
	int vastaus = 0;

	Scanner laskija = new Scanner (System.in);

    System.out.println("Milloin ensimmäinen tietokone keksittiin?\n1) 1929-1931\n2) 1936-1938\n3) 1941-1943");
    vastaus = laskija.nextInt();

    if (vastaus == 2) {
    	System.out.println("\nOikein! Olipa helppo, vai mitä? :]");
    	pistemäärä++; //arvoa kasvatetaan aina oikean vastauksen osuessa kohdalle
    } else {
    	System.out.println("\nVäärin! Eikö tämä nyt ole ihan yleistietoa... ¯\\_(ツ)_/¯");
    }
    
    System.out.println("\nMissä sijaitsee maailman vanhin elossa oleva puu?? \n1) Yhdysvalloissa\n2) Kanadassa\n3) Saksassa");
    vastaus = laskija.nextInt();

    if (vastaus == 1) {
    	System.out.println("\nOikein! Puun nimi on Methuselah ja se sijaitsee Kalifornian osavaltiossa.");
    	pistemäärä++;
    } else {
    	System.out.println("\nVäärin! Aika kehittää puutietouttasi =)");
    }
    System.out.println("\nIlman laskinta: Paljonko on 34% 426:sta? \n1) 144,84\n2) 152,61\n3) 159,87");
    vastaus = laskija.nextInt();

    if (vastaus == 1) {
    	System.out.println("\nOikein! Matikkapäätäkin löytyy!");
    	pistemäärä++;
    } else {
    	System.out.println("\nVäärin! Ensi kerralla nukut vähemmän matikantunnilla");
    }
    System.out.println("\nMaantietoa: Mikä on Australian pääkaupunki? \n1) Wellington\n2) Sydney\n3) Canberra");
    vastaus = laskija.nextInt();

    if (vastaus == 3) {
    	System.out.println("\nOikein! Tämä oli paha!");
    	pistemäärä++;
    } else {
    	System.out.println("\nEipä ollu! Wellington on Uuden-Seelannin pääkaupunki ja Sydney on Austraalian isoin kaupunki, muttei pääkaupunki.");
    }
    System.out.println("\nMikä cocktail valmistetaan rommista, kookoskermasta, ja ananasmehusta? \n1) Valkovenäläinen \n2) Bellini\n3) Piña Colada");
    vastaus = laskija.nextInt();

    if (vastaus == 3) {
    	System.out.println("\nOikein! Maistuu, maistuu!");
    	pistemäärä++;
    } else {
    	System.out.println("\nVäärin! Et taida olla alkoholin perään?");
    }
    
    if (pistemäärä == 5) {
    	System.out.println("\nArvosanasi on " + pistemäärä + "/5. Senkin hikke!");
    } else if (pistemäärä > 1 && pistemäärä < 5) {
        System.out.println("\nArvosanasi on " + pistemäärä + "/5. Olet täysin keskiverto ihminen, hyvää työtä ༼ つ ◕◕ ༽つ");
    } else {
        System.out.println("\nArvosanasi on " + pistemäärä + "/5. Yritä ees...");
    }
}
}