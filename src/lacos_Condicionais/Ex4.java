package lacos_Condicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite: [Vertebrado] ou [Invertebrado]");
		palavra1 = sc.nextLine();

		System.out.println("Digite: [Ave] ou [Mamífero] ou [Inseto] ou [Anelídeo]");
		palavra2 = sc.nextLine();

		System.out.println("Digite: [Carnívoro] ou [Onívoro] ou [Herbívoro] ou [Hematófago]");
		palavra3 = sc.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("Ave")) {
				if (palavra3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else if (palavra2.equalsIgnoreCase("Mamífero")) {
				if(palavra3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}
		} else {
			if(palavra2.equalsIgnoreCase("Inseto")) {
				if(palavra3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				} else {
					System.out.println("Lagarta");
				}
			} else {
				if(palavra3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
				}
			}
		}

	}

}
