package Tema2;

import java.util.Scanner;

public class Proyecto2 {

	public static void main(String[] args) {

		System.out.println("Dime el nombre de tres ciudades");
		Scanner scanner = new Scanner(System.in);
		String ciudad1 = scanner.nextLine();
		String ciudad2 = scanner.nextLine();
		String ciudad3 = scanner.nextLine();

		if (ciudad1.length() < ciudad2.length() && ciudad1.length() < ciudad3.length()
				&& ciudad2.length() < ciudad3.length()) {

			System.out.println("El orden sería: " + ciudad1 + " " + ciudad2 + " " + ciudad3);
		} else if (ciudad2.length() < ciudad1.length() && ciudad2.length() < ciudad3.length()
				&& ciudad1.length() < ciudad3.length()) {

			System.out.println("El orden sería: " + ciudad2 + " " + ciudad1 + " " + ciudad3);
		} else if (ciudad3.length() < ciudad1.length() && ciudad3.length() < ciudad2.length()
				&& ciudad2.length() < ciudad1.length()) {

			System.out.println("El orden sería: " + ciudad3 + " " + ciudad2 + " " + ciudad1);
		} else if (ciudad1.length() < ciudad2.length() && ciudad1.length() < ciudad3.length()
				&& ciudad3.length() < ciudad2.length()) {

			System.out.println("El orden sería: " + ciudad1 + " " + ciudad3 + " " + ciudad2);
		} else if (ciudad2.length() < ciudad3.length() && ciudad2.length() < ciudad1.length()
				&& ciudad3.length() < ciudad1.length()) {

			System.out.println("El orden sería: " + ciudad2 + " " + ciudad3 + " " + ciudad1);
		} else if (ciudad3.length() < ciudad1.length() && ciudad3.length() < ciudad2.length()
				&& ciudad1.length() < ciudad2.length()) {

			System.out.println("El orden sería: " + ciudad3 + " " + ciudad1 + " " + ciudad2);
		} else {
			System.out.println("Da igual el orden porque se escriben igual.");
		}
	}

}
