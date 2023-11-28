package Tema2;

import java.util.Scanner;

public class Proyecto10 {

	public static void main(String[] args) {

		System.out.println("Dame una direccion web");
		Scanner scanner = new Scanner(System.in);
		String direccion = scanner.nextLine();
		Integer posicion1 = direccion.indexOf("://");
		Integer posicion2 = direccion.indexOf(".");
		Integer posicion3 = direccion.lastIndexOf(".");
		if(posicion1 == -1 || posicion2 == -1 || posicion3 == -1 || posicion2 == posicion3) {
			System.out.println("La direccion web no es valida");
		}
		else {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(xD);
		}
		scanner.close();

	}

}
