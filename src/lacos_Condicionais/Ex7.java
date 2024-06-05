package lacos_Condicionais;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int codigo, n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite o Segundo valor: ");
		n2 = sc.nextInt();
		System.out.println("Digite uma operação: [1]Soma - [2]Subtração - [3]Multiplicação - [4]Divisão");
		codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

}
