package basics;

public class Abfrage {
	
	public static void main(String[] args) {
		// wenn..
		//
		System.out.println("1. ausgabe");
		if (true) {
			System.out.println("wahr");
		}
		//
		//
		System.out.println("2. ausgabe");
		if (false) {
			System.out.println("wahr");
		}
		// wenn ... dann ... sonst
		//
		System.out.println("3. ausgabe");
		// wenn
		if (true) {
			// dann:
			System.out.println("wahr");
		} else { // sonst
			System.out.println("falsch");
		}
		//
		int zahl = 6;
		zahl = 3;
		if (zahl < 5) {
			System.out.println("juhu");
		}
		int zahl2 = 1;
		if (zahl < zahl2) {
			System.out.println("zahl 1 ist kleiner als zahl2");
		}
		//
		System.out.println("array");
		//
		int[] zahlen = {3, 2, 6, 9, 1, 2, 8, 5, 3, 1};
		//
		System.out.println(zahlen.length);
		//
		System.out.println(zahlen[2]);
		System.out.println(zahlen[0]);
		//System.out.println(zahlen[8]); array index out of bounds
		System.out.println(zahlen[7]);
			
	}

}
