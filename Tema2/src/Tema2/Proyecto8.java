package Tema2;

import java.util.Scanner;

public class Proyecto8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean inicio;
		Boolean fin;
		do {
			System.out.println("Escribeme un texto");
			String texto = scanner.nextLine();
			inicio = texto.startsWith("hola");
			fin = texto.endsWith("hasta luego");
			if (inicio && fin) {
				Integer ultimoEspacio = texto.lastIndexOf(" ");
				String mensaje = texto.substring(5, ultimoEspacio);
				System.out.println("Lo he entendido" + mensaje);
			}
		} while (!inicio || !fin);
		scanner.close();
	}

}
