package Tema2;

import java.util.Scanner;

public class Proyecto4 {

	public static void main(String[] args) {

		System.out.println("Dame el precio del producto");
		Scanner scanner = new Scanner(System.in);
		Float precio = scanner.nextFloat();
		System.out.println("Ahora dime las unidades que quieres");
		Float unidades = scanner.nextFloat();
		Float porcentaje1 = 0.4F;
		Float porcentaje2 = 0.2F;
		Float porcentaje3 = 0.1F;
		Float subtotal = precio * unidades;
		Float descuento1 = subtotal * porcentaje1;
		Float descuento2 = subtotal * porcentaje2;
		Float descuento3 = subtotal * porcentaje3;
		Float total1 = descuento1 - precio;
		Float total2 = descuento2 - precio;
		Float total3 = descuento3 - precio;
		if (unidades > 100) {
			System.out.println("Subtotal= " + subtotal);
			System.out.println("Descuento= " + descuento1);
			System.out.println("Total= " + total1);
		} else if (unidades >= 25 && unidades <= 100) {
			System.out.println("Subtotal= " + subtotal);
			System.out.println("Descuento= " + descuento2);
			System.out.println("Total= " + total2);
		} else if (unidades >= 10 && unidades <= 24) {
			System.out.println("Subtotal= " + subtotal);
			System.out.println("Descuento= " + descuento3);
			System.out.println("Total= " + total3);
		} else if (unidades < 10) {
			System.out.println("Subtotal= " + subtotal);
			System.out.println("Descuento= X");
			System.out.println("Total= " + subtotal);
		}
		scanner.close();
	}

}
