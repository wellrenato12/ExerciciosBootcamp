package variaveis_Operadores;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1 = 0, n2 = 0, n3 = 0, n4 = 0, diferencaProduto = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite nota 4: ");
		n4 = leia.nextFloat();
		
		diferencaProduto = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença é: " + diferencaProduto);
	}

}
