package Tema2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		Integer x = 0;
		while (x < 11) {
			Integer resultado = numero * x;
			System.out.println(numero + " X " + x + " = " + resultado);
			x++;

		}
		scanner.close();
	}

}
