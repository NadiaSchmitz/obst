
public abstract class Obst implements Comparable<Obst> {

	protected String name;
	private String farbe;
	private double hoehe;
	private double breite;
	
	public Obst() {};
	
	public Obst(String farbe, double hoehe, double breite) {
		this.farbe = farbe;
		this.hoehe = hoehe;
		this.breite = breite;
	}

	public String getName() {
		return name;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	@Override
	public int compareTo(Obst obst) {
		int result = 0;
		
		if (this.hoehe == obst.getHoehe()) {
			result = 0;
		} else if (this.hoehe > obst.getHoehe()) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}
	
	public abstract String getGeschmack();
	
	public abstract double getGewicht();
	
	public void infoString() {
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %6.6s", name, this.getFarbe(), this.getHoehe(), getBreite(), getGeschmack(), getGewicht());	
		System.out.println();
	}
}
