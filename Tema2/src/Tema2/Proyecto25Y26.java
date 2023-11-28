package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Proyecto25Y26 {

	public static void main(String[] args) {

		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		Random random = new Random();
		Integer mano = random.nextInt(1, 4);
		String respuesta;
		Integer victorias = 0;
		Integer derrotas = 0;
		Integer empates = 0;
		do {
			opcion.toLowerCase();
			opcion.toUpperCase();
			if (mano == 1 && opcion.contains("piedra")) {
				System.out.println("Piedra");
				System.out.println("Es un empate, 1 punto para ambos");
				empates++;
			} else if (mano == 1 && opcion.contains("tijera")) {
				System.out.println("Piedra");
				System.out.println("Has perdido, 0 puntos conseguidos");
				derrotas++;
			} else if (mano == 1 && opcion.contains("papel")) {
				System.out.println("Piedra");
				System.out.println("Has ganado, 1 punto conseguido!");
				victorias++;
			} else if (mano == 2 && opcion.contains("piedra")) {
				System.out.println("Papel");
				System.out.println("Has perdido, 0 puntos conseguidos");
				derrotas++;
			} else if (mano == 2 && opcion.contains("tijera")) {
				System.out.println("Papel");
				System.out.println("Has ganado, 1 punto conseguido!");
				victorias++;
			} else if (mano == 2 && opcion.contains("papel")) {
				System.out.println("Papel");
				System.out.println("Es un empate, 1 punto para ambos");
				empates++;
			} else if (mano == 3 && opcion.contains("piedra")) {
				System.out.println("Tijera");
				System.out.println("Has ganado, 1 punto conseguido!");
				victorias++;
			} else if (mano == 3 && opcion.contains("tijera")) {
				System.out.println("Tijera");
				System.out.println("Es un empate, 1 punto para ambos");
				empates++;
			} else if (mano == 3 && opcion.contains("papel")) {
				System.out.println("Tijera");
				System.out.println("Has perdido, 0 puntos conseguidos");
				derrotas++;
			}

			System.out.println("¿Quieres intentarlo otra vez?");
			respuesta = sc.nextLine();
			if (respuesta.contains("si")) {
				System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
				opcion = sc.nextLine();
			} else if (respuesta.contains("no")) {

			}

		} while (opcion.contains("piedra") || opcion.contains("papel")
				|| opcion.contains("tijera") && !respuesta.contains("no"));

		if (!respuesta.contains("si")) {
			System.out.println("Puntuación");
			System.out.println("Victorias: " + victorias);
			System.out.println("Derrotas: " + derrotas);
			System.out.println("Empates: " + empates);
		}
		sc.close();
	}

}
