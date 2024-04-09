package histoire;

import personnage.Humain;
import personnage.Commerçant;



public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof","Kombucha",54);
		Prof.direBonjour();
		Prof.acheter("boisson",12);
		Prof.boire();
		Prof.acheter("kimono", 50);
		
		Commerçant Marco = new Commerçant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoirArgent(15);
		Marco.boire();
		
		
	}
}
