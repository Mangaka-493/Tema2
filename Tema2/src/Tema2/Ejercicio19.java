package Tema2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		
				System.out.println("Podrias decirme el precio de este producto?");
				
				Scanner scanner = new Scanner(System.in);
				Float precio = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.println("Que tipo de IVA quieres utilizar?");
			
				String tipoDeIVA = scanner.nextLine();

				Float normal2 = 0.21F;
				Float reducido2 = 0.10F;
				Float superreducido2 = 0.04F;
				Float exento2 = 0F;
				switch(tipoDeIVA) {
				case "normal":
					Float resultado1 = precio + normal2;
					System.out.println("Entonces el precio seria de " + resultado1 + " " + "euros");
					break;
				case "reducido": 
					Float resultado2 = precio + reducido2;
					System.out.println("Entonces el precio seria de " + resultado2 + " " + "euros");
					break;
				case "superreducido":
					Float resultado3 = precio + superreducido2;
					System.out.println("Entonces el precio seria de " + resultado3 + " " + "euros");
					break;
				case "exento": 
					Float resultado4 = precio + exento2;
					System.out.println("Entonces el precio seria de " + resultado4 + " " + "euros");
					break;
				
			}

				scanner.close();
	}

}
