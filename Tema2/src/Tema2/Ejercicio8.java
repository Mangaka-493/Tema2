package Tema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// 1. Solicitamos dos letras al usuario
		System.out.println("Necesito que me des dos letras");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		String letra1 = scanner.nextLine();
		String letra2 = scanner.nextLine();

		// 4. Creamos dos posibilidades: una para cuando ambas respuestas sean distintas
		// y otra para cuando sean iguales
		while (!letra1.equals(letra2)) {
			System.out.println("Sigue dandome dos letras");
			letra1 = scanner.nextLine();
			letra2 = scanner.nextLine();
		}

		System.out.println("Vale, un saludo!!");
		scanner.close();
	}

}
