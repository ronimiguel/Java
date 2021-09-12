package primeiro.projeto;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {

		/*
		 * break quebra a execução de um ciclo
		 * 
		 * continue pula uma determinada execução ignorando as proximas,
		 * reiniciando as instruções antes do continue
		 */
		System.out.println("PARANDO O CODIGO COM O BREAK");
		
		int escolha;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero de 0 até 3:");

		escolha = input.nextInt();
		input.close();
		
		
		for (int i = 0; i <= 3; i++) {
			
			if (i == escolha) {
				System.out.println("Voce escolheu " + i + " - O BREAK ME PAROU AQUI" + "\n\n");
				break;
			} else {
				System.out.println("Voce nao escolheu " + i);
				
			}
		}
		
		System.out.println("PULANDO O CODIGO COM O CONTINUE\n\n");
		
		for (int i = 0; i <= 3; i++) {
			if (i == escolha) {
				System.out.println("Voce escolheu " + i);
				//break;
			} else {
				System.out.println("Voce nao escolheu " + i);
				continue;
			}
		System.out.println("O CONTINUE - me ativou e pulou para o inicio das intruções do ciclo");
		}

	}
}
