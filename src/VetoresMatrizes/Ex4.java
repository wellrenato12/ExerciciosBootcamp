package VetoresMatrizes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		float[] medias = new float[10];
		float[][] bimestres = new float[10][4];
		float media = 0, somaNumeros = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("Digite nota %d: ",j + 1);
				bimestres[i][j] = scanner.nextFloat();
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				somaNumeros += bimestres[i][j];
			}
			media = somaNumeros / 4;
			medias[i] = media;
			somaNumeros = 0;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("\nMédia: %.1f", medias[i]);
		}
		
	}

}
