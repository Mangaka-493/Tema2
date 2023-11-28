package Tema2;

import java.util.Scanner;

public class Proyecto12 {

	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner scanner = new Scanner(System.in);
		Integer x = scanner.nextInt();
		System.out.print(" __");
		for(Integer n2 = 2; n2 <= x; n2++) {
			System.out.print("___");
		}
			System.out.println();
		
		for (Integer n1 = 1; n1 <= x; n1++) {
			for(Integer n2 = 1; n2 <= x; n2++) {
				System.out.print("|__");
			}
			System.out.println("|");
			
		}
		scanner.close();
	}

}
