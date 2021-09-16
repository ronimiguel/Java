package primeiro.projeto;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// your code goes here

		/*
		 * user input loan amount
		 * payback 10% every month 
		 * MUST be integers.. why?
		 * print remaining amount after 3 months
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert amount to loan");
		int amount = scanner.nextInt();
	
		for (int x = 1; x <= 3; x++) {
			System.out.println("Month " + x );
			System.out.println("payment: 10% of " + amount);
			int actual_amount = (amount * 10) / 100;
			amount = amount - actual_amount;
			System.out.println("Remaining amount: " + amount);

		}

		System.out.println(amount);

	}

}
