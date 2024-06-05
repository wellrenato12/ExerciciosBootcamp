package variaveis_Operadores;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario = 0, abono = 0, novoSalario = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);
		
	}

}
