package lacos_Condicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner sc = new Scanner(System.in);

		System.out.println("[Vertebrado] [Invertebrado]");
		palavra1 = sc.nextLine();

		System.out.println("[Ave] [Mamífero] [Inseto] [Anelídeo]");
		palavra2 = sc.nextLine();

		System.out.println("[Carnívoro] [Onívoro] [Herbívoro] [Hematófago]");
		palavra3 = sc.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("Ave")) {
				if (palavra3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else if (palavra2.equalsIgnoreCase("Mamífero")) {
				if() {
					
				}
			}
		}

	}

}
