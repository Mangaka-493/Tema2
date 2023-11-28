package Tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		// 1.Le preguntamos al usuario en que año nacio
		System.out.println("¿En que año naciste?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Integer añoDeNacimiento = scanner.nextInt();
		// 3. Respondemos indicando la generacion a la que pertenece dependiendo de la respuesta
		if(añoDeNacimiento >= 1883 && añoDeNacimiento <=1900){
			System.out.println("Tu perteneces a la generacion perdida");
		}
		
		else if(añoDeNacimiento >= 1901 && añoDeNacimiento <=1927){
			System.out.println("Tu perteneces a la generacion grandiosa");
		}
		
		else if(añoDeNacimiento >= 1928 && añoDeNacimiento <= 1945) {
			System.out.println("Tu perteneces a la generacion silenciosa");
		}
		
		else if(añoDeNacimiento >= 1946 && añoDeNacimiento <= 1964) {
			System.out.println("Tu perteneces a la generacion de los Baby Boomers");
		}
		
		else if(añoDeNacimiento >= 1965 && añoDeNacimiento <= 1980) {
			System.out.println("Tu perteneces a la generacion X");
		}
		
		else if(añoDeNacimiento >= 1981 && añoDeNacimiento <= 1996) {
			System.out.println("Tu perteneces a la Generacion Y/Milenials");
		}
		
		else if(añoDeNacimiento >= 1997 && añoDeNacimiento <= 2012) {
			System.out.println("Tu perteneces a la Generacion Z/Zoomers");
		}
		
		else if (añoDeNacimiento >= 2010 && añoDeNacimiento <= 2020){
			System.out.println("Tu perteneces a la generacion Alfa");
		}
		
		else {System.out.println("Tu ni existes");}
		
	
	
	
	}
	}
	
