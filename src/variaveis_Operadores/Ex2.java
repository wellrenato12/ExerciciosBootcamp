package variaveis_Operadores;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		float[] notas = new float[4];
		float total = 0, media = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			notas[i] = leia.nextFloat();
			total += notas[i];
		}
		
		media = total / notas.length;
		
		System.out.printf("Sua média é: %.1f", media);
		

		/*float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Sua média é: %.1f", media);*/
		
	}

}
