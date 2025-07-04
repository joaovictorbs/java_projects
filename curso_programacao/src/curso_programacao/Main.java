package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*EXERCICIO 1
		Scanner sc = new Scanner(System.in);
		
		int numero;

		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 2
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 3
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		*/
			
			
			
			
		/*EXERCICIO 4
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, calculoJogo;
			
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial == horaFinal) {
			calculoJogo = 24;
		}
		else if (horaInicial < horaFinal) {
			calculoJogo = horaFinal - horaInicial;
		}
		else {
			calculoJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + calculoJogo + " HORA(S)");
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO 5
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double contaPagar;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			contaPagar = quantidade * 4.00;
		}
		else if (codigo == 2) {
			contaPagar = quantidade * 4.50;
		}
		else if (codigo == 3) {
			contaPagar = quantidade * 5.00;
		}
		else if (codigo == 4) {
			contaPagar = quantidade * 2.00;
		}
		else {
			contaPagar = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", contaPagar);
		
		sc.close();
		*/
		
		
		
		
		/*EXERCICIO 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double intervalo;
		
		intervalo = sc.nextDouble();
		
		if (intervalo < 0.0 || intervalo > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (intervalo <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (intervalo <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}
		else if (intervalo <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}	
		else {
			System.out.println("Intervalo [75,100]");
		}
		
		sc.close()
		*/
		
		
		
		/*EXERCICIO 7
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q2");
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda, total;
		
		renda = sc.nextDouble();
		
		if (renda <= 2000.00) {
			System.out.println("Isento");	
		}
		else if (renda > 4500.00) {
			total = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
			System.out.printf("R$ %.2f", total);
		}
		else if (renda <= 4500.00) {
			total = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
			
			System.out.printf("R$ %.2f", total);
		}
		else {
			total = (renda - 2000.0) * 0.08;
			
			System.out.printf("R$ %.2f", total);
		}
		
		sc.close();
		*/
	}
}
