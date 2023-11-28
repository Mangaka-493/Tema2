package Tema2;

import java.util.Scanner;

public class Proyecto20 {

	public static void main(String[] args) {
		System.out.println("Dame un numero mayor que 0");
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		for (Integer n1 = 0; n1 <= x - 1; n1++) {
			for(Integer n2 = 0; n2 <= x - 1; n2++) {
				if(n1 == n2) {
					System.out.print("* ");
				}
				else {
				System.out.print("- ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
