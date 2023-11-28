package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Proyecto15 {

	public static void main(String[] args) {
		System.out.println("¿Qué número va a salir?");
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		Random random = new Random();
		Integer adivinar = random.nextInt(0, 10);
		System.out.println(adivinar);
		Integer contador = 1;
		while (numero != adivinar && contador <= 10) {
			System.out.println("Vaya, has fallado, inténtalo otra vez");
			System.out.println("¿Qué número va a salir?");
			numero = scanner.nextInt();
			adivinar = random.nextInt(0, 10);
			System.out.println(adivinar);
			contador = contador + 1;
		}
		if (numero == adivinar) {
			System.out.println("¡Guau, felicidades, has acertado!");
		}

	}

}
