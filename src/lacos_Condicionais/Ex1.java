package lacos_Condicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = sc.nextInt();
		
		if((valor1 + valor2) > valor3) {
			System.out.println(+ valor1 + " + " + valor2 + " = " + (valor1 + valor2) + " > " + valor3);
			System.out.println("A soma de A + B é maior do que C");
		} else if((valor1 + valor2) < valor3) {
			System.out.println(+ valor1 + " + " + valor2 + " = " + (valor1 + valor2) + " < " + valor3);
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println(+ valor1 + " + " + valor2 + " = " + (valor1 + valor2) + " == " + valor3);
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
