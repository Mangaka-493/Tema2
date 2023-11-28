package Tema2;

import java.util.Scanner;

public class Proyecto18 {

	public static void main(String[] args) {

		System.out.println("Dime algo");
		Scanner scanner = new Scanner(System.in);
		String algo = scanner.nextLine();
		StringBuilder palabraInvertida = new StringBuilder(algo);
		palabraInvertida.reverse();
		Integer x = 0;
		Integer y = 1;
		while (palabraInvertida.length() > y) {
			String separacion = palabraInvertida.substring(x, y);
			System.out.println(separacion);
			x = x + 1;
			y = y + 1;
		}
		String ultimoTrozo = palabraInvertida.substring(x);
		System.out.println(ultimoTrozo);
		scanner.close();
		
	}

}
