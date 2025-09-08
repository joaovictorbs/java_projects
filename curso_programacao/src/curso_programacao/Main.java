package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double circumference;
		double volume;
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		circumference = calc.circumference(radius);
		volume = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}
