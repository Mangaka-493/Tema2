package Tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		System.out.println("Dame tu email");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		while (!email.contains("@") && !email.contains(".")) {
			System.out.println("No lo has escrito bien, vuelve a intentarlo");
			email = scanner.nextLine();
		}
		System.out.println("Ok, muchas gracias");
		scanner.close();
	}

}
