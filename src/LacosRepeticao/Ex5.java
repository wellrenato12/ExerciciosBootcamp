package LacosRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int num, somaNumeros = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			System.out.println("Digite [0] para sair");
			num = sc.nextInt();
			if(num > 0) {
				somaNumeros += num;
			}
			
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + somaNumeros);
		
	}

}
