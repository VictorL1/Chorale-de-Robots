
public class Cellule {
	private Robot rob;
	private Cellule suivant;
	
	public Cellule (Robot robot, Cellule cellule) {
		rob = robot;
		suivant = cellule;
	}
	
	public Cellule (Robot robot) {
		this(robot, null);
	}
	
	public Cellule getSuivant() {
		return suivant;
	}
	
	public void setSuivant(Cellule cellule) {
		this.suivant = cellule;
	}
	
	public Robot getRobot() {
		return rob;
	}
}
