package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		EXERCICIO 1
		Scanner sc = new Scanner(System.in); 
		int valor1, valor2, soma;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO 2
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO 3 
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferenca;
				
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = ((A * B) - (C * D));
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 4
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalho;
		double valorHora, calculoSalario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalho = sc.nextInt();
		valorHora = sc.nextDouble();
		
		calculoSalario = horasTrabalho * valorHora;
		
		System.out.printf("NUMBER = %s%n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", calculoSalario);
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO  5
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
		double valorUnitario1, valorUnitario2, valorPagar;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();

		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPagar = ((numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO  6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		pi = 3.14159;
				
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A * C) / 2;
		circulo = pi * (C * C);
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		*/
	}
}
