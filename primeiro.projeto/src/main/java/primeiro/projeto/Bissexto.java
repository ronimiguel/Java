package primeiro.projeto;

import java.util.Scanner;

public class Bissexto {

	public void Ano() {

		/*
		 * CALCULAR ANO BISSEXTO São bissextos todos os anos múltiplos de 400
		 * 
		 * São bissextos todos os múltiplos de 4, exceto se for múltiplo de 100 mas não
		 * de 400,
		 * 
		 * Não são bissextos todos os demais anos.
		 * 
		 */

		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano para saber se é ano bissexto:");
		year = input.nextInt();
		input.close();
		boolean bissexto = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

		if (bissexto == true && year > 0) {
			System.out.println(year + " É ano bissexto");

		} else {
			System.out.println(year + " Não é ano bissexto");
			do {
				year++;
				bissexto = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
				if (bissexto == true && year > 0) {
					System.out.println(year + " É o próximo ano bissexto");
				}

			} while (bissexto == false);
				{
				

			}

		}

	}
}
