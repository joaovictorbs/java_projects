package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		
		/* Exercicio 01 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
				
		sc.close();
		*/
		
		/* Exercicio 02 
		Scanner sc = new Scanner(System.in);
		
		int somaIn = 0, somaOut = 0, X = 0;
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				somaIn += 1;	
			}
			else {
				somaOut += 1;
			}
		}
		
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		
		sc.close();
		*/
		
		/* Exercicio 03 
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			double media1 = sc.nextDouble();
			double media2 = sc.nextDouble();
			double media3 = sc.nextDouble();
			
			double totalMedia = (media1 * 2.0 + media2 * 3.0 + media3 * 5.0) / 10;
						
			System.out.printf("%.1f%n", totalMedia);
		}
				
		sc.close();
		*/
		
		
		/* Exercicio 04 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			double resultado = (a / b);
			System.out.printf((b != 0) ? "%.1f\n" : "divisao impossivel\n", resultado);
			
		}
		
		sc.close();
		*/
		
		/* Exercicio 05 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		if(n != 0) {
			for(int i=n; i>0; i--) {
				fatorial *= i;
			}
		}
		
		System.out.print(fatorial);
		
		sc.close();
		*/
		
		/* Exercicio 06
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			if(n % i == 0) {
				System.out.println(n / i);	
			}
		}
		
		sc.close();
		 */
		
		
		/* Exercicio 07 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
			System.out.println((int) Math.pow(i, 2));
			System.out.println((int) Math.pow(i, 3));
		}
		
		sc.close();
		*/
	}
}
