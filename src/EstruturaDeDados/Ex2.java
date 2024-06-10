package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack();
		int condition;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite uma opção: ");
			System.out.println("\n[1] Adicionar livro na pilha");
			System.out.println("\n[2] Listar todos os livros");
			System.out.println("\n[3] Retirar livro da pilha");
			System.out.println("\n[0] Sair");
			condition = scanner.nextInt();
			scanner.nextLine();
			
			switch (condition) {
			case 1: 
				System.out.println("Adicionar livro: ");
				String livro = scanner.nextLine();
				livros.add(livro);
				System.out.println("Livro adicionado!");
				break;
			case 2: 
				System.out.println(livros);
				break;
			case 3: 
				if(!livros.empty()) {
					String livroRetirado = livros.pop();
					System.out.println("Livro "+livroRetirado+" Retirado da pilha!");
					break;
				} else {
					System.out.println("A pilha está vazia!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while (condition != 0);
		
	}

}
