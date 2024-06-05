package lacos_Condicionais;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		String nome;
		int codigo;
		float salario, salarioReajuste;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite seu cargo: [1]Gerente - [2]Vendedor - [3]Supervisor - [4]Morotista - [5]Estoquista - [6]Técnico de TI");
		codigo = sc.nextInt();
		System.out.println("Digite seu salário: ");
		salario = sc.nextFloat();
		
		switch(codigo) {
			case 1:
				salarioReajuste = (float) (salario + ((10.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Gerente - Salário: " + salarioReajuste);
				break;
			case 2:
				salarioReajuste = (float) (salario + ((7.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Vendedor - Salário: " + salarioReajuste);
				break;
			case 3:
				salarioReajuste = (float) (salario + ((9.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Supervisor - Salário: " + salarioReajuste);
				break;
			case 4:
				salarioReajuste = (float) (salario + ((6.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Motorista - Salário: " + salarioReajuste);
				break;
			case 5:
				salarioReajuste = (float) (salario + ((5.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Estoquista - Salário: " + salarioReajuste);
				break;
			case 6:
				salarioReajuste = (float) (salario + ((8.0 / 100.0) * salario));
				System.out.println("Nome colaborador: " + nome + " Cargo: Técnico de TI - Salário: " + salarioReajuste);
				break;
				default:
					System.out.println("Cargo inválido!");
		}
	}

}
