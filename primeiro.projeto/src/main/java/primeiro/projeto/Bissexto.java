package primeiro.projeto;

import java.util.Scanner;

public class Bissexto {

	public void Ano() {

		/*
		 * CALCULAR ANO BISSEXTO S�o bissextos todos os anos m�ltiplos de 400
		 * 
		 * S�o bissextos todos os m�ltiplos de 4, exceto se for m�ltiplo de 100 mas n�o
		 * de 400,
		 * 
		 * N�o s�o bissextos todos os demais anos.
		 * 
		 */

		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano para saber se � ano bissexto:");
		year = input.nextInt();
		input.close();
		boolean bissexto = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

		if (bissexto == true && year > 0) {
			System.out.println(year + " � ano bissexto");

		} else {
			System.out.println(year + " N�o � ano bissexto");
			do {
				year++;
				bissexto = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
				if (bissexto == true && year > 0) {
					System.out.println(year + " � o pr�ximo ano bissexto");
				}

			} while (bissexto == false);
				{
				

			}

		}

	}
}
