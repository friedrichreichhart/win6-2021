package basics;

import java.util.Iterator;

public class EinMalEins {

	public static void main(String[] args) {
		//
		// i = i + 1;
		// i += 1;
		// i++;
		//
		// i = i - 1;
		// i -= 1; i += -1;
		// i--;
		// zeilenumbruch
		System.out.println();
		//
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
		}

	}

}
