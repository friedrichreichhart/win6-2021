package eingabe;

import java.util.Scanner;

public class Schleife2Test {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		while (true) {
			if (eingabe.hasNext("[q]")) {
				System.out.println("Programm beendet");
				break; // die Schleife beenden, aus der Schleife "herausbrechen"
			}
			//
			// zahl
			// zeichen
			// beenden
			if (eingabe.hasNextInt()) {
				int zahl = eingabe.nextInt();
				System.out.println("Zahl: " + zahl);
				continue;
			}
			//
			if (eingabe.hasNext("[+-\\/*]")) {
				String zeichen = eingabe.next("[+-\\\\/*]");
				System.out.println("zeichen: " + zeichen);
				continue;
			}
			//
			if (eingabe.hasNext())
				eingabe.next();
		}

	}

}
