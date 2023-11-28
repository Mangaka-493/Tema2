package Tema2;

public class Proyecto6 {

	public static void main(String[] args) {

		Integer suma = 0;
		for (int x = 1; x <= 10; x++) {
			Integer y = 3;
			Integer resultadoSecundario = x * y;
			System.out.println(resultadoSecundario);
			suma = suma + resultadoSecundario;
		}
		System.out.println("El resultado sería= " + suma);
	}

}
