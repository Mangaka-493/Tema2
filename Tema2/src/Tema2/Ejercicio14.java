package Tema2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		for (int x = 0; x < 11; x++) {
			Integer resultado = numero * x;
			System.out.println(numero + " " + "X " + x + " " + "= " + resultado);

		}
	}

}
