package Tema2;

import java.util.Scanner;

public class Proyecto7 {

	public static void main(String[] args) {
		System.out.println("Dame un número del 1 al 10");
		Scanner scanner = new Scanner(System.in);
		Integer x = scanner.nextInt();
		Integer suma = 0;
		while (x <= 10) {
			x++;
			Integer y = 3;
			Integer resultadoSecundario = x * y;
			System.out.println(resultadoSecundario);
			suma = suma + resultadoSecundario;
		}
		System.out.println("El resultado sería= " + suma);
		scanner.close();
	}

}
