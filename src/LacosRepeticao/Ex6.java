package LacosRepeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int num, total = 0, i = 0;
		float media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num > 0 && num % 3 == 0) {
				total += num;
				i++;
			}
		} while (num != 0);
		
		if(i == 0) {
			System.out.println("Não foi possível calcular a média.");
		} else {
			media = (float) total / i;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", media);
		}
		
		
	}

}
