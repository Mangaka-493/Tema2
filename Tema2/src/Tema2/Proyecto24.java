package Tema2;

import java.util.Scanner;

public class Proyecto24 {

	public static void main(String[] args) {

		System.out.println("Dame un numero mayor a 0");
		Scanner sc = new Scanner(System.in);
		Integer numero = sc.nextInt();
		while (numero <= 0) {
			System.out.println("Dije un numero mayor que cero");
			numero = sc.nextInt();
		}
		Integer contador = 0;
		while (contador < numero) {
			contador++;
			Integer impares = contador % 2;
			if(impares == 1) {
				System.out.println(contador + " es impar");
			}
		}
	}
}
