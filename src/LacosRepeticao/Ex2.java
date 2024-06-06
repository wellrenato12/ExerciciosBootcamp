package LacosRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int num, par = 0, impar = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números impares: " + impar);
	}

}
