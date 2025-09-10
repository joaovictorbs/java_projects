package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductArray;

public class Main {
		
	public static void main(String[] args) {
		
		/*EXERCICIO 1*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ProductArray[] vect = new ProductArray[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductArray(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", average);
		
		sc.close();
	}
	
}
