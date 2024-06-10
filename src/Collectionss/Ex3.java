package Collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet();
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite um número: ");
			numero = scanner.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
