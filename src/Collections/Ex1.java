package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = scanner.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: " + cores);
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: " + cores);
		
	}

}
