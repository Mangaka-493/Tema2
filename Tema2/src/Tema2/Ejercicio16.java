package Tema2;

public class Ejercicio16 {

	public static void main(String[] args) {
		Integer y = 0;
		for(int x = 1; x < 10001; x++) {
			System.out.println(x);
			y = y + x;
		}
		System.out.println("El resultado de la suma seria " + y);
	}

}
