package VetoresMatrizes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		int somaDiagPrinc = 0, somaDiagSecund = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite o valor: ");
				numeros[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					System.out.println("Elementos da diagonal principal: " + numeros[i][j]);
					somaDiagPrinc += numeros[i][j];
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j >= 0; j--) {
				System.out.println("Elementos da diagonal secundária: " + numeros[i][j]);
				somaDiagSecund += numeros[i][j];
				i++;
			}
		}
		
		System.out.println("Soma dos elementos da diagonal principal: " + somaDiagPrinc);
		System.out.println("Soma dos elementos da diagonal secundaria: " + somaDiagSecund);
		
		/*for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Linha: " + i + " Coluna: " + j + " Numero: " + numeros[i][j]);
			}
		}*/
	}

}
