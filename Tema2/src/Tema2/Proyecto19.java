package Tema2;

import java.util.Scanner;

public class Proyecto19 {

	public static void main(String[] args) {
		System.out.println("Elige una de estas tres opciones:");
		System.out.println();
		System.out.println("1 - Pasar de Pesetas a Euros.");
		System.out.println("2 - Pasar de Euros a Pesetas.");
		System.out.println("3 - Salir.");
		Scanner scanner = new Scanner(System.in);
		Integer opcion = scanner.nextInt();
		while (opcion != 3) {
			if (opcion == 1) {
				System.out.println("Dime la cantidad de pesetas que quieres en euros");
				Double a = scanner.nextDouble();
				Double b = 166.386;
				Double convertidor1 = a / b;
				System.out.println("En total serían unos " + convertidor1 + " euros");
			} else if (opcion == 2) {
				System.out.println("Dime la cantidad de euros que quieres en pesetas");
				Double c = scanner.nextDouble();
				Double d = 166.386;
				Double convertidor2 = c * d;
				System.out.println("En total serían unas" + convertidor2 + " pesetas");
			}
			System.out.println("Elige una de estas tres opciones:");
			System.out.println();
			System.out.println("1 - Pasar de Pesetas a Euros.");
			System.out.println("2 - Pasar de Euros a Pesetas.");
			System.out.println("3 - Salir.");
			opcion = scanner.nextInt();
		}
		System.out.println("Opción inválida.");
		scanner.close();
	}

}
