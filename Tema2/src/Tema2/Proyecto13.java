package Tema2;

import java.util.Scanner;

public class Proyecto13 {

	public static void main(String[] args) {

		System.out.println("Dame una frase");
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		String acumulador = "";
		acumulador = acumulador + "\n" +frase;
		while(!frase.equalsIgnoreCase("fin")) {
			System.out.println("Dame una frase");
			frase = scanner.nextLine();
			acumulador = acumulador + "\n" +frase;
		}
		System.out.println("Las frases que se han acumulado son= " + acumulador);
		scanner.close();
	}

}
