package histoire;

import personnage.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof","Kombucha",54);
		Prof.direBonjour();
		Prof.acheter("boisson",12);
		Prof.acheter("kimono", 50);
	}
}
