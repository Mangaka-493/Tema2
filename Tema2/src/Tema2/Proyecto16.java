package Tema2;

import java.util.Scanner;

public class Proyecto16 {

	public static void main(String[] args) {

		System.out.println("Dime una palabra");
		Scanner scanner = new Scanner(System.in);
		String palabra = scanner.nextLine();
		Integer x = 0;
		Integer y = 1;
		while (palabra.length() > y) {
			String separacion = palabra.substring(x, y);
			System.out.println(separacion);
			x = x + 1;
			y = y + 1;
		}
		String ultimoTrozo = palabra.substring(x);
		System.out.println(ultimoTrozo);
		scanner.close();
	}

}
