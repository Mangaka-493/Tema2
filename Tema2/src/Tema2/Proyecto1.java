package Tema2;

import java.util.Scanner;

public class Proyecto1 {

	public static void main(String[] args) {

		System.out.println("Dime tu nombre");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		System.out.println("Ahora dime tu año de nacimiento");
		Integer año = scanner.nextInt();
		Integer actual = 2030;
		Integer resultado = actual - año;
		System.out.println("hola " + nombre + ", en el año 2030 tendras " + resultado + " años");
		scanner.close();

	}

}
