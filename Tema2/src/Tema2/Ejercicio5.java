package Tema2;

public class Ejercicio5 {

	public static void main(String[] args) {
		Integer sumando = 0;
		for(Integer numeroInicial = 1; numeroInicial <=10000; numeroInicial = numeroInicial + 1) {
			
				System.out.println(numeroInicial);
				sumando = sumando + numeroInicial;
		}
		
		System.out.println("El resultado final seria " + sumando);

	}

}
