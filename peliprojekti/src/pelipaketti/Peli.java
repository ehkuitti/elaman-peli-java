// Projektin nimi on peliprojekti, paketin nimi on pelipaketti ja luokan nimi on Peli. Huomioi kirjainkoot.

package pelipaketti;

import java.util.Scanner;

public class Peli {

	public static void main(String[] args) {
		
		// T‰h‰n alkutietoja, kuten muuttujia
		
		String nimi; 
		Scanner lukija = new Scanner(System.in); //tekstin lukemiseen
		Scanner laskija = new Scanner(System.in); // lukujen lukemiseen
		
		// Varsinainen koodi alkaa
		
		System.out.print("Tervetuloa El‰m‰‰n! Anna nimesi: ");
		nimi = lukija.nextLine();
		System.out.println(nimi + " on hieno nimi!");
		
		lukija.close();  // Pidet‰‰n lukijoiden sulkemiset p‰‰metodin viimeisell‰ rivill‰, jotta
		laskija.close();  // niit‰ voi k‰ytt‰‰ koko ohjelman ajan.

	}

}