
public class Main {

	public static void main(String[] args) {

		Apfel apfel_1 = new Apfel("Rot", 7, 8);
		Apfel apfel_2 = new Apfel("Grün", 6, 7);
		
		Birne birne_1 = new Birne("Grün", 10, 6);
		Birne birne_2 = new Birne("Gelb", 7, 5);
		
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s \n", "Name", "Farbe", "Höhe", "Breite", "Geschmack", "Gewicht");
		apfel_1.infoString();
		apfel_2.infoString();
		birne_1.infoString();
		birne_2.infoString();
		
		System.out.println();
		
		System.out.println(apfel_1.compareTo(apfel_2));
		System.out.println(apfel_1.compareTo(birne_1));
		System.out.println(apfel_1.compareTo(birne_2));

	}

}
