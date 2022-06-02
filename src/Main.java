import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Apfel apfel_1 = new Apfel("Rot", 7, 8);
		Apfel apfel_2 = new Apfel("Grün", 6, 7);
		
		Birne birne_1 = new Birne("Grün", 10, 6);
		Birne birne_2 = new Birne("Gelb", 7, 5);
		
		Obst obstkorb[] = {apfel_1, apfel_2, birne_1, birne_2};
		
		System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s \n", "Name", "Farbe", "Höhe", "Breite", "Geschmack", "Gewicht");
		apfel_1.infoString();
		apfel_2.infoString();
		birne_1.infoString();
		birne_2.infoString();
		
		System.out.println();
		
		System.out.println("Unsortierte Obst:");
		for (int i = 0; i < 4; i++) {
			obstkorb[i].infoString();
		}
		
		System.out.println();
		
		Arrays.sort(obstkorb);
		
		System.out.println("Sortierte Obst:");
		for (int i = 0; i < 4; i++) {
			obstkorb[i].infoString();
		}
		
		
		
	}

}
