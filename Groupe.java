public class Groupe {
	private Cellule chefDeFile;
	public Groupe () {
		chefDeFile = null;
	}
	public void prendreTete (Robot r) {
		if (r.nomCorrect()) {
			Cellule c1 = new Cellule(r);
			c1.setSuivant(chefDeFile);
			chefDeFile = c1;
		}	
	}
	public boolean notnull() {
		if (chefDeFile != null)
			return true;
		else
			return false;
	}
	public void affiche() {
		if (this.notnull()) {
			Cellule tmp = chefDeFile;
			while (tmp != null) {	
				System.out.println(tmp.getRobot().description());
				tmp = tmp.getSuivant();
			}
		}
	}
	 public void ajouteNouveau(Robot r) {
		 if (r.nomCorrect()) {
				Cellule tmp = chefDeFile;
			 while(tmp.getSuivant() != null) {
				 tmp = tmp.getSuivant();
			 }
			 tmp.setSuivant(new Cellule (r));
		 }
	 }
	 public int numerologie() {
		 Cellule tmp = chefDeFile;
		 int compteur = 0;
			while (tmp != null) {	
				compteur = compteur + tmp.getRobot().getNom();
				tmp = tmp.getSuivant();
			}
			return compteur % 9;
	 }
	 public String bandName() {
		 Cellule tmp = chefDeFile;
		 String compteur = "";
			while (tmp != null) {	
				compteur = compteur + tmp.getRobot().getNom();
				tmp = tmp.getSuivant();
			}
			return compteur;
	 }
	 public void chantez() {
		 Cellule tmp = chefDeFile;
			while (tmp != null) {	
				System.out.println(tmp.getRobot().chante()); 
				tmp = tmp.getSuivant();
			}
	 }
}