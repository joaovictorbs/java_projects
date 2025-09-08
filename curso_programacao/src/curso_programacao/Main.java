package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {
		
	public static void main(String[] args) {
		
		/*EXERCICIO 1*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dolarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dolarQuantity = sc.nextDouble();
		

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculate(dolarPrice, dolarQuantity));
		
		sc.close();
	}
}
