package LacosRepeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int idade, totalIdade = 0, mediaIdade = 0;
		int x = 0;
		int identidade, mf = 0, hm = 0, nbf = 0;
		int especialidade, back = 0;
		String continuar = "s";
		Scanner sc = new Scanner(System.in);

		while (!continuar.equalsIgnoreCase("N")) {
			System.out.println("Informe sua idade: ");
			idade = sc.nextInt();
			totalIdade += idade;
			x++;
			System.out.println(
					"Informe sua identidade: [1]Mulher Cis - [2]Homem Cis - [3]Não Binário - [4]Mulher Trans - [5]Homem Trans - [6]Outros");
			identidade = sc.nextInt();
			
			System.out.println("Informe sua especialidade: [1]Backend - [2]Frontend - [3]Mobile - [4]FullStack");
			especialidade = sc.nextInt();
			
		if(especialidade == 1) {
			back++;
		}
		
		if(identidade == 1 || identidade == 4) {
			if(especialidade == 2) {
				mf++;
			}
		}
		
		if (identidade == 2 || identidade == 5) {
			if(idade > 40) {
				hm++;
			}
		}
		
		if (identidade == 3 && especialidade == 4 && idade < 30 ) {
			nbf++;
		}
			
		System.out.println("Deseja preencher novamente: [S] - [N]");
		continuar = sc.next();
		}
		
		mediaIdade = totalIdade / x;
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + back);
		System.out.println("O número de mulheres cis e trans desenvolvedoras fronted: " + mf);
		System.out.println("O número de homens cis e trans desenvolvedores mobile maiores de 40 anos: " + hm);
		System.out.println("O número de não binários desenvolvedores fullstack menores de 30 anos: " + nbf);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + x);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
		
	}

}
