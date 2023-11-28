package Tema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		System.out.println("Dame dos cadenas");
		Scanner scanner = new Scanner(System.in);
		String cadena1 = scanner.nextLine();
		String cadena2 = scanner.nextLine();
		while (cadena1.isBlank() || cadena2.isBlank()) {
			System.out.println("Vuelve a darme dos cadenas");
			cadena1 = scanner.nextLine();
			cadena2 = scanner.nextLine();
		}
		Integer comparando = cadena1.compareTo(cadena2);

		if (comparando > 0) {
			System.out.println(cadena1 + " es mayor que " + cadena2);
		} else if (comparando < 0) {
			System.out.println(cadena1 + " es menor que " + cadena2);
		} else {
			System.out.println("Ambas cadenas son iguales");
		}
		scanner.close();
	}

}
