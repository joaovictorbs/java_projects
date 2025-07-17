package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		/* Exercicio 01 
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();
		 
		while(senha != 2002) {
			System.out.println("Senha Invalida" + "\n");
			senha = sc.nextInt();
		}
		 
		System.out.print("Acesso Permitido");
		 
		sc.close();
		*/
		
		/* Exercicio 02
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
				
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro" + "\n");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo" + "\n");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro" + "\n");
			}
			else {
				System.out.println("Quarto" + "\n");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		*/
		
		/* Exercicio 03
		Scanner sc = new Scanner(System.in);
		
		int codCliente, totalAlcool = 0, totalGasolina = 0, totalDiesel = 0;
		
		codCliente = sc.nextInt();
		
		while(codCliente != 4) {
			if(codCliente == 1) {
				totalAlcool += 1;
			}
			else if(codCliente == 2) {
				totalGasolina += 1;
			}
			else if(codCliente == 3) {
				totalDiesel+= 1;
			}
			
			codCliente = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO %nAlcool: %d%nGasolina: %d%nDiesel: %d", totalAlcool, totalGasolina, totalDiesel);
		
		sc.close();
		*/
	}
}
