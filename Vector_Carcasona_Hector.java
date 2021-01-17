package tema3;

import java.util.Scanner;

public class Vector_Carcasona_Hector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce la dimension del vector");
		int dimension = entrada.nextInt();
		int vector[] = new int[dimension];
		int contador = 0, primera = 0, segunda = 0, desactivador = 0;
		boolean rompebucles = true;

		for (contador = 0; contador < vector.length; contador++) {
			int numeros = (int) (Math.random() * (0 + 10));
			vector[contador] = numeros;
			System.out.print(numeros + " ");
		}
		contador = 0;
		System.out.println("\nIntroduce el valor a buscar");
		int valor = entrada.nextInt();

		while (rompebucles) {
			if (contador == vector.length-1) {
				System.out.println("-1 -1"); rompebucles = false; desactivador = 1;}
			
			if (rompebucles && vector[contador] == valor) {
			primera = contador; segunda = primera; contador++; rompebucles = false;
			} else contador++;
		
		}
		
		
		
		while (contador < vector.length) {
		if (vector[contador] == valor) {
			segunda = contador; contador++;
		} else contador++;
		}
		if (desactivador == 0) System.out.println("Aparece por primera vez en " + primera + " Y por última vez en " + segunda);
	}

}

/*
 * Diseña un programa que pida al usuario que teclee la dimensión de un vector.
 * A continuación lo llenará con nºs aleatorios comprendidos entre el 1 y el 10
 * y lo mostrará. Finalmente, preguntará por un valor a buscar.
 * 
 * 
 * El algoritmo debe devolver la primera y última posición en la que aparece el
 * valor a buscar en el vector (en caso de que esté aparezca más de una vez).
 * 
 * Si el valor a buscar sólo aparece una vez debe devolver la misma posición dos
 * veces.
 * 
 * Y el número a buscar no está debe devolver un -1 dos veces también.
 */