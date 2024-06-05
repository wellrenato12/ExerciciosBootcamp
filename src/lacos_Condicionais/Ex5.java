package lacos_Condicionais;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int codigo, quantidade, total;
		String nomeProduto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o produto: [1]Cachorro Quente - [2]X-Salada - [3]X-Bacon - [4]Bauru - [5]Refrigerante - [6]Suco de laranja");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		switch(codigo) {
			case 1: 
				total = quantidade * 10;
				nomeProduto = "Cachorro quente";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			case 2: 
				total = quantidade * 15;
				nomeProduto = "X-Salada";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			case 3: 
				total = quantidade * 18;
				nomeProduto = "X-Bacon";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			case 4: 
				total = quantidade * 12;
				nomeProduto = "Bauru";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			case 5: 
				total = quantidade * 8;
				nomeProduto = "Refrigerante";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			case 6: 
				total = quantidade * 13;
				nomeProduto = "Suco de laranja";
				System.out.println("Produto:" + nomeProduto + "\nValor total: " + total );
				break;
			default: 
				System.out.println("Produto inválido!");
		}
	}

}
