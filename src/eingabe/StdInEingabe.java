package eingabe;

import java.util.Scanner;

public class StdInEingabe {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		//
		System.out.println("Enter first name");
		String firstname = eingabe.nextLine();
		//
		System.out.println("Firstname: " + firstname);
		//
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
