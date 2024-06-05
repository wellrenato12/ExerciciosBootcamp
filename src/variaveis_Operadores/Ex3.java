package variaveis_Operadores;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salarioBruto = 0, adicionalNoturno = 0, horaExtra = 0, desconto = 0, salarioLiquido = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe sua hora extra: ");
		horaExtra = leia.nextFloat();
		
		System.out.println("Informe o desconto: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * 5) - desconto;
		
		System.out.println("Seu salário é: " + salarioLiquido);
	}

}
