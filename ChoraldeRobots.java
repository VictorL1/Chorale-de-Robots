
public class ChoraldeRobots {

	public static void main(String[] args) {
		Robot r1 = new Robot ('a', "lalalalalala");
		Robot r2 = new Robot ('b', "lololo");
		Robot r3 = new Robot ('c', "tutututu");
		Robot r4 = new Robot ('?', "yoyoyoyoyoyoy");
		Groupe RobBand = new Groupe();
		
		RobBand.prendreTete(r2);
		RobBand.ajouteNouveau(r1);
		RobBand.ajouteNouveau(r3);
		RobBand.ajouteNouveau(r4);
		RobBand.affiche();
		System.out.println(RobBand.bandName());
		RobBand.chantez();
		System.out.println("Energie restante : "+ r2.getEnergie());
		System.out.println("Energie restante : "+ r1.getEnergie());
		System.out.println("Energie restante : "+ r3.getEnergie());
		RobBand.chantez();
		RobBand.chantez();

	}

}
