package Tema2;

import java.util.Scanner;

public class Proyecto22 {

	public static  void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Integer y = 0;
		while(y < 10) {
			y++;
			System.out.println(y);
			x = sc.nextLine();
		}
	}

}
