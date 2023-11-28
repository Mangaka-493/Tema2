package Tema2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		System.out.println("Escribe algo por teclado");
		Scanner scanner = new Scanner(System.in);
		String algo = scanner.nextLine();
		Integer x = 0;
		Integer y = 5;
		while (algo.length() > y) {
			String separacion = algo.substring(x, y);
			System.out.println(separacion);
			x = x + 5;
			y = y + 5;
		}
		String ultimoTrozo = algo.substring(x);
		System.out.println(ultimoTrozo);
		scanner.close();
 
		

	}

}
