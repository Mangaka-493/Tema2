package Tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 1. Solicitamos al usuario el precio de un producto
		System.out.println("Podrias decirme el precio de este producto?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Float precio = scanner.nextFloat();
		scanner.nextLine();
		// 3. Solicitamos ahora el tipo de IVA a utilizar
		System.out.println("Que tipo de IVA quieres utilizar?");
		// 4. Esperamos a que el usuario responda la pregunta
		String tipoDeIVA = scanner.nextLine();

		// 5. Calculamos el IVA dependiendo de la respuesta

		String normal = "normal";
		String reducido = "reducido";
		String superreducido = "superreducido";
		String exento = "exento";

		Float normal2 = 0.21F;
		Float reducido2 = 0.10F;
		Float superreducido2 = 0.04F;
		Float exento2 = 0F;

		if (tipoDeIVA.equals("normal")) {
			Float resultado1 = precio + normal2;
			System.out.println("Entonces el precio seria de " + resultado1 + " " + "euros");
		}

		else if (tipoDeIVA.equals("reducido")) {
			Float resultado2 = precio + reducido2;
			System.out.println("Entonces el precio seria de " + resultado2 + " " + "euros");
		}

		else if (tipoDeIVA.equals("superreducido")) {
			Float resultado3 = precio + superreducido2;
			System.out.println("Entonces el precio seria de " + resultado3 + " " + "euros");
		}

		else if (tipoDeIVA.equals("exento")) {
			Float resultado4 = precio + exento2;
			System.out.println("Entonces el precio seria de " + resultado4 + " " + "euros");
		}

		scanner.close();

	}

}
