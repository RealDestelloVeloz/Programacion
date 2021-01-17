package tema3;

public class Bingo_Carcasona_Hector {


	public static void main(String[] args) {

		int bingo[] = new int[15];
		int contador = 0;
		boolean rompebucles = true;
		int contador2 = 0;

		for (contador = 0; contador < bingo.length; contador++) {
			int numeros = (int) (Math.random() * (1 + 90)) + 1;
			bingo[contador] = numeros;
			contador2 = 0; rompebucles = true;
			
			
			while (rompebucles) {
				if (contador == 0) rompebucles = false;
				
				if (bingo[contador] == bingo[contador2]) {
					bingo[contador]++; contador2 = 0;
				} else contador2++;
				if (bingo[contador] >=91) bingo[contador] = bingo[contador] -20;
			if (contador2 == contador) rompebucles = false;	
			}   
			
			System.out.print(bingo[contador] + " ");
			
		}
		

} }
/*Realizar un programa que llene un vector de 15 posiciones con números generados aleatoriamente 
(comprendidos entre el 1 y el 90) y lo presente en pantalla. 
Los 15 números enteros representan un hipotético cartón del juego del Bingo y, por tanto, 
los números no pueden estar repetidos.*/