package personnage;

public class Commerçant extends Humain{

	public Commerçant(String nom, int argentPosseder) {
		super(nom, "Thé", argentPosseder);

	}
	
	public int seFaireExtorquer() {
		int ancienArgent = getArgentPosseder();
		perdreArgent(ancienArgent);
		parler("j'ai tout perdu! Le monde est trop injuste ...");
		return ancienArgent;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! je te remercie généreux donateur !");
	}
	
	
}
