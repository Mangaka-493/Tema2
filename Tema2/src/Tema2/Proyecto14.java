package Tema2;

import java.util.Scanner;

public class Proyecto14 {

	public static void main(String[] args) {

		System.out.println("Dame una palabra de 8 caracteres");
		Scanner sc = new Scanner(System.in);
		String contraseña = sc.nextLine();
		while (contraseña.length() < 8) {
			System.out.println("Contraseña incorrecta, inténtelo de nuevo");
			contraseña = sc.nextLine();

		}
		if (contraseña.length() >= 8) {
			String reemplazo1 = contraseña.replaceAll("a", "4");
			String reemplazo2 = reemplazo1.replaceAll("e", "3");
			String reemplazo3 = reemplazo2.replaceAll("i", "1");
			String reemplazo4 = reemplazo3.replaceAll("o", "0");
			String reemplazo5 = reemplazo4.replaceAll("t", "7");
			System.out.println(reemplazo5 + " es correcto");
		}
		sc.close();
	}

}