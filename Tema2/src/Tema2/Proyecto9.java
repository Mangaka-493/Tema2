package Tema2;

import java.util.Scanner;

public class Proyecto9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean inicio;
		Boolean fin;
		Boolean otroFin;
		do {
			System.out.println("Escribeme un texto");
			String texto = scanner.nextLine();
			inicio = texto.startsWith("hola");
			fin = texto.endsWith("hasta luego");
			otroFin = texto.endsWith("adios");
			if (inicio && fin) {
				Integer ultimoEspacio = texto.lastIndexOf(" ");
				String mensaje = texto.substring(5, ultimoEspacio);
				System.out.println("Lo he entendido" + mensaje);
			}
			if (inicio && otroFin) {
				Integer ultimoEspacio = texto.lastIndexOf(" ");
				String mensaje = texto.substring(5, ultimoEspacio);
				System.out.println("Lo he entendido" + mensaje);
			} else {
				System.out.println("No te he entendido");
			}
		} while (!inicio || !otroFin);
		scanner.close();
	}

}
