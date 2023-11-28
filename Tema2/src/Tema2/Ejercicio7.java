package Tema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Dame dos numeros");
		Scanner scanner = new Scanner(System.in);
		Integer numero1 = scanner.nextInt();
		Integer numero2 = scanner.nextInt();
		while(numero1 != numero2) {
		System.out.println("Dame dos numeros");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		}
		
		System.out.println("Vale, un saludo");
	}

}
