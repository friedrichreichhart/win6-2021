package eingabe;

import java.util.Scanner;

public class Schleife2Test {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		boolean firstNumber = true;
		int zahl1, zahl2 = 0;
		
		while (true) {
			if (eingabe.hasNext("[q]")) {
				System.out.println("Programm beendet");
				break; // die Schleife beenden, aus der Schleife "herausbrechen"
			}
			//
			// zahl
			// zeichen
			// beenden
			//if (eingabe.hasNextInt()) {
			if (eingabe.hasNext("[0-9]*")) {
				if (firstNumber) {
					zahl1 = eingabe.nextInt();
					firstNumber = false;
				}
				else {
					zahl2= eingabe.nextInt();
				}
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
