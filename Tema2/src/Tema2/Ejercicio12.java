package Tema2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		System.out.println("Podrias darme tu username?");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		String modificacion = username.trim().toUpperCase();
		while (modificacion.length() < 10) {
			System.out.println("Vaya, a ocurrido un error, intentalo de nuevo");
			username = scanner.nextLine();
		}
		while (modificacion.isBlank()) {
			System.out.println("Vaya, a ocurrido un error, vuelva a intentalo de nuevo");
			username = scanner.nextLine();
		}
		System.out.println("De acuerdo, " + username);
		scanner.close();
	}

}
