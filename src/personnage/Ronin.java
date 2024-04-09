package personnage;

public class Ronin extends Humain {

	public Ronin(String nom, int argentPosseder,int honneur ) {
		super(nom, "soshu" , argentPosseder );

	}

	int honneur = 1;
	
	public void donner(Commerçant beneficiaire) {
		int don = getArgentPosseder()/10;
		honneur+=1;
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		beneficiaire.recevoirArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (adversaire.getReputation() <= honneur*2) {
			honneur+=1;
			parler("Je t’ai eu petit yakusa!");
			this.gagnerArgent(adversaire.perdre());
			} else {
				honneur-=1;
				parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
				adversaire.gagner(getArgentPosseder());
				this.perdreArgent(getArgentPosseder());
			}
	}
	
	
	
	    public int getHonneur() {
	        return honneur;
	    }

	    public void augmenterHonneur() {
	        honneur++;
	    }
	}
	
	

