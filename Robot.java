public class Robot{
	
	private final char nom;//lettre entre ’a’ et ’z’
	private int energie;
	private final String texte; //ce qu’il doit dire
	
	public Robot(char nom, String paroles){
		this.nom = nom;
		// on donne une énergie entre 10 et 20
		energie = 10 + (int)(Math.random() * 11);
		texte = paroles;
	
	}
	
	public String description () {
		return "Robot "+ nom +" dit " + texte + " quand il parle et a " + energie +" points d’énergie";
	}
	
	public boolean nomCorrect () {
		if (nom >= 'a' && nom <= 'z')
			return true;
		else 
			return false;
	}
	
	public String chante() {
		int j = this.nom - 'a' + 1;
		String chant = "";
		if (this.energie != 0) {
			for (int i=0; i<j; i++) {
				chant = chant + texte;
			}
			this.energie = this.energie - 10;
			if (this.energie < 0) {
				this.energie = 0;
			}
			
			return chant;
		}
		else {
			String erreur = "Le robot n'a plus de voix !";
			return erreur;
		}
	}
	
	
	
	
	
	public char getNom() {
		return nom;
	}
	
	public String getTexte() {
		return texte;
	}
	
	public int getEnergie() {
		return energie;
	}
}


