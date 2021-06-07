package eingabe;

import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		while (true) {

		if (eingabe.hasNextInt()) {
			int zahl = eingabe.nextInt();
			
			System.out.println("Zahl: " + zahl);
		}
		//
		if (eingabe.hasNext("[+-\\/*]")) {
			String zeichen = eingabe.next("[+-\\\\/*]");
			
			System.out.println("zeichen: " + zeichen);
		}
		//
		eingabe.close();
		}

	}

}
