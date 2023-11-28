package Tema2;

import java.util.Scanner;

public class Ejercico21 {

	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner scanner = new Scanner(System.in);
		Integer x = scanner.nextInt();
		for(Integer n1 = 1; n1 <= x; n1++) {
			for(Integer n2 = 1;n2 <= n1; n2++) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
