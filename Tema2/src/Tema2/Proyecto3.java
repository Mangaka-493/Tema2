package Tema2;

import java.util.Scanner;

public class Proyecto3 {

	public static void main(String[] args) {

		String caracter = "***";
		String menú = "Menú";
		String abrir = ". Abrir";
		String guardar = ". Guardar";
		String modificar = ". Modificar";
		String salir = ". Salir";
		Integer uno = 1;
		Integer dos = 2;
		Integer tres = 3;
		Integer cuatro = 4;

		System.out.println(caracter + " " + menú + " " + caracter);
		System.out.println(uno + abrir);
		System.out.println(dos + guardar);
		System.out.println(tres + modificar);
		System.out.println(cuatro + salir);

		System.out.println("Elige una opción");
		Scanner scanner = new Scanner(System.in);
		String opcion = scanner.nextLine();
		while (opcion.contains("1") || opcion.contains("2") || opcion.contains("3")) {

			System.out.println(caracter + " " + menú + " " + caracter);
			System.out.println(uno + abrir);
			System.out.println(dos + guardar);
			System.out.println(tres + modificar);
			System.out.println(cuatro + salir);

			System.out.println("Elige otra opción");
			opcion = scanner.nextLine();
		}
		if (opcion.contains("4")) {
			System.out.println("Ok, gracias");
		}
		while (!opcion.contains("1") && !opcion.contains("2") && !opcion.contains("3") && !opcion.contains("4")) {
			System.out.println("Opción incorrecta, vuelva a intentarlo");
			System.out.println(caracter + " " + menú + " " + caracter);
			System.out.println(uno + abrir);
			System.out.println(dos + guardar);
			System.out.println(tres + modificar);
			System.out.println(cuatro + salir);

			System.out.println("Elige otra opción");
			opcion = scanner.nextLine();
		}

		while (opcion.contains("1") || opcion.contains("2") || opcion.contains("3")) {

			System.out.println(caracter + " " + menú + " " + caracter);
			System.out.println(uno + abrir);
			System.out.println(dos + guardar);
			System.out.println(tres + modificar);
			System.out.println(cuatro + salir);
			System.out.println("Elige otra opción");
			opcion = scanner.nextLine();

		}
		scanner.close();
	}

}
