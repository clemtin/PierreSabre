package personnage;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argentPosseder;

	public Humain(String nom, String boissonFav, int argentPosseder) {
		this.nom=nom;
		this.boissonFav=boissonFav;
		this.argentPosseder=argentPosseder;
		}


	public String getNom()
	{
		return nom;
	}

	public String getBoissonFav()
	{
		return boissonFav;
	}

	public int getArgentPosseder()
	{
		return argentPosseder;
	}

	
	protected void parler(String texte) {
		System.out.println(  "L'humain "+ nom + " "+ texte);
	}


	public void direBonjour()
	{
		parler("Bonjour! Je m'apelle " + nom + " et j'aime boire du " + boissonFav);
	}


	public void boire() {
		parler("Mm un bon verre de "+ boissonFav + "! GLOUPS");
	}

	protected void gagnerArgent(int gain) {
		 this.argentPosseder +=gain;
	}
	
	protected void perdreArgent(int perte) {
		 this.argentPosseder -=perte;
	}
	
	public void acheter(String bien, int prix) {
		if (this.argentPosseder< prix) {
			parler("je n'ais que" + argentPosseder + "Je ne peux même pas m'offrir un " +bien+ " à " +prix+ " sous ");
		}
		else {
			parler("j'ai" + this.argentPosseder + " en poche " + " je vais pouvoir m'offrir ce " + bien + " a " + prix);
			this.argentPosseder -=prix;
		}
	}

}

