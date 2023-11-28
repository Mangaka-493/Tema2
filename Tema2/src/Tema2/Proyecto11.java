package Tema2;

import java.util.Scanner;

public class Proyecto11 {

	public static void main(String[] args) {

		System.out.println("Dame dos numeros entre el 0 y el 4");
		Scanner scanner = new Scanner(System.in);
		Float numero1 = scanner.nextFloat();
		Float numero2 = scanner.nextFloat();
		System.out.println("*** Menu ***");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("0. Salir");
		System.out.println("Elige una de estas opciones");
		Integer opcion = scanner.nextInt();
		switch(opcion) {
		
		case 1:
			Float suma = numero1 + numero2;
			System.out.println("El resultado es= " + suma);
			break;
		case 2:
			Float resta = numero1 - numero2;
			System.out.println("El resultado seria= " + resta);
			break;
		case 3:
			Float multiplicar = numero1 * numero2;
			System.out.println("El resultado será= " + multiplicar);
			break;
		case 4:
			if(numero2 == 0) {
				System.out.println("El resultado será ERROR");
			}
			else {
			Float dividir = numero1 / numero2;
			System.out.println("El resultado es= " + dividir);
			break;
			}
		}
		scanner.close();
	}

}
