package Tema2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		System.out.println("Dame un numero del 1 al 12");
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		switch (numero) {
		case 1: 
			System.out.println("El " + numero + " " + "corresponde a enero");
			break;
		case 2:
			System.out.println("El " + numero + " " + "corresponde a Febrero");
			break;
		case 3:
			System.out.println("El " + numero + " " + "corresponde a Marzo");
			break;
		case 4:
			System.out.println("El " + numero + " " + "corresponde a Abril");
			break;
		case 5:
			System.out.println("El " + numero + " " + "corresponde a Mayo");
			break;
		case 6:
			System.out.println("El " + numero + " " + "corresponde a Junio");
			break;
		case 7:
			System.out.println("El " + numero + " " + "corresponde a Julio");
			break;
		case 8:
			System.out.println("El " + numero + " " + "corresponde a Agosto");
			break;
		case 9:
			System.out.println("El " + numero + " " + "corresponde a Septiembre");
			break;
		case 10:
			System.out.println("El " + numero + " " + "corresponde a Octubre");
			break;
		case 11:
			System.out.println("El " + numero + " " + "corresponde a Noviembre");
			break;
		case 12:
			System.out.println("El " + numero + " " + "corresponde a Diciembre");
			break;
		
		}
	
		
		}
	}


