package Collectionss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		String continuar;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			int numero = scanner.nextInt();
			
			if(numeros.contains(numero)) {
				System.out.println("\nO número " + numero + " foi encontrado!");
			} else {
				System.out.println("\nO número " + numero + " não foi encontrado!");
			}
			
			System.out.println("Deseja verificar outro número? [s] - [n]");
			continuar = scanner.next();
		} while (continuar.equalsIgnoreCase("s"));
	}

}
