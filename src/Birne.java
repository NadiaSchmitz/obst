
public class Birne extends Obst {

	public Birne() {
		super();
		super.name = "Birne";
	}
	
	public Birne(String farbe, double hoehe, double breite) {
		super(farbe, hoehe, breite);
		super.name = "Birne";
	}

	@Override
	public int CompareTo(Obst o) {
		return 0;
	}

	@Override
	public String getGeschmack() {
		return "süß";
	}

	@Override
	public double getGewicht() {
		return 1.1 * 4/3 * Math.PI * Math.pow(getBreite()/2.0, 3.0) * 1.5;
	}
	
}
