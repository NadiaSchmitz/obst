
public class Apfel extends Obst {

	public Apfel() {
		super();
		super.name = "Apfel";
		
	}
	
	public Apfel(String farbe, double hoehe, double breite) {
		super(farbe, hoehe, breite);
		super.name = "Apfel";
	}

	@Override
	public int CompareTo(Obst o) {
		return 0;
	}

	@Override
	public String getGeschmack() {
		return "sauer";
	}

	@Override
	public double getGewicht() {
		return 0.84 * 4/3 * Math.PI * Math.pow(getBreite()/2.0, 3.0) * 0.83;
	}
	
}
