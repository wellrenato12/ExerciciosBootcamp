package LacosRepeticao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("Intervalo inválido");
		} else {
			for(int i = n1; i <= n2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i+" é múltiplo de 3 e 5");
				}
			}
		}
	}

}
