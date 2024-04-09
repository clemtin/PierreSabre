package personnage;

public class Humain {
	protected String nom;
	private String boissonFav;
	protected int argentPosseder;
	private int memoire=30;
	int compteur=0;
	int nbConnaissance=0;
	private Humain[] TabConnaissance = new Humain[memoire];
			
			
			
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
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		memoriser(autreHumain);
		
		
		
	}
	
	public void memoriser(Humain autreHumain) {
		if (compteur<30)
		{
		nbConnaissance=compteur;
		TabConnaissance[compteur]=autreHumain;
		compteur++;
		}
		
		else
		
		{
		int x=compteur%30;
		TabConnaissance[x]=autreHumain;
		compteur++;	
		nbConnaissance=30;
		}
		

	}
	
	
	
	public void listerConnaissance( ) {
		String s ="Je connais beaucoup de monde dont :";
		
		
		for (int i = 0; i < nbConnaissance ; i++ ) {
			s+=" "+(TabConnaissance[i].getNom());
		}
		parler(s);
	}
	
	

}

