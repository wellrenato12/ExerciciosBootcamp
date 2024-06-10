package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println(numeros);
		System.out.println("\nDigite um número: ");
		numero = scanner.nextInt();

		if (numeros.contains(numero))
			for (int i = 0; i < numeros.size(); i++) {
				if (numeros.get(i) == numero) {
					System.out.println("\nO número " + numero + " está localizado na posição: " + (i));
				}
			}
		else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}
