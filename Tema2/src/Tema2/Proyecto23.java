package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Proyecto23 {

	public static void main(String[] args) {

		System.out.println("Cuantas veces quieres lanzar el dado");
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		while(x <= 0) {
			System.out.println("Cuantas veces quieres lanzar el dado");
			x = sc.nextInt();
		}
		Integer caso1 = 0;
		Integer caso2 = 0;
		Integer caso3 = 0;
		Integer caso4 = 0;
		Integer caso5 = 0;
		Integer caso6 = 0;
		Integer suma = caso1 + caso2 + caso3 + caso4 + caso5 + caso6;
		Random random = new Random();
		for(Integer aleatorio = 1; aleatorio <= x; aleatorio++) {
			Integer tirada = random.nextInt(1, 7);
			switch (tirada) {
			case 1: caso1++;
				break;
			case 2: caso2++;
				break;
			case 3: caso3++;
				break;
			case 4: caso4++;
				break;
			case 5: caso5++;
				break;
			case 6: caso6++;
				break;

			}
		}
		System.out.println("Resultados:");
		System.out.println("El 1 ha salido " + caso1 + " veces");
		System.out.println("El 2 ha salido " + caso2 + " veces");
		System.out.println("El 3 ha salido " + caso3 + " veces");
		System.out.println("El 4 ha salido " + caso4 + " veces");
		System.out.println("El 5 ha salido " + caso5 + " veces");
		System.out.println("El 6 ha salido " + caso6 + " veces");
		System.out.println("Todo junto suma " + suma);
		sc.close();
		
	}

}
