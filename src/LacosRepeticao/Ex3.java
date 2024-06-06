package LacosRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int idade, maiorIdade = 0, menorIdade = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade > 0) {
			if (idade < 21) {
				menorIdade++;
			} else if(idade > 50) {
				maiorIdade++;
			}
			System.out.println("Digite uma idade ou [0]para sair: ");
			idade = sc.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);
	}

}
