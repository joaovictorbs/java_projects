package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {
		
	public static void main(String[] args) {
		
		/*EXERCICIO 1*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double accountValue = 0.0;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine(); //consome a quebra de linha deixada pelo nextInt
		
		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
				
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			accountValue = sc.nextDouble();
		}
		
		BankAccount bank = new BankAccount(accountNumber, accountHolder, accountValue);
		
		System.out.println();
		System.out.println(bank);
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		accountValue = sc.nextDouble();
		bank.deposit(accountValue);
		
		
		System.out.println();
		System.out.println(bank);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		accountValue = sc.nextDouble();
		bank.withdraw(accountValue);
		
		System.out.println();
		System.out.println(bank);
		
		sc.close();
	}
	
}
