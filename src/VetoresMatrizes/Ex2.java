package VetoresMatrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int somaNumeros = 0;
		float mediaNumeros = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o valor do número: ");
			numeros[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(i % 2 != 0) {
				System.out.println("Elementos nos índices ímpares: " + numeros[i]);
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println("Elementos pares: " + numeros[i]);
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			somaNumeros += numeros[i];
		}
		
		mediaNumeros = (float) somaNumeros / numeros.length;
		
		System.out.println("Soma: " + somaNumeros);
		System.out.println("Média: " + mediaNumeros);
	}

}
