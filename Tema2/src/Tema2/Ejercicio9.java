package Tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		System.out.println("Dime tu nombre completo");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		Integer delNuevo1 = nombre.indexOf(" ");
		Integer delNuevo3 = nombre.lastIndexOf(" ");
		String nuevo1 = nombre.substring(0, delNuevo1);
		String nuevo2 = nombre.substring(delNuevo1 + 1, delNuevo3);

		String nuevo3 = nombre.substring(delNuevo3);

		System.out.println("Tu nombre es " + nuevo1);
		System.out.println("Tu primer apellido es " + nuevo2);
		System.out.println("Tu segundo apellido es" + nuevo3);
		scanner.close();
	}

}
