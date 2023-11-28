package Tema2;

import java.util.Scanner;

public class Proyecto17 {

	public static void main(String[] args) {

		System.out.println("Dame un numero que sea mayor que 2");
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Integer x = 0;
		Integer y = 1;
		Integer contador = 1;
		while(n >= 2 && contador <= n) {
			Integer aux = x;
			x = y;
			y = aux + y;
			System.out.println(aux);
			contador = contador + 1;
		}
		scanner.close();
	}

}
