package Tema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Solicitamos al usuario un numero por consola
		Scanner scanner = new Scanner(System.in);
		Integer suma = 0;
		Integer x = 1;
		while (x != 0) {
			System.out.println("Dame un numero");
			x = scanner.nextInt();

			suma = suma + x;

		}

		System.out.println("El resultado es " + suma);
		scanner.close();

	}
}
