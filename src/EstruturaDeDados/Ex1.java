package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList();
		int condition;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Digite uma opção: ");
			System.out.println("\n[1] Adicionar cliente na fila");
			System.out.println("\n[2] Listar todos os clientes");
			System.out.println("\n[3] Retirar cliente da fila");
			System.out.println("\n[0] Sair");
			condition = scanner.nextInt();
			scanner.nextLine();

			switch (condition) {
			case 1: 
				System.out.println("\nDigite o nome do cliente: ");
				String name = scanner.nextLine();
				clientes.add(name);
				System.out.println("Cliente adicionado!");
				break;
			case 2: 
				System.out.println(clientes);
				break;
			case 3: 
				if(!clientes.isEmpty()) {
					String clienteRemovido = clientes.remove();
					System.out.println("Cliente "+clienteRemovido+" foi chamado!");
				} else {
					System.out.println("A fila já está vazia!");
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
