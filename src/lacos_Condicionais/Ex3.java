package lacos_Condicionais;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		String nome;
		int idade, varAux = 0;
		boolean doador = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite [1]-Doador \t[2]-Não doador");
		varAux = sc.nextInt();
		
		switch(varAux) {
			case 1: 
				doador = true;
				break;
			case 2: 
				doador = false;
				break;
			default: 
				System.out.println("Opção inválida!");
				return;
		}
		
		if(idade > 59 && idade < 70 && doador == false) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else if(idade > 59 && idade < 70 && doador == true) {
			System.out.println(nome + " está apto para doar sangue!");
		} else if(idade > 17 && idade < 60) {
			System.out.println(nome + " está apta para doar sangue!");
		} else if(idade < 18 || idade > 69){
			System.out.println(nome + " não está apto para doar sangue!");
		}
	}

}
