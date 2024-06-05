package lacos_Condicionais;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		int codigo;
		float saldo = 1000, saque, deposito;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha a operação: [1]Saldo - [2]Saque - [3]Depósito");
		codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Saldo atual: " + saldo);
			break;
		case 2:
			System.out.println("Informe o valor do saque: ");
			saque = sc.nextFloat();
			if (saque > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo -= saque;
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Saldo atual: " + saldo);
			}
			break;
		case 3:
			System.out.println("Informe o valor do depósito: ");
			deposito = sc.nextFloat();
			saldo += deposito;
			System.out.println("Depósito realizado com sucesso!");
			System.out.println("Saldo atual: " + saldo);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
