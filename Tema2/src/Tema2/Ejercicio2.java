package Tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 1. Le preguntamos al usuaripo cual es su altura
		System.out.println("¿Oye podrias decirme tu estatura?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Float estatura = scanner.nextFloat();
		// 3. Preguntarle al usuario cuanto pesa
		System.out.println("¿Y cuanto pesas?");
		// 4. Esperamos a que el usuario responda la pregunta
		Integer peso = scanner.nextInt();
		// 5. Recogemos los datos y calculamos el IMC
		Float estaturaAlCuadrado = estatura * 2;
		Float resultado = peso / estaturaAlCuadrado;
		// 6. Determinamos el tipo de IMC dependiendo del resultado
		if (resultado < 18.5) {
			System.out.println("Tienes un peso inferior al normal");
		}

		else if (resultado > 18.5 && resultado < 24.9) {
			System.out.println("Estas normal");
		}

		else if (resultado > 25.0 && resultado < 29.9) {
			System.out.println("Tienes un peso superior al normal");
		}

		else if (resultado > 30.0) {
			System.out.println("Tienes obesidad");
		}
	}

}
