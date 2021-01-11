package basics;

public class FirstSteps {

	public static void main(String[] args) {
		
		// kommentar
		
		// noch ein kommentar
		
		System.out.println("Hallo 2021!");
		
		System.out.println("Schnell gemacht");
		
		System.out.println("template vervollständigen mit syso und STRG+SPACE");
		
		// Variablen
		// Zahlen-Variable - Ganzzahlen
		// int - Variable
		int zahl1 = 5;
		int zahl2 = 10;
		
		System.out.print("zahl1: ");
		System.out.println(zahl1);
		System.out.print("zahl2: ");
		System.out.println(zahl2);
		//
		int ergebnis_a;
		ergebnis_a = zahl1 + zahl2;
		System.out.print("Ergebnis von " + zahl1 + " addiert mit " + zahl2 + " ist:");
		System.out.println(ergebnis_a);
		//
		
		// schleife - for-schleife
		//
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		//
		for (int zaehler = 1; zaehler <= 10; zaehler = zaehler + 1) {
			System.out.println(zaehler);
		}
		//
		
		
		

	}

}

