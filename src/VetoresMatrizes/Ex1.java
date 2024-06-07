package VetoresMatrizes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num = 0;
		boolean encontrar = false;
		Scanner scanner = new Scanner(System.in);
		
		/*for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um lista de números não repetidos: ");
			numeros[i] = scanner.nextInt();
		}*/
		
		System.out.println("Digite um número para comparar: ");
		num = scanner.nextInt();
		
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				encontrar = true;
				System.out.println("O número " + num + " está localizado na posição: " + i);
			}
		}
		
		if(!encontrar) {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}
