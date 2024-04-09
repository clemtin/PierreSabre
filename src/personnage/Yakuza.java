package personnage;

public class Yakuza extends Humain {
	public Yakuza(String nom, String boissonFav, int argentPosseder, String clan) {
		super(nom, "whisky", argentPosseder);
		this.clan=clan;
		this.reputation=1;


	}
	
	
	private String clan;
	private int reputation;
	
	
	
	
	public int getReputation() {
		return reputation;
	}
	
	
	
	
	
	public void estorquerQql(Commerçant cible) {
		int argentVolé = cible.seFaireExtorquer();
		gagnerArgent(argentVolé);
        parler("J'ai piqué " + argentVolé + " sous à " + cible.getNom() + ". Hi ! Hi !");
        parler("Je suis " + clan + " et j'ai maintenant " + argentPosseder + " sous.");
		
	}







	public int perdre() {
		reputation-=1;
		int perte = getArgentPosseder();
		parler("J'ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		this.perdreArgent(perte);
		return perte;
	}
	
	public void gagner(int gain) {
		reputation+=1;
		parler(" Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan +
			" ? Je l'ai dépouillé de ses " + gain + " sous.");
		this.gagnerArgent(gain);
		
	}
	
	
	
}
